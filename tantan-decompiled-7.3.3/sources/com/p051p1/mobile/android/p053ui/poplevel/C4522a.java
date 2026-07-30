package com.p051p1.mobile.android.p053ui.poplevel;

import android.os.SystemClock;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.b3m;
import p153l.c3m;
import p153l.d3m;
import p153l.e3m;
import p153l.fo0;
import p153l.i4g0;
import p153l.jxd0;
import p153l.jyb;
import p153l.kcg0;
import p153l.pf60;
import p153l.pk80;
import p153l.psd0;
import p153l.qk80;
import p153l.tu2;
import p153l.vk80;
import p153l.y20;
import p153l.z2m;

/* JADX INFO: renamed from: com.p1.mobile.android.ui.poplevel.a */
/* JADX INFO: loaded from: classes8.dex */
public class C4522a implements y20<vk80>, z2m {

    /* JADX INFO: renamed from: m */
    public static volatile C4522a f16593m;

    /* JADX INFO: renamed from: i */
    public kcg0 f16602i;

    /* JADX INFO: renamed from: a */
    public C22508b<String> f16594a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public boolean f16595b = true;

    /* JADX INFO: renamed from: e */
    public HashMap<String, pk80> f16598e = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap<String, Long> f16601h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j */
    public AtomicBoolean f16603j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    public jxd0 f16604k = new jxd0("pop_level_manager_debug", Boolean.FALSE);

    /* JADX INFO: renamed from: l */
    public boolean f16605l = false;

    /* JADX INFO: renamed from: c */
    public HashMap<String, c3m> f16596c = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public HashMap<String, C22507a<vk80>> f16599f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public HashMap<String, kcg0> f16600g = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, pf60<Integer, Integer>> f16597d = new HashMap<>();

