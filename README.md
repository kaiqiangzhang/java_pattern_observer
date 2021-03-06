# pattern
23 java pattern
观察者模式

1.观察者模式的本质：触发联动
当目标的状态发生改变时，就是触发相应的通知给所有注册的观察者。
2.优点：
  1） 实现了观察者和目标之间的抽象耦合
      如果不用观察者模式，目标的变化需要直接一一通知给所有的观察者对象。但是抽象出观察者接口后，目标和观察者只在抽象层面上耦合了，也就是说，目标只知道观察者接口，不知道具体对象。
  2） 实现了动态联动
      运行期间可以动态的控制注册的观察者。
  3） 支持广播通信
3.缺点
  可能引起无谓的操作。不管观察者需不需要，每个观察者都会调用update方法，但是有些观察者，并不需要信息。

4.何时适用
  1）当一个抽象模型有两方面，其中一方面的操作依赖于另一方面的状态变化。可以封装成观察者模式，当目标对象的变化的时候，依赖于它的观察者也发生相应的变化，这样就把抽象模型的这两个方面分开了，使得他们可以独立的改变和被复用。
  2）如果要在改变一个对象的时候，连带改变另一个对象，且不知道究竟应该有多少个对象被连带改变（可以作为多个观察者）。
  3）当一个对象必须通知其他对象，但是又不希望这个对象和其他通知的对象是松散耦合的关系时。

