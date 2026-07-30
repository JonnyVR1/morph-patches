package org.seamless.util.logging;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class LoggingUtil {
    public static final String DEFAULT_CONFIG = "default-logging.properties";

    public static Handler[] instantiateHandlers(List<String> list) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((Handler) Thread.currentThread().getContextClassLoader().loadClass(it.next()).newInstance());
        }
        return (Handler[]) arrayList.toArray(new Handler[arrayList.size()]);
    }

    public static void loadDefaultConfiguration(InputStream inputStream) throws Exception {
        if (System.getProperty("java.util.logging.config.file") != null) {
            return;
        }
        if (inputStream == null) {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(DEFAULT_CONFIG);
        }
        if (inputStream == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        LogManager.getLogManager().readConfiguration(spliceHandlers(inputStream, arrayList));
        resetRootHandler(instantiateHandlers(arrayList));
    }

    public static void resetRootHandler(Handler... handlerArr) {
        Logger logger = LogManager.getLogManager().getLogger("");
        for (Handler handler : logger.getHandlers()) {
            logger.removeHandler(handler);
        }
        for (Handler handler2 : handlerArr) {
            if (handler2 != null) {
                LogManager.getLogManager().getLogger("").addHandler(handler2);
            }
        }
    }

    public static InputStream spliceHandlers(InputStream inputStream, List<String> list) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : properties.entrySet()) {
            if (entry.getKey().equals("handlers")) {
                arrayList.add(entry.getValue().toString());
            } else {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append("\n");
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (String str : ((String) it.next()).trim().split(" ")) {
                list.add(str.trim());
            }
        }
        return new ByteArrayInputStream(sb.toString().getBytes("ISO-8859-1"));
    }

    public static void loadDefaultConfiguration() throws Exception {
        loadDefaultConfiguration(null);
    }
}
