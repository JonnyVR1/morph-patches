package com.p051p1.mobile.putong.core.api;

import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.AdvancedSettings;
import com.p051p1.mobile.putong.core.data.JustRealUserList;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VisitorSortType;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tencent.open.miniapp.MiniApp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.bkj0;
import p153l.byd0;
import p153l.dy6;
import p153l.gta;
import p153l.jxd0;
import p153l.jyb;
import p153l.o1j0;
import p153l.pcj;
import p153l.pf60;
import p153l.pzi0;
import p153l.uxj0;
import p153l.vxd0;
import p153l.wyd0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class CoreJustVerificationCardApi extends dy6 {

    /* JADX INFO: renamed from: R */
    public C22507a<JustRealStatus> f19954R;

    /* JADX INFO: renamed from: S */
    public C22508b<User> f19955S;

    /* JADX INFO: renamed from: T */
    public C22508b<uxj0> f19956T;

    /* JADX INFO: renamed from: U */
    public C22508b<uxj0> f19957U;

    /* JADX INFO: renamed from: V */
    public JustRealStatus f19958V;

    /* JADX INFO: renamed from: W */
    public List<C4869a> f19959W;

    /* JADX INFO: renamed from: X */
    public JustRealUserList f19960X;

    /* JADX INFO: renamed from: Y */
    public C22508b<bkj0<User, Integer, Integer>> f19961Y;

    /* JADX INFO: renamed from: Z */
    public C22508b<bkj0<User, Integer, Integer>> f19962Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f19963a0;

    /* JADX INFO: renamed from: b0 */
    public byd0 f19964b0;

    /* JADX INFO: renamed from: c0 */
    public vxd0 f19965c0;

    /* JADX INFO: renamed from: d0 */
    public jxd0 f19966d0;

    /* JADX INFO: renamed from: e0 */
    public jxd0 f19967e0;

    /* JADX INFO: renamed from: f0 */
    public jxd0 f19968f0;

    /* JADX INFO: renamed from: g0 */
    public jxd0 f19969g0;

    /* JADX INFO: renamed from: h0 */
    public wyd0 f19970h0;

    /* JADX INFO: renamed from: i0 */
    public C22507a<pf60<JustRealStatus, Integer>> f19971i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f19972j0;

    public enum JustRealStatus {
        IDLE(0, "初始状态", false, BLiveOperationTitleShowType.off),
        PRE_START(1, "试用准备中", true, MiniApp.MINIAPP_VERSION_TRIAL),
        TRIALING(2, "试用中", true, MiniApp.MINIAPP_VERSION_TRIAL),
        RUNNING(3, "认证&svip用户直接使用", true, "on"),
        CLICK_RUNNING(4, "认证&svip用户直接使用-左上角点击触发的", true, "on"),
        FINISH(5, "结束", false, BLiveOperationTitleShowType.off);

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
    public static final class C4869a {

        /* JADX INFO: renamed from: a */
        public User f19973a;

        /* JADX INFO: renamed from: b */
        public SwipeDirection f19974b;

        /* JADX INFO: renamed from: c */
        public boolean f19975c = false;

        public C4869a(User user, SwipeDirection swipeDirection) {
            this.f19973a = user;
            this.f19974b = swipeDirection;
        }
    }

    public CoreJustVerificationCardApi(C4883c c4883c) {
        super(c4883c);
        this.f19954R = C22507a.m222758b();
        this.f19955S = C22508b.m222767b();
        this.f19956T = C22508b.m222767b();
        this.f19957U = C22508b.m222767b();
        this.f19958V = JustRealStatus.IDLE;
        this.f19961Y = C22508b.m222767b();
        this.f19962Z = C22508b.m222767b();
        this.f19963a0 = false;
        this.f19964b0 = new byd0("just_real_trial_time_" + CoreModule.m30929H().userId(), 0L);
        this.f19965c0 = new vxd0("just_real_residue_count_" + CoreModule.m30929H().userId(), 10);
        String str = "just_real_has_show_trial_dlg_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f19966d0 = new jxd0(str, bool);
        this.f19967e0 = new jxd0("just_real_has_show_toast_" + CoreModule.m30929H().userId(), bool);
        this.f19968f0 = new jxd0("just_real_debug_request", bool);
        this.f19969g0 = new jxd0("just_real_debug_open", bool);
        this.f19970h0 = new wyd0("has_like_real_user_" + CoreModule.m30929H().userId(), "");
        this.f19971i0 = C22507a.m222758b();
        this.f19972j0 = false;
        this.f19959W = new ArrayList();
        try {
            this.f19960X = JustRealUserList.JSON_ADAPTER.parse(this.f19970h0.get());
        } catch (Exception unused) {
        }
        if (this.f19960X == null) {
            this.f19960X = JustRealUserList.new_();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m31232A3(User user, float f, float f2) {
        this.f19961Y.m137019l(bkj0.m104818a(user, Integer.valueOf((int) f), Integer.valueOf((int) f2)));
        m31238G3();
    }

    /* JADX INFO: renamed from: B3 */
    public void m31233B3(User user, float f, float f2) {
        this.f19962Z.m137019l(bkj0.m104818a(user, Integer.valueOf((int) f), Integer.valueOf((int) f2)));
    }

    /* JADX INFO: renamed from: C3 */
    public final void m31234C3() {
        this.f19971i0.m137019l(pf60.m172085a(this.f19958V, this.f19965c0.get()));
    }

    /* JADX INFO: renamed from: D3 */
    public void m31235D3(User user) {
        this.f19955S.m137019l(user);
    }

    /* JADX INFO: renamed from: E3 */
    public final void m31236E3() {
        m31239H3(this.f19958V);
    }

    /* JADX INFO: renamed from: F3 */
    public C22421c<JustRealStatus> m31237F3() {
        return this.f19954R;
    }

    /* JADX INFO: renamed from: G3 */
    public void m31238G3() {
        if (this.f19958V == JustRealStatus.PRE_START) {
            JustRealStatus justRealStatus = JustRealStatus.TRIALING;
            this.f19958V = justRealStatus;
            m31239H3(justRealStatus);
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final void m31239H3(JustRealStatus justRealStatus) {
        this.f19954R.m137019l(justRealStatus);
    }

    /* JADX INFO: renamed from: e3 */
    public final void m31240e3(List<String> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f19960X.uids.addAll(list);
        if (this.f19960X.uids.size() > 200) {
            int size = this.f19960X.uids.size() - 200;
            JustRealUserList justRealUserList = this.f19960X;
            List<String> list2 = justRealUserList.uids;
            justRealUserList.uids = list2.subList(size, list2.size());
        }
        this.f19970h0.put(this.f19960X.toJson());
    }

    /* JADX INFO: renamed from: f3 */
    public void m31241f3(SwipeDirection swipeDirection, User user) {
        vxd0 vxd0Var = this.f19965c0;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() - 1));
        this.f19959W.add(new C4869a(user, swipeDirection));
        if ((swipeDirection == SwipeDirection.UP || swipeDirection == SwipeDirection.RIGHT) && this.f19958V == JustRealStatus.PRE_START) {
            this.f19958V = JustRealStatus.TRIALING;
            m31236E3();
        }
        if (this.f19965c0.get().intValue() == 0) {
            JustRealStatus justRealStatus = this.f19958V;
            if (justRealStatus == JustRealStatus.TRIALING || justRealStatus == JustRealStatus.PRE_START) {
                if (jyb.m147479J(m31247l3())) {
                    o1j0.m165651y("只看认证用户试用体验已结束");
                }
                m31242g3();
            }
            this.f19958V = JustRealStatus.FINISH;
            m31236E3();
            m31258w3();
        }
        m31234C3();
    }

    /* JADX INFO: renamed from: g3 */
    public final void m31242g3() {
        ArrayList arrayList = new ArrayList();
        for (C4869a c4869a : this.f19959W) {
            SwipeDirection swipeDirection = c4869a.f19974b;
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                arrayList.add(c4869a.f19973a);
            }
        }
        if (jyb.m147479J(arrayList)) {
            return;
        }
        this.f19956T.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: h3 */
    public void m31243h3() {
        JustRealStatus justRealStatus = this.f19958V;
        if (justRealStatus == JustRealStatus.PRE_START || justRealStatus == JustRealStatus.TRIALING) {
            this.f19958V = JustRealStatus.FINISH;
            m31236E3();
            m31234C3();
        }
    }

    /* JADX INFO: renamed from: i3 */
    public List<User> m31244i3() {
        ArrayList arrayList = new ArrayList();
        for (C4869a c4869a : this.f19959W) {
            SwipeDirection swipeDirection = c4869a.f19974b;
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                arrayList.add(c4869a.f19973a);
            }
        }
        this.f19959W.clear();
        this.f19957U.m137019l(uxj0.f181467a);
        return arrayList;
    }

    /* JADX INFO: renamed from: j3 */
    public JustRealStatus m31245j3() {
        return this.f19958V;
    }

    /* JADX INFO: renamed from: k3 */
    public pf60<JustRealStatus, Integer> m31246k3() {
        return pf60.m172085a(this.f19958V, this.f19965c0.get());
    }

    /* JADX INFO: renamed from: l3 */
    public List<C4869a> m31247l3() {
        ArrayList arrayList = new ArrayList();
        for (C4869a c4869a : this.f19959W) {
            SwipeDirection swipeDirection = c4869a.f19974b;
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                arrayList.add(c4869a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m3 */
    public C22421c<pf60<JustRealStatus, Integer>> m31248m3() {
        return this.f19971i0.asObservable();
    }

    /* JADX INFO: renamed from: n3 */
    public int m31249n3() {
        if (!pzi0.m174439D(this.f19964b0.get().longValue())) {
            this.f19964b0.put(Long.valueOf(pzi0.m174454o()));
            this.f19965c0.put(10);
        }
        return this.f19965c0.get().intValue();
    }

    /* JADX INFO: renamed from: o3 */
    public boolean m31250o3(String str) {
        if (!gta.m132210e().m132214d().mo34882lk() || jyb.m147479J(this.f19960X.uids)) {
            return false;
        }
        return this.f19960X.uids.contains(str);
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m31251p3() {
        JustRealStatus justRealStatus = this.f19958V;
        return justRealStatus == JustRealStatus.TRIALING || justRealStatus == JustRealStatus.PRE_START || justRealStatus == JustRealStatus.CLICK_RUNNING;
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m31252q3() {
        return this.f19972j0;
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m31253r3() {
        JustRealStatus justRealStatus = this.f19958V;
        return justRealStatus == JustRealStatus.TRIALING || justRealStatus == JustRealStatus.PRE_START;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m31254s3(uxj0 uxj0Var) {
        this.f19972j0 = false;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m31255t3(Throwable th) {
        this.f19972j0 = false;
        CoreModule.f18264c.f20405m0.m32168z5(false);
    }

    /* JADX INFO: renamed from: u3 */
    public C22421c<User> m31256u3() {
        return this.f19955S.asObservable();
    }

    /* JADX INFO: renamed from: v3 */
    public void m31257v3() {
        AdvancedSettings advancedSettingsM118447j3;
        if (this.f19972j0 || (advancedSettingsM118447j3 = CoreModule.f18264c.f20306F0.m118447j3()) == null) {
            return;
        }
        this.f19972j0 = true;
        AdvancedSettings advancedSettings = new AdvancedSettings();
        advancedSettings.realFace = Boolean.valueOf(!advancedSettingsM118447j3.realFace.booleanValue());
        CoreModule.f18264c.f20306F0.m118452o3(advancedSettings, false).subscribe(new y20() { // from class: l.zd9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203860a.m31254s3((uxj0) obj);
            }
        }, new y20() { // from class: l.ae9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f70774a.m31255t3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public void m31258w3() {
        if (jyb.m147479J(this.f19959W)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene", VisitorSortType.realUser);
            JSONArray jSONArray = new JSONArray();
            for (C4869a c4869a : this.f19959W) {
                if (!c4869a.f19975c) {
                    c4869a.f19975c = true;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", c4869a.f19973a.f56859id);
                    arrayList.add(c4869a.f19973a.f56859id);
                    SwipeDirection swipeDirection = c4869a.f19974b;
                    jSONObject2.put(NotificationCompat.CATEGORY_STATUS, swipeDirection == SwipeDirection.LEFT ? RelationshipStatus.disliked : (swipeDirection != SwipeDirection.RIGHT && swipeDirection == SwipeDirection.UP) ? MatchFrom.superLiked : "liked");
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("relations", jSONArray);
        } catch (Exception unused) {
        }
        if (jyb.m147479J(arrayList)) {
            return;
        }
        m31240e3(arrayList);
        this.f91137Q.scheduled("post_trial_user_id" + arrayList, -1, new pcj() { // from class: l.be9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.ce9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32369w2("/me/relationships")).m209039m(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m31259x3() {
        this.f19964b0.put(Long.valueOf(pzi0.m174454o()));
        this.f19965c0.put(10);
        jxd0 jxd0Var = this.f19966d0;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        this.f19967e0.put(bool);
    }

    /* JADX INFO: renamed from: y3 */
    public void m31260y3() {
        if (!pzi0.m174439D(this.f19964b0.get().longValue())) {
            this.f19964b0.put(Long.valueOf(pzi0.m174454o()));
            this.f19965c0.put(10);
        }
        m31234C3();
    }

    /* JADX INFO: renamed from: z3 */
    public void m31261z3(JustRealStatus justRealStatus) {
        if (justRealStatus != this.f19958V) {
            this.f19958V = justRealStatus;
            m31234C3();
            m31236E3();
        }
    }
}
