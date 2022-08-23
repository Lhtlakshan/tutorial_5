package tutorial_05;{

	object tute_05
	{
       //01 (first we should create a function for find GCD)
		def GCD(a:Int,b:Int):Int=b match{
            case 0 => a
            case b if b>a => GCD(b,a)
            case _ => GCD(b,a%b)
       }

		def prime(p:Int,n:Int=2):Boolean= n match {
            case x if(x==p) => true
            case x if GCD(p,x)>1 => false
            case x => prime(p,x+1)
         }

        println(prime(5) , "\n"); 
        println(prime(8));

        //02

        def primeSeq(n : Int):Int= {
        	if(prime(n) == true) 
            {println(n)
            primeSeq(n-1)}
         else
            primeSeq(n-1)
         }   
        		

        //03
        
        def sum(n : Int) : Int=n match
        {
        	case n if(x<=0) => 0;
        	case _ => n+sum(n-1)
        	}  

        println(sum(5));   

        //04

        def isEven(n:Int):Boolean= n match{
            case 0 => true
            case _ => isOdd(n-1)
        }
        def isOdd(n:Int):Boolean = !(isEven(n))

        //05

        
        def sum_even(n:Int):Int=n match {
           case n if(n==0) => n
           case n if(n%2==0) => n+sum_even(n-1)
           case _ => sum_even(n-1)
        }

        //06

        def fibonacci(n:Int):Int= n match{
            case 0 => 0
            case n if n==1 => 1
            case _ => fibonacci(n-1)+fibonacci(n-2)
         }
       def fibonacciSeq(n:Int):Unit= {
            if (n > 0) fibonacciSeq(n-1)
            println(fibonacci(n))
        }
}



}