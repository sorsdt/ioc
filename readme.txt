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

для каждого из сервисов и репозитория выделять интрефейсы

добавить стопвотч в темплейты

bom.xml

переписать свой проэкт на спринге
не понял про создание эмпти ордер - static factory method - xml круче аннотаций

юзать констрактор DI а е сеттеры

циклические зависимости резолвить через сеттеры

ApplicationContextAware для передачи в бин информации о контейнере
http://www.baeldung.com/circular-dependencies-in-spring
