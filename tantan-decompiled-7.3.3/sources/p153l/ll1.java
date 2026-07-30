package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p051p1.mobile.putong.core.view.AvatarUpdateCheckType;
import com.p051p1.mobile.putong.core.view.AvatarUpdateProgress;
import com.p051p1.mobile.putong.core.view.AvatarUpdateType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
public class ll1 extends ar2<rl1> {

    /* JADX INFO: renamed from: a */
    public C22507a<Boolean> f132515a;

    /* JADX INFO: renamed from: b */
    public p0k0 f132516b;

    /* JADX INFO: renamed from: c */
    public C22507a<p0k0.C19267b> f132517c;

    /* JADX INFO: renamed from: d */
    public int f132518d;

    public ll1(ner nerVar) {
        super(nerVar);
        this.f132515a = C22507a.m222758b();
        this.f132518d = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ C22421c m154676A0() {
        return this.f132517c.observeOn(fo0.m126432a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m154677D0(Boolean bool) {
        ((rl1) this.viewModel).m181904x(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m154687z0(Bundle bundle) {
        ((rl1) this.viewModel).m181896m();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m154688C0(p0k0.C19267b c19267b) {
        ((rl1) this.viewModel).m181903w(c19267b);
        AvatarUpdateProgress avatarUpdateProgress = c19267b.f150064a;
        AvatarUpdateProgress avatarUpdateProgress2 = AvatarUpdateProgress.FAIL;
        if (avatarUpdateProgress == avatarUpdateProgress2 || avatarUpdateProgress == AvatarUpdateProgress.FINISH) {
            if (avatarUpdateProgress == avatarUpdateProgress2 || ((Picture) c19267b.f150065b).isLabelJudge(MediaLabel.get(MediaLabel.LOW_FACE_MARK)) || ((Picture) c19267b.f150065b).isVerificationCheckFail()) {
                this.f132515a.onNext(Boolean.TRUE);
            } else {
                this.f132515a.onNext(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m154689E0(Integer num) {
        act().m68056e2();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f132518d = act().getIntent().getIntExtra("verification_type", -1);
        p0k0 p0k0Var = new p0k0();
        this.f132516b = p0k0Var;
        this.f132517c = p0k0Var.m170128c0();
        p0k0.C19267b c19267b = new p0k0.C19267b();
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        c19267b.f150065b = userMo225055clone.riskAuditUser(CoreModule.f18264c.f20381e0.m116503Pa("fake_risk_audit_default_" + userMo225055clone.f56859id)).m61308fp();
        c19267b.f150069f = true;
        this.f132517c.onNext(c19267b);
        creates(new y20() { // from class: l.cl1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82335a.m154687z0((Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(new pcj() { // from class: l.dl1
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f89485a.m154676A0();
            }
        }, false).subscribe(psd0.m173596G(new y20() { // from class: l.el1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94468a.m154688C0((p0k0.C19267b) obj);
            }
        }));
        duringCreated(this.f132515a).subscribe(psd0.m173596G(new y20() { // from class: l.fl1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99580a.m154677D0((Boolean) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.gl1
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return x5l0.f192503b;
            }
        }, false).subscribe(psd0.m173596G(new y20() { // from class: l.hl1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110472a.m154689E0((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public void m154690n0() {
        p0k0.C19266a c19266a = new p0k0.C19266a();
        c19266a.m170159h(AvatarUpdateCheckType.LOCAL_CHECK);
        c19266a.m170159h(AvatarUpdateCheckType.REMOTE_CHECK);
        c19266a.m170165n(AvatarUpdateType.AVATAR);
        c19266a.m170164m("verification");
        this.f132516b.m170119J0(act(), c19266a, this.f132517c);
    }

    /* JADX INFO: renamed from: o0 */
    public String m154691o0() {
        int i = this.f132518d;
        if (i == 1) {
            return "头像本人认证";
        }
        if (i != 2) {
            return i != 3 ? "" : "国家网络身份认证";
        }
        return "实名·头像本人认证";
    }

    /* JADX INFO: renamed from: p0 */
    public int m154692p0() {
        return this.f132518d;
    }

    /* JADX INFO: renamed from: q0 */
    public void m154693q0() {
        final p0k0.C19267b c19267bM222761e = this.f132517c.m222761e();
        if (c19267bM222761e.f150064a.isLoading()) {
            o1j0.m165651y("照片上传中...");
            i4g0.m138523u("e_confirm_start_verification", "p_photo_confirmation_verification", pf60.m172085a("photo_status", "uploading"), pf60.m172085a("avatar_photo_source", c19267bM222761e.f150068e ? ProfileLikeModuleType.album : "original"));
            return;
        }
        if (!c19267bM222761e.f150069f && c19267bM222761e.f150068e) {
            o1j0.m165651y("照片上传失败，请更换头像后尝试");
            i4g0.m138523u("e_confirm_start_verification", "p_photo_confirmation_verification", pf60.m172085a("photo_status", "upload_failed"), pf60.m172085a("avatar_photo_source", c19267bM222761e.f150068e ? ProfileLikeModuleType.album : "original"));
        } else if (m154696t0(c19267bM222761e.f150065b)) {
            o1j0.m165651y("照片未识别到单人清晰正脸，请更换头像后尝试");
            i4g0.m138523u("e_confirm_start_verification", "p_photo_confirmation_verification", pf60.m172085a("photo_status", "image_quality"), pf60.m172085a("avatar_photo_source", c19267bM222761e.f150068e ? ProfileLikeModuleType.album : "original"));
        } else if (((rl1) this.viewModel).m181897n()) {
            i4g0.m138523u("e_confirm_start_verification", "p_photo_confirmation_verification", pf60.m172085a("photo_status", "default"), pf60.m172085a("avatar_photo_source", c19267bM222761e.f150068e ? ProfileLikeModuleType.album : "original"));
            m154694r0(c19267bM222761e);
        } else {
            pq4.m173302j(act(), true, new Runnable() { // from class: l.il1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115477a.m154697u0(c19267bM222761e);
                }
            });
            i4g0.m138523u("e_confirm_start_verification", "p_photo_confirmation_verification", pf60.m172085a("photo_status", "privacy_agreement"), pf60.m172085a("avatar_photo_source", c19267bM222761e.f150068e ? ProfileLikeModuleType.album : "original"));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m154694r0(p0k0.C19267b c19267b) {
        if (!c19267b.f150068e) {
            m154695s0();
            return;
        }
        if (aw90.m100562F().f73701a != null && !jyb.m147479J(aw90.m100562F().f73701a.pictures)) {
            aw90.m100562F().f73701a.pictures.set(0, c19267b.f150065b);
        }
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
        User userMo225055clone2 = userMo225055clone.mo225055clone();
        userMo225055clone.pictures.set(0, c19267b.f150065b);
        User userSubtract = userMo225055clone.subtract(userMo225055clone2);
        if (userSubtract == null) {
            m154695s0();
        } else {
            act().progress(R$string.f18632L5);
            duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.jl1
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f121462a.m154698x0((uxj0) obj);
                }
            }, new y20() { // from class: l.kl1
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f127322a.m154699y0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m154695s0() {
        int i = this.f132518d;
        if (i == 1) {
            hxf.m137588i(act(), "verification_center", false, true);
        } else if (i == 2) {
            zki0.m220077F(act(), true);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m154696t0(Media media) {
        if (!(media instanceof Picture)) {
            return false;
        }
        Picture picture = (Picture) media;
        return picture.isLabelJudge(MediaLabel.get(MediaLabel.LOW_FACE_MARK)) || picture.isVerificationCheckFail();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m154697u0(p0k0.C19267b c19267b) {
        ((rl1) this.viewModel).f163677j.setChecked(true);
        m154694r0(c19267b);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m154698x0(uxj0 uxj0Var) {
        act().progressDismiss();
        m154695s0();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m154699y0(Throwable th) {
        o1j0.m165651y("网络无法连接");
        act().progressDismiss();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
