Adapter Design Pattern - 
I have created Adapter design pattern where OrderMultipleItem and OrderSingleItem are the Interfaces, PickUp and Drop are concrete classes, PostalAdapter is adapter class implementing the OrderSingleItem interface and PostalConcrete is a concrete class implements OrderSingleItem. My main class is PostalServiceMain. After running the project successfully we get the result as post is placed, delivered, Picked up from location and order not available.

Command Design Pattern - 
I have created Command Design Pattern where Order is the interface, PostalStock is the request class, DropService and PickUpService is a concrete class implements Order, ByPass is the broker class. The PostalServiceCommandMain is the main class. In result we can see if the order is dropped or shipped.

Facade Design Pattern - 
I have created PostalServiceFacadeMain as the main class, Postal as interface, StateCode, CityCode and PinCode as concrete classes implementing the same interface and CheckAvalibility as facade class.

Factory Design Pattern - 
I have created PostalServiceFactoryMain as the main class, Postal as interface, StateCode, CityCode and PinCode as concrete classes implementing the same interface and CheckAvalibility as factory class to generate object of concrete class. Here we can check if the poat service is deliverable to the state, city and pincode.