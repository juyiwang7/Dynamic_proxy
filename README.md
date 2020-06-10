# Dynamic proxy
# 动态代理的简单例子

### 主要步骤
- 继承InvocationHandler类，并重新invoke方法（在invoke方法内实现原来的方法）
- 得到代理类
    - Proxy.newProxyInstance()方法

