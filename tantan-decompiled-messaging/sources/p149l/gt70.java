package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0074a;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLivePk;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkAction;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkLaunchData;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class gt70 extends my70 {

    /* JADX INFO: renamed from: p */
    public final ds70 f104249p;

    /* JADX INFO: renamed from: q */
    public final PkLaunchData f104250q;

    /* JADX INFO: renamed from: r */
    public DialogInterfaceC0074a f104251r;

    /* JADX INFO: renamed from: l.gt70$a */
    public static /* synthetic */ class C17151a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f104252a;

        static {
            int[] iArr = new int[PkAction.values().length];
            f104252a = iArr;
            try {
                iArr[PkAction.ACTION_PK_EXIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104252a[PkAction.ACTION_PK_ONCE_MORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104252a[PkAction.ACTION_TIME_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public gt70(bsm bsmVar, PkLaunchData pkLaunchData) {
        super(bsmVar, pkLaunchData.pkView);
        this.f104250q = pkLaunchData;
        ds70 ds70Var = new ds70(bsmVar);
        this.f104249p = ds70Var;
        this.f136259i.m99907R3(ds70Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J4 */
    public /* synthetic */ void m127881J4(soj0 soj0Var) {
        m127903T4();
    }

    /* JADX INFO: renamed from: D4 */
    public final void m127888D4() {
        ((bxl) m129297F3(new bu00(600))).mo71858G(1001);
    }

    /* JADX INFO: renamed from: E4 */
    public final void m127889E4() {
        DialogInterfaceC0074a dialogInterfaceC0074a = this.f104251r;
        if (dialogInterfaceC0074a == null || !dialogInterfaceC0074a.isShowing()) {
            return;
        }
        this.f104251r.dismiss();
    }

    /* JADX INFO: renamed from: F4 */
    public void m127890F4() {
        this.f136260j.m211926e4();
        this.f104249p.m113414C4();
        m127888D4();
        mm70.m155308d(this, false);
        mm70.m155307c(this, false);
        this.f136261k.m144026R3();
        m156976W3();
        m127889E4();
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m127891G4(String str, boolean z, e30 e30Var) {
        ht70.m132853j("setMuteRemoteAudio name = " + str + " isMute = " + z);
        m127900Q4(z, true);
        e30Var.call(Boolean.valueOf(z));
        lsi0.m151595y(wx70.m205910j(z, str));
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m127892H4(BLivePk bLivePk) {
        ht70.m132850g(this, true, null);
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m127893I4(Throwable th) {
        ht70.m132850g(this, false, th);
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ String m127894K4(am70 am70Var) {
        return ypv.m215672k().m195948t5(mo127904U3(), m156986g4());
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ Boolean m127895L4(b080 b080Var) {
        return Boolean.valueOf(m156992m4());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M4 */
    public final void m127896M4(PkData pkData) {
        String string = pkData.state.toString();
        string.getClass();
        switch (string) {
            case "preparing":
                m206028F2().LivePkEvent.pkPrepare().mo172463j(pkData);
                this.f104249p.m113415b4(pkData);
                break;
            case "punishing":
                this.f136260j.m211941x4(true, pkData, pkData.lastStateIsPlaying());
                if (TextUtils.equals(((pn40) m206027E2()).m132146l0().f56011id, pkData.f51567pk.situation.winnerId)) {
                    User user = pkData.getUser(pkData.f51567pk.mvpUserId);
                    this.f136260j.m211925d4(user == null ? 0L : user.hierarchy.grade);
                }
                m156974S3(pkData);
                break;
            case "playing":
                h5j0.INSTANCE.m129402a("pk_anchor_start_trace", "start_pk");
                m127902S4(pkData);
                m127899P4();
                break;
            case "ended":
                m127899P4();
                m127890F4();
                break;
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m127897N4() {
        m127888D4();
        this.f136260j.m211939v4();
        m206028F2().LivePkEvent.pkOnceMoreSuccess().m172467p();
        this.f136261k.m144026R3();
    }

    /* JADX INFO: renamed from: O4 */
    public final void m127898O4() {
        this.f104249p.m113418g4("leave");
    }

    /* JADX INFO: renamed from: P4 */
    public final void m127899P4() {
        m127900Q4(false, false);
        ((PkView) this.viewModel).m76037n0(false);
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m127900Q4(boolean z, boolean z2) {
        try {
            C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(600))).mo133471a();
            exl exlVar = (exl) m129297F3(new jw00(600));
            String strOtherUserId = this.f136259i.m99904N3().otherUserId();
            if (exlVar != null) {
                exlVar.mo118674P(Integer.parseInt(strOtherUserId), z);
            }
            if (c12714bMo133471a instanceof j080) {
                ((j080) c12714bMo133471a).m139151F1(strOtherUserId, z);
            }
            ht70.m132846c(this, exlVar == null, c12714bMo133471a == null, strOtherUserId, z);
            if (z2) {
                duringCreated(LivingNormalApiProvider.m71609w6(m156975T3(), z)).subscribe(ffw.m121194e(new e30() { // from class: l.dt70
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f87823a.m127892H4((BLivePk) obj);
                    }
                }, new e30() { // from class: l.et70
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f93091a.m127893I4((Throwable) obj);
                    }
                }));
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R4 */
    public final void m127901R4() {
        BLiveSettings bLiveSettingsM195583A3 = ypv.m215672k().m195583A3();
        if (bLiveSettingsM195583A3 == null) {
            return;
        }
        ((pn40) m206027E2()).f108769z.m181793v(bLiveSettingsM195583A3.liveConfig.f44352pk.startShowMessage.anchorTemplateId);
    }

    /* JADX INFO: renamed from: S4 */
    public final void m127902S4(PkData pkData) {
        m156974S3(pkData);
        if (pkData.isOnceMore()) {
            this.f104249p.m113422y4();
            m127897N4();
            ((exl) m129297F3(new jw00(600))).mo118680o(pkData.f51567pk.channelKey);
        } else {
            m127901R4();
            this.f104249p.m113413B4(pkData);
        }
        this.f136260j.m211941x4(false, pkData, true);
    }

    /* JADX INFO: renamed from: T4 */
    public void m127903T4() {
        m206028F2().LivePkEvent.cancelMatch().m172467p();
        this.f104249p.m113418g4("leave");
    }

    @Override // p149l.my70
    /* JADX INFO: renamed from: U3 */
    public int mo127904U3() {
        return ((Integer) m129297F3(new em70(600))).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.my70
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: V3 */
    public void mo127905V3(PkAction pkAction) {
        super.mo127905V3(pkAction);
        int i = C17151a.f104252a[pkAction.ordinal()];
        if (i == 1) {
            this.f136260j.m211942y4(new d30() { // from class: l.ws70
                @Override // p149l.d30
                public final void call() {
                    this.f187906a.m127898O4();
                }
            });
            zvf0.m220399u("e_pk_close_button", mo77274R2(), vwb.m200311Y("liveId", ((pn40) m206027E2()).mo149813j().f44323id), vwb.m200311Y("anchorId", ((pn40) m206027E2()).m132146l0().f56011id));
        } else if (i == 2) {
            m206028F2().LivePkEvent.clickOnceMore().mo172463j(this.f136259i.m99904N3().otherUser());
        } else {
            if (i != 3) {
                return;
            }
            this.f104249p.m113421v4(BLivePkStage.get(pkAction.getExtra()));
        }
    }

    @Override // p149l.my70
    /* JADX INFO: renamed from: p4 */
    public void mo127906p4(final boolean z, final String str, final e30<Boolean> e30Var) {
        this.f104251r = wx70.m205914o(this.f188513f, this, z, str, new d30() { // from class: l.ft70
            @Override // p149l.d30
            public final void call() {
                this.f99152a.m127891G4(str, z, e30Var);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.my70, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(this.f136259i.m99906P3()).subscribe(ffw.m121193d(new e30() { // from class: l.xs70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194209a.m127896M4((PkData) obj);
            }
        }));
        this.f136259i.m99911V3(this.f104250q.message);
        duringCreated(m206028F2().LivePkEvent.liveEndEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ys70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199751a.m127881J4((soj0) obj);
            }
        }));
        m129301d3(am70.class, new w9j() { // from class: l.zs70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f204572a.m127894K4((am70) obj);
            }
        });
        m129301d3(b080.class, new w9j() { // from class: l.at70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f71589a.m127895L4((b080) obj);
            }
        });
        C22306c c22306cFilter = duringCreated(((pn40) m206027E2()).m132160q1().m189074U()).filter(new w9j() { // from class: l.bt70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LivePkMessage) obj).type, "pk_cdn_fail"));
            }
        });
        final ds70 ds70Var = this.f104249p;
        Objects.requireNonNull(ds70Var);
        c22306cFilter.subscribe(ffw.m121193d(new e30() { // from class: l.ct70
            @Override // p149l.e30
            public final void call(Object obj) {
                ds70Var.m113420i4((LivePkMessage) obj);
            }
        }));
    }
}
