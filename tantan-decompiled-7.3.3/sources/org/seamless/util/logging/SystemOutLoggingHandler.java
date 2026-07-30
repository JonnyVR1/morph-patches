package org.seamless.util.logging;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

/* JADX INFO: loaded from: classes3.dex */
public class SystemOutLoggingHandler extends StreamHandler {

    public static class SimpleFormatter extends Formatter {
        @Override // java.util.logging.Formatter
        public String format(LogRecord logRecord) {
            StringBuffer stringBuffer = new StringBuffer(180);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("kk:mm:ss,SS");
            stringBuffer.append("[");
            stringBuffer.append(pad(Thread.currentThread().getName(), 32));
            stringBuffer.append("] ");
            stringBuffer.append(pad(logRecord.getLevel().toString(), 12));
            stringBuffer.append(" - ");
            stringBuffer.append(pad(simpleDateFormat.format(new Date(logRecord.getMillis())), 24));
            stringBuffer.append(" - ");
            stringBuffer.append(toClassString(logRecord.getSourceClassName(), 30));
            stringBuffer.append('#');
            stringBuffer.append(logRecord.getSourceMethodName());
            stringBuffer.append(": ");
            stringBuffer.append(formatMessage(logRecord));
            stringBuffer.append(SignParameters.NEW_LINE);
            Throwable thrown = logRecord.getThrown();
            if (thrown != null) {
                StringWriter stringWriter = new StringWriter();
                thrown.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                stringBuffer.append(stringWriter.toString());
            }
            return stringBuffer.toString();
        }

        public String pad(String str, int i) {
            if (str.length() < i) {
                for (int length = str.length(); length < i - str.length(); length++) {
                    str = str.concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
            }
            return str;
        }

        public String toClassString(String str, int i) {
            return str.length() > i ? str.substring(str.length() - i) : str;
        }
    }

    public SystemOutLoggingHandler() {
        super(System.out, new SimpleFormatter());
        setLevel(Level.ALL);
    }

    @Override // java.util.logging.StreamHandler, java.util.logging.Handler
    public void close() {
        flush();
    }

    @Override // java.util.logging.StreamHandler, java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        super.publish(logRecord);
        flush();
    }
}
