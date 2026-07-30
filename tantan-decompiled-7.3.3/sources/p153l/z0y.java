package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
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
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.Video;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VList;
import p151v.VPager;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class z0y implements iam<r0y> {

    /* JADX INFO: renamed from: a */
    public ViewStub f202439a;

    /* JADX INFO: renamed from: b */
    public TabLayout f202440b;

    /* JADX INFO: renamed from: c */
    public BottomSheetLayout f202441c;

    /* JADX INFO: renamed from: d */
    public VPager f202442d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f202443e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f202444f;

    /* JADX INFO: renamed from: g */
    public ImageView f202445g;

    /* JADX INFO: renamed from: h */
    public TextView f202446h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f202447i;

    /* JADX INFO: renamed from: j */
    public VText f202448j;

    /* JADX INFO: renamed from: k */
    public VText f202449k;

    /* JADX INFO: renamed from: l */
    public r0y f202450l;

    /* JADX INFO: renamed from: n */
    public MediaPickerAct f202452n;

    /* JADX INFO: renamed from: o */
    public uyh0 f202453o;

    /* JADX INFO: renamed from: p */
    public uyh0 f202454p;

    /* JADX INFO: renamed from: q */
    public uyh0 f202455q;

    /* JADX INFO: renamed from: r */
    public VList f202456r;

    /* JADX INFO: renamed from: s */
    public jwi f202457s;

    /* JADX INFO: renamed from: v */
    public y20<uyh0> f202460v;

    /* JADX INFO: renamed from: m */
    public boolean f202451m = false;

    /* JADX INFO: renamed from: t */
    public l4g0 f202458t = new l4g0("p_video_albums_view", BottomSheetLayout.class.getName());

    /* JADX INFO: renamed from: u */
    public l4g0 f202459u = new l4g0("p_picture_albums_view", BottomSheetLayout.class.getName());

    /* JADX INFO: renamed from: l.z0y$a */
    public class C21737a extends ViewPager.C0721m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f202461a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f202462b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Gender f202463c;

        public C21737a(int i, boolean z, Gender gender) {
            this.f202461a = i;
            this.f202462b = z;
            this.f202463c = gender;
        }

        @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            z0y.this.f202441c.m9337q();
            z0y z0yVar = z0y.this;
            z0yVar.f202455q = (i != 0 || this.f202461a <= 0) ? z0yVar.f202454p : z0yVar.f202453o;
            z0y.this.f202460v.call(z0y.this.f202455q);
            z0y.this.m218258q(this.f202462b, this.f202463c);
        }
    }

    public z0y(MediaPickerAct mediaPickerAct) {
        this.f202452n = mediaPickerAct;
    }

    /* JADX INFO: renamed from: K */
    private void m218226K(uyh0 uyh0Var, vg60<ewi> vg60Var) {
        if (NullChecker.m82486a(uyh0Var.f181619c)) {
            if (NullChecker.m82486a(vg60Var) && !jyb.m147479J(vg60Var.f184001a)) {
                for (ewi ewiVar : vg60Var.f184001a) {
                    if (ewiVar.equals(uyh0Var.f181619c)) {
                        uyh0Var.f181619c = ewiVar;
                        ((pgm) uyh0Var.f181620d).m172269L(ewiVar.f96163c);
                        return;
                    }
                }
            }
            uyh0Var.f181619c = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Media m218227a(Video video) {
        return video;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Media m218231e(Picture picture) {
        return picture;
    }

    /* JADX INFO: renamed from: A */
    public void m218238A(int i, int i2, boolean z, int i3, boolean z2, Gender gender, boolean z3) {
        if (i > 0) {
            uyh0 uyh0Var = this.f202453o;
            int i4 = MediaPickerAct.f31471D;
            if (i2 != i4) {
                i4 = MediaPickerAct.f31470C;
            }
            uyh0Var.f181620d = new pgm(i4, false, this.f202452n, i, z3, uyh0Var, false);
            this.f202453o.f181621e = (RecyclerView) this.f202452n.inflater().inflate(kec0.f125768be, (ViewGroup) this.f202442d, false);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i3);
            gridLayoutManager.setSmoothScrollbarEnabled(true);
            this.f202453o.f181621e.setLayoutManager(gridLayoutManager);
            this.f202453o.f181621e.addItemDecoration(new muf0(qa00.m175859d(4.0f), i3));
            uyh0 uyh0Var2 = this.f202453o;
            uyh0Var2.f181621e.setAdapter(uyh0Var2.f181620d);
        }
        if (z) {
            this.f202454p.f181620d = new pgm(MediaPickerAct.f31471D, true, this.f202452n, i, z3, this.f202453o, false);
            this.f202454p.f181621e = (RecyclerView) this.f202452n.inflater().inflate(kec0.f125768be, (ViewGroup) this.f202442d, false);
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(), i3);
            gridLayoutManager2.setSmoothScrollbarEnabled(true);
            this.f202454p.f181621e.setLayoutManager(gridLayoutManager2);
            this.f202454p.f181621e.addItemDecoration(new muf0(qa00.m175859d(4.0f), i3));
            uyh0 uyh0Var3 = this.f202454p;
            uyh0Var3.f181621e.setAdapter(uyh0Var3.f181620d);
        }
        this.f202442d.setAdapter(new unw(z, i, this.f202453o, this.f202454p, this.f202452n));
        this.f202440b.setupWithViewPager(this.f202442d);
        this.f202442d.m4187d(new C21737a(i, z2, gender));
    }

    /* JADX INFO: renamed from: B */
    public void m218239B(int i) {
        bnl0.m105525M0(this.f202449k, i > 1);
        this.f202449k.setOnClickListener(new View.OnClickListener() { // from class: l.x0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191950a.m218245I(view);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m218240C(int i, String str, String str2, boolean z, int i2, boolean z2, Gender gender) {
        if (NullChecker.m82486a(CoreModule.f18264c)) {
            CoreBusinessModule.m30906m0().mo122549i(this.f202440b);
        } else {
            this.f202440b.setBackgroundResource(dbc0.f87528vu);
        }
        if ("force_select_image".equals(str2)) {
            getAct().setSwipeBackEnable(false);
            getAct().getSupportActionBar().mo102196w(false);
        }
        m218258q(z2, gender);
        int i3 = MediaPickerAct.f31470C;
        MediaPickerAct mediaPickerAct = this.f202452n;
        if (i == i3) {
            mediaPickerAct.setStatusBarColor(mediaPickerAct.color(c9c0.f80453r1));
            MediaPickerAct mediaPickerAct2 = this.f202452n;
            mediaPickerAct2.setActionBarColor(mediaPickerAct2.color(c9c0.f80450q1));
            this.f202452n.setTitle(R$string.f19311hi);
            this.f202448j.setTextColor(this.f202452n.color(c9c0.f80396a));
            bnl0.m105524M(this.f202443e, true);
        } else {
            mediaPickerAct.setTitle(R$string.f19557pi);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f202452n.setTitle(str);
        }
        if (!z || i2 <= 0) {
            this.f202440b.setVisibility(8);
            return;
        }
        this.f202440b.setElevation(this.f202452n.getSupportActionBar().mo102183j());
        if (NullChecker.m82486a(this.f202452n.statusHeaderView)) {
            this.f202452n.statusHeaderView.setElevation(0.0f);
        }
        this.f202452n.getSupportActionBar().mo102168A(0.0f);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f202452n;
    }

    /* JADX INFO: renamed from: E */
    public void m218241E(boolean z) {
        bnl0.m105524M(this.f202443e, z);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m218242F() {
        this.f202455q.f181621e.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m218243G(boolean z, BottomSheetLayout bottomSheetLayout) {
        if (this.f202440b.getVisibility() != 8) {
            if (this.f202455q == this.f202454p) {
                this.f202458t.m152776k();
                this.f202458t.m152775j();
                return;
            } else {
                this.f202459u.m152776k();
                this.f202459u.m152775j();
                return;
            }
        }
        if (z) {
            this.f202458t.m152776k();
            this.f202458t.m152775j();
        } else {
            this.f202459u.m152776k();
            this.f202459u.m152775j();
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m218244H(int i, final boolean z, View view) {
        if (this.f202443e.getVisibility() == 0) {
            return;
        }
        VList vList = new VList(this.f202452n);
        this.f202456r = vList;
        vList.setBackgroundColor(-1);
        this.f202456r.setDivider(null);
        int i2 = MediaPickerAct.f31470C;
        if (i != i2) {
            i2 = MediaPickerAct.f31471D;
        }
        uyh0 uyh0Var = this.f202455q;
        MediaPickerAct mediaPickerAct = this.f202452n;
        jwi jwiVar = new jwi(i2, uyh0Var, mediaPickerAct, mediaPickerAct);
        this.f202457s = jwiVar;
        this.f202456r.setAdapter((ListAdapter) jwiVar);
        this.f202457s.m147166w(this.f202455q.f181618b);
        int size = this.f202455q.f181618b.f184001a.size() * qa00.m175859d(64.0f);
        int height = this.f202441c.getHeight() / 2;
        VList vList2 = this.f202456r;
        if (size < height) {
            vList2.setLayoutParams(new FrameLayout.LayoutParams(-1, size));
            this.f202441c.setPeekSheetTranslation(size);
        } else {
            vList2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f202441c.setPeekSheetTranslation(height);
        }
        this.f202441c.m9336m(new qn50() { // from class: l.y0y
            @Override // p153l.qn50
            /* JADX INFO: renamed from: a */
            public final void mo112565a(BottomSheetLayout bottomSheetLayout) {
                this.f197062a.m218243G(z, bottomSheetLayout);
            }
        });
        this.f202441c.m9334C(this.f202456r);
        if (this.f202440b.getVisibility() != 8) {
            if (this.f202455q == this.f202454p) {
                this.f202458t.m152774i();
                this.f202458t.m152777l();
                return;
            } else {
                this.f202459u.m152774i();
                this.f202459u.m152777l();
                return;
            }
        }
        if (z) {
            this.f202458t.m152774i();
            this.f202458t.m152777l();
        } else {
            this.f202459u.m152774i();
            this.f202459u.m152777l();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m218245I(View view) {
        this.f202452n.m48981s2();
    }

    /* JADX INFO: renamed from: J */
    public void m218246J(boolean z) {
        this.f202442d.setBackgroundColor(this.f202452n.getResources().getColor(c9c0.f80407c2));
        View viewInflate = this.f202439a.inflate();
        VImage vImage = (VImage) viewInflate.findViewById(adc0.f70031N5);
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70124Sd);
        MediaPickerAct mediaPickerAct = this.f202452n;
        if (z) {
            vImage.setImageDrawable(mediaPickerAct.getResources().getDrawable(dbc0.f87232mu));
        } else {
            vImage.setImageDrawable(mediaPickerAct.getResources().getDrawable(dbc0.f87265nu));
        }
        textView.setText(q8g0.m175796b0(this.f202452n.getString(R$string.f19348ip), jyb.m147507f0(this.f202452n.getString(R$string.f19378jp)), Color.parseColor("#d74d37"), Typeface.DEFAULT));
        i4g0.m138492A("e_picture_albums_tips", "p_picture_albums_view", jyb.m147494Y("signup_source", CoreModule.m30929H().getSignUpType()), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, SignUpData.getNonNullPhoneNumber()));
    }

    /* JADX INFO: renamed from: L */
    public void m218247L(List<Picture> list) {
        this.f202453o.f181617a = new vg60<>(jyb.m147486Q(list, new qcj() { // from class: l.w0y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return z0y.m218231e((Picture) obj);
            }
        }), null);
        uyh0 uyh0Var = this.f202453o;
        ((pgm) uyh0Var.f181620d).m172269L(uyh0Var.f181617a);
    }

    /* JADX INFO: renamed from: M */
    public void m218248M(vg60<ewi> vg60Var) {
        uyh0 uyh0Var = this.f202453o;
        uyh0Var.f181618b = vg60Var;
        m218226K(uyh0Var, vg60Var);
        if (this.f202455q == this.f202453o && NullChecker.m82486a(this.f202457s)) {
            this.f202457s.m147166w(this.f202453o.f181618b);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m218249N(List<Video> list) {
        this.f202454p.f181617a = new vg60<>(jyb.m147486Q(list, new qcj() { // from class: l.v0y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return z0y.m218227a((Video) obj);
            }
        }), null);
        uyh0 uyh0Var = this.f202454p;
        ((pgm) uyh0Var.f181620d).m172269L(uyh0Var.f181617a);
    }

    /* JADX INFO: renamed from: O */
    public void m218250O(vg60<ewi> vg60Var) {
        uyh0 uyh0Var = this.f202454p;
        uyh0Var.f181618b = vg60Var;
        m218226K(uyh0Var, vg60Var);
        if (this.f202455q == this.f202454p && NullChecker.m82486a(this.f202457s)) {
            this.f202457s.m147166w(this.f202454p.f181618b);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m218251P(y20<uyh0> y20Var) {
        this.f202460v = y20Var;
    }

    /* JADX INFO: renamed from: Q */
    public void m218252Q(ewi ewiVar) {
        this.f202455q.f181619c = ewiVar;
    }

    /* JADX INFO: renamed from: R */
    public void m218253R() {
        this.f202452n.setStatusBarColorResId(b9c0.f75570p);
        this.f202452n.getSupportActionBar().mo102194u(new ColorDrawable(-1));
        this.f202452n.getSupportActionBar().mo102169B(dbc0.f86150Fd);
        this.f202452n.setTitle("");
    }

    /* JADX INFO: renamed from: S */
    public void m218254S(boolean z) {
        if (this.f202440b.getTabCount() == 2 && z) {
            this.f202440b.getTabAt(1).select();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m218255T(uyh0 uyh0Var, uyh0 uyh0Var2, uyh0 uyh0Var3) {
        this.f202453o = uyh0Var;
        this.f202454p = uyh0Var2;
        this.f202455q = uyh0Var3;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f202452n;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m218256n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m218256n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a1y.m95587b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(r0y r0yVar) {
        this.f202450l = r0yVar;
    }

    /* JADX INFO: renamed from: q */
    public void m218258q(boolean z, Gender gender) {
        this.f202444f.setVisibility(8);
    }

    /* JADX INFO: renamed from: s */
    public void m218259s(ewi ewiVar) {
        uyh0 uyh0Var = this.f202455q;
        ((pgm) uyh0Var.f181620d).m172269L(ewiVar == null ? uyh0Var.f181617a : ewiVar.f96163c);
    }

    /* JADX INFO: renamed from: u */
    public void m218260u() {
        this.f202455q.f181621e.scrollToPosition(0);
        this.f202452n.post(new Runnable() { // from class: l.t0y
            @Override // java.lang.Runnable
            public final void run() {
                this.f171573a.m218242F();
            }
        });
        this.f202441c.m9337q();
    }

    /* JADX INFO: renamed from: v */
    public void m218261v(ArrayList<Media> arrayList) {
        bnl0.m105591y(this.f202449k, arrayList.size() > 0);
    }

    /* JADX INFO: renamed from: w */
    public void m218262w(vg60<ewi> vg60Var) {
        if (vg60Var.f184001a.size() <= 0) {
            bnl0.m105524M(this.f202443e, false);
            return;
        }
        uyh0 uyh0Var = this.f202453o;
        uyh0Var.f181618b = vg60Var;
        if (uyh0Var.f181619c == null) {
            uyh0Var.f181619c = vg60Var.f184001a.get(0);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m218263x() {
        bnl0.m105524M(this.f202443e, false);
    }

    /* JADX INFO: renamed from: y */
    public void m218264y(vg60<Media> vg60Var) {
        ((pgm) this.f202453o.f181620d).m172269L(vg60Var);
        bnl0.m105524M(this.f202443e, false);
    }

    /* JADX INFO: renamed from: z */
    public void m218265z(final int i, final boolean z) {
        this.f202448j.setText(R$string.f19826y8);
        this.f202448j.setOnClickListener(new View.OnClickListener() { // from class: l.u0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176951a.m218244H(i, z, view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
