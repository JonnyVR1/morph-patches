package p006l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.widget.Space;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.ExplodeLayout;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.QuickChatPrivilegeAnimView;
import com.p000p1.mobile.putong.core.p004ui.vip.VipIntroGroupPage;
import com.p000p1.mobile.putong.core.p004ui.vip.VipIntroPage;
import com.p000p1.mobile.putong.core.p004ui.vip.VipIntroPage2;
import com.p000p1.mobile.putong.core.p004ui.vip.VipIntroPage3;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l.b1c0;
import l.c4g0;
import l.e30;
import l.eqh0;
import l.jo0;
import l.m6c0;
import l.mkd0;
import l.qt80;
import l.sab0;
import l.t100;
import l.vwb;
import l.w660;
import l.w9j;
import l.xdl0;
import l.yij0;
import l.z4c0;
import rx.c;
import v.VPager;
import v.VPagerCircleIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pt80 implements r0m {

    /* JADX INFO: renamed from: a */
    public Space f19302a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f19303b;

    /* JADX INFO: renamed from: c */
    public ImageView f19304c;

    /* JADX INFO: renamed from: d */
    public VText f19305d;

    /* JADX INFO: renamed from: e */
    public VText f19306e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f19307f;

    /* JADX INFO: renamed from: g */
    public VPager f19308g;

    /* JADX INFO: renamed from: h */
    public VPagerCircleIndicator f19309h;

    /* JADX INFO: renamed from: i */
    public VText f19310i;

    /* JADX INFO: renamed from: j */
    public final Act f19311j;

    /* JADX INFO: renamed from: k */
    public final PurchaseType f19312k;

    /* JADX INFO: renamed from: l */
    public boolean f19313l;

    /* JADX INFO: renamed from: m */
    public C1149b f19314m;

    /* JADX INFO: renamed from: n */
    public c4g0 f19315n;

    /* JADX INFO: renamed from: o */
    public c4g0 f19316o;

    /* JADX INFO: renamed from: p */
    public d f19317p;

    /* JADX INFO: renamed from: q */
    public List<wx80> f19318q;

    /* JADX INFO: renamed from: r */
    public final boolean f19319r;

    /* JADX INFO: renamed from: s */
    public final boolean f19320s;

    /* JADX INFO: renamed from: l.pt80$b */
    public static class C1149b extends w660 {

        /* JADX INFO: renamed from: a */
        public final Act f19324a;

        /* JADX INFO: renamed from: b */
        public final PurchaseType f19325b;

        /* JADX INFO: renamed from: e */
        public boolean f19328e;

        /* JADX INFO: renamed from: c */
        public List<wx80> f19326c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final List<c4g0> f19327d = vwb.f0(new c4g0[0]);

        /* JADX INFO: renamed from: f */
        public int f19329f = -1;

        /* JADX INFO: renamed from: g */
        public boolean f19330g = false;

        public C1149b(Act act, PurchaseType purchaseType, boolean z) {
            this.f19324a = act;
            this.f19325b = purchaseType;
            this.f19328e = z;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return this.f19326c.size();
        }

        public int getItemPosition(Object obj) {
            return -2;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewM21702j = m21702j(viewGroup, this.f19326c.get(i));
            viewGroup.addView(viewM21702j);
            return viewM21702j;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: j */
        public View m21702j(ViewGroup viewGroup, wx80 wx80Var) {
            if (sab0.t(this.f19325b) || (CoreModule.m1854P().m11706a().m5444h5() && (sab0.q(this.f19325b) || sab0.w(this.f19325b)))) {
                View viewInflate = m21703k().inflate(m6c0.r2, viewGroup, false);
                ((VipIntroPage3) viewInflate).m9693b(wx80Var);
                return viewInflate;
            }
            if (sab0.w(this.f19325b) || (this.f19328e && sab0.s(this.f19325b))) {
                View viewInflate2 = m21703k().inflate(m6c0.q2, viewGroup, false);
                ((VipIntroPage2) viewInflate2).m9687b(wx80Var);
                return viewInflate2;
            }
            if (wx80Var.m26851v()) {
                View viewInflate3 = m21703k().inflate(m6c0.O2, viewGroup, false);
                ((VipIntroGroupPage) viewInflate3).m9681b(wx80Var);
                return viewInflate3;
            }
            View viewInflate4 = m21703k().inflate(m6c0.Q2, viewGroup, false);
            ((VipIntroPage) viewInflate4).m9684c(this.f19324a, wx80Var);
            return viewInflate4;
        }

        /* JADX INFO: renamed from: k */
        public LayoutInflater m21703k() {
            return this.f19324a.inflater();
        }

        /* JADX INFO: renamed from: l */
        public void m21704l(List<wx80> list) {
            this.f19326c.clear();
            this.f19326c.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: m */
        public void m21705m(boolean z) {
            this.f19330g = z;
        }

        /* JADX INFO: renamed from: n */
        public void m21706n() {
            Iterator<c4g0> it = this.f19327d.iterator();
            while (it.hasNext()) {
                it.next().unsubscribe();
            }
            this.f19327d.clear();
        }

        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (obj instanceof View) {
                if (CoreModule.m1854P().m11706a().m5444h5() && this.f19330g && i != this.f19329f) {
                    this.f19329f = i;
                    View view = (View) obj;
                    View viewFindViewById = view.findViewById(z4c0.I0);
                    if (viewFindViewById instanceof ExplodeLayout) {
                        ((ExplodeLayout) viewFindViewById).m7563l(true);
                    }
                    Object objFindViewById = view.findViewById(z4c0.D0);
                    if (objFindViewById instanceof QuickChatPrivilegeAnimView) {
                        ((QuickChatPrivilegeAnimView) objFindViewById).m7644t0();
                    }
                } else {
                    Object tag = ((View) obj).getTag(z4c0.J0);
                    if (tag instanceof ExplodeLayout) {
                        ((ExplodeLayout) tag).m7562k();
                    }
                }
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m21690j(boolean z) {
        int iD = t100.d(8.0f);
        if (!this.f19313l && CoreModule.m1854P().m11706a().m5444h5() && (sab0.w(this.f19312k) || sab0.q(this.f19312k))) {
            xdl0.M(this.f19302a, false);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f19308g.getLayoutParams();
            layoutParams.height += t100.j;
            this.f19308g.setLayoutParams(layoutParams);
        }
        if (z || this.f19320s) {
            float f = this.f19319r ? 0.7f : 0.9f;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f19302a.getLayoutParams();
            layoutParams2.height = (int) (layoutParams2.height * f);
            this.f19302a.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f19308g.getLayoutParams();
            layoutParams3.height = (int) ((this.f19319r ? 19.0f : 23.0f) * iD);
            this.f19308g.setLayoutParams(layoutParams3);
            xdl0.u0(this.f19308g, f);
            this.f19309h.setRadius(iD / 4);
        }
    }

    @Override // p006l.r0m
    /* JADX INFO: renamed from: a */
    public View mo19384a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f19311j.inflater().inflate(m6c0.V2, viewGroup, false);
        m21691i(viewInflate);
        m21697p();
        m21690j(z);
        m21693l();
        C1149b c1149bM21694m = m21694m(this.f19311j, this.f19312k);
        this.f19314m = c1149bM21694m;
        this.f19308g.setAdapter(c1149bM21694m);
        VPagerCircleIndicator vPagerCircleIndicator = this.f19309h;
        VPager vPager = this.f19308g;
        vPagerCircleIndicator.c(vPager, vPager.getCurrentItem());
        this.f19309h.invalidate();
        return viewInflate;
    }

    @Override // p006l.r0m
    /* JADX INFO: renamed from: b */
    public void mo19385b(d dVar) {
        this.f19317p = dVar;
    }

    @Override // p006l.r0m
    /* JADX INFO: renamed from: c */
    public void mo19386c(final List<wx80> list) {
        this.f19318q = list;
        int size = list.size();
        xdl0.M(this.f19309h, size > 1);
        if (size > 1 && !m21700s()) {
            this.f19315n = c.interval(5000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.lt80
                public final void call(Object obj) {
                    this.f16638a.m21699r(list, (Long) obj);
                }
            }));
        }
        this.f19308g.d(new C1148a());
        wx80 wx80Var = (wx80) vwb.r(list, new w9j() { // from class: l.mt80
            public final Object call(Object obj) {
                return Boolean.valueOf(((wx80) obj).m26851v());
            }
        });
        boolean zA = NullChecker.a(wx80Var);
        VText vText = this.f19306e;
        if (zA) {
            xdl0.M(vText, true);
            this.f19305d.setTypeface(eqh0.c(3));
            this.f19306e.setText(String.format(Locale.getDefault(), "（%d项特权）", Integer.valueOf(vwb.f(list, new w9j() { // from class: l.nt80
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a(((wx80) obj).m26841l()));
                }
            }) - 1)));
            if (wx80Var.m26835g() != 0) {
                xdl0.M(this.f19304c, true);
                this.f19304c.setImageResource(wx80Var.m26835g());
            }
        } else {
            xdl0.M(vText, false);
        }
        this.f19314m.m21704l(list);
    }

    /* JADX INFO: renamed from: i */
    public final void m21691i(View view) {
        qt80.a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m21692k() {
        if (m21700s()) {
            this.f19314m.m21705m(true);
            this.f19308g.setCurrentItem(0);
            if (this.f19308g.getChildAt(0) instanceof VipIntroPage3) {
                ((VipIntroPage3) this.f19308g.getChildAt(0)).m9697f();
            }
            if (this.f19315n == null) {
                this.f19315n = c.interval(5000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.ot80
                    public final void call(Object obj) {
                        this.f18364a.m21698q((Long) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m21693l() {
        if (sab0.a(this.f19312k)) {
            this.f19309h.setFillColor(this.f19311j.color(b1c0.n0));
        }
    }

    /* JADX INFO: renamed from: m */
    public C1149b m21694m(Act act, PurchaseType purchaseType) {
        return new C1149b(act, purchaseType, this.f19313l);
    }

    /* JADX INFO: renamed from: n */
    public void m21695n() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f19308g.getLayoutParams();
        layoutParams.bottomMargin = -t100.d(15.0f);
        this.f19308g.setLayoutParams(layoutParams);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public CharSequence m21696o() {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public void m21697p() {
        float f;
        CharSequence charSequenceM21696o = m21696o();
        if (TextUtils.isEmpty(charSequenceM21696o)) {
            this.f19303b.setVisibility(8);
            return;
        }
        VText vText = this.f19305d;
        if (this.f19319r) {
            f = 14.0f;
        } else {
            f = this.f19320s ? 16 : 18;
        }
        vText.setTextSize(f);
        this.f19305d.setText(charSequenceM21696o);
        this.f19303b.setVisibility(0);
        if (this.f19319r || this.f19320s) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f19303b.getLayoutParams();
            layoutParams.topMargin = (int) (layoutParams.topMargin * (this.f19319r ? 0.7f : 0.9f));
            this.f19303b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m21698q(Long l2) {
        int currentItem = this.f19308g.getCurrentItem();
        int size = this.f19318q.size() - 1;
        VPager vPager = this.f19308g;
        if (currentItem == size) {
            vPager.T(0, true);
        } else {
            vPager.T(vPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m21699r(List list, Long l2) {
        int currentItem = this.f19308g.getCurrentItem();
        int size = list.size() - 1;
        VPager vPager = this.f19308g;
        if (currentItem == size) {
            vPager.T(0, true);
        } else {
            vPager.T(vPager.getCurrentItem() + 1, true);
        }
    }

    @Override // p006l.r0m
    public void release() {
        if (NullChecker.a(this.f19315n)) {
            this.f19315n.unsubscribe();
            this.f19315n = null;
        }
        if (NullChecker.a(this.f19314m)) {
            this.f19314m.m21706n();
        }
        yij0.U(this.f19316o);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m21700s() {
        if (CoreModule.m1854P().m11706a().m5444h5()) {
            return sab0.w(this.f19312k) || sab0.q(this.f19312k);
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public void m21701t() {
        this.f19314m.m21705m(false);
        if (NullChecker.a(this.f19315n)) {
            this.f19315n.unsubscribe();
            this.f19315n = null;
        }
    }

    /* JADX INFO: renamed from: l.pt80$a */
    public class C1148a implements ViewPager.j {

        /* JADX INFO: renamed from: a */
        public int f19321a;

        /* JADX INFO: renamed from: b */
        public boolean f19322b;

        public C1148a() {
        }

        public void onPageScrollStateChanged(int i) {
            if (this.f19321a == 1 && i == 2) {
                this.f19322b = true;
            } else if (i == 0) {
                this.f19322b = false;
            }
            this.f19321a = i;
        }

        public void onPageSelected(int i) {
            if (this.f19322b && NullChecker.a(pt80.this.f19315n)) {
                pt80.this.f19315n.unsubscribe();
                pt80.this.f19315n = null;
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
