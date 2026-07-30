package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.p058ui.profile.TagGuidePicAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopMyLifeFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import p151v.VButton;

/* JADX INFO: loaded from: classes4.dex */
public class l2i0 implements iam<d2i0> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f129773a;

    /* JADX INFO: renamed from: b */
    public ImageView f129774b;

    /* JADX INFO: renamed from: c */
    public VButton f129775c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f129776d;

    /* JADX INFO: renamed from: e */
    public VButton f129777e;

    /* JADX INFO: renamed from: f */
    public final TagGuidePicAct f129778f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopMyLifeFrag f129779g;

    /* JADX INFO: renamed from: h */
    public LoopInputType f129780h;

    public l2i0(TagGuidePicAct tagGuidePicAct) {
        this.f129778f = tagGuidePicAct;
    }

    /* JADX INFO: renamed from: j */
    private void m152607j() {
        this.f129778f.m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m152608m(View view) {
        TagGuidePicAct tagGuidePicAct = this.f129778f;
        tagGuidePicAct.f33891e = -1;
        tagGuidePicAct.m68056e2();
    }

    /* JADX INFO: renamed from: A */
    public void m152609A() {
        if ((gra.m131771x2() || gra.m131776y2()) && this.f129778f.m51960e2()) {
            User userM95676c = a2i0.m95674b().m95676c();
            ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f129779g;
            if (profileLoopMyLifeFrag != null) {
                profileLoopMyLifeFrag.mo52773P4(userM95676c);
                this.f129777e.setEnabled(userM95676c.subtract(CoreModule.f18264c.f20381e0.m116593na()) != null);
            }
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f129778f;
    }

    /* JADX INFO: renamed from: i */
    public View m152610i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m2i0.m156863b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m152610i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m152612l(boolean z, View view) {
        m152621x(z);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m152613n(final boolean z, View view) {
        LoopInputType loopInputType;
        if (NullChecker.m82486a(this.f129779g) && (this.f129779g.m52839h5() || (loopInputType = this.f129779g.f34303z) == LoopInputType.TAG_MATCH_PIC || loopInputType == LoopInputType.PIC_MATCH_TAG)) {
            new th0.C20312a(act()).m191160s("修改未保存").m191148g(true).m191143b(true).m191159r("保存后退出").m191156o(new View.OnClickListener() { // from class: l.h2i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f107560a.m152612l(z, view2);
                }
            }).m191151j("是否保存后再退出？").m191147f("不保存").m191144c(new View.OnClickListener() { // from class: l.i2i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f112623a.m152608m(view2);
                }
            }).m191142a().m191141g();
        } else {
            this.f129778f.m68056e2();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m152614p(boolean z, View view) {
        sfj0.m185596c("e_tag_add_photo_continue", this.f129778f.pageId(), new sfj0.C20032a[0]);
        boolean zM131778z = gra.m131778z();
        TagGuidePicAct tagGuidePicAct = this.f129778f;
        if (zM131778z) {
            mkf.m158776M(tagGuidePicAct, false, z);
        } else {
            y1i0.m213948M(tagGuidePicAct, false, z);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m152615q(boolean z, View view) {
        m152621x(z);
    }

    /* JADX INFO: renamed from: r */
    public void m152616r() {
        m152622y();
        final boolean booleanExtra = this.f129778f.getIntent().getBooleanExtra("tag_save_data", false);
        bnl0.m105509E0(this.f129774b, new View.OnClickListener() { // from class: l.e2i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91768a.m152613n(booleanExtra, view);
            }
        });
        VButton vButton = this.f129775c;
        VButton vButton2 = this.f129777e;
        if ((gra.m131771x2() || gra.m131776y2()) && this.f129778f.m51960e2()) {
            vButton = this.f129777e;
            bnl0.m105524M(this.f129775c, false);
            bnl0.m105537U(this.f129776d, qa00.m175859d(68.0f));
            vButton.setEnabled(false);
        }
        bnl0.m105509E0(vButton2, new View.OnClickListener() { // from class: l.f2i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96885a.m152614p(booleanExtra, view);
            }
        });
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.g2i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101847a.m152615q(booleanExtra, view);
            }
        });
        m152623z();
        if (gra.m131778z()) {
            bnl0.m105505C0(this.f129774b, qa00.m175859d(32.0f));
            bnl0.m105507D0(qa00.m175859d(32.0f), this.f129774b);
            bnl0.m105558h0(this.f129774b, 0);
            bnl0.m105538V(this.f129774b, qa00.m175859d(10.0f));
            this.f129774b.setImageResource(dbc0.f87643zh);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m152617s(int i, User user) {
        this.f129778f.progressDismiss();
        if (w20.m204491f(act())) {
            m152607j();
        }
        if (!this.f129778f.m51960e2() || i <= 0) {
            return;
        }
        o1j0.m165651y("上传成功");
        i4g0.m138495D("e_invisible_photo_upload_success", this.f129778f.pageId(), jyb.m147494Y("upload_photos_count", Integer.valueOf(i)), jyb.m147494Y("invisible_photo_unlock_status", user.pictures.size() >= 3 ? "unlock_all" : "unlock_one"));
    }

    /* JADX INFO: renamed from: u */
    public void m152618u() {
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f129779g;
        if (profileLoopMyLifeFrag == null) {
            return;
        }
        profileLoopMyLifeFrag.m52841j5();
        if ((gra.m131771x2() || gra.m131776y2()) && this.f129778f.m51960e2()) {
            a2i0.m95674b().m95675a();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m152619v(List<Media> list) {
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f129779g;
        if (profileLoopMyLifeFrag == null) {
            return;
        }
        profileLoopMyLifeFrag.mo52783Y4(list, 0);
    }

    /* JADX INFO: renamed from: w */
    public void m152620w() {
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f129779g;
        if (profileLoopMyLifeFrag == null) {
            return;
        }
        profileLoopMyLifeFrag.m52842k5();
        m152623z();
    }

    /* JADX INFO: renamed from: x */
    public final void m152621x(boolean z) {
        TagGuidePicAct tagGuidePicAct = this.f129778f;
        tagGuidePicAct.f33891e = 0;
        sfj0.m185596c("e_edit_lifestyle_save", tagGuidePicAct.pageId(), new sfj0.C20032a[0]);
        if (!z) {
            m152607j();
            return;
        }
        this.f129778f.progress(R$string.f18632L5, true);
        User userM95676c = a2i0.m95674b().m95676c();
        this.f129779g.mo52773P4(userM95676c);
        final User userSubtract = userM95676c.subtract(CoreModule.f18264c.f20381e0.m116593na());
        if (!NullChecker.m82486a(userSubtract)) {
            this.f129778f.progressDismiss();
            m152607j();
            return;
        }
        final int size = userSubtract.pictures.size() - CoreModule.f18264c.f20381e0.m116593na().pictures.size();
        TagGuidePicAct tagGuidePicAct2 = this.f129778f;
        Runnable runnable = new Runnable() { // from class: l.j2i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f118054a.m152617s(size, userSubtract);
            }
        };
        final TagGuidePicAct tagGuidePicAct3 = this.f129778f;
        Objects.requireNonNull(tagGuidePicAct3);
        tr90.m192412D(tagGuidePicAct2, userM95676c, runnable, new Runnable() { // from class: l.k2i0
            @Override // java.lang.Runnable
            public final void run() {
                tagGuidePicAct3.progressDismiss();
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final void m152622y() {
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        if (this.f129778f.m51956a2()) {
            this.f129780h = LoopInputType.GUIDE_UPLOAD_PIC_AND_TAG;
        } else if (this.f129778f.m51957b2()) {
            this.f129780h = LoopInputType.PIC_MATCH_TAG;
        } else {
            this.f129780h = LoopInputType.TAG_MATCH_PIC;
        }
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = (ProfileLoopMyLifeFrag) supportFragmentManager.m2584r0().instantiate(this.f129780h.fragmentClass.getClassLoader(), this.f129780h.fragmentClass.getName());
        this.f129779g = profileLoopMyLifeFrag;
        if (profileLoopMyLifeFrag != null) {
            this.f129779g.m52785a5(this.f129780h, 0, 1, true, this.f129778f.getIntent().getStringExtra("tag_from_page"), "edit_profile", "");
        }
        abstractC0428kM2568m.m2805c(adc0.f70520q6, this.f129779g, "my_lift");
        try {
            abstractC0428kM2568m.mo2709j();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m152623z() {
        if ((gra.m131771x2() || gra.m131776y2()) && this.f129778f.m51960e2()) {
            this.f129777e.setText("完成");
            if (a2i0.m95674b().m95676c().pictures.size() != CoreModule.f18264c.f20381e0.m116600p9().pictures.size()) {
                this.f129777e.setEnabled(true);
            }
            bnl0.m105524M(this.f129777e, true);
            return;
        }
        User userM95676c = a2i0.m95674b().m95676c();
        List<NewTags> listM130451v = gj40.m130415o().m130451v(userM95676c);
        LoopInputType loopInputType = this.f129780h;
        LoopInputType loopInputType2 = LoopInputType.TAG_MATCH_PIC;
        VButton vButton = this.f129777e;
        if (loopInputType == loopInputType2) {
            bnl0.m105524M(vButton, userM95676c.pictures.size() < 9 && !jyb.m147479J(listM130451v));
        } else {
            bnl0.m105524M(vButton, false);
        }
        if (bnl0.m105529O0(this.f129777e)) {
            sfj0.m185601h("e_tag_add_photo_continue", this.f129778f.pageId(), new sfj0.C20032a[0]);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(d2i0 d2i0Var) {
    }
}
