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
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkLaunchData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class rz70 extends sx70 {

    /* JADX INFO: renamed from: q */
    public final b180 f165495q;

    /* JADX INFO: renamed from: r */
    public final PkLaunchData f165496r;

    /* JADX INFO: renamed from: s */
    public DialogInterfaceC0075a f165497s;

    /* JADX INFO: renamed from: l.rz70$a */
    public static /* synthetic */ class C19939a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f165498a;

        static {
            int[] iArr = new int[PkAction.values().length];
            f165498a = iArr;
            try {
                iArr[PkAction.ACTION_PK_EXIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f165498a[PkAction.ACTION_PK_ONCE_MORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f165498a[PkAction.ACTION_TIME_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public rz70(dum dumVar, PkLaunchData pkLaunchData) {
        super(dumVar, pkLaunchData.pkViewInternal);
        this.f165496r = pkLaunchData;
        b180 b180Var = new b180(dumVar);
        this.f165495q = b180Var;
        this.f171085i.m213506R3(b180Var);
    }

    /* JADX INFO: renamed from: A4 */
    private void m183693A4() {
        ((uzl) m138856F3(new k210(600))).mo73041G(1001);
    }

    /* JADX INFO: renamed from: B4 */
    private void m183694B4() {
        DialogInterfaceC0075a dialogInterfaceC0075a = this.f165497s;
        if (dialogInterfaceC0075a == null || !dialogInterfaceC0075a.isShowing()) {
            return;
        }
        this.f165497s.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m183695D4(String str, boolean z, y20 y20Var) {
        n180.m161093j("setMuteRemoteAudio name = " + str + " isMute = " + z);
        m183704N4(z, true);
        y20Var.call(Boolean.valueOf(z));
        o1j0.m165651y(c680.m108111j(z, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m183696E4(BLivePk bLivePk) {
        n180.m161090g(this, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m183697F4(Throwable th) {
        n180.m161090g(this, false, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m183698G4(vxj0 vxj0Var) {
        m183718Q4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public /* synthetic */ String m183699H4(gu70 gu70Var) {
        return zrv.m221193k().m203735t5(mo183719U3(), m188456d4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public /* synthetic */ Boolean m183700I4(h880 h880Var) {
        return Boolean.valueOf(m188458j4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J4 */
    public void m183701J4(PkData pkData) {
        String string = pkData.state.toString();
        string.getClass();
        switch (string) {
            case "preparing":
                m213811F2().LivePkEvent.pkPrepare().mo199273j(pkData);
                this.f165495q.m101432b4(pkData);
                break;
            case "punishing":
                this.f171086j.m148631v4(true, pkData, pkData.lastStateIsPlaying());
                if (TextUtils.equals(((dw40) m213810E2()).m168532l0().f56859id, pkData.f52415pk.situation.winnerId)) {
                    User user = pkData.getUser(pkData.f52415pk.mvpUserId);
                    this.f171086j.m148613c4(user == null ? 0L : user.hierarchy.grade);
                }
                m188449S3(pkData);
                break;
            case "playing":
                lej0.INSTANCE.m153907a("pk_anchor_start_trace", "start_pk");
                m183706P4(pkData);
                m183703M4();
                break;
            case "ended":
                m183703M4();
                m183716C4();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public void m183702L4() {
        this.f165495q.m101438g4("leave");
    }

    /* JADX INFO: renamed from: M4 */
    private void m183703M4() {
        m183704N4(false, false);
        ((PkViewInternal) this.viewModel).m77312z0(false);
    }

    /* JADX INFO: renamed from: N4 */
    private void m183704N4(boolean z, boolean z2) {
        try {
            C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(600))).mo133182a();
            xzl xzlVar = (xzl) m138856F3(new r410(600));
            String strOtherUserId = this.f171085i.m213503N3().otherUserId();
            if (xzlVar != null) {
                xzlVar.mo170510P(Integer.parseInt(strOtherUserId), z);
            }
            if (c12877bMo133182a instanceof p880) {
                ((p880) c12877bMo133182a).m171199F1(strOtherUserId, z);
            }
            n180.m161086c(this, xzlVar == null, c12877bMo133182a == null, strOtherUserId, z);
            if (z2) {
                duringCreated(LivingNormalApiProvider.m72792w6(m188450T3(), z)).subscribe(dhw.m115826e(new y20() { // from class: l.oz70
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f149847a.m183696E4((BLivePk) obj);
                    }
                }, new y20() { // from class: l.pz70
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f154725a.m183697F4((Throwable) obj);
                    }
                }));
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    private void m183705O4() {
        BLiveSettings bLiveSettingsM203370A3 = zrv.m221193k().m203370A3();
        if (bLiveSettingsM203370A3 == null) {
            return;
        }
        ((dw40) m213810E2()).f148282z.m170288v(bLiveSettingsM203370A3.liveConfig.f45200pk.startShowMessage.anchorTemplateId);
    }

    /* JADX INFO: renamed from: P4 */
    private void m183706P4(PkData pkData) {
        m188449S3(pkData);
        if (pkData.isOnceMore()) {
            this.f165495q.m101457y4();
            m183717K4();
            ((xzl) m138856F3(new r410(600))).mo170538o(pkData.f52415pk.channelKey);
        } else {
            m183705O4();
            this.f165495q.m101429B4(pkData);
        }
        this.f171086j.m148631v4(false, pkData, true);
    }

    /* JADX INFO: renamed from: C4 */
    public void m183716C4() {
        this.f171086j.m148614d4();
        this.f165495q.m101430C4();
        m183693A4();
        su70.m187996d(this, false);
        su70.m187995c(this, false);
        this.f171087k.m133924R3();
        m188451W3();
        m183694B4();
    }

    /* JADX INFO: renamed from: K4 */
    public void m183717K4() {
        m183693A4();
        this.f171086j.m148629t4();
        m213811F2().LivePkEvent.pkOnceMoreSuccess().m199277p();
        this.f171087k.m133924R3();
    }

    /* JADX INFO: renamed from: Q4 */
    public void m183718Q4() {
        m213811F2().LivePkEvent.cancelMatch().m199277p();
        this.f165495q.m101438g4("leave");
    }

    @Override // p153l.sx70
    /* JADX INFO: renamed from: U3 */
    public int mo183719U3() {
        return ((Integer) m138856F3(new ku70(600))).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.sx70
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: V3 */
    public void mo153354V3(PkAction pkAction) {
        super.mo153354V3(pkAction);
        int i = C19939a.f165498a[pkAction.ordinal()];
        if (i == 1) {
            this.f171086j.m148632w4(new x20() { // from class: l.hz70
                @Override // p153l.x20
                public final void call() {
                    this.f112216a.m183702L4();
                }
            });
            i4g0.m138523u("e_pk_close_button", mo78457R2(), jyb.m147494Y("liveId", ((dw40) m213810E2()).mo183435j().f45171id), jyb.m147494Y("anchorId", ((dw40) m213810E2()).m168532l0().f56859id));
        } else if (i == 2) {
            m213811F2().LivePkEvent.clickOnceMore().mo199273j(this.f171085i.m213503N3().otherUser());
        } else {
            if (i != 3) {
                return;
            }
            this.f165495q.m101454v4(BLivePkStage.get(pkAction.getExtra()));
        }
    }

    @Override // p153l.sx70
    /* JADX INFO: renamed from: m4 */
    public void mo153356m4(final boolean z, final String str, final y20<Boolean> y20Var) {
        this.f165497s = c680.m108115o(this.f196919f, this, z, str, new x20() { // from class: l.qz70
            @Override // p153l.x20
            public final void call() {
                this.f160225a.m183695D4(str, z, y20Var);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.sx70, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(this.f171085i.m213505P3()).subscribe(dhw.m115825d(new y20() { // from class: l.iz70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117672a.m183701J4((PkData) obj);
            }
        }));
        this.f171085i.m213508V3(this.f165496r.message);
        duringCreated(m213811F2().LivePkEvent.liveEndEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.jz70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123237a.m183698G4((vxj0) obj);
            }
        }));
        m138860d3(gu70.class, new qcj() { // from class: l.kz70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f129391a.m183699H4((gu70) obj);
            }
        });
        m138860d3(h880.class, new qcj() { // from class: l.lz70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f134162a.m183700I4((h880) obj);
            }
        });
        C22421c c22421cFilter = duringCreated(((dw40) m213810E2()).m168545q1().m98256U()).filter(new qcj() { // from class: l.mz70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LivePkMessage) obj).type, "pk_cdn_fail"));
            }
        });
        final b180 b180Var = this.f165495q;
        Objects.requireNonNull(b180Var);
        c22421cFilter.subscribe(dhw.m115825d(new y20() { // from class: l.nz70
            @Override // p153l.y20
            public final void call(Object obj) {
                b180Var.m101440i4((LivePkMessage) obj);
            }
        }));
    }
}
