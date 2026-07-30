package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.mediapicker.impl.AccountMediaPickerAct;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VList;
import p147v.VPager;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: renamed from: l.ju */
/* JADX INFO: loaded from: classes9.dex */
public class C17860ju implements s7m<C16470du> {

    /* JADX INFO: renamed from: a */
    public ViewStub f119695a;

    /* JADX INFO: renamed from: b */
    public TabLayout f119696b;

    /* JADX INFO: renamed from: c */
    public BottomSheetLayout f119697c;

    /* JADX INFO: renamed from: d */
    public VPager f119698d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f119699e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f119700f;

    /* JADX INFO: renamed from: g */
    public ImageView f119701g;

    /* JADX INFO: renamed from: h */
    public TextView f119702h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f119703i;

    /* JADX INFO: renamed from: j */
    public VText f119704j;

    /* JADX INFO: renamed from: k */
    public VText f119705k;

    /* JADX INFO: renamed from: l */
    public C16470du f119706l;

    /* JADX INFO: renamed from: n */
    public AccountMediaPickerAct f119708n;

    /* JADX INFO: renamed from: o */
    public nqh0 f119709o;

    /* JADX INFO: renamed from: p */
    public nqh0 f119710p;

    /* JADX INFO: renamed from: q */
    public nqh0 f119711q;

    /* JADX INFO: renamed from: r */
    public VList f119712r;

    /* JADX INFO: renamed from: s */
    public C16420dp f119713s;

    /* JADX INFO: renamed from: v */
    public e30<nqh0> f119716v;

    /* JADX INFO: renamed from: m */
    public boolean f119707m = false;

    /* JADX INFO: renamed from: t */
    public cwf0 f119714t = new cwf0("p_video_albums_view", BottomSheetLayout.class.getName());

    /* JADX INFO: renamed from: u */
    public cwf0 f119715u = new cwf0("p_picture_albums_view", BottomSheetLayout.class.getName());

    /* JADX INFO: renamed from: l.ju$a */
    public class a extends ViewPager.C0719m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f119717a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f119718b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Gender f119719c;

        public a(int i, boolean z, Gender gender) {
            this.f119717a = i;
            this.f119718b = z;
            this.f119719c = gender;
        }

