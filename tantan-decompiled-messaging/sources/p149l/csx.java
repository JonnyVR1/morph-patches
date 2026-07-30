package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.Video;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VList;
import p147v.VPager;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class csx implements s7m<urx> {

    /* JADX INFO: renamed from: a */
    public ViewStub f82406a;

    /* JADX INFO: renamed from: b */
    public TabLayout f82407b;

    /* JADX INFO: renamed from: c */
    public BottomSheetLayout f82408c;

    /* JADX INFO: renamed from: d */
    public VPager f82409d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f82410e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f82411f;

    /* JADX INFO: renamed from: g */
    public ImageView f82412g;

    /* JADX INFO: renamed from: h */
    public TextView f82413h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f82414i;

    /* JADX INFO: renamed from: j */
    public VText f82415j;

    /* JADX INFO: renamed from: k */
    public VText f82416k;

    /* JADX INFO: renamed from: l */
    public urx f82417l;

    /* JADX INFO: renamed from: n */
    public MediaPickerAct f82419n;

    /* JADX INFO: renamed from: o */
    public nqh0 f82420o;

    /* JADX INFO: renamed from: p */
    public nqh0 f82421p;

    /* JADX INFO: renamed from: q */
    public nqh0 f82422q;

    /* JADX INFO: renamed from: r */
    public VList f82423r;

    /* JADX INFO: renamed from: s */
    public nti f82424s;

    /* JADX INFO: renamed from: v */
    public e30<nqh0> f82427v;

    /* JADX INFO: renamed from: m */
    public boolean f82418m = false;

    /* JADX INFO: renamed from: t */
    public cwf0 f82425t = new cwf0("p_video_albums_view", BottomSheetLayout.class.getName());

    /* JADX INFO: renamed from: u */
    public cwf0 f82426u = new cwf0("p_picture_albums_view", BottomSheetLayout.class.getName());

    /* JADX INFO: renamed from: l.csx$a */
    public class C16238a extends ViewPager.C0719m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f82428a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f82429b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Gender f82430c;

        public C16238a(int i, boolean z, Gender gender) {
            this.f82428a = i;
            this.f82429b = z;
            this.f82430c = gender;
        }

        @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            csx.this.f82408c.m9283q();
            csx csxVar = csx.this;
            csxVar.f82422q = (i != 0 || this.f82428a <= 0) ? csxVar.f82421p : csxVar.f82420o;
            csx.this.f82427v.call(csx.this.f82422q);
            csx.this.m108634q(this.f82429b, this.f82430c);
        }
    }

    public csx(MediaPickerAct mediaPickerAct) {
        this.f82419n = mediaPickerAct;
    }

    /* JADX INFO: renamed from: K */
    private void m108602K(nqh0 nqh0Var, q860<iti> q860Var) {
        if (NullChecker.m81303a(nqh0Var.f140068c)) {
            if (NullChecker.m81303a(q860Var) && !vwb.m200296J(q860Var.f153135a)) {
                for (iti itiVar : q860Var.f153135a) {
                    if (itiVar.equals(nqh0Var.f140068c)) {
                        nqh0Var.f140068c = itiVar;
                        ((zdm) nqh0Var.f140069d).m218180L(itiVar.f114886c);
                        return;
                    }
                }
            }
            nqh0Var.f140068c = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Media m108603a(Video video) {
        return video;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Media m108607e(Picture picture) {
        return picture;
    }

    /* JADX INFO: renamed from: A */
    public void m108614A(int i, int i2, boolean z, int i3, boolean z2, Gender gender, boolean z3) {
        if (i > 0) {
            nqh0 nqh0Var = this.f82420o;
            int i4 = MediaPickerAct.f30623D;
            if (i2 != i4) {
                i4 = MediaPickerAct.f30622C;
            }
            nqh0Var.f140069d = new zdm(i4, false, this.f82419n, i, z3, nqh0Var, false);
            this.f82420o.f140070e = (RecyclerView) this.f82419n.inflater().inflate(f6c0.f95600Ud, (ViewGroup) this.f82409d, false);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i3);
            gridLayoutManager.setSmoothScrollbarEnabled(true);
            this.f82420o.f140070e.setLayoutManager(gridLayoutManager);
            this.f82420o.f140070e.addItemDecoration(new dmf0(t100.m186890d(4.0f), i3));
            nqh0 nqh0Var2 = this.f82420o;
            nqh0Var2.f140070e.setAdapter(nqh0Var2.f140069d);
        }
        if (z) {
            this.f82421p.f140069d = new zdm(MediaPickerAct.f30623D, true, this.f82419n, i, z3, this.f82420o, false);
            this.f82421p.f140070e = (RecyclerView) this.f82419n.inflater().inflate(f6c0.f95600Ud, (ViewGroup) this.f82409d, false);
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(), i3);
            gridLayoutManager2.setSmoothScrollbarEnabled(true);
            this.f82421p.f140070e.setLayoutManager(gridLayoutManager2);
            this.f82421p.f140070e.addItemDecoration(new dmf0(t100.m186890d(4.0f), i3));
            nqh0 nqh0Var3 = this.f82421p;
            nqh0Var3.f140070e.setAdapter(nqh0Var3.f140069d);
        }
        this.f82409d.setAdapter(new vkw(z, i, this.f82420o, this.f82421p, this.f82419n));
        this.f82407b.setupWithViewPager(this.f82409d);
        this.f82409d.m4185d(new C16238a(i, z2, gender));
    }

    /* JADX INFO: renamed from: B */
    public void m108615B(int i) {
        xdl0.m208345M0(this.f82416k, i > 1);
        this.f82416k.setOnClickListener(new View.OnClickListener() { // from class: l.asx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71500a.m108621I(view);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m108616C(int i, String str, String str2, boolean z, int i2, boolean z2, Gender gender) {
        if (NullChecker.m81303a(CoreModule.f17545c)) {
            CoreBusinessModule.m29908m0().mo190522i(this.f82407b);
        } else {
            this.f82407b.setBackgroundResource(x2c0.f189406Ht);
        }
        if ("force_select_image".equals(str2)) {
            getAct().setSwipeBackEnable(false);
            getAct().getSupportActionBar().mo134136w(false);
        }
        m108634q(z2, gender);
        int i3 = MediaPickerAct.f30622C;
        MediaPickerAct mediaPickerAct = this.f82419n;
        if (i == i3) {
            mediaPickerAct.setStatusBarColor(mediaPickerAct.color(w0c0.f183880q1));
            MediaPickerAct mediaPickerAct2 = this.f82419n;
            mediaPickerAct2.setActionBarColor(mediaPickerAct2.color(w0c0.f183877p1));
            this.f82419n.setTitle(R$string.f17944Mh);
            this.f82415j.setTextColor(this.f82419n.color(w0c0.f183827a));
            xdl0.m208344M(this.f82410e, true);
        } else {
            mediaPickerAct.setTitle(R$string.f18184Uh);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f82419n.setTitle(str);
        }
        if (!z || i2 <= 0) {
            this.f82407b.setVisibility(8);
            return;
        }
        this.f82407b.setElevation(this.f82419n.getSupportActionBar().mo134123j());
        if (NullChecker.m81303a(this.f82419n.statusHeaderView)) {
            this.f82419n.statusHeaderView.setElevation(0.0f);
        }
        this.f82419n.getSupportActionBar().mo134111A(0.0f);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f82419n;
    }

    /* JADX INFO: renamed from: E */
    public void m108617E(boolean z) {
        xdl0.m208344M(this.f82410e, z);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m108618F() {
        this.f82422q.f140070e.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m108619G(boolean z, BottomSheetLayout bottomSheetLayout) {
        if (this.f82407b.getVisibility() != 8) {
            if (this.f82422q == this.f82421p) {
                this.f82425t.m109035k();
                this.f82425t.m109034j();
                return;
            } else {
                this.f82426u.m109035k();
                this.f82426u.m109034j();
                return;
            }
        }
        if (z) {
            this.f82425t.m109035k();
            this.f82425t.m109034j();
        } else {
            this.f82426u.m109035k();
            this.f82426u.m109034j();
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m108620H(int i, final boolean z, View view) {
        if (this.f82410e.getVisibility() == 0) {
            return;
        }
        VList vList = new VList(this.f82419n);
        this.f82423r = vList;
        vList.setBackgroundColor(-1);
        this.f82423r.setDivider(null);
        int i2 = MediaPickerAct.f30622C;
        if (i != i2) {
            i2 = MediaPickerAct.f30623D;
        }
        nqh0 nqh0Var = this.f82422q;
        MediaPickerAct mediaPickerAct = this.f82419n;
        nti ntiVar = new nti(i2, nqh0Var, mediaPickerAct, mediaPickerAct);
        this.f82424s = ntiVar;
        this.f82423r.setAdapter((ListAdapter) ntiVar);
        this.f82424s.m161384w(this.f82422q.f140067b);
        int size = this.f82422q.f140067b.f153135a.size() * t100.m186890d(64.0f);
        int height = this.f82408c.getHeight() / 2;
        VList vList2 = this.f82423r;
        if (size < height) {
            vList2.setLayoutParams(new FrameLayout.LayoutParams(-1, size));
            this.f82408c.setPeekSheetTranslation(size);
        } else {
            vList2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f82408c.setPeekSheetTranslation(height);
        }
        this.f82408c.m9282m(new kf50() { // from class: l.bsx
            @Override // p149l.kf50
            /* JADX INFO: renamed from: a */
            public final void mo103724a(BottomSheetLayout bottomSheetLayout) {
                this.f77133a.m108619G(z, bottomSheetLayout);
            }
        });
        this.f82408c.m9280C(this.f82423r);
        if (this.f82407b.getVisibility() != 8) {
            if (this.f82422q == this.f82421p) {
                this.f82425t.m109033i();
                this.f82425t.m109036l();
                return;
            } else {
                this.f82426u.m109033i();
                this.f82426u.m109036l();
                return;
            }
        }
        if (z) {
            this.f82425t.m109033i();
            this.f82425t.m109036l();
        } else {
            this.f82426u.m109033i();
            this.f82426u.m109036l();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m108621I(View view) {
        this.f82419n.m47798r2();
    }

    /* JADX INFO: renamed from: J */
    public void m108622J(boolean z) {
        this.f82409d.setBackgroundColor(this.f82419n.getResources().getColor(w0c0.f183834b2));
        View viewInflate = this.f82406a.inflate();
        VImage vImage = (VImage) viewInflate.findViewById(u4c0.f173909L5);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f173985Pd);
        MediaPickerAct mediaPickerAct = this.f82419n;
        if (z) {
            vImage.setImageDrawable(mediaPickerAct.getResources().getDrawable(x2c0.f190760yt));
        } else {
            vImage.setImageDrawable(mediaPickerAct.getResources().getDrawable(x2c0.f190792zt));
        }
        textView.setText(i0g0.m133861b0(this.f82419n.getString(R$string.f17951Mo), vwb.m200324f0(this.f82419n.getString(R$string.f17981No)), Color.parseColor("#d74d37"), Typeface.DEFAULT));
        zvf0.m220368A("e_picture_albums_tips", "p_picture_albums_view", vwb.m200311Y("signup_source", CoreModule.m29931H().getSignUpType()), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, SignUpData.getNonNullPhoneNumber()));
    }

    /* JADX INFO: renamed from: L */
    public void m108623L(List<Picture> list) {
        this.f82420o.f140066a = new q860<>(vwb.m200303Q(list, new w9j() { // from class: l.zrx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return csx.m108607e((Picture) obj);
            }
        }), null);
        nqh0 nqh0Var = this.f82420o;
        ((zdm) nqh0Var.f140069d).m218180L(nqh0Var.f140066a);
    }

    /* JADX INFO: renamed from: M */
    public void m108624M(q860<iti> q860Var) {
        nqh0 nqh0Var = this.f82420o;
        nqh0Var.f140067b = q860Var;
        m108602K(nqh0Var, q860Var);
        if (this.f82422q == this.f82420o && NullChecker.m81303a(this.f82424s)) {
            this.f82424s.m161384w(this.f82420o.f140067b);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m108625N(List<Video> list) {
        this.f82421p.f140066a = new q860<>(vwb.m200303Q(list, new w9j() { // from class: l.yrx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return csx.m108603a((Video) obj);
            }
        }), null);
        nqh0 nqh0Var = this.f82421p;
        ((zdm) nqh0Var.f140069d).m218180L(nqh0Var.f140066a);
    }

    /* JADX INFO: renamed from: O */
    public void m108626O(q860<iti> q860Var) {
        nqh0 nqh0Var = this.f82421p;
        nqh0Var.f140067b = q860Var;
        m108602K(nqh0Var, q860Var);
        if (this.f82422q == this.f82421p && NullChecker.m81303a(this.f82424s)) {
            this.f82424s.m161384w(this.f82421p.f140067b);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m108627P(e30<nqh0> e30Var) {
        this.f82427v = e30Var;
    }

    /* JADX INFO: renamed from: Q */
    public void m108628Q(iti itiVar) {
        this.f82422q.f140068c = itiVar;
    }

    /* JADX INFO: renamed from: R */
    public void m108629R() {
        this.f82419n.setStatusBarColorResId(v0c0.f179109p);
        this.f82419n.getSupportActionBar().mo134134u(new ColorDrawable(-1));
        this.f82419n.getSupportActionBar().mo134112B(x2c0.f189295Ed);
        this.f82419n.setTitle("");
    }

    /* JADX INFO: renamed from: S */
    public void m108630S(boolean z) {
        if (this.f82407b.getTabCount() == 2 && z) {
            this.f82407b.getTabAt(1).select();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m108631T(nqh0 nqh0Var, nqh0 nqh0Var2, nqh0 nqh0Var3) {
        this.f82420o = nqh0Var;
        this.f82421p = nqh0Var2;
        this.f82422q = nqh0Var3;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f82419n;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m108632n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m108632n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dsx.m113499b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(urx urxVar) {
        this.f82417l = urxVar;
    }

    /* JADX INFO: renamed from: q */
    public void m108634q(boolean z, Gender gender) {
        this.f82411f.setVisibility(8);
    }

    /* JADX INFO: renamed from: s */
    public void m108635s(iti itiVar) {
        nqh0 nqh0Var = this.f82422q;
        ((zdm) nqh0Var.f140069d).m218180L(itiVar == null ? nqh0Var.f140066a : itiVar.f114886c);
    }

    /* JADX INFO: renamed from: u */
    public void m108636u() {
        this.f82422q.f140070e.scrollToPosition(0);
        this.f82419n.post(new Runnable() { // from class: l.wrx
            @Override // java.lang.Runnable
            public final void run() {
                this.f187848a.m108618F();
            }
        });
        this.f82408c.m9283q();
    }

    /* JADX INFO: renamed from: v */
    public void m108637v(ArrayList<Media> arrayList) {
        xdl0.m208411y(this.f82416k, arrayList.size() > 0);
    }

    /* JADX INFO: renamed from: w */
    public void m108638w(q860<iti> q860Var) {
        if (q860Var.f153135a.size() <= 0) {
            xdl0.m208344M(this.f82410e, false);
            return;
        }
        nqh0 nqh0Var = this.f82420o;
        nqh0Var.f140067b = q860Var;
        if (nqh0Var.f140068c == null) {
            nqh0Var.f140068c = q860Var.f153135a.get(0);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m108639x() {
        xdl0.m208344M(this.f82410e, false);
    }

    /* JADX INFO: renamed from: y */
    public void m108640y(q860<Media> q860Var) {
        ((zdm) this.f82420o.f140069d).m218180L(q860Var);
        xdl0.m208344M(this.f82410e, false);
    }

    /* JADX INFO: renamed from: z */
    public void m108641z(final int i, final boolean z) {
        this.f82415j.setText(R$string.f19027w8);
        this.f82415j.setOnClickListener(new View.OnClickListener() { // from class: l.xrx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194186a.m108620H(i, z, view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
