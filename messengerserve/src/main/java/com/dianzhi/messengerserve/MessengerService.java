package com.dianzhi.messengerserve;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/**
 * Created by CK on 2017/2/9.
 */

public class MessengerService extends Service {
    private class MessengerHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            //接收客户端
            Bundle data = msg.getData();
            String toServe = data.getString("toServe");
            Log.e("sssss", "handleMessageService: "+toServe);
            //去回复给客户端 message.replyTo=messengerClient;这里存一个Messenger对象 下面取出
            Messenger replyToClient = msg.replyTo;
            Message replyToClientMsg=Message.obtain();
            Bundle bundle=new Bundle();
            bundle.putString("toClient","i am service your msg receivced");
            replyToClientMsg.setData(bundle);
            try {
                replyToClient.send(replyToClientMsg);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
    private Messenger messengerHandler=new Messenger(new MessengerHandler());
    @Override
    public IBinder onBind(Intent intent) {
        return messengerHandler.getBinder();
    }
}
