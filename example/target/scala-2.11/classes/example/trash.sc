def sum(xs: List[Int]): Int = if (xs.isEmpty) 0 else xs.head + sum(xs.tail)

val krowa = 1::4::5::Nil
sum(krowa)