object Put20 {
    def main(args: Array[String]) {
        println("\"" + put20(args(0)) + "\"")
    }

    def put20(str: String): String = {
        var strSize = str.size

        var newStr: String = ""
        str.map(_.toChar).foreach {c =>
            if (c == ' ' && strSize > 3) {
                newStr += "%20"
                strSize -= 3
            
            } else {
                newStr += c
                strSize -= 1
            }
        }

        newStr
    }
}