        @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            C17860ju.this.f119697c.m9283q();
            C17860ju c17860ju = C17860ju.this;
            c17860ju.f119711q = (i != 0 || this.f119717a <= 0) ? c17860ju.f119710p : c17860ju.f119709o;
            C17860ju.this.f119716v.call(C17860ju.this.f119711q);
            C17860ju.this.m143202p(this.f119718b, this.f119719c);
        }
    }

    public C17860ju(AccountMediaPickerAct accountMediaPickerAct) {
        this.f119708n = accountMediaPickerAct;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Media m143176a(Picture picture) {
        return picture;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Media m143180e(Video video) {
        return video;
    }

    /* JADX INFO: renamed from: A */
    public void m143186A(int i, String str, String str2, boolean z, int i2, boolean z2, Gender gender) {
        this.f119696b.setBackgroundResource(v2c0.f179475h1);
        m143202p(z2, gender);
        int i3 = AccountMediaPickerAct.f17012B;
        AccountMediaPickerAct accountMediaPickerAct = this.f119708n;
        if (i == i3) {
            accountMediaPickerAct.setStatusBarColor(accountMediaPickerAct.color(u0c0.f172893n));
            AccountMediaPickerAct accountMediaPickerAct2 = this.f119708n;
            accountMediaPickerAct2.setActionBarColor(accountMediaPickerAct2.color(u0c0.f172892m));
            this.f119708n.setTitle(R$string.f16275r2);
            this.f119704j.setTextColor(this.f119708n.color(u0c0.f172880a));
            xdl0.m208344M(this.f119699e, true);
        } else {
            accountMediaPickerAct.setTitle(R$string.f16310y2);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f119708n.setTitle(str);
        }
        if (!z || i2 <= 0) {
            this.f119696b.setVisibility(8);
            return;
        }
        this.f119696b.setElevation(this.f119708n.getSupportActionBar().mo134123j());
        if (NullChecker.m81303a(this.f119708n.statusHeaderView)) {
            this.f119708n.statusHeaderView.setElevation(0.0f);
        }
        this.f119708n.getSupportActionBar().mo134111A(0.0f);
    }

    /* JADX INFO: renamed from: B */
    public void m143187B(boolean z) {
        xdl0.m208344M(this.f119699e, z);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m143188C() {
        this.f119711q.f140070e.scrollToPosition(0);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f119708n;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m143189E(boolean z, BottomSheetLayout bottomSheetLayout) {
        if (this.f119696b.getVisibility() != 8) {
            if (this.f119711q == this.f119710p) {
                this.f119714t.m109035k();
                this.f119714t.m109034j();
                return;
            } else {
                this.f119715u.m109035k();
                this.f119715u.m109034j();
                return;
            }
        }
        if (z) {
            this.f119714t.m109035k();
            this.f119714t.m109034j();
        } else {
            this.f119715u.m109035k();
            this.f119715u.m109034j();
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m143190F(int i, final boolean z, View view) {
        if (this.f119699e.getVisibility() == 0) {
            return;
        }
        VList vList = new VList(this.f119708n);
        this.f119712r = vList;
        vList.setBackgroundColor(-1);
        this.f119712r.setDivider(null);
        int i2 = AccountMediaPickerAct.f17012B;
        if (i != i2) {
            i2 = AccountMediaPickerAct.f17013C;
        }
        nqh0 nqh0Var = this.f119711q;
        AccountMediaPickerAct accountMediaPickerAct = this.f119708n;
        C16420dp c16420dp = new C16420dp(i2, nqh0Var, accountMediaPickerAct, accountMediaPickerAct);
        this.f119713s = c16420dp;
        this.f119712r.setAdapter((ListAdapter) c16420dp);
        this.f119713s.m112843w(this.f119711q.f140067b);
        int size = this.f119711q.f140067b.f153135a.size() * t100.m186890d(64.0f);
        int height = this.f119697c.getHeight() / 2;
        VList vList2 = this.f119712r;
        if (size < height) {
            vList2.setLayoutParams(new FrameLayout.LayoutParams(-1, size));
            this.f119697c.setPeekSheetTranslation(size);
        } else {
            vList2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f119697c.setPeekSheetTranslation(height);
        }
        this.f119697c.m9282m(new kf50() { // from class: l.iu
            @Override // p149l.kf50
            /* JADX INFO: renamed from: a */
            public final void mo103724a(BottomSheetLayout bottomSheetLayout) {
                this.f114953a.m143189E(z, bottomSheetLayout);
            }
        });
        this.f119697c.m9280C(this.f119712r);
        if (this.f119696b.getVisibility() != 8) {
            if (this.f119711q == this.f119710p) {
                this.f119714t.m109033i();
                this.f119714t.m109036l();
                return;
            } else {
                this.f119715u.m109033i();
                this.f119715u.m109036l();
                return;
            }
        }
        if (z) {
            this.f119714t.m109033i();
            this.f119714t.m109036l();
        } else {
            this.f119715u.m109033i();
            this.f119715u.m109036l();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m143191G(nqh0 nqh0Var, q860<iti> q860Var) {
        if (NullChecker.m81303a(nqh0Var.f140068c)) {
            if (NullChecker.m81303a(q860Var) && !vwb.m200296J(q860Var.f153135a)) {
                for (iti itiVar : q860Var.f153135a) {
                    if (itiVar.equals(nqh0Var.f140068c)) {
                        nqh0Var.f140068c = itiVar;
                        ((C19304pp) nqh0Var.f140069d).m170652L(itiVar.f114886c);
                        return;
                    }
                }
            }
            nqh0Var.f140068c = null;
        }
    }

    /* JADX INFO: renamed from: H */
    public void m143192H(List<Picture> list) {
        boolean zM200296J = vwb.m200296J(this.f119709o.f140066a.f153135a);
        nqh0 nqh0Var = this.f119709o;
        if (zM200296J) {
            nqh0Var.f140066a = new q860<>(vwb.m200303Q(list, new w9j() { // from class: l.fu
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C17860ju.m143176a((Picture) obj);
                }
            }), null);
            nqh0 nqh0Var2 = this.f119709o;
            ((C19304pp) nqh0Var2.f140069d).m170652L(nqh0Var2.f140066a);
        } else {
            int size = nqh0Var.f140066a.f153135a.size();
            this.f119709o.f140066a.f153135a.addAll(list);
            this.f119709o.f140069d.notifyItemRangeInserted(size, list.size());
        }
    }

    /* JADX INFO: renamed from: I */
    public void m143193I(q860<iti> q860Var) {
        boolean zM200296J = vwb.m200296J(this.f119709o.f140067b.f153135a);
        nqh0 nqh0Var = this.f119709o;
        if (zM200296J) {
            nqh0Var.f140067b = q860Var;
            m143191G(nqh0Var, q860Var);
        } else {
            nqh0Var.f140067b.f153135a.addAll(q860Var.f153135a);
        }
        if (this.f119711q == this.f119709o && NullChecker.m81303a(this.f119713s)) {
            this.f119713s.m112843w(this.f119709o.f140067b);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m143194J(List<Video> list) {
        boolean zM200296J = vwb.m200296J(this.f119710p.f140066a.f153135a);
        nqh0 nqh0Var = this.f119710p;
        if (zM200296J) {
            nqh0Var.f140066a = new q860<>(vwb.m200303Q(list, new w9j() { // from class: l.hu
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C17860ju.m143180e((Video) obj);
                }
            }), null);
            nqh0 nqh0Var2 = this.f119710p;
            ((C19304pp) nqh0Var2.f140069d).m170652L(nqh0Var2.f140066a);
        } else {
            int size = nqh0Var.f140066a.f153135a.size();
            this.f119710p.f140066a.f153135a.addAll(list);
            this.f119710p.f140069d.notifyItemRangeInserted(size, list.size());
        }
    }

    /* JADX INFO: renamed from: K */
    public void m143195K(q860<iti> q860Var) {
        boolean zM200296J = vwb.m200296J(this.f119710p.f140067b.f153135a);
        nqh0 nqh0Var = this.f119710p;
        if (zM200296J) {
            nqh0Var.f140067b = q860Var;
            m143191G(nqh0Var, q860Var);
        } else {
            nqh0Var.f140067b.f153135a.addAll(q860Var.f153135a);
        }
        if (this.f119711q == this.f119710p && NullChecker.m81303a(this.f119713s)) {
            this.f119713s.m112843w(this.f119710p.f140067b);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m143196L(e30<nqh0> e30Var) {
        this.f119716v = e30Var;
    }

    /* JADX INFO: renamed from: M */
    public void m143197M(iti itiVar) {
        this.f119711q.f140068c = itiVar;
    }

    /* JADX INFO: renamed from: N */
    public void m143198N(boolean z) {
        if (this.f119696b.getTabCount() == 2 && z) {
            this.f119696b.getTabAt(1).select();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m143199O(nqh0 nqh0Var, nqh0 nqh0Var2, nqh0 nqh0Var3) {
        this.f119709o = nqh0Var;
        this.f119710p = nqh0Var2;
        this.f119711q = nqh0Var3;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f119708n;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m143200m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m143200m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C18080ku.m147226b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C16470du c16470du) {
        this.f119706l = c16470du;
    }

    /* JADX INFO: renamed from: p */
    public void m143202p(boolean z, Gender gender) {
        this.f119700f.setVisibility(8);
    }

    /* JADX INFO: renamed from: q */
    public void m143203q() {
        this.f119709o.f140066a.f153135a.clear();
        this.f119709o.f140067b.f153135a.clear();
    }

    /* JADX INFO: renamed from: s */
    public void m143204s(iti itiVar) {
        nqh0 nqh0Var = this.f119711q;
        ((C19304pp) nqh0Var.f140069d).m170652L(itiVar == null ? nqh0Var.f140066a : itiVar.f114886c);
    }

    /* JADX INFO: renamed from: u */
    public void m143205u() {
        this.f119711q.f140070e.scrollToPosition(0);
        this.f119708n.post(new Runnable() { // from class: l.eu
            @Override // java.lang.Runnable
            public final void run() {
                this.f93198a.m143188C();
            }
        });
        this.f119697c.m9283q();
    }

    /* JADX INFO: renamed from: v */
    public void m143206v(q860<iti> q860Var) {
        if (q860Var.f153135a.size() <= 0) {
            xdl0.m208344M(this.f119699e, false);
            return;
        }
        nqh0 nqh0Var = this.f119709o;
        nqh0Var.f140067b = q860Var;
        if (nqh0Var.f140068c == null) {
            nqh0Var.f140068c = q860Var.f153135a.get(0);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m143207w() {
        xdl0.m208344M(this.f119699e, false);
    }

    /* JADX INFO: renamed from: x */
    public void m143208x(q860<Media> q860Var) {
        ((C19304pp) this.f119709o.f140069d).m170652L(q860Var);
        xdl0.m208344M(this.f119699e, false);
    }

    /* JADX INFO: renamed from: y */
    public void m143209y(final int i, final boolean z) {
        this.f119704j.setText(R$string.f16263p0);
        this.f119704j.setOnClickListener(new View.OnClickListener() { // from class: l.gu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104364a.m143190F(i, z, view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m143210z(int i, int i2, boolean z, int i3, boolean z2, Gender gender, boolean z3, boolean z4) {
        if (i > 0) {
            nqh0 nqh0Var = this.f119709o;
            int i4 = AccountMediaPickerAct.f17013C;
            if (i2 != i4) {
                i4 = AccountMediaPickerAct.f17012B;
            }
            nqh0Var.f140069d = new C19304pp(i4, false, this.f119708n, i, z3, nqh0Var, z4, "");
            this.f119709o.f140070e = (RecyclerView) this.f119708n.inflater().inflate(c6c0.f79468H, (ViewGroup) this.f119698d, false);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i3);
            gridLayoutManager.setSmoothScrollbarEnabled(true);
            this.f119709o.f140070e.setLayoutManager(gridLayoutManager);
            this.f119709o.f140070e.addItemDecoration(new gmf0(t100.m186890d(4.0f), i3));
            nqh0 nqh0Var2 = this.f119709o;
            nqh0Var2.f140070e.setAdapter(nqh0Var2.f140069d);
        }
        if (z) {
            this.f119710p.f140069d = new C19304pp(AccountMediaPickerAct.f17013C, true, this.f119708n, i, z3, this.f119709o, z4, "");
            this.f119710p.f140070e = (RecyclerView) this.f119708n.inflater().inflate(c6c0.f79468H, (ViewGroup) this.f119698d, false);
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(), i3);
            gridLayoutManager2.setSmoothScrollbarEnabled(true);
            this.f119710p.f140070e.setLayoutManager(gridLayoutManager2);
            this.f119710p.f140070e.addItemDecoration(new gmf0(t100.m186890d(4.0f), i3));
            nqh0 nqh0Var3 = this.f119710p;
            nqh0Var3.f140070e.setAdapter(nqh0Var3.f140069d);
        }
        this.f119698d.setAdapter(new C20029su(z, i, this.f119709o, this.f119710p, this.f119708n));
        this.f119696b.setupWithViewPager(this.f119698d);
        this.f119698d.m4185d(new a(i, z2, gender));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
