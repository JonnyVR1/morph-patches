package com.p000p1.mobile.putong.core.api;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.data.AdvancedSettings;
import com.p1.mobile.putong.core.data.JustRealUserList;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.hpd0;
import l.j760;
import l.lsi0;
import l.mqi0;
import l.roj0;
import l.tpd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.xaj0;
import l.zpd0;
import org.json.JSONArray;
import org.json.JSONObject;
import p006l.ax6;
import p006l.ura;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreJustVerificationCardApi extends ax6 {

    /* JADX INFO: renamed from: R */
    public a<JustRealStatus> f3202R;

    /* JADX INFO: renamed from: S */
    public b<User> f3203S;

    /* JADX INFO: renamed from: T */
    public b<roj0> f3204T;

    /* JADX INFO: renamed from: U */
    public b<roj0> f3205U;

    /* JADX INFO: renamed from: V */
    public JustRealStatus f3206V;

    /* JADX INFO: renamed from: W */
    public List<C0144a> f3207W;

    /* JADX INFO: renamed from: X */
    public JustRealUserList f3208X;

    /* JADX INFO: renamed from: Y */
    public b<xaj0<User, Integer, Integer>> f3209Y;

    /* JADX INFO: renamed from: Z */
    public b<xaj0<User, Integer, Integer>> f3210Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f3211a0;

    /* JADX INFO: renamed from: b0 */
    public zpd0 f3212b0;

    /* JADX INFO: renamed from: c0 */
    public tpd0 f3213c0;

    /* JADX INFO: renamed from: d0 */
    public hpd0 f3214d0;

    /* JADX INFO: renamed from: e0 */
    public hpd0 f3215e0;

    /* JADX INFO: renamed from: f0 */
    public hpd0 f3216f0;

    /* JADX INFO: renamed from: g0 */
    public hpd0 f3217g0;

    /* JADX INFO: renamed from: h0 */
    public uqd0 f3218h0;

    /* JADX INFO: renamed from: i0 */
    public a<j760<JustRealStatus, Integer>> f3219i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f3220j0;

    public enum JustRealStatus {
        IDLE(0, "初始状态", false, "off"),
        PRE_START(1, "试用准备中", true, "trial"),
        TRIALING(2, "试用中", true, "trial"),
        RUNNING(3, "认证&svip用户直接使用", true, "on"),
        CLICK_RUNNING(4, "认证&svip用户直接使用-左上角点击触发的", true, "on"),
        FINISH(5, "结束", false, "off");

        public String desc;
        public boolean started;
        public String status;
        public int step;

        JustRealStatus(int i, String str, boolean z, String str2) {
            this.step = i;
            this.desc = str;
            this.started = z;
            this.status = str2;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreJustVerificationCardApi$a */
    public static final class C0144a {

        /* JADX INFO: renamed from: a */
        public User f3221a;

        /* JADX INFO: renamed from: b */
        public SwipeDirection f3222b;

        /* JADX INFO: renamed from: c */
        public boolean f3223c = false;

        public C0144a(User user, SwipeDirection swipeDirection) {
            this.f3221a = user;
            this.f3222b = swipeDirection;
        }
    }

    public CoreJustVerificationCardApi(C0158c c0158c) {
        super(c0158c);
        this.f3202R = a.b();
        this.f3203S = b.b();
        this.f3204T = b.b();
        this.f3205U = b.b();
        this.f3206V = JustRealStatus.IDLE;
        this.f3209Y = b.b();
        this.f3210Z = b.b();
        this.f3211a0 = false;
        this.f3212b0 = new zpd0("just_real_trial_time_" + CoreModule.m1850H().userId(), 0L);
        this.f3213c0 = new tpd0("just_real_residue_count_" + CoreModule.m1850H().userId(), 10);
        String str = "just_real_has_show_trial_dlg_" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f3214d0 = new hpd0(str, bool);
        this.f3215e0 = new hpd0("just_real_has_show_toast_" + CoreModule.m1850H().userId(), bool);
        this.f3216f0 = new hpd0("just_real_debug_request", bool);
        this.f3217g0 = new hpd0("just_real_debug_open", bool);
        this.f3218h0 = new uqd0("has_like_real_user_" + CoreModule.m1850H().userId(), "");
        this.f3219i0 = a.b();
        this.f3220j0 = false;
        this.f3207W = new ArrayList();
        try {
            this.f3208X = (JustRealUserList) JustRealUserList.JSON_ADAPTER.parse((String) this.f3218h0.get());
        } catch (Exception unused) {
        }
        if (this.f3208X == null) {
            this.f3208X = JustRealUserList.new_();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m2162A3(User user, float f, float f2) {
        this.f3209Y.onNext(xaj0.a(user, Integer.valueOf((int) f), Integer.valueOf((int) f2)));
        m2168G3();
    }

    /* JADX INFO: renamed from: B3 */
    public void m2163B3(User user, float f, float f2) {
        this.f3210Z.onNext(xaj0.a(user, Integer.valueOf((int) f), Integer.valueOf((int) f2)));
    }

    /* JADX INFO: renamed from: C3 */
    public final void m2164C3() {
        this.f3219i0.onNext(j760.a(this.f3206V, (Integer) this.f3213c0.get()));
    }

    /* JADX INFO: renamed from: D3 */
    public void m2165D3(User user) {
        this.f3203S.onNext(user);
    }

    /* JADX INFO: renamed from: E3 */
    public final void m2166E3() {
        m2169H3(this.f3206V);
    }

    /* JADX INFO: renamed from: F3 */
    public c<JustRealStatus> m2167F3() {
        return this.f3202R;
    }

    /* JADX INFO: renamed from: G3 */
    public void m2168G3() {
        if (this.f3206V == JustRealStatus.PRE_START) {
            JustRealStatus justRealStatus = JustRealStatus.TRIALING;
            this.f3206V = justRealStatus;
            m2169H3(justRealStatus);
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final void m2169H3(JustRealStatus justRealStatus) {
        this.f3202R.onNext(justRealStatus);
    }

    /* JADX INFO: renamed from: e3 */
    public final void m2170e3(List<String> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f3208X.uids.addAll(list);
        if (this.f3208X.uids.size() > 200) {
            int size = this.f3208X.uids.size() - 200;
            JustRealUserList justRealUserList = this.f3208X;
            List list2 = justRealUserList.uids;
            justRealUserList.uids = list2.subList(size, list2.size());
        }
        this.f3218h0.put(this.f3208X.toJson());
    }

    /* JADX INFO: renamed from: f3 */
    public void m2171f3(SwipeDirection swipeDirection, User user) {
        tpd0 tpd0Var = this.f3213c0;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() - 1));
        this.f3207W.add(new C0144a(user, swipeDirection));
        if ((swipeDirection == SwipeDirection.UP || swipeDirection == SwipeDirection.RIGHT) && this.f3206V == JustRealStatus.PRE_START) {
            this.f3206V = JustRealStatus.TRIALING;
            m2166E3();
        }
        if (((Integer) this.f3213c0.get()).intValue() == 0) {
            JustRealStatus justRealStatus = this.f3206V;
            if (justRealStatus == JustRealStatus.TRIALING || justRealStatus == JustRealStatus.PRE_START) {
                if (vwb.J(m2177l3())) {
                    lsi0.y("只看认证用户试用体验已结束");
                }
                m2172g3();
            }
            this.f3206V = JustRealStatus.FINISH;
            m2166E3();
            m2188w3();
        }
        m2164C3();
    }

    /* JADX INFO: renamed from: g3 */
    public final void m2172g3() {
        ArrayList arrayList = new ArrayList();
        for (C0144a c0144a : this.f3207W) {
            SwipeDirection swipeDirection = c0144a.f3222b;
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                arrayList.add(c0144a.f3221a);
            }
        }
        if (vwb.J(arrayList)) {
            return;
        }
        this.f3204T.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: h3 */
    public void m2173h3() {
        JustRealStatus justRealStatus = this.f3206V;
        if (justRealStatus == JustRealStatus.PRE_START || justRealStatus == JustRealStatus.TRIALING) {
            this.f3206V = JustRealStatus.FINISH;
            m2166E3();
            m2164C3();
        }
    }

    /* JADX INFO: renamed from: i3 */
    public List<User> m2174i3() {
        ArrayList arrayList = new ArrayList();
        for (C0144a c0144a : this.f3207W) {
            SwipeDirection swipeDirection = c0144a.f3222b;
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                arrayList.add(c0144a.f3221a);
            }
        }
        this.f3207W.clear();
        this.f3205U.onNext(roj0.a);
        return arrayList;
    }

    /* JADX INFO: renamed from: j3 */
    public JustRealStatus m2175j3() {
        return this.f3206V;
    }

    /* JADX INFO: renamed from: k3 */
    public j760<JustRealStatus, Integer> m2176k3() {
        return j760.a(this.f3206V, (Integer) this.f3213c0.get());
    }

    /* JADX INFO: renamed from: l3 */
    public List<C0144a> m2177l3() {
        ArrayList arrayList = new ArrayList();
        for (C0144a c0144a : this.f3207W) {
            SwipeDirection swipeDirection = c0144a.f3222b;
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                arrayList.add(c0144a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m3 */
    public c<j760<JustRealStatus, Integer>> m2178m3() {
        return this.f3219i0.asObservable();
    }

    /* JADX INFO: renamed from: n3 */
    public int m2179n3() {
        if (!mqi0.D(((Long) this.f3212b0.get()).longValue())) {
            this.f3212b0.put(Long.valueOf(mqi0.o()));
            this.f3213c0.put(10);
        }
        return ((Integer) this.f3213c0.get()).intValue();
    }

    /* JADX INFO: renamed from: o3 */
    public boolean m2180o3(String str) {
        if (!ura.m25555e().m25559d().m5816lk() || vwb.J(this.f3208X.uids)) {
            return false;
        }
        return this.f3208X.uids.contains(str);
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m2181p3() {
        JustRealStatus justRealStatus = this.f3206V;
        return justRealStatus == JustRealStatus.TRIALING || justRealStatus == JustRealStatus.PRE_START || justRealStatus == JustRealStatus.CLICK_RUNNING;
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m2182q3() {
        return this.f3220j0;
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m2183r3() {
        JustRealStatus justRealStatus = this.f3206V;
        return justRealStatus == JustRealStatus.TRIALING || justRealStatus == JustRealStatus.PRE_START;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m2184s3(roj0 roj0Var) {
        this.f3220j0 = false;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m2185t3(Throwable th) {
        this.f3220j0 = false;
        CoreModule.f1534c.f3652m0.m3095z5(false);
    }

    /* JADX INFO: renamed from: u3 */
    public c<User> m2186u3() {
        return this.f3203S.asObservable();
    }

    /* JADX INFO: renamed from: v3 */
    public void m2187v3() {
        AdvancedSettings advancedSettingsM12310j3;
        if (this.f3220j0 || (advancedSettingsM12310j3 = CoreModule.f1534c.f3553F0.m12310j3()) == null) {
            return;
        }
        this.f3220j0 = true;
        AdvancedSettings advancedSettings = new AdvancedSettings();
        advancedSettings.realFace = Boolean.valueOf(!advancedSettingsM12310j3.realFace.booleanValue());
        CoreModule.f1534c.f3553F0.m12315o3(advancedSettings, false).subscribe(new e30() { // from class: l.qc9
            public final void call(Object obj) {
                this.f19709a.m2184s3((roj0) obj);
            }
        }, new e30() { // from class: l.rc9
            public final void call(Object obj) {
                this.f20512a.m2185t3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public void m2188w3() {
        if (vwb.J(this.f3207W)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene", "realUser");
            JSONArray jSONArray = new JSONArray();
            for (C0144a c0144a : this.f3207W) {
                if (!c0144a.f3223c) {
                    c0144a.f3223c = true;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", ((DbObject) c0144a.f3221a).id);
                    arrayList.add(((DbObject) c0144a.f3221a).id);
                    SwipeDirection swipeDirection = c0144a.f3222b;
                    jSONObject2.put("status", swipeDirection == SwipeDirection.LEFT ? "disliked" : (swipeDirection != SwipeDirection.RIGHT && swipeDirection == SwipeDirection.UP) ? "superLiked" : "liked");
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("relations", jSONArray);
        } catch (Exception unused) {
        }
        if (vwb.J(arrayList)) {
            return;
        }
        m2170e3(arrayList);
        this.f8580Q.scheduled("post_trial_user_id" + arrayList, -1, new v9j() { // from class: l.sc9
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.tc9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3296w2("/me/relationships")).m(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m2189x3() {
        this.f3212b0.put(Long.valueOf(mqi0.o()));
        this.f3213c0.put(10);
        hpd0 hpd0Var = this.f3214d0;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        this.f3215e0.put(bool);
    }

    /* JADX INFO: renamed from: y3 */
    public void m2190y3() {
        if (!mqi0.D(((Long) this.f3212b0.get()).longValue())) {
            this.f3212b0.put(Long.valueOf(mqi0.o()));
            this.f3213c0.put(10);
        }
        m2164C3();
    }

    /* JADX INFO: renamed from: z3 */
    public void m2191z3(JustRealStatus justRealStatus) {
        if (justRealStatus != this.f3206V) {
            this.f3206V = justRealStatus;
            m2164C3();
            m2166E3();
        }
    }
}
