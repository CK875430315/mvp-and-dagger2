# 简单实用的mvp+retrofit+dagger2框架<br>   
 直接上代码，用到的依赖：
    compile fileTree(include: ['*.jar'], dir: 'libs')
    androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
        exclude group: 'com.android.support', module: 'support-annotations'
    })
    compile 'com.android.support:recyclerview-v7:24.2.1'
    compile 'com.android.support:cardview-v7:24.2.1'
    compile 'com.android.support:appcompat-v7:24.2.1'
    testCompile 'junit:junit:4.12'
    //dagger
    compile 'com.google.dagger:dagger:2.0.2'
    compile 'com.google.dagger:dagger-compiler:2.0.2'
    compile 'org.glassfish:javax.annotation:10.0-b28'
    // 添加java 注解库
    //网络请求
    compile 'io.reactivex:rxandroid:1.1.0'
    compile 'com.squareup.retrofit2:retrofit:2.1.0'
    compile 'com.squareup.retrofit2:converter-gson:2.1.0'
    compile 'com.squareup.retrofit2:adapter-rxjava:2.1.0'
    compile 'com.squareup.okhttp3:okhttp:3.4.1'
    compile 'com.squareup.okhttp3:logging-interceptor:3.4.1'
    //图片加载
    compile 'com.squareup.picasso:picasso:2.5.2'
    //注解
    compile 'com.jakewharton:butterknife:8.4.0'
    apt 'com.jakewharton:butterknife-compiler:8.4.0'
