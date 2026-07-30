package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nah0 {

    /* JADX INFO: renamed from: f */
    public static nah0 f137899f;

    /* JADX INFO: renamed from: a */
    public int f137900a;

    /* JADX INFO: renamed from: b */
    public String f137901b = null;

    /* JADX INFO: renamed from: e */
    public HashMap<String, C18644a> f137904e = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public tpd0 f137902c = new tpd0("swipe_flag_" + CoreModule.m29931H().userId(), m158683b());

    /* JADX INFO: renamed from: d */
    public tpd0 f137903d = new tpd0("new_user_swipe_flag_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: l.nah0$a */
    public class C18644a {

        /* JADX INFO: renamed from: a */
        public boolean f137905a;

        /* JADX INFO: renamed from: b */
        public int f137906b;
    }

    public nah0() {
        this.f137900a = 0;
        if (!CoreModule.f17545c.f19639e0.f149229N5.get().booleanValue()) {
            CoreModule.f17545c.f19639e0.f149229N5.put(Boolean.TRUE);
            this.f137902c.put(Integer.valueOf(this.f137902c.get().intValue() & 12));
        }
        int iIntValue = this.f137902c.get().intValue() | 4;
        this.f137900a = iIntValue;
        this.f137902c.put(Integer.valueOf(iIntValue));
        if (m158684d()) {
            return;
        }
        if (this.f137903d.get().intValue() == 0 || (this.f137900a & 8) == 0) {
            this.f137903d.put(1);
            m158685g(8);
        }
    }

    /* JADX INFO: renamed from: c */
    public static nah0 m158679c() {
        if (f137899f == null) {
            synchronized (nah0.class) {
                try {
                    if (f137899f == null) {
                        f137899f = new nah0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f137899f;
    }

    /* JADX INFO: renamed from: f */
    public static void m158681f() {
        f137899f = null;
    }

    /* JADX INFO: renamed from: a */
    public void m158682a() {
        int iM158683b = m158683b();
        this.f137900a = iM158683b;
        this.f137902c.put(Integer.valueOf(iM158683b));
        this.f137904e = new HashMap<>();
        this.f137903d.put(0);
        this.f137901b = null;
        rxg0.m181572j().f161460e.put(0);
        rxg0.m181572j().f161459d.put(0L);
    }

    /* JADX INFO: renamed from: b */
    public final int m158683b() {
        return !m158684d() ? 12 : 4;
    }

    /* JADX INFO: renamed from: d */
    public boolean m158684d() {
        return CoreModule.f17545c.f19639e0.m169520na().isNewUserIn24H();
    }

    /* JADX INFO: renamed from: g */
    public void m158685g(int i) {
        int i2 = i | this.f137900a;
        this.f137900a = i2;
        this.f137902c.put(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: h */
    public void m158686h() {
        m158687i();
    }

    /* JADX INFO: renamed from: i */
    public final void m158687i() {
        for (Map.Entry<String, C18644a> entry : this.f137904e.entrySet()) {
            if (entry.getValue().f137905a) {
                entry.getValue().f137905a = false;
                m158685g(entry.getValue().f137906b);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m158688j() {
        this.f137903d.put(1);
        m158685g(1);
    }

    /* JADX INFO: renamed from: e */
    public static void m158680e(String str, String str2) {
    }
}
