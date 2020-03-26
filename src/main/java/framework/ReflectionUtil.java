package framework;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.lang.reflect.Field;

public class ReflectionUtil
{
    /**
     * To Start extent test case
     * @param
     */
    public ExtentReports getStaticFieldValueFromClass(String className){///EXTENTREPORTS
        ExtentReports report;
        try {
            Field[] declaredFields = ScenarioContext.class.getDeclaredFields();
            for (Field field : declaredFields) {
                if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    if(field.getName().toUpperCase().contains(className))
                    {
                        field.setAccessible(true);
                        return (ExtentReports) field.get(null);
                    }

                }
            }
        }catch (Exception e)
        {
            System.out.println("error");
            return null;
        }

        return null;
    }
}
