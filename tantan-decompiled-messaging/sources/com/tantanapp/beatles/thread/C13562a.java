package com.tantanapp.beatles.thread;

import android.os.Process;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ai80;
import p149l.eu2;
import p149l.foi0;
import p149l.j7c;
import p149l.joi0;
import p149l.koi0;
import p149l.n21;
import p149l.n4m;
import p149l.nt2;
import p149l.oqf;
import p149l.qoi0;
import p149l.ryl;
import p149l.vx00;

/* JADX INFO: renamed from: com.tantanapp.beatles.thread.a */
/* JADX INFO: loaded from: classes13.dex */
public class C13562a {

    /* JADX INFO: renamed from: a */
    public static boolean f55987a;

    /* JADX INFO: renamed from: b */
    public static foi0 f55988b;

    /* JADX INFO: renamed from: f */
    public static volatile int f55992f;

    /* JADX INFO: renamed from: c */
    public static final long f55989c = Process.myPid();

    /* JADX INFO: renamed from: d */
    public static int f55990d = 0;

    /* JADX INFO: renamed from: e */
    public static int f55991e = -1;

    /* JADX INFO: renamed from: g */
    public static Runnable f55993g = new a();

    /* JADX INFO: renamed from: com.tantanapp.beatles.thread.a$a */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (C13562a.m81205p()) {
                int iM81199j = C13562a.m81199j();
                if (C13562a.m81206q(iM81199j)) {
                    C13562a.m81196g(iM81199j, null);
                }
                n21.m157542c(this, C13562a.f55988b.m122454b());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m81195f(InputStream inputStream) throws Throwable {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        ryl.m181666a(bufferedReader2);
                        return sb.toString();
                    }
                    sb.append(line);
                    sb.append('\n');
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    ryl.m181666a(bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m81196g(int i, String str) throws Throwable {
        ThreadException threadException;
        List<qoi0> listM81201l = m81201l(f55988b.m122453a());
        HashMap map = new HashMap();
        for (qoi0 qoi0Var : listM81201l) {
            koi0 koi0Var = (koi0) map.get(qoi0Var.f155582a);
            if (koi0Var == null) {
                koi0Var = new koi0(qoi0Var.f155582a);
                map.put(qoi0Var.f155582a, koi0Var);
            }
            koi0Var.f124025b.add(qoi0Var);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectM142514a = joi0.m142513b().m142514a();
        oqf oqfVar = new oqf();
        for (Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), ((koi0) entry.getValue()).toString());
            } catch (JSONException unused) {
            }
        }
        oqfVar.m165426e("all_process_thread", jSONObject);
        oqfVar.m165426e("all_java_thread", jSONObjectM142514a);
        StringBuilder sb = new StringBuilder();
        int iOptInt = jSONObjectM142514a.optInt("most_thread_count", 0);
        if (TextUtils.isEmpty(str)) {
            sb.append("There are " + i + " Threads!");
        } else {
            sb.append("Tag: " + str + " There are " + i + " Threads!");
        }
        StackTraceElement[] stackTraceElementArrM142515c = joi0.m142513b().m142515c();
        if (iOptInt <= 0 || stackTraceElementArrM142515c == null) {
            threadException = null;
        } else {
            threadException = new ThreadException("most thread count:" + iOptInt);
            threadException.setStackTrace(stackTraceElementArrM142515c);
        }
        m81202m(threadException != null ? new ThreadException(sb.toString(), threadException) : new ThreadException(sb.toString()), oqfVar);
        m81207r();
    }

    /* JADX INFO: renamed from: h */
    public static int m81197h(String str) {
        String[] strArrSplit = str.split("_");
        String str2 = strArrSplit[0];
        if (strArrSplit.length != 2) {
            return 0;
        }
        try {
            if (j7c.m140088g(str2)) {
                return Integer.valueOf(strArrSplit[1]).intValue();
            }
            return 0;
        } catch (NumberFormatException unused) {
            return 100;
        }
    }