    /* JADX INFO: renamed from: F */
    public static int m22094F(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME;
        }
        if (i == 3) {
            return TantanException.Client.AccountService.GENERAL_BAD_REQUEST;
        }
        return i == 5 ? SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH : ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m22096c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m22097d(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static C4522a m22099p() {
        if (f16593m == null) {
            synchronized (C4522a.class) {
                try {
                    if (f16593m == null) {
                        f16593m = new C4522a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16593m;
    }

    /* JADX INFO: renamed from: A */
    public final int m22100A(qk80 qk80Var, pk80 pk80Var) {
        m22110g(pk80Var.f152812a, 0);
        long jM172590a = pk80Var.m172590a() + qk80Var.m176930g();
        if (qk80Var.m176930g() <= 0 || pk80Var.m172590a() <= 0) {
            return m22128z(qk80Var, pk80Var);
        }
        if (jM172590a <= SystemClock.elapsedRealtime()) {
            m22124v("延迟直接执行");
            return m22128z(qk80Var, pk80Var);
        }
        m22124v("更新延迟时间:" + pk80Var.m172590a() + "#" + jM172590a);
        m22104E(pk80Var.f152812a, jM172590a);
        return 0;
    }

    /* JADX INFO: renamed from: B */
    public void m22101B(boolean z) {
        this.f16605l = z;
    }

    /* JADX INFO: renamed from: C */
    public void m22102C(c3m c3mVar, e3m e3mVar, d3m d3mVar, int i) {
        if (c3mVar == null) {
            c3mVar = new b3m(System.currentTimeMillis() + "_pop");
            CrashHelper.m82479c(new RuntimeException("弹窗管控异常：".concat(d3mVar.getClass().getName())));
        }
        if (e3mVar == null) {
            CrashHelper.m82479c(new RuntimeException("弹窗生命周期绑定不能为空：".concat(d3mVar.getClass().getName())));
            return;
        }
        qk80 qk80Var = new qk80(c3mVar.getOnlyName(), e3mVar, d3mVar);
        qk80Var.m176940s(i);
        pf60<Integer, Integer> pf60VarM22119q = m22119q(c3mVar.getOnlyName());
        if (pf60VarM22119q != null) {
            qk80Var.m176940s(pf60VarM22119q.f152156a.intValue());
            qk80Var.m176941t(((long) pf60VarM22119q.f152157b.intValue()) * 1000);
            qk80Var.m176939r(true);
        }
        m22103D(qk80Var);
    }

    /* JADX INFO: renamed from: D */
    public final void m22103D(qk80 qk80Var) {
        if (qk80Var.m176934m() == null) {
            return;
        }
        m22124v("展示的pageId: " + qk80Var.m176932i() + " , " + qk80Var.m176933j());
        pk80 pk80Var = this.f16598e.get(qk80Var.m176932i());
        if (pk80Var == null) {
            pk80Var = new pk80(qk80Var.m176932i());
            this.f16598e.put(qk80Var.m176932i(), pk80Var);
        }
        if (m22114k(pk80Var, qk80Var)) {
            return;
        }
        pk80Var.f152815d.add(qk80Var);
        C22507a<vk80> c22507a = this.f16599f.get(pk80Var.f152812a);
        String str = pk80Var.f152812a;
        if (c22507a == null) {
            m22121s(str, qk80Var.m176934m());
        } else {
            m22127y(str, this.f16599f.get(str).m222761e(), "新增加");
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m22104E(String str, long j) {
        m22124v("加入map: " + str + " # " + j);
        this.f16601h.put(str, Long.valueOf(j));
        m22105G();
    }

    /* JADX INFO: renamed from: G */
    public final void m22105G() {
        if (this.f16603j.get()) {
            return;
        }
        m22124v("开始计时器");
        psd0.m173633z(this.f16602i);
        this.f16602i = C22421c.interval(500L, 1000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(new y20() { // from class: l.rk80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163548a.m22123u((Long) obj);
            }
        }, new y20() { // from class: l.sk80
            @Override // p153l.y20
            public final void call(Object obj) {
                C4522a.m22096c((Throwable) obj);
            }
        });
        this.f16603j.set(true);
    }

    /* JADX INFO: renamed from: H */
    public final void m22106H() {
        if (this.f16601h.isEmpty()) {
            m22124v("停止计时器");
            psd0.m173633z(this.f16602i);
            this.f16603j.set(false);
        }
    }

    /* JADX INFO: renamed from: I */
    public boolean m22107I() {
        return this.f16605l;
    }

    @Override // p153l.z2m
    /* JADX INFO: renamed from: a */
    public void mo22108a(d3m d3mVar) {
        qk80 qk80Var;
        m22124v("弹窗消失触发了:".concat(d3mVar.getClass().getName()));
        Iterator<Map.Entry<String, pk80>> it = this.f16598e.entrySet().iterator();
        while (it.hasNext()) {
            pk80 value = it.next().getValue();
            if (value != null && (qk80Var = value.f152813b) != null && qk80Var.m176935n() != null && value.f152813b.m176935n().equals(d3mVar)) {
                value.f152813b.m176937p();
                m22124v("弹窗消失：" + value.f152813b.m176933j());
                value.m172592c(null);
                value.m172593d(SystemClock.elapsedRealtime());
                String str = value.f152812a;
                m22127y(str, this.f16599f.get(str).m222761e(), "上一个消失");
                this.f16594a.onNext(value.f152812a);
                return;
            }
        }
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void call(vk80 vk80Var) {
        PopLifecycleEvent popLifecycleEvent = vk80Var.f184465a;
        if (popLifecycleEvent == PopLifecycleEvent.DESTROY) {
            m22115l(vk80Var.f184467c);
            return;
        }
        if (popLifecycleEvent == PopLifecycleEvent.PENDING) {
            return;
        }
        if (popLifecycleEvent == PopLifecycleEvent.STOP) {
            m22111h(vk80Var.f184467c);
        } else if (popLifecycleEvent == PopLifecycleEvent.ACTIVE) {
            if (!vk80Var.f184466b) {
                m22111h(vk80Var.f184467c);
            }
            m22127y(vk80Var.f184467c, vk80Var, "声明周期");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m22110g(String str, int i) {
        this.f16601h.remove(str);
        m22124v("移出map: " + str + " from " + i);
        m22106H();
    }

    /* JADX INFO: renamed from: h */
    public final void m22111h(String str) {
        m22110g(str, 1);
        pk80 pk80Var = this.f16598e.get(str);
        if (NullChecker.m82486a(pk80Var)) {
            pk80Var.m172591b();
            if (jyb.m147479J(pk80Var.f152815d)) {
                return;
            }
            pk80Var.f152815d.peek().m176941t(0L);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m22112i() {
        m22124v("倒计时心跳：" + SystemClock.elapsedRealtime());
        for (String str : this.f16601h.keySet()) {
            if (SystemClock.elapsedRealtime() > this.f16601h.get(str).longValue()) {
                m22110g(str, 3);
                m22127y(str, this.f16599f.get(str).m222761e(), "倒计时结束");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m22113j(pk80 pk80Var, vk80 vk80Var, String str) {
        qk80 qk80VarPeek;
        m22124v("begin  checkPopShowOnce # " + str + " group: " + pk80Var.f152812a);
        qk80 qk80Var = pk80Var.f152813b;
        if (!vk80Var.f184466b) {
            if (qk80Var != null) {
                m22124v("onHiddenChange by dismiss: " + qk80Var.m176933j() + " , " + qk80Var.m176932i());
                qk80Var.m176936o(false);
                return;
            }
            return;
        }
        if (qk80Var != null) {
            qk80 qk80VarPeek2 = pk80Var.f152815d.peek();
            if (qk80VarPeek2 == null) {
                m22124v("onHiddenChange by null: " + qk80Var.m176933j() + " , " + qk80Var.m176932i());
                qk80Var.m176936o(true);
                return;
            }
            if (qk80VarPeek2.m176931h() != 50000 && (qk80VarPeek2.m176931h() <= 500 || qk80Var.m176931h() > 0)) {
                m22124v("onHiddenChange by show: " + qk80Var.m176933j() + " , " + qk80Var.m176932i());
                qk80Var.m176936o(true);
                return;
            }
            m22124v("高优先级的来了要顶替掉");
            qk80VarPeek2.m176941t(0L);
            pk80Var.m172591b();
            pk80Var.m172593d(-2L);
            qk80Var.m176936o(false);
            qk80Var.m176927a(true);
            m22124v("重置当前弹窗Null");
            return;
        }
        m22124v("没有正在展示的 ");
        boolean z = false;
        boolean z2 = false;
        do {
            qk80VarPeek = pk80Var.f152815d.peek();
            if (qk80VarPeek != null) {
                int iM22100A = m22100A(qk80VarPeek, pk80Var);
                m22124v("响应pop " + qk80VarPeek.m176933j() + " result = " + iM22100A);
                boolean z3 = iM22100A > 0;
                boolean z4 = iM22100A == 0;
                qk80 qk80VarPoll = !z4 ? pk80Var.f152815d.poll() : null;
                m22124v("执行一次 " + iM22100A + " # " + z4);
                z = z3;
                z2 = z4;
                qk80VarPeek = qk80VarPoll;
            } else {
                m22124v("执行一次 null");
            }
            if (qk80VarPeek == null || z) {
                break;
            }
        } while (!z2);
        StringBuilder sb = new StringBuilder("update current ");
        sb.append(pk80Var.f152812a);
        sb.append(" , ");
        sb.append(qk80VarPeek != null ? qk80VarPeek.m176933j() : "null");
        m22124v(sb.toString());
        pk80Var.m172592c(qk80VarPeek);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m22114k(pk80 pk80Var, qk80 qk80Var) {
        if (!this.f16595b) {
            return false;
        }
        qk80 qk80Var2 = pk80Var.f152813b;
        if (qk80Var2 != null && TextUtils.equals(qk80Var2.m176933j(), qk80Var.m176933j())) {
            return true;
        }
        if (jyb.m147479J(pk80Var.f152815d)) {
            return false;
        }
        Iterator<qk80> it = pk80Var.f152815d.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().m176933j(), qk80Var.m176933j())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m22115l(String str) {
        pk80 pk80Var = this.f16598e.get(str);
        m22110g(str, 2);
        if (pk80Var != null) {
            if (!jyb.m147479J(pk80Var.f152815d)) {
                pk80Var.f152815d.clear();
            }
            qk80 qk80Var = pk80Var.f152813b;
            if (qk80Var != null) {
                qk80Var.m176927a(true);
                pk80Var.m172592c(null);
            }
            this.f16598e.remove(str);
        }
        psd0.m173633z(this.f16600g.get(str));
        this.f16600g.remove(str);
    }

    /* JADX INFO: renamed from: m */
    public void m22116m() {
        psd0.m173633z(this.f16602i);
        synchronized (C4522a.class) {
            f16593m = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m22117n() {
        return this.f16604k.get().booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public void m22118o(String str, PopAction popAction) {
        qk80 qk80Var;
        qk80 qk80Var2;
        Iterator<Map.Entry<String, pk80>> it = this.f16598e.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                qk80Var = null;
                break;
            }
            pk80 value = it.next().getValue();
            if (value != null && (qk80Var2 = value.f152813b) != null && TextUtils.equals(qk80Var2.m176933j(), str)) {
                qk80Var = value.f152813b;
                break;
            }
        }
        if (qk80Var != null) {
            i4g0.m138495D("e_popup_action", "p_tantan_popup", pf60.m172085a("popup_id", str), pf60.m172085a("popup_action_type", popAction.action), pf60.m172085a("popup_priority", Integer.valueOf(qk80Var.m176931h())));
        }
    }

    /* JADX INFO: renamed from: q */
    public pf60<Integer, Integer> m22119q(String str) {
        return this.f16597d.get(str);
    }

    /* JADX INFO: renamed from: r */
    public C22421c<String> m22120r() {
        return this.f16594a;
    }

    /* JADX INFO: renamed from: s */
    public final void m22121s(String str, C22507a<vk80> c22507a) {
        this.f16599f.put(str, c22507a);
        this.f16600g.put(str, c22507a.doOnNext(new y20() { // from class: l.tk80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174694a.m22122t((vk80) obj);
            }
        }).distinctUntilChanged().subscribe(this, new y20() { // from class: l.uk80
            @Override // p153l.y20
            public final void call(Object obj) {
                C4522a.m22097d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m22122t(vk80 vk80Var) {
        m22124v("状态变化了# " + vk80Var.f184467c + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + vk80Var.f184465a.name() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + vk80Var.f184466b);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m22123u(Long l2) {
        m22112i();
    }

    /* JADX INFO: renamed from: v */
    public final void m22124v(String str) {
        tu2.m192703a("[PopLevel]", str);
    }

    /* JADX INFO: renamed from: w */
    public void m22125w(boolean z) {
        this.f16604k.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: x */
    public void m22126x(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    this.f16597d.put(next, pf60.m172085a(Integer.valueOf(jSONObject2.optInt("priority", ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME)), Integer.valueOf(jSONObject2.optInt("delayTimeInterval", 30))));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m22127y(String str, vk80 vk80Var, String str2) {
        pk80 pk80Var = this.f16598e.get(str);
        if (pk80Var == null || vk80Var == null) {
            return;
        }
        if (!(jyb.m147479J(pk80Var.f152815d) && pk80Var.f152813b == null) && vk80Var.f184465a == PopLifecycleEvent.ACTIVE) {
            m22113j(pk80Var, vk80Var, str2);
        }
    }

    /* JADX INFO: renamed from: z */
    public final int m22128z(qk80 qk80Var, pk80 pk80Var) {
        boolean zM176928b = qk80Var.m176928b();
        if (zM176928b) {
            pk80Var.m172593d(SystemClock.elapsedRealtime());
            qk80Var.m176935n().mo21867i(this);
            qk80Var.m176938q("p_tantan_popup");
        }
        return zM176928b ? 1 : -1;
    }
}
