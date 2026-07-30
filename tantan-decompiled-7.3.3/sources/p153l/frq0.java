package p153l;

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
public class frq0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: l */
    private static frq0 f100454l = null;

    /* JADX INFO: renamed from: m */
    private static volatile boolean f100455m = false;

    /* JADX INFO: renamed from: n */
    private static volatile ThreadLocal<Boolean> f100456n = new ThreadLocal<>();

    /* JADX INFO: renamed from: o */
    private static ArrayList<wuq0> f100457o = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    private Thread.UncaughtExceptionHandler f100458a;

    /* JADX INFO: renamed from: b */
    private iwq0 f100459b;

    /* JADX INFO: renamed from: c */
    private iwq0 f100460c;

    /* JADX INFO: renamed from: d */
    private volatile int f100461d = 0;

    /* JADX INFO: renamed from: e */
    private volatile int f100462e = 0;

    /* JADX INFO: renamed from: f */
    private ConcurrentHashMap<String, Object> f100463f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    private ConcurrentHashMap<String, Object> f100464g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h */
    private Stack<Thread.UncaughtExceptionHandler> f100465h = new Stack<>();

    /* JADX INFO: renamed from: i */
    private HashMap<Thread, Throwable> f100466i = new HashMap<>();

    /* JADX INFO: renamed from: j */
    private volatile int f100467j = 0;

    /* JADX INFO: renamed from: k */
    private Runnable f100468k = new RunnableC17049b();

    /* JADX INFO: renamed from: l.frq0$a */
    public class C17048a extends h0r0.C17364a {

        /* JADX INFO: renamed from: a */
        boolean f100469a = false;

        public C17048a() {
        }

        @Override // p153l.h0r0.C17364a
        /* JADX INFO: renamed from: a */
        public boolean mo126977a(String str) {
            if (!this.f100469a && str.contains("android.os.Looper.loop")) {
                this.f100469a = true;
            }
            return !this.f100469a;
        }
    }

    /* JADX INFO: renamed from: l.frq0$b */
    public class RunnableC17049b implements Runnable {
        public RunnableC17049b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q5r0.m175511a("Recheck uncaught exception handler.");
            if (frq0.this.f100467j < 3) {
                frq0.m126957k(frq0.this);
                frq0.this.m126966v();
                c5r0.m108080b().m179946f(frq0.this.f100468k, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
            }
        }
    }

    private frq0() {
        m126966v();
        if (b350.m102269a().m169532o()) {
            m126971f(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m126951a(Throwable th, Thread thread) {
        int iM207973a = 0;
        for (int i = 0; i < f100457o.size(); i++) {
            try {
                try {
                    iM207973a |= f100457o.get(i).m207973a(th, thread);
                } catch (Throwable th2) {
                    pwq0.m174074a();
                    pwq0.m174075b("NPTH_CATCH", th2);
                }
            } catch (Throwable unused) {
            }
        }
        return iM207973a;
    }

    /* JADX INFO: renamed from: c */
    private String m126953c(File file, boolean z, Throwable th, String str, Thread thread, boolean z2) {
        String absolutePath = file.getAbsolutePath();
        this.f100464g.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.m5167e(absolutePath);
        } catch (Throwable unused) {
        }
        String strM114508c = null;
        if (z2) {
            int iM5179q = NativeImpl.m5179q(absolutePath);
            if (iM5179q > 0) {
                try {
                    NativeImpl.m5188z(iM5179q, lrq0.m155648l(n0r0.m161022i()));
                    NativeImpl.m5188z(iM5179q, SignParameters.NEW_LINE);
                    NativeImpl.m5188z(iM5179q, th.getMessage());
                    NativeImpl.m5188z(iM5179q, SignParameters.NEW_LINE);
                    NativeImpl.m5188z(iM5179q, th.getClass().getName());
                    if (th.getMessage() != null) {
                        NativeImpl.m5188z(iM5179q, ": ");
                        NativeImpl.m5188z(iM5179q, th.getMessage());
                    }
                    NativeImpl.m5188z(iM5179q, SignParameters.NEW_LINE);
                    NativeImpl.m5188z(iM5179q, thread.getName());
                    NativeImpl.m5188z(iM5179q, SignParameters.NEW_LINE);
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.m5188z(iM5179q, "stack:");
                    NativeImpl.m5188z(iM5179q, SignParameters.NEW_LINE);
                } catch (Throwable unused3) {
                }
                d6r0.m114516k(th, iM5179q);
                NativeImpl.m5164b(iM5179q);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                if (u5r0.m194619c(32768)) {
                    throw new RuntimeException("test exception before write stack");
                }
                fileOutputStream.write((lrq0.m155648l(n0r0.m161022i()) + SignParameters.NEW_LINE).getBytes());
                fileOutputStream.write((th.getMessage() + SignParameters.NEW_LINE).getBytes());
                fileOutputStream.write((th + SignParameters.NEW_LINE).getBytes());
                fileOutputStream.write((thread.getName() + SignParameters.NEW_LINE).getBytes());
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused4) {
                }
                try {
                    if (u5r0.m194619c(8192)) {
                        throw new RuntimeException("test exception npth write stack");
                    }
                    strM114508c = d6r0.m114508c(th, thread, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new C17048a() : new h0r0.C17364a());
                    m4r0.m157051a(fileOutputStream);
                    m4r0.m157051a(fileOutputStream);
                } catch (Throwable th2) {
                    try {
                        if (u5r0.m194619c(16384)) {
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
        return strM114508c;
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
    private Throwable m126954d(Thread thread, Throwable th) {
        boolean zM114528w;
        boolean z;
        boolean z2;
        Throwable th2;
        boolean zM126970z;
        CrashType crashType;
        boolean z3;
        frq0 frq0Var;
        CrashType crashType2;
        boolean zM126961q;
        iwq0 iwq0Var;
        frq0 frq0Var2;
        long j;
        iwq0 iwq0Var2;
        boolean z4;
        frq0 frq0Var3 = this;
        thread = thread;
        Throwable th3 = th;
        if (frq0Var3.f100461d >= 3 && !u5r0.m194619c(65536)) {
            return null;
        }
        if (frq0Var3.f100466i.remove(thread) == th3) {
            q5r0.m175511a("Jump this uncaught exception.");
            m126967w(thread, th);
            return null;
        }
        frq0Var3.f100466i.put(thread, th3);
        frq0Var3.f100461d++;
        frq0Var3.f100462e++;
        if (f100455m) {
            f100456n.set(Boolean.TRUE);
        }
        f100455m = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zM126960o = m126960o(jCurrentTimeMillis);
        boolean z5 = false;
        try {
            zM114528w = d6r0.m114528w(th3);
            if (zM114528w) {
                try {
                    if (d6r0.m114529x(th3)) {
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
            zM114528w = false;
        }
        try {
            if (zM126960o) {
                try {
                    crashType = CrashType.LAUNCH;
                } catch (Throwable th4) {
                    th = th4;
                    z2 = z;
                    zM126960o = zM126960o;
                    th2 = null;
                    jCurrentTimeMillis = jCurrentTimeMillis;
                    zM126970z = false;
                    try {
                        if (!d6r0.m114528w(th)) {
                            q5r0.m175516f(th);
                        }
                        if (!z5) {
                            synchronized (this) {
                                frq0Var3.f100462e--;
                                frq0Var3.f100461d--;
                                return m126958l(th3, thread);
                            }
                        }
                        if (z2) {
                            frq0Var3.m126956h(thread, th3, zM126960o, jCurrentTimeMillis);
                        }
                        frq0Var3.m126969y();
                        frq0Var3.m126968x();
                        m126962r(thread, th);
                        return th2;
                    } catch (Throwable th5) {
                        if (z5) {
                            synchronized (this) {
                                frq0Var3.f100462e--;
                                frq0Var3.f100461d--;
                                return m126958l(th3, thread);
                            }
                        }
                        if (z2 && !zM126970z) {
                            try {
                                frq0Var3.m126956h(thread, th3, zM126960o, jCurrentTimeMillis);
                            } catch (Throwable unused3) {
                                throw th5;
                            }
                        }
                        frq0Var3.m126969y();
                        frq0Var3.m126968x();
                        m126962r(thread, th);
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
                    zM126970z = false;
                    if (!d6r0.m114528w(th)) {
                        q5r0.m175516f(th);
                    }
                    if (!z5) {
                        synchronized (this) {
                            frq0Var3.f100462e--;
                            frq0Var3.f100461d--;
                            return m126958l(th3, thread);
                        }
                    }
                    if (z2) {
                        frq0Var3.m126956h(thread, th3, zM126960o, jCurrentTimeMillis);
                    }
                    frq0Var3.m126969y();
                    frq0Var3.m126968x();
                    m126962r(thread, th);
                    return th2;
                }
            }
            String strM161014a = n0r0.m161014a(jCurrentTimeMillis, crashType, zM114528w, false);
            th2 = null;
            try {
                File file = new File(j5r0.m143566b(n0r0.m161022i()), strM161014a);
                try {
                    File file2 = new File(file, "logEventStack");
                    boolean z6 = zM114528w;
                    try {
                        String strM126953c = frq0Var3.m126953c(file2, z6, th3, strM161014a, thread, z);
                        z2 = z;
                        try {
                            boolean z7 = (m126951a(th3, thread) & 1) != 0 || (strM126953c != null && n0r0.m161024k().m169528k(strM126953c));
                            try {
                                if (vuq0.m202882f(th3, thread, file) == null || z7) {
                                    try {
                                        strM161014a = n0r0.m161014a(jCurrentTimeMillis, zM126960o != 0 ? CrashType.LAUNCH : CrashType.JAVA, z6, true);
                                        File file3 = new File(j5r0.m143566b(n0r0.m161022i()), strM161014a);
                                        file.renameTo(file3);
                                        file2 = new File(file3, "logEventStack");
                                    } catch (Throwable th7) {
                                        th = th7;
                                        frq0Var3 = this;
                                        thread = thread;
                                        th3 = th3;
                                        zM126960o = zM126960o;
                                        z5 = z7;
                                        zM126970z = false;
                                        if (!d6r0.m114528w(th)) {
                                            q5r0.m175516f(th);
                                        }
                                        if (!z5) {
                                            synchronized (this) {
                                                frq0Var3.f100462e--;
                                                frq0Var3.f100461d--;
                                                return m126958l(th3, thread);
                                            }
                                        }
                                        if (z2) {
                                            frq0Var3.m126956h(thread, th3, zM126960o, jCurrentTimeMillis);
                                        }
                                        frq0Var3.m126969y();
                                        frq0Var3.m126968x();
                                        m126962r(thread, th);
                                        return th2;
                                    }
                                }
                                File file4 = file2;
                                String str = strM161014a;
                                p1r0.m170260b();
                                guq0.m132359a().m132382m();
                                zM126970z = m126970z();
                                if (z2 && zM126970z) {
                                    frq0Var3 = this;
                                    th3 = th3;
                                    zM126960o = zM126960o;
                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                    try {
                                        frq0Var3.m126956h(thread, th3, zM126960o, jCurrentTimeMillis);
                                        frq0Var = frq0Var3;
                                        z3 = zM126960o;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        z5 = z7;
                                        if (!d6r0.m114528w(th)) {
                                            q5r0.m175516f(th);
                                        }
                                        if (!z5) {
                                            synchronized (this) {
                                                frq0Var3.f100462e--;
                                                frq0Var3.f100461d--;
                                                return m126958l(th3, thread);
                                            }
                                        }
                                        if (z2) {
                                            frq0Var3.m126956h(thread, th3, zM126960o, jCurrentTimeMillis);
                                        }
                                        frq0Var3.m126969y();
                                        frq0Var3.m126968x();
                                        m126962r(thread, th);
                                        return th2;
                                    }
                                } else {
                                    z3 = zM126960o;
                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                    frq0Var = this;
                                    th3 = th3;
                                }
                                try {
                                    if (u5r0.m194619c(1)) {
                                        frq0Var.f100464g.clear();
                                        if (z3) {
                                            crashType2 = CrashType.LAUNCH;
                                        } else {
                                            crashType2 = CrashType.JAVA;
                                        }
                                        q5r0.m175511a("[uncaughtException] isLaunchCrash=" + z3);
                                        bsq0.m106310a().m106311b(crashType2, jCurrentTimeMillis, str);
                                        zM126961q = m126961q(thread, th);
                                        if (zM126961q) {
                                            try {
                                                iwq0Var = frq0Var.f100459b;
                                                if (iwq0Var == null && z3 && iwq0Var.mo118169a(th3)) {
                                                    Throwable th9 = th3;
                                                    long j2 = jCurrentTimeMillis;
                                                    try {
                                                        frq0Var.f100459b.mo118168a(j2, thread, th9, str, file4, strM126953c, z7);
                                                        jCurrentTimeMillis = j2;
                                                        th3 = th9;
                                                        q5r0.m175511a("[uncaughtException] mLaunchCrashDisposer " + th3.toString());
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        jCurrentTimeMillis = j2;
                                                        th3 = th9;
                                                        z5 = z7;
                                                        frq0Var3 = frq0Var;
                                                        zM126960o = z3;
                                                        if (!d6r0.m114528w(th)) {
                                                            q5r0.m175516f(th);
                                                        }
                                                        if (!z5) {
                                                            synchronized (this) {
                                                                frq0Var3.f100462e--;
                                                                frq0Var3.f100461d--;
                                                                return m126958l(th3, thread);
                                                            }
                                                        }
                                                        if (z2) {
                                                            frq0Var3.m126956h(thread, th3, zM126960o, jCurrentTimeMillis);
                                                        }
                                                        frq0Var3.m126969y();
                                                    }
                                                } else {
                                                    j = jCurrentTimeMillis;
                                                    if (zM126961q) {
                                                        try {
                                                            iwq0Var2 = frq0Var.f100460c;
                                                            if (iwq0Var2 == null && iwq0Var2.mo118169a(th3)) {
                                                                frq0Var.f100460c.mo118168a(j, thread, th3, str, file4, strM126953c, z7);
                                                                jCurrentTimeMillis = j;
                                                                try {
                                                                    q5r0.m175511a("[uncaughtException] mLaunchCrashDisposer " + th.toString());
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    th3 = th;
                                                                    z5 = z7;
                                                                    frq0Var3 = frq0Var;
                                                                    zM126960o = z3;
                                                                    if (!d6r0.m114528w(th)) {
                                                                        q5r0.m175516f(th);
                                                                    }
                                                                    if (!z5) {
                                                                        synchronized (this) {
                                                                            frq0Var3.f100462e--;
                                                                            frq0Var3.f100461d--;
                                                                        }
                                                                        return m126958l(th3, thread);
                                                                    }
                                                                    if (z2 && !zM126970z) {
                                                                        frq0Var3.m126956h(thread, th3, zM126960o, jCurrentTimeMillis);
                                                                    }
                                                                    frq0Var3.m126969y();
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
                                                frq0Var3 = frq0Var;
                                                zM126960o = z3;
                                                thread = thread;
                                                if (!d6r0.m114528w(th)) {
                                                    q5r0.m175516f(th);
                                                }
                                                if (!z5) {
                                                    synchronized (this) {
                                                        frq0Var3.f100462e--;
                                                        frq0Var3.f100461d--;
                                                        return m126958l(th3, thread);
                                                    }
                                                }
                                                if (z2) {
                                                    frq0Var3.m126956h(thread, th3, zM126960o, jCurrentTimeMillis);
                                                }
                                                frq0Var3.m126969y();
                                            }
                                        } else {
                                            j = jCurrentTimeMillis;
                                            if (zM126961q) {
                                                iwq0Var2 = frq0Var.f100460c;
                                                if (iwq0Var2 == null) {
                                                    jCurrentTimeMillis = j;
                                                } else {
                                                    jCurrentTimeMillis = j;
                                                }
                                            } else {
                                                jCurrentTimeMillis = j;
                                            }
                                        }
                                        if (!z7) {
                                            frq0Var2 = frq0Var;
                                            synchronized (this) {
                                                frq0Var2.f100462e--;
                                                frq0Var2.f100461d--;
                                            }
                                            return m126958l(th, thread);
                                        }
                                        if (z2 || zM126970z) {
                                            frq0Var3 = frq0Var;
                                        } else {
                                            frq0Var3 = frq0Var;
                                            frq0Var3.m126956h(thread, th, z3, jCurrentTimeMillis);
                                        }
                                        frq0Var3.m126969y();
                                        frq0Var3.m126968x();
                                        m126962r(thread, th);
                                    } else {
                                        if (z3) {
                                            crashType2 = CrashType.LAUNCH;
                                        } else {
                                            crashType2 = CrashType.JAVA;
                                        }
                                        q5r0.m175511a("[uncaughtException] isLaunchCrash=" + z3);
                                        bsq0.m106310a().m106311b(crashType2, jCurrentTimeMillis, str);
                                        zM126961q = m126961q(thread, th);
                                        if (zM126961q) {
                                            iwq0Var = frq0Var.f100459b;
                                            if (iwq0Var == null) {
                                                j = jCurrentTimeMillis;
                                                if (zM126961q) {
                                                    iwq0Var2 = frq0Var.f100460c;
                                                    if (iwq0Var2 == null) {
                                                        jCurrentTimeMillis = j;
                                                    } else {
                                                        jCurrentTimeMillis = j;
                                                    }
                                                } else {
                                                    jCurrentTimeMillis = j;
                                                }
                                            } else {
                                                j = jCurrentTimeMillis;
                                                if (zM126961q) {
                                                    iwq0Var2 = frq0Var.f100460c;
                                                    if (iwq0Var2 == null) {
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
                                            if (zM126961q) {
                                                iwq0Var2 = frq0Var.f100460c;
                                                if (iwq0Var2 == null) {
                                                    jCurrentTimeMillis = j;
                                                } else {
                                                    jCurrentTimeMillis = j;
                                                }
                                            } else {
                                                jCurrentTimeMillis = j;
                                            }
                                        }
                                        if (!z7) {
                                            frq0Var2 = frq0Var;
                                            synchronized (this) {
                                                frq0Var2.f100462e--;
                                                frq0Var2.f100461d--;
                                                return m126958l(th, thread);
                                            }
                                        }
                                        if (z2) {
                                            frq0Var3 = frq0Var;
                                        } else {
                                            frq0Var3 = frq0Var;
                                        }
                                        frq0Var3.m126969y();
                                        frq0Var3.m126968x();
                                        m126962r(thread, th);
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    frq0Var3 = frq0Var;
                                    zM126960o = z3;
                                    z5 = z7;
                                    if (!d6r0.m114528w(th)) {
                                        q5r0.m175516f(th);
                                    }
                                    if (!z5) {
                                        synchronized (this) {
                                            frq0Var3.f100462e--;
                                            frq0Var3.f100461d--;
                                            return m126958l(th3, thread);
                                        }
                                    }
                                    if (z2) {
                                        frq0Var3.m126956h(thread, th3, zM126960o, jCurrentTimeMillis);
                                    }
                                    frq0Var3.m126969y();
                                    frq0Var3.m126968x();
                                    m126962r(thread, th);
                                    return th2;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                frq0Var3 = this;
                                thread = thread;
                                th3 = th3;
                                zM126960o = zM126960o;
                                z5 = z7;
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            frq0Var3 = this;
                            thread = thread;
                            th3 = th3;
                            z5 = false;
                            zM126970z = false;
                            if (!d6r0.m114528w(th)) {
                                q5r0.m175516f(th);
                            }
                            if (!z5) {
                                synchronized (this) {
                                    frq0Var3.f100462e--;
                                    frq0Var3.f100461d--;
                                    return m126958l(th3, thread);
                                }
                            }
                            if (z2) {
                                frq0Var3.m126956h(thread, th3, zM126960o, jCurrentTimeMillis);
                            }
                            frq0Var3.m126969y();
                            frq0Var3.m126968x();
                            m126962r(thread, th);
                            return th2;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        th3 = th3;
                        thread = thread;
                        z2 = z;
                        z5 = false;
                        zM126970z = false;
                        if (!d6r0.m114528w(th)) {
                            q5r0.m175516f(th);
                        }
                        if (!z5) {
                            synchronized (this) {
                                frq0Var3.f100462e--;
                                frq0Var3.f100461d--;
                                return m126958l(th3, thread);
                            }
                        }
                        if (z2) {
                            frq0Var3.m126956h(thread, th3, zM126960o, jCurrentTimeMillis);
                        }
                        frq0Var3.m126969y();
                        frq0Var3.m126968x();
                        m126962r(thread, th);
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
    public static frq0 m126955e() {
        if (f100454l == null) {
            f100454l = new frq0();
        }
        return f100454l;
    }

    /* JADX INFO: renamed from: h */
    private void m126956h(Thread thread, Throwable th, boolean z, long j) {
        List<f1m> listM169612a = s4r0.m184572a().m169612a();
        CrashType crashType = z ? CrashType.LAUNCH : CrashType.JAVA;
        Iterator<f1m> it = listM169612a.iterator();
        while (it.hasNext()) {
            Thread thread2 = thread;
            Throwable th2 = th;
            long j2 = j;
            try {
                it.next().m123580a(crashType, th2, thread2, j2);
            } catch (Throwable th3) {
                q5r0.m175517g(th3);
            }
            th = th2;
            thread = thread2;
            j = j2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m126957k(frq0 frq0Var) {
        int i = frq0Var.f100467j;
        frq0Var.f100467j = i + 1;
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021 A[Catch: all -> 0x0025, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0011, B:10:0x0021), top: B:17:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: l */
    private static Throwable m126958l(Throwable th, Thread thread) {
        for (int i = 0; i < f100457o.size(); i++) {
            try {
                try {
                    f100457o.get(i).m207974b(th, thread);
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
    public static boolean m126959n() {
        return f100455m;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m126960o(long j) {
        return g0r0.m128468a(j);
    }

    /* JADX INFO: renamed from: q */
    private boolean m126961q(Thread thread, Throwable th) {
        n0r0.m161017d().m182827d();
        return true;
    }

    /* JADX INFO: renamed from: r */
    private void m126962r(Thread thread, Throwable th) {
        if (u5r0.m194619c(512)) {
            return;
        }
        m126967w(thread, th);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m126964t() {
        Boolean bool = f100456n.get();
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m126966v() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            if (defaultUncaughtExceptionHandler != null) {
                q5r0.m175511a("Put this uncaught exception handler to stack. ".concat(defaultUncaughtExceptionHandler.getClass().getName()));
                this.f100465h.push(defaultUncaughtExceptionHandler);
            }
            this.f100458a = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* JADX INFO: renamed from: w */
    private void m126967w(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandlerPop;
        try {
            if (!this.f100465h.isEmpty() && (uncaughtExceptionHandlerPop = this.f100465h.pop()) != null) {
                this.f100458a = uncaughtExceptionHandlerPop;
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f100458a;
            if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
                q5r0.m175511a("mDefaultHandler != null, call mDefaultHandler.");
                this.f100458a.uncaughtException(thread, th);
                return;
            }
        } catch (Throwable unused) {
        }
        q5r0.m175511a("Uncaught exception handler null, kill process.");
        Process.killProcess(Process.myPid());
    }

    /* JADX INFO: renamed from: x */
    private void m126968x() {
        synchronized (this) {
            this.f100462e--;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (this.f100462e != 0 && SystemClock.uptimeMillis() - jUptimeMillis < 10000) {
            SystemClock.sleep(50L);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m126969y() {
        File fileM143566b = j5r0.m143566b(n0r0.m161022i());
        File fileM143565a = j5r0.m143565a();
        if (r3r0.m179698x(fileM143566b) && r3r0.m179698x(fileM143565a)) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (!h3r0.m133520c() && SystemClock.uptimeMillis() - jUptimeMillis < 10000) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: z */
    private boolean m126970z() {
        return nrq0.m164505b("exception_modules", "oom_callback") == 1;
    }

    /* JADX INFO: renamed from: f */
    public void m126971f(long j) {
        c5r0.m108080b().m179948j(this.f100468k);
        c5r0.m108080b().m179946f(this.f100468k, j);
    }

    /* JADX INFO: renamed from: g */
    public void m126972g(String str) {
        this.f100463f.put(str, new Object());
    }

    /* JADX INFO: renamed from: i */
    public void m126973i(Thread thread, Throwable th, boolean z, gsq0 gsq0Var) {
        List<srl> listM169614c;
        CrashType crashType;
        owq0 owq0VarM184572a = s4r0.m184572a();
        if (z) {
            listM169614c = owq0VarM184572a.m169613b();
            crashType = CrashType.LAUNCH;
        } else {
            listM169614c = owq0VarM184572a.m169614c();
            crashType = CrashType.JAVA;
        }
        for (srl srlVar : listM169614c) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                srlVar.m187630a(crashType, d6r0.m114507b(th), thread);
                gsq0Var.m132138q("callback_cost_" + srlVar.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            } catch (Throwable th2) {
                q5r0.m175517g(th2);
                gsq0Var.m132138q("callback_err_".concat(srlVar.getClass().getName()), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m126974j(iwq0 iwq0Var) {
        this.f100459b = iwq0Var;
    }

    /* JADX INFO: renamed from: m */
    public void m126975m(iwq0 iwq0Var) {
        this.f100460c = iwq0Var;
    }

    /* JADX INFO: renamed from: p */
    public boolean m126976p(String str) {
        return this.f100463f.containsKey(str);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        do {
            th = m126954d(thread, th);
        } while (th != null);
    }
}
