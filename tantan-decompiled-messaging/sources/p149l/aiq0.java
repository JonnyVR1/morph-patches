package p149l;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.apm.lite.CrashType;
import com.apm.lite.nativecrash.NativeImpl;
import com.clevertap.android.sdk.Constants;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class aiq0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: l */
    private static aiq0 f70026l = null;

    /* JADX INFO: renamed from: m */
    private static volatile boolean f70027m = false;

    /* JADX INFO: renamed from: n */
    private static volatile ThreadLocal<Boolean> f70028n = new ThreadLocal<>();

    /* JADX INFO: renamed from: o */
    private static ArrayList<qlq0> f70029o = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    private Thread.UncaughtExceptionHandler f70030a;

    /* JADX INFO: renamed from: b */
    private cnq0 f70031b;

    /* JADX INFO: renamed from: c */
    private cnq0 f70032c;

    /* JADX INFO: renamed from: d */
    private volatile int f70033d = 0;

    /* JADX INFO: renamed from: e */
    private volatile int f70034e = 0;

    /* JADX INFO: renamed from: f */
    private ConcurrentHashMap<String, Object> f70035f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    private ConcurrentHashMap<String, Object> f70036g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h */
    private Stack<Thread.UncaughtExceptionHandler> f70037h = new Stack<>();

    /* JADX INFO: renamed from: i */
    private HashMap<Thread, Throwable> f70038i = new HashMap<>();

    /* JADX INFO: renamed from: j */
    private volatile int f70039j = 0;

    /* JADX INFO: renamed from: k */
    private Runnable f70040k = new RunnableC15636b();

    /* JADX INFO: renamed from: l.aiq0$a */
    public class C15635a extends brq0.C15948a {

        /* JADX INFO: renamed from: a */
        boolean f70041a = false;

        public C15635a() {
        }

        @Override // p149l.brq0.C15948a
        /* JADX INFO: renamed from: a */
        public boolean mo96920a(String str) {
            if (!this.f70041a && str.contains("android.os.Looper.loop")) {
                this.f70041a = true;
            }
            return !this.f70041a;
        }
    }

    /* JADX INFO: renamed from: l.aiq0$b */
    public class RunnableC15636b implements Runnable {
        public RunnableC15636b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            kwq0.m147628a("Recheck uncaught exception handler.");
            if (aiq0.this.f70039j < 3) {
                aiq0.m96900k(aiq0.this);
                aiq0.this.m96909v();
                wvq0.m205758b().m151993f(aiq0.this.f70040k, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
            }
        }
    }

    private aiq0() {
        m96909v();
        if (mu40.m156372a().m143411o()) {
            m96914f(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m96894a(Throwable th, Thread thread) {
        int iM175500a = 0;
        for (int i = 0; i < f70029o.size(); i++) {
            try {
                try {
                    iM175500a |= f70029o.get(i).m175500a(th, thread);
                } catch (Throwable th2) {
                    jnq0.m142383a();
                    jnq0.m142384b("NPTH_CATCH", th2);
                }
            } catch (Throwable unused) {
            }
        }
        return iM175500a;
    }

    /* JADX INFO: renamed from: c */
    private String m96896c(File file, boolean z, Throwable th, String str, Thread thread, boolean z2) {
        String absolutePath = file.getAbsolutePath();
        this.f70036g.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.m5157e(absolutePath);
        } catch (Throwable unused) {
        }
        String strM211360c = null;
        if (z2) {
            int iM5169q = NativeImpl.m5169q(absolutePath);
            if (iM5169q > 0) {
                try {
                    NativeImpl.m5178z(iM5169q, giq0.m126397l(hrq0.m132700i()));
                    NativeImpl.m5178z(iM5169q, SignParameters.NEW_LINE);
                    NativeImpl.m5178z(iM5169q, th.getMessage());
                    NativeImpl.m5178z(iM5169q, SignParameters.NEW_LINE);
                    NativeImpl.m5178z(iM5169q, th.getClass().getName());
                    if (th.getMessage() != null) {
                        NativeImpl.m5178z(iM5169q, ": ");
                        NativeImpl.m5178z(iM5169q, th.getMessage());
                    }
                    NativeImpl.m5178z(iM5169q, SignParameters.NEW_LINE);
                    NativeImpl.m5178z(iM5169q, thread.getName());
                    NativeImpl.m5178z(iM5169q, SignParameters.NEW_LINE);
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.m5178z(iM5169q, "stack:");
                    NativeImpl.m5178z(iM5169q, SignParameters.NEW_LINE);
                } catch (Throwable unused3) {
                }
                xwq0.m211368k(th, iM5169q);
                NativeImpl.m5154b(iM5169q);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                if (owq0.m166427c(32768)) {
                    throw new RuntimeException("test exception before write stack");
                }
                fileOutputStream.write((giq0.m126397l(hrq0.m132700i()) + SignParameters.NEW_LINE).getBytes());
                fileOutputStream.write((th.getMessage() + SignParameters.NEW_LINE).getBytes());
                fileOutputStream.write((th + SignParameters.NEW_LINE).getBytes());
                fileOutputStream.write((thread.getName() + SignParameters.NEW_LINE).getBytes());
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused4) {
                }
                try {
                    if (owq0.m166427c(8192)) {
                        throw new RuntimeException("test exception npth write stack");
                    }
                    strM211360c = xwq0.m211360c(th, thread, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new C15635a() : new brq0.C15948a());
                    gvq0.m128290a(fileOutputStream);
                    gvq0.m128290a(fileOutputStream);
                } catch (Throwable th2) {
                    try {
                        if (owq0.m166427c(16384)) {
                            throw new RuntimeException("test exception system write stack");
                        }
                        th.printStackTrace(new PrintStream(fileOutputStream));
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th2 + SignParameters.NEW_LINE).getBytes());
                            fileOutputStream.write((th3 + SignParameters.NEW_LINE).getBytes());
                        } catch (Throwable unused5) {
                        }
                    }
                }
            } catch (Throwable unused6) {
            }
        }
        return strM211360c;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a5 A[Catch: all -> 0x01cf, TryCatch #12 {all -> 0x01cf, blocks: (B:100:0x01a1, B:102:0x01a5, B:104:0x01ab), top: B:206:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:146:0x0238 A[Catch: all -> 0x023c, TRY_LEAVE, TryCatch #20 {all -> 0x023c, blocks: (B:144:0x0232, B:146:0x0238), top: B:222:0x0232 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0240  */
    /* JADX WARN: Code duplicated, block: B:152:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x024c  */
    /* JADX WARN: Code duplicated, block: B:194:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:218:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x024d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x013e A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #17 {, blocks: (B:73:0x012e, B:78:0x013e, B:88:0x016b, B:92:0x0179), top: B:216:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0141 A[Catch: all -> 0x020c, TRY_ENTER, TryCatch #10 {all -> 0x020c, blocks: (B:71:0x0128, B:81:0x0143, B:80:0x0141), top: B:202:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0191  */
    /* JADX INFO: renamed from: d */
    private Throwable m96897d(Thread thread, Throwable th) {
        boolean zM211380w;
        boolean z;
        boolean z2;
        Throwable th2;
        boolean zM96913z;
        CrashType crashType;
        boolean z3;
        aiq0 aiq0Var;
        CrashType crashType2;
        boolean zM96904q;
        cnq0 cnq0Var;
        aiq0 aiq0Var2;
        long j;
        cnq0 cnq0Var2;
        boolean z4;
        aiq0 aiq0Var3 = this;
        thread = thread;
        Throwable th3 = th;
        if (aiq0Var3.f70033d >= 3 && !owq0.m166427c(65536)) {
            return null;
        }
        if (aiq0Var3.f70038i.remove(thread) == th3) {
            kwq0.m147628a("Jump this uncaught exception.");
            m96910w(thread, th);
            return null;
        }
        aiq0Var3.f70038i.put(thread, th3);
        aiq0Var3.f70033d++;
        aiq0Var3.f70034e++;
        if (f70027m) {
            f70028n.set(Boolean.TRUE);
        }
        f70027m = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zM96903o = m96903o(jCurrentTimeMillis);
        boolean z5 = false;
        try {
            zM211380w = xwq0.m211380w(th3);
            if (zM211380w) {
                try {
                    if (xwq0.m211381x(th3)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } catch (Throwable unused) {
                    z = false;
                }
            } else {
                z4 = false;
            }
            z = z4;
        } catch (Throwable unused2) {
            zM211380w = false;
        }
        try {
            if (zM96903o) {
                try {
                    crashType = CrashType.LAUNCH;
                } catch (Throwable th4) {
                    th = th4;
                    z2 = z;
                    zM96903o = zM96903o;
                    th2 = null;
                    jCurrentTimeMillis = jCurrentTimeMillis;
                    zM96913z = false;
                    try {
                        if (!xwq0.m211380w(th)) {
                            kwq0.m147633f(th);
                        }
                        if (!z5) {
                            synchronized (this) {
                                aiq0Var3.f70034e--;
                                aiq0Var3.f70033d--;
                                return m96901l(th3, thread);
                            }
                        }
                        if (z2) {
                            aiq0Var3.m96899h(thread, th3, zM96903o, jCurrentTimeMillis);
                        }
                        aiq0Var3.m96912y();
                        aiq0Var3.m96911x();
                        m96905r(thread, th);
                        return th2;
                    } catch (Throwable th5) {
                        if (z5) {
                            synchronized (this) {
                                aiq0Var3.f70034e--;
                                aiq0Var3.f70033d--;
                                return m96901l(th3, thread);
                            }
                        }
                        if (z2 && !zM96913z) {
                            try {
                                aiq0Var3.m96899h(thread, th3, zM96903o, jCurrentTimeMillis);
                            } catch (Throwable unused3) {
                                throw th5;
                            }
                        }
                        aiq0Var3.m96912y();
                        aiq0Var3.m96911x();
                        m96905r(thread, th);
                        throw th5;
                    }
                }
            } else {
                try {
                    crashType = CrashType.JAVA;
                } catch (Throwable th6) {
                    th = th6;
                    z2 = z;
                    th2 = null;
                    z5 = false;
                    zM96913z = false;
                    if (!xwq0.m211380w(th)) {
                        kwq0.m147633f(th);
                    }
                    if (!z5) {
                        synchronized (this) {
                            aiq0Var3.f70034e--;
                            aiq0Var3.f70033d--;
                            return m96901l(th3, thread);
                        }
                    }
                    if (z2) {
                        aiq0Var3.m96899h(thread, th3, zM96903o, jCurrentTimeMillis);
                    }
                    aiq0Var3.m96912y();
                    aiq0Var3.m96911x();
                    m96905r(thread, th);
                    return th2;
                }
            }
            String strM132692a = hrq0.m132692a(jCurrentTimeMillis, crashType, zM211380w, false);
            th2 = null;
            try {
                File file = new File(dwq0.m113914b(hrq0.m132700i()), strM132692a);
                try {
                    File file2 = new File(file, "logEventStack");
                    boolean z6 = zM211380w;
                    try {
                        String strM96896c = aiq0Var3.m96896c(file2, z6, th3, strM132692a, thread, z);
                        z2 = z;
                        try {
                            boolean z7 = (m96894a(th3, thread) & 1) != 0 || (strM96896c != null && hrq0.m132702k().m143407k(strM96896c));
                            try {
                                if (plq0.m170247f(th3, thread, file) == null || z7) {
                                    try {
                                        strM132692a = hrq0.m132692a(jCurrentTimeMillis, zM96903o != 0 ? CrashType.LAUNCH : CrashType.JAVA, z6, true);
                                        File file3 = new File(dwq0.m113914b(hrq0.m132700i()), strM132692a);
                                        file.renameTo(file3);
                                        file2 = new File(file3, "logEventStack");
                                    } catch (Throwable th7) {
                                        th = th7;
                                        aiq0Var3 = this;
                                        thread = thread;
                                        th3 = th3;
                                        zM96903o = zM96903o;
                                        z5 = z7;
                                        zM96913z = false;
                                        if (!xwq0.m211380w(th)) {
                                            kwq0.m147633f(th);
                                        }
                                        if (!z5) {
                                            synchronized (this) {
                                                aiq0Var3.f70034e--;
                                                aiq0Var3.f70033d--;
                                                return m96901l(th3, thread);
                                            }
                                        }
                                        if (z2) {
                                            aiq0Var3.m96899h(thread, th3, zM96903o, jCurrentTimeMillis);
                                        }
                                        aiq0Var3.m96912y();
                                        aiq0Var3.m96911x();
                                        m96905r(thread, th);
                                        return th2;
                                    }
                                }
                                File file4 = file2;
                                String str = strM132692a;
                                jsq0.m143056b();
                                alq0.m97416a().m97439m();
                                zM96913z = m96913z();
                                if (z2 && zM96913z) {
                                    aiq0Var3 = this;
                                    th3 = th3;
                                    zM96903o = zM96903o;
                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                    try {
                                        aiq0Var3.m96899h(thread, th3, zM96903o, jCurrentTimeMillis);
                                        aiq0Var = aiq0Var3;
                                        z3 = zM96903o;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        z5 = z7;
                                        if (!xwq0.m211380w(th)) {
                                            kwq0.m147633f(th);
                                        }
                                        if (!z5) {
                                            synchronized (this) {
                                                aiq0Var3.f70034e--;
                                                aiq0Var3.f70033d--;
                                                return m96901l(th3, thread);
                                            }
                                        }
                                        if (z2) {
                                            aiq0Var3.m96899h(thread, th3, zM96903o, jCurrentTimeMillis);
                                        }
                                        aiq0Var3.m96912y();
                                        aiq0Var3.m96911x();
                                        m96905r(thread, th);
                                        return th2;
                                    }
                                } else {
                                    z3 = zM96903o;
                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                    aiq0Var = this;
                                    th3 = th3;
                                }
                                try {
                                    if (owq0.m166427c(1)) {
                                        aiq0Var.f70036g.clear();
                                        if (z3) {
                                            crashType2 = CrashType.LAUNCH;
                                        } else {
                                            crashType2 = CrashType.JAVA;
                                        }
                                        kwq0.m147628a("[uncaughtException] isLaunchCrash=" + z3);
                                        wiq0.m203345a().m203346b(crashType2, jCurrentTimeMillis, str);
                                        zM96904q = m96904q(thread, th);
                                        if (zM96904q) {
                                            try {
                                                cnq0Var = aiq0Var.f70031b;
                                                if (cnq0Var == null && z3 && cnq0Var.mo107824a(th3)) {
                                                    Throwable th9 = th3;
                                                    long j2 = jCurrentTimeMillis;
                                                    try {
                                                        aiq0Var.f70031b.mo107823a(j2, thread, th9, str, file4, strM96896c, z7);
                                                        jCurrentTimeMillis = j2;
                                                        th3 = th9;
                                                        kwq0.m147628a("[uncaughtException] mLaunchCrashDisposer " + th3.toString());
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        jCurrentTimeMillis = j2;
                                                        th3 = th9;
                                                        z5 = z7;
                                                        aiq0Var3 = aiq0Var;
                                                        zM96903o = z3;
                                                        if (!xwq0.m211380w(th)) {
                                                            kwq0.m147633f(th);
                                                        }
                                                        if (!z5) {
                                                            synchronized (this) {
                                                                aiq0Var3.f70034e--;
                                                                aiq0Var3.f70033d--;
                                                                return m96901l(th3, thread);
                                                            }
                                                        }
                                                        if (z2) {
                                                            aiq0Var3.m96899h(thread, th3, zM96903o, jCurrentTimeMillis);
                                                        }
                                                        aiq0Var3.m96912y();
                                                    }
                                                } else {
                                                    j = jCurrentTimeMillis;
                                                    if (zM96904q) {
                                                        try {
                                                            cnq0Var2 = aiq0Var.f70032c;
                                                            if (cnq0Var2 == null && cnq0Var2.mo107824a(th3)) {
                                                                aiq0Var.f70032c.mo107823a(j, thread, th3, str, file4, strM96896c, z7);
                                                                jCurrentTimeMillis = j;
                                                                try {
                                                                    kwq0.m147628a("[uncaughtException] mLaunchCrashDisposer " + th.toString());
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    th3 = th;
                                                                    z5 = z7;
                                                                    aiq0Var3 = aiq0Var;
                                                                    zM96903o = z3;
                                                                    if (!xwq0.m211380w(th)) {
                                                                        kwq0.m147633f(th);
                                                                    }
                                                                    if (!z5) {
                                                                        synchronized (this) {
                                                                            aiq0Var3.f70034e--;
                                                                            aiq0Var3.f70033d--;
                                                                        }
                                                                        return m96901l(th3, thread);
                                                                    }
                                                                    if (z2 && !zM96913z) {
                                                                        aiq0Var3.m96899h(thread, th3, zM96903o, jCurrentTimeMillis);
                                                                    }
                                                                    aiq0Var3.m96912y();
                                                                }
                                                            } else {
                                                                jCurrentTimeMillis = j;
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                            jCurrentTimeMillis = j;
                                                        }
                                                    } else {
                                                        jCurrentTimeMillis = j;
                                                    }
                                                }
                                            } catch (Throwable th13) {
                                                th = th13;
                                                z5 = z7;
                                                aiq0Var3 = aiq0Var;
                                                zM96903o = z3;
                                                thread = thread;
                                                if (!xwq0.m211380w(th)) {
                                                    kwq0.m147633f(th);
                                                }
                                                if (!z5) {
                                                    synchronized (this) {
                                                        aiq0Var3.f70034e--;
                                                        aiq0Var3.f70033d--;
                                                        return m96901l(th3, thread);
                                                    }
                                                }
                                                if (z2) {
                                                    aiq0Var3.m96899h(thread, th3, zM96903o, jCurrentTimeMillis);
                                                }
                                                aiq0Var3.m96912y();
                                            }
                                        } else {
                                            j = jCurrentTimeMillis;
                                            if (zM96904q) {
                                                cnq0Var2 = aiq0Var.f70032c;
                                                if (cnq0Var2 == null) {
                                                    jCurrentTimeMillis = j;
                                                } else {
                                                    jCurrentTimeMillis = j;
                                                }
                                            } else {
                                                jCurrentTimeMillis = j;
                                            }
                                        }
                                        if (!z7) {
                                            aiq0Var2 = aiq0Var;
                                            synchronized (this) {
                                                aiq0Var2.f70034e--;
                                                aiq0Var2.f70033d--;
                                            }
                                            return m96901l(th, thread);
                                        }
                                        if (z2 || zM96913z) {
                                            aiq0Var3 = aiq0Var;
                                        } else {
                                            aiq0Var3 = aiq0Var;
                                            aiq0Var3.m96899h(thread, th, z3, jCurrentTimeMillis);
                                        }
                                        aiq0Var3.m96912y();
                                        aiq0Var3.m96911x();
                                        m96905r(thread, th);
                                    } else {
                                        if (z3) {
                                            crashType2 = CrashType.LAUNCH;
                                        } else {
                                            crashType2 = CrashType.JAVA;
                                        }
                                        kwq0.m147628a("[uncaughtException] isLaunchCrash=" + z3);
                                        wiq0.m203345a().m203346b(crashType2, jCurrentTimeMillis, str);
                                        zM96904q = m96904q(thread, th);
                                        if (zM96904q) {
                                            cnq0Var = aiq0Var.f70031b;
                                            if (cnq0Var == null) {
                                                j = jCurrentTimeMillis;
                                                if (zM96904q) {
                                                    cnq0Var2 = aiq0Var.f70032c;
                                                    if (cnq0Var2 == null) {
                                                        jCurrentTimeMillis = j;
                                                    } else {
                                                        jCurrentTimeMillis = j;
                                                    }
                                                } else {
                                                    jCurrentTimeMillis = j;
                                                }
                                            } else {
                                                j = jCurrentTimeMillis;
                                                if (zM96904q) {
                                                    cnq0Var2 = aiq0Var.f70032c;
                                                    if (cnq0Var2 == null) {
                                                        jCurrentTimeMillis = j;
                                                    } else {
                                                        jCurrentTimeMillis = j;
                                                    }
                                                } else {
                                                    jCurrentTimeMillis = j;
                                                }
                                            }
                                        } else {
                                            j = jCurrentTimeMillis;
                                            if (zM96904q) {
                                                cnq0Var2 = aiq0Var.f70032c;
                                                if (cnq0Var2 == null) {
                                                    jCurrentTimeMillis = j;
                                                } else {
                                                    jCurrentTimeMillis = j;
                                                }
                                            } else {
                                                jCurrentTimeMillis = j;
                                            }
                                        }
                                        if (!z7) {
                                            aiq0Var2 = aiq0Var;
                                            synchronized (this) {
                                                aiq0Var2.f70034e--;
                                                aiq0Var2.f70033d--;
                                                return m96901l(th, thread);
                                            }
                                        }
                                        if (z2) {
                                            aiq0Var3 = aiq0Var;
                                        } else {
                                            aiq0Var3 = aiq0Var;
                                        }
                                        aiq0Var3.m96912y();
                                        aiq0Var3.m96911x();
                                        m96905r(thread, th);
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    aiq0Var3 = aiq0Var;
                                    zM96903o = z3;
                                    z5 = z7;
                                    if (!xwq0.m211380w(th)) {
                                        kwq0.m147633f(th);
                                    }
                                    if (!z5) {
                                        synchronized (this) {
                                            aiq0Var3.f70034e--;
                                            aiq0Var3.f70033d--;
                                            return m96901l(th3, thread);
                                        }
                                    }
                                    if (z2) {
                                        aiq0Var3.m96899h(thread, th3, zM96903o, jCurrentTimeMillis);
                                    }
                                    aiq0Var3.m96912y();
                                    aiq0Var3.m96911x();
                                    m96905r(thread, th);
                                    return th2;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                aiq0Var3 = this;
                                thread = thread;
                                th3 = th3;
                                zM96903o = zM96903o;
                                z5 = z7;
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            aiq0Var3 = this;
                            thread = thread;
                            th3 = th3;
                            z5 = false;
                            zM96913z = false;
                            if (!xwq0.m211380w(th)) {
                                kwq0.m147633f(th);
                            }
                            if (!z5) {
                                synchronized (this) {
                                    aiq0Var3.f70034e--;
                                    aiq0Var3.f70033d--;
                                    return m96901l(th3, thread);
                                }
                            }
                            if (z2) {
                                aiq0Var3.m96899h(thread, th3, zM96903o, jCurrentTimeMillis);
                            }
                            aiq0Var3.m96912y();
                            aiq0Var3.m96911x();
                            m96905r(thread, th);
                            return th2;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        th3 = th3;
                        thread = thread;
                        z2 = z;
                        z5 = false;
                        zM96913z = false;
                        if (!xwq0.m211380w(th)) {
                            kwq0.m147633f(th);
                        }
                        if (!z5) {
                            synchronized (this) {
                                aiq0Var3.f70034e--;
                                aiq0Var3.f70033d--;
                                return m96901l(th3, thread);
                            }
                        }
                        if (z2) {
                            aiq0Var3.m96899h(thread, th3, zM96903o, jCurrentTimeMillis);
                        }
                        aiq0Var3.m96912y();
                        aiq0Var3.m96911x();
                        m96905r(thread, th);
                        return th2;
                    }
                } catch (Throwable th18) {
                    th = th18;
                    thread = thread;
                }
            } catch (Throwable th19) {
                th = th19;
            }
        } catch (Throwable unused4) {
        }
        return th2;
    }

    /* JADX INFO: renamed from: e */
    public static aiq0 m96898e() {
        if (f70026l == null) {
            f70026l = new aiq0();
        }
        return f70026l;
    }

    /* JADX INFO: renamed from: h */
    private void m96899h(Thread thread, Throwable th, boolean z, long j) {
        List<myl> listM137159a = mvq0.m156578a().m137159a();
        CrashType crashType = z ? CrashType.LAUNCH : CrashType.JAVA;
        Iterator<myl> it = listM137159a.iterator();
        while (it.hasNext()) {
            Thread thread2 = thread;
            Throwable th2 = th;
            long j2 = j;
            try {
                it.next().m157089a(crashType, th2, thread2, j2);
            } catch (Throwable th3) {
                kwq0.m147634g(th3);
            }
            th = th2;
            thread = thread2;
            j = j2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m96900k(aiq0 aiq0Var) {
        int i = aiq0Var.f70039j;
        aiq0Var.f70039j = i + 1;
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021 A[Catch: all -> 0x0025, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0011, B:10:0x0021), top: B:17:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: l */
    private static Throwable m96901l(Throwable th, Thread thread) {
        for (int i = 0; i < f70029o.size(); i++) {
            try {
                try {
                    f70029o.get(i).m175501b(th, thread);
                } catch (Throwable th2) {
                    return th2;
                }
            } catch (Throwable unused) {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    return null;
                }
                Looper.loop();
                return null;
            }
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return null;
        }
        Looper.loop();
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m96902n() {
        return f70027m;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m96903o(long j) {
        return arq0.m98549a(j);
    }

    /* JADX INFO: renamed from: q */
    private boolean m96904q(Thread thread, Throwable th) {
        hrq0.m132695d().m154750d();
        return true;
    }

    /* JADX INFO: renamed from: r */
    private void m96905r(Thread thread, Throwable th) {
        if (owq0.m166427c(512)) {
            return;
        }
        m96910w(thread, th);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m96907t() {
        Boolean bool = f70028n.get();
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m96909v() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            if (defaultUncaughtExceptionHandler != null) {
                kwq0.m147628a("Put this uncaught exception handler to stack. ".concat(defaultUncaughtExceptionHandler.getClass().getName()));
                this.f70037h.push(defaultUncaughtExceptionHandler);
            }
            this.f70030a = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* JADX INFO: renamed from: w */
    private void m96910w(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandlerPop;
        try {
            if (!this.f70037h.isEmpty() && (uncaughtExceptionHandlerPop = this.f70037h.pop()) != null) {
                this.f70030a = uncaughtExceptionHandlerPop;
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f70030a;
            if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
                kwq0.m147628a("mDefaultHandler != null, call mDefaultHandler.");
                this.f70030a.uncaughtException(thread, th);
                return;
            }
        } catch (Throwable unused) {
        }
        kwq0.m147628a("Uncaught exception handler null, kill process.");
        Process.killProcess(Process.myPid());
    }

    /* JADX INFO: renamed from: x */
    private void m96911x() {
        synchronized (this) {
            this.f70034e--;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (this.f70034e != 0 && SystemClock.uptimeMillis() - jUptimeMillis < 10000) {
            SystemClock.sleep(50L);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m96912y() {
        File fileM113914b = dwq0.m113914b(hrq0.m132700i());
        File fileM113913a = dwq0.m113913a();
        if (luq0.m151810x(fileM113914b) && luq0.m151810x(fileM113913a)) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (!buq0.m103991c() && SystemClock.uptimeMillis() - jUptimeMillis < 10000) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: z */
    private boolean m96913z() {
        return iiq0.m136427b("exception_modules", "oom_callback") == 1;
    }

    /* JADX INFO: renamed from: f */
    public void m96914f(long j) {
        wvq0.m205758b().m151995j(this.f70040k);
        wvq0.m205758b().m151993f(this.f70040k, j);
    }

    /* JADX INFO: renamed from: g */
    public void m96915g(String str) {
        this.f70035f.put(str, new Object());
    }

    /* JADX INFO: renamed from: i */
    public void m96916i(Thread thread, Throwable th, boolean z, bjq0 bjq0Var) {
        List<gpl> listM137161c;
        CrashType crashType;
        inq0 inq0VarM156578a = mvq0.m156578a();
        if (z) {
            listM137161c = inq0VarM156578a.m137160b();
            crashType = CrashType.LAUNCH;
        } else {
            listM137161c = inq0VarM156578a.m137161c();
            crashType = CrashType.JAVA;
        }
        for (gpl gplVar : listM137161c) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                gplVar.m127358a(crashType, xwq0.m211359b(th), thread);
                bjq0Var.m102219q("callback_cost_" + gplVar.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            } catch (Throwable th2) {
                kwq0.m147634g(th2);
                bjq0Var.m102219q("callback_err_".concat(gplVar.getClass().getName()), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m96917j(cnq0 cnq0Var) {
        this.f70031b = cnq0Var;
    }

    /* JADX INFO: renamed from: m */
    public void m96918m(cnq0 cnq0Var) {
        this.f70032c = cnq0Var;
    }

    /* JADX INFO: renamed from: p */
    public boolean m96919p(String str) {
        return this.f70035f.containsKey(str);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        do {
            th = m96897d(thread, th);
        } while (th != null);
    }
}
