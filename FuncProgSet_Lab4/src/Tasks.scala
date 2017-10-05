import util.Random.nextInt

object Tasks {
  def main(args : Array[String]){
    /*generating a list of 10 numbers with the range from 0-20 (for task 1 & 2)*/
    val myList = List.fill(10)(20).map(scala.util.Random.nextInt)
    
    println("myList: " + myList)
    println("Task 1 answer: " + lastNth (3, myList))
    println("Task 2 answer: " + lastNthRecursive (3, myList))
    
    println("Task 3 answer: \nisPrime(8): " + isPrime(8))
	println("isPrime(7): " + isPrime(7))
	println("Task 4 answer: \nisCoPrime(9, 5): " + isCoPrime(9, 5))
	println("isCoPrime(5, 10): " + isCoPrime(5, 10)) 
	
	println("Task 5 answer: ")
	println("T T: " + oprXOR(true,true))
	println("F T: " + oprXOR(false,true))
	println("T F: " + oprXOR(true,false))
	println("F F: " + oprXOR(false,false))
	
	println("Task 6 answer: ")
	println("T T: " + oprAND(true,true))
	println("F T: " + oprAND(false,true))
	println("T F: " + oprAND(true,false))
	println("F F: " + oprAND(false,false))
	
	println("Task 7 answer: ")
	println("T T: " + oprNAND(true,true))
	println("F T: " + oprNAND(false,true))
	println("T F: " + oprNAND(true,false))
	println("F F: " + oprNAND(false,false))
  }

  /*1.	*Find out the last Nth element in a randomly generated list.*/
  def lastNth (num : Int, integersList : List[Int]) : Int = integersList(integersList.length - num)
  
  /*2.	*Find out the last Nth element in a randomly generated list using a tail recursive
  solution. */
	def lastNthRecursive (num : Int, integersList : List[Int]) : Int = {
		
		def myFunc(i : Int, index : Int, subList : List[Int]) : Int = {
			if (i == index) subList.head
			else myFunc(i + 1, index, subList.tail)
		}
		
		if (num >= integersList.length) 0
		else myFunc(0, integersList.length - num, integersList)
	}
	
	/*3.	*Determine whether a given integer number is prime or not*/
	def isPrime(num : Int) : Boolean = {
		if(num <= 1) false
		else if (num == 2) true
		else !(2 to (num - 1)).exists(x => num % x == 0)
	}
	
	/*4.	**Determine whether two positive integer numbers are coprime.( Two numbers are coprime if
	their greatest common divisor equals 1)*/
	def isCoPrime(num1 : Int, num2 : Int) : Boolean = {
		var count = 0; //counter for loop
		for(count <- 2 until (num1)){
			if(num1 % count == 0 && num2 % count == 0) false
			}
		true
	}
	
	
	/*5.	**Define XOR operation for two logical expressions.*/
	def oprXOR(x : Boolean, y : Boolean) : Boolean = {
		if (x == y) false
		else true
	}
	
	
	
	/*6.	**Define AND operation for two logical expressions*/
	def oprAND(x : Boolean, y : Boolean) : Boolean = {
		if (x == true && y == true) true
		else false
	}
	
	
	/*7.	*Define NAND operation for two logical expressions.*/
	def oprNAND(x : Boolean, y : Boolean) : Boolean = {
		if (x == true && y == true) false
		else true
	}
	
	
	/*8.	***Given 5 random numbers (between 1 and 100), determine the mathematical operations
	(sum, subtract, product, divide) which can produce a number X, where each number is used only
	once. Example: How can 3, 7, 6, 8, 1 produce 348? (((8 * 7) + 3) -1) *6 = 348*/
	def howCanProduce(n1 : Int, n2 : Int, n3 : Int, n4 : Int, n5 : Int, result : Int) : Unit = {
		
	}

}