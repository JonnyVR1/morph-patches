package p006l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.core.view.AvatarUpdateCheckType;
import com.p1.mobile.putong.core.view.AvatarUpdateType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.jo0;
import l.jq2;
import l.lrj0;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.pc8;
import l.roj0;
import l.s7m;
import l.v9j;
import l.vwb;
import l.w9j;
import l.wn90;
import l.zvf0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wl1 extends jq2<em1> {

    /* JADX INFO: renamed from: a */
    public String f25212a;

    /* JADX INFO: renamed from: b */
    public int f25213b;

    /* JADX INFO: renamed from: c */
    public lrj0 f25214c;

    /* JADX INFO: renamed from: d */
    public a<lrj0.b> f25215d;

    public wl1(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m26415C0(Integer num) {
        act().finish();
    }

    /* JADX INFO: renamed from: t0 */
    private void m26426t0() {
        Bundle extras = act().getIntent().getExtras();
        if (extras == null) {
            act().finish();
        } else {
            this.f25213b = extras.getInt("type");
            this.f25212a = extras.getString("from");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m26427z0(Bundle bundle) {
        ((em1) ((jq2) this).viewModel).m14701r();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m26428A0(lrj0.b bVar) {
        ((em1) ((jq2) this).viewModel).m14704z(bVar);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m26429D0(roj0 roj0Var) {
        act().progressDismiss();
        m26439s0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m26430E0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: F0 */
    public void m26431F0() {
        final lrj0.b bVar = (lrj0.b) this.f25215d.e();
        if (wn90.F().a != null && !vwb.J(wn90.F().a.pictures)) {
            wn90.F().a.pictures.set(0, bVar.b);
        }
        User userClone = CoreModule.f1534c.f3628e0.m21483na().clone();
        User userClone2 = userClone.clone();
        vwb.e0(userClone.pictures, new w9j() { // from class: l.tl1
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) ((Media) obj).cover()).url.equals(((Media) bVar.b.cover()).url));
            }
        });
        boolean zIsEmpty = userClone.pictures.isEmpty();
        List list = userClone.pictures;
        if (zIsEmpty) {
            list.add(bVar.b);
        } else {
            list.set(0, bVar.b);
        }
        User userSubtract = userClone.subtract(userClone2);
        if (userSubtract == null) {
            m26439s0();
        } else {
            act().progress(R$string.f1831J5);
            duringCreated(CoreModule.f1534c.f3628e0.m21510u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.ul1
                public final void call(Object obj) {
                    this.f23597a.m26429D0((roj0) obj);
                }
            }, new e30() { // from class: l.vl1
                public final void call(Object obj) {
                    this.f24370a.m26430E0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m26432G0() {
        List<Media> listM26436p0 = m26436p0();
        int i = 0;
        while (true) {
            int size = listM26436p0.size();
            s7m s7mVar = ((jq2) this).viewModel;
            if (i >= size) {
                ((em1) s7mVar).m14698l(TextUtils.isEmpty(((lrj0.b) this.f25215d.e()).c));
                return;
            } else {
                ((em1) s7mVar).m14693A(i, TextUtils.equals(((lrj0.b) this.f25215d.e()).b.url, listM26436p0.get(i).url));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m26433Z() {
        m26426t0();
        super.Z();
        m26440u0();
        creates(new e30() { // from class: l.ml1
            public final void call(Object obj) {
                this.f17020a.m26427z0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m26434a0() {
        super.a0();
        duringCreated(this.f25215d.observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.nl1
            public final void call(Object obj) {
                this.f17739a.m26428A0((lrj0.b) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.ol1
            public final Object call() {
                return rwk0.f20827b;
            }
        }, false).subscribe(mkd0.G(new e30() { // from class: l.pl1
            public final void call(Object obj) {
                this.f19182a.m26415C0((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m26435o0() {
        lrj0.a aVar = new lrj0.a();
        aVar.h(AvatarUpdateCheckType.LOCAL_CHECK);
        aVar.h(AvatarUpdateCheckType.REMOTE_CHECK);
        aVar.n(AvatarUpdateType.AVATAR);
        aVar.m("verification");
        this.f25214c.J0(act(), aVar, this.f25215d);
    }

    /* JADX INFO: renamed from: p0 */
    public List<Media> m26436p0() {
        ArrayList arrayList = new ArrayList(CoreModule.f1534c.f3628e0.m21490p9().pictures);
        arrayList.remove(0);
        return new ArrayList(pc8.v0(vwb.n(arrayList, new w9j() { // from class: l.ql1
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf((media instanceof Picture) && ((Picture) media).isLabelJudge(MediaLabel.get("RECOMMEND")));
            }
        }), 3));
    }

    /* JADX INFO: renamed from: q0 */
    public String m26437q0() {
        int i = this.f25213b;
        if (i == 1) {
            return "头像本人认证";
        }
        if (i != 2) {
            return i != 3 ? "" : "国家网络身份认证";
        }
        return "实名·头像本人认证";
    }

    /* JADX INFO: renamed from: r0 */
    public void m26438r0() {
        lrj0.b bVar = (lrj0.b) this.f25215d.e();
        String str = vwb.m(m26436p0(), new w9j() { // from class: l.rl1
            public final Object call(Object obj) {
                return this.f20600a.m26441x0((Media) obj);
            }
        }) ? "recommend" : "album";
        if (bVar.a.isLoading()) {
            lsi0.y("照片上传中...");
            zvf0.u("e_save_photo_continue_verify", "p_change_avatar_verification", new j760[]{j760.a("photo_status", "uploading"), j760.a("avatar_photo_source", str)});
            return;
        }
        if (!bVar.f && bVar.e) {
            lsi0.y("照片上传失败，请更换头像后尝试");
            zvf0.u("e_save_photo_continue_verify", "p_change_avatar_verification", new j760[]{j760.a("photo_status", "upload_failed"), j760.a("avatar_photo_source", str)});
        } else if (!TextUtils.isEmpty(bVar.c)) {
            lsi0.y("照片未识别到单人清晰正脸，请更换头像后尝试");
            zvf0.u("e_save_photo_continue_verify", "p_change_avatar_verification", new j760[]{j760.a("photo_status", "image_quality"), j760.a("avatar_photo_source", str)});
        } else if (((em1) ((jq2) this).viewModel).m14699p()) {
            zvf0.u("e_save_photo_continue_verify", "p_change_avatar_verification", new j760[]{j760.a("photo_status", CameraSticker.CATEGORY_DEFAULT_FILTER), j760.a("avatar_photo_source", str)});
            m26431F0();
        } else {
            qp4.m22307j(act(), true, new Runnable() { // from class: l.sl1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21412a.m26442y0();
                }
            });
            zvf0.u("e_save_photo_continue_verify", "p_change_avatar_verification", new j760[]{j760.a("photo_status", "privacy_agreement"), j760.a("avatar_photo_source", str)});
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m26439s0() {
        int i = this.f25213b;
        if (i == 1) {
            tvf.m24830i(act(), this.f25212a, false, true);
        } else {
            if (i != 2) {
                return;
            }
            zbi0.m28648F(act(), true);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m26440u0() {
        lrj0 lrj0Var = new lrj0();
        this.f25214c = lrj0Var;
        this.f25215d = lrj0Var.c0();
        lrj0.b bVar = new lrj0.b();
        bVar.b = CoreModule.f1534c.f3628e0.m21479ma().fp();
        bVar.c = "五官不清晰";
        bVar.f = true;
        this.f25215d.onNext(bVar);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Boolean m26441x0(Media media) {
        return Boolean.valueOf(TextUtils.equals(((Media) media.cover()).url, ((lrj0.b) this.f25215d.e()).b.url));
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m26442y0() {
        ((em1) ((jq2) this).viewModel).f11269s.setChecked(true);
        m26431F0();
    }

    public void destroy() {
    }
}
