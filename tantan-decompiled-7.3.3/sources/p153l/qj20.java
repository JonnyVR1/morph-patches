package p153l;

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
public class qj20 {

    /* JADX INFO: renamed from: r */
    private static volatile qj20 f157915r;

    /* JADX INFO: renamed from: a */
    private AtomicInteger f157916a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    private AtomicLong f157917b = new AtomicLong(0);

    /* JADX INFO: renamed from: c */
    private AtomicBoolean f157918c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    private AtomicBoolean f157919d = new AtomicBoolean(true);

    /* JADX INFO: renamed from: e */
    private AtomicBoolean f157920e = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g */
    private Map<String, Integer> f157922g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    private AtomicLong f157923h = new AtomicLong(0);

    /* JADX INFO: renamed from: i */
    private List<String> f157924i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private AtomicInteger f157925j = new AtomicInteger(0);

    /* JADX INFO: renamed from: k */
    private AtomicBoolean f157926k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    private final int f157927l = 3;

    /* JADX INFO: renamed from: m */
    private final int f157928m = 3000;

    /* JADX INFO: renamed from: n */
    private AtomicInteger f157929n = new AtomicInteger(0);

    /* JADX INFO: renamed from: o */
    private Handler f157930o = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: p */
    private long f157931p = 0;

    /* JADX INFO: renamed from: q */
    private long f157932q = 0;

    /* JADX INFO: renamed from: f */
    private final boolean f157921f = mmd0.m159059a();

    /* JADX INFO: renamed from: l.qj20$a */
    public class RunnableC19581a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f157933a;

