class cisla()
{
    private var a = emptyArray<Int>()
    fun add(str: String)
    {
        val b = str.toIntOrNull()
        if (b != null)
        {
            val c: Int = str.toInt()
            a += c
        }
        else vyvod()
    }
    private fun vyvod()
    {
        var d: Int = a.size
        print("Вы ввели не число\n")
        while (d != 0)
        {
            println(a[0])
            a= a.drop(1).toTypedArray()
            d= d - 1
        }
    }
}
fun main()
{
    val q = cisla()
    var d: String
    while (true) {
        print("Введите число: ")
        d = readLine().toString()
        q.add(d)
    }
}