package helpers;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class PropertyLoader {

    private static Properties props = null;

    private static Map<String, Properties> applicationPropertyMap = new HashMap<String, Properties>(2);

    private static void loadProperties(){
        String configPath = "qa.conf";
        props = new Properties();
        try {
            props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(configPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String application, String key){
        if(!applicationPropertyMap.containsKey(application)){
            String appConfigPath = "applications" + File.separator + application + ".conf";
            Properties properties = new Properties();
            try {
                properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(appConfigPath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            applicationPropertyMap.put(application, properties);
        }
        return applicationPropertyMap.get(application).getProperty(key);
    }

    public static String getDriverPath(){
        if(props == null){
            loadProperties();
        }
        return props.getProperty("path");
    }

    public static String getReportPath(){
        if(props == null){
            loadProperties();
        }
        return props.getProperty("report.path");
    }

}