package com.p046p1.mobile.android.p048ui.poplevel;

import android.os.SystemClock;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.c4g0;
import p149l.du2;
import p149l.e30;
import p149l.f0m;
import p149l.h0m;
import p149l.hpd0;
import p149l.i0m;
import p149l.j0m;
import p149l.j760;
import p149l.jc80;
import p149l.jo0;
import p149l.k0m;
import p149l.kc80;
import p149l.mkd0;
import p149l.pc80;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.android.ui.poplevel.a */
/* JADX INFO: loaded from: classes8.dex */
public class C4371a implements e30<pc80>, f0m {

    /* JADX INFO: renamed from: m */
    public static volatile C4371a f15874m;

    /* JADX INFO: renamed from: i */
    public c4g0 f15883i;

    /* JADX INFO: renamed from: a */
    public C22393b<String> f15875a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public boolean f15876b = true;

    /* JADX INFO: renamed from: e */
    public HashMap<String, jc80> f15879e = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap<String, Long> f15882h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j */
    public AtomicBoolean f15884j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    public hpd0 f15885k = new hpd0("pop_level_manager_debug", Boolean.FALSE);

    /* JADX INFO: renamed from: l */
    public boolean f15886l = false;

    /* JADX INFO: renamed from: c */
    public HashMap<String, i0m> f15877c = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public HashMap<String, C22392a<pc80>> f15880f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public HashMap<String, c4g0> f15881g = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, j760<Integer, Integer>> f15878d = new HashMap<>();

