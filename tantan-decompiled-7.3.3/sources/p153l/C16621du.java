package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.mediapicker.impl.AccountMediaPickerAct;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VList;
import p151v.VPager;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: renamed from: l.du */
/* JADX INFO: loaded from: classes9.dex */
public class C16621du implements iam<C21443xt> {

    /* JADX INFO: renamed from: a */
    public ViewStub f90639a;

    /* JADX INFO: renamed from: b */
    public TabLayout f90640b;

    /* JADX INFO: renamed from: c */
    public BottomSheetLayout f90641c;

    /* JADX INFO: renamed from: d */
    public VPager f90642d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f90643e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f90644f;

    /* JADX INFO: renamed from: g */
    public ImageView f90645g;

    /* JADX INFO: renamed from: h */
    public TextView f90646h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f90647i;

    /* JADX INFO: renamed from: j */
    public VText f90648j;

    /* JADX INFO: renamed from: k */
    public VText f90649k;

    /* JADX INFO: renamed from: l */
    public C21443xt f90650l;

    /* JADX INFO: renamed from: n */
    public AccountMediaPickerAct f90652n;

    /* JADX INFO: renamed from: o */
    public uyh0 f90653o;

    /* JADX INFO: renamed from: p */
    public uyh0 f90654p;

    /* JADX INFO: renamed from: q */
    public uyh0 f90655q;

    /* JADX INFO: renamed from: r */
    public VList f90656r;

    /* JADX INFO: renamed from: s */
    public C21652yo f90657s;

    /* JADX INFO: renamed from: v */
    public y20<uyh0> f90660v;

    /* JADX INFO: renamed from: m */
    public boolean f90651m = false;

    /* JADX INFO: renamed from: t */
    public l4g0 f90658t = new l4g0("p_video_albums_view", BottomSheetLayout.class.getName());

    /* JADX INFO: renamed from: u */
    public l4g0 f90659u = new l4g0("p_picture_albums_view", BottomSheetLayout.class.getName());

    /* JADX INFO: renamed from: l.du$a */
    public class a extends ViewPager.C0721m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f90661a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f90662b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Gender f90663c;

        public a(int i, boolean z, Gender gender) {
            this.f90661a = i;
            this.f90662b = z;
            this.f90663c = gender;
        }

