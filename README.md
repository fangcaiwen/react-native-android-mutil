**react-native-android-util**
读取android原生的一些方法，目前只有读取android版本号，后续更新# react-native-android-util
 
## 使用方法：
## 1.在rn项目里执行这个命令：npm i react-native-android-util。
## 2.然后到rn的android项目下检查build.gradle里在
```
dependencies{
  ...
  
  compile project(path: ':react-native-android-util')
  
}，
```


## 3.再到MainApplication下添加
 ```
 @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          ...
          new UtilPackage()
      );
    }
 ```   
  ,在编译下android这个项目。
  
  
## 4.再到rn里你想使用的地方：
 import Util from 'react-native-android-util';
 ...
 
 
## 5. 调用
 ```
  Util.getVerSionCode((versionCode)=>{
      //versionCode 就是当前android版本的版本号啦
    });
```    
    
