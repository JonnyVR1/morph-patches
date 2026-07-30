package org.slf4j;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import org.slf4j.helpers.NOPLoggerFactory;
import org.slf4j.helpers.SubstituteLoggerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticLoggerBinder;
import p153l.wtq0;
import p153l.yzv;

/* JADX INFO: loaded from: classes3.dex */
public final class LoggerFactory {
    static final String CODES_PREFIX = "http://www.slf4j.org/codes.html";
    static final int FAILED_INITILIZATION = 2;
    static int INITIALIZATION_STATE = 0;
    static final String MULTIPLE_BINDINGS_URL = "http://www.slf4j.org/codes.html#multiple_bindings";
    static final int NOP_FALLBACK_INITILIZATION = 4;
    static final String NO_STATICLOGGERBINDER_URL = "http://www.slf4j.org/codes.html#StaticLoggerBinder";
    static final String NULL_LF_URL = "http://www.slf4j.org/codes.html#null_LF";
    static final int ONGOING_INITILIZATION = 1;
    static final String SUBSTITUTE_LOGGER_URL = "http://www.slf4j.org/codes.html#substituteLogger";
    static final int SUCCESSFUL_INITILIZATION = 3;
    static final int UNINITIALIZED = 0;
    static final String UNSUCCESSFUL_INIT_MSG = "org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final String UNSUCCESSFUL_INIT_URL = "http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final String VERSION_MISMATCH = "http://www.slf4j.org/codes.html#version_mismatch";
    static /* synthetic */ Class class$org$slf4j$LoggerFactory;
    static SubstituteLoggerFactory TEMP_FACTORY = new SubstituteLoggerFactory();
    static NOPLoggerFactory NOP_FALLBACK_FACTORY = new NOPLoggerFactory();
    private static final String[] API_COMPATIBILITY_LIST = {"1.6"};
    private static String STATIC_LOGGER_BINDER_PATH = "org/slf4j/impl/StaticLoggerBinder.class";

    private LoggerFactory() {
    }

    private static final void bind() {
        try {
            StaticLoggerBinder.getSingleton();
            INITIALIZATION_STATE = 3;
            emitSubstituteLoggerWarning();
        } catch (Exception e) {
            failedBinding(e);
            yzv.m218057a("Unexpected initialization failure", e);
        } catch (NoClassDefFoundError e2) {
            String message = e2.getMessage();
            if (message == null || message.indexOf("org/slf4j/impl/StaticLoggerBinder") == -1) {
                failedBinding(e2);
                throw e2;
            }
            INITIALIZATION_STATE = 4;
            Util.report("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            Util.report("Defaulting to no-operation (NOP) logger implementation");
            Util.report("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e3) {
            String message2 = e3.getMessage();
            if (message2 != null && message2.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") != -1) {
                INITIALIZATION_STATE = 2;
                Util.report("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                Util.report("Your binding is version 1.5.5 or earlier.");
                Util.report("Upgrade your binding to version 1.6.x. or 2.0.x");
            }
            throw e3;
        }
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static final void emitSubstituteLoggerWarning() {
        List loggerNameList = TEMP_FACTORY.getLoggerNameList();
        if (loggerNameList.size() == 0) {
            return;
        }
        Util.report("The following loggers will not work becasue they were created");
        Util.report("during the default configuration phase of the underlying logging system.");
        Util.report("See also http://www.slf4j.org/codes.html#substituteLogger");
        for (int i = 0; i < loggerNameList.size(); i++) {
            Util.report((String) loggerNameList.get(i));
        }
    }

    public static void failedBinding(Throwable th) {
        INITIALIZATION_STATE = 2;
        Util.report("Failed to instantiate SLF4J LoggerFactory", th);
    }

    public static ILoggerFactory getILoggerFactory() {
        if (INITIALIZATION_STATE == 0) {
            INITIALIZATION_STATE = 1;
            performInitialization();
        }
        int i = INITIALIZATION_STATE;
        if (i == 1) {
            return TEMP_FACTORY;
        }
        if (i == 2) {
            wtq0.m207906a(UNSUCCESSFUL_INIT_MSG);
            return null;
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return NOP_FALLBACK_FACTORY;
        }
        wtq0.m207906a("Unreachable code");
        return null;
    }

    public static Logger getLogger(String str) {
        return getILoggerFactory().getLogger(str);
    }

    private static final void performInitialization() {
        singleImplementationSanityCheck();
        bind();
        if (INITIALIZATION_STATE == 3) {
            versionSanityCheck();
        }
    }

    public static void reset() {
        INITIALIZATION_STATE = 0;
        TEMP_FACTORY = new SubstituteLoggerFactory();
    }

    private static void singleImplementationSanityCheck() {
        try {
            Class clsClass$ = class$org$slf4j$LoggerFactory;
            if (clsClass$ == null) {
                clsClass$ = class$("org.slf4j.LoggerFactory");
                class$org$slf4j$LoggerFactory = clsClass$;
            }
            ClassLoader classLoader = clsClass$.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(STATIC_LOGGER_BINDER_PATH) : classLoader.getResources(STATIC_LOGGER_BINDER_PATH);
            ArrayList arrayList = new ArrayList();
            while (systemResources.hasMoreElements()) {
                arrayList.add(systemResources.nextElement());
            }
            if (arrayList.size() > 1) {
                Util.report("Class path contains multiple SLF4J bindings.");
                for (int i = 0; i < arrayList.size(); i++) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Found binding in [");
                    stringBuffer.append(arrayList.get(i));
                    stringBuffer.append(Constants.AES_SUFFIX);
                    Util.report(stringBuffer.toString());
                }
                Util.report("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
            }
        } catch (IOException e) {
            Util.report("Error getting resources from path", e);
        }
    }

    private static final void versionSanityCheck() {
        String[] strArr;
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            int i = 0;
            boolean z = false;
            while (true) {
                strArr = API_COMPATIBILITY_LIST;
                if (i >= strArr.length) {
                    break;
                }
                if (str.startsWith(strArr[i])) {
                    z = true;
                }
                i++;
            }
            if (z) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("The requested version ");
            stringBuffer.append(str);
            stringBuffer.append(" by your slf4j binding is not compatible with ");
            stringBuffer.append(Arrays.asList(strArr).toString());
            Util.report(stringBuffer.toString());
            Util.report("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            Util.report("Unexpected problem occured during version sanity check", th);
        }
    }

    public static Logger getLogger(Class cls) {
        return getLogger(cls.getName());
    }
}
