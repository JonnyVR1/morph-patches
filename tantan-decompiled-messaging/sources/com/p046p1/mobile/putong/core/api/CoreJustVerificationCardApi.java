package com.p046p1.mobile.putong.core.api;

import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
import com.p046p1.mobile.putong.core.data.JustRealUserList;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VisitorSortType;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tencent.open.miniapp.MiniApp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.ax6;
import p149l.e30;
import p149l.hpd0;
import p149l.j760;
import p149l.lsi0;
import p149l.mqi0;
import p149l.roj0;
import p149l.tpd0;
import p149l.uqd0;
import p149l.ura;
import p149l.v9j;
import p149l.vwb;
import p149l.xaj0;
import p149l.zpd0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreJustVerificationCardApi extends ax6 {

    /* JADX INFO: renamed from: R */
    public C22392a<JustRealStatus> f19213R;

    /* JADX INFO: renamed from: S */
    public C22393b<User> f19214S;

    /* JADX INFO: renamed from: T */
    public C22393b<roj0> f19215T;

    /* JADX INFO: renamed from: U */
    public C22393b<roj0> f19216U;

    /* JADX INFO: renamed from: V */
    public JustRealStatus f19217V;

    /* JADX INFO: renamed from: W */
    public List<C4718a> f19218W;

    /* JADX INFO: renamed from: X */
    public JustRealUserList f19219X;

    /* JADX INFO: renamed from: Y */
    public C22393b<xaj0<User, Integer, Integer>> f19220Y;

    /* JADX INFO: renamed from: Z */
    public C22393b<xaj0<User, Integer, Integer>> f19221Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f19222a0;

    /* JADX INFO: renamed from: b0 */
    public zpd0 f19223b0;

    /* JADX INFO: renamed from: c0 */
    public tpd0 f19224c0;

    /* JADX INFO: renamed from: d0 */
    public hpd0 f19225d0;

    /* JADX INFO: renamed from: e0 */
    public hpd0 f19226e0;

    /* JADX INFO: renamed from: f0 */
    public hpd0 f19227f0;

    /* JADX INFO: renamed from: g0 */
    public hpd0 f19228g0;

    /* JADX INFO: renamed from: h0 */
    public uqd0 f19229h0;

    /* JADX INFO: renamed from: i0 */
    public C22392a<j760<JustRealStatus, Integer>> f19230i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f19231j0;

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
    public static final class C4718a {

        /* JADX INFO: renamed from: a */
        public User f19232a;

        /* JADX INFO: renamed from: b */
        public SwipeDirection f19233b;

        /* JADX INFO: renamed from: c */
        public boolean f19234c = false;

        public C4718a(User user, SwipeDirection swipeDirection) {
            this.f19232a = user;
            this.f19233b = swipeDirection;
        }
    }

    public CoreJustVerificationCardApi(C4732c c4732c) {
        super(c4732c);
        this.f19213R = C22392a.m221512b();
        this.f19214S = C22393b.m221521b();
        this.f19215T = C22393b.m221521b();
        this.f19216U = C22393b.m221521b();
        this.f19217V = JustRealStatus.IDLE;
        this.f19220Y = C22393b.m221521b();
        this.f19221Z = C22393b.m221521b();
        this.f19222a0 = false;
        this.f19223b0 = new zpd0("just_real_trial_time_" + CoreModule.m29931H().userId(), 0L);
        this.f19224c0 = new tpd0("just_real_residue_count_" + CoreModule.m29931H().userId(), 10);
        String str = "just_real_has_show_trial_dlg_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f19225d0 = new hpd0(str, bool);
        this.f19226e0 = new hpd0("just_real_has_show_toast_" + CoreModule.m29931H().userId(), bool);
        this.f19227f0 = new hpd0("just_real_debug_request", bool);
        this.f19228g0 = new hpd0("just_real_debug_open", bool);
        this.f19229h0 = new uqd0("has_like_real_user_" + CoreModule.m29931H().userId(), "");
        this.f19230i0 = C22392a.m221512b();
        this.f19231j0 = false;
        this.f19218W = new ArrayList();
        try {
            this.f19219X = JustRealUserList.JSON_ADAPTER.parse(this.f19229h0.get());
        } catch (Exception unused) {
        }
        if (this.f19219X == null) {
            this.f19219X = JustRealUserList.new_();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m30234A3(User user, float f, float f2) {
        this.f19220Y.m132487l(xaj0.m207578a(user, Integer.valueOf((int) f), Integer.valueOf((int) f2)));
        m30240G3();
    }

    /* JADX INFO: renamed from: B3 */
    public void m30235B3(User user, float f, float f2) {
        this.f19221Z.m132487l(xaj0.m207578a(user, Integer.valueOf((int) f), Integer.valueOf((int) f2)));
    }

    /* JADX INFO: renamed from: C3 */
    public final void m30236C3() {
        this.f19230i0.m132487l(j760.m140076a(this.f19217V, this.f19224c0.get()));
    }

    /* JADX INFO: renamed from: D3 */
    public void m30237D3(User user) {
        this.f19214S.m132487l(user);
    }

    /* JADX INFO: renamed from: E3 */
    public final void m30238E3() {
        m30241H3(this.f19217V);
    }

    /* JADX INFO: renamed from: F3 */
    public C22306c<JustRealStatus> m30239F3() {
        return this.f19213R;
    }

    /* JADX INFO: renamed from: G3 */
    public void m30240G3() {
        if (this.f19217V == JustRealStatus.PRE_START) {
            JustRealStatus justRealStatus = JustRealStatus.TRIALING;
            this.f19217V = justRealStatus;
            m30241H3(justRealStatus);
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final void m30241H3(JustRealStatus justRealStatus) {
        this.f19213R.m132487l(justRealStatus);
    }

    /* JADX INFO: renamed from: e3 */
    public final void m30242e3(List<String> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f19219X.uids.addAll(list);
        if (this.f19219X.uids.size() > 200) {
            int size = this.f19219X.uids.size() - 200;
            JustRealUserList justRealUserList = this.f19219X;
            List<String> list2 = justRealUserList.uids;
            justRealUserList.uids = list2.subList(size, list2.size());
        }
        this.f19229h0.put(this.f19219X.toJson());
    }

    /* JADX INFO: renamed from: f3 */
    public void m30243f3(SwipeDirection swipeDirection, User user) {
        tpd0 tpd0Var = this.f19224c0;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() - 1));
        this.f19218W.add(new C4718a(user, swipeDirection));
        if ((swipeDirection == SwipeDirection.UP || swipeDirection == SwipeDirection.RIGHT) && this.f19217V == JustRealStatus.PRE_START) {
            this.f19217V = JustRealStatus.TRIALING;
            m30238E3();
        }
        if (this.f19224c0.get().intValue() == 0) {
            JustRealStatus justRealStatus = this.f19217V;
            if (justRealStatus == JustRealStatus.TRIALING || justRealStatus == JustRealStatus.PRE_START) {
                if (vwb.m200296J(m30249l3())) {
                    lsi0.m151595y("只看认证用户试用体验已结束");
                }
                m30244g3();
            }
            this.f19217V = JustRealStatus.FINISH;
            m30238E3();
            m30260w3();
        }
        m30236C3();
    }

    /* JADX INFO: renamed from: g3 */
    public final void m30244g3() {
        ArrayList arrayList = new ArrayList();
        for (C4718a c4718a : this.f19218W) {
            SwipeDirection swipeDirection = c4718a.f19233b;
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                arrayList.add(c4718a.f19232a);
            }
        }
        if (vwb.m200296J(arrayList)) {
            return;
        }
        this.f19215T.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: h3 */
    public void m30245h3() {
        JustRealStatus justRealStatus = this.f19217V;
        if (justRealStatus == JustRealStatus.PRE_START || justRealStatus == JustRealStatus.TRIALING) {
            this.f19217V = JustRealStatus.FINISH;
            m30238E3();
            m30236C3();
        }
    }

    /* JADX INFO: renamed from: i3 */
    public List<User> m30246i3() {
        ArrayList arrayList = new ArrayList();
        for (C4718a c4718a : this.f19218W) {
            SwipeDirection swipeDirection = c4718a.f19233b;
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                arrayList.add(c4718a.f19232a);
            }
        }
        this.f19218W.clear();
        this.f19216U.m132487l(roj0.f160388a);
        return arrayList;
    }

    /* JADX INFO: renamed from: j3 */
    public JustRealStatus m30247j3() {
        return this.f19217V;
    }

    /* JADX INFO: renamed from: k3 */
    public j760<JustRealStatus, Integer> m30248k3() {
        return j760.m140076a(this.f19217V, this.f19224c0.get());
    }

    /* JADX INFO: renamed from: l3 */
    public List<C4718a> m30249l3() {
        ArrayList arrayList = new ArrayList();
        for (C4718a c4718a : this.f19218W) {
            SwipeDirection swipeDirection = c4718a.f19233b;
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                arrayList.add(c4718a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m3 */
    public C22306c<j760<JustRealStatus, Integer>> m30250m3() {
        return this.f19230i0.asObservable();
    }

    /* JADX INFO: renamed from: n3 */
    public int m30251n3() {
        if (!mqi0.m155929D(this.f19223b0.get().longValue())) {
            this.f19223b0.put(Long.valueOf(mqi0.m155944o()));
            this.f19224c0.put(10);
        }
        return this.f19224c0.get().intValue();
    }

    /* JADX INFO: renamed from: o3 */
    public boolean m30252o3(String str) {
        if (!ura.m195053e().m195057d().mo33879lk() || vwb.m200296J(this.f19219X.uids)) {
            return false;
        }
        return this.f19219X.uids.contains(str);
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m30253p3() {
        JustRealStatus justRealStatus = this.f19217V;
        return justRealStatus == JustRealStatus.TRIALING || justRealStatus == JustRealStatus.PRE_START || justRealStatus == JustRealStatus.CLICK_RUNNING;
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m30254q3() {
        return this.f19231j0;
    }

    /* JADX INFO: renamed from: r3 */
    public boolean m30255r3() {
        JustRealStatus justRealStatus = this.f19217V;
        return justRealStatus == JustRealStatus.TRIALING || justRealStatus == JustRealStatus.PRE_START;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m30256s3(roj0 roj0Var) {
        this.f19231j0 = false;
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m30257t3(Throwable th) {
        this.f19231j0 = false;
        CoreModule.f17545c.f19663m0.m31165z5(false);
    }

    /* JADX INFO: renamed from: u3 */
    public C22306c<User> m30258u3() {
        return this.f19214S.asObservable();
    }

    /* JADX INFO: renamed from: v3 */
    public void m30259v3() {
        AdvancedSettings advancedSettingsM99243j3;
        if (this.f19231j0 || (advancedSettingsM99243j3 = CoreModule.f17545c.f19564F0.m99243j3()) == null) {
            return;
        }
        this.f19231j0 = true;
        AdvancedSettings advancedSettings = new AdvancedSettings();
        advancedSettings.realFace = Boolean.valueOf(!advancedSettingsM99243j3.realFace.booleanValue());
        CoreModule.f17545c.f19564F0.m99248o3(advancedSettings, false).subscribe(new e30() { // from class: l.qc9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153732a.m30256s3((roj0) obj);
            }
        }, new e30() { // from class: l.rc9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158757a.m30257t3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public void m30260w3() {
        if (vwb.m200296J(this.f19218W)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene", VisitorSortType.realUser);
            JSONArray jSONArray = new JSONArray();
            for (C4718a c4718a : this.f19218W) {
                if (!c4718a.f19234c) {
                    c4718a.f19234c = true;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", c4718a.f19232a.f56011id);
                    arrayList.add(c4718a.f19232a.f56011id);
                    SwipeDirection swipeDirection = c4718a.f19233b;
                    jSONObject2.put(NotificationCompat.CATEGORY_STATUS, swipeDirection == SwipeDirection.LEFT ? RelationshipStatus.disliked : (swipeDirection != SwipeDirection.RIGHT && swipeDirection == SwipeDirection.UP) ? MatchFrom.superLiked : "liked");
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("relations", jSONArray);
        } catch (Exception unused) {
        }
        if (vwb.m200296J(arrayList)) {
            return;
        }
        m30242e3(arrayList);
        this.f72126Q.scheduled("post_trial_user_id" + arrayList, -1, new v9j() { // from class: l.sc9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.tc9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31366w2("/me/relationships")).m185894m(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m30261x3() {
        this.f19223b0.put(Long.valueOf(mqi0.m155944o()));
        this.f19224c0.put(10);
        hpd0 hpd0Var = this.f19225d0;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        this.f19226e0.put(bool);
    }

    /* JADX INFO: renamed from: y3 */
    public void m30262y3() {
        if (!mqi0.m155929D(this.f19223b0.get().longValue())) {
            this.f19223b0.put(Long.valueOf(mqi0.m155944o()));
            this.f19224c0.put(10);
        }
        m30236C3();
    }

    /* JADX INFO: renamed from: z3 */
    public void m30263z3(JustRealStatus justRealStatus) {
        if (justRealStatus != this.f19217V) {
            this.f19217V = justRealStatus;
            m30236C3();
            m30238E3();
        }
    }
}