        public RunnableC19581a(Context context) {
            this.f157933a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            qj20.this.m176819y(this.f157933a);
        }
    }

    private qj20() {
    }

    /* JADX INFO: renamed from: b */
    private boolean m176802b(String str) {
        String strM176812n = m176812n(str);
        if (TextUtils.isEmpty(strM176812n) || !this.f157922g.containsKey(strM176812n)) {
            return this.f157922g.size() < m176810l();
        }
        Integer num = this.f157922g.get(strM176812n);
        return num == null || num.intValue() < m176809k();
    }

    /* JADX INFO: renamed from: c */
    private int m176803c() {
        return this.f157921f ? csx.m112235R().m112350j0() : csx.m112235R().m112393w();
    }

    /* JADX INFO: renamed from: d */
    private int m176804d(PlayerType playerType) {
        return playerType == PlayerType.LivePlayer ? csx.m112235R().m112239B() : csx.m112235R().m112249E0();
    }

    /* JADX INFO: renamed from: e */
    private int m176805e() {
        return this.f157921f ? csx.m112235R().m112354k0() : csx.m112235R().m112257H();
    }

    /* JADX INFO: renamed from: f */
    public static qj20 m176806f() {
        if (f157915r == null) {
            synchronized (qj20.class) {
                try {
                    if (f157915r == null) {
                        f157915r = new qj20();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f157915r;
    }

    /* JADX INFO: renamed from: h */
    private p4k0 m176807h(String str, String str2, PlayerType playerType) {
        boolean z;
        boolean z2;
        this.f157926k.set(true);
        if (m176804d(playerType) == 0) {
            p4k0 p4k0Var = new p4k0(str2, CheckerStatus.DISABLED);
            m176815q(str2, str, playerType, "v4", p4k0Var.m170571a(), false, false, "v4：总开关关闭", 0L, false);
            return p4k0Var;
        }
        if (TextUtils.isEmpty(str) || !rl20.m181911f(str)) {
            p4k0 p4k0Var2 = new p4k0(str2, CheckerStatus.PARAMS_ILLEGAL);
            m176815q(str2, str, playerType, "v4", p4k0Var2.m170571a(), false, false, "v4：入参v6url不合法", 0L, false);
            return p4k0Var2;
        }
        if (TextUtils.isEmpty(str2) && rl20.m181911f(str)) {
            p4k0 p4k0Var3 = new p4k0(str, CheckerStatus.PARAMS_ILLEGAL);
            m176815q(str2, str, playerType, "v6", p4k0Var3.m170571a(), false, false, "仅v6Url合法", 0L, false);
            return p4k0Var3;
        }
        boolean zM176814p = m176814p();
        if (zM176814p) {
            e4m.m119450c().m119453d();
            e4m.m119450c().m119454e();
        }
        if (m176805e() != 0 && this.f157919d.get() && e4m.m119450c().m119452a() != CheckerStatus.UNAVAILABLE) {
            this.f157919d.set(false);
            CheckerStatus checkerStatusM119452a = e4m.m119450c().m119452a();
            m176815q(str2, str, playerType, "v6", checkerStatusM119452a.ordinal(), false, false, "v6：首次尝试", this.f157932q, zM176814p);
            return new p4k0(str, checkerStatusM119452a);
        }
        if (System.currentTimeMillis() - this.f157923h.get() <= m176811m() * 1000 || m176802b(str)) {
            z = false;
        } else {
            this.f157922g.clear();
            z = true;
        }
        if (System.currentTimeMillis() - this.f157917b.get() <= m176811m() * 1000 || !this.f157918c.get()) {
            z2 = false;
        } else {
            this.f157916a.set(0);
            this.f157918c.set(false);
            z2 = true;
        }
        CheckerStatus checkerStatusM119452a2 = e4m.m119450c().m119452a();
        if (this.f157916a.get() > csx.m112235R().m112301W()) {
            if (!this.f157918c.get()) {
                this.f157917b.set(System.currentTimeMillis());
                this.f157918c.set(true);
            }
            m176815q(str2, str, playerType, "v4", checkerStatusM119452a2.ordinal(), z, z2, "v4：漏报次数超阈值", this.f157932q, zM176814p);
            return new p4k0(str2, checkerStatusM119452a2);
        }
        if (m176803c() == 0 && m176802b(str)) {
            m176815q(str2, str, playerType, "v6", checkerStatusM119452a2.ordinal(), z, z2, "v6：满足尝试条件", this.f157932q, zM176814p);
            return new p4k0(str, checkerStatusM119452a2);
        }
        if (m176803c() != 0 && checkerStatusM119452a2 == CheckerStatus.AVAILABLE && m176802b(str)) {
            m176815q(str2, str, playerType, "v6", checkerStatusM119452a2.ordinal(), z, z2, "v6：满足尝试条件", this.f157932q, zM176814p);
            return new p4k0(str, checkerStatusM119452a2);
        }
        m176815q(str2, str, playerType, "v4", checkerStatusM119452a2.ordinal(), z, z2, "v4：默认", this.f157932q, zM176814p);
        return new p4k0(str2, checkerStatusM119452a2);
    }

    /* JADX INFO: renamed from: j */
    private int m176808j() {
        return this.f157921f ? csx.m112235R().m112362m0() : csx.m112235R().m112278O();
    }

    /* JADX INFO: renamed from: k */
    private int m176809k() {
        return this.f157921f ? csx.m112235R().m112358l0() : csx.m112235R().m112275N();
    }

    /* JADX INFO: renamed from: l */
    private int m176810l() {
        return this.f157921f ? csx.m112235R().m112366n0() : csx.m112235R().m112281P();
    }

    /* JADX INFO: renamed from: m */
    private long m176811m() {
        return this.f157921f ? csx.m112235R().m112370o0() : csx.m112235R().m112346i0();
    }

    /* JADX INFO: renamed from: n */
    private String m176812n(String str) {
        try {
            return str.split("\\?")[0];
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: o */
    private long m176813o() {
        return this.f157921f ? csx.m112235R().m112373p0() : csx.m112235R().m112385t0();
    }

    /* JADX INFO: renamed from: p */
    private boolean m176814p() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f157931p;
        long j2 = j != 0 ? jCurrentTimeMillis - j : 0L;
        this.f157932q = j2;
        this.f157931p = jCurrentTimeMillis;
        return j2 >= m176813o() * 1000;
    }

    /* JADX INFO: renamed from: q */
    private void m176815q(String str, String str2, PlayerType playerType, String str3, int i, boolean z, boolean z2, String str4, long j, boolean z3) {
        yyv yyvVar = new yyv();
        yyvVar.f202133a = str3;
        yyvVar.f202134b = TextUtils.equals("v4", str3) ? str : str2;
        yyvVar.f202135c = str;
        yyvVar.f202136d = str2;
        Integer num = 0;
        if (!TextUtils.isEmpty(str2)) {
            num = this.f157922g.get(m176812n(str2));
        }
        yyvVar.f202137e = num == null ? 0 : num.intValue();
        yyvVar.f202138f = this.f157922g.size();
        yyvVar.f202139g = this.f157916a.get();
        yyvVar.f202140h = i;
        yyvVar.f202141i = this.f157919d.get();
        yyvVar.f202142j = m176804d(playerType) != 0;
        yyvVar.f202143k = m176805e() == 1;
        yyvVar.f202144l = this.f157921f;
        yyvVar.f202145m = m176803c() == 1;
        yyvVar.f202146n = m176809k();
        yyvVar.f202147o = m176810l();
        yyvVar.f202148p = csx.m112235R().m112301W();
        yyvVar.f202149q = csx.m112235R().m112346i0();
        yyvVar.f202150r = z;
        yyvVar.f202151s = z2;
        yyvVar.f202152t = str4;
        yyvVar.f202153u = m176813o();
        yyvVar.f202154v = j;
        yyvVar.f202155w = z3;
        rj20.m181629c(yyvVar);
    }

    /* JADX INFO: renamed from: s */
    private synchronized void m176816s(p4k0 p4k0Var, boolean z, boolean z2, PlayerType playerType) {
        try {
            if (m176804d(playerType) == 0) {
                return;
            }
            if (p4k0Var != null && !TextUtils.isEmpty(p4k0Var.m170573d()) && p4k0Var.m170572b() == UrlType.IPV6) {
                if (this.f157924i.contains(p4k0Var.m170573d())) {
                    this.f157916a.decrementAndGet();
                    this.f157924i.remove(p4k0Var.m170573d());
                }
                if (!z2) {
                    if (z) {
                        e4m.m119450c().m119455f();
                        this.f157922g.clear();
                        this.f157916a.set(0);
                    } else {
                        e4m.m119450c().m119454e();
                        this.f157923h.set(System.currentTimeMillis());
                        String strM176812n = m176812n(p4k0Var.m170573d());
                        Integer num = this.f157922g.get(strM176812n);
                        Map<String, Integer> map = this.f157922g;
                        int iIntValue = 1;
                        if (num != null) {
                            iIntValue = 1 + num.intValue();
                        }
                        map.put(strM176812n, Integer.valueOf(iIntValue));
                    }
                }
                rj20.m181631e(z, p4k0Var.m170573d(), z2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    private void m176817u(p4k0 p4k0Var, PlayerType playerType) {
        if (m176804d(playerType) == 0 || p4k0Var == null || TextUtils.isEmpty(p4k0Var.m170573d()) || p4k0Var.m170572b() != UrlType.IPV6 || this.f157924i.contains(p4k0Var.m170573d())) {
            return;
        }
        this.f157916a.incrementAndGet();
        this.f157924i.add(p4k0Var.m170573d());
    }

    /* JADX INFO: renamed from: v */
    private void m176818v(String str, String str2, String str3, int i, String str4, long j, boolean z) {
        yyv yyvVar = new yyv();
        yyvVar.f202133a = str3;
        yyvVar.f202134b = TextUtils.equals("v4", str3) ? str : str2;
        yyvVar.f202135c = str;
        yyvVar.f202136d = str2;
        yyvVar.f202138f = this.f157925j.get();
        yyvVar.f202139g = this.f157916a.get();
        yyvVar.f202140h = i;
        yyvVar.f202141i = this.f157920e.get();
        yyvVar.f202142j = csx.m112235R().m112239B() != 0;
        yyvVar.f202143k = m176805e() != 0;
        yyvVar.f202144l = this.f157921f;
        yyvVar.f202147o = m176808j();
        yyvVar.f202152t = str4;
        yyvVar.f202153u = m176813o();
        yyvVar.f202154v = j;
        yyvVar.f202155w = z;
        rj20.m181630d(yyvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m176819y(Context context) {
        rj20.m181633g(csx.m112235R().m112239B() != 0, this.f157929n.get() + 1, rl20.m181912g(context));
        if (rl20.m181912g(context) || this.f157929n.get() >= 3) {
            e4m.m119450c().m119454e();
            this.f157929n.set(0);
        } else {
            this.f157930o.postDelayed(new RunnableC19581a(context), 3000L);
            this.f157929n.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: g */
    public p4k0 m176820g(String str, String str2) {
        return m176807h(str, str2, PlayerType.LivePlayer);
    }

    /* JADX INFO: renamed from: i */
    public p4k0 m176821i(String str, String str2) {
        this.f157926k.set(true);
        if (csx.m112235R().m112239B() == 0) {
            p4k0 p4k0Var = new p4k0(str2, CheckerStatus.DISABLED);
            m176818v(str2, str, "v4", p4k0Var.m170571a(), "v4：总开关关闭", 0L, false);
            return p4k0Var;
        }
        if (TextUtils.isEmpty(str) || !rl20.m181911f(str)) {
            p4k0 p4k0Var2 = new p4k0(str2, CheckerStatus.PARAMS_ILLEGAL);
            m176818v(str2, str, "v4", p4k0Var2.m170571a(), "v4：入参v6url不合法", 0L, false);
            return p4k0Var2;
        }
        if (TextUtils.isEmpty(str2) && rl20.m181911f(str)) {
            p4k0 p4k0Var3 = new p4k0(str, CheckerStatus.PARAMS_ILLEGAL);
            m176818v(str2, str, "v6", p4k0Var3.m170571a(), "v6：仅v6Url合法", 0L, false);
            return p4k0Var3;
        }
        boolean zM176814p = m176814p();
        if (zM176814p) {
            e4m.m119450c().m119453d();
            e4m.m119450c().m119454e();
        }
        if (m176805e() != 0 && this.f157920e.get() && e4m.m119450c().m119452a() != CheckerStatus.UNAVAILABLE) {
            this.f157920e.set(false);
            CheckerStatus checkerStatusM119452a = e4m.m119450c().m119452a();
            m176818v(str2, str, "v6", checkerStatusM119452a.ordinal(), "v6：首次尝试", this.f157932q, zM176814p);
            return new p4k0(str, checkerStatusM119452a);
        }
        CheckerStatus checkerStatusM119452a2 = e4m.m119450c().m119452a();
        if (this.f157925j.get() >= m176808j() || checkerStatusM119452a2 != CheckerStatus.AVAILABLE) {
            m176818v(str2, str, "v4", checkerStatusM119452a2.ordinal(), "v4：默认", this.f157932q, zM176814p);
            return new p4k0(str2, checkerStatusM119452a2);
        }
        m176818v(str2, str, "v6", checkerStatusM119452a2.ordinal(), "v6：满足尝试条件", this.f157932q, zM176814p);
        return new p4k0(str, checkerStatusM119452a2);
    }

    /* JADX INFO: renamed from: r */
    public void m176822r(p4k0 p4k0Var, boolean z, boolean z2) {
        m176816s(p4k0Var, z, z2, PlayerType.LivePlayer);
    }

    /* JADX INFO: renamed from: t */
    public void m176823t(p4k0 p4k0Var) {
        m176817u(p4k0Var, PlayerType.LivePlayer);
    }

    /* JADX INFO: renamed from: w */
    public void m176824w(p4k0 p4k0Var, boolean z) {
        if (csx.m112235R().m112239B() == 0 || p4k0Var == null || TextUtils.isEmpty(p4k0Var.m170573d()) || p4k0Var.m170572b() != UrlType.IPV6) {
            return;
        }
        if (z) {
            e4m.m119450c().m119455f();
            this.f157925j.set(0);
        } else {
            e4m.m119450c().m119454e();
            this.f157925j.incrementAndGet();
        }
        rj20.m181632f(z, p4k0Var.m170573d());
    }

    /* JADX INFO: renamed from: x */
    public void m176825x(Context context) {
        if (csx.m112235R().m112239B() == 0 || !this.f157926k.get()) {
            return;
        }
        this.f157919d.set(true);
        this.f157920e.set(true);
        this.f157916a.set(0);
        this.f157922g.clear();
        this.f157924i.clear();
        this.f157925j.set(0);
        this.f157918c.set(false);
        this.f157917b.set(0L);
        this.f157923h.set(0L);
        this.f157926k.set(false);
        this.f157931p = 0L;
        this.f157932q = 0L;
        e4m.m119450c().m119453d();
        this.f157930o.removeCallbacksAndMessages(null);
        this.f157929n.set(0);
        m176819y(context);
    }
}
