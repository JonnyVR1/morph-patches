package p009l;

import com.p1.mobile.putong.core.CoreModule;
import java.util.HashMap;
import java.util.Map;
import l.rxg0;
import l.tpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class nah0 {

    /* JADX INFO: renamed from: f */
    public static nah0 f17367f;

    /* JADX INFO: renamed from: a */
    public int f17368a;

    /* JADX INFO: renamed from: b */
    public String f17369b = null;

    /* JADX INFO: renamed from: e */
    public HashMap<String, C1044a> f17372e = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public tpd0 f17370c = new tpd0("swipe_flag_" + CoreModule.H().userId(), m18816b());

    /* JADX INFO: renamed from: d */
    public tpd0 f17371d = new tpd0("new_user_swipe_flag_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: l.nah0$a */
    public class C1044a {

        /* JADX INFO: renamed from: a */
        public boolean f17373a;

        /* JADX INFO: renamed from: b */
        public int f17374b;
    }

    public nah0() {
        this.f17368a = 0;
        if (!((Boolean) CoreModule.c.e0.N5.get()).booleanValue()) {
            CoreModule.c.e0.N5.put(Boolean.TRUE);
            this.f17370c.put(Integer.valueOf(((Integer) this.f17370c.get()).intValue() & 12));
        }
        int iIntValue = ((Integer) this.f17370c.get()).intValue() | 4;
        this.f17368a = iIntValue;
        this.f17370c.put(Integer.valueOf(iIntValue));
        if (m18817d()) {
            return;
        }
        if (((Integer) this.f17371d.get()).intValue() == 0 || (this.f17368a & 8) == 0) {
            this.f17371d.put(1);
            m18818g(8);
        }
    }

    /* JADX INFO: renamed from: c */
    public static nah0 m18812c() {
        if (f17367f == null) {
            synchronized (nah0.class) {
                try {
                    if (f17367f == null) {
                        f17367f = new nah0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17367f;
    }

    /* JADX INFO: renamed from: f */
    public static void m18814f() {
        f17367f = null;
    }

    /* JADX INFO: renamed from: a */
    public void m18815a() {
        int iM18816b = m18816b();
        this.f17368a = iM18816b;
        this.f17370c.put(Integer.valueOf(iM18816b));
        this.f17372e = new HashMap<>();
        this.f17371d.put(0);
        this.f17369b = null;
        rxg0.j().e.put(0);
        rxg0.j().d.put(0L);
    }

    /* JADX INFO: renamed from: b */
    public final int m18816b() {
        return !m18817d() ? 12 : 4;
    }

    /* JADX INFO: renamed from: d */
    public boolean m18817d() {
        return CoreModule.c.e0.na().isNewUserIn24H();
    }

    /* JADX INFO: renamed from: g */
    public void m18818g(int i) {
        int i2 = i | this.f17368a;
        this.f17368a = i2;
        this.f17370c.put(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: h */
    public void m18819h() {
        m18820i();
    }

    /* JADX INFO: renamed from: i */
    public final void m18820i() {
        for (Map.Entry<String, C1044a> entry : this.f17372e.entrySet()) {
            if (entry.getValue().f17373a) {
                entry.getValue().f17373a = false;
                m18818g(entry.getValue().f17374b);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m18821j() {
        this.f17371d.put(1);
        m18818g(1);
    }

    /* JADX INFO: renamed from: e */
    public static void m18813e(String str, String str2) {
    }
}
