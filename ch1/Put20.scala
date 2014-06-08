object Put20 {
    def main(args: Array[String]) {
        println("\"" + put20(args(0)) + "\"")
    }

    def put20(str: String): String = {
        var leftSpace = str.map(_.toChar).filter(_ == ' ').size
        var strSize = str.size

        var newStr: String = ""
        str.map(_.toChar).foreach {c =>
            if (c == ' ' && leftSpace > 2) {
                newStr += "%20"
                leftSpace -= 2
            
            } else if (c == ' ') {
                newStr = newStr

            } else {
                newStr += c
            }
        }

        newStr
    }
}
