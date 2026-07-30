package p149l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.immomo.network.bean.CheckerStatus;
import com.immomo.network.bean.PlayerType;
import com.immomo.network.bean.UrlType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public class hb20 {

    /* JADX INFO: renamed from: r */
    private static volatile hb20 f106878r;

    /* JADX INFO: renamed from: a */
    private AtomicInteger f106879a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    private AtomicLong f106880b = new AtomicLong(0);

    /* JADX INFO: renamed from: c */
    private AtomicBoolean f106881c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    private AtomicBoolean f106882d = new AtomicBoolean(true);

    /* JADX INFO: renamed from: e */
    private AtomicBoolean f106883e = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g */
    private Map<String, Integer> f106885g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    private AtomicLong f106886h = new AtomicLong(0);

    /* JADX INFO: renamed from: i */
    private List<String> f106887i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private AtomicInteger f106888j = new AtomicInteger(0);

    /* JADX INFO: renamed from: k */
    private AtomicBoolean f106889k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    private final int f106890l = 3;

    /* JADX INFO: renamed from: m */
    private final int f106891m = 3000;

    /* JADX INFO: renamed from: n */
    private AtomicInteger f106892n = new AtomicInteger(0);

    /* JADX INFO: renamed from: o */
    private Handler f106893o = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: p */
    private long f106894p = 0;

    /* JADX INFO: renamed from: q */
    private long f106895q = 0;

    /* JADX INFO: renamed from: f */
    private final boolean f106884f = ked0.m145761a();

    /* JADX INFO: renamed from: l.hb20$a */
    public class RunnableC17265a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f106896a;

        public RunnableC17265a(Context context) {
            this.f106896a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            hb20.this.m130288y(this.f106896a);
        }
    }

    private hb20() {
    }

    /* JADX INFO: renamed from: b */
    private boolean m130271b(String str) {
        String strM130281n = m130281n(str);
        if (TextUtils.isEmpty(strM130281n) || !this.f106885g.containsKey(strM130281n)) {
            return this.f106885g.size() < m130279l();
        }
        Integer num = this.f106885g.get(strM130281n);
        return num == null || num.intValue() < m130278k();
    }

    /* JADX INFO: renamed from: c */
    private int m130272c() {
        return this.f106884f ? fjx.m121638R().m121753j0() : fjx.m121638R().m121796w();
    }

    /* JADX INFO: renamed from: d */
    private int m130273d(PlayerType playerType) {
        return playerType == PlayerType.LivePlayer ? fjx.m121638R().m121642B() : fjx.m121638R().m121652E0();
    }

    /* JADX INFO: renamed from: e */
    private int m130274e() {
        return this.f106884f ? fjx.m121638R().m121757k0() : fjx.m121638R().m121660H();
    }

    /* JADX INFO: renamed from: f */
    public static hb20 m130275f() {
        if (f106878r == null) {
            synchronized (hb20.class) {
                try {
                    if (f106878r == null) {
                        f106878r = new hb20();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f106878r;
    }

    /* JADX INFO: renamed from: h */
    private mvj0 m130276h(String str, String str2, PlayerType playerType) {
        boolean z;
        boolean z2;
        this.f106889k.set(true);
        if (m130273d(playerType) == 0) {
            mvj0 mvj0Var = new mvj0(str2, CheckerStatus.DISABLED);
            m130284q(str2, str, playerType, "v4", mvj0Var.m156527a(), false, false, "v4：总开关关闭", 0L, false);
            return mvj0Var;
        }
        if (TextUtils.isEmpty(str) || !hd20.m130571f(str)) {
            mvj0 mvj0Var2 = new mvj0(str2, CheckerStatus.PARAMS_ILLEGAL);
            m130284q(str2, str, playerType, "v4", mvj0Var2.m156527a(), false, false, "v4：入参v6url不合法", 0L, false);
            return mvj0Var2;
        }
        if (TextUtils.isEmpty(str2) && hd20.m130571f(str)) {
            mvj0 mvj0Var3 = new mvj0(str, CheckerStatus.PARAMS_ILLEGAL);
            m130284q(str2, str, playerType, "v6", mvj0Var3.m156527a(), false, false, "仅v6Url合法", 0L, false);
            return mvj0Var3;
        }
        boolean zM130283p = m130283p();
        if (zM130283p) {
            l1m.m148196c().m148199d();
            l1m.m148196c().m148200e();
        }
        if (m130274e() != 0 && this.f106882d.get() && l1m.m148196c().m148198a() != CheckerStatus.UNAVAILABLE) {
            this.f106882d.set(false);
            CheckerStatus checkerStatusM148198a = l1m.m148196c().m148198a();
            m130284q(str2, str, playerType, "v6", checkerStatusM148198a.ordinal(), false, false, "v6：首次尝试", this.f106895q, zM130283p);
            return new mvj0(str, checkerStatusM148198a);
        }
        if (System.currentTimeMillis() - this.f106886h.get() <= m130280m() * 1000 || m130271b(str)) {
            z = false;
        } else {
            this.f106885g.clear();
            z = true;
        }
        if (System.currentTimeMillis() - this.f106880b.get() <= m130280m() * 1000 || !this.f106881c.get()) {
            z2 = false;
        } else {
            this.f106879a.set(0);
            this.f106881c.set(false);
            z2 = true;
        }
        CheckerStatus checkerStatusM148198a2 = l1m.m148196c().m148198a();
        if (this.f106879a.get() > fjx.m121638R().m121704W()) {
            if (!this.f106881c.get()) {
                this.f106880b.set(System.currentTimeMillis());
                this.f106881c.set(true);
            }
            m130284q(str2, str, playerType, "v4", checkerStatusM148198a2.ordinal(), z, z2, "v4：漏报次数超阈值", this.f106895q, zM130283p);
            return new mvj0(str2, checkerStatusM148198a2);
        }
        if (m130272c() == 0 && m130271b(str)) {
            m130284q(str2, str, playerType, "v6", checkerStatusM148198a2.ordinal(), z, z2, "v6：满足尝试条件", this.f106895q, zM130283p);
            return new mvj0(str, checkerStatusM148198a2);
        }
        if (m130272c() != 0 && checkerStatusM148198a2 == CheckerStatus.AVAILABLE && m130271b(str)) {
            m130284q(str2, str, playerType, "v6", checkerStatusM148198a2.ordinal(), z, z2, "v6：满足尝试条件", this.f106895q, zM130283p);
            return new mvj0(str, checkerStatusM148198a2);
        }
        m130284q(str2, str, playerType, "v4", checkerStatusM148198a2.ordinal(), z, z2, "v4：默认", this.f106895q, zM130283p);
        return new mvj0(str2, checkerStatusM148198a2);
    }

    /* JADX INFO: renamed from: j */
    private int m130277j() {
        return this.f106884f ? fjx.m121638R().m121765m0() : fjx.m121638R().m121681O();
    }

    /* JADX INFO: renamed from: k */
    private int m130278k() {
        return this.f106884f ? fjx.m121638R().m121761l0() : fjx.m121638R().m121678N();
    }

    /* JADX INFO: renamed from: l */
    private int m130279l() {
        return this.f106884f ? fjx.m121638R().m121769n0() : fjx.m121638R().m121684P();
    }

    /* JADX INFO: renamed from: m */
    private long m130280m() {
        return this.f106884f ? fjx.m121638R().m121773o0() : fjx.m121638R().m121749i0();
    }

    /* JADX INFO: renamed from: n */
    private String m130281n(String str) {
        try {
            return str.split("\\?")[0];
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: o */
    private long m130282o() {
        return this.f106884f ? fjx.m121638R().m121776p0() : fjx.m121638R().m121788t0();
    }

    /* JADX INFO: renamed from: p */
    private boolean m130283p() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f106894p;
        long j2 = j != 0 ? jCurrentTimeMillis - j : 0L;
        this.f106895q = j2;
        this.f106894p = jCurrentTimeMillis;
        return j2 >= m130282o() * 1000;
    }

    /* JADX INFO: renamed from: q */
    private void m130284q(String str, String str2, PlayerType playerType, String str3, int i, boolean z, boolean z2, String str4, long j, boolean z3) {
        zwv zwvVar = new zwv();
        zwvVar.f205267a = str3;
        zwvVar.f205268b = TextUtils.equals("v4", str3) ? str : str2;
        zwvVar.f205269c = str;
        zwvVar.f205270d = str2;
        Integer num = 0;
        if (!TextUtils.isEmpty(str2)) {
            num = this.f106885g.get(m130281n(str2));
        }
        zwvVar.f205271e = num == null ? 0 : num.intValue();
        zwvVar.f205272f = this.f106885g.size();
        zwvVar.f205273g = this.f106879a.get();
        zwvVar.f205274h = i;
        zwvVar.f205275i = this.f106882d.get();
        zwvVar.f205276j = m130273d(playerType) != 0;
        zwvVar.f205277k = m130274e() == 1;
        zwvVar.f205278l = this.f106884f;
        zwvVar.f205279m = m130272c() == 1;
        zwvVar.f205280n = m130278k();
        zwvVar.f205281o = m130279l();
        zwvVar.f205282p = fjx.m121638R().m121704W();
        zwvVar.f205283q = fjx.m121638R().m121749i0();
        zwvVar.f205284r = z;
        zwvVar.f205285s = z2;
        zwvVar.f205286t = str4;
        zwvVar.f205287u = m130282o();
        zwvVar.f205288v = j;
        zwvVar.f205289w = z3;
        ib20.m135242c(zwvVar);
    }

    /* JADX INFO: renamed from: s */
    private synchronized void m130285s(mvj0 mvj0Var, boolean z, boolean z2, PlayerType playerType) {
        try {
            if (m130273d(playerType) == 0) {
                return;
            }
            if (mvj0Var != null && !TextUtils.isEmpty(mvj0Var.m156529d()) && mvj0Var.m156528b() == UrlType.IPV6) {
                if (this.f106887i.contains(mvj0Var.m156529d())) {
                    this.f106879a.decrementAndGet();
                    this.f106887i.remove(mvj0Var.m156529d());
                }
                if (!z2) {
                    if (z) {
                        l1m.m148196c().m148201f();
                        this.f106885g.clear();
                        this.f106879a.set(0);
                    } else {
                        l1m.m148196c().m148200e();
                        this.f106886h.set(System.currentTimeMillis());
                        String strM130281n = m130281n(mvj0Var.m156529d());
                        Integer num = this.f106885g.get(strM130281n);
                        Map<String, Integer> map = this.f106885g;
                        int iIntValue = 1;
                        if (num != null) {
                            iIntValue = 1 + num.intValue();
                        }
                        map.put(strM130281n, Integer.valueOf(iIntValue));
                    }
                }
                ib20.m135244e(z, mvj0Var.m156529d(), z2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    private void m130286u(mvj0 mvj0Var, PlayerType playerType) {
        if (m130273d(playerType) == 0 || mvj0Var == null || TextUtils.isEmpty(mvj0Var.m156529d()) || mvj0Var.m156528b() != UrlType.IPV6 || this.f106887i.contains(mvj0Var.m156529d())) {
            return;
        }
        this.f106879a.incrementAndGet();
        this.f106887i.add(mvj0Var.m156529d());
    }

    /* JADX INFO: renamed from: v */
    private void m130287v(String str, String str2, String str3, int i, String str4, long j, boolean z) {
        zwv zwvVar = new zwv();
        zwvVar.f205267a = str3;
        zwvVar.f205268b = TextUtils.equals("v4", str3) ? str : str2;
        zwvVar.f205269c = str;
        zwvVar.f205270d = str2;
        zwvVar.f205272f = this.f106888j.get();
        zwvVar.f205273g = this.f106879a.get();
        zwvVar.f205274h = i;
        zwvVar.f205275i = this.f106883e.get();
        zwvVar.f205276j = fjx.m121638R().m121642B() != 0;
        zwvVar.f205277k = m130274e() != 0;
        zwvVar.f205278l = this.f106884f;
        zwvVar.f205281o = m130277j();
        zwvVar.f205286t = str4;
        zwvVar.f205287u = m130282o();
        zwvVar.f205288v = j;
        zwvVar.f205289w = z;
        ib20.m135243d(zwvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m130288y(Context context) {
        ib20.m135246g(fjx.m121638R().m121642B() != 0, this.f106892n.get() + 1, hd20.m130572g(context));
        if (hd20.m130572g(context) || this.f106892n.get() >= 3) {
            l1m.m148196c().m148200e();
            this.f106892n.set(0);
        } else {
            this.f106893o.postDelayed(new RunnableC17265a(context), 3000L);
            this.f106892n.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: g */
    public mvj0 m130289g(String str, String str2) {
        return m130276h(str, str2, PlayerType.LivePlayer);
    }

    /* JADX INFO: renamed from: i */
    public mvj0 m130290i(String str, String str2) {
        this.f106889k.set(true);
        if (fjx.m121638R().m121642B() == 0) {
            mvj0 mvj0Var = new mvj0(str2, CheckerStatus.DISABLED);
            m130287v(str2, str, "v4", mvj0Var.m156527a(), "v4：总开关关闭", 0L, false);
            return mvj0Var;
        }
        if (TextUtils.isEmpty(str) || !hd20.m130571f(str)) {
            mvj0 mvj0Var2 = new mvj0(str2, CheckerStatus.PARAMS_ILLEGAL);
            m130287v(str2, str, "v4", mvj0Var2.m156527a(), "v4：入参v6url不合法", 0L, false);
            return mvj0Var2;
        }
        if (TextUtils.isEmpty(str2) && hd20.m130571f(str)) {
            mvj0 mvj0Var3 = new mvj0(str, CheckerStatus.PARAMS_ILLEGAL);
            m130287v(str2, str, "v6", mvj0Var3.m156527a(), "v6：仅v6Url合法", 0L, false);
            return mvj0Var3;
        }
        boolean zM130283p = m130283p();
        if (zM130283p) {
            l1m.m148196c().m148199d();
            l1m.m148196c().m148200e();
        }
        if (m130274e() != 0 && this.f106883e.get() && l1m.m148196c().m148198a() != CheckerStatus.UNAVAILABLE) {
            this.f106883e.set(false);
            CheckerStatus checkerStatusM148198a = l1m.m148196c().m148198a();
            m130287v(str2, str, "v6", checkerStatusM148198a.ordinal(), "v6：首次尝试", this.f106895q, zM130283p);
            return new mvj0(str, checkerStatusM148198a);
        }
        CheckerStatus checkerStatusM148198a2 = l1m.m148196c().m148198a();
        if (this.f106888j.get() >= m130277j() || checkerStatusM148198a2 != CheckerStatus.AVAILABLE) {
            m130287v(str2, str, "v4", checkerStatusM148198a2.ordinal(), "v4：默认", this.f106895q, zM130283p);
            return new mvj0(str2, checkerStatusM148198a2);
        }
        m130287v(str2, str, "v6", checkerStatusM148198a2.ordinal(), "v6：满足尝试条件", this.f106895q, zM130283p);
        return new mvj0(str, checkerStatusM148198a2);
    }

    /* JADX INFO: renamed from: r */
    public void m130291r(mvj0 mvj0Var, boolean z, boolean z2) {
        m130285s(mvj0Var, z, z2, PlayerType.LivePlayer);
    }

    /* JADX INFO: renamed from: t */
    public void m130292t(mvj0 mvj0Var) {
        m130286u(mvj0Var, PlayerType.LivePlayer);
    }

    /* JADX INFO: renamed from: w */
    public void m130293w(mvj0 mvj0Var, boolean z) {
        if (fjx.m121638R().m121642B() == 0 || mvj0Var == null || TextUtils.isEmpty(mvj0Var.m156529d()) || mvj0Var.m156528b() != UrlType.IPV6) {
            return;
        }
        if (z) {
            l1m.m148196c().m148201f();
            this.f106888j.set(0);
        } else {
            l1m.m148196c().m148200e();
            this.f106888j.incrementAndGet();
        }
        ib20.m135245f(z, mvj0Var.m156529d());
    }

    /* JADX INFO: renamed from: x */
    public void m130294x(Context context) {
        if (fjx.m121638R().m121642B() == 0 || !this.f106889k.get()) {
            return;
        }
        this.f106882d.set(true);
        this.f106883e.set(true);
        this.f106879a.set(0);
        this.f106885g.clear();
        this.f106887i.clear();
        this.f106888j.set(0);
        this.f106881c.set(false);
        this.f106880b.set(0L);
        this.f106886h.set(0L);
        this.f106889k.set(false);
        this.f106894p = 0L;
        this.f106895q = 0L;
        l1m.m148196c().m148199d();
        this.f106893o.removeCallbacksAndMessages(null);
        this.f106892n.set(0);
        m130288y(context);
    }
}
