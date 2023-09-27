fun main(args: Array<String>) {
    one()
    println()
    two()
    println()
    three()
    println()
    four()
    println()
    five()
}

fun one() {
    var x = 0
    var y = 0
    while (x < 5) {
        y = x - y
        print("$x$y ")
        x = x + 1
    }
}

fun two() {
    var x = 0
    var y = 0
    while (x < 5) {
        y = y + x
        print("$x$y ")
        x = x + 1
    }
}

fun three() {
    var x = 0
    var y = 0
    while (x < 5) {
        y = y + 3
        if (y > 4) y = y - 1
        print("$x$y ")
        x = x + 1
    }
}

fun four() {
    var x = 0
    var y = 0
    while (x < 5) {
        x = x + 2
        y = y + x
        print("$x$y ")
        x = x + 1
    }
}

fun five() {
    var x = 0
    var y = 0
    while (x < 5) {
        if (y < 5) {
            x = x + 1
            if (y < 3) x = x - 1
        }
        y = y + 3
        print("$x$y ")
        x = x + 1
    }
}