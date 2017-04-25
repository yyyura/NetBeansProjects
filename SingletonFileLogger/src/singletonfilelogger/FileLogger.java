
package singletonfilelogger;


public class FileLogger {
    private static FileLogger logger;
    //Prevent clients from using constructor
    
    private FileLogger(){
    }
    
    public static FileLogger getFileLogger(){
        if (logger == null) {
            logger = new FileLogger();            
        }
        return logger;   
    }
    
    public synchronized void log(String msg){
    
    FileUtil futil = new FileUtil();
    futil.writeToFile("log.txt", msg, true, true);    
    
    }
    
    
    
}
