package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.p053ui.profile.TagGuidePicAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopMyLifeFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import p147v.VButton;

/* JADX INFO: loaded from: classes4.dex */
public class duh0 implements s7m<vth0> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f87977a;

    /* JADX INFO: renamed from: b */
    public ImageView f87978b;

    /* JADX INFO: renamed from: c */
    public VButton f87979c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f87980d;

    /* JADX INFO: renamed from: e */
    public VButton f87981e;

    /* JADX INFO: renamed from: f */
    public final TagGuidePicAct f87982f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopMyLifeFrag f87983g;

    /* JADX INFO: renamed from: h */
    public LoopInputType f87984h;

    public duh0(TagGuidePicAct tagGuidePicAct) {
        this.f87982f = tagGuidePicAct;
    }

    /* JADX INFO: renamed from: j */
    private void m113697j() {
        this.f87982f.m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m113698m(View view) {
        TagGuidePicAct tagGuidePicAct = this.f87982f;
        tagGuidePicAct.f33043e = -1;
        tagGuidePicAct.m66873d2();
    }

    /* JADX INFO: renamed from: A */
    public void m113699A() {
        if ((upa.m194840x2() || upa.m194845y2()) && this.f87982f.m50777d2()) {
            User userM185952c = sth0.m185950b().m185952c();
            ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f87983g;
            if (profileLoopMyLifeFrag != null) {
                profileLoopMyLifeFrag.mo51590P4(userM185952c);
                this.f87981e.setEnabled(userM185952c.subtract(CoreModule.f17545c.f19639e0.m169520na()) != null);
            }
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f87982f;
    }

    /* JADX INFO: renamed from: i */
    public View m113700i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return euh0.m118166b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m113700i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m113702l(boolean z, View view) {
        m113711x(z);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m113703n(final boolean z, View view) {
        LoopInputType loopInputType;
        if (NullChecker.m81303a(this.f87983g) && (this.f87983g.m51656h5() || (loopInputType = this.f87983g.f33455z) == LoopInputType.TAG_MATCH_PIC || loopInputType == LoopInputType.PIC_MATCH_TAG)) {
            new xh0.C21150a(act()).m208740s("修改未保存").m208728g(true).m208723b(true).m208739r("保存后退出").m208736o(new View.OnClickListener() { // from class: l.zth0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f204725a.m113702l(z, view2);
                }
            }).m208731j("是否保存后再退出？").m208727f("不保存").m208724c(new View.OnClickListener() { // from class: l.auh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f71777a.m113698m(view2);
                }
            }).m208722a().m208721g();
        } else {
            this.f87982f.m66873d2();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m113704p(boolean z, View view) {
        o6j0.m162859c("e_tag_add_photo_continue", this.f87982f.pageId(), new o6j0.C18854a[0]);
        boolean zM194847z = upa.m194847z();
        TagGuidePicAct tagGuidePicAct = this.f87982f;
        if (zM194847z) {
            gjf.m126489M(tagGuidePicAct, false, z);
        } else {
            qth0.m176454M(tagGuidePicAct, false, z);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m113705q(boolean z, View view) {
        m113711x(z);
    }

    /* JADX INFO: renamed from: r */
    public void m113706r() {
        m113712y();
        final boolean booleanExtra = this.f87982f.getIntent().getBooleanExtra("tag_save_data", false);
        xdl0.m208329E0(this.f87978b, new View.OnClickListener() { // from class: l.wth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188022a.m113703n(booleanExtra, view);
            }
        });
        VButton vButton = this.f87979c;
        VButton vButton2 = this.f87981e;
        if ((upa.m194840x2() || upa.m194845y2()) && this.f87982f.m50777d2()) {
            vButton = this.f87981e;
            xdl0.m208344M(this.f87979c, false);
            xdl0.m208357U(this.f87980d, t100.m186890d(68.0f));
            vButton.setEnabled(false);
        }
        xdl0.m208329E0(vButton2, new View.OnClickListener() { // from class: l.xth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194389a.m113704p(booleanExtra, view);
            }
        });
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.yth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199927a.m113705q(booleanExtra, view);
            }
        });
        m113713z();
        if (upa.m194847z()) {
            xdl0.m208325C0(this.f87978b, t100.m186890d(32.0f));
            xdl0.m208327D0(t100.m186890d(32.0f), this.f87978b);
            xdl0.m208378h0(this.f87978b, 0);
            xdl0.m208358V(this.f87978b, t100.m186890d(10.0f));
            this.f87978b.setImageResource(x2c0.f189517Lg);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m113707s(int i, User user) {
        this.f87982f.progressDismiss();
        if (c30.m104964f(act())) {
            m113697j();
        }
        if (!this.f87982f.m50777d2() || i <= 0) {
            return;
        }
        lsi0.m151595y("上传成功");
        zvf0.m220371D("e_invisible_photo_upload_success", this.f87982f.pageId(), vwb.m200311Y("upload_photos_count", Integer.valueOf(i)), vwb.m200311Y("invisible_photo_unlock_status", user.pictures.size() >= 3 ? "unlock_all" : "unlock_one"));
    }

    /* JADX INFO: renamed from: u */
    public void m113708u() {
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f87983g;
        if (profileLoopMyLifeFrag == null) {
            return;
        }
        profileLoopMyLifeFrag.m51658j5();
        if ((upa.m194840x2() || upa.m194845y2()) && this.f87982f.m50777d2()) {
            sth0.m185950b().m185951a();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m113709v(List<Media> list) {
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f87983g;
        if (profileLoopMyLifeFrag == null) {
            return;
        }
        profileLoopMyLifeFrag.mo51600Y4(list, 0);
    }

    /* JADX INFO: renamed from: w */
    public void m113710w() {
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f87983g;
        if (profileLoopMyLifeFrag == null) {
            return;
        }
        profileLoopMyLifeFrag.m51659k5();
        m113713z();
    }

    /* JADX INFO: renamed from: x */
    public final void m113711x(boolean z) {
        TagGuidePicAct tagGuidePicAct = this.f87982f;
        tagGuidePicAct.f33043e = 0;
        o6j0.m162859c("e_edit_lifestyle_save", tagGuidePicAct.pageId(), new o6j0.C18854a[0]);
        if (!z) {
            m113697j();
            return;
        }
        this.f87982f.progress(R$string.f17842J5, true);
        User userM185952c = sth0.m185950b().m185952c();
        this.f87983g.mo51590P4(userM185952c);
        final User userSubtract = userM185952c.subtract(CoreModule.f17545c.f19639e0.m169520na());
        if (!NullChecker.m81303a(userSubtract)) {
            this.f87982f.progressDismiss();
            m113697j();
            return;
        }
        final int size = userSubtract.pictures.size() - CoreModule.f17545c.f19639e0.m169520na().pictures.size();
        TagGuidePicAct tagGuidePicAct2 = this.f87982f;
        Runnable runnable = new Runnable() { // from class: l.buh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f77322a.m113707s(size, userSubtract);
            }
        };
        final TagGuidePicAct tagGuidePicAct3 = this.f87982f;
        Objects.requireNonNull(tagGuidePicAct3);
        pj90.m169787D(tagGuidePicAct2, userM185952c, runnable, new Runnable() { // from class: l.cuh0
            @Override // java.lang.Runnable
            public final void run() {
                tagGuidePicAct3.progressDismiss();
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final void m113712y() {
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        if (this.f87982f.m50773Z1()) {
            this.f87984h = LoopInputType.GUIDE_UPLOAD_PIC_AND_TAG;
        } else if (this.f87982f.m50774a2()) {
            this.f87984h = LoopInputType.PIC_MATCH_TAG;
        } else {
            this.f87984h = LoopInputType.TAG_MATCH_PIC;
        }
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = (ProfileLoopMyLifeFrag) supportFragmentManager.m2583r0().instantiate(this.f87984h.fragmentClass.getClassLoader(), this.f87984h.fragmentClass.getName());
        this.f87983g = profileLoopMyLifeFrag;
        if (profileLoopMyLifeFrag != null) {
            this.f87983g.m51602a5(this.f87984h, 0, 1, true, this.f87982f.getIntent().getStringExtra("tag_from_page"), "edit_profile", "");
        }
        abstractC0427kM2567m.m2804c(u4c0.f174395o6, this.f87983g, "my_lift");
        try {
            abstractC0427kM2567m.mo2708j();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m113713z() {
        if ((upa.m194840x2() || upa.m194845y2()) && this.f87982f.m50777d2()) {
            this.f87981e.setText("完成");
            if (sth0.m185950b().m185952c().pictures.size() != CoreModule.f17545c.f19639e0.m169527p9().pictures.size()) {
                this.f87981e.setEnabled(true);
            }
            xdl0.m208344M(this.f87981e, true);
            return;
        }
        User userM185952c = sth0.m185950b().m185952c();
        List<NewTags> listM182838v = sa40.m182802o().m182838v(userM185952c);
        LoopInputType loopInputType = this.f87984h;
        LoopInputType loopInputType2 = LoopInputType.TAG_MATCH_PIC;
        VButton vButton = this.f87981e;
        if (loopInputType == loopInputType2) {
            xdl0.m208344M(vButton, userM185952c.pictures.size() < 9 && !vwb.m200296J(listM182838v));
        } else {
            xdl0.m208344M(vButton, false);
        }
        if (xdl0.m208349O0(this.f87981e)) {
            o6j0.m162864h("e_tag_add_photo_continue", this.f87982f.pageId(), new o6j0.C18854a[0]);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(vth0 vth0Var) {
    }
}
