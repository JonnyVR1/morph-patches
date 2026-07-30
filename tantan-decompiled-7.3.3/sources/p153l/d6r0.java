package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.apm.lite.nativecrash.NativeImpl;
import com.clevertap.android.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d6r0 {

    /* JADX INFO: renamed from: a */
    private static final StackTraceElement f85395a = new StackTraceElement("", "", "", 0);

    /* JADX INFO: renamed from: l.d6r0$a */
    public static class C16466a {

        /* JADX INFO: renamed from: a */
        public int f85396a;

        /* JADX INFO: renamed from: b */
        public int f85397b;

        public C16466a(int i, int i2) {
            this.f85396a = i;
            this.f85397b = i2;
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m114530a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("start", this.f85396a);
                jSONObject.put("end", this.f85397b);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m114506a(String str) {
        BufferedReader bufferedReader = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            int i2 = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    }
                    if (i2 <= 256) {
                        linkedList.add(line);
                        sb.append(line);
                        sb.append('\n');
                    } else {
                        linkedList2.add(line);
                        if (linkedList2.size() > 256) {
                            linkedList2.poll();
                            i++;
                        }
                    }
                    i2++;
                } catch (Throwable unused) {
                    bufferedReader = bufferedReader2;
                    m4r0.m157051a(bufferedReader);
                }
            }
            m4r0.m157051a(bufferedReader2);
        } catch (Throwable unused2) {
        }
        if (!linkedList2.isEmpty()) {
            if (i != 0) {
                sb.append("\t... skip ");
                sb.append(i);
                sb.append(" lines\n");
            }
            Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: b */
    public static String m114507b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            m114518m(th, printWriter);
            String string = stringWriter.toString();
            printWriter.close();
            return string;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m114508c(Throwable th, Thread thread, PrintStream printStream, h0r0.C17364a c17364a) throws IOException {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Throwable unused) {
            messageDigest = null;
        }
        h0r0 h0r0Var = new h0r0(printStream, messageDigest, c17364a);
        try {
            m114518m(th, h0r0Var);
        } catch (Throwable unused2) {
        }
        h0r0Var.close();
        if (messageDigest != null) {
            return m114509d(messageDigest.digest());
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static String m114509d(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i += 2;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: e */
    public static String m114510e(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            m114511f(stackTraceElement, sb);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static StringBuilder m114511f(StackTraceElement stackTraceElement, StringBuilder sb) {
        String className = stackTraceElement.getClassName();
        sb.append("  at ");
        sb.append(className);
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        sb.append("(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")\n");
        return sb;
    }

    /* JADX INFO: renamed from: g */
    public static JSONArray m114512g(StackTraceElement[] stackTraceElementArr, String[] strArr) {
        int i;
        C16466a c16466a = new C16466a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        int i2 = 0;
        while (true) {
            int length = stackTraceElementArr.length;
            i = c16466a.f85396a;
            if (i2 >= length) {
                break;
            }
            if (i == -1) {
                if (m114522q(stackTraceElementArr[i2].getClassName(), strArr)) {
                    c16466a.f85396a = i2;
                    c16466a.f85397b = i2;
                }
            } else if (!m114522q(stackTraceElementArr[i2].getClassName(), strArr)) {
                c16466a.f85397b = i2;
                jSONArray.put(c16466a.m114530a());
                c16466a = new C16466a(-1, -1);
            }
            i2++;
        }
        if (i != -1) {
            c16466a.f85397b = stackTraceElementArr.length;
            jSONArray.put(c16466a.m114530a());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: h */
    public static JSONArray m114513h(String[] strArr, String[] strArr2) {
        int i;
        C16466a c16466a = new C16466a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            i = c16466a.f85396a;
            if (i2 >= length) {
                break;
            }
            if (i == -1) {
                if (m114522q(strArr[i2], strArr2)) {
                    c16466a.f85396a = i2;
                    c16466a.f85397b = i2;
                }
            } else if (!m114522q(strArr[i2], strArr2)) {
                c16466a.f85397b = i2;
                jSONArray.put(c16466a.m114530a());
                c16466a = new C16466a(-1, -1);
            }
            i2++;
        }
        if (i != -1) {
            c16466a.f85397b = strArr.length;
            jSONArray.put(c16466a.m114530a());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: i */
    private static void m114514i(StackTraceElement stackTraceElement, int i) {
        String str;
        String strValueOf;
        try {
            m114515j("\tat ", i);
            m114515j(stackTraceElement.getClassName(), i);
            m114515j(".", i);
            m114515j(stackTraceElement.getMethodName(), i);
            if (!stackTraceElement.isNativeMethod()) {
                if (stackTraceElement.getFileName() != null) {
                    if (stackTraceElement.getLineNumber() >= 0) {
                        m114515j("(", i);
                        m114515j(stackTraceElement.getFileName(), i);
                        m114515j(":", i);
                        strValueOf = String.valueOf(stackTraceElement.getLineNumber());
                    } else {
                        m114515j("(", i);
                        strValueOf = stackTraceElement.getFileName();
                    }
                } else if (stackTraceElement.getLineNumber() >= 0) {
                    m114515j("(Unknown Source:", i);
                    strValueOf = String.valueOf(stackTraceElement.getLineNumber());
                } else {
                    str = "(Unknown Source)";
                }
                m114515j(strValueOf, i);
                m114515j(")", i);
                m114515j(SignParameters.NEW_LINE, i);
            }
            str = "(Native Method)";
            m114515j(str, i);
            m114515j(SignParameters.NEW_LINE, i);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    private static void m114515j(String str, int i) {
        NativeImpl.m5188z(i, str);
    }

    /* JADX INFO: renamed from: k */
    public static void m114516k(Throwable th, int i) {
        try {
            m114526u(th, i);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    private static void m114517l(Throwable th, int i, String str, String str2) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        try {
            NativeImpl.m5188z(i, str2);
            NativeImpl.m5188z(i, str);
        } catch (Throwable unused) {
        }
        m114524s(th, i);
        for (StackTraceElement stackTraceElement : stackTrace) {
            m114514i(stackTraceElement, i);
        }
        for (Throwable th2 : th.getSuppressed()) {
            m114517l(th2, i, "Suppressed: ", str2 + "\t");
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            m114517l(cause, i, "Caused by: ", str2);
        }
    }

    /* JADX INFO: renamed from: m */
    private static void m114518m(Throwable th, PrintWriter printWriter) {
        if (th == null || printWriter == null) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.add(th);
        printWriter.println(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > 384;
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (z && i > 256) {
                StringBuilder sb = new StringBuilder("\t... skip ");
                sb.append((stackTrace.length - i) - 128);
                sb.append(" lines");
                printWriter.println(sb.toString());
                break;
            }
            printWriter.println("\tat " + stackTraceElement);
            i++;
        }
        if (z) {
            for (int length = stackTrace.length - 128; length < stackTrace.length; length++) {
                printWriter.println("\tat " + stackTrace[length]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            m114519n(th2, printWriter, stackTrace, "Suppressed: ", "\t", setNewSetFromMap, 128);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            m114519n(cause, printWriter, stackTrace, "Caused by: ", "", setNewSetFromMap, 128);
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m114519n(Throwable th, PrintWriter printWriter, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set, int i) {
        if (set.contains(th)) {
            printWriter.println("\t[CIRCULAR REFERENCE:" + th + Constants.AES_SUFFIX);
            return;
        }
        set.add(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > i;
        printWriter.println(str2 + str + th);
        int length = stackTrace.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            StackTraceElement stackTraceElement = stackTrace[i3];
            if (z && i2 > i) {
                printWriter.println("\t... skip " + ((stackTrace.length - i2) - (i / 2)) + " lines");
                break;
            }
            printWriter.println("\tat " + stackTraceElement);
            i2++;
        }
        if (z) {
            for (int length2 = stackTrace.length - (i / 2); length2 < stackTrace.length; length2++) {
                printWriter.println("\tat " + stackTrace[length2]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            int i4 = i / 2;
            m114519n(th2, printWriter, stackTrace, "Suppressed: ", str2 + "\t", set, i4 > 10 ? i4 : 10);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            int i5 = i / 2;
            m114519n(cause, printWriter, stackTrace, "Caused by: ", str2, set, i5 > 10 ? i5 : 10);
        }
    }

    /* JADX INFO: renamed from: o */
    private static void m114520o(Throwable th, List<StackTraceElement> list) {
        if (th == null || list == null) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.add(th);
        list.add(f85395a);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > 384;
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (z && i > 256) {
                list.add(f85395a);
                break;
            } else {
                list.add(stackTraceElement);
                i++;
            }
        }
        if (z) {
            for (int length = stackTrace.length - 128; length < stackTrace.length; length++) {
                list.add(stackTrace[length]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            m114521p(th2, list, stackTrace, "Suppressed: ", "\t", setNewSetFromMap, 128);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            m114521p(cause, list, stackTrace, "Caused by: ", "", setNewSetFromMap, 128);
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m114521p(Throwable th, List<StackTraceElement> list, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set, int i) {
        if (set.contains(th)) {
            list.add(f85395a);
            return;
        }
        set.add(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > i;
        list.add(f85395a);
        int i2 = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (z && i2 > i) {
                list.add(f85395a);
                break;
            } else {
                list.add(stackTraceElement);
                i2++;
            }
        }
        if (z) {
            for (int length = stackTrace.length - (i / 2); length < stackTrace.length; length++) {
                list.add(stackTrace[length]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            int i3 = i / 2;
            m114521p(th2, list, stackTrace, "Suppressed: ", str2 + "\t", set, i3 > 10 ? i3 : 10);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            int i4 = i / 2;
            m114521p(cause, list, stackTrace, "Caused by: ", str2, set, i4 > 10 ? i4 : 10);
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m114522q(String str, String[] strArr) {
        if (strArr != null && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static JSONObject m114523r(String str) {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            JSONObject jSONObject = new JSONObject();
            if (allStackTraces == null) {
                return null;
            }
            jSONObject.put("thread_all_count", allStackTraces.size());
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                Thread key = entry.getKey();
                String name = key.getName();
                if (!m114527v(name) && (str == null || (!str.equals(name) && !name.startsWith(str) && !name.endsWith(str)))) {
                    jSONObject2.put("thread_name", key.getName() + "(" + key.getId() + ")");
                    StackTraceElement[] value = entry.getValue();
                    if (value != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (StackTraceElement stackTraceElement : value) {
                            jSONArray2.put(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getLineNumber() + ")");
                        }
                        jSONObject2.put("thread_stack", jSONArray2);
                        if (jSONArray2.length() > 0) {
                        }
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("thread_stacks", jSONArray);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m114524s(Throwable th, int i) {
        th.getClass();
        String localizedMessage = th.getLocalizedMessage();
        try {
            m114515j(th.getClass().getName(), i);
            if (localizedMessage != null) {
                m114515j(": ", i);
                m114515j(localizedMessage, i);
            }
            m114515j(SignParameters.NEW_LINE, i);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: t */
    public static StackTraceElement[] m114525t(Throwable th) {
        ArrayList arrayList = new ArrayList();
        try {
            m114520o(th, arrayList);
        } catch (Throwable unused) {
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }

    /* JADX INFO: renamed from: u */
    private static void m114526u(Throwable th, int i) {
        if (th == null || i <= 0) {
            return;
        }
        m114524s(th, i);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            m114514i(stackTraceElement, i);
        }
        for (Throwable th2 : th.getSuppressed()) {
            m114517l(th2, i, "Suppressed: ", "\t");
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            m114517l(cause, i, "Caused by: ", "");
        }
    }

    /* JADX INFO: renamed from: v */
    private static boolean m114527v(String str) {
        Set<String> setM128909a = g4r0.m128909a();
        if (setM128909a.contains(str)) {
            return true;
        }
        for (String str2 : setM128909a) {
            if (!TextUtils.isEmpty(str) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m114528w(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            try {
                if (th instanceof OutOfMemoryError) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                th = th.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m114529x(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            try {
                if ((th instanceof OutOfMemoryError) && (th.getMessage().contains("allocate") || th.getMessage().contains("thrown"))) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                th = th.getCause();
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }
}
