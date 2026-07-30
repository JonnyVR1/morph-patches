package com.p046p1.mobile.putong.live.livingroom.common.signin;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import com.p046p1.mobile.putong.live.livingroom.common.signin.SignInEvent;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p149l.bsm;
import p149l.d30;
import p149l.e30;
import p149l.ffw;
import p149l.g4f0;
import p149l.h4t;
import p149l.ho2;
import p149l.hpd0;
import p149l.lsi0;
import p149l.ptk;
import p149l.tzd;
import p149l.v4f0;
import p149l.vwb;
import p149l.w9j;
import p149l.ypv;
import p149l.zgt;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12769a<T extends ho2> extends h4t<T, v4f0> {

    /* JADX INFO: renamed from: i */
    public String f49277i;

    /* JADX INFO: renamed from: j */
    public String f49278j;

    /* JADX INFO: renamed from: k */
    public hpd0 f49279k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49280a;

        static {
            int[] iArr = new int[SignInEvent.Page.values().length];
            f49280a = iArr;
            try {
                iArr[SignInEvent.Page.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49280a[SignInEvent.Page.RULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49280a[SignInEvent.Page.PRIZE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49280a[SignInEvent.Page.MEDAL_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C12769a(bsm<T> bsmVar) {
        super(bsmVar);
        this.f49279k = new hpd0("live_sign_in_clicked_my_reward" + ypv.f199493a.m199309D0(), Boolean.FALSE);
        mo51532C(new v4f0());
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m73146S3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public void m73152a4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            String str = ((TantanException.Client.CoreService) th).metaMessage;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            lsi0.m151580j(str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: A4 */
    public void m73153A4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchor_id", m206027E2().m132146l0().f56011id);
        map.put("live_id", m206027E2().mo149813j().f44323id);
        map.put("reward_id", str);
        map.put("sign_task_id", str2);
        zvf0.m220403y("e_live_sign_reward", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: B4 */
    public void m73154B4(String str, String str2, int i, boolean z) {
        HashMap map = new HashMap();
        map.put("anchor_id", m206027E2().m132146l0().f56011id);
        map.put("live_id", m206027E2().mo149813j().f44323id);
        map.put("sign_source", this.f49277i);
        map.put("task_days", Integer.valueOf(i));
        map.put("task_type", str2);
        map.put("is_available", Boolean.valueOf(z));
        map.put("type_name", str);
        zvf0.m220397s("e_live_sign_task_list", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: C4 */
    public void m73155C4(String str, String str2, int i, boolean z) {
        HashMap map = new HashMap();
        map.put("anchor_id", m206027E2().m132146l0().f56011id);
        map.put("live_id", m206027E2().mo149813j().f44323id);
        map.put("sign_source", this.f49277i);
        map.put("task_days", Integer.valueOf(i));
        map.put("task_type", str2);
        map.put("is_available", Boolean.valueOf(z));
        map.put("type_name", str);
        zvf0.m220403y("e_live_sign_task_list", "p_user_live_room", map);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m73156Y3() {
        if (TextUtils.isEmpty(this.f49278j)) {
            return;
        }
        ptk.m171332h().m171334g(this.f49278j);
        this.f49278j = null;
    }

    /* JADX INFO: renamed from: Z3 */
    public void m73157Z3(String str, final List<BLiveSignInReward> list) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rewardId", (Object) str);
        duringCreated((C22306c<T>) LivingNormalApiProvider.m71320Q5(jSONObject.toJSONString())).filter(new w9j() { // from class: l.b4f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f73345a.m73158b4((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.c4f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79269a.m73159c4(list, (BLiveEnvelope) obj);
            }
        }, new g4f0(this)));
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ Boolean m73158b4(BLiveEnvelope bLiveEnvelope) {
        return Boolean.valueOf(((v4f0) this.viewModel).m196974j());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m73159c4(List list, BLiveEnvelope bLiveEnvelope) {
        m73167k4();
        m73170n4(list);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ Boolean m73160d4(BLiveSignInDetail bLiveSignInDetail) {
        return Boolean.valueOf(((v4f0) this.viewModel).m196974j() && NullChecker.m81303a(bLiveSignInDetail));
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ Boolean m73161e4(BLiveSignInAchievementMedals bLiveSignInAchievementMedals) {
        return Boolean.valueOf(((v4f0) this.viewModel).m196974j() && NullChecker.m81303a(bLiveSignInAchievementMedals));
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Boolean m73162f4(BLiveEnvelope bLiveEnvelope) {
        return Boolean.valueOf(((v4f0) this.viewModel).m196974j());
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m73163g4(List list, BLiveEnvelope bLiveEnvelope) {
        m73167k4();
        m73170n4(list);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m73164h4(BLiveEnvelope bLiveEnvelope) {
        ((v4f0) this.viewModel).m196986z(bLiveEnvelope.data.signInPrizes);
        m73181y4();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m73165i4(SignInEvent signInEvent) {
        if (!TextUtils.isEmpty(signInEvent.f49273a)) {
            this.f49277i = signInEvent.f49273a;
        }
        m73172p4(signInEvent.f49274b);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m73166j4(tzd tzdVar) {
        ((v4f0) this.viewModel).m196973i();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73167k4() {
        C22306c<T> c22306cFilter = duringCreated((C22306c<T>) LivingNormalApiProvider.m71374W5()).filter(new w9j() { // from class: l.h4f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f105833a.m73160d4((BLiveSignInDetail) obj);
            }
        });
        final v4f0 v4f0Var = (v4f0) this.viewModel;
        Objects.requireNonNull(v4f0Var);
        c22306cFilter.subscribe(ffw.m121193d(new e30() { // from class: l.i4f0
            @Override // p149l.e30
            public final void call(Object obj) {
                v4f0Var.m196979q((BLiveSignInDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m73168l4() {
        C22306c<T> c22306cFilter = duringCreated((C22306c<T>) LivingNormalApiProvider.m71562r4()).filter(new w9j() { // from class: l.n4f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f137095a.m73161e4((BLiveSignInAchievementMedals) obj);
            }
        });
        final v4f0 v4f0Var = (v4f0) this.viewModel;
        Objects.requireNonNull(v4f0Var);
        c22306cFilter.subscribe(ffw.m121193d(new e30() { // from class: l.y3f0
            @Override // p149l.e30
            public final void call(Object obj) {
                v4f0Var.m196978p((BLiveSignInAchievementMedals) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public void m73169m4() {
        ((v4f0) this.viewModel).m196980s(new d30() { // from class: l.d4f0
            @Override // p149l.d30
            public final void call() {
                this.f84302a.m73171o4();
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public void m73170n4(List<BLiveSignInReward> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        ((v4f0) this.viewModel).m196981u(list);
    }

    /* JADX INFO: renamed from: o4 */
    public final void m73171o4() {
        if (!TextUtils.isEmpty(this.f49278j) || this.f49279k.get().booleanValue()) {
            return;
        }
        this.f49278j = ((v4f0) this.viewModel).m196982v();
    }

    /* JADX INFO: renamed from: p4 */
    public final void m73172p4(SignInEvent.Page page) {
        if (!((v4f0) this.viewModel).m196974j()) {
            ypv.f199493a.m199332Y(true);
        }
        ((v4f0) this.viewModel).m196983w();
        m206028F2().BottomEvent.clearSignRedPoint().m172468q();
        if (page == null) {
            page = SignInEvent.Page.MAIN;
        }
        int i = a.f49280a[page.ordinal()];
        if (i == 1) {
            m73174r4(true);
            return;
        }
        if (i == 2) {
            m73177u4();
        } else if (i == 3) {
            m73176t4();
        } else {
            if (i != 4) {
                return;
            }
            m73175s4();
        }
    }

    /* JADX INFO: renamed from: q4 */
    public void m73173q4(final List<BLiveSignInReward> list, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("roomId", (Object) m206027E2().m149818o());
        jSONObject.put("liveId", (Object) m206027E2().m149814k());
        duringCreated((C22306c<T>) LivingNormalApiProvider.m71259J7(jSONObject.toJSONString())).filter(new w9j() { // from class: l.w3f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f184391a.m73162f4((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.e4f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89275a.m73163g4(list, (BLiveEnvelope) obj);
            }
        }, new g4f0(this)));
        m73178v4(str);
    }

    /* JADX INFO: renamed from: r4 */
    public void m73174r4(boolean z) {
        boolean zM196975k = ((v4f0) this.viewModel).m196975k();
        ((v4f0) this.viewModel).m196984x();
        if (!zM196975k || z) {
            m73167k4();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m73175s4() {
        ((v4f0) this.viewModel).m196985y();
        m73168l4();
        m73156Y3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        zgt.C21695a c21695aM132069I0 = m206027E2().m132069I0();
        if (c21695aM132069I0.m218721h()) {
            this.f49277i = c21695aM132069I0.m218717d();
            m73172p4(SignInEvent.Page.MAIN);
        }
        duringCreated((C22306c<T>) m206028F2().SignInEvent.showSignDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.j4f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116187a.m73165i4((SignInEvent) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().DialogCenterEvent.changeVisibility().m172460g()).filter(new w9j() { // from class: l.k4f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((tzd) obj).f172729a == LiveDialogEnum.CHAT_INPUT);
            }
        }).filter(new w9j() { // from class: l.l4f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((tzd) obj).f172731c);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.m4f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131293a.m73166j4((tzd) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m73176t4() {
        this.f49279k.put(Boolean.TRUE);
        m73156Y3();
        duringCreated((C22306c<T>) LivingNormalApiProvider.m71518m5()).subscribe(ffw.m121194e(new e30() { // from class: l.z3f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201343a.m73164h4((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.a4f0
            @Override // p149l.e30
            public final void call(Object obj) {
                C12769a.m73146S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public void m73177u4() {
        ((v4f0) this.viewModel).m196969A();
        m73156Y3();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: v4 */
    public void m73178v4(String str) {
        HashMap map = new HashMap();
        map.put("anchor_id", m206027E2().m132146l0().f56011id);
        map.put("live_id", m206027E2().mo149813j().f44323id);
        map.put("sign_source", this.f49277i);
        map.put("sign_task_id", str);
        zvf0.m220397s("e_live_sign", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: w4 */
    public void m73179w4(String str) {
        HashMap map = new HashMap();
        map.put("anchor_id", m206027E2().m132146l0().f56011id);
        map.put("live_id", m206027E2().mo149813j().f44323id);
        map.put("sign_source", this.f49277i);
        map.put("sign_task_id", str);
        zvf0.m220403y("e_live_sign", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: x4 */
    public void m73180x4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchor_id", m206027E2().m132146l0().f56011id);
        map.put("live_id", m206027E2().mo149813j().f44323id);
        map.put("sign_source", this.f49277i);
        map.put("reward_id", str2);
        map.put("text_live_sign", str);
        zvf0.m220397s("e_live_sign_prize", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: y4 */
    public void m73181y4() {
        HashMap map = new HashMap();
        map.put("anchor_id", m206027E2().m132146l0().f56011id);
        map.put("live_id", m206027E2().mo149813j().f44323id);
        map.put("sign_source", this.f49277i);
        zvf0.m220403y("e_live_sign_prize", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: z4 */
    public void m73182z4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchor_id", m206027E2().m132146l0().f56011id);
        map.put("live_id", m206027E2().mo149813j().f44323id);
        map.put("reward_id", str);
        map.put("sign_task_id", str2);
        zvf0.m220397s("e_live_sign_reward", "p_user_live_room", map);
    }
}
