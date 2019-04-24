# TP2_LabV
threads 

Diferencia entre Runnable y Thread: 
Runnable es una interface, por lo tanto la clase debe implementarla, y sobreescribir el metodo run(), de esta manera el objeto 
creado se puede pasar como argumento al definir un new Thread(), para ejecutar hilos en paralelo al thread que se le pasa la 
implementacion de Runnable se debe llamar al metodo start();
Thread es una clase que internamente implementa Runnable, a esta para utilizarla hay que extender de la misma, y para su correcto
uso hay que llamar al metodo start();

Following are the stages of the life cycle −

New − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread.
Runnable − After a newly born thread is started, the thread becomes runnable. A thread in this state is considered to be executing its task.
Waiting − Sometimes, a thread transitions to the waiting state while the thread waits for another thread to perform a task. A thread transitions back to the runnable state only when another thread signals the waiting thread to continue executing.
Timed Waiting − A runnable thread can enter the timed waiting state for a specified interval of time. A thread in this state transitions back to the runnable state when that time interval expires or when the event it is waiting for occurs.
Terminated (Dead) − A runnable thread enters the terminated state when it completes its task or otherwise terminates.
