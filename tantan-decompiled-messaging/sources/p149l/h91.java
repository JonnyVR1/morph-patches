package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserSource;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;

/* JADX INFO: loaded from: classes5.dex */
public class h91 extends h4t<ho2, m91> {

    /* JADX INFO: renamed from: i */
    public int f106502i;

    /* JADX INFO: renamed from: j */
    public BLiveCall f106503j;

    /* JADX INFO: renamed from: k */
    public String f106504k;

    /* JADX INFO: renamed from: l */
    public int f106505l;

    /* JADX INFO: renamed from: m */
    public String f106506m;

    /* JADX INFO: renamed from: n */
    public w6d0 f106507n;

    public h91(bsm bsmVar, w6d0 w6d0Var) {
        super(bsmVar);
        this.f106502i = 1;
        this.f106504k = "";
        this.f106507n = w6d0Var;
        mo51532C(new m91());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Z3, reason: merged with bridge method [inline-methods] */
    public void m129942m4() {
        if (!vet.m198237u(hgt.INSTANCE.m130909P()) || m206027E2().mo149813j() == null || TextUtils.isEmpty(m206027E2().m149814k())) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71219F3(m206027E2().m149814k(), this.f106504k, this.f106506m, this.f106505l)).doOnError(new e30() { // from class: l.g91
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101539a.m129939j4((Throwable) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.u81
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175089a.m129940k4((BLiveCall) obj);
            }
        }, new e30() { // from class: l.v81
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180441a.m129941l4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public void m129926b4() {
        h54.m129377d("checkAndBindPhone");
        if (m129928g4()) {
            m129931r4(this.f188513f);
        } else {
            m129942m4();
        }
    }

    /* JADX INFO: renamed from: e4 */
    private String m129927e4(int i) {
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
    private boolean m129928g4() {
        Settings settings;
        User userMe_ = qib0.f154713b0.f139231b.me_();
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
    public /* synthetic */ void m129929o4(soj0 soj0Var) {
        m129932Y3(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public void m129930p4(LiveCallMessage liveCallMessage) {
        this.f106504k = liveCallMessage.getInviteId();
    }

    /* JADX INFO: renamed from: r4 */
    private void m129931r4(final Act act) {
        act.dialog().m20556t0(R$string.f46711H0, new Runnable() { // from class: l.w81
            @Override // java.lang.Runnable
            public final void run() {
                this.f185133a.m129943n4(act);
            }
        }).m20500D(R$string.f47021Vc).m20541k0(R$string.f47113a).m20496B(false).m20568z0();
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m129932Y3(int i) {
        if (this.f106502i != 6) {
            ((m91) this.viewModel).m153581u();
        }
        int i2 = this.f106502i;
        if (i2 != 1) {
            if (i2 == 6) {
                BLiveCall bLiveCallM108753f = this.f106507n.m162531Z3().m108753f(ypv.f199493a.m199309D0());
                if (v44.m196937e(this.f106503j)) {
                    m206028F2().CallEvent.personalManager().mo172463j(new v14().m196538a(this.f106507n.m162531Z3().m108760m().m133917k(bLiveCallM108753f.user)).m196539b(bLiveCallM108753f));
                    return;
                }
                return;
            }
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f106504k);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((m91) v2).m153579p(this.f188513f.getString(R$string.f47445p2));
            this.f106506m = "apply";
        } else {
            ((m91) v2).m153579p(this.f188513f.getString(R$string.f46946S0));
            this.f106506m = "invite";
        }
        this.f106505l = i;
        hgt.Companion companion = hgt.INSTANCE;
        if (vet.m198237u(companion.m130909P())) {
            return;
        }
        duringCreated(vet.m198232p(companion.m130909P(), null, new Object[0])).filter(new w9j() { // from class: l.d91
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f84931a.m129937h4((soj0) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.e91
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89915a.m129938i4((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public void m129933a4(String str) {
        this.f106507n.m201764K4(str);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m129934c4() {
        h54.m129377d("checkAndRequestPermission");
        PermissionHelper.m79882c().m79900r("android.permission.RECORD_AUDIO").m79905w(false).m79903u(true).m79892j(false).m79897o(new d30() { // from class: l.f91
            @Override // p149l.d30
            public final void call() {
                this.f96440a.m129926b4();
            }
        }).m79891i(this.f188513f);
    }

    /* JADX INFO: renamed from: d4 */
    public void m129935d4() {
        int i = this.f106502i;
        if (i == 1) {
            m129947u4();
        } else if (i == 2) {
            m129933a4(this.f106503j.f44342id);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m129936f4(BLiveCall bLiveCall) {
        int i;
        this.f106503j = bLiveCall;
        if (v44.m196937e(bLiveCall)) {
            i = 6;
        } else if (v44.m196938f(bLiveCall)) {
            this.f106504k = "";
            i = 1;
        } else if (v44.m196948p(bLiveCall)) {
            i = 2;
        } else {
            i = v44.m196949q(bLiveCall) ? 3 : 0;
        }
        if (this.f106502i != i) {
            m129944q4(i);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ Boolean m129937h4(soj0 soj0Var) {
        return Boolean.valueOf(this.f106502i == 5);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m129938i4(soj0 soj0Var) {
        m129934c4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m129939j4(Throwable th) {
        m129944q4(1);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m129940k4(BLiveCall bLiveCall) {
        this.f106504k = "";
        this.f106505l = 0;
        lsi0.m151593w(R$string.f47180d0);
        this.f106507n.m201788j5(bLiveCall);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m129941l4(Throwable th) {
        this.f106507n.m162527V3(th);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m129943n4(Act act) {
        qib0.f154713b0.f139231b.showBindPhoneDialog(act, new d30() { // from class: l.x81
            @Override // p149l.d30
            public final void call() {
                this.f191424a.m129942m4();
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public void m129944q4(int i) {
        h54.m129377d("setStatus: " + m129927e4(i));
        this.f106502i = i;
        ((m91) this.viewModel).m153580s(i);
    }

    /* JADX INFO: renamed from: s4 */
    public void m129945s4() {
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(4400).m142598B(ypv.m215672k().m195735T3().callAnnouncementUrl).m142603t(17).m142599p(CommonH5Builder.BgType.DEFAULT_BG).m142600q());
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().CallEvent.audienceCallAnchor().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.t81
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168797a.m129932Y3(((Integer) obj).intValue());
            }
        }));
        duringCreated(m206028F2().CallEvent.anchorCallAudience().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.y81
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196756a.m129929o4((soj0) obj);
            }
        }));
        duringCreated(this.f106507n.m201768O4()).filter(new w9j() { // from class: l.z81
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(v44.m196943k((BLiveCall) obj));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.a91
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68104a.m129936f4((BLiveCall) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189101f()).filter(new w9j() { // from class: l.b91
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LiveCallMessage) obj).m71823is(2));
            }
        }).subscribe(new e30() { // from class: l.c91
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79850a.m129930p4((LiveCallMessage) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public void m129946t4() {
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(4400).m142598B(ddv.f85659i).m142609z(1.0d, 0.4d).m142603t(80).m142599p(CommonH5Builder.BgType.DEFAULT_BG).m142600q());
    }

    /* JADX INFO: renamed from: u4 */
    public void m129947u4() {
        h54.m129377d("start apply");
        hgt.Companion companion = hgt.INSTANCE;
        if (vet.m198237u(companion.m130909P())) {
            m129934c4();
        } else {
            m129944q4(5);
            vet.m198232p(companion.m130909P(), null, new Object[0]).subscribe(ffw.m121192c());
        }
    }
}
