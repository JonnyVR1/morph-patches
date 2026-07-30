package p153l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.widget.Space;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.ExplodeLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.SeeLetterBlockPage;
import com.p051p1.mobile.putong.core.p058ui.view.VPagerNewCircleIndicator;
import com.p051p1.mobile.putong.core.p058ui.vip.GPVipIntroPage;
import com.p051p1.mobile.putong.core.p058ui.vip.VipIntroPage;
import com.p051p1.mobile.putong.core.p058ui.vip.VipIntroPageBlock;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.AutoVDraweeView;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ihj implements l3m {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f114951a;

    /* JADX INFO: renamed from: b */
    public Space f114952b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f114953c;

    /* JADX INFO: renamed from: d */
    public ImageView f114954d;

    /* JADX INFO: renamed from: e */
    public VText f114955e;

    /* JADX INFO: renamed from: f */
    public VText f114956f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f114957g;

    /* JADX INFO: renamed from: h */
    public VPager f114958h;

    /* JADX INFO: renamed from: i */
    public VPagerCircleIndicator f114959i;

    /* JADX INFO: renamed from: j */
    public VPagerNewCircleIndicator f114960j;

    /* JADX INFO: renamed from: k */
    public final Act f114961k;

    /* JADX INFO: renamed from: l */
    public final PurchaseType f114962l;

    /* JADX INFO: renamed from: m */
    public final String f114963m;

    /* JADX INFO: renamed from: n */
    public C8928d f114964n;

    /* JADX INFO: renamed from: o */
    public C17719b f114965o;

    /* JADX INFO: renamed from: p */
    public kcg0 f114966p;

    /* JADX INFO: renamed from: q */
    public boolean f114967q;

    /* JADX INFO: renamed from: r */
    public Privilege f114968r;

    /* JADX INFO: renamed from: s */
    public View f114969s;

    /* JADX INFO: renamed from: l.ihj$b */
    public static class C17719b extends lb2 {

        /* JADX INFO: renamed from: e */
        public final Act f114973e;

        /* JADX INFO: renamed from: f */
        public final PurchaseType f114974f;

        /* JADX INFO: renamed from: g */
        public final String f114975g;

        /* JADX INFO: renamed from: h */
        public List<a690> f114976h = new ArrayList();

        /* JADX INFO: renamed from: i */
        public boolean f114977i;

        public C17719b(Act act, PurchaseType purchaseType, String str, boolean z) {
            this.f114973e = act;
            this.f114974f = purchaseType;
            this.f114975g = str;
            this.f114977i = z;
        }

        /* JADX INFO: renamed from: q */
        public static /* synthetic */ void m140002q(Throwable th) {
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ void m140003r(Throwable th) {
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f114976h.size();
        }

        @Override // p153l.cf60
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            final View viewInflate;
            a690 a690Var = this.f114976h.get(i);
            if (!CoreModule.m30933P().m143405a().mo180296B() || !wib0.m206575s(this.f114974f)) {
                PurchaseType purchaseType = this.f114974f;
                PurchaseType purchaseType2 = PurchaseType.TYPE_GET_LIKERS;
                if (purchaseType == purchaseType2 && m140006u(a690Var)) {
                    if (C4880a0.m32390j().f20268e.get().booleanValue() && NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20136a0.m222761e()) && !CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.isEmpty()) {
                        viewInflate = new fje0(this.f114973e, a690Var, null).m125794a(viewGroup);
                    } else {
                        viewInflate = new hge0(this.f114973e, a690Var).m134925c(viewGroup);
                        hge0.m134923h(viewInflate);
                        this.f114973e.duringCreated(CoreModule.f18264c.f20429u0.m31448i7()).subscribe(psd0.m173597H(new y20() { // from class: l.lhj
                            @Override // p153l.y20
                            public final void call(Object obj) {
                                hge0.m134923h(viewInflate);
                            }
                        }, new y20() { // from class: l.mhj
                            @Override // p153l.y20
                            public final void call(Object obj) {
                                ihj.C17719b.m140002q((Throwable) obj);
                            }
                        }));
                    }
                } else if (!gta.m132210e().m132214d().mo34662B8().get().isEmpty() && this.f114974f == purchaseType2 && i == 0) {
                    viewInflate = new fje0(this.f114973e, a690Var, null).m125794a(viewGroup);
                } else {
                    Privilege privilegeM96306l = this.f114976h.get(i).m96306l();
                    Privilege privilege = Privilege.vip_message_block_gp;
                    Act act = this.f114973e;
                    if (privilegeM96306l == privilege) {
                        viewInflate = act.inflater().inflate(rec0.f162480P2, viewGroup, false);
                        ((VipIntroPageBlock) viewInflate).m57449c(this.f114973e, a690Var, this.f114974f);
                    } else {
                        viewInflate = act.inflater().inflate(rec0.f162561i, viewGroup, false);
                        ((GPVipIntroPage) viewInflate).m57413d(this.f114973e, a690Var, this.f114977i, getCount(), i, this.f114974f);
                    }
                }
            } else if (a690Var.m96306l() == Privilege.see_letter_gp) {
                User userMe_ = CoreModule.m30930K().me_();
                if (CoreModule.m30933P().m143405a().mo180335I0() && NullChecker.m82486a(userMe_) && !userMe_.isFemale()) {
                    viewInflate = this.f114973e.inflater().inflate(rec0.f162519Z1, viewGroup, false);
                    ((SeeLetterBlockPage) viewInflate).m55500c(this.f114973e, a690Var);
                } else {
                    View viewInflate2 = this.f114973e.inflater().inflate(rec0.f162484Q2, viewGroup, false);
                    ((VipIntroPage) viewInflate2).m57434d(this.f114973e, a690Var, this.f114977i, getCount(), i);
                    viewInflate = viewInflate2;
                }
            } else if (a690Var.m96306l() != Privilege.see_chat_request_gp || gta.m132210e().m132214d().mo34662B8().get().isEmpty()) {
                viewInflate = new hge0(this.f114973e, a690Var).m134925c(viewGroup);
                hge0.m134923h(viewInflate);
                this.f114973e.duringCreated(CoreModule.f18264c.f20429u0.m31448i7()).subscribe(psd0.m173597H(new y20() { // from class: l.jhj
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        hge0.m134923h(viewInflate);
                    }
                }, new y20() { // from class: l.khj
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ihj.C17719b.m140003r((Throwable) obj);
                    }
                }));
            } else {
                viewInflate = new fje0(this.f114973e, a690Var, null).m125794a(viewGroup);
            }
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        @Override // p153l.cf60
        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (obj instanceof View) {
                Object tag = ((View) obj).getTag(fdc0.f98353J0);
                if (tag instanceof ExplodeLayout) {
                    ((ExplodeLayout) tag).m55410k();
                }
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }

        /* JADX INFO: renamed from: u */
        public boolean m140006u(a690 a690Var) {
            return this.f114974f == PurchaseType.TYPE_GET_LIKERS && a690Var.m96306l() == Privilege.see_who_likes_me && a690Var.m96304j() != jbc0.f119803vc;
        }

        /* JADX INFO: renamed from: v */
        public void m140007v(List<a690> list) {
            this.f114976h.clear();
            this.f114976h.addAll(list);
            notifyDataSetChanged();
        }
    }

    public ihj(Act act, PurchaseType purchaseType, String str, boolean z, Privilege privilege) {
        this.f114961k = act;
        this.f114962l = purchaseType;
        this.f114963m = str;
        this.f114967q = z;
        this.f114968r = privilege;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    private CharSequence m139994h() {
        if (wib0.m206579w(this.f114962l)) {
            return this.f114961k.string(R$string.f28209Y6);
        }
        if (this.f114962l == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return this.f114961k.string(R$string.f28399o6);
        }
        if (CoreModule.m30933P().m143405a().mo180296B() && wib0.m206575s(this.f114962l)) {
            return this.f114961k.string(R$string.f28408p3);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private void m139995k() {
        CharSequence charSequenceM139994h = m139994h();
        if (TextUtils.isEmpty(charSequenceM139994h)) {
            this.f114953c.setVisibility(8);
            return;
        }
        this.f114955e.setTypeface(Typeface.create("sans-serif", 1));
        PurchaseType purchaseType = this.f114962l;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            this.f114955e.setTextSize(21.0f);
            this.f114955e.setTextColor(Color.parseColor("#fde5ac"));
            this.f114955e.setText(charSequenceM139994h);
            this.f114953c.setVisibility(0);
            this.f114954d.setImageResource(jbc0.f119779u2);
            this.f114954d.setVisibility(0);
            this.f114956f.setTextColor(Color.parseColor("#80edd7a3"));
        } else if (wib0.m206579w(purchaseType)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f114954d.getLayoutParams();
            layoutParams.height = qa00.m175859d(18.0f);
            layoutParams.width = qa00.m175859d(44.0f);
            layoutParams.rightMargin = 0;
            this.f114954d.setLayoutParams(layoutParams);
            this.f114954d.setImageResource(jbc0.f119460X2);
            this.f114954d.setVisibility(0);
            this.f114955e.setVisibility(8);
        } else if (wib0.m206575s(this.f114962l)) {
            this.f114954d.setVisibility(8);
        }
        bnl0.m105525M0(this.f114956f, true);
        if (CoreModule.m30933P().m143405a().mo180296B() && wib0.m206575s(this.f114962l)) {
            ArrayList<Privilege> privilegeData = this.f114962l.getPrivilegeData(null);
            int size = privilegeData.size();
            if (privilegeData.contains(Privilege.see_chat_request_gp)) {
                size--;
            }
            this.f114956f.setText(String.format(this.f114961k.string(R$string.f28478v6), String.valueOf(size)));
        } else {
            boolean zMo37026yi = CoreModule.m30933P().m143409f().mo37026yi(CoreModule.f18264c.f20381e0.m116600p9());
            VText vText = this.f114956f;
            if (zMo37026yi) {
                vText.setText(String.format(this.f114961k.string(R$string.f28478v6), Integer.valueOf(this.f114962l.getPrivilegeDataForGP(null).size())));
            } else {
                vText.setText(String.format(this.f114961k.string(R$string.f28478v6), Integer.valueOf(this.f114962l.getPrivilegeDataForGP(null).size())));
            }
        }
        this.f114955e.setText(charSequenceM139994h);
        this.f114953c.setVisibility(0);
    }

    @Override // p153l.l3m
    /* JADX INFO: renamed from: a */
    public View mo116073a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f114961k.inflater().inflate(rec0.f162452I2, viewGroup, false);
        m139996f(viewInflate);
        bnl0.m105524M(this.f114956f, false);
        m139997g(z);
        m139995k();
        m140000l();
        this.f114969s = viewInflate;
        return viewInflate;
    }

    @Override // p153l.l3m
    /* JADX INFO: renamed from: b */
    public void mo116074b(C8928d c8928d) {
        this.f114964n = c8928d;
    }

    @Override // p153l.l3m
    /* JADX INFO: renamed from: c */
    public void mo116075c(final List<a690> list) {
        if (CoreModule.m30933P().m143405a().mo34445Xi() && this.f114962l == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && this.f114967q) {
            this.f114958h.setBackground(null);
            this.f114951a.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IjVGUFFFU08yUzdYUFdNVVhITU5HR1paNjJHVVhTVzExIiwidyI6MTA3NywiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6ODgxMzQ5MTQ1Nzc5OX0.png");
            bnl0.m105525M0(this.f114951a, true);
        }
        this.f114958h.setBackground(null);
        if (CoreModule.m30933P().m143405a().mo180296B() && this.f114962l == PurchaseType.TYPE_GET_LIKERS && this.f114967q) {
            this.f114953c.setGravity(16);
            this.f114958h.setBackground(null);
            this.f114951a.setImageResource(jbc0.f119744r9);
            bnl0.m105525M0(this.f114951a, true);
            this.f114955e.setTextColor(Color.parseColor("#ffffff"));
            this.f114956f.setTextColor(Color.parseColor("#ffffff"));
        }
        if (NullChecker.m82486a(this.f114966p)) {
            this.f114966p.unsubscribe();
        }
        int size = list.size();
        if (size > 1) {
            this.f114966p = C22421c.interval(5L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.hhj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f109898a.m140001m(list, (Long) obj);
                }
            }));
            bnl0.m105524M(this.f114960j, size > 5);
            bnl0.m105524M(this.f114959i, size <= 5);
        } else {
            this.f114966p = null;
            bnl0.m105524M(this.f114960j, false);
            bnl0.m105524M(this.f114959i, false);
        }
        this.f114958h.m4187d(new C17718a());
        this.f114965o.m140007v(list);
        if (list.size() <= 0 || this.f114968r != Privilege.intl_no_ad) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).m96306l() == this.f114968r) {
                this.f114958h.m4178T(i, true);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m139996f(View view) {
        nhj.m163108a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m139997g(boolean z) {
        int iM175859d = qa00.m175859d(8.0f);
        if (PurchaseType.TYPE_GET_LIKERS != this.f114962l) {
            if (z) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f114958h.getLayoutParams();
                layoutParams.height = iM175859d * 18;
                this.f114958h.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f114952b.getLayoutParams();
        layoutParams2.height = bnl0.m105588w0() <= 1280 ? 0 : (int) (((double) iM175859d) * 1.5d);
        this.f114952b.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f114958h.getLayoutParams();
        layoutParams3.height = (z ? 28 : 33) * iM175859d;
        this.f114958h.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: i */
    public void m139998i() {
        bnl0.m105524M(this.f114953c, false);
        bnl0.m105524M(this.f114956f, false);
    }

    /* JADX INFO: renamed from: j */
    public void m139999j() {
        bnl0.m105524M(this.f114952b, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m140000l() {
        C17719b c17719b = new C17719b(this.f114961k, this.f114962l, this.f114963m, this.f114967q);
        this.f114965o = c17719b;
        this.f114958h.setAdapter(c17719b);
        this.f114960j.setViewPager(this.f114958h);
        this.f114959i.setViewPager(this.f114958h);
        PurchaseType purchaseType = this.f114962l;
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        VPagerNewCircleIndicator vPagerNewCircleIndicator = this.f114960j;
        if (purchaseType == purchaseType2) {
            vPagerNewCircleIndicator.setNormalColor(654302882);
            this.f114960j.setSelectedColor(-8542);
            this.f114959i.setPageColor(654302882);
            this.f114959i.setFillColor(-8542);
            this.f114960j.setSelectedColor(-8542);
        } else {
            vPagerNewCircleIndicator.setNormalColor(637534208);
            this.f114960j.setSelectedColor(-12472);
            this.f114959i.setPageColor(637534208);
            this.f114959i.setFillColor(-12472);
        }
        this.f114960j.invalidate();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m140001m(List list, Long l2) {
        int currentItem = this.f114958h.getCurrentItem();
        int size = list.size() - 1;
        VPager vPager = this.f114958h;
        if (currentItem == size) {
            vPager.m4178T(0, true);
        } else {
            vPager.m4178T(vPager.getCurrentItem() + 1, true);
        }
    }

    @Override // p153l.l3m
    public void release() {
        if (NullChecker.m82486a(this.f114966p)) {
            this.f114966p.unsubscribe();
            this.f114966p = null;
        }
    }

    public ihj(Act act, PurchaseType purchaseType, String str, boolean z) {
        this.f114961k = act;
        this.f114962l = purchaseType;
        this.f114963m = str;
        this.f114967q = z;
    }

    /* JADX INFO: renamed from: l.ihj$a */
    public class C17718a implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        public int f114970a;

        /* JADX INFO: renamed from: b */
        public boolean f114971b;

        public C17718a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            if (this.f114970a == 1 && i == 2) {
                this.f114971b = true;
            } else if (i == 0) {
                this.f114971b = false;
            }
            this.f114970a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (this.f114971b && NullChecker.m82486a(ihj.this.f114966p)) {
                ihj.this.f114966p.unsubscribe();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
