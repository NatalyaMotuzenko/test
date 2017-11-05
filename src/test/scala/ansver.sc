// #1
// your code goes here
val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
val text = "GHMABGZ VKXTMXL LNVVXLL EBDX GHG-LMHI, XGMANLBTLMBV XYYHKM"


var newAlphaNum = ((alphabet indexOf(text charAt(0))) + 1) +: (for{
  i<-0 until text.length
  if((text charAt(i)) == ' ')
} yield (alphabet indexOf(text charAt(i+1))) + 1)

var shifr = for {
  i <- 0 until newAlphaNum.length
}
  yield {
    if (newAlphaNum(i) >= 27)
      alphabet charAt (newAlphaNum(i - 27))
    else
      alphabet charAt (newAlphaNum(i))
  }

var res = for {
  j <- 0 until 26
}
  yield {
    for {
      i <- 0 until shifr.length}
      yield {
        if (((alphabet indexOf (shifr(i))) + j) >= 26)
          alphabet charAt ((alphabet indexOf (shifr(i)) + j - 26))
        else alphabet charAt (((alphabet indexOf (shifr(i))) + j))
      }
  }

println(s"#1 - ${res}")

// #2

// your code goes here

println(s"#2 - ${/*answer #2*/}")

// #3

// your code goes here

println(s"#3 - ${/*answer #3*/}")

// #4

// your code goes here

println(s"#4 - ${/*answer #4*/}")

// #5

// your code goes here

println(s"#5 - ${/*answer #5*/}")