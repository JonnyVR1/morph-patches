package com.p000p1.mobile.putong.live.livingroom.common.signin;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p000p1.mobile.putong.live.livingroom.common.signin.SignInEvent;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.hpd0;
import l.lsi0;
import l.ptk;
import l.vwb;
import l.w9j;
import l.ypv;
import l.zvf0;
import p002l.bsm;
import p002l.g4f0;
import p002l.h4t;
import p002l.ho2;
import p002l.tzd;
import p002l.v4f0;
import p002l.zgt;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0358a<T extends ho2> extends h4t<T, v4f0> {

    /* JADX INFO: renamed from: i */
    public String f5319i;

    /* JADX INFO: renamed from: j */
    public String f5320j;

    /* JADX INFO: renamed from: k */
    public hpd0 f5321k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5322a;

        static {
            int[] iArr = new int[SignInEvent.Page.values().length];
            f5322a = iArr;
            try {
                iArr[SignInEvent.Page.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5322a[SignInEvent.Page.RULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5322a[SignInEvent.Page.PRIZE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5322a[SignInEvent.Page.MEDAL_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C0358a(bsm<T> bsmVar) {
        super(bsmVar);
        this.f5321k = new hpd0("live_sign_in_clicked_my_reward" + ypv.a.D0(), Boolean.FALSE);
        C(new v4f0());
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m6674S3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public void m6680a4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            String str = ((TantanException.Client.CoreService) th).metaMessage;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            lsi0.j(str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: A4 */
    public void m6681A4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchor_id", ((DbObject) m25547E2().m14582l0()).id);
        map.put("live_id", m25547E2().m17234j().id);
        map.put("reward_id", str);
        map.put("sign_task_id", str2);
        zvf0.y("e_live_sign_reward", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: B4 */
    public void m6682B4(String str, String str2, int i, boolean z) {
        HashMap map = new HashMap();
        map.put("anchor_id", ((DbObject) m25547E2().m14582l0()).id);
        map.put("live_id", m25547E2().m17234j().id);
        map.put("sign_source", this.f5319i);
        map.put("task_days", Integer.valueOf(i));
        map.put("task_type", str2);
        map.put("is_available", Boolean.valueOf(z));
        map.put("type_name", str);
        zvf0.s("e_live_sign_task_list", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: C4 */
    public void m6683C4(String str, String str2, int i, boolean z) {
        HashMap map = new HashMap();
        map.put("anchor_id", ((DbObject) m25547E2().m14582l0()).id);
        map.put("live_id", m25547E2().m17234j().id);
        map.put("sign_source", this.f5319i);
        map.put("task_days", Integer.valueOf(i));
        map.put("task_type", str2);
        map.put("is_available", Boolean.valueOf(z));
        map.put("type_name", str);
        zvf0.y("e_live_sign_task_list", "p_user_live_room", map);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m6684Y3() {
        if (TextUtils.isEmpty(this.f5320j)) {
            return;
        }
        ptk.h().g(this.f5320j);
        this.f5320j = null;
    }

    /* JADX INFO: renamed from: Z3 */
    public void m6685Z3(String str, final List<BLiveSignInReward> list) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rewardId", str);
        duringCreated(LivingNormalApiProvider.m4686Q5(jSONObject.toJSONString())).filter(new w9j() { // from class: l.b4f0
            public final Object call(Object obj) {
                return this.f7980a.m6686b4((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.c4f0
            public final void call(Object obj) {
                this.f8482a.m6687c4(list, (BLiveEnvelope) obj);
            }
        }, new g4f0(this)));
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ Boolean m6686b4(BLiveEnvelope bLiveEnvelope) {
        return Boolean.valueOf(((v4f0) ((bwr) this).viewModel).m23728j());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m6687c4(List list, BLiveEnvelope bLiveEnvelope) {
        m6695k4();
        m6698n4(list);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ Boolean m6688d4(BLiveSignInDetail bLiveSignInDetail) {
        return Boolean.valueOf(((v4f0) ((bwr) this).viewModel).m23728j() && NullChecker.a(bLiveSignInDetail));
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ Boolean m6689e4(BLiveSignInAchievementMedals bLiveSignInAchievementMedals) {
        return Boolean.valueOf(((v4f0) ((bwr) this).viewModel).m23728j() && NullChecker.a(bLiveSignInAchievementMedals));
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Boolean m6690f4(BLiveEnvelope bLiveEnvelope) {
        return Boolean.valueOf(((v4f0) ((bwr) this).viewModel).m23728j());
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m6691g4(List list, BLiveEnvelope bLiveEnvelope) {
        m6695k4();
        m6698n4(list);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m6692h4(BLiveEnvelope bLiveEnvelope) {
        ((v4f0) ((bwr) this).viewModel).m23740z(bLiveEnvelope.data.signInPrizes);
        m6710y4();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m6693i4(SignInEvent signInEvent) {
        if (!TextUtils.isEmpty(signInEvent.f5315a)) {
            this.f5319i = signInEvent.f5315a;
        }
        m6700p4(signInEvent.f5316b);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m6694j4(tzd tzdVar) {
        ((v4f0) ((bwr) this).viewModel).m23726i();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6695k4() {
        c cVarFilter = duringCreated(LivingNormalApiProvider.m4740W5()).filter(new w9j() { // from class: l.h4f0
            public final Object call(Object obj) {
                return this.f11872a.m6688d4((BLiveSignInDetail) obj);
            }
        });
        final v4f0 v4f0Var = (v4f0) ((bwr) this).viewModel;
        Objects.requireNonNull(v4f0Var);
        cVarFilter.subscribe(ffw.d(new e30() { // from class: l.i4f0
            public final void call(Object obj) {
                v4f0Var.m23733q((BLiveSignInDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m6696l4() {
        c cVarFilter = duringCreated(LivingNormalApiProvider.m4928r4()).filter(new w9j() { // from class: l.n4f0
            public final Object call(Object obj) {
                return this.f15824a.m6689e4((BLiveSignInAchievementMedals) obj);
            }
        });
        final v4f0 v4f0Var = (v4f0) ((bwr) this).viewModel;
        Objects.requireNonNull(v4f0Var);
        cVarFilter.subscribe(ffw.d(new e30() { // from class: l.y3f0
            public final void call(Object obj) {
                v4f0Var.m23732p((BLiveSignInAchievementMedals) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public void m6697m4() {
        ((v4f0) ((bwr) this).viewModel).m23734s(new d30() { // from class: l.d4f0
            public final void call() {
                this.f9057a.m6699o4();
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public void m6698n4(List<BLiveSignInReward> list) {
        if (vwb.J(list)) {
            return;
        }
        ((v4f0) ((bwr) this).viewModel).m23735u(list);
    }

    /* JADX INFO: renamed from: o4 */
    public final void m6699o4() {
        if (!TextUtils.isEmpty(this.f5320j) || ((Boolean) this.f5321k.get()).booleanValue()) {
            return;
        }
        this.f5320j = ((v4f0) ((bwr) this).viewModel).m23736v();
    }

    /* JADX INFO: renamed from: p4 */
    public final void m6700p4(SignInEvent.Page page) {
        if (!((v4f0) ((bwr) this).viewModel).m23728j()) {
            ypv.a.Y(true);
        }
        ((v4f0) ((bwr) this).viewModel).m23737w();
        m25548F2().BottomEvent.clearSignRedPoint().q();
        if (page == null) {
            page = SignInEvent.Page.MAIN;
        }
        int i = a.f5322a[page.ordinal()];
        if (i == 1) {
            m6702r4(true);
            return;
        }
        if (i == 2) {
            m6706u4();
        } else if (i == 3) {
            m6705t4();
        } else {
            if (i != 4) {
                return;
            }
            m6703s4();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: q4 */
    public void m6701q4(final List<BLiveSignInReward> list, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("roomId", m25547E2().m17239o());
        jSONObject.put("liveId", m25547E2().m17235k());
        duringCreated(LivingNormalApiProvider.m4625J7(jSONObject.toJSONString())).filter(new w9j() { // from class: l.w3f0
            public final Object call(Object obj) {
                return this.f21434a.m6690f4((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.e4f0
            public final void call(Object obj) {
                this.f9573a.m6691g4(list, (BLiveEnvelope) obj);
            }
        }, new g4f0(this)));
        m6707v4(str);
    }

    /* JADX INFO: renamed from: r4 */
    public void m6702r4(boolean z) {
        boolean zM23729k = ((v4f0) ((bwr) this).viewModel).m23729k();
        ((v4f0) ((bwr) this).viewModel).m23738x();
        if (!zM23729k || z) {
            m6695k4();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m6703s4() {
        ((v4f0) ((bwr) this).viewModel).m23739y();
        m6696l4();
        m6684Y3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m6704t() {
        super.t();
        zgt.C0943a c0943aM14505I0 = m25547E2().m14505I0();
        if (c0943aM14505I0.m27372h()) {
            this.f5319i = c0943aM14505I0.m27368d();
            m6700p4(SignInEvent.Page.MAIN);
        }
        duringCreated((c) m25548F2().SignInEvent.showSignDialog().g()).subscribe(ffw.d(new e30() { // from class: l.j4f0
            public final void call(Object obj) {
                this.f13558a.m6693i4((SignInEvent) obj);
            }
        }));
        duringCreated((c) m25548F2().DialogCenterEvent.changeVisibility().g()).filter(new w9j() { // from class: l.k4f0
            public final Object call(Object obj) {
                return Boolean.valueOf(((tzd) obj).f20436a == LiveDialogEnum.CHAT_INPUT);
            }
        }).filter(new w9j() { // from class: l.l4f0
            public final Object call(Object obj) {
                return Boolean.valueOf(((tzd) obj).f20438c);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.m4f0
            public final void call(Object obj) {
                this.f15234a.m6694j4((tzd) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m6705t4() {
        this.f5321k.put(Boolean.TRUE);
        m6684Y3();
        duringCreated(LivingNormalApiProvider.m4884m5()).subscribe(ffw.e(new e30() { // from class: l.z3f0
            public final void call(Object obj) {
                this.f23209a.m6692h4((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.a4f0
            public final void call(Object obj) {
                C0358a.m6674S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public void m6706u4() {
        ((v4f0) ((bwr) this).viewModel).m23721A();
        m6684Y3();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: v4 */
    public void m6707v4(String str) {
        HashMap map = new HashMap();
        map.put("anchor_id", ((DbObject) m25547E2().m14582l0()).id);
        map.put("live_id", m25547E2().m17234j().id);
        map.put("sign_source", this.f5319i);
        map.put("sign_task_id", str);
        zvf0.s("e_live_sign", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: w4 */
    public void m6708w4(String str) {
        HashMap map = new HashMap();
        map.put("anchor_id", ((DbObject) m25547E2().m14582l0()).id);
        map.put("live_id", m25547E2().m17234j().id);
        map.put("sign_source", this.f5319i);
        map.put("sign_task_id", str);
        zvf0.y("e_live_sign", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: x4 */
    public void m6709x4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchor_id", ((DbObject) m25547E2().m14582l0()).id);
        map.put("live_id", m25547E2().m17234j().id);
        map.put("sign_source", this.f5319i);
        map.put("reward_id", str2);
        map.put("text_live_sign", str);
        zvf0.s("e_live_sign_prize", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: y4 */
    public void m6710y4() {
        HashMap map = new HashMap();
        map.put("anchor_id", ((DbObject) m25547E2().m14582l0()).id);
        map.put("live_id", m25547E2().m17234j().id);
        map.put("sign_source", this.f5319i);
        zvf0.y("e_live_sign_prize", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: z4 */
    public void m6711z4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchor_id", ((DbObject) m25547E2().m14582l0()).id);
        map.put("live_id", m25547E2().m17234j().id);
        map.put("reward_id", str);
        map.put("sign_task_id", str2);
        zvf0.s("e_live_sign_reward", "p_user_live_room", map);
    }
}
