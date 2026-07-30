package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.core.view.AvatarUpdateCheckType;
import com.p1.mobile.putong.core.view.AvatarUpdateProgress;
import com.p1.mobile.putong.core.view.AvatarUpdateType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.j760;
import l.jo0;
import l.jq2;
import l.lrj0;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.v9j;
import l.vwb;
import l.wn90;
import l.zvf0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class el1 extends jq2<kl1> {

    /* JADX INFO: renamed from: a */
    public a<Boolean> f11217a;

    /* JADX INFO: renamed from: b */
    public lrj0 f11218b;

    /* JADX INFO: renamed from: c */
    public a<lrj0.b> f11219c;

    /* JADX INFO: renamed from: d */
    public int f11220d;

    public el1(mcr mcrVar) {
        super(mcrVar);
        this.f11217a = a.b();
        this.f11220d = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ c m14639A0() {
        return this.f11219c.observeOn(jo0.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m14640D0(Boolean bool) {
        ((kl1) ((jq2) this).viewModel).m18183x(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m14650z0(Bundle bundle) {
        ((kl1) ((jq2) this).viewModel).m18175m();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m14651C0(lrj0.b bVar) {
        ((kl1) ((jq2) this).viewModel).m18182w(bVar);
        AvatarUpdateProgress avatarUpdateProgress = bVar.a;
        AvatarUpdateProgress avatarUpdateProgress2 = AvatarUpdateProgress.FAIL;
        if (avatarUpdateProgress == avatarUpdateProgress2 || avatarUpdateProgress == AvatarUpdateProgress.FINISH) {
            if (avatarUpdateProgress == avatarUpdateProgress2 || bVar.b.isLabelJudge(MediaLabel.get("LOW_FACE_MARK")) || bVar.b.isVerificationCheckFail()) {
                this.f11217a.onNext(Boolean.TRUE);
            } else {
                this.f11217a.onNext(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m14652E0(Integer num) {
        act().finish();
    }

    /* JADX INFO: renamed from: Z */
    public void m14653Z() {
        super.Z();
        this.f11220d = act().getIntent().getIntExtra("verification_type", -1);
        lrj0 lrj0Var = new lrj0();
        this.f11218b = lrj0Var;
        this.f11219c = lrj0Var.c0();
        lrj0.b bVar = new lrj0.b();
        User userClone = CoreModule.f1534c.f3628e0.m21490p9().clone();
        bVar.b = userClone.riskAuditUser(CoreModule.f1534c.f3628e0.m21393Pa("fake_risk_audit_default_" + ((DbObject) userClone).id)).fp();
        bVar.f = true;
        this.f11219c.onNext(bVar);
        creates(new e30() { // from class: l.vk1
            public final void call(Object obj) {
                this.f24349a.m14650z0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m14654a0() {
        super.a0();
        duringCreated(new v9j() { // from class: l.wk1
            public final Object call() {
                return this.f25187a.m14639A0();
            }
        }, false).subscribe(mkd0.G(new e30() { // from class: l.xk1
            public final void call(Object obj) {
                this.f27555a.m14651C0((lrj0.b) obj);
            }
        }));
        duringCreated(this.f11217a).subscribe(mkd0.G(new e30() { // from class: l.yk1
            public final void call(Object obj) {
                this.f28253a.m14640D0((Boolean) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.zk1
            public final Object call() {
                return rwk0.f20827b;
            }
        }, false).subscribe(mkd0.G(new e30() { // from class: l.al1
            public final void call(Object obj) {
                this.f8305a.m14652E0((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public void m14655n0() {
        lrj0.a aVar = new lrj0.a();
        aVar.h(AvatarUpdateCheckType.LOCAL_CHECK);
        aVar.h(AvatarUpdateCheckType.REMOTE_CHECK);
        aVar.n(AvatarUpdateType.AVATAR);
        aVar.m("verification");
        this.f11218b.J0(act(), aVar, this.f11219c);
    }

    /* JADX INFO: renamed from: o0 */
    public String m14656o0() {
        int i = this.f11220d;
        if (i == 1) {
            return "头像本人认证";
        }
        if (i != 2) {
            return i != 3 ? "" : "国家网络身份认证";
        }
        return "实名·头像本人认证";
    }

    /* JADX INFO: renamed from: p0 */
    public int m14657p0() {
        return this.f11220d;
    }

    /* JADX INFO: renamed from: q0 */
    public void m14658q0() {
        final lrj0.b bVar = (lrj0.b) this.f11219c.e();
        if (bVar.a.isLoading()) {
            lsi0.y("照片上传中...");
            zvf0.u("e_confirm_start_verification", "p_photo_confirmation_verification", new j760[]{j760.a("photo_status", "uploading"), j760.a("avatar_photo_source", bVar.e ? "album" : "original")});
            return;
        }
        if (!bVar.f && bVar.e) {
            lsi0.y("照片上传失败，请更换头像后尝试");
            zvf0.u("e_confirm_start_verification", "p_photo_confirmation_verification", new j760[]{j760.a("photo_status", "upload_failed"), j760.a("avatar_photo_source", bVar.e ? "album" : "original")});
        } else if (m14661t0(bVar.b)) {
            lsi0.y("照片未识别到单人清晰正脸，请更换头像后尝试");
            zvf0.u("e_confirm_start_verification", "p_photo_confirmation_verification", new j760[]{j760.a("photo_status", "image_quality"), j760.a("avatar_photo_source", bVar.e ? "album" : "original")});
        } else if (((kl1) ((jq2) this).viewModel).m18176n()) {
            zvf0.u("e_confirm_start_verification", "p_photo_confirmation_verification", new j760[]{j760.a("photo_status", CameraSticker.CATEGORY_DEFAULT_FILTER), j760.a("avatar_photo_source", bVar.e ? "album" : "original")});
            m14659r0(bVar);
        } else {
            qp4.m22307j(act(), true, new Runnable() { // from class: l.bl1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8963a.m14662u0(bVar);
                }
            });
            zvf0.u("e_confirm_start_verification", "p_photo_confirmation_verification", new j760[]{j760.a("photo_status", "privacy_agreement"), j760.a("avatar_photo_source", bVar.e ? "album" : "original")});
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m14659r0(lrj0.b bVar) {
        if (!bVar.e) {
            m14660s0();
            return;
        }
        if (wn90.F().a != null && !vwb.J(wn90.F().a.pictures)) {
            wn90.F().a.pictures.set(0, bVar.b);
        }
        User userClone = CoreModule.f1534c.f3628e0.m21483na().clone();
        User userClone2 = userClone.clone();
        userClone.pictures.set(0, bVar.b);
        User userSubtract = userClone.subtract(userClone2);
        if (userSubtract == null) {
            m14660s0();
        } else {
            act().progress(R$string.f1831J5);
            duringCreated(CoreModule.f1534c.f3628e0.m21510u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.cl1
                public final void call(Object obj) {
                    this.f9707a.m14663x0((roj0) obj);
                }
            }, new e30() { // from class: l.dl1
                public final void call(Object obj) {
                    this.f10454a.m14664y0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m14660s0() {
        int i = this.f11220d;
        if (i == 1) {
            tvf.m24830i(act(), "verification_center", false, true);
        } else if (i == 2) {
            zbi0.m28648F(act(), true);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m14661t0(Media media) {
        if (!(media instanceof Picture)) {
            return false;
        }
        Picture picture = (Picture) media;
        return picture.isLabelJudge(MediaLabel.get("LOW_FACE_MARK")) || picture.isVerificationCheckFail();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m14662u0(lrj0.b bVar) {
        ((kl1) ((jq2) this).viewModel).f15881j.setChecked(true);
        m14659r0(bVar);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m14663x0(roj0 roj0Var) {
        act().progressDismiss();
        m14660s0();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m14664y0(Throwable th) {
        lsi0.y("网络无法连接");
        act().progressDismiss();
    }

    public void destroy() {
    }
}
