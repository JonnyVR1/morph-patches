package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0075a;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLivePk;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkAction;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkLaunchData;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class m180 extends s680 {

    /* JADX INFO: renamed from: p */
    public final j080 f134396p;

    /* JADX INFO: renamed from: q */
    public final PkLaunchData f134397q;

    /* JADX INFO: renamed from: r */
    public DialogInterfaceC0075a f134398r;

    /* JADX INFO: renamed from: l.m180$a */
    public static /* synthetic */ class C18521a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f134399a;

        static {
            int[] iArr = new int[PkAction.values().length];
            f134399a = iArr;
            try {
                iArr[PkAction.ACTION_PK_EXIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f134399a[PkAction.ACTION_PK_ONCE_MORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f134399a[PkAction.ACTION_TIME_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public m180(dum dumVar, PkLaunchData pkLaunchData) {
        super(dumVar, pkLaunchData.pkView);
        this.f134397q = pkLaunchData;
        j080 j080Var = new j080(dumVar);
        this.f134396p = j080Var;
        this.f166543i.m134138R3(j080Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J4 */
    public /* synthetic */ void m156604J4(vxj0 vxj0Var) {
        m156626T4();
    }

    /* JADX INFO: renamed from: D4 */
    public final void m156611D4() {
        ((uzl) m138856F3(new k210(600))).mo73041G(1001);
    }

    /* JADX INFO: renamed from: E4 */
    public final void m156612E4() {
        DialogInterfaceC0075a dialogInterfaceC0075a = this.f134398r;
        if (dialogInterfaceC0075a == null || !dialogInterfaceC0075a.isShowing()) {
            return;
        }
        this.f134398r.dismiss();
    }

    /* JADX INFO: renamed from: F4 */
    public void m156613F4() {
        this.f166544j.m114813e4();
        this.f134396p.m142946C4();
        m156611D4();
        su70.m187996d(this, false);
        su70.m187995c(this, false);
        this.f166545k.m166470R3();
        m184860W3();
        m156612E4();
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m156614G4(String str, boolean z, y20 y20Var) {
        n180.m161093j("setMuteRemoteAudio name = " + str + " isMute = " + z);
        m156623Q4(z, true);
        y20Var.call(Boolean.valueOf(z));
        o1j0.m165651y(c680.m108111j(z, str));
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m156615H4(BLivePk bLivePk) {
        n180.m161090g(this, true, null);
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m156616I4(Throwable th) {
        n180.m161090g(this, false, th);
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ String m156617K4(gu70 gu70Var) {
        return zrv.m221193k().m203735t5(mo156627U3(), m184870g4());
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ Boolean m156618L4(h880 h880Var) {
        return Boolean.valueOf(m184876m4());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M4 */
    public final void m156619M4(PkData pkData) {
        String string = pkData.state.toString();
        string.getClass();
        switch (string) {
            case "preparing":
                m213811F2().LivePkEvent.pkPrepare().mo199273j(pkData);
                this.f134396p.m142948b4(pkData);
                break;
            case "punishing":
                this.f166544j.m114828x4(true, pkData, pkData.lastStateIsPlaying());
                if (TextUtils.equals(((dw40) m213810E2()).m168532l0().f56859id, pkData.f52415pk.situation.winnerId)) {
                    User user = pkData.getUser(pkData.f52415pk.mvpUserId);
                    this.f166544j.m114812d4(user == null ? 0L : user.hierarchy.grade);
                }
                m184858S3(pkData);
                break;
            case "playing":
                lej0.INSTANCE.m153907a("pk_anchor_start_trace", "start_pk");
                m156625S4(pkData);
                m156622P4();
                break;
            case "ended":
                m156622P4();
                m156613F4();
                break;
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m156620N4() {
        m156611D4();
        this.f166544j.m114826v4();
        m213811F2().LivePkEvent.pkOnceMoreSuccess().m199277p();
        this.f166545k.m166470R3();
    }

    /* JADX INFO: renamed from: O4 */
    public final void m156621O4() {
        this.f134396p.m142952g4("leave");
    }

    /* JADX INFO: renamed from: P4 */
    public final void m156622P4() {
        m156623Q4(false, false);
        ((PkView) this.viewModel).m77220n0(false);
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m156623Q4(boolean z, boolean z2) {
        try {
            C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(600))).mo133182a();
            xzl xzlVar = (xzl) m138856F3(new r410(600));
            String strOtherUserId = this.f166543i.m134135N3().otherUserId();
            if (xzlVar != null) {
                xzlVar.mo170510P(Integer.parseInt(strOtherUserId), z);
            }
            if (c12877bMo133182a instanceof p880) {
                ((p880) c12877bMo133182a).m171199F1(strOtherUserId, z);
            }
            n180.m161086c(this, xzlVar == null, c12877bMo133182a == null, strOtherUserId, z);
            if (z2) {
                duringCreated(LivingNormalApiProvider.m72792w6(m184859T3(), z)).subscribe(dhw.m115826e(new y20() { // from class: l.j180
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f117940a.m156615H4((BLivePk) obj);
                    }
                }, new y20() { // from class: l.k180
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f123453a.m156616I4((Throwable) obj);
                    }
                }));
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R4 */
    public final void m156624R4() {
        BLiveSettings bLiveSettingsM203370A3 = zrv.m221193k().m203370A3();
        if (bLiveSettingsM203370A3 == null) {
            return;
        }
        ((dw40) m213810E2()).f148282z.m170288v(bLiveSettingsM203370A3.liveConfig.f45200pk.startShowMessage.anchorTemplateId);
    }

    /* JADX INFO: renamed from: S4 */
    public final void m156625S4(PkData pkData) {
        m184858S3(pkData);
        if (pkData.isOnceMore()) {
            this.f134396p.m142957y4();
            m156620N4();
            ((xzl) m138856F3(new r410(600))).mo170538o(pkData.f52415pk.channelKey);
        } else {
            m156624R4();
            this.f134396p.m142945B4(pkData);
        }
        this.f166544j.m114828x4(false, pkData, true);
    }

    /* JADX INFO: renamed from: T4 */
    public void m156626T4() {
        m213811F2().LivePkEvent.cancelMatch().m199277p();
        this.f134396p.m142952g4("leave");
    }

    @Override // p153l.s680
    /* JADX INFO: renamed from: U3 */
    public int mo156627U3() {
        return ((Integer) m138856F3(new ku70(600))).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.s680
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: V3 */
    public void mo156628V3(PkAction pkAction) {
        super.mo156628V3(pkAction);
        int i = C18521a.f134399a[pkAction.ordinal()];
        if (i == 1) {
            this.f166544j.m114829y4(new x20() { // from class: l.c180
                @Override // p153l.x20
                public final void call() {
                    this.f79377a.m156621O4();
                }
            });
            i4g0.m138523u("e_pk_close_button", mo78457R2(), jyb.m147494Y("liveId", ((dw40) m213810E2()).mo183435j().f45171id), jyb.m147494Y("anchorId", ((dw40) m213810E2()).m168532l0().f56859id));
        } else if (i == 2) {
            m213811F2().LivePkEvent.clickOnceMore().mo199273j(this.f166543i.m134135N3().otherUser());
        } else {
            if (i != 3) {
                return;
            }
            this.f134396p.m142956v4(BLivePkStage.get(pkAction.getExtra()));
        }
    }

    @Override // p153l.s680
    /* JADX INFO: renamed from: p4 */
    public void mo156629p4(final boolean z, final String str, final y20<Boolean> y20Var) {
        this.f134398r = c680.m108115o(this.f196919f, this, z, str, new x20() { // from class: l.l180
            @Override // p153l.x20
            public final void call() {
                this.f129661a.m156614G4(str, z, y20Var);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.s680, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(this.f166543i.m134137P3()).subscribe(dhw.m115825d(new y20() { // from class: l.d180
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84653a.m156619M4((PkData) obj);
            }
        }));
        this.f166543i.m134142V3(this.f134397q.message);
        duringCreated(m213811F2().LivePkEvent.liveEndEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.e180
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91571a.m156604J4((vxj0) obj);
            }
        }));
        m138860d3(gu70.class, new qcj() { // from class: l.f180
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f96772a.m156617K4((gu70) obj);
            }
        });
        m138860d3(h880.class, new qcj() { // from class: l.g180
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f101726a.m156618L4((h880) obj);
            }
        });
        C22421c c22421cFilter = duringCreated(((dw40) m213810E2()).m168545q1().m98256U()).filter(new qcj() { // from class: l.h180
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LivePkMessage) obj).type, "pk_cdn_fail"));
            }
        });
        final j080 j080Var = this.f134396p;
        Objects.requireNonNull(j080Var);
        c22421cFilter.subscribe(dhw.m115825d(new y20() { // from class: l.i180
            @Override // p153l.y20
            public final void call(Object obj) {
                j080Var.m142954i4((LivePkMessage) obj);
            }
        }));
    }
}
