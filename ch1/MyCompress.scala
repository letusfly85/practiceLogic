object MyCompress {
    var counter: Int  = 0

    def main(args: Array[String]) {
        println(compress(args(0)))
    }

    def compress(str: String): String = {
        var preChar: Char = str.map(_.toChar).head
        var newStr:  String = ""

        str.map(_.toChar).foreach {c =>
            if (c == preChar) {
                counter += 1

            } else {
                if (counter > 1) {
                    newStr += preChar.toString + counter.toString

                } else {
                    newStr += preChar.toString
                }

                counter = 1
            }

            preChar = c
        }

        if (counter > 1) {
            newStr += preChar.toString + counter.toString

        } else {
            newStr += preChar.toString
        }

        newStr
    }
}
