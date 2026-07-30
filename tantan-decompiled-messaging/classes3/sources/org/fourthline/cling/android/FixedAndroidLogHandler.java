package org.fourthline.cling.android;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class FixedAndroidLogHandler extends Handler {
    private static final Formatter THE_FORMATTER = new Formatter() { // from class: org.fourthline.cling.android.FixedAndroidLogHandler.1
        @Override // java.util.logging.Formatter
        public String format(LogRecord logRecord) {
            Throwable thrown = logRecord.getThrown();
            if (thrown == null) {
                return logRecord.getMessage();
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            stringWriter.write(logRecord.getMessage());
            stringWriter.write("\n");
            thrown.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }
    };

    public FixedAndroidLogHandler() {
        setFormatter(THE_FORMATTER);
    }

    public static int getAndroidLevel(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= 1000) {
            return 6;
        }
        if (iIntValue >= 900) {
            return 5;
        }
        return iIntValue >= 800 ? 4 : 3;
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        try {
            int androidLevel = getAndroidLevel(logRecord.getLevel());
            String loggerName = logRecord.getLoggerName();
            if (loggerName == null) {
                loggerName = "null";
            } else {
                int length = loggerName.length();
                if (length > 23) {
                    int iLastIndexOf = loggerName.lastIndexOf(".");
                    loggerName = (length - iLastIndexOf) + (-1) <= 23 ? loggerName.substring(iLastIndexOf + 1) : loggerName.substring(loggerName.length() - 23);
                }
            }
            Log.println(androidLevel, loggerName, getFormatter().format(logRecord));
        } catch (RuntimeException e) {
            Log.e("AndroidHandler", "Error logging message.", e);
        }
    }
}
