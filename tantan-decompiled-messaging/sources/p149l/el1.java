package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p046p1.mobile.putong.core.view.AvatarUpdateCheckType;
import com.p046p1.mobile.putong.core.view.AvatarUpdateProgress;
import com.p046p1.mobile.putong.core.view.AvatarUpdateType;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class el1 extends jq2<kl1> {

    /* JADX INFO: renamed from: a */
    public C22392a<Boolean> f92051a;

    /* JADX INFO: renamed from: b */
    public lrj0 f92052b;

    /* JADX INFO: renamed from: c */
    public C22392a<lrj0.C18309b> f92053c;

    /* JADX INFO: renamed from: d */
    public int f92054d;

    public el1(mcr mcrVar) {
        super(mcrVar);
        this.f92051a = C22392a.m221512b();
        this.f92054d = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ C22306c m117046A0() {
        return this.f92053c.observeOn(jo0.m142408a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m117047D0(Boolean bool) {
        ((kl1) this.viewModel).m146380x(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m117057z0(Bundle bundle) {
        ((kl1) this.viewModel).m146372m();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m117058C0(lrj0.C18309b c18309b) {
        ((kl1) this.viewModel).m146379w(c18309b);
        AvatarUpdateProgress avatarUpdateProgress = c18309b.f129724a;
        AvatarUpdateProgress avatarUpdateProgress2 = AvatarUpdateProgress.FAIL;
        if (avatarUpdateProgress == avatarUpdateProgress2 || avatarUpdateProgress == AvatarUpdateProgress.FINISH) {
            if (avatarUpdateProgress == avatarUpdateProgress2 || ((Picture) c18309b.f129725b).isLabelJudge(MediaLabel.get(MediaLabel.LOW_FACE_MARK)) || ((Picture) c18309b.f129725b).isVerificationCheckFail()) {
                this.f92051a.onNext(Boolean.TRUE);
            } else {
                this.f92051a.onNext(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m117059E0(Integer num) {
        act().m66873d2();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f92054d = act().getIntent().getIntExtra("verification_type", -1);
        lrj0 lrj0Var = new lrj0();
        this.f92052b = lrj0Var;
        this.f92053c = lrj0Var.m151455c0();
        lrj0.C18309b c18309b = new lrj0.C18309b();
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        c18309b.f129725b = userMo223809clone.riskAuditUser(CoreModule.f17545c.f19639e0.m169430Pa("fake_risk_audit_default_" + userMo223809clone.f56011id)).m60124fp();
        c18309b.f129729f = true;
        this.f92053c.onNext(c18309b);
        creates(new e30() { // from class: l.vk1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181759a.m117057z0((Bundle) obj);
            }
        });
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(new v9j() { // from class: l.wk1
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f186718a.m117046A0();
            }
        }, false).subscribe(mkd0.m154955G(new e30() { // from class: l.xk1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193255a.m117058C0((lrj0.C18309b) obj);
            }
        }));
        duringCreated(this.f92051a).subscribe(mkd0.m154955G(new e30() { // from class: l.yk1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198702a.m117047D0((Boolean) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.zk1
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return rwk0.f161352b;
            }
        }, false).subscribe(mkd0.m154955G(new e30() { // from class: l.al1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70360a.m117059E0((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public void m117060n0() {
        lrj0.C18308a c18308a = new lrj0.C18308a();
        c18308a.m151486h(AvatarUpdateCheckType.LOCAL_CHECK);
        c18308a.m151486h(AvatarUpdateCheckType.REMOTE_CHECK);
        c18308a.m151492n(AvatarUpdateType.AVATAR);
        c18308a.m151491m("verification");
        this.f92052b.m151446J0(act(), c18308a, this.f92053c);
    }

    /* JADX INFO: renamed from: o0 */
    public String m117061o0() {
        int i = this.f92054d;
        if (i == 1) {
            return "头像本人认证";
        }
        if (i != 2) {
            return i != 3 ? "" : "国家网络身份认证";
        }
        return "实名·头像本人认证";
    }

    /* JADX INFO: renamed from: p0 */
    public int m117062p0() {
        return this.f92054d;
    }

    /* JADX INFO: renamed from: q0 */
    public void m117063q0() {
        final lrj0.C18309b c18309bM221515e = this.f92053c.m221515e();
        if (c18309bM221515e.f129724a.isLoading()) {
            lsi0.m151595y("照片上传中...");
            zvf0.m220399u("e_confirm_start_verification", "p_photo_confirmation_verification", j760.m140076a("photo_status", "uploading"), j760.m140076a("avatar_photo_source", c18309bM221515e.f129728e ? ProfileLikeModuleType.album : "original"));
            return;
        }
        if (!c18309bM221515e.f129729f && c18309bM221515e.f129728e) {
            lsi0.m151595y("照片上传失败，请更换头像后尝试");
            zvf0.m220399u("e_confirm_start_verification", "p_photo_confirmation_verification", j760.m140076a("photo_status", "upload_failed"), j760.m140076a("avatar_photo_source", c18309bM221515e.f129728e ? ProfileLikeModuleType.album : "original"));
        } else if (m117066t0(c18309bM221515e.f129725b)) {
            lsi0.m151595y("照片未识别到单人清晰正脸，请更换头像后尝试");
            zvf0.m220399u("e_confirm_start_verification", "p_photo_confirmation_verification", j760.m140076a("photo_status", "image_quality"), j760.m140076a("avatar_photo_source", c18309bM221515e.f129728e ? ProfileLikeModuleType.album : "original"));
        } else if (((kl1) this.viewModel).m146373n()) {
            zvf0.m220399u("e_confirm_start_verification", "p_photo_confirmation_verification", j760.m140076a("photo_status", "default"), j760.m140076a("avatar_photo_source", c18309bM221515e.f129728e ? ProfileLikeModuleType.album : "original"));
            m117064r0(c18309bM221515e);
        } else {
            qp4.m175804j(act(), true, new Runnable() { // from class: l.bl1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f76155a.m117067u0(c18309bM221515e);
                }
            });
            zvf0.m220399u("e_confirm_start_verification", "p_photo_confirmation_verification", j760.m140076a("photo_status", "privacy_agreement"), j760.m140076a("avatar_photo_source", c18309bM221515e.f129728e ? ProfileLikeModuleType.album : "original"));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m117064r0(lrj0.C18309b c18309b) {
        if (!c18309b.f129728e) {
            m117065s0();
            return;
        }
        if (wn90.m204602F().f187269a != null && !vwb.m200296J(wn90.m204602F().f187269a.pictures)) {
            wn90.m204602F().f187269a.pictures.set(0, c18309b.f129725b);
        }
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
        User userMo223809clone2 = userMo223809clone.mo223809clone();
        userMo223809clone.pictures.set(0, c18309b.f129725b);
        User userSubtract = userMo223809clone.subtract(userMo223809clone2);
        if (userSubtract == null) {
            m117065s0();
        } else {
            act().progress(R$string.f17842J5);
            duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.cl1
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f81362a.m117068x0((roj0) obj);
                }
            }, new e30() { // from class: l.dl1
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f86773a.m117069y0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m117065s0() {
        int i = this.f92054d;
        if (i == 1) {
            tvf.m190731i(act(), "verification_center", false, true);
        } else if (i == 2) {
            zbi0.m217857F(act(), true);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m117066t0(Media media) {
        if (!(media instanceof Picture)) {
            return false;
        }
        Picture picture = (Picture) media;
        return picture.isLabelJudge(MediaLabel.get(MediaLabel.LOW_FACE_MARK)) || picture.isVerificationCheckFail();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m117067u0(lrj0.C18309b c18309b) {
        ((kl1) this.viewModel).f123627j.setChecked(true);
        m117064r0(c18309b);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m117068x0(roj0 roj0Var) {
        act().progressDismiss();
        m117065s0();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m117069y0(Throwable th) {
        lsi0.m151595y("网络无法连接");
        act().progressDismiss();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
