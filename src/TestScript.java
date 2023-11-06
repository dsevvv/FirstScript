import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.utilities.Logger;

public class TestScript extends AbstractScript {

    @Override
    public int onLoop() {
        Logger.log("Hello World!");
        return 1000;
    }
}
