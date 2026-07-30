package com.p003p1.mobile.android.p005ui.poplevel;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p003p1.mobile.android.p005ui.poplevel.C0283a;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import l.c4g0;
import l.du2;
import l.e30;
import l.hpd0;
import l.j760;
import l.jo0;
import l.vwb;
import l.zvf0;
import org.json.JSONObject;
import p007l.f0m;
import p007l.h0m;
import p007l.i0m;
import p007l.j0m;
import p007l.jc80;
import p007l.k0m;
import p007l.kc80;
import p007l.mkd0;
import p007l.pc80;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: renamed from: com.p1.mobile.android.ui.poplevel.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0283a implements e30<pc80>, f0m {

    /* JADX INFO: renamed from: m */
    public static volatile C0283a f1573m;

    /* JADX INFO: renamed from: i */
    public c4g0 f1582i;

    /* JADX INFO: renamed from: a */
    public b<String> f1574a = b.b();

    /* JADX INFO: renamed from: b */
    public boolean f1575b = true;

    /* JADX INFO: renamed from: e */
    public HashMap<String, jc80> f1578e = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap<String, Long> f1581h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j */
    public AtomicBoolean f1583j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    public hpd0 f1584k = new hpd0("pop_level_manager_debug", Boolean.FALSE);

    /* JADX INFO: renamed from: l */
    public boolean f1585l = false;

    /* JADX INFO: renamed from: c */
    public HashMap<String, i0m> f1576c = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public HashMap<String, a<pc80>> f1579f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public HashMap<String, c4g0> f1580g = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, j760<Integer, Integer>> f1577d = new HashMap<>();

    /* JADX INFO: renamed from: F */
    public static int m1367F(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 20000;
        }
        if (i == 3) {
            return 40000;
        }
        return i == 5 ? 50000 : 20000;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1369c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1370d(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static C0283a m1372p() {
        if (f1573m == null) {
            synchronized (C0283a.class) {
                try {
                    if (f1573m == null) {
                        f1573m = new C0283a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1573m;
    }

    /* JADX INFO: renamed from: A */
    public final int m1373A(kc80 kc80Var, jc80 jc80Var) {
        m1383g(jc80Var.f2972a, 0);
        long jM9514a = jc80Var.m9514a() + kc80Var.m9597g();
        if (kc80Var.m9597g() <= 0 || jc80Var.m9514a() <= 0) {
            return m1401z(kc80Var, jc80Var);
        }
        if (jM9514a <= SystemClock.elapsedRealtime()) {
            m1397v("延迟直接执行");
            return m1401z(kc80Var, jc80Var);
        }
        m1397v("更新延迟时间:" + jc80Var.m9514a() + "#" + jM9514a);
        m1377E(jc80Var.f2972a, jM9514a);
        return 0;
    }

    /* JADX INFO: renamed from: B */
    public void m1374B(boolean z) {
        this.f1585l = z;
    }

    /* JADX INFO: renamed from: C */
    public void m1375C(i0m i0mVar, k0m k0mVar, j0m j0mVar, int i) {
        if (i0mVar == null) {
            i0mVar = new h0m(System.currentTimeMillis() + "_pop");
            CrashHelper.c(new RuntimeException("弹窗管控异常：".concat(j0mVar.getClass().getName())));
        }
        if (k0mVar == null) {
            CrashHelper.c(new RuntimeException("弹窗生命周期绑定不能为空：".concat(j0mVar.getClass().getName())));
            return;
        }
        kc80 kc80Var = new kc80(i0mVar.getOnlyName(), k0mVar, j0mVar);
        kc80Var.m9607s(i);
        j760<Integer, Integer> j760VarM1392q = m1392q(i0mVar.getOnlyName());
        if (j760VarM1392q != null) {
            kc80Var.m9607s(((Integer) j760VarM1392q.a).intValue());
            kc80Var.m9608t(((long) ((Integer) j760VarM1392q.b).intValue()) * 1000);
            kc80Var.m9606r(true);
        }
        m1376D(kc80Var);
    }

    /* JADX INFO: renamed from: D */
    public final void m1376D(kc80 kc80Var) {
        if (kc80Var.m9601m() == null) {
            return;
        }
        m1397v("展示的pageId: " + kc80Var.m9599i() + " , " + kc80Var.m9600j());
        jc80 jc80Var = this.f1578e.get(kc80Var.m9599i());
        if (jc80Var == null) {
            jc80Var = new jc80(kc80Var.m9599i());
            this.f1578e.put(kc80Var.m9599i(), jc80Var);
        }
        if (m1387k(jc80Var, kc80Var)) {
            return;
        }
        jc80Var.f2975d.add(kc80Var);
        a<pc80> aVar = this.f1579f.get(jc80Var.f2972a);
        String str = jc80Var.f2972a;
        if (aVar == null) {
            m1394s(str, kc80Var.m9601m());
        } else {
            m1400y(str, (pc80) this.f1579f.get(str).e(), "新增加");
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m1377E(String str, long j) {
        m1397v("加入map: " + str + " # " + j);
        this.f1581h.put(str, Long.valueOf(j));
        m1378G();
    }

    /* JADX INFO: renamed from: G */
    public final void m1378G() {
        if (this.f1583j.get()) {
            return;
        }
        m1397v("开始计时器");
        mkd0.m9911z(this.f1582i);
        this.f1582i = c.interval(500L, 1000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(new e30() { // from class: l.lc80
            public final void call(Object obj) {
                this.f3216a.m1396u((Long) obj);
            }
        }, new e30() { // from class: l.mc80
            public final void call(Object obj) {
                C0283a.m1369c((Throwable) obj);
            }
        });
        this.f1583j.set(true);
    }

    /* JADX INFO: renamed from: H */
    public final void m1379H() {
        if (this.f1581h.isEmpty()) {
            m1397v("停止计时器");
            mkd0.m9911z(this.f1582i);
            this.f1583j.set(false);
        }
    }

    /* JADX INFO: renamed from: I */
    public boolean m1380I() {
        return this.f1585l;
    }

    @Override // p007l.f0m
    /* JADX INFO: renamed from: a */
    public void mo1381a(j0m j0mVar) {
        kc80 kc80Var;
        m1397v("弹窗消失触发了:".concat(j0mVar.getClass().getName()));
        Iterator<Map.Entry<String, jc80>> it = this.f1578e.entrySet().iterator();
        while (it.hasNext()) {
            jc80 value = it.next().getValue();
            if (value != null && (kc80Var = value.f2973b) != null && kc80Var.m9602n() != null && value.f2973b.m9602n().equals(j0mVar)) {
                value.f2973b.m9604p();
                m1397v("弹窗消失：" + value.f2973b.m9600j());
                value.m9516c(null);
                value.m9517d(SystemClock.elapsedRealtime());
                String str = value.f2972a;
                m1400y(str, (pc80) this.f1579f.get(str).e(), "上一个消失");
                this.f1574a.onNext(value.f2972a);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void call(pc80 pc80Var) {
        PopLifecycleEvent popLifecycleEvent = pc80Var.f3709a;
        if (popLifecycleEvent == PopLifecycleEvent.DESTROY) {
            m1388l(pc80Var.f3711c);
            return;
        }
        if (popLifecycleEvent == PopLifecycleEvent.PENDING) {
            return;
        }
        if (popLifecycleEvent == PopLifecycleEvent.STOP) {
            m1384h(pc80Var.f3711c);
        } else if (popLifecycleEvent == PopLifecycleEvent.ACTIVE) {
            if (!pc80Var.f3710b) {
                m1384h(pc80Var.f3711c);
            }
            m1400y(pc80Var.f3711c, pc80Var, "声明周期");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1383g(String str, int i) {
        this.f1581h.remove(str);
        m1397v("移出map: " + str + " from " + i);
        m1379H();
    }

    /* JADX INFO: renamed from: h */
    public final void m1384h(String str) {
        m1383g(str, 1);
        jc80 jc80Var = this.f1578e.get(str);
        if (NullChecker.a(jc80Var)) {
            jc80Var.m9515b();
            if (vwb.J(jc80Var.f2975d)) {
                return;
            }
            jc80Var.f2975d.peek().m9608t(0L);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1385i() {
        m1397v("倒计时心跳：" + SystemClock.elapsedRealtime());
        for (String str : this.f1581h.keySet()) {
            if (SystemClock.elapsedRealtime() > this.f1581h.get(str).longValue()) {
                m1383g(str, 3);
                m1400y(str, (pc80) this.f1579f.get(str).e(), "倒计时结束");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1386j(jc80 jc80Var, pc80 pc80Var, String str) {
        kc80 kc80VarPeek;
        m1397v("begin  checkPopShowOnce # " + str + " group: " + jc80Var.f2972a);
        kc80 kc80Var = jc80Var.f2973b;
        if (!pc80Var.f3710b) {
            if (kc80Var != null) {
                m1397v("onHiddenChange by dismiss: " + kc80Var.m9600j() + " , " + kc80Var.m9599i());
                kc80Var.m9603o(false);
                return;
            }
            return;
        }
        if (kc80Var != null) {
            kc80 kc80VarPeek2 = jc80Var.f2975d.peek();
            if (kc80VarPeek2 == null) {
                m1397v("onHiddenChange by null: " + kc80Var.m9600j() + " , " + kc80Var.m9599i());
                kc80Var.m9603o(true);
                return;
            }
            if (kc80VarPeek2.m9598h() != 50000 && (kc80VarPeek2.m9598h() <= 500 || kc80Var.m9598h() > 0)) {
                m1397v("onHiddenChange by show: " + kc80Var.m9600j() + " , " + kc80Var.m9599i());
                kc80Var.m9603o(true);
                return;
            }
            m1397v("高优先级的来了要顶替掉");
            kc80VarPeek2.m9608t(0L);
            jc80Var.m9515b();
            jc80Var.m9517d(-2L);
            kc80Var.m9603o(false);
            kc80Var.m9594a(true);
            m1397v("重置当前弹窗Null");
            return;
        }
        m1397v("没有正在展示的 ");
        boolean z = false;
        boolean z2 = false;
        do {
            kc80VarPeek = jc80Var.f2975d.peek();
            if (kc80VarPeek != null) {
                int iM1373A = m1373A(kc80VarPeek, jc80Var);
                m1397v("响应pop " + kc80VarPeek.m9600j() + " result = " + iM1373A);
                boolean z3 = iM1373A > 0;
                boolean z4 = iM1373A == 0;
                kc80 kc80VarPoll = !z4 ? jc80Var.f2975d.poll() : null;
                m1397v("执行一次 " + iM1373A + " # " + z4);
                z = z3;
                z2 = z4;
                kc80VarPeek = kc80VarPoll;
            } else {
                m1397v("执行一次 null");
            }
            if (kc80VarPeek == null || z) {
                break;
            }
        } while (!z2);
        StringBuilder sb = new StringBuilder("update current ");
        sb.append(jc80Var.f2972a);
        sb.append(" , ");
        sb.append(kc80VarPeek != null ? kc80VarPeek.m9600j() : "null");
        m1397v(sb.toString());
        jc80Var.m9516c(kc80VarPeek);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1387k(jc80 jc80Var, kc80 kc80Var) {
        if (!this.f1575b) {
            return false;
        }
        kc80 kc80Var2 = jc80Var.f2973b;
        if (kc80Var2 != null && TextUtils.equals(kc80Var2.m9600j(), kc80Var.m9600j())) {
            return true;
        }
        if (vwb.J(jc80Var.f2975d)) {
            return false;
        }
        Iterator<kc80> it = jc80Var.f2975d.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().m9600j(), kc80Var.m9600j())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m1388l(String str) {
        jc80 jc80Var = this.f1578e.get(str);
        m1383g(str, 2);
        if (jc80Var != null) {
            if (!vwb.J(jc80Var.f2975d)) {
                jc80Var.f2975d.clear();
            }
            kc80 kc80Var = jc80Var.f2973b;
            if (kc80Var != null) {
                kc80Var.m9594a(true);
                jc80Var.m9516c(null);
            }
            this.f1578e.remove(str);
        }
        mkd0.m9911z(this.f1580g.get(str));
        this.f1580g.remove(str);
    }

    /* JADX INFO: renamed from: m */
    public void m1389m() {
        mkd0.m9911z(this.f1582i);
        synchronized (C0283a.class) {
            f1573m = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m1390n() {
        return ((Boolean) this.f1584k.get()).booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public void m1391o(String str, PopAction popAction) {
        kc80 kc80Var;
        kc80 kc80Var2;
        Iterator<Map.Entry<String, jc80>> it = this.f1578e.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                kc80Var = null;
                break;
            }
            jc80 value = it.next().getValue();
            if (value != null && (kc80Var2 = value.f2973b) != null && TextUtils.equals(kc80Var2.m9600j(), str)) {
                kc80Var = value.f2973b;
                break;
            }
        }
        if (kc80Var != null) {
            zvf0.D("e_popup_action", "p_tantan_popup", new j760[]{j760.a("popup_id", str), j760.a("popup_action_type", popAction.action), j760.a("popup_priority", Integer.valueOf(kc80Var.m9598h()))});
        }
    }

    /* JADX INFO: renamed from: q */
    public j760<Integer, Integer> m1392q(String str) {
        return this.f1577d.get(str);
    }

    /* JADX INFO: renamed from: r */
    public c<String> m1393r() {
        return this.f1574a;
    }

    /* JADX INFO: renamed from: s */
    public final void m1394s(String str, a<pc80> aVar) {
        this.f1579f.put(str, aVar);
        this.f1580g.put(str, aVar.doOnNext(new e30() { // from class: l.nc80
            public final void call(Object obj) {
                this.f3383a.m1395t((pc80) obj);
            }
        }).distinctUntilChanged().subscribe(this, new e30() { // from class: l.oc80
            public final void call(Object obj) {
                C0283a.m1370d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m1395t(pc80 pc80Var) {
        m1397v("状态变化了# " + pc80Var.f3711c + " " + pc80Var.f3709a.name() + " " + pc80Var.f3710b);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m1396u(Long l2) {
        m1385i();
    }

    /* JADX INFO: renamed from: v */
    public final void m1397v(String str) {
        du2.a("[PopLevel]", str);
    }

    /* JADX INFO: renamed from: w */
    public void m1398w(boolean z) {
        this.f1584k.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: x */
    public void m1399x(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    this.f1577d.put(next, j760.a(Integer.valueOf(jSONObject2.optInt("priority", 20000)), Integer.valueOf(jSONObject2.optInt("delayTimeInterval", 30))));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1400y(String str, pc80 pc80Var, String str2) {
        jc80 jc80Var = this.f1578e.get(str);
        if (jc80Var == null || pc80Var == null) {
            return;
        }
        if (!(vwb.J(jc80Var.f2975d) && jc80Var.f2973b == null) && pc80Var.f3709a == PopLifecycleEvent.ACTIVE) {
            m1386j(jc80Var, pc80Var, str2);
        }
    }

    /* JADX INFO: renamed from: z */
    public final int m1401z(kc80 kc80Var, jc80 jc80Var) {
        boolean zM9595b = kc80Var.m9595b();
        if (zM9595b) {
            jc80Var.m9517d(SystemClock.elapsedRealtime());
            kc80Var.m9602n().mo1139i(this);
            kc80Var.m9605q("p_tantan_popup");
        }
        return zM9595b ? 1 : -1;
    }
}