        @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            C16621du.this.f90641c.m9337q();
            C16621du c16621du = C16621du.this;
            c16621du.f90655q = (i != 0 || this.f90661a <= 0) ? c16621du.f90654p : c16621du.f90653o;
            C16621du.this.f90660v.call(C16621du.this.f90655q);
            C16621du.this.m117934p(this.f90662b, this.f90663c);
        }
    }

    public C16621du(AccountMediaPickerAct accountMediaPickerAct) {
        this.f90652n = accountMediaPickerAct;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Media m117908a(Picture picture) {
        return picture;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Media m117912e(Video video) {
        return video;
    }

    /* JADX INFO: renamed from: A */
    public void m117918A(int i, String str, String str2, boolean z, int i2, boolean z2, Gender gender) {
        this.f90640b.setBackgroundResource(bbc0.f75881h1);
        m117934p(z2, gender);
        int i3 = AccountMediaPickerAct.f17731B;
        AccountMediaPickerAct accountMediaPickerAct = this.f90652n;
        if (i == i3) {
            accountMediaPickerAct.setStatusBarColor(accountMediaPickerAct.color(a9c0.f69029n));
            AccountMediaPickerAct accountMediaPickerAct2 = this.f90652n;
            accountMediaPickerAct2.setActionBarColor(accountMediaPickerAct2.color(a9c0.f69028m));
            this.f90652n.setTitle(R$string.f16994r2);
            this.f90648j.setTextColor(this.f90652n.color(a9c0.f69016a));
            bnl0.m105524M(this.f90643e, true);
        } else {
            accountMediaPickerAct.setTitle(R$string.f17029y2);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f90652n.setTitle(str);
        }
        if (!z || i2 <= 0) {
            this.f90640b.setVisibility(8);
            return;
        }
        this.f90640b.setElevation(this.f90652n.getSupportActionBar().mo102183j());
        if (NullChecker.m82486a(this.f90652n.statusHeaderView)) {
            this.f90652n.statusHeaderView.setElevation(0.0f);
        }
        this.f90652n.getSupportActionBar().mo102168A(0.0f);
    }

    /* JADX INFO: renamed from: B */
    public void m117919B(boolean z) {
        bnl0.m105524M(this.f90643e, z);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m117920C() {
        this.f90655q.f181621e.scrollToPosition(0);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f90652n;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m117921E(boolean z, BottomSheetLayout bottomSheetLayout) {
        if (this.f90640b.getVisibility() != 8) {
            if (this.f90655q == this.f90654p) {
                this.f90658t.m152776k();
                this.f90658t.m152775j();
                return;
            } else {
                this.f90659u.m152776k();
                this.f90659u.m152775j();
                return;
            }
        }
        if (z) {
            this.f90658t.m152776k();
            this.f90658t.m152775j();
        } else {
            this.f90659u.m152776k();
            this.f90659u.m152775j();
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m117922F(int i, final boolean z, View view) {
        if (this.f90643e.getVisibility() == 0) {
            return;
        }
        VList vList = new VList(this.f90652n);
        this.f90656r = vList;
        vList.setBackgroundColor(-1);
        this.f90656r.setDivider(null);
        int i2 = AccountMediaPickerAct.f17731B;
        if (i != i2) {
            i2 = AccountMediaPickerAct.f17732C;
        }
        uyh0 uyh0Var = this.f90655q;
        AccountMediaPickerAct accountMediaPickerAct = this.f90652n;
        C21652yo c21652yo = new C21652yo(i2, uyh0Var, accountMediaPickerAct, accountMediaPickerAct);
        this.f90657s = c21652yo;
        this.f90656r.setAdapter((ListAdapter) c21652yo);
        this.f90657s.m216963w(this.f90655q.f181618b);
        int size = this.f90655q.f181618b.f184001a.size() * qa00.m175859d(64.0f);
        int height = this.f90641c.getHeight() / 2;
        VList vList2 = this.f90656r;
        if (size < height) {
            vList2.setLayoutParams(new FrameLayout.LayoutParams(-1, size));
            this.f90641c.setPeekSheetTranslation(size);
        } else {
            vList2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f90641c.setPeekSheetTranslation(height);
        }
        this.f90641c.m9336m(new qn50() { // from class: l.cu
            @Override // p153l.qn50
            /* JADX INFO: renamed from: a */
            public final void mo112565a(BottomSheetLayout bottomSheetLayout) {
                this.f83773a.m117921E(z, bottomSheetLayout);
            }
        });
        this.f90641c.m9334C(this.f90656r);
        if (this.f90640b.getVisibility() != 8) {
            if (this.f90655q == this.f90654p) {
                this.f90658t.m152774i();
                this.f90658t.m152777l();
                return;
            } else {
                this.f90659u.m152774i();
                this.f90659u.m152777l();
                return;
            }
        }
        if (z) {
            this.f90658t.m152774i();
            this.f90658t.m152777l();
        } else {
            this.f90659u.m152774i();
            this.f90659u.m152777l();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m117923G(uyh0 uyh0Var, vg60<ewi> vg60Var) {
        if (NullChecker.m82486a(uyh0Var.f181619c)) {
            if (NullChecker.m82486a(vg60Var) && !jyb.m147479J(vg60Var.f184001a)) {
                for (ewi ewiVar : vg60Var.f184001a) {
                    if (ewiVar.equals(uyh0Var.f181619c)) {
                        uyh0Var.f181619c = ewiVar;
                        ((C18232kp) uyh0Var.f181620d).m150697L(ewiVar.f96163c);
                        return;
                    }
                }
            }
            uyh0Var.f181619c = null;
        }
    }

    /* JADX INFO: renamed from: H */
    public void m117924H(List<Picture> list) {
        boolean zM147479J = jyb.m147479J(this.f90653o.f181617a.f184001a);
        uyh0 uyh0Var = this.f90653o;
        if (zM147479J) {
            uyh0Var.f181617a = new vg60<>(jyb.m147486Q(list, new qcj() { // from class: l.zt
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C16621du.m117908a((Picture) obj);
                }
            }), null);
            uyh0 uyh0Var2 = this.f90653o;
            ((C18232kp) uyh0Var2.f181620d).m150697L(uyh0Var2.f181617a);
        } else {
            int size = uyh0Var.f181617a.f184001a.size();
            this.f90653o.f181617a.f184001a.addAll(list);
            this.f90653o.f181620d.notifyItemRangeInserted(size, list.size());
        }
    }

    /* JADX INFO: renamed from: I */
    public void m117925I(vg60<ewi> vg60Var) {
        boolean zM147479J = jyb.m147479J(this.f90653o.f181618b.f184001a);
        uyh0 uyh0Var = this.f90653o;
        if (zM147479J) {
            uyh0Var.f181618b = vg60Var;
            m117923G(uyh0Var, vg60Var);
        } else {
            uyh0Var.f181618b.f184001a.addAll(vg60Var.f184001a);
        }
        if (this.f90655q == this.f90653o && NullChecker.m82486a(this.f90657s)) {
            this.f90657s.m216963w(this.f90653o.f181618b);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m117926J(List<Video> list) {
        boolean zM147479J = jyb.m147479J(this.f90654p.f181617a.f184001a);
        uyh0 uyh0Var = this.f90654p;
        if (zM147479J) {
            uyh0Var.f181617a = new vg60<>(jyb.m147486Q(list, new qcj() { // from class: l.bu
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C16621du.m117912e((Video) obj);
                }
            }), null);
            uyh0 uyh0Var2 = this.f90654p;
            ((C18232kp) uyh0Var2.f181620d).m150697L(uyh0Var2.f181617a);
        } else {
            int size = uyh0Var.f181617a.f184001a.size();
            this.f90654p.f181617a.f184001a.addAll(list);
            this.f90654p.f181620d.notifyItemRangeInserted(size, list.size());
        }
    }

    /* JADX INFO: renamed from: K */
    public void m117927K(vg60<ewi> vg60Var) {
        boolean zM147479J = jyb.m147479J(this.f90654p.f181618b.f184001a);
        uyh0 uyh0Var = this.f90654p;
        if (zM147479J) {
            uyh0Var.f181618b = vg60Var;
            m117923G(uyh0Var, vg60Var);
        } else {
            uyh0Var.f181618b.f184001a.addAll(vg60Var.f184001a);
        }
        if (this.f90655q == this.f90654p && NullChecker.m82486a(this.f90657s)) {
            this.f90657s.m216963w(this.f90654p.f181618b);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m117928L(y20<uyh0> y20Var) {
        this.f90660v = y20Var;
    }

    /* JADX INFO: renamed from: M */
    public void m117929M(ewi ewiVar) {
        this.f90655q.f181619c = ewiVar;
    }

    /* JADX INFO: renamed from: N */
    public void m117930N(boolean z) {
        if (this.f90640b.getTabCount() == 2 && z) {
            this.f90640b.getTabAt(1).select();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m117931O(uyh0 uyh0Var, uyh0 uyh0Var2, uyh0 uyh0Var3) {
        this.f90653o = uyh0Var;
        this.f90654p = uyh0Var2;
        this.f90655q = uyh0Var3;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f90652n;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m117932m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m117932m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16831eu.m122517b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C21443xt c21443xt) {
        this.f90650l = c21443xt;
    }

    /* JADX INFO: renamed from: p */
    public void m117934p(boolean z, Gender gender) {
        this.f90644f.setVisibility(8);
    }

    /* JADX INFO: renamed from: q */
    public void m117935q() {
        this.f90653o.f181617a.f184001a.clear();
        this.f90653o.f181618b.f184001a.clear();
    }

    /* JADX INFO: renamed from: s */
    public void m117936s(ewi ewiVar) {
        uyh0 uyh0Var = this.f90655q;
        ((C18232kp) uyh0Var.f181620d).m150697L(ewiVar == null ? uyh0Var.f181617a : ewiVar.f96163c);
    }

    /* JADX INFO: renamed from: u */
    public void m117937u() {
        this.f90655q.f181621e.scrollToPosition(0);
        this.f90652n.post(new Runnable() { // from class: l.yt
            @Override // java.lang.Runnable
            public final void run() {
                this.f201472a.m117920C();
            }
        });
        this.f90641c.m9337q();
    }

    /* JADX INFO: renamed from: v */
    public void m117938v(vg60<ewi> vg60Var) {
        if (vg60Var.f184001a.size() <= 0) {
            bnl0.m105524M(this.f90643e, false);
            return;
        }
        uyh0 uyh0Var = this.f90653o;
        uyh0Var.f181618b = vg60Var;
        if (uyh0Var.f181619c == null) {
            uyh0Var.f181619c = vg60Var.f184001a.get(0);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m117939w() {
        bnl0.m105524M(this.f90643e, false);
    }

    /* JADX INFO: renamed from: x */
    public void m117940x(vg60<Media> vg60Var) {
        ((C18232kp) this.f90653o.f181620d).m150697L(vg60Var);
        bnl0.m105524M(this.f90643e, false);
    }

    /* JADX INFO: renamed from: y */
    public void m117941y(final int i, final boolean z) {
        this.f90648j.setText(R$string.f16982p0);
        this.f90648j.setOnClickListener(new View.OnClickListener() { // from class: l.au
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73456a.m117922F(i, z, view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m117942z(int i, int i2, boolean z, int i3, boolean z2, Gender gender, boolean z3, boolean z4) {
        if (i > 0) {
            uyh0 uyh0Var = this.f90653o;
            int i4 = AccountMediaPickerAct.f17732C;
            if (i2 != i4) {
                i4 = AccountMediaPickerAct.f17731B;
            }
            uyh0Var.f181620d = new C18232kp(i4, false, this.f90652n, i, z3, uyh0Var, z4, "");
            this.f90653o.f181621e = (RecyclerView) this.f90652n.inflater().inflate(hec0.f109080H, (ViewGroup) this.f90642d, false);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i3);
            gridLayoutManager.setSmoothScrollbarEnabled(true);
            this.f90653o.f181621e.setLayoutManager(gridLayoutManager);
            this.f90653o.f181621e.addItemDecoration(new puf0(qa00.m175859d(4.0f), i3));
            uyh0 uyh0Var2 = this.f90653o;
            uyh0Var2.f181621e.setAdapter(uyh0Var2.f181620d);
        }
        if (z) {
            this.f90654p.f181620d = new C18232kp(AccountMediaPickerAct.f17732C, true, this.f90652n, i, z3, this.f90653o, z4, "");
            this.f90654p.f181621e = (RecyclerView) this.f90652n.inflater().inflate(hec0.f109080H, (ViewGroup) this.f90642d, false);
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(), i3);
            gridLayoutManager2.setSmoothScrollbarEnabled(true);
            this.f90654p.f181621e.setLayoutManager(gridLayoutManager2);
            this.f90654p.f181621e.addItemDecoration(new puf0(qa00.m175859d(4.0f), i3));
            uyh0 uyh0Var3 = this.f90654p;
            uyh0Var3.f181621e.setAdapter(uyh0Var3.f181620d);
        }
        this.f90642d.setAdapter(new C18708mu(z, i, this.f90653o, this.f90654p, this.f90652n));
        this.f90640b.setupWithViewPager(this.f90642d);
        this.f90642d.m4187d(new a(i, z2, gender));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
