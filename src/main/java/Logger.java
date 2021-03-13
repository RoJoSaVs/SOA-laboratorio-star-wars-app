import org.apache.commons.logging.*;

public class Logger {
    public static Log log = LogFactory.getLog("StarWarsApp Logger");

    public static void INFO(Object message) {
        log.info(message);
    }

    public static void WARNING(Object message) {
        log.warn(message);
    }

    public static void REPORT(Object message) {
        log.fatal(message);
    }

    public static void DEBUGGER(Object message) {
        log.debug(message);
    }

    public static void ERROR(Object message) {
        log.error(message);
    }
}
