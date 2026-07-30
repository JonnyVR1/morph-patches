package p006l;

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
import androidx.viewpager.widget.ViewPager;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.mediapicker.impl.AccountMediaPickerAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.cwf0;
import l.e30;
import l.iti;
import l.kf50;
import l.nqh0;
import l.q860;
import l.s7m;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import v.VList;
import v.VPager;
import v.VProgressBar;
import v.VText;

/* JADX INFO: renamed from: l.ju */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0905ju implements s7m<C0655du> {

    /* JADX INFO: renamed from: a */
    public ViewStub f15399a;

    /* JADX INFO: renamed from: b */
    public TabLayout f15400b;

    /* JADX INFO: renamed from: c */
    public BottomSheetLayout f15401c;

    /* JADX INFO: renamed from: d */
    public VPager f15402d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f15403e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f15404f;

    /* JADX INFO: renamed from: g */
    public ImageView f15405g;

    /* JADX INFO: renamed from: h */
    public TextView f15406h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f15407i;

    /* JADX INFO: renamed from: j */
    public VText f15408j;

    /* JADX INFO: renamed from: k */
    public VText f15409k;

    /* JADX INFO: renamed from: l */
    public C0655du f15410l;

    /* JADX INFO: renamed from: n */
    public AccountMediaPickerAct f15412n;

    /* JADX INFO: renamed from: o */
    public nqh0 f15413o;

    /* JADX INFO: renamed from: p */
    public nqh0 f15414p;

    /* JADX INFO: renamed from: q */
    public nqh0 f15415q;

    /* JADX INFO: renamed from: r */
    public VList f15416r;

    /* JADX INFO: renamed from: s */
    public C0651dp f15417s;

    /* JADX INFO: renamed from: v */
    public e30<nqh0> f15420v;

    /* JADX INFO: renamed from: m */
    public boolean f15411m = false;

    /* JADX INFO: renamed from: t */
    public cwf0 f15418t = new cwf0("p_video_albums_view", BottomSheetLayout.class.getName());

    /* JADX INFO: renamed from: u */
    public cwf0 f15419u = new cwf0("p_picture_albums_view", BottomSheetLayout.class.getName());

    /* JADX INFO: renamed from: l.ju$a */
    public class a extends ViewPager.m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f15421a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f15422b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Gender f15423c;

        public a(int i, boolean z, Gender gender) {
            this.f15421a = i;
            this.f15422b = z;
            this.f15423c = gender;
        }

        public void onPageSelected(int i) {
            C0905ju.this.f15401c.q();
            C0905ju c0905ju = C0905ju.this;
            c0905ju.f15415q = (i != 0 || this.f15421a <= 0) ? c0905ju.f15414p : c0905ju.f15413o;
            C0905ju.this.f15420v.call(C0905ju.this.f15415q);
            C0905ju.this.m17831p(this.f15422b, this.f15423c);
        }
    }

    public C0905ju(AccountMediaPickerAct accountMediaPickerAct) {
        this.f15412n = accountMediaPickerAct;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Media m17803a(Picture picture) {
        return picture;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Media m17807e(Video video) {
        return video;
    }

    /* JADX INFO: renamed from: A */
    public void m17813A(int i, String str, String str2, boolean z, int i2, boolean z2, Gender gender) {
        this.f15400b.setBackgroundResource(v2c0.f24039h1);
        m17831p(z2, gender);
        int i3 = AccountMediaPickerAct.f1001B;
        AccountMediaPickerAct accountMediaPickerAct = this.f15412n;
        if (i == i3) {
            accountMediaPickerAct.setStatusBarColor(accountMediaPickerAct.color(u0c0.f22407n));
            AccountMediaPickerAct accountMediaPickerAct2 = this.f15412n;
            accountMediaPickerAct2.setActionBarColor(accountMediaPickerAct2.color(u0c0.f22406m));
            this.f15412n.setTitle(R$string.f264r2);
            this.f15408j.setTextColor(this.f15412n.color(u0c0.f22394a));
            xdl0.M(this.f15403e, true);
        } else {
            accountMediaPickerAct.setTitle(R$string.f299y2);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f15412n.setTitle(str);
        }
        if (!z || i2 <= 0) {
            this.f15400b.setVisibility(8);
            return;
        }
        this.f15400b.setElevation(this.f15412n.getSupportActionBar().j());
        if (NullChecker.a(this.f15412n.statusHeaderView)) {
            this.f15412n.statusHeaderView.setElevation(0.0f);
        }
        this.f15412n.getSupportActionBar().A(0.0f);
    }

    /* JADX INFO: renamed from: B */
    public void m17814B(boolean z) {
        xdl0.M(this.f15403e, z);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m17815C() {
        this.f15415q.e.scrollToPosition(0);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17816C0() {
        return this.f15412n;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m17817E(boolean z, BottomSheetLayout bottomSheetLayout) {
        if (this.f15400b.getVisibility() != 8) {
            if (this.f15415q == this.f15414p) {
                this.f15418t.k();
                this.f15418t.j();
                return;
            } else {
                this.f15419u.k();
                this.f15419u.j();
                return;
            }
        }
        if (z) {
            this.f15418t.k();
            this.f15418t.j();
        } else {
            this.f15419u.k();
            this.f15419u.j();
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [android.widget.ListAdapter, l.dp] */
    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m17818F(int i, final boolean z, View view) {
        if (this.f15403e.getVisibility() == 0) {
            return;
        }
        VList vList = new VList(this.f15412n);
        this.f15416r = vList;
        vList.setBackgroundColor(-1);
        this.f15416r.setDivider(null);
        int i2 = AccountMediaPickerAct.f1001B;
        if (i != i2) {
            i2 = AccountMediaPickerAct.f1002C;
        }
        nqh0 nqh0Var = this.f15415q;
        AccountMediaPickerAct accountMediaPickerAct = this.f15412n;
        ?? c0651dp = new C0651dp(i2, nqh0Var, accountMediaPickerAct, accountMediaPickerAct);
        this.f15417s = c0651dp;
        this.f15416r.setAdapter((ListAdapter) c0651dp);
        this.f15417s.m14172w(this.f15415q.b);
        int size = this.f15415q.b.a.size() * t100.d(64.0f);
        int height = this.f15401c.getHeight() / 2;
        VList vList2 = this.f15416r;
        if (size < height) {
            vList2.setLayoutParams(new FrameLayout.LayoutParams(-1, size));
            this.f15401c.setPeekSheetTranslation(size);
        } else {
            vList2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f15401c.setPeekSheetTranslation(height);
        }
        this.f15401c.m(new kf50() { // from class: l.iu
            /* JADX INFO: renamed from: a */
            public final void m17035a(BottomSheetLayout bottomSheetLayout) {
                this.f14782a.m17817E(z, bottomSheetLayout);
            }
        });
        this.f15401c.C(this.f15416r);
        if (this.f15400b.getVisibility() != 8) {
            if (this.f15415q == this.f15414p) {
                this.f15418t.i();
                this.f15418t.l();
                return;
            } else {
                this.f15419u.i();
                this.f15419u.l();
                return;
            }
        }
        if (z) {
            this.f15418t.i();
            this.f15418t.l();
        } else {
            this.f15419u.i();
            this.f15419u.l();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m17819G(nqh0 nqh0Var, q860<iti> q860Var) {
        if (NullChecker.a(nqh0Var.c)) {
            if (NullChecker.a(q860Var) && !vwb.J(q860Var.a)) {
                for (iti itiVar : q860Var.a) {
                    if (itiVar.equals(nqh0Var.c)) {
                        nqh0Var.c = itiVar;
                        ((C1143pp) nqh0Var.d).m21637L(itiVar.c);
                        return;
                    }
                }
            }
            nqh0Var.c = null;
        }
    }

    /* JADX INFO: renamed from: H */
    public void m17820H(List<Picture> list) {
        boolean zJ = vwb.J(this.f15413o.a.a);
        nqh0 nqh0Var = this.f15413o;
        if (zJ) {
            nqh0Var.a = new q860(vwb.Q(list, new w9j() { // from class: l.fu
                public final Object call(Object obj) {
                    return C0905ju.m17803a((Picture) obj);
                }
            }), (DbLinks) null);
            nqh0 nqh0Var2 = this.f15413o;
            ((C1143pp) nqh0Var2.d).m21637L(nqh0Var2.a);
        } else {
            int size = nqh0Var.a.a.size();
            this.f15413o.a.a.addAll(list);
            this.f15413o.d.notifyItemRangeInserted(size, list.size());
        }
    }

    /* JADX INFO: renamed from: I */
    public void m17821I(q860<iti> q860Var) {
        boolean zJ = vwb.J(this.f15413o.b.a);
        nqh0 nqh0Var = this.f15413o;
        if (zJ) {
            nqh0Var.b = q860Var;
            m17819G(nqh0Var, q860Var);
        } else {
            nqh0Var.b.a.addAll(q860Var.a);
        }
        if (this.f15415q == this.f15413o && NullChecker.a(this.f15417s)) {
            this.f15417s.m14172w(this.f15413o.b);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m17822J(List<Video> list) {
        boolean zJ = vwb.J(this.f15414p.a.a);
        nqh0 nqh0Var = this.f15414p;
        if (zJ) {
            nqh0Var.a = new q860(vwb.Q(list, new w9j() { // from class: l.hu
                public final Object call(Object obj) {
                    return C0905ju.m17807e((Video) obj);
                }
            }), (DbLinks) null);
            nqh0 nqh0Var2 = this.f15414p;
            ((C1143pp) nqh0Var2.d).m21637L(nqh0Var2.a);
        } else {
            int size = nqh0Var.a.a.size();
            this.f15414p.a.a.addAll(list);
            this.f15414p.d.notifyItemRangeInserted(size, list.size());
        }
    }

    /* JADX INFO: renamed from: K */
    public void m17823K(q860<iti> q860Var) {
        boolean zJ = vwb.J(this.f15414p.b.a);
        nqh0 nqh0Var = this.f15414p;
        if (zJ) {
            nqh0Var.b = q860Var;
            m17819G(nqh0Var, q860Var);
        } else {
            nqh0Var.b.a.addAll(q860Var.a);
        }
        if (this.f15415q == this.f15414p && NullChecker.a(this.f15417s)) {
            this.f15417s.m14172w(this.f15414p.b);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m17824L(e30<nqh0> e30Var) {
        this.f15420v = e30Var;
    }

    /* JADX INFO: renamed from: M */
    public void m17825M(iti itiVar) {
        this.f15415q.c = itiVar;
    }

    /* JADX INFO: renamed from: N */
    public void m17826N(boolean z) {
        if (this.f15400b.getTabCount() == 2 && z) {
            this.f15400b.getTabAt(1).select();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m17827O(nqh0 nqh0Var, nqh0 nqh0Var2, nqh0 nqh0Var3) {
        this.f15413o = nqh0Var;
        this.f15414p = nqh0Var2;
        this.f15415q = nqh0Var3;
    }

    @Nullable
    public Act act() {
        return this.f15412n;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m17829m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m17829m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0946ku.m18270b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m17828i1(C0655du c0655du) {
        this.f15410l = c0655du;
    }

    /* JADX INFO: renamed from: p */
    public void m17831p(boolean z, Gender gender) {
        this.f15404f.setVisibility(8);
    }

    /* JADX INFO: renamed from: q */
    public void m17832q() {
        this.f15413o.a.a.clear();
        this.f15413o.b.a.clear();
    }

    /* JADX INFO: renamed from: s */
    public void m17833s(iti itiVar) {
        nqh0 nqh0Var = this.f15415q;
        ((C1143pp) nqh0Var.d).m21637L(itiVar == null ? nqh0Var.a : itiVar.c);
    }

    /* JADX INFO: renamed from: u */
    public void m17834u() {
        this.f15415q.e.scrollToPosition(0);
        this.f15412n.post(new Runnable() { // from class: l.eu
            @Override // java.lang.Runnable
            public final void run() {
                this.f11450a.m17815C();
            }
        });
        this.f15401c.q();
    }

    /* JADX INFO: renamed from: v */
    public void m17835v(q860<iti> q860Var) {
        if (q860Var.a.size() <= 0) {
            xdl0.M(this.f15403e, false);
            return;
        }
        nqh0 nqh0Var = this.f15413o;
        nqh0Var.b = q860Var;
        if (nqh0Var.c == null) {
            nqh0Var.c = (iti) q860Var.a.get(0);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m17836w() {
        xdl0.M(this.f15403e, false);
    }

    /* JADX INFO: renamed from: x */
    public void m17837x(q860<Media> q860Var) {
        ((C1143pp) this.f15413o.d).m21637L(q860Var);
        xdl0.M(this.f15403e, false);
    }

    /* JADX INFO: renamed from: y */
    public void m17838y(final int i, final boolean z) {
        this.f15408j.setText(R$string.f252p0);
        this.f15408j.setOnClickListener(new View.OnClickListener() { // from class: l.gu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13506a.m17818F(i, z, view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m17839z(int i, int i2, boolean z, int i3, boolean z2, Gender gender, boolean z3, boolean z4) {
        if (i > 0) {
            nqh0 nqh0Var = this.f15413o;
            int i4 = AccountMediaPickerAct.f1002C;
            if (i2 != i4) {
                i4 = AccountMediaPickerAct.f1001B;
            }
            nqh0Var.d = new C1143pp(i4, false, this.f15412n, i, z3, nqh0Var, z4, "");
            this.f15413o.e = this.f15412n.inflater().inflate(c6c0.f9398H, (ViewGroup) this.f15402d, false);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(m17816C0(), i3);
            gridLayoutManager.setSmoothScrollbarEnabled(true);
            this.f15413o.e.setLayoutManager(gridLayoutManager);
            this.f15413o.e.addItemDecoration(new gmf0(t100.d(4.0f), i3));
            nqh0 nqh0Var2 = this.f15413o;
            nqh0Var2.e.setAdapter(nqh0Var2.d);
        }
        if (z) {
            this.f15414p.d = new C1143pp(AccountMediaPickerAct.f1002C, true, this.f15412n, i, z3, this.f15413o, z4, "");
            this.f15414p.e = this.f15412n.inflater().inflate(c6c0.f9398H, (ViewGroup) this.f15402d, false);
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(m17816C0(), i3);
            gridLayoutManager2.setSmoothScrollbarEnabled(true);
            this.f15414p.e.setLayoutManager(gridLayoutManager2);
            this.f15414p.e.addItemDecoration(new gmf0(t100.d(4.0f), i3));
            nqh0 nqh0Var3 = this.f15414p;
            nqh0Var3.e.setAdapter(nqh0Var3.d);
        }
        this.f15402d.setAdapter(new C1284su(z, i, this.f15413o, this.f15414p, this.f15412n));
        this.f15400b.setupWithViewPager(this.f15402d);
        this.f15402d.d(new a(i, z2, gender));
    }

    public void destroy() {
    }
}
