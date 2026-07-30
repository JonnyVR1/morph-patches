package immomo.com.mklibrary.server;

import com.cosmos.mdlog.MDLog;
import fi.iki.elonen.NanoHTTPD;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import p149l.akj;
import p149l.td80;
import p149l.ud80;
import p149l.uw2;
import p149l.vw2;
import p149l.w0m;
import p149l.xzk0;
import p149l.y95;
import p149l.yii;
import p149l.yjj;
import p149l.zjj;

/* JADX INFO: loaded from: classes2.dex */
public class LocalServerHandler {

    /* JADX INFO: renamed from: a */
    private static volatile C14928a f63322a = null;

    /* JADX INFO: renamed from: b */
    private static boolean f63323b = false;

    /* JADX INFO: renamed from: c */
    private static String f63324c;

    /* JADX INFO: renamed from: d */
    private static EnvType f63325d = EnvType.RELEASE;

    /* JADX INFO: renamed from: e */
    private static HashMap<NanoHTTPD.Method, w0m> f63326e;

    /* JADX INFO: renamed from: f */
    private static akj f63327f;

    /* JADX INFO: renamed from: g */
    private static ud80 f63328g;

    /* JADX INFO: renamed from: h */
    private static yii f63329h;

    public enum EnvType {
        DEV("development"),
        TEST("test"),
        RELEASE("production");

        private String name;

        EnvType(String str) {
            this.name = str;
        }

        public static EnvType parse(String str) {
            if (str == null) {
                return RELEASE;
            }
            EnvType envType = DEV;
            if (envType.name.equals(str)) {
                return envType;
            }
            EnvType envType2 = TEST;
            return envType2.name.equals(str) ? envType2 : RELEASE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m87194a() {
        return "127.0.0.2";
    }

    /* JADX INFO: renamed from: b */
    public static int m87195b() {
        return 7356;
    }

    /* JADX INFO: renamed from: c */
    public static String m87196c() {
        return f63324c;
    }

    /* JADX INFO: renamed from: d */
    private static void m87197d() {
        f63329h = new yii(new uw2(), new xzk0());
    }

    /* JADX INFO: renamed from: e */
    private static void m87198e() {
        if (f63326e == null) {
            f63326e = new HashMap<>();
            if (f63327f == null) {
                f63327f = new akj(new yjj());
            }
            if (f63328g == null) {
                f63328g = new ud80(new y95());
            }
            f63326e.put(zjj.f203418a, f63327f);
            f63326e.put(td80.f169502b, f63328g);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m87199f() {
        return f63322a != null && f63322a.m86940C() && f63323b;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m87200g() {
        return f63325d != EnvType.RELEASE;
    }

    /* JADX INFO: renamed from: h */
    public static void m87201h(String str) {
        f63325d = EnvType.parse(str);
    }

    /* JADX INFO: renamed from: i */
    public static synchronized void m87202i(String str) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (f63322a == null) {
                m87197d();
                m87198e();
                f63322a = new C14928a(f63326e, f63329h, "127.0.0.2", 7356);
            }
            if (!m87199f()) {
                try {
                    f63322a.m86948x();
                    f63324c = UUID.randomUUID().toString();
                    f63323b = true;
                } catch (IOException e) {
                    MDLog.printErrStackTrace("LOCAL_SERVER_Handler", e);
                    f63323b = false;
                }
            }
            vw2.m200277b().m200281e(str);
            MDLog.m7390d("LOCAL_SERVER_Handler", "START SERVER CAST: %d bid: %s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), str);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public static synchronized void m87203j() {
        try {
            MDLog.m7389d("LOCAL_SERVER_Handler", "stop server!");
            if (f63322a != null && f63323b) {
                f63322a.m86938A();
            }
            f63322a = null;
            f63323b = false;
            vw2.m200277b().m200278a();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public static synchronized void m87204k(String str) {
        MDLog.m7390d("LOCAL_SERVER_Handler", "STOP SERVER FOR BID: %s", str);
        vw2.m200277b().m200282f(str);
        if (vw2.m200277b().m200279c()) {
            m87203j();
        }
    }
}
