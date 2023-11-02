def integracion(func: (Double) => Double, funcX: (Int, Int) => Double, a: Int, b: Int): Double =
  (b - a) * ((func(a) + (4 * func(funcX(a,b))) + func(b)) / 6)

val funcX = (a: Int, b: Int) => (a + b).toDouble / 2

// val func = (x: Double) => -Math.pow(x, 2) + (8 * x) -12
// val func = (x: Double) => 3 * Math.pow(x, 2)
// * val func = (x: Double) => x + 2 * math.pow(x, 2) - math.pow(x, 3) + 5 * math.pow(x, 4)
// val func = (x: Double) => ((2 * x) + 1) / (Math.pow(x, 2) + x)
// val func = (x: Double) => Math.pow(math.E, x)
// * val func = (x: Double) => 1 / (Math.sqrt(x - 1))
val func = (x: Double) => 1 / (1 + Math.pow(x, 2))

val result = integracion(func, funcX, 0, 1)

val errorFunc = (valEsp: Double, valObt: Double) => valEsp - valObt
errorFunc(0.785398, result)
