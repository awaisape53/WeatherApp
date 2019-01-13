### 基于MVVM框架的高德天气APP：
-------

### 功能点实现说明：
- [高德天气查询](https://lbs.amap.com/api/webservice/guide/api/weatherinfo/)：Get&Post方式可以正常返回查询高德天气数据并UI显示；
- 公共控件封装：自定义实现公共控件CommonUI，用于控件复用；
- 公共数据接口：借助ContentProvider，提供天气数据（DB方式）& 配置属性（SharedPreference方式）的数据访问API，供第三方应用访问使用；--TBD
- 配置文件解析：解析存储本地存储高德adcode和城市信息对照表，用于本地天气动态查询api调用；
- 天气设置功能：PreferenceActivity+PreferenceFragment，替代单独使用PreferenceActivity，实现天气设置界面；
- 天气城市查询：自动匹配输入城市，完成城市查询；
- 左右滑动实现：ViewPager+FragmentPagerAdapter，实现左右页面滑动切换；
- 下拉上拉刷新：下拉界面，实现天气自动查询；上拉界面，更新查询显示更多天气相关信息。
- [RecyclerView封装](https://www.jianshu.com/p/4f9591291365)：Android推荐控件，优于ListView，处理不同类型的ItemView封装使用；

-------
### MVVM框架和组件实现：
框架说明：借助[Android架构组件(Android Architecture Components)：](https://github.com/tangmin1010/appcomponent)可实现MVVM应用框架。 
- [Lifecycle components](https://developer.android.google.cn/topic/libraries/architecture/lifecycle)： 生命周期管理，该组件是其它组件的基础，可由于跟踪UI的（Activity和Fragment）的生命周期
- [ViewModels](https://developer.android.google.cn/topic/libraries/architecture/viewmodel)： 一种可以被观察的以及可以感知生命周期的数据容器。
- [LiveData](https://developer.android.google.cn/topic/libraries/architecture/livedata) ：它是UI，例如Activity、Fragment,与数据之间的桥梁；可以在其内部处理数据业务逻辑,例如从网络层或者数据持久层获取数据、更新数据等。
- [Room](https://developer.android.google.cn/topic/libraries/architecture/room)：一个简单好用的对象映射层；其对SqliteDatabase进行了封装，简化开发者对于数据持久层的开发工作量
- [WorkManager](https://developer.android.google.cn/topic/libraries/architecture/workmanager/) ：可以轻松地指定可延迟的异步任务以及它们应该在何时运行。
- [Data-binding](https://developer.android.google.cn/topic/libraries/data-binding//) ：使用xml声明格式(而不是编程方式)将布局中的UI组件绑定到应用程序中的数据源。
- [Paging](https://developer.android.google.cn/topic/libraries/architecture/paging/)：分页库使您能够更容易地在应用程序的RecyclerView中逐步、优雅地加载数据。--TBD
- [Navigation](https://developer.android.google.cn/topic/libraries/architecture/navigation/)：导航是应用程序设计的关键部分。通过导航，您可以设计交互，允许用户在应用程序的不同内容区域之间来回移动。--TBD

-------
### 网络应用框架和组件实现：
- [Retrofit 2.0 使用教程](https://blog.csdn.net/carson_ho/article/details/73732076)：热门的Android网络请求库
- [OkHttp3 使用教程](https://blog.csdn.net/xx326664162/article/details/77714126)：Http第三方库，Retrofit底层通过OkHttp实现网络请求 
- [RxJava Android使用教程](https://gank.io/post/560e15be2dca930e00da1083)：异步网络请求任务处理
- [Xutils3 使用教程](https://blog.csdn.net/carson_ho/article/details/73732076)：文件下载&断点续传管理 --TBD
- [Glide 使用教程](https://www.jianshu.com/p/7ce7b02988a4)：Android推荐的热门图片加载库 备注：三大主流库ImageLoader,Picasso,Glide --TBD
- [AdMob](https://developers.google.com/admob/android/quick-start?hl=zh-CN#import_the_mobile_ads_sdk)：实现Google广告载入
- [Firebase](https://developers.google.com/firebase/docs/android/setup?hl=zh-CN)：移动应用后台服务端管理


-------
### 其他扩展组件功能实现：
- [EventBus 消息总线](https://www.jianshu.com/p/7ce7b02988a4)：针对Android优化的发布/订阅事件总线，取代Intent,Handler,BroadCast等消息传递机制 --TBD
- 异步任务（不同场景）的解决方案选择：--TBD
- 缓存方案：DiskLruCache --TBD
- 线程池方案：--TBD
- 应用常驻&应用保活：--TBD


-------
### 测试&调试&更新维护功能实现：
- 内存泄露：LeakCanary--TBD
- 调试框架：Stetho(Facebook开发的工具)，android as3.0后直接集成在IDE中了。--TBD
- 测试框架：Mockito--TBD
- 应用热更新：[腾讯tinker](https://github.com/Tencent/tinker)--TBD
- 插件式更新：odex插件式加载实现--TBD

-------
### Android推荐的应用程序的基础架构：

![Android 应用程序的基础架构](https://developer.android.google.cn/topic/libraries/architecture/images/final-architecture.png)

-------
### Screenshots：
![](https://github.com/caobaokang419/WeatherApp/blob/master/screenshots/admob_banner_screenshot.bmp)

-------
### License
部分业务机制借鉴网络资源，不能用于商业用途，转载请注明出处，谢谢！ 
