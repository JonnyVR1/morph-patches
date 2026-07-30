package com.tantanapp.beatles.thread;

import android.os.Process;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
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
import p153l.d7m;
import p153l.du2;
import p153l.f610;
import p153l.fq80;
import p153l.gxi0;
import p153l.kxi0;
import p153l.m1m;
import p153l.mxi0;
import p153l.p8c;
import p153l.sxi0;
import p153l.u21;
import p153l.uu2;
import p153l.vrf;

/* JADX INFO: renamed from: com.tantanapp.beatles.thread.a */
/* JADX INFO: loaded from: classes11.dex */
public class C13725a {

    /* JADX INFO: renamed from: a */
    public static boolean f56835a;

    /* JADX INFO: renamed from: b */
    public static gxi0 f56836b;

    /* JADX INFO: renamed from: f */
    public static volatile int f56840f;

    /* JADX INFO: renamed from: c */
    public static final long f56837c = Process.myPid();

    /* JADX INFO: renamed from: d */
    public static int f56838d = 0;

    /* JADX INFO: renamed from: e */
    public static int f56839e = -1;

    /* JADX INFO: renamed from: g */
    public static Runnable f56841g = new a();

    /* JADX INFO: renamed from: com.tantanapp.beatles.thread.a$a */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (C13725a.m82388p()) {
                int iM82382j = C13725a.m82382j();
                if (C13725a.m82389q(iM82382j)) {
                    C13725a.m82379g(iM82382j, null);
                }
                u21.m194239c(this, C13725a.f56836b.m132868b());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m82378f(InputStream inputStream) throws Throwable {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        m1m.m156698a(bufferedReader2);
                        return sb.toString();
                    }
                    sb.append(line);
                    sb.append('\n');
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    m1m.m156698a(bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m82379g(int i, String str) throws Throwable {
        ThreadException threadException;
        List<sxi0> listM82384l = m82384l(f56836b.m132867a());
        HashMap map = new HashMap();
        for (sxi0 sxi0Var : listM82384l) {
            mxi0 mxi0Var = (mxi0) map.get(sxi0Var.f171140a);
            if (mxi0Var == null) {
                mxi0Var = new mxi0(sxi0Var.f171140a);
                map.put(sxi0Var.f171140a, mxi0Var);
            }
            mxi0Var.f139253b.add(sxi0Var);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectM151829a = kxi0.m151828b().m151829a();
        vrf vrfVar = new vrf();
        for (Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), ((mxi0) entry.getValue()).toString());
            } catch (JSONException unused) {
            }
        }
        vrfVar.m202494e("all_process_thread", jSONObject);
        vrfVar.m202494e("all_java_thread", jSONObjectM151829a);
        StringBuilder sb = new StringBuilder();
        int iOptInt = jSONObjectM151829a.optInt("most_thread_count", 0);
        if (TextUtils.isEmpty(str)) {
            sb.append("There are " + i + " Threads!");
        } else {
            sb.append("Tag: " + str + " There are " + i + " Threads!");
        }
        StackTraceElement[] stackTraceElementArrM151830c = kxi0.m151828b().m151830c();
        if (iOptInt <= 0 || stackTraceElementArrM151830c == null) {
            threadException = null;
        } else {
            threadException = new ThreadException("most thread count:" + iOptInt);
            threadException.setStackTrace(stackTraceElementArrM151830c);
        }
        m82385m(threadException != null ? new ThreadException(sb.toString(), threadException) : new ThreadException(sb.toString()), vrfVar);
        m82390r();
    }

    /* JADX INFO: renamed from: h */
    public static int m82380h(String str) {
        String[] strArrSplit = str.split("_");
        String str2 = strArrSplit[0];
        if (strArrSplit.length != 2) {
            return 0;
        }
        try {
            if (p8c.m171236g(str2)) {
                return Integer.valueOf(strArrSplit[1]).intValue();
            }
            return 0;
        } catch (NumberFormatException unused) {
            return 100;
        }
    }

