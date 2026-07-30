package p149l;

import android.text.TextUtils;
import android.util.Log;
import com.tantanapp.android.injecter.facade.template.ILogger;

/* JADX INFO: loaded from: classes13.dex */
public class uod implements ILogger {

    /* JADX INFO: renamed from: b */
    public static boolean f177502b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f177503c = false;

    /* JADX INFO: renamed from: a */
    public String f177504a;

    public uod(String str) {
        this.f177504a = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m194549a(StackTraceElement stackTraceElement) {
        StringBuilder sb = new StringBuilder("[");
        if (f177503c) {
            String name = Thread.currentThread().getName();
            String fileName = stackTraceElement.getFileName();
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            long id = Thread.currentThread().getId();
            int lineNumber = stackTraceElement.getLineNumber();
            sb.append("ThreadId=");
            sb.append(id);
            sb.append(" & ThreadName=");
            sb.append(name);
            sb.append(" & FileName=");
            sb.append(fileName);
            sb.append(" & ClassName=");
            sb.append(className);
            sb.append(" & MethodName=");
            sb.append(methodName);
            sb.append(" & LineNumber=");
            sb.append(lineNumber);
        }
        sb.append(" ] ");
        return sb.toString();
    }

    @Override // com.tantanapp.android.injecter.facade.template.ILogger
    public void debug(String str, String str2) {
        if (f177502b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            m194549a(stackTraceElement);
        }
    }

    @Override // com.tantanapp.android.injecter.facade.template.ILogger
    public void error(String str, String str2) {
        if (f177502b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                str = getDefaultTag();
            }
            Log.e(str, str2 + m194549a(stackTraceElement));
        }
    }

    @Override // com.tantanapp.android.injecter.facade.template.ILogger
    public String getDefaultTag() {
        return this.f177504a;
    }

    @Override // com.tantanapp.android.injecter.facade.template.ILogger
    public void info(String str, String str2) {
        if (f177502b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            m194549a(stackTraceElement);
        }
    }

    @Override // com.tantanapp.android.injecter.facade.template.ILogger
    public void warning(String str, String str2) {
        if (f177502b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            m194549a(stackTraceElement);
        }
    }
}
