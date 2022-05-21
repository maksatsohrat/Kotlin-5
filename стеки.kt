class stack()
{
    private var list = emptyArray<Int>()
    fun add(str: String)
    {
        val maybeDouble = str.toIntOrNull()
        if (maybeDouble != null)
        {
            val d: Int = str.toInt()
            list += d
        }
        else printArr()
    }

    private fun printArr()
    {
        var a: Int = list.size
        list.reverse()
        print("Вы ввели не число\n")
        while (a != 0)
        {
            println(list[0])
            list = list.drop(1).toTypedArray()
            a = a - 1
        }
    }
}
fun main()
{
    val s = stack()
    var d: String
    while (true)
    {
        print("Введите число:\t")
        d = readLine().toString()
        s.add(d)
    }
}