    /* JADX INFO: renamed from: i */
    public static long m82381i(long j) throws Throwable {
        try {
            String strM82383k = m82383k(String.format("/proc/%s/task/%s/schedstat", Integer.valueOf(Process.myPid()), Long.valueOf(j)));
            if (strM82383k == null) {
                return -1L;
            }
            return Long.parseLong(strM82383k.replaceAll(SignParameters.NEW_LINE, "").split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)[2]);
        } catch (Exception unused) {
            return -2L;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m82382j() {
        try {
            String[] strArrSplit = m82383k(String.format("/proc/%s/status", Integer.valueOf(Process.myPid()))).trim().split(SignParameters.NEW_LINE);
            for (String str : strArrSplit) {
                if (str.startsWith("Threads")) {
                    Matcher matcher = Pattern.compile("\\d+").matcher(str);
                    if (matcher.find()) {
                        f56840f = Integer.parseInt(matcher.group());
                        return f56840f;
                    }
                }
            }
            f56840f = Integer.parseInt(strArrSplit[24].trim());
            return f56840f;
        } catch (Exception e) {
            e.printStackTrace();
            f56840f = 0;
            return f56840f;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m82383k(String str) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = new FileInputStream(new File(str));
            try {
                String strM82378f = m82378f(fileInputStream);
                m1m.m156698a(fileInputStream);
                return strM82378f;
            } catch (Throwable th2) {
                th = th2;
                m1m.m156698a(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    /* JADX INFO: renamed from: l */
    public static List<sxi0> m82384l(d7m d7mVar) throws Throwable {
        LinkedList linkedList = new LinkedList();
        String str = String.format("/proc/%s/task/", Integer.valueOf(Process.myPid()));
        File file = new File(str);
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                try {
                    String strM82383k = m82383k(str + file2.getName() + "/stat");
                    if (strM82383k != null) {
                        String[] strArrSplit = strM82383k.replaceAll(SignParameters.NEW_LINE, "").split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        sxi0 sxi0Var = new sxi0();
                        sxi0Var.f171141b = Long.parseLong(strArrSplit[0]);
                        sxi0Var.f171140a = strArrSplit[1].replace("(", "").replace(")", "");
                        sxi0Var.f171143d = strArrSplit[2].replace("'", "");
                        sxi0Var.f171144e = m82381i(sxi0Var.f171141b);
                        if (d7mVar != null && !d7mVar.mo114751a(sxi0Var)) {
                            linkedList.add(sxi0Var);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: m */
    public static void m82385m(Exception exc, vrf vrfVar) {
        MonitorEvent monitorEvent = new MonitorEvent("exception", "threadSize", exc);
        monitorEvent.setCrashThread(Thread.currentThread());
        uu2.m198147i(monitorEvent, vrfVar);
        kxi0.m151828b().m151833f();
    }

    /* JADX INFO: renamed from: n */
    public static void m82386n() {
        m82387o(new gxi0());
    }

    /* JADX INFO: renamed from: o */
    public static void m82387o(gxi0 gxi0Var) {
        if (f56835a) {
            return;
        }
        if (!uu2.m198142d()) {
            f610.m124264b("You should add ExceptionMonitor first!!!", new Object[0]);
            return;
        }
        if (gxi0Var == null) {
            gxi0Var = new gxi0();
        }
        f56836b = gxi0Var;
        f56838d = gxi0Var.m132870d();
        u21.m194239c(f56841g, gxi0Var.m132871e());
        f56835a = true;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m82388p() {
        if (f56839e == -1) {
            f56839e = m82380h(fq80.m126738a(du2.m118045e(), "thread_name", ""));
        }
        return f56839e < f56836b.m132869c();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m82389q(int i) {
        int i2 = f56838d;
        if (i >= i2) {
            f56838d = i2 + 25;
            return true;
        }
        if (i < f56836b.m132870d()) {
            f56838d = f56836b.m132870d();
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static void m82390r() {
        StringBuilder sb = new StringBuilder();
        sb.append(p8c.m171232c());
        sb.append("_");
        int i = f56839e + 1;
        f56839e = i;
        sb.append(i);
        fq80.m126739b(du2.m118045e(), "thread_name", sb.toString());
    }
}
