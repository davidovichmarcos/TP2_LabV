# TP2_LabV
threads 

Diferences between Runnable : 
        
        Runnable is a interface, so you have to implement it, and override the run() method, by this way the created object
        could be given as argument when you are defining a new Thread() to execute threads in parallel you have to call the 
        start() method. 
        Thread is a java class which implements the Runnable interface, to use this class you must extend it, and to start a 
        parallel thread you must call the start() method.
Following are the stages of the life cycle 

New 

        A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. 
        It is also referred to as a born thread.
Runnable  
        
        After a newly born thread is started, the thread becomes runnable. A thread in this state is considered to be 
        executing its task.
Waiting 
         
        Sometimes, a thread transitions to the waiting state while the thread waits for another thread to perform a task. 
        A thread transitions back to the runnable state only when another thread signals the waiting thread to continue 
        executing.
Timed Waiting 
        
        A runnable thread can enter the timed waiting state for a specified interval of time. A thread in this state 
        transitions back to the runnable state when that time interval expires or when the event it is waiting for occurs.
Terminated (Dead) 
 
         A runnable thread enters the terminated state when it completes its task or otherwise terminates.

Threads methods: 

start:    
            
            start()
            Causes this thread to begin execution; 
            the Java Virtual Machine calls the run method of this thread.
            
sleep:     

            sleep(long millis)
            Causes the currently executing thread to sleep (temporarily cease execution)
            for the specified number of milliseconds, subject to the precision and accuracy
            of system timers and schedulers.
            
            sleep(long millis, int nanos)
            Causes the currently executing thread to sleep (temporarily cease execution) 
            for the specified number of milliseconds plus the specified number of nanoseconds, 
            subject to the precision and accuracy of system timers and schedulers
            
yield:      

            yield()
            A hint to the scheduler that the current thread is willing to yield its current 
            use of a processor.
            
join:       

            join()
            Waits for this thread to die.
            
            join(long millis)
            Waits at most millis milliseconds for this thread to die.
            
            join(long millis, int nanos)
            Waits at most millis milliseconds plus nanos nanoseconds for this thread to die. 