package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserSource;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;

/* JADX INFO: loaded from: classes5.dex */
public class o91 extends i6t<oo2, t91> {

    /* JADX INFO: renamed from: i */
    public int f145485i;

    /* JADX INFO: renamed from: j */
    public BLiveCall f145486j;

    /* JADX INFO: renamed from: k */
    public String f145487k;

    /* JADX INFO: renamed from: l */
    public int f145488l;

    /* JADX INFO: renamed from: m */
    public String f145489m;

    /* JADX INFO: renamed from: n */
    public zed0 f145490n;

    public o91(dum dumVar, zed0 zed0Var) {
        super(dumVar);
        this.f145485i = 1;
        this.f145487k = "";
        this.f145490n = zed0Var;
        mo52715C(new t91());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: Z3, reason: merged with bridge method [inline-methods] */
    public void m166666m4() {
        if (!wgt.m206254u(iit.INSTANCE.m140130P()) || m213810E2().mo183435j() == null || TextUtils.isEmpty(m213810E2().m202191k())) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72402F3(m213810E2().m202191k(), this.f145487k, this.f145489m, this.f145488l)).doOnError(new y20() { // from class: l.n91
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140734a.m166663j4((Throwable) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.b91
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75500a.m166664k4((BLiveCall) obj);
            }
        }, new y20() { // from class: l.c91
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80280a.m166665l4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public void m166650b4() {
        g64.m129083d("checkAndBindPhone");
        if (m166652g4()) {
            m166655r4(this.f196919f);
        } else {
            m166666m4();
        }
    }

    /* JADX INFO: renamed from: e4 */
    private String m166651e4(int i) {
        if (i == 1) {
            return RelationshipStatus.DEFAULT;
        }
        if (i == 2) {
            return "APPLY_HAS_SEND";
        }
        if (i == 3) {
            return "CALL_CONNECTING";
        }
        if (i == 4) {
            return "APPLY_FAIL";
        }
        if (i == 5) {
            return "DOWNLOADING";
        }
        return i == 6 ? "SUCCESS" : "NULL";
    }

    /* JADX INFO: renamed from: g4 */
    private boolean m166652g4() {
        Settings settings;
        User userMe_ = uqb0.f180396b0.f170325b.me_();
        if (userMe_ == null || (settings = userMe_.settings) == null) {
            return true;
        }
        if (TextUtils.isEmpty(settings.linkedPhoneNumber.number) && TextUtils.isEmpty(userMe_.settings.phoneNumber.number)) {
            return TEnum.equals(userMe_.source, "wechat") || TEnum.equals(userMe_.source, "qq") || TEnum.equals(userMe_.source, UserSource.network_security);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m166653o4(vxj0 vxj0Var) {
        m166656Y3(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public void m166654p4(LiveCallMessage liveCallMessage) {
        this.f145487k = liveCallMessage.getInviteId();
    }

    /* JADX INFO: renamed from: r4 */
    private void m166655r4(final Act act) {
        act.dialog().m21555t0(R$string.f47559H0, new Runnable() { // from class: l.d91
            @Override // java.lang.Runnable
            public final void run() {
                this.f85702a.m166667n4(act);
            }
        }).m21499D(R$string.f47869Vc).m21540k0(R$string.f47961a).m21495B(false).m21567z0();
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m166656Y3(int i) {
        if (this.f145485i != 6) {
            ((t91) this.viewModel).m189726u();
        }
        int i2 = this.f145485i;
        if (i2 != 1) {
            if (i2 == 6) {
                BLiveCall bLiveCallM178263f = this.f145490n.m161648Z3().m178263f(zrv.f205799a.m207631D0());
                if (u54.m194525e(this.f145486j)) {
                    m213811F2().CallEvent.personalManager().mo199273j(new u24().m194244a(this.f145490n.m161648Z3().m178270m().m143251k(bLiveCallM178263f.user)).m194245b(bLiveCallM178263f));
                    return;
                }
                return;
            }
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f145487k);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((t91) v2).m189724p(this.f196919f.getString(R$string.f48293p2));
            this.f145489m = "apply";
        } else {
            ((t91) v2).m189724p(this.f196919f.getString(R$string.f47794S0));
            this.f145489m = "invite";
        }
        this.f145488l = i;
        iit.Companion companion = iit.INSTANCE;
        if (wgt.m206254u(companion.m140130P())) {
            return;
        }
        duringCreated(wgt.m206249p(companion.m140130P(), null, new Object[0])).filter(new qcj() { // from class: l.k91
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f124431a.m166661h4((vxj0) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.l91
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130530a.m166662i4((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public void m166657a4(String str) {
        this.f145490n.m219437K4(str);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m166658c4() {
        g64.m129083d("checkAndRequestPermission");
        PermissionHelper.m81065c().m81083r("android.permission.RECORD_AUDIO").m81088w(false).m81086u(true).m81075j(false).m81080o(new x20() { // from class: l.m91
            @Override // p153l.x20
            public final void call() {
                this.f135326a.m166650b4();
            }
        }).m81074i(this.f196919f);
    }

    /* JADX INFO: renamed from: d4 */
    public void m166659d4() {
        int i = this.f145485i;
        if (i == 1) {
            m166671u4();
        } else if (i == 2) {
            m166657a4(this.f145486j.f45190id);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m166660f4(BLiveCall bLiveCall) {
        int i;
        this.f145486j = bLiveCall;
        if (u54.m194525e(bLiveCall)) {
            i = 6;
        } else if (u54.m194526f(bLiveCall)) {
            this.f145487k = "";
            i = 1;
        } else if (u54.m194536p(bLiveCall)) {
            i = 2;
        } else {
            i = u54.m194537q(bLiveCall) ? 3 : 0;
        }
        if (this.f145485i != i) {
            m166668q4(i);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ Boolean m166661h4(vxj0 vxj0Var) {
        return Boolean.valueOf(this.f145485i == 5);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m166662i4(vxj0 vxj0Var) {
        m166658c4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m166663j4(Throwable th) {
        m166668q4(1);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m166664k4(BLiveCall bLiveCall) {
        this.f145487k = "";
        this.f145488l = 0;
        o1j0.m165649w(R$string.f48028d0);
        this.f145490n.m219461j5(bLiveCall);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m166665l4(Throwable th) {
        this.f145490n.m161644V3(th);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m166667n4(Act act) {
        uqb0.f180396b0.f170325b.showBindPhoneDialog(act, new x20() { // from class: l.e91
            @Override // p153l.x20
            public final void call() {
                this.f92583a.m166666m4();
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public void m166668q4(int i) {
        g64.m129083d("setStatus: " + m166651e4(i));
        this.f145485i = i;
        ((t91) this.viewModel).m189725s(i);
    }

    /* JADX INFO: renamed from: s4 */
    public void m166669s4() {
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(4400).m174141B(zrv.m221193k().m203522T3().callAnnouncementUrl).m174146t(17).m174142p(CommonH5Builder.BgType.DEFAULT_BG).m174143q());
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().CallEvent.audienceCallAnchor().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.a91
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68979a.m166656Y3(((Integer) obj).intValue());
            }
        }));
        duringCreated(m213811F2().CallEvent.anchorCallAudience().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.f91
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97799a.m166653o4((vxj0) obj);
            }
        }));
        duringCreated(this.f145490n.m219441O4()).filter(new qcj() { // from class: l.g91
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(u54.m194531k((BLiveCall) obj));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.h91
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108293a.m166660f4((BLiveCall) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98283f()).filter(new qcj() { // from class: l.i91
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LiveCallMessage) obj).m73006is(2));
            }
        }).subscribe(new y20() { // from class: l.j91
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118840a.m166654p4((LiveCallMessage) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public void m166670t4() {
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(4400).m174141B(efv.f93852i).m174152z(1.0d, 0.4d).m174146t(80).m174142p(CommonH5Builder.BgType.DEFAULT_BG).m174143q());
    }

    /* JADX INFO: renamed from: u4 */
    public void m166671u4() {
        g64.m129083d("start apply");
        iit.Companion companion = iit.INSTANCE;
        if (wgt.m206254u(companion.m140130P())) {
            m166658c4();
        } else {
            m166668q4(5);
            wgt.m206249p(companion.m140130P(), null, new Object[0]).subscribe(dhw.m115824c());
        }
    }
}
