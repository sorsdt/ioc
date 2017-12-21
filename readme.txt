Pizza delivery
PizzaRepo
	Pizza
		price
		title
		type
		id
	PizzaService
		PizzasByType
		allPiza
		pizzabyname
Order
	list<pizz>
	User
	totalprice
OrderRepo
	allorders
	saveorder
OrderService
Main
	placeorder
	user, vararg pizz

solid
new SimpleService(new InMemService)

ddd domain driven design
анимическая модель

dto
домен не зависит ни от кого

переписать свой проэкт на спринге

создавать пиццы в анонимных бинах

доступ из синглтон бина к прототайпу
лукап метод
метод реплейсмент