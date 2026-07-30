package p153l;

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
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.ExplodeLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.QuickChatPrivilegeAnimView;
import com.p051p1.mobile.putong.core.p058ui.vip.VipIntroGroupPage;
import com.p051p1.mobile.putong.core.p058ui.vip.VipIntroPage;
import com.p051p1.mobile.putong.core.p058ui.vip.VipIntroPage2;
import com.p051p1.mobile.putong.core.p058ui.vip.VipIntroPage3;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class t190 implements l3m {

    /* JADX INFO: renamed from: a */
    public Space f171612a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f171613b;

    /* JADX INFO: renamed from: c */
    public ImageView f171614c;

    /* JADX INFO: renamed from: d */
    public VText f171615d;

    /* JADX INFO: renamed from: e */
    public VText f171616e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f171617f;

    /* JADX INFO: renamed from: g */
    public VPager f171618g;

    /* JADX INFO: renamed from: h */
    public VPagerCircleIndicator f171619h;

    /* JADX INFO: renamed from: i */
    public VText f171620i;

    /* JADX INFO: renamed from: j */
    public final Act f171621j;

    /* JADX INFO: renamed from: k */
    public final PurchaseType f171622k;

    /* JADX INFO: renamed from: l */
    public boolean f171623l;

    /* JADX INFO: renamed from: m */
    public C20208b f171624m;

    /* JADX INFO: renamed from: n */
    public kcg0 f171625n;

    /* JADX INFO: renamed from: o */
    public kcg0 f171626o;

    /* JADX INFO: renamed from: p */
    public C8928d f171627p;

    /* JADX INFO: renamed from: q */
    public List<a690> f171628q;

    /* JADX INFO: renamed from: r */
    public final boolean f171629r;

    /* JADX INFO: renamed from: s */
    public final boolean f171630s;

    /* JADX INFO: renamed from: l.t190$b */
    public static class C20208b extends cf60 {

        /* JADX INFO: renamed from: a */
        public final Act f171634a;

        /* JADX INFO: renamed from: b */
        public final PurchaseType f171635b;

        /* JADX INFO: renamed from: e */
        public boolean f171638e;

        /* JADX INFO: renamed from: c */
        public List<a690> f171636c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final List<kcg0> f171637d = jyb.m147507f0(new kcg0[0]);

        /* JADX INFO: renamed from: f */
        public int f171639f = -1;

        /* JADX INFO: renamed from: g */
        public boolean f171640g = false;

        public C20208b(Act act, PurchaseType purchaseType, boolean z) {
            this.f171634a = act;
            this.f171635b = purchaseType;
            this.f171638e = z;
        }

        @Override // p153l.cf60
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f171636c.size();
        }

        @Override // p153l.cf60
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // p153l.cf60
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewM188890j = m188890j(viewGroup, this.f171636c.get(i));
            viewGroup.addView(viewM188890j);
            return viewM188890j;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: j */
        public View m188890j(ViewGroup viewGroup, a690 a690Var) {
            if (wib0.m206576t(this.f171635b) || (CoreModule.m30933P().m143405a().mo34510h5() && (wib0.m206573q(this.f171635b) || wib0.m206579w(this.f171635b)))) {
                View viewInflate = m188891k().inflate(rec0.f162600r2, viewGroup, false);
                ((VipIntroPage3) viewInflate).m57442b(a690Var);
                return viewInflate;
            }
            if (wib0.m206579w(this.f171635b) || (this.f171638e && wib0.m206575s(this.f171635b))) {
                View viewInflate2 = m188891k().inflate(rec0.f162596q2, viewGroup, false);
                ((VipIntroPage2) viewInflate2).m57436b(a690Var);
                return viewInflate2;
            }
            if (a690Var.m96316v()) {
                View viewInflate3 = m188891k().inflate(rec0.f162476O2, viewGroup, false);
                ((VipIntroGroupPage) viewInflate3).m57430b(a690Var);
                return viewInflate3;
            }
            View viewInflate4 = m188891k().inflate(rec0.f162484Q2, viewGroup, false);
            ((VipIntroPage) viewInflate4).m57433c(this.f171634a, a690Var);
            return viewInflate4;
        }

        /* JADX INFO: renamed from: k */
        public LayoutInflater m188891k() {
            return this.f171634a.inflater();
        }

        /* JADX INFO: renamed from: l */
        public void m188892l(List<a690> list) {
            this.f171636c.clear();
            this.f171636c.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: m */
        public void m188893m(boolean z) {
            this.f171640g = z;
        }

        /* JADX INFO: renamed from: n */
        public void m188894n() {
            Iterator<kcg0> it = this.f171637d.iterator();
            while (it.hasNext()) {
                it.next().unsubscribe();
            }
            this.f171637d.clear();
        }

        @Override // p153l.cf60
        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (obj instanceof View) {
                if (CoreModule.m30933P().m143405a().mo34510h5() && this.f171640g && i != this.f171639f) {
                    this.f171639f = i;
                    View view = (View) obj;
                    View viewFindViewById = view.findViewById(fdc0.f98351I0);
                    if (viewFindViewById instanceof ExplodeLayout) {
                        ((ExplodeLayout) viewFindViewById).m55411l(true);
                    }
                    View viewFindViewById2 = view.findViewById(fdc0.f98341D0);
                    if (viewFindViewById2 instanceof QuickChatPrivilegeAnimView) {
                        ((QuickChatPrivilegeAnimView) viewFindViewById2).m55492t0();
                    }
                } else {
                    Object tag = ((View) obj).getTag(fdc0.f98353J0);
                    if (tag instanceof ExplodeLayout) {
                        ((ExplodeLayout) tag).m55410k();
                    }
                }
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m188878j(boolean z) {
        int iM175859d = qa00.m175859d(8.0f);
        if (!this.f171623l && CoreModule.m30933P().m143405a().mo34510h5() && (wib0.m206579w(this.f171622k) || wib0.m206573q(this.f171622k))) {
            bnl0.m105524M(this.f171612a, false);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f171618g.getLayoutParams();
            layoutParams.height += qa00.f156323j;
            this.f171618g.setLayoutParams(layoutParams);
        }
        if (z || this.f171630s) {
            float f = this.f171629r ? 0.7f : 0.9f;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f171612a.getLayoutParams();
            layoutParams2.height = (int) (layoutParams2.height * f);
            this.f171612a.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f171618g.getLayoutParams();
            layoutParams3.height = (int) ((this.f171629r ? 19.0f : 23.0f) * iM175859d);
            this.f171618g.setLayoutParams(layoutParams3);
            bnl0.m105584u0(this.f171618g, f);
            this.f171619h.setRadius(iM175859d / 4);
        }
    }

    @Override // p153l.l3m
    /* JADX INFO: renamed from: a */
    public View mo116073a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f171621j.inflater().inflate(rec0.f162504V2, viewGroup, false);
        m188879i(viewInflate);
        m188885p();
        m188878j(z);
        m188881l();
        C20208b c20208bM188882m = m188882m(this.f171621j, this.f171622k);
        this.f171624m = c20208bM188882m;
        this.f171618g.setAdapter(c20208bM188882m);
        VPagerCircleIndicator vPagerCircleIndicator = this.f171619h;
        VPager vPager = this.f171618g;
        vPagerCircleIndicator.m224389c(vPager, vPager.getCurrentItem());
        this.f171619h.invalidate();
        return viewInflate;
    }

    @Override // p153l.l3m
    /* JADX INFO: renamed from: b */
    public void mo116074b(C8928d c8928d) {
        this.f171627p = c8928d;
    }

    @Override // p153l.l3m
    /* JADX INFO: renamed from: c */
    public void mo116075c(final List<a690> list) {
        this.f171628q = list;
        int size = list.size();
        bnl0.m105524M(this.f171619h, size > 1);
        if (size > 1 && !m188888s()) {
            this.f171625n = C22421c.interval(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.p190
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f150135a.m188887r(list, (Long) obj);
                }
            }));
        }
        this.f171618g.m4187d(new C20207a());
        a690 a690Var = (a690) jyb.m147529r(list, new qcj() { // from class: l.q190
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((a690) obj).m96316v());
            }
        });
        boolean zM82486a = NullChecker.m82486a(a690Var);
        VText vText = this.f171616e;
        if (zM82486a) {
            bnl0.m105524M(vText, true);
            this.f171615d.setTypeface(lyh0.m156283c(3));
            this.f171616e.setText(String.format(Locale.getDefault(), "（%d项特权）", Integer.valueOf(jyb.m147506f(list, new qcj() { // from class: l.r190
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a(((a690) obj).m96306l()));
                }
            }) - 1)));
            if (a690Var.m96300g() != 0) {
                bnl0.m105524M(this.f171614c, true);
                this.f171614c.setImageResource(a690Var.m96300g());
            }
        } else {
            bnl0.m105524M(vText, false);
        }
        this.f171624m.m188892l(list);
    }

    /* JADX INFO: renamed from: i */
    public final void m188879i(View view) {
        u190.m193948a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m188880k() {
        if (m188888s()) {
            this.f171624m.m188893m(true);
            this.f171618g.setCurrentItem(0);
            if (this.f171618g.getChildAt(0) instanceof VipIntroPage3) {
                ((VipIntroPage3) this.f171618g.getChildAt(0)).m57446f();
            }
            if (this.f171625n == null) {
                this.f171625n = C22421c.interval(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.s190
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f165763a.m188886q((Long) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m188881l() {
        if (wib0.m206557a(this.f171622k)) {
            this.f171619h.setFillColor(this.f171621j.color(h9c0.f108384n0));
        }
    }

    /* JADX INFO: renamed from: m */
    public C20208b m188882m(Act act, PurchaseType purchaseType) {
        return new C20208b(act, purchaseType, this.f171623l);
    }

    /* JADX INFO: renamed from: n */
    public void m188883n() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f171618g.getLayoutParams();
        layoutParams.bottomMargin = -qa00.m175859d(15.0f);
        this.f171618g.setLayoutParams(layoutParams);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public CharSequence m188884o() {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public void m188885p() {
        float f;
        CharSequence charSequenceM188884o = m188884o();
        if (TextUtils.isEmpty(charSequenceM188884o)) {
            this.f171613b.setVisibility(8);
            return;
        }
        VText vText = this.f171615d;
        if (this.f171629r) {
            f = 14.0f;
        } else {
            f = this.f171630s ? 16 : 18;
        }
        vText.setTextSize(f);
        this.f171615d.setText(charSequenceM188884o);
        this.f171613b.setVisibility(0);
        if (this.f171629r || this.f171630s) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f171613b.getLayoutParams();
            layoutParams.topMargin = (int) (layoutParams.topMargin * (this.f171629r ? 0.7f : 0.9f));
            this.f171613b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m188886q(Long l2) {
        int currentItem = this.f171618g.getCurrentItem();
        int size = this.f171628q.size() - 1;
        VPager vPager = this.f171618g;
        if (currentItem == size) {
            vPager.m4178T(0, true);
        } else {
            vPager.m4178T(vPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m188887r(List list, Long l2) {
        int currentItem = this.f171618g.getCurrentItem();
        int size = list.size() - 1;
        VPager vPager = this.f171618g;
        if (currentItem == size) {
            vPager.m4178T(0, true);
        } else {
            vPager.m4178T(vPager.getCurrentItem() + 1, true);
        }
    }

    @Override // p153l.l3m
    public void release() {
        if (NullChecker.m82486a(this.f171625n)) {
            this.f171625n.unsubscribe();
            this.f171625n = null;
        }
        if (NullChecker.m82486a(this.f171624m)) {
            this.f171624m.m188894n();
        }
        bsj0.m106263U(this.f171626o);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m188888s() {
        if (CoreModule.m30933P().m143405a().mo34510h5()) {
            return wib0.m206579w(this.f171622k) || wib0.m206573q(this.f171622k);
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public void m188889t() {
        this.f171624m.m188893m(false);
        if (NullChecker.m82486a(this.f171625n)) {
            this.f171625n.unsubscribe();
            this.f171625n = null;
        }
    }

    /* JADX INFO: renamed from: l.t190$a */
    public class C20207a implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        public int f171631a;

        /* JADX INFO: renamed from: b */
        public boolean f171632b;

        public C20207a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            if (this.f171631a == 1 && i == 2) {
                this.f171632b = true;
            } else if (i == 0) {
                this.f171632b = false;
            }
            this.f171631a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (this.f171632b && NullChecker.m82486a(t190.this.f171625n)) {
                t190.this.f171625n.unsubscribe();
                t190.this.f171625n = null;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
