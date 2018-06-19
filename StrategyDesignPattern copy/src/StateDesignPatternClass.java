interface MobileAlertState 
{
    public void alert(AlertStateContext ctx);
}
 
class AlertStateContext 
{
    private MobileAlertState currentState;
 
    public AlertStateContext() 
    {
        currentState = null;
    }
 
    public void setState(MobileAlertState state) 
    {
        currentState = state;
    }
 
    public void alert() 
    {
        currentState.alert(this);
    }
}
 
class Vibration implements MobileAlertState 
{
    @Override
    public void alert(AlertStateContext ctx) 
    {
         System.out.println("vibration...");
    }
 
}
 
class Silent implements MobileAlertState
{
    @Override
    public void alert(AlertStateContext ctx) 
    {
        System.out.println("silent...");
    }
 
}
 
class StateDesignPatternClass 
{
    public static void main(String[] args) 
    {
        AlertStateContext stateContext = new AlertStateContext();
        //stateContext.alert();
        //stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();        
    }
}
