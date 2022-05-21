fun showAll(list1: List<String>, list2: List<String>)
{
    val list = mutableListOf<String>()
    for (i in list1)
    {
        list.add(i)
    }
    for (i in list2)
    {
        if (list1.contains(i))
        {
            continue
        }
        list.add(i)
    }
    println("Общие товары пользователей")
    for (i in list)
    {
        println(i)
    }
}
fun showUnique1(list1: List<String>, list2: List<String>)
{
    val list = mutableListOf<String>()
    for (i in list1)
    {
        if (list2.contains(i))
        {
            continue
        }
        list.add(i)
    }
    println("Уникальные товары 1 пользователя")
    for (i in list)
    {
        println(i)
    }
}
fun showCommon(list1: List<String>, list2: List<String>)
{
    val list = mutableListOf<String>()
    for (i in list1)
    {
        if (list2.contains(i))
        {
            list.add(i)
        }
    }
    println("Товары, которые есть у обоих пользователей")
    for (i in list)
    {
        println(i)
    }
}
fun main()
{
    val user1 = mutableListOf<String>()
    val user2 = mutableListOf<String>()
    var name: String
    while (true)
    {
        println("Введите >>a и имя товара для первого пользователя или же >>b имя товара для второго\nДля остановки и вывода товаров введите 'stop'")
        name = readLine().toString()
        if (name[0] == 'a')
        {
            name = name.drop(1)
            user1.add(name)
        }
        else if (name[0] == 'b')
        {
            name = name.drop(1)
            user2.add(name)
        }
        else if (name == "stop")
        {
            break
        }
    }
    showAll(user1, user2)
    showUnique1(user1, user2)
    showCommon(user1, user2)
}