    /* JADX INFO: renamed from: F */
    public static int m21095F(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME;
        }
        if (i == 3) {
            return TantanException.Client.AccountService.GENERAL_BAD_REQUEST;
        }
        if (i == 5) {
            return 50000;
        }
        return ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m21097c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m21098d(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static C4371a m21100p() {
        if (f15874m == null) {
            synchronized (C4371a.class) {
                try {
                    if (f15874m == null) {
                        f15874m = new C4371a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15874m;
    }

    /* JADX INFO: renamed from: A */
    public final int m21101A(kc80 kc80Var, jc80 jc80Var) {
        m21111g(jc80Var.f117273a, 0);
        long jM140868a = jc80Var.m140868a() + kc80Var.m145351g();
        if (kc80Var.m145351g() <= 0 || jc80Var.m140868a() <= 0) {
            return m21129z(kc80Var, jc80Var);
        }
        if (jM140868a <= SystemClock.elapsedRealtime()) {
            m21125v("延迟直接执行");
            return m21129z(kc80Var, jc80Var);
        }
        m21125v("更新延迟时间:" + jc80Var.m140868a() + "#" + jM140868a);
        m21105E(jc80Var.f117273a, jM140868a);
        return 0;
    }

    /* JADX INFO: renamed from: B */
    public void m21102B(boolean z) {
        this.f15886l = z;
    }

    /* JADX INFO: renamed from: C */
    public void m21103C(i0m i0mVar, k0m k0mVar, j0m j0mVar, int i) {
        if (i0mVar == null) {
            i0mVar = new h0m(System.currentTimeMillis() + "_pop");
            CrashHelper.m81296c(new RuntimeException("弹窗管控异常：".concat(j0mVar.getClass().getName())));
        }
        if (k0mVar == null) {
            CrashHelper.m81296c(new RuntimeException("弹窗生命周期绑定不能为空：".concat(j0mVar.getClass().getName())));
            return;
        }
        kc80 kc80Var = new kc80(i0mVar.getOnlyName(), k0mVar, j0mVar);
        kc80Var.m145361s(i);
        j760<Integer, Integer> j760VarM21120q = m21120q(i0mVar.getOnlyName());
        if (j760VarM21120q != null) {
            kc80Var.m145361s(j760VarM21120q.f116564a.intValue());
            kc80Var.m145362t(((long) j760VarM21120q.f116565b.intValue()) * 1000);
            kc80Var.m145360r(true);
        }
        m21104D(kc80Var);
    }

    /* JADX INFO: renamed from: D */
    public final void m21104D(kc80 kc80Var) {
        if (kc80Var.m145355m() == null) {
            return;
        }
        m21125v("展示的pageId: " + kc80Var.m145353i() + " , " + kc80Var.m145354j());
        jc80 jc80Var = this.f15879e.get(kc80Var.m145353i());
        if (jc80Var == null) {
            jc80Var = new jc80(kc80Var.m145353i());
            this.f15879e.put(kc80Var.m145353i(), jc80Var);
        }
        if (m21115k(jc80Var, kc80Var)) {
            return;
        }
        jc80Var.f117276d.add(kc80Var);
        C22392a<pc80> c22392a = this.f15880f.get(jc80Var.f117273a);
        String str = jc80Var.f117273a;
        if (c22392a == null) {
            m21122s(str, kc80Var.m145355m());
        } else {
            m21128y(str, this.f15880f.get(str).m221515e(), "新增加");
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m21105E(String str, long j) {
        m21125v("加入map: " + str + " # " + j);
        this.f15882h.put(str, Long.valueOf(j));
        m21106G();
    }

    /* JADX INFO: renamed from: G */
    public final void m21106G() {
        if (this.f15884j.get()) {
            return;
        }
        m21125v("开始计时器");
        mkd0.m154992z(this.f15883i);
        this.f15883i = C22306c.interval(500L, 1000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(new e30() { // from class: l.lc80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127386a.m21124u((Long) obj);
            }
        }, new e30() { // from class: l.mc80
            @Override // p149l.e30
            public final void call(Object obj) {
                C4371a.m21097c((Throwable) obj);
            }
        });
        this.f15884j.set(true);
    }

    /* JADX INFO: renamed from: H */
    public final void m21107H() {
        if (this.f15882h.isEmpty()) {
            m21125v("停止计时器");
            mkd0.m154992z(this.f15883i);
            this.f15884j.set(false);
        }
    }

    /* JADX INFO: renamed from: I */
    public boolean m21108I() {
        return this.f15886l;
    }

    @Override // p149l.f0m
    /* JADX INFO: renamed from: a */
    public void mo21109a(j0m j0mVar) {
        kc80 kc80Var;
        m21125v("弹窗消失触发了:".concat(j0mVar.getClass().getName()));
        Iterator<Map.Entry<String, jc80>> it = this.f15879e.entrySet().iterator();
        while (it.hasNext()) {
            jc80 value = it.next().getValue();
            if (value != null && (kc80Var = value.f117274b) != null && kc80Var.m145356n() != null && value.f117274b.m145356n().equals(j0mVar)) {
                value.f117274b.m145358p();
                m21125v("弹窗消失：" + value.f117274b.m145354j());
                value.m140870c(null);
                value.m140871d(SystemClock.elapsedRealtime());
                String str = value.f117273a;
                m21128y(str, this.f15880f.get(str).m221515e(), "上一个消失");
                this.f15875a.onNext(value.f117273a);
                return;
            }
        }
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void call(pc80 pc80Var) {
        PopLifecycleEvent popLifecycleEvent = pc80Var.f148149a;
        if (popLifecycleEvent == PopLifecycleEvent.DESTROY) {
            m21116l(pc80Var.f148151c);
            return;
        }
        if (popLifecycleEvent == PopLifecycleEvent.PENDING) {
            return;
        }
        if (popLifecycleEvent == PopLifecycleEvent.STOP) {
            m21112h(pc80Var.f148151c);
        } else if (popLifecycleEvent == PopLifecycleEvent.ACTIVE) {
            if (!pc80Var.f148150b) {
                m21112h(pc80Var.f148151c);
            }
            m21128y(pc80Var.f148151c, pc80Var, "声明周期");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m21111g(String str, int i) {
        this.f15882h.remove(str);
        m21125v("移出map: " + str + " from " + i);
        m21107H();
    }

    /* JADX INFO: renamed from: h */
    public final void m21112h(String str) {
        m21111g(str, 1);
        jc80 jc80Var = this.f15879e.get(str);
        if (NullChecker.m81303a(jc80Var)) {
            jc80Var.m140869b();
            if (vwb.m200296J(jc80Var.f117276d)) {
                return;
            }
            jc80Var.f117276d.peek().m145362t(0L);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m21113i() {
        m21125v("倒计时心跳：" + SystemClock.elapsedRealtime());
        for (String str : this.f15882h.keySet()) {
            if (SystemClock.elapsedRealtime() > this.f15882h.get(str).longValue()) {
                m21111g(str, 3);
                m21128y(str, this.f15880f.get(str).m221515e(), "倒计时结束");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m21114j(jc80 jc80Var, pc80 pc80Var, String str) {
        kc80 kc80VarPeek;
        m21125v("begin  checkPopShowOnce # " + str + " group: " + jc80Var.f117273a);
        kc80 kc80Var = jc80Var.f117274b;
        if (!pc80Var.f148150b) {
            if (kc80Var != null) {
                m21125v("onHiddenChange by dismiss: " + kc80Var.m145354j() + " , " + kc80Var.m145353i());
                kc80Var.m145357o(false);
                return;
            }
            return;
        }
        if (kc80Var != null) {
            kc80 kc80VarPeek2 = jc80Var.f117276d.peek();
            if (kc80VarPeek2 == null) {
                m21125v("onHiddenChange by null: " + kc80Var.m145354j() + " , " + kc80Var.m145353i());
                kc80Var.m145357o(true);
                return;
            }
            if (kc80VarPeek2.m145352h() != 50000 && (kc80VarPeek2.m145352h() <= 500 || kc80Var.m145352h() > 0)) {
                m21125v("onHiddenChange by show: " + kc80Var.m145354j() + " , " + kc80Var.m145353i());
                kc80Var.m145357o(true);
                return;
            }
            m21125v("高优先级的来了要顶替掉");
            kc80VarPeek2.m145362t(0L);
            jc80Var.m140869b();
            jc80Var.m140871d(-2L);
            kc80Var.m145357o(false);
            kc80Var.m145348a(true);
            m21125v("重置当前弹窗Null");
            return;
        }
        m21125v("没有正在展示的 ");
        boolean z = false;
        boolean z2 = false;
        do {
            kc80VarPeek = jc80Var.f117276d.peek();
            if (kc80VarPeek != null) {
                int iM21101A = m21101A(kc80VarPeek, jc80Var);
                m21125v("响应pop " + kc80VarPeek.m145354j() + " result = " + iM21101A);
                boolean z3 = iM21101A > 0;
                boolean z4 = iM21101A == 0;
                kc80 kc80VarPoll = !z4 ? jc80Var.f117276d.poll() : null;
                m21125v("执行一次 " + iM21101A + " # " + z4);
                z = z3;
                z2 = z4;
                kc80VarPeek = kc80VarPoll;
            } else {
                m21125v("执行一次 null");
            }
            if (kc80VarPeek == null || z) {
                break;
            }
        } while (!z2);
        StringBuilder sb = new StringBuilder("update current ");
        sb.append(jc80Var.f117273a);
        sb.append(" , ");
        sb.append(kc80VarPeek != null ? kc80VarPeek.m145354j() : "null");
        m21125v(sb.toString());
        jc80Var.m140870c(kc80VarPeek);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m21115k(jc80 jc80Var, kc80 kc80Var) {
        if (!this.f15876b) {
            return false;
        }
        kc80 kc80Var2 = jc80Var.f117274b;
        if (kc80Var2 != null && TextUtils.equals(kc80Var2.m145354j(), kc80Var.m145354j())) {
            return true;
        }
        if (vwb.m200296J(jc80Var.f117276d)) {
            return false;
        }
        Iterator<kc80> it = jc80Var.f117276d.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().m145354j(), kc80Var.m145354j())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m21116l(String str) {
        jc80 jc80Var = this.f15879e.get(str);
        m21111g(str, 2);
        if (jc80Var != null) {
            if (!vwb.m200296J(jc80Var.f117276d)) {
                jc80Var.f117276d.clear();
            }
            kc80 kc80Var = jc80Var.f117274b;
            if (kc80Var != null) {
                kc80Var.m145348a(true);
                jc80Var.m140870c(null);
            }
            this.f15879e.remove(str);
        }
        mkd0.m154992z(this.f15881g.get(str));
        this.f15881g.remove(str);
    }

    /* JADX INFO: renamed from: m */
    public void m21117m() {
        mkd0.m154992z(this.f15883i);
        synchronized (C4371a.class) {
            f15874m = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m21118n() {
        return this.f15885k.get().booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public void m21119o(String str, PopAction popAction) {
        kc80 kc80Var;
        kc80 kc80Var2;
        Iterator<Map.Entry<String, jc80>> it = this.f15879e.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                kc80Var = null;
                break;
            }
            jc80 value = it.next().getValue();
            if (value != null && (kc80Var2 = value.f117274b) != null && TextUtils.equals(kc80Var2.m145354j(), str)) {
                kc80Var = value.f117274b;
                break;
            }
        }
        if (kc80Var != null) {
            zvf0.m220371D("e_popup_action", "p_tantan_popup", j760.m140076a("popup_id", str), j760.m140076a("popup_action_type", popAction.action), j760.m140076a("popup_priority", Integer.valueOf(kc80Var.m145352h())));
        }
    }

    /* JADX INFO: renamed from: q */
    public j760<Integer, Integer> m21120q(String str) {
        return this.f15878d.get(str);
    }

    /* JADX INFO: renamed from: r */
    public C22306c<String> m21121r() {
        return this.f15875a;
    }

    /* JADX INFO: renamed from: s */
    public final void m21122s(String str, C22392a<pc80> c22392a) {
        this.f15880f.put(str, c22392a);
        this.f15881g.put(str, c22392a.doOnNext(new e30() { // from class: l.nc80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138137a.m21123t((pc80) obj);
            }
        }).distinctUntilChanged().subscribe(this, new e30() { // from class: l.oc80
            @Override // p149l.e30
            public final void call(Object obj) {
                C4371a.m21098d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m21123t(pc80 pc80Var) {
        m21125v("状态变化了# " + pc80Var.f148151c + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + pc80Var.f148149a.name() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + pc80Var.f148150b);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m21124u(Long l2) {
        m21113i();
    }

    /* JADX INFO: renamed from: v */
    public final void m21125v(String str) {
        du2.m113670a("[PopLevel]", str);
    }

    /* JADX INFO: renamed from: w */
    public void m21126w(boolean z) {
        this.f15885k.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: x */
    public void m21127x(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    this.f15878d.put(next, j760.m140076a(Integer.valueOf(jSONObject2.optInt("priority", ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME)), Integer.valueOf(jSONObject2.optInt("delayTimeInterval", 30))));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m21128y(String str, pc80 pc80Var, String str2) {
        jc80 jc80Var = this.f15879e.get(str);
        if (jc80Var == null || pc80Var == null) {
            return;
        }
        if (!(vwb.m200296J(jc80Var.f117276d) && jc80Var.f117274b == null) && pc80Var.f148149a == PopLifecycleEvent.ACTIVE) {
            m21114j(jc80Var, pc80Var, str2);
        }
    }

    /* JADX INFO: renamed from: z */
    public final int m21129z(kc80 kc80Var, jc80 jc80Var) {
        boolean zM145349b = kc80Var.m145349b();
        if (zM145349b) {
            jc80Var.m140871d(SystemClock.elapsedRealtime());
            kc80Var.m145356n().mo20868i(this);
            kc80Var.m145359q("p_tantan_popup");
        }
        return zM145349b ? 1 : -1;
    }
}
