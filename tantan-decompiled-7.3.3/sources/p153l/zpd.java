package p153l;

import android.text.TextUtils;
import android.util.Log;
import com.tantanapp.android.injecter.facade.template.ILogger;

/* JADX INFO: loaded from: classes11.dex */
public class zpd implements ILogger {

    /* JADX INFO: renamed from: b */
    public static boolean f205450b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f205451c = false;

    /* JADX INFO: renamed from: a */
    public String f205452a;

    public zpd(String str) {
        this.f205452a = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m220830a(StackTraceElement stackTraceElement) {
        StringBuilder sb = new StringBuilder("[");
        if (f205451c) {
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
        if (f205450b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            m220830a(stackTraceElement);
        }
    }

    @Override // com.tantanapp.android.injecter.facade.template.ILogger
    public void error(String str, String str2) {
        if (f205450b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                str = getDefaultTag();
            }
            Log.e(str, str2 + m220830a(stackTraceElement));
        }
    }

    @Override // com.tantanapp.android.injecter.facade.template.ILogger
    public String getDefaultTag() {
        return this.f205452a;
    }

    @Override // com.tantanapp.android.injecter.facade.template.ILogger
    public void info(String str, String str2) {
        if (f205450b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            m220830a(stackTraceElement);
        }
    }

    @Override // com.tantanapp.android.injecter.facade.template.ILogger
    public void warning(String str, String str2) {
        if (f205450b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            m220830a(stackTraceElement);
        }
    }
}
