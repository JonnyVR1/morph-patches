package p003l;

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
import com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPickerAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.dsx;
import l.f6c0;
import l.i0g0;
import l.iti;
import l.j760;
import l.kf50;
import l.nqh0;
import l.q860;
import l.s7m;
import l.t100;
import l.u4c0;
import l.v0c0;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p028v.VImage;
import p028v.VList;
import p028v.VPager;
import p028v.VProgressBar;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class csx implements s7m<urx> {

    /* JADX INFO: renamed from: a */
    public ViewStub f2773a;

    /* JADX INFO: renamed from: b */
    public TabLayout f2774b;

    /* JADX INFO: renamed from: c */
    public BottomSheetLayout f2775c;

    /* JADX INFO: renamed from: d */
    public VPager f2776d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f2777e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f2778f;

    /* JADX INFO: renamed from: g */
    public ImageView f2779g;

    /* JADX INFO: renamed from: h */
    public TextView f2780h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f2781i;

    /* JADX INFO: renamed from: j */
    public VText f2782j;

    /* JADX INFO: renamed from: k */
    public VText f2783k;

    /* JADX INFO: renamed from: l */
    public urx f2784l;

    /* JADX INFO: renamed from: n */
    public MediaPickerAct f2786n;

    /* JADX INFO: renamed from: o */
    public nqh0 f2787o;

    /* JADX INFO: renamed from: p */
    public nqh0 f2788p;

    /* JADX INFO: renamed from: q */
    public nqh0 f2789q;

    /* JADX INFO: renamed from: r */
    public VList f2790r;

    /* JADX INFO: renamed from: s */
    public nti f2791s;

    /* JADX INFO: renamed from: v */
    public e30<nqh0> f2794v;

    /* JADX INFO: renamed from: m */
    public boolean f2785m = false;

    /* JADX INFO: renamed from: t */
    public cwf0 f2792t = new cwf0("p_video_albums_view", BottomSheetLayout.class.getName());

    /* JADX INFO: renamed from: u */
    public cwf0 f2793u = new cwf0("p_picture_albums_view", BottomSheetLayout.class.getName());

    /* JADX INFO: renamed from: l.csx$a */
    public class C0207a extends ViewPager.m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2795a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f2796b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Gender f2797c;

        public C0207a(int i, boolean z, Gender gender) {
            this.f2795a = i;
            this.f2796b = z;
            this.f2797c = gender;
        }

        public void onPageSelected(int i) {
            csx.this.f2775c.q();
            csx csxVar = csx.this;
            csxVar.f2789q = (i != 0 || this.f2795a <= 0) ? csxVar.f2788p : csxVar.f2787o;
            csx.this.f2794v.call(csx.this.f2789q);
            csx.this.m3459q(this.f2796b, this.f2797c);
        }
    }

    public csx(MediaPickerAct mediaPickerAct) {
        this.f2786n = mediaPickerAct;
    }

    /* JADX INFO: renamed from: K */
    private void m3425K(nqh0 nqh0Var, q860<iti> q860Var) {
        if (NullChecker.a(nqh0Var.c)) {
            if (NullChecker.a(q860Var) && !vwb.J(q860Var.a)) {
                for (iti itiVar : q860Var.a) {
                    if (itiVar.equals(nqh0Var.c)) {
                        nqh0Var.c = itiVar;
                        ((zdm) nqh0Var.d).m9415L(itiVar.c);
                        return;
                    }
                }
            }
            nqh0Var.c = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Media m3426a(Video video) {
        return video;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Media m3430e(Picture picture) {
        return picture;
    }

    /* JADX INFO: renamed from: A */
    public void m3437A(int i, int i2, boolean z, int i3, boolean z2, Gender gender, boolean z3) {
        if (i > 0) {
            nqh0 nqh0Var = this.f2787o;
            int i4 = MediaPickerAct.f514D;
            if (i2 != i4) {
                i4 = MediaPickerAct.f513C;
            }
            nqh0Var.d = new zdm(i4, false, this.f2786n, i, z3, nqh0Var, false);
            this.f2787o.e = (RecyclerView) this.f2786n.inflater().inflate(f6c0.Ud, (ViewGroup) this.f2776d, false);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(m3440C0(), i3);
            gridLayoutManager.setSmoothScrollbarEnabled(true);
            this.f2787o.e.setLayoutManager(gridLayoutManager);
            this.f2787o.e.addItemDecoration(new dmf0(t100.d(4.0f), i3));
            nqh0 nqh0Var2 = this.f2787o;
            nqh0Var2.e.setAdapter(nqh0Var2.d);
        }
        if (z) {
            this.f2788p.d = new zdm(MediaPickerAct.f514D, true, this.f2786n, i, z3, this.f2787o, false);
            this.f2788p.e = (RecyclerView) this.f2786n.inflater().inflate(f6c0.Ud, (ViewGroup) this.f2776d, false);
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(m3440C0(), i3);
            gridLayoutManager2.setSmoothScrollbarEnabled(true);
            this.f2788p.e.setLayoutManager(gridLayoutManager2);
            this.f2788p.e.addItemDecoration(new dmf0(t100.d(4.0f), i3));
            nqh0 nqh0Var3 = this.f2788p;
            nqh0Var3.e.setAdapter(nqh0Var3.d);
        }
        this.f2776d.setAdapter(new vkw(z, i, this.f2787o, this.f2788p, this.f2786n));
        this.f2774b.setupWithViewPager(this.f2776d);
        this.f2776d.d(new C0207a(i, z2, gender));
    }

    /* JADX INFO: renamed from: B */
    public void m3438B(int i) {
        xdl0.M0(this.f2783k, i > 1);
        this.f2783k.setOnClickListener(new View.OnClickListener() { // from class: l.asx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2273a.m3445I(view);
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: C */
    public void m3439C(int i, String str, String str2, boolean z, int i2, boolean z2, Gender gender) {
        if (NullChecker.a(CoreModule.c)) {
            CoreBusinessModule.m0().i(this.f2774b);
        } else {
            this.f2774b.setBackgroundResource(x2c0.Ht);
        }
        if ("force_select_image".equals(str2)) {
            act().setSwipeBackEnable(false);
            act().getSupportActionBar().w(false);
        }
        m3459q(z2, gender);
        int i3 = MediaPickerAct.f513C;
        MediaPickerAct mediaPickerAct = this.f2786n;
        if (i == i3) {
            mediaPickerAct.setStatusBarColor(mediaPickerAct.color(w0c0.q1));
            MediaPickerAct mediaPickerAct2 = this.f2786n;
            mediaPickerAct2.setActionBarColor(mediaPickerAct2.color(w0c0.p1));
            this.f2786n.setTitle(R.string.Mh);
            this.f2782j.setTextColor(this.f2786n.color(w0c0.a));
            xdl0.M(this.f2777e, true);
        } else {
            mediaPickerAct.setTitle(R.string.Uh);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f2786n.setTitle(str);
        }
        if (!z || i2 <= 0) {
            this.f2774b.setVisibility(8);
            return;
        }
        this.f2774b.setElevation(this.f2786n.getSupportActionBar().j());
        if (NullChecker.a(((PutongAct) this.f2786n).statusHeaderView)) {
            ((PutongAct) this.f2786n).statusHeaderView.setElevation(0.0f);
        }
        this.f2786n.getSupportActionBar().A(0.0f);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3440C0() {
        return this.f2786n;
    }

    /* JADX INFO: renamed from: E */
    public void m3441E(boolean z) {
        xdl0.M(this.f2777e, z);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m3442F() {
        this.f2789q.e.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m3443G(boolean z, BottomSheetLayout bottomSheetLayout) {
        if (this.f2774b.getVisibility() != 8) {
            if (this.f2789q == this.f2788p) {
                this.f2792t.k();
                this.f2792t.j();
                return;
            } else {
                this.f2793u.k();
                this.f2793u.j();
                return;
            }
        }
        if (z) {
            this.f2792t.k();
            this.f2792t.j();
        } else {
            this.f2793u.k();
            this.f2793u.j();
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m3444H(int i, final boolean z, View view) {
        if (this.f2777e.getVisibility() == 0) {
            return;
        }
        VList vList = new VList(this.f2786n);
        this.f2790r = vList;
        vList.setBackgroundColor(-1);
        this.f2790r.setDivider(null);
        int i2 = MediaPickerAct.f513C;
        if (i != i2) {
            i2 = MediaPickerAct.f514D;
        }
        nqh0 nqh0Var = this.f2789q;
        MediaPickerAct mediaPickerAct = this.f2786n;
        nti ntiVar = new nti(i2, nqh0Var, mediaPickerAct, mediaPickerAct);
        this.f2791s = ntiVar;
        this.f2790r.setAdapter((ListAdapter) ntiVar);
        this.f2791s.m6566w(this.f2789q.b);
        int size = this.f2789q.b.a.size() * t100.d(64.0f);
        int height = this.f2775c.getHeight() / 2;
        VList vList2 = this.f2790r;
        if (size < height) {
            vList2.setLayoutParams(new FrameLayout.LayoutParams(-1, size));
            this.f2775c.setPeekSheetTranslation(size);
        } else {
            vList2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f2775c.setPeekSheetTranslation(height);
        }
        this.f2775c.m(new kf50() { // from class: l.bsx
            /* JADX INFO: renamed from: a */
            public final void m3168a(BottomSheetLayout bottomSheetLayout) {
                this.f2488a.m3443G(z, bottomSheetLayout);
            }
        });
        this.f2775c.C(this.f2790r);
        if (this.f2774b.getVisibility() != 8) {
            if (this.f2789q == this.f2788p) {
                this.f2792t.i();
                this.f2792t.l();
                return;
            } else {
                this.f2793u.i();
                this.f2793u.l();
                return;
            }
        }
        if (z) {
            this.f2792t.i();
            this.f2792t.l();
        } else {
            this.f2793u.i();
            this.f2793u.l();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m3445I(View view) {
        this.f2786n.m862r2();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: J */
    public void m3446J(boolean z) {
        this.f2776d.setBackgroundColor(this.f2786n.getResources().getColor(w0c0.b2));
        View viewInflate = this.f2773a.inflate();
        VImage vImage = (VImage) viewInflate.findViewById(u4c0.L5);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.Pd);
        MediaPickerAct mediaPickerAct = this.f2786n;
        if (z) {
            vImage.setImageDrawable(mediaPickerAct.getResources().getDrawable(x2c0.yt));
        } else {
            vImage.setImageDrawable(mediaPickerAct.getResources().getDrawable(x2c0.zt));
        }
        textView.setText(i0g0.b0(this.f2786n.getString(R.string.Mo), vwb.f0(new String[]{this.f2786n.getString(R.string.No)}), Color.parseColor("#d74d37"), Typeface.DEFAULT));
        zvf0.A("e_picture_albums_tips", "p_picture_albums_view", new j760[]{vwb.Y("signup_source", CoreModule.H().getSignUpType()), vwb.Y("phone_num", SignUpData.getNonNullPhoneNumber())});
    }

    /* JADX INFO: renamed from: L */
    public void m3447L(List<Picture> list) {
        this.f2787o.a = new q860(vwb.Q(list, new w9j() { // from class: l.zrx
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return csx.m3430e((Picture) obj);
            }
        }), (DbLinks) null);
        nqh0 nqh0Var = this.f2787o;
        ((zdm) nqh0Var.d).m9415L(nqh0Var.a);
    }

    /* JADX INFO: renamed from: M */
    public void m3448M(q860<iti> q860Var) {
        nqh0 nqh0Var = this.f2787o;
        nqh0Var.b = q860Var;
        m3425K(nqh0Var, q860Var);
        if (this.f2789q == this.f2787o && NullChecker.a(this.f2791s)) {
            this.f2791s.m6566w(this.f2787o.b);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m3449N(List<Video> list) {
        this.f2788p.a = new q860(vwb.Q(list, new w9j() { // from class: l.yrx
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return csx.m3426a((Video) obj);
            }
        }), (DbLinks) null);
        nqh0 nqh0Var = this.f2788p;
        ((zdm) nqh0Var.d).m9415L(nqh0Var.a);
    }

    /* JADX INFO: renamed from: O */
    public void m3450O(q860<iti> q860Var) {
        nqh0 nqh0Var = this.f2788p;
        nqh0Var.b = q860Var;
        m3425K(nqh0Var, q860Var);
        if (this.f2789q == this.f2788p && NullChecker.a(this.f2791s)) {
            this.f2791s.m6566w(this.f2788p.b);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m3451P(e30<nqh0> e30Var) {
        this.f2794v = e30Var;
    }

    /* JADX INFO: renamed from: Q */
    public void m3452Q(iti itiVar) {
        this.f2789q.c = itiVar;
    }

    /* JADX INFO: renamed from: R */
    public void m3453R() {
        this.f2786n.setStatusBarColorResId(v0c0.p);
        this.f2786n.getSupportActionBar().u(new ColorDrawable(-1));
        this.f2786n.getSupportActionBar().B(x2c0.Ed);
        this.f2786n.setTitle("");
    }

    /* JADX INFO: renamed from: S */
    public void m3454S(boolean z) {
        if (this.f2774b.getTabCount() == 2 && z) {
            this.f2774b.getTabAt(1).select();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m3455T(nqh0 nqh0Var, nqh0 nqh0Var2, nqh0 nqh0Var3) {
        this.f2787o = nqh0Var;
        this.f2788p = nqh0Var2;
        this.f2789q = nqh0Var3;
    }

    @Nullable
    public Act act() {
        return this.f2786n;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3457n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m3457n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dsx.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m3456i1(urx urxVar) {
        this.f2784l = urxVar;
    }

    /* JADX INFO: renamed from: q */
    public void m3459q(boolean z, Gender gender) {
        this.f2778f.setVisibility(8);
    }

    /* JADX INFO: renamed from: s */
    public void m3460s(iti itiVar) {
        nqh0 nqh0Var = this.f2789q;
        ((zdm) nqh0Var.d).m9415L(itiVar == null ? nqh0Var.a : itiVar.c);
    }

    /* JADX INFO: renamed from: u */
    public void m3461u() {
        this.f2789q.e.scrollToPosition(0);
        this.f2786n.post(new Runnable() { // from class: l.wrx
            @Override // java.lang.Runnable
            public final void run() {
                this.f8607a.m3442F();
            }
        });
        this.f2775c.q();
    }

    /* JADX INFO: renamed from: v */
    public void m3462v(ArrayList<Media> arrayList) {
        xdl0.y(this.f2783k, arrayList.size() > 0);
    }

    /* JADX INFO: renamed from: w */
    public void m3463w(q860<iti> q860Var) {
        if (q860Var.a.size() <= 0) {
            xdl0.M(this.f2777e, false);
            return;
        }
        nqh0 nqh0Var = this.f2787o;
        nqh0Var.b = q860Var;
        if (nqh0Var.c == null) {
            nqh0Var.c = (iti) q860Var.a.get(0);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m3464x() {
        xdl0.M(this.f2777e, false);
    }

    /* JADX INFO: renamed from: y */
    public void m3465y(q860<Media> q860Var) {
        ((zdm) this.f2787o.d).m9415L(q860Var);
        xdl0.M(this.f2777e, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: z */
    public void m3466z(final int i, final boolean z) {
        this.f2782j.setText(R.string.w8);
        this.f2782j.setOnClickListener(new View.OnClickListener() { // from class: l.xrx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8825a.m3444H(i, z, view);
            }
        });
    }

    public void destroy() {
    }
}
