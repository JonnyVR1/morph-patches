package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p051p1.mobile.putong.core.view.AvatarUpdateCheckType;
import com.p051p1.mobile.putong.core.view.AvatarUpdateType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
public class dm1 extends ar2<lm1> {

    /* JADX INFO: renamed from: a */
    public String f89594a;

    /* JADX INFO: renamed from: b */
    public int f89595b;

    /* JADX INFO: renamed from: c */
    public p0k0 f89596c;

    /* JADX INFO: renamed from: d */
    public C22507a<p0k0.C19267b> f89597d;

    public dm1(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m116911C0(Integer num) {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: t0 */
    private void m116922t0() {
        Bundle extras = act().getIntent().getExtras();
        if (extras == null) {
            act().m68056e2();
        } else {
            this.f89595b = extras.getInt("type");
            this.f89594a = extras.getString("from");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m116923z0(Bundle bundle) {
        ((lm1) this.viewModel).m154844r();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m116924A0(p0k0.C19267b c19267b) {
        ((lm1) this.viewModel).m154847z(c19267b);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m116925D0(uxj0 uxj0Var) {
        act().progressDismiss();
        m116933s0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m116926E0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: F0 */
    public void m116927F0() {
        final p0k0.C19267b c19267bM222761e = this.f89597d.m222761e();
        if (aw90.m100562F().f73701a != null && !jyb.m147479J(aw90.m100562F().f73701a.pictures)) {
            aw90.m100562F().f73701a.pictures.set(0, c19267bM222761e.f150065b);
        }
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
        User userMo225055clone2 = userMo225055clone.mo225055clone();
        jyb.m147505e0(userMo225055clone.pictures, new qcj() { // from class: l.am1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj).cover().url.equals(c19267bM222761e.f150065b.cover().url));
            }
        });
        boolean zIsEmpty = userMo225055clone.pictures.isEmpty();
        List<Media> list = userMo225055clone.pictures;
        if (zIsEmpty) {
            list.add(c19267bM222761e.f150065b);
        } else {
            list.set(0, c19267bM222761e.f150065b);
        }
        User userSubtract = userMo225055clone.subtract(userMo225055clone2);
        if (userSubtract == null) {
            m116933s0();
        } else {
            act().progress(R$string.f18632L5);
            duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.bm1
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f77232a.m116925D0((uxj0) obj);
                }
            }, new y20() { // from class: l.cm1
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f82504a.m116926E0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m116928G0() {
        List<Media> listM116930p0 = m116930p0();
        int i = 0;
        while (true) {
            int size = listM116930p0.size();
            V v2 = this.viewModel;
            if (i >= size) {
                ((lm1) v2).m154841l(TextUtils.isEmpty(this.f89597d.m222761e().f150066c));
                return;
            } else {
                ((lm1) v2).m154838A(i, TextUtils.equals(this.f89597d.m222761e().f150065b.url, listM116930p0.get(i).url));
                i++;
            }
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        m116922t0();
        super.mo40472Z();
        m116934u0();
        creates(new y20() { // from class: l.tl1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174779a.m116923z0((Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(this.f89597d.observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.ul1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179475a.m116924A0((p0k0.C19267b) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.vl1
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return x5l0.f192503b;
            }
        }, false).subscribe(psd0.m173596G(new y20() { // from class: l.wl1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189627a.m116911C0((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m116929o0() {
        p0k0.C19266a c19266a = new p0k0.C19266a();
        c19266a.m170159h(AvatarUpdateCheckType.LOCAL_CHECK);
        c19266a.m170159h(AvatarUpdateCheckType.REMOTE_CHECK);
        c19266a.m170165n(AvatarUpdateType.AVATAR);
        c19266a.m170164m("verification");
        this.f89596c.m170119J0(act(), c19266a, this.f89597d);
    }

    /* JADX INFO: renamed from: p0 */
    public List<Media> m116930p0() {
        ArrayList arrayList = new ArrayList(CoreModule.f18264c.f20381e0.m116600p9().pictures);
        arrayList.remove(0);
        return new ArrayList(td8.m190612v0(jyb.m147522n(arrayList, new qcj() { // from class: l.xl1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf((media instanceof Picture) && ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.RECOMMEND)));
            }
        }), 3));
    }

    /* JADX INFO: renamed from: q0 */
    public String m116931q0() {
        int i = this.f89595b;
        if (i == 1) {
            return "头像本人认证";
        }
        if (i != 2) {
            return i != 3 ? "" : "国家网络身份认证";
        }
        return "实名·头像本人认证";
    }

    /* JADX INFO: renamed from: r0 */
    public void m116932r0() {
        p0k0.C19267b c19267bM222761e = this.f89597d.m222761e();
        String str = jyb.m147520m(m116930p0(), new qcj() { // from class: l.yl1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f200515a.m116935x0((Media) obj);
            }
        }) ? "recommend" : ProfileLikeModuleType.album;
        if (c19267bM222761e.f150064a.isLoading()) {
            o1j0.m165651y("照片上传中...");
            i4g0.m138523u("e_save_photo_continue_verify", "p_change_avatar_verification", pf60.m172085a("photo_status", "uploading"), pf60.m172085a("avatar_photo_source", str));
            return;
        }
        if (!c19267bM222761e.f150069f && c19267bM222761e.f150068e) {
            o1j0.m165651y("照片上传失败，请更换头像后尝试");
            i4g0.m138523u("e_save_photo_continue_verify", "p_change_avatar_verification", pf60.m172085a("photo_status", "upload_failed"), pf60.m172085a("avatar_photo_source", str));
        } else if (!TextUtils.isEmpty(c19267bM222761e.f150066c)) {
            o1j0.m165651y("照片未识别到单人清晰正脸，请更换头像后尝试");
            i4g0.m138523u("e_save_photo_continue_verify", "p_change_avatar_verification", pf60.m172085a("photo_status", "image_quality"), pf60.m172085a("avatar_photo_source", str));
        } else if (((lm1) this.viewModel).m154842p()) {
            i4g0.m138523u("e_save_photo_continue_verify", "p_change_avatar_verification", pf60.m172085a("photo_status", "default"), pf60.m172085a("avatar_photo_source", str));
            m116927F0();
        } else {
            pq4.m173302j(act(), true, new Runnable() { // from class: l.zl1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204873a.m116936y0();
                }
            });
            i4g0.m138523u("e_save_photo_continue_verify", "p_change_avatar_verification", pf60.m172085a("photo_status", "privacy_agreement"), pf60.m172085a("avatar_photo_source", str));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m116933s0() {
        int i = this.f89595b;
        if (i == 1) {
            hxf.m137588i(act(), this.f89594a, false, true);
        } else {
            if (i != 2) {
                return;
            }
            zki0.m220077F(act(), true);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m116934u0() {
        p0k0 p0k0Var = new p0k0();
        this.f89596c = p0k0Var;
        this.f89597d = p0k0Var.m170128c0();
        p0k0.C19267b c19267b = new p0k0.C19267b();
        c19267b.f150065b = CoreModule.f18264c.f20381e0.m116589ma().m61308fp();
        c19267b.f150066c = "五官不清晰";
        c19267b.f150069f = true;
        this.f89597d.onNext(c19267b);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Boolean m116935x0(Media media) {
        return Boolean.valueOf(TextUtils.equals(media.cover().url, this.f89597d.m222761e().f150065b.url));
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m116936y0() {
        ((lm1) this.viewModel).f132641s.setChecked(true);
        m116927F0();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
