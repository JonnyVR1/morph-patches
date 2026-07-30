package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.core.p001ui.profile.TagGuidePicAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopMyLifeFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import l.c30;
import l.euh0;
import l.j760;
import l.lsi0;
import l.o6j0;
import l.pj90;
import l.s7m;
import l.sth0;
import l.t100;
import l.u4c0;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.xh0;
import l.zvf0;
import v.VButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class duh0 implements s7m<vth0> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f9427a;

    /* JADX INFO: renamed from: b */
    public ImageView f9428b;

    /* JADX INFO: renamed from: c */
    public VButton f9429c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f9430d;

    /* JADX INFO: renamed from: e */
    public VButton f9431e;

    /* JADX INFO: renamed from: f */
    public final TagGuidePicAct f9432f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopMyLifeFrag f9433g;

    /* JADX INFO: renamed from: h */
    public LoopInputType f9434h;

    public duh0(TagGuidePicAct tagGuidePicAct) {
        this.f9432f = tagGuidePicAct;
    }

    /* JADX INFO: renamed from: j */
    private void m12032j() {
        this.f9432f.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m12033m(View view) {
        TagGuidePicAct tagGuidePicAct = this.f9432f;
        tagGuidePicAct.f865e = -1;
        tagGuidePicAct.finish();
    }

    /* JADX INFO: renamed from: A */
    public void m12034A() {
        if ((upa.x2() || upa.y2()) && this.f9432f.m1223d2()) {
            User userC = sth0.b().c();
            ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f9433g;
            if (profileLoopMyLifeFrag != null) {
                profileLoopMyLifeFrag.mo2076P4(userC);
                this.f9431e.setEnabled(userC.subtract(CoreModule.c.e0.na()) != null);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12035C0() {
        return this.f9432f;
    }

    /* JADX INFO: renamed from: i */
    public View m12036i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return euh0.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12036i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m12039l(boolean z, View view) {
        m12048x(z);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m12040n(final boolean z, View view) {
        LoopInputType loopInputType;
        if (NullChecker.a(this.f9433g) && (this.f9433g.m2163h5() || (loopInputType = this.f9433g.f1277z) == LoopInputType.TAG_MATCH_PIC || loopInputType == LoopInputType.PIC_MATCH_TAG)) {
            new xh0.a(act()).s("修改未保存").g(true).b(true).r("保存后退出").o(new View.OnClickListener() { // from class: l.zth0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f23582a.m12039l(z, view2);
                }
            }).j("是否保存后再退出？").f("不保存").c(new View.OnClickListener() { // from class: l.auh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f7888a.m12033m(view2);
                }
            }).a().g();
        } else {
            this.f9432f.finish();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m12041p(boolean z, View view) {
        o6j0.c("e_tag_add_photo_continue", this.f9432f.pageId(), new o6j0.a[0]);
        boolean z2 = upa.z();
        TagGuidePicAct tagGuidePicAct = this.f9432f;
        if (z2) {
            gjf.m13857M(tagGuidePicAct, false, z);
        } else {
            qth0.m21547M(tagGuidePicAct, false, z);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m12042q(boolean z, View view) {
        m12048x(z);
    }

    /* JADX INFO: renamed from: r */
    public void m12043r() {
        m12049y();
        final boolean booleanExtra = this.f9432f.getIntent().getBooleanExtra("tag_save_data", false);
        xdl0.E0(this.f9428b, new View.OnClickListener() { // from class: l.wth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21972a.m12040n(booleanExtra, view);
            }
        });
        View view = this.f9429c;
        VButton vButton = this.f9431e;
        if ((upa.x2() || upa.y2()) && this.f9432f.m1223d2()) {
            view = this.f9431e;
            xdl0.M(this.f9429c, false);
            xdl0.U(this.f9430d, t100.d(68.0f));
            view.setEnabled(false);
        }
        xdl0.E0(vButton, new View.OnClickListener() { // from class: l.xth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f22452a.m12041p(booleanExtra, view2);
            }
        });
        xdl0.E0(view, new View.OnClickListener() { // from class: l.yth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f23075a.m12042q(booleanExtra, view2);
            }
        });
        m12050z();
        if (upa.z()) {
            xdl0.C0(this.f9428b, t100.d(32.0f));
            xdl0.D0(t100.d(32.0f), new View[]{this.f9428b});
            xdl0.h0(this.f9428b, 0);
            xdl0.V(this.f9428b, t100.d(10.0f));
            this.f9428b.setImageResource(x2c0.Lg);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m12044s(int i, User user) {
        this.f9432f.progressDismiss();
        if (c30.f(act())) {
            m12032j();
        }
        if (!this.f9432f.m1223d2() || i <= 0) {
            return;
        }
        lsi0.y("上传成功");
        zvf0.D("e_invisible_photo_upload_success", this.f9432f.pageId(), new j760[]{vwb.Y("upload_photos_count", Integer.valueOf(i)), vwb.Y("invisible_photo_unlock_status", user.pictures.size() >= 3 ? "unlock_all" : "unlock_one")});
    }

    /* JADX INFO: renamed from: u */
    public void m12045u() {
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f9433g;
        if (profileLoopMyLifeFrag == null) {
            return;
        }
        profileLoopMyLifeFrag.m2165j5();
        if ((upa.x2() || upa.y2()) && this.f9432f.m1223d2()) {
            sth0.b().a();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m12046v(List<Media> list) {
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f9433g;
        if (profileLoopMyLifeFrag == null) {
            return;
        }
        profileLoopMyLifeFrag.mo2086Y4(list, 0);
    }

    /* JADX INFO: renamed from: w */
    public void m12047w() {
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f9433g;
        if (profileLoopMyLifeFrag == null) {
            return;
        }
        profileLoopMyLifeFrag.m2166k5();
        m12050z();
    }

    /* JADX INFO: renamed from: x */
    public final void m12048x(boolean z) {
        TagGuidePicAct tagGuidePicAct = this.f9432f;
        tagGuidePicAct.f865e = 0;
        o6j0.c("e_edit_lifestyle_save", tagGuidePicAct.pageId(), new o6j0.a[0]);
        if (!z) {
            m12032j();
            return;
        }
        this.f9432f.progress(R.string.J5, true);
        User userC = sth0.b().c();
        this.f9433g.mo2076P4(userC);
        final User userSubtract = userC.subtract(CoreModule.c.e0.na());
        if (!NullChecker.a(userSubtract)) {
            this.f9432f.progressDismiss();
            m12032j();
            return;
        }
        final int size = userSubtract.pictures.size() - CoreModule.c.e0.na().pictures.size();
        TagGuidePicAct tagGuidePicAct2 = this.f9432f;
        Runnable runnable = new Runnable() { // from class: l.buh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8362a.m12044s(size, userSubtract);
            }
        };
        final TagGuidePicAct tagGuidePicAct3 = this.f9432f;
        Objects.requireNonNull(tagGuidePicAct3);
        pj90.D(tagGuidePicAct2, userC, runnable, new Runnable() { // from class: l.cuh0
            @Override // java.lang.Runnable
            public final void run() {
                tagGuidePicAct3.progressDismiss();
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final void m12049y() {
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        k kVarM = supportFragmentManager.m();
        if (this.f9432f.m1219Z1()) {
            this.f9434h = LoopInputType.GUIDE_UPLOAD_PIC_AND_TAG;
        } else if (this.f9432f.m1220a2()) {
            this.f9434h = LoopInputType.PIC_MATCH_TAG;
        } else {
            this.f9434h = LoopInputType.TAG_MATCH_PIC;
        }
        ProfileLoopMyLifeFrag profileLoopMyLifeFragInstantiate = supportFragmentManager.r0().instantiate(this.f9434h.fragmentClass.getClassLoader(), this.f9434h.fragmentClass.getName());
        this.f9433g = profileLoopMyLifeFragInstantiate;
        if (profileLoopMyLifeFragInstantiate != null) {
            this.f9433g.m2088a5(this.f9434h, 0, 1, true, this.f9432f.getIntent().getStringExtra("tag_from_page"), "edit_profile", "");
        }
        kVarM.c(u4c0.o6, this.f9433g, "my_lift");
        try {
            kVarM.j();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m12050z() {
        if ((upa.x2() || upa.y2()) && this.f9432f.m1223d2()) {
            this.f9431e.setText("完成");
            if (sth0.b().c().pictures.size() != CoreModule.c.e0.p9().pictures.size()) {
                this.f9431e.setEnabled(true);
            }
            xdl0.M(this.f9431e, true);
            return;
        }
        User userC = sth0.b().c();
        List<NewTags> listM22306v = sa40.m22270o().m22306v(userC);
        LoopInputType loopInputType = this.f9434h;
        LoopInputType loopInputType2 = LoopInputType.TAG_MATCH_PIC;
        VButton vButton = this.f9431e;
        if (loopInputType == loopInputType2) {
            xdl0.M(vButton, userC.pictures.size() < 9 && !vwb.J(listM22306v));
        } else {
            xdl0.M(vButton, false);
        }
        if (xdl0.O0(this.f9431e)) {
            o6j0.h("e_tag_add_photo_continue", this.f9432f.pageId(), new o6j0.a[0]);
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m12037i1(vth0 vth0Var) {
    }
}
