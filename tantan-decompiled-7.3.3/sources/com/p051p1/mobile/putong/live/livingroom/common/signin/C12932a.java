package com.p051p1.mobile.putong.live.livingroom.common.signin;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import com.p051p1.mobile.putong.live.livingroom.common.signin.SignInEvent;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p153l.ajt;
import p153l.cdf0;
import p153l.dhw;
import p153l.dum;
import p153l.fwk;
import p153l.h1e;
import p153l.i4g0;
import p153l.i6t;
import p153l.jxd0;
import p153l.jyb;
import p153l.ncf0;
import p153l.o1j0;
import p153l.oo2;
import p153l.qcj;
import p153l.x20;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12932a<T extends oo2> extends i6t<T, cdf0> {

    /* JADX INFO: renamed from: i */
    public String f50125i;

    /* JADX INFO: renamed from: j */
    public String f50126j;

    /* JADX INFO: renamed from: k */
    public jxd0 f50127k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f50128a;

        static {
            int[] iArr = new int[SignInEvent.Page.values().length];
            f50128a = iArr;
            try {
                iArr[SignInEvent.Page.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50128a[SignInEvent.Page.RULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50128a[SignInEvent.Page.PRIZE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50128a[SignInEvent.Page.MEDAL_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C12932a(dum<T> dumVar) {
        super(dumVar);
        this.f50127k = new jxd0("live_sign_in_clicked_my_reward" + zrv.f205799a.m207631D0(), Boolean.FALSE);
        mo52715C(new cdf0());
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m74329S3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public void m74335a4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            String str = ((TantanException.Client.CoreService) th).metaMessage;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            o1j0.m165636j(str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: A4 */
    public void m74336A4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchor_id", m213810E2().m168532l0().f56859id);
        map.put("live_id", m213810E2().mo183435j().f45171id);
        map.put("reward_id", str);
        map.put("sign_task_id", str2);
        i4g0.m138527y("e_live_sign_reward", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: B4 */
    public void m74337B4(String str, String str2, int i, boolean z) {
        HashMap map = new HashMap();
        map.put("anchor_id", m213810E2().m168532l0().f56859id);
        map.put("live_id", m213810E2().mo183435j().f45171id);
        map.put("sign_source", this.f50125i);
        map.put("task_days", Integer.valueOf(i));
        map.put("task_type", str2);
        map.put("is_available", Boolean.valueOf(z));
        map.put("type_name", str);
        i4g0.m138521s("e_live_sign_task_list", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: C4 */
    public void m74338C4(String str, String str2, int i, boolean z) {
        HashMap map = new HashMap();
        map.put("anchor_id", m213810E2().m168532l0().f56859id);
        map.put("live_id", m213810E2().mo183435j().f45171id);
        map.put("sign_source", this.f50125i);
        map.put("task_days", Integer.valueOf(i));
        map.put("task_type", str2);
        map.put("is_available", Boolean.valueOf(z));
        map.put("type_name", str);
        i4g0.m138527y("e_live_sign_task_list", "p_user_live_room", map);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m74339Y3() {
        if (TextUtils.isEmpty(this.f50126j)) {
            return;
        }
        fwk.m127777h().m127779g(this.f50126j);
        this.f50126j = null;
    }

    /* JADX INFO: renamed from: Z3 */
    public void m74340Z3(String str, final List<BLiveSignInReward> list) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rewardId", (Object) str);
        duringCreated((C22421c<T>) LivingNormalApiProvider.m72503Q5(jSONObject.toJSONString())).filter(new qcj() { // from class: l.icf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f114406a.m74341b4((BLiveEnvelope) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.jcf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120047a.m74342c4(list, (BLiveEnvelope) obj);
            }
        }, new ncf0(this)));
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ Boolean m74341b4(BLiveEnvelope bLiveEnvelope) {
        return Boolean.valueOf(((cdf0) this.viewModel).m109179j());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m74342c4(List list, BLiveEnvelope bLiveEnvelope) {
        m74350k4();
        m74353n4(list);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ Boolean m74343d4(BLiveSignInDetail bLiveSignInDetail) {
        return Boolean.valueOf(((cdf0) this.viewModel).m109179j() && NullChecker.m82486a(bLiveSignInDetail));
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ Boolean m74344e4(BLiveSignInAchievementMedals bLiveSignInAchievementMedals) {
        return Boolean.valueOf(((cdf0) this.viewModel).m109179j() && NullChecker.m82486a(bLiveSignInAchievementMedals));
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Boolean m74345f4(BLiveEnvelope bLiveEnvelope) {
        return Boolean.valueOf(((cdf0) this.viewModel).m109179j());
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m74346g4(List list, BLiveEnvelope bLiveEnvelope) {
        m74350k4();
        m74353n4(list);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m74347h4(BLiveEnvelope bLiveEnvelope) {
        ((cdf0) this.viewModel).m109191z(bLiveEnvelope.data.signInPrizes);
        m74364y4();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m74348i4(SignInEvent signInEvent) {
        if (!TextUtils.isEmpty(signInEvent.f50121a)) {
            this.f50125i = signInEvent.f50121a;
        }
        m74355p4(signInEvent.f50122b);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m74349j4(h1e h1eVar) {
        ((cdf0) this.viewModel).m109178i();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74350k4() {
        C22421c<T> c22421cFilter = duringCreated((C22421c<T>) LivingNormalApiProvider.m72557W5()).filter(new qcj() { // from class: l.ocf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f146699a.m74343d4((BLiveSignInDetail) obj);
            }
        });
        final cdf0 cdf0Var = (cdf0) this.viewModel;
        Objects.requireNonNull(cdf0Var);
        c22421cFilter.subscribe(dhw.m115825d(new y20() { // from class: l.pcf0
            @Override // p153l.y20
            public final void call(Object obj) {
                cdf0Var.m109184q((BLiveSignInDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m74351l4() {
        C22421c<T> c22421cFilter = duringCreated((C22421c<T>) LivingNormalApiProvider.m72745r4()).filter(new qcj() { // from class: l.ucf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f178424a.m74344e4((BLiveSignInAchievementMedals) obj);
            }
        });
        final cdf0 cdf0Var = (cdf0) this.viewModel;
        Objects.requireNonNull(cdf0Var);
        c22421cFilter.subscribe(dhw.m115825d(new y20() { // from class: l.fcf0
            @Override // p153l.y20
            public final void call(Object obj) {
                cdf0Var.m109183p((BLiveSignInAchievementMedals) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public void m74352m4() {
        ((cdf0) this.viewModel).m109185s(new x20() { // from class: l.kcf0
            @Override // p153l.x20
            public final void call() {
                this.f125061a.m74354o4();
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public void m74353n4(List<BLiveSignInReward> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        ((cdf0) this.viewModel).m109186u(list);
    }

    /* JADX INFO: renamed from: o4 */
    public final void m74354o4() {
        if (!TextUtils.isEmpty(this.f50126j) || this.f50127k.get().booleanValue()) {
            return;
        }
        this.f50126j = ((cdf0) this.viewModel).m109187v();
    }

    /* JADX INFO: renamed from: p4 */
    public final void m74355p4(SignInEvent.Page page) {
        if (!((cdf0) this.viewModel).m109179j()) {
            zrv.f205799a.m207654Y(true);
        }
        ((cdf0) this.viewModel).m109188w();
        m213811F2().BottomEvent.clearSignRedPoint().m199278q();
        if (page == null) {
            page = SignInEvent.Page.MAIN;
        }
        int i = a.f50128a[page.ordinal()];
        if (i == 1) {
            m74357r4(true);
            return;
        }
        if (i == 2) {
            m74360u4();
        } else if (i == 3) {
            m74359t4();
        } else {
            if (i != 4) {
                return;
            }
            m74358s4();
        }
    }

    /* JADX INFO: renamed from: q4 */
    public void m74356q4(final List<BLiveSignInReward> list, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("roomId", (Object) m213810E2().m202194o());
        jSONObject.put("liveId", (Object) m213810E2().m202191k());
        duringCreated((C22421c<T>) LivingNormalApiProvider.m72442J7(jSONObject.toJSONString())).filter(new qcj() { // from class: l.dcf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f87783a.m74345f4((BLiveEnvelope) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.lcf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131356a.m74346g4(list, (BLiveEnvelope) obj);
            }
        }, new ncf0(this)));
        m74361v4(str);
    }

    /* JADX INFO: renamed from: r4 */
    public void m74357r4(boolean z) {
        boolean zM109180k = ((cdf0) this.viewModel).m109180k();
        ((cdf0) this.viewModel).m109189x();
        if (!zM109180k || z) {
            m74350k4();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m74358s4() {
        ((cdf0) this.viewModel).m109190y();
        m74351l4();
        m74339Y3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ajt.C15728a c15728aM168458I0 = m213810E2().m168458I0();
        if (c15728aM168458I0.m98485h()) {
            this.f50125i = c15728aM168458I0.m98481d();
            m74355p4(SignInEvent.Page.MAIN);
        }
        duringCreated((C22421c<T>) m213811F2().SignInEvent.showSignDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.qcf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156597a.m74348i4((SignInEvent) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().DialogCenterEvent.changeVisibility().m199270g()).filter(new qcj() { // from class: l.rcf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((h1e) obj).f107441a == LiveDialogEnum.CHAT_INPUT);
            }
        }).filter(new qcj() { // from class: l.scf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((h1e) obj).f107443c);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.tcf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173231a.m74349j4((h1e) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m74359t4() {
        this.f50127k.put(Boolean.TRUE);
        m74339Y3();
        duringCreated((C22421c<T>) LivingNormalApiProvider.m72701m5()).subscribe(dhw.m115826e(new y20() { // from class: l.gcf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103565a.m74347h4((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.hcf0
            @Override // p153l.y20
            public final void call(Object obj) {
                C12932a.m74329S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public void m74360u4() {
        ((cdf0) this.viewModel).m109174A();
        m74339Y3();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: v4 */
    public void m74361v4(String str) {
        HashMap map = new HashMap();
        map.put("anchor_id", m213810E2().m168532l0().f56859id);
        map.put("live_id", m213810E2().mo183435j().f45171id);
        map.put("sign_source", this.f50125i);
        map.put("sign_task_id", str);
        i4g0.m138521s("e_live_sign", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: w4 */
    public void m74362w4(String str) {
        HashMap map = new HashMap();
        map.put("anchor_id", m213810E2().m168532l0().f56859id);
        map.put("live_id", m213810E2().mo183435j().f45171id);
        map.put("sign_source", this.f50125i);
        map.put("sign_task_id", str);
        i4g0.m138527y("e_live_sign", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: x4 */
    public void m74363x4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchor_id", m213810E2().m168532l0().f56859id);
        map.put("live_id", m213810E2().mo183435j().f45171id);
        map.put("sign_source", this.f50125i);
        map.put("reward_id", str2);
        map.put("text_live_sign", str);
        i4g0.m138521s("e_live_sign_prize", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: y4 */
    public void m74364y4() {
        HashMap map = new HashMap();
        map.put("anchor_id", m213810E2().m168532l0().f56859id);
        map.put("live_id", m213810E2().mo183435j().f45171id);
        map.put("sign_source", this.f50125i);
        i4g0.m138527y("e_live_sign_prize", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: z4 */
    public void m74365z4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchor_id", m213810E2().m168532l0().f56859id);
        map.put("live_id", m213810E2().mo183435j().f45171id);
        map.put("reward_id", str);
        map.put("sign_task_id", str2);
        i4g0.m138521s("e_live_sign_reward", "p_user_live_room", map);
    }
}
