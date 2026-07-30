package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class vih0 {

    /* JADX INFO: renamed from: f */
    public static vih0 f184236f;

    /* JADX INFO: renamed from: a */
    public int f184237a;

    /* JADX INFO: renamed from: b */
    public String f184238b = null;

    /* JADX INFO: renamed from: e */
    public HashMap<String, C20836a> f184241e = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public vxd0 f184239c = new vxd0("swipe_flag_" + CoreModule.m30929H().userId(), m201342b());

    /* JADX INFO: renamed from: d */
    public vxd0 f184240d = new vxd0("new_user_swipe_flag_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: l.vih0$a */
    public class C20836a {

        /* JADX INFO: renamed from: a */
        public boolean f184242a;

        /* JADX INFO: renamed from: b */
        public int f184243b;
    }

    public vih0() {
        this.f184237a = 0;
        if (!CoreModule.f18264c.f20381e0.f89086N5.get().booleanValue()) {
            CoreModule.f18264c.f20381e0.f89086N5.put(Boolean.TRUE);
            this.f184239c.put(Integer.valueOf(this.f184239c.get().intValue() & 12));
        }
        int iIntValue = this.f184239c.get().intValue() | 4;
        this.f184237a = iIntValue;
        this.f184239c.put(Integer.valueOf(iIntValue));
        if (m201343d()) {
            return;
        }
        if (this.f184240d.get().intValue() == 0 || (this.f184237a & 8) == 0) {
            this.f184240d.put(1);
            m201344g(8);
        }
    }

    /* JADX INFO: renamed from: c */
    public static vih0 m201338c() {
        if (f184236f == null) {
            synchronized (vih0.class) {
                try {
                    if (f184236f == null) {
                        f184236f = new vih0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f184236f;
    }

    /* JADX INFO: renamed from: f */
    public static void m201340f() {
        f184236f = null;
    }

    /* JADX INFO: renamed from: a */
    public void m201341a() {
        int iM201342b = m201342b();
        this.f184237a = iM201342b;
        this.f184239c.put(Integer.valueOf(iM201342b));
        this.f184241e = new HashMap<>();
        this.f184240d.put(0);
        this.f184238b = null;
        z5h0.m218675j().f203047e.put(0);
        z5h0.m218675j().f203046d.put(0L);
    }

    /* JADX INFO: renamed from: b */
    public final int m201342b() {
        return !m201343d() ? 12 : 4;
    }

    /* JADX INFO: renamed from: d */
    public boolean m201343d() {
        return CoreModule.f18264c.f20381e0.m116593na().isNewUserIn24H();
    }

    /* JADX INFO: renamed from: g */
    public void m201344g(int i) {
        int i2 = i | this.f184237a;
        this.f184237a = i2;
        this.f184239c.put(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: h */
    public void m201345h() {
        m201346i();
    }

    /* JADX INFO: renamed from: i */
    public final void m201346i() {
        for (Map.Entry<String, C20836a> entry : this.f184241e.entrySet()) {
            if (entry.getValue().f184242a) {
                entry.getValue().f184242a = false;
                m201344g(entry.getValue().f184243b);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m201347j() {
        this.f184240d.put(1);
        m201344g(1);
    }

    /* JADX INFO: renamed from: e */
    public static void m201339e(String str, String str2) {
    }
}