    /* JADX INFO: renamed from: i */
    public static long m81198i(long j) throws Throwable {
        try {
            String strM81200k = m81200k(String.format("/proc/%s/task/%s/schedstat", Integer.valueOf(Process.myPid()), Long.valueOf(j)));
            if (strM81200k == null) {
                return -1L;
            }
            return Long.parseLong(strM81200k.replaceAll(SignParameters.NEW_LINE, "").split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)[2]);
        } catch (Exception unused) {
            return -2L;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m81199j() {
        try {
            String[] strArrSplit = m81200k(String.format("/proc/%s/status", Integer.valueOf(Process.myPid()))).trim().split(SignParameters.NEW_LINE);
            for (String str : strArrSplit) {
                if (str.startsWith("Threads")) {
                    Matcher matcher = Pattern.compile("\\d+").matcher(str);
                    if (matcher.find()) {
                        f55992f = Integer.parseInt(matcher.group());
                        return f55992f;
                    }
                }
            }
            f55992f = Integer.parseInt(strArrSplit[24].trim());
            return f55992f;
        } catch (Exception e) {
            e.printStackTrace();
            f55992f = 0;
            return f55992f;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m81200k(String str) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = new FileInputStream(new File(str));
            try {
                String strM81195f = m81195f(fileInputStream);
                ryl.m181666a(fileInputStream);
                return strM81195f;
            } catch (Throwable th2) {
                th = th2;
                ryl.m181666a(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    /* JADX INFO: renamed from: l */
    public static List<qoi0> m81201l(n4m n4mVar) throws Throwable {
        LinkedList linkedList = new LinkedList();
        String str = String.format("/proc/%s/task/", Integer.valueOf(Process.myPid()));
        File file = new File(str);
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                try {
                    String strM81200k = m81200k(str + file2.getName() + "/stat");
                    if (strM81200k != null) {
                        String[] strArrSplit = strM81200k.replaceAll(SignParameters.NEW_LINE, "").split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        qoi0 qoi0Var = new qoi0();
                        qoi0Var.f155583b = Long.parseLong(strArrSplit[0]);
                        qoi0Var.f155582a = strArrSplit[1].replace("(", "").replace(")", "");
                        qoi0Var.f155585d = strArrSplit[2].replace("'", "");
                        qoi0Var.f155586e = m81198i(qoi0Var.f155583b);
                        if (n4mVar != null && !n4mVar.mo122458a(qoi0Var)) {
                            linkedList.add(qoi0Var);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: m */
    public static void m81202m(Exception exc, oqf oqfVar) {
        MonitorEvent monitorEvent = new MonitorEvent("exception", "threadSize", exc);
        monitorEvent.setCrashThread(Thread.currentThread());
        eu2.m118155i(monitorEvent, oqfVar);
        joi0.m142513b().m142518f();
    }

    /* JADX INFO: renamed from: n */
    public static void m81203n() {
        m81204o(new foi0());
    }

    /* JADX INFO: renamed from: o */
    public static void m81204o(foi0 foi0Var) {
        if (f55987a) {
            return;
        }
        if (!eu2.m118150d()) {
            vx00.m200472b("You should add ExceptionMonitor first!!!", new Object[0]);
            return;
        }
        if (foi0Var == null) {
            foi0Var = new foi0();
        }
        f55988b = foi0Var;
        f55990d = foi0Var.m122456d();
        n21.m157542c(f55993g, foi0Var.m122457e());
        f55987a = true;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m81205p() {
        if (f55991e == -1) {
            f55991e = m81197h(ai80.m96792a(nt2.m160814e(), "thread_name", ""));
        }
        return f55991e < f55988b.m122455c();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m81206q(int i) {
        int i2 = f55990d;
        if (i >= i2) {
            f55990d = i2 + 25;
            return true;
        }
        if (i < f55988b.m122456d()) {
            f55990d = f55988b.m122456d();
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static void m81207r() {
        StringBuilder sb = new StringBuilder();
        sb.append(j7c.m140084c());
        sb.append("_");
        int i = f55991e + 1;
        f55991e = i;
        sb.append(i);
        ai80.m96793b(nt2.m160814e(), "thread_name", sb.toString());
    }
}
