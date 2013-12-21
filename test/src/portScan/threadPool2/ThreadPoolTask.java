package portScan.threadPool2;
import java.io.Serializable;   
  
public class ThreadPoolTask implements Runnable, Serializable {   
  
    private static final long serialVersionUID = 0;   
    private static int consumeTaskSleepTime = 2000;   
    //������������Ҫ������   
    private Object threadPoolTaskData;   
  
    ThreadPoolTask(Object tasks){   
    this.threadPoolTaskData = tasks;   
    }   
    public void run(){   
    //����һ����������Ĵ���ʽ̫���ˣ�������һ����ӡ���   
    System.out.println(Thread.currentThread().getName());      
    System.out.println("start .."+threadPoolTaskData);   
       
    try {   
    ////���ڹ۲죬�ȴ�һ��ʱ��   
    Thread.sleep(consumeTaskSleepTime);   
    } catch (Exception e) {   
    e.printStackTrace();   
    }   
    threadPoolTaskData = null;   
    }   
       
    public Object getTask(){   
    return this.threadPoolTaskData;   
    }   
    }  