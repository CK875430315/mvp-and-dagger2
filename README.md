# 简单实用的mvp+retrofit+dagger2框架<br>   
  用到的依赖：<br>
    compile fileTree(include: ['*.jar'], dir: 'libs')<br>
    androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
        exclude group: 'com.android.support', module: 'support-annotations'
    })<br>
    compile 'com.android.support:recyclerview-v7:24.2.1'<br>
    compile 'com.android.support:cardview-v7:24.2.1'<br>
    compile 'com.android.support:appcompat-v7:24.2.1'<br>
    testCompile 'junit:junit:4.12'<br>
    //dagger<br>
    compile 'com.google.dagger:dagger:2.0.2'<br>
    compile 'com.google.dagger:dagger-compiler:2.0.2'<br>
    compile 'org.glassfish:javax.annotation:10.0-b28'<br>
    // 添加java 注解库<br>
    //网络请求<br>
    compile 'io.reactivex:rxandroid:1.1.0'<br>
    compile 'com.squareup.retrofit2:retrofit:2.1.0'<br>
    compile 'com.squareup.retrofit2:converter-gson:2.1.0'<br>
    compile 'com.squareup.retrofit2:adapter-rxjava:2.1.0'<br>
    compile 'com.squareup.okhttp3:okhttp:3.4.1'<br>
    compile 'com.squareup.okhttp3:logging-interceptor:3.4.1'<br>
    //图片加载<br>
    compile 'com.squareup.picasso:picasso:2.5.2'<br>
    //注解<br>
    compile 'com.jakewharton:butterknife:8.4.0'<br>
    apt 'com.jakewharton:butterknife-compiler:8.4.0'<br>
###项目结构<br>
