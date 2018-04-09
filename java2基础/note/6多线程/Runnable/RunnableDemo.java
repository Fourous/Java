class RunnableDemo implements Runnable{
	private Thread t;
	private String threadName;

	RunnableDemo(String name){
		threadName=name;
		System.out.println("Creating"+threadName);
		}
		public void run(){//运行状态
			System.out.println("Running"+threadName);
			try{
				for(int i=4;i>0;i--){
					System.out.println("Thread:"+threadName+","+i);
					//sleep
					Thread.sleep(50);
					}
				}catch(InterruptedException e){
					System.out.println("Thread"+threadName+"interrupted.");
					}
					System.out.println("Thread"+threadName+"exiting");

			}
			//start(),让线程转为就绪状态
			public void start(){
				System.out.println("Starting"+threadName);
				if(t==null){
					t=new Thread(this.threadName);
					t.start();
					}
				}
	}
