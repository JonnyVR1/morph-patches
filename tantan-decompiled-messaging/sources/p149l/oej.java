package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.ExplodeLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.SeeLetterBlockPage;
import com.p046p1.mobile.putong.core.p053ui.view.VPagerNewCircleIndicator;
import com.p046p1.mobile.putong.core.p053ui.vip.GPVipIntroPage;
import com.p046p1.mobile.putong.core.p053ui.vip.VipIntroPage;
import com.p046p1.mobile.putong.core.p053ui.vip.VipIntroPageBlock;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.AutoVDraweeView;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class oej implements r0m {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f143318a;

    /* JADX INFO: renamed from: b */
    public Space f143319b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f143320c;

    /* JADX INFO: renamed from: d */
    public ImageView f143321d;

    /* JADX INFO: renamed from: e */
    public VText f143322e;

    /* JADX INFO: renamed from: f */
    public VText f143323f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f143324g;

    /* JADX INFO: renamed from: h */
    public VPager f143325h;

    /* JADX INFO: renamed from: i */
    public VPagerCircleIndicator f143326i;

    /* JADX INFO: renamed from: j */
    public VPagerNewCircleIndicator f143327j;

    /* JADX INFO: renamed from: k */
    public final Act f143328k;

    /* JADX INFO: renamed from: l */
    public final PurchaseType f143329l;

    /* JADX INFO: renamed from: m */
    public final String f143330m;

    /* JADX INFO: renamed from: n */
    public C8765d f143331n;

    /* JADX INFO: renamed from: o */
    public C18908b f143332o;

    /* JADX INFO: renamed from: p */
    public c4g0 f143333p;

    /* JADX INFO: renamed from: q */
    public boolean f143334q;

    /* JADX INFO: renamed from: r */
    public Privilege f143335r;

    /* JADX INFO: renamed from: s */
    public View f143336s;

    /* JADX INFO: renamed from: l.oej$b */
    public static class C18908b extends eb2 {

        /* JADX INFO: renamed from: e */
        public final Act f143340e;

        /* JADX INFO: renamed from: f */
        public final PurchaseType f143341f;

        /* JADX INFO: renamed from: g */
        public final String f143342g;

        /* JADX INFO: renamed from: h */
        public List<wx80> f143343h = new ArrayList();

        /* JADX INFO: renamed from: i */
        public boolean f143344i;

        public C18908b(Act act, PurchaseType purchaseType, String str, boolean z) {
            this.f143340e = act;
            this.f143341f = purchaseType;
            this.f143342g = str;
            this.f143344i = z;
        }

        /* JADX INFO: renamed from: q */
        public static /* synthetic */ void m163966q(Throwable th) {
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ void m163967r(Throwable th) {
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f143343h.size();
        }

        @Override // p149l.w660
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            final View viewInflate;
            wx80 wx80Var = this.f143343h.get(i);
            if (!CoreModule.m29935P().m94651a().mo158204B() || !sab0.m182901s(this.f143341f)) {
                PurchaseType purchaseType = this.f143341f;
                PurchaseType purchaseType2 = PurchaseType.TYPE_GET_LIKERS;
                if (purchaseType == purchaseType2 && m163970u(wx80Var)) {
                    if (C4729a0.m31387j().f19526e.get().booleanValue() && NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19394a0.m221515e()) && !CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.isEmpty()) {
                        viewInflate = new abe0(this.f143340e, wx80Var, null).m95589a(viewGroup);
                    } else {
                        viewInflate = new c8e0(this.f143340e, wx80Var).m105788c(viewGroup);
                        c8e0.m105786h(viewInflate);
                        this.f143340e.duringCreated(CoreModule.f17545c.f19687u0.m30437e7()).subscribe(mkd0.m154956H(new e30() { // from class: l.rej
                            @Override // p149l.e30
                            public final void call(Object obj) {
                                c8e0.m105786h(viewInflate);
                            }
                        }, new e30() { // from class: l.sej
                            @Override // p149l.e30
                            public final void call(Object obj) {
                                oej.C18908b.m163966q((Throwable) obj);
                            }
                        }));
                    }
                } else if (!ura.m195053e().m195057d().mo33659B8().get().isEmpty() && this.f143341f == purchaseType2 && i == 0) {
                    viewInflate = new abe0(this.f143340e, wx80Var, null).m95589a(viewGroup);
                } else {
                    Privilege privilegeM205960l = this.f143343h.get(i).m205960l();
                    Privilege privilege = Privilege.vip_message_block_gp;
                    Act act = this.f143340e;
                    if (privilegeM205960l == privilege) {
                        viewInflate = act.inflater().inflate(m6c0.f131520P2, viewGroup, false);
                        ((VipIntroPageBlock) viewInflate).m56266c(this.f143340e, wx80Var, this.f143341f);
                    } else {
                        viewInflate = act.inflater().inflate(m6c0.f131601i, viewGroup, false);
                        ((GPVipIntroPage) viewInflate).m56230d(this.f143340e, wx80Var, this.f143344i, getCount(), i, this.f143341f);
                    }
                }
            } else if (wx80Var.m205960l() == Privilege.see_letter_gp) {
                User userMe_ = CoreModule.m29932K().me_();
                if (CoreModule.m29935P().m94651a().mo158243I0() && NullChecker.m81303a(userMe_) && !userMe_.isFemale()) {
                    viewInflate = this.f143340e.inflater().inflate(m6c0.f131559Z1, viewGroup, false);
                    ((SeeLetterBlockPage) viewInflate).m54317c(this.f143340e, wx80Var);
                } else {
                    View viewInflate2 = this.f143340e.inflater().inflate(m6c0.f131524Q2, viewGroup, false);
                    ((VipIntroPage) viewInflate2).m56251d(this.f143340e, wx80Var, this.f143344i, getCount(), i);
                    viewInflate = viewInflate2;
                }
            } else if (wx80Var.m205960l() != Privilege.see_chat_request_gp || ura.m195053e().m195057d().mo33659B8().get().isEmpty()) {
                viewInflate = new c8e0(this.f143340e, wx80Var).m105788c(viewGroup);
                c8e0.m105786h(viewInflate);
                this.f143340e.duringCreated(CoreModule.f17545c.f19687u0.m30437e7()).subscribe(mkd0.m154956H(new e30() { // from class: l.pej
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        c8e0.m105786h(viewInflate);
                    }
                }, new e30() { // from class: l.qej
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        oej.C18908b.m163967r((Throwable) obj);
                    }
                }));
            } else {
                viewInflate = new abe0(this.f143340e, wx80Var, null).m95589a(viewGroup);
            }
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        @Override // p149l.w660
        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (obj instanceof View) {
                Object tag = ((View) obj).getTag(z4c0.f201477J0);
                if (tag instanceof ExplodeLayout) {
                    ((ExplodeLayout) tag).m54227k();
                }
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }

        /* JADX INFO: renamed from: u */
        public boolean m163970u(wx80 wx80Var) {
            return this.f143341f == PurchaseType.TYPE_GET_LIKERS && wx80Var.m205960l() == Privilege.see_who_likes_me && wx80Var.m205958j() != d3c0.f84148vc;
        }

        /* JADX INFO: renamed from: v */
        public void m163971v(List<wx80> list) {
            this.f143343h.clear();
            this.f143343h.addAll(list);
            notifyDataSetChanged();
        }
    }

    public oej(Act act, PurchaseType purchaseType, String str, boolean z, Privilege privilege) {
        this.f143328k = act;
        this.f143329l = purchaseType;
        this.f143330m = str;
        this.f143334q = z;
        this.f143335r = privilege;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    private CharSequence m163958h() {
        if (sab0.m182905w(this.f143329l)) {
            return this.f143328k.string(R$string.f27361Y6);
        }
        if (this.f143329l == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return this.f143328k.string(R$string.f27551o6);
        }
        if (CoreModule.m29935P().m94651a().mo158204B() && sab0.m182901s(this.f143329l)) {
            return this.f143328k.string(R$string.f27560p3);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private void m163959k() {
        CharSequence charSequenceM163958h = m163958h();
        if (TextUtils.isEmpty(charSequenceM163958h)) {
            this.f143320c.setVisibility(8);
            return;
        }
        this.f143322e.setTypeface(Typeface.create("sans-serif", 1));
        PurchaseType purchaseType = this.f143329l;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            this.f143322e.setTextSize(21.0f);
            this.f143322e.setTextColor(Color.parseColor("#fde5ac"));
            this.f143322e.setText(charSequenceM163958h);
            this.f143320c.setVisibility(0);
            this.f143321d.setImageResource(d3c0.f84124u2);
            this.f143321d.setVisibility(0);
            this.f143323f.setTextColor(Color.parseColor("#80edd7a3"));
        } else if (sab0.m182905w(purchaseType)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f143321d.getLayoutParams();
            layoutParams.height = t100.m186890d(18.0f);
            layoutParams.width = t100.m186890d(44.0f);
            layoutParams.rightMargin = 0;
            this.f143321d.setLayoutParams(layoutParams);
            this.f143321d.setImageResource(d3c0.f83805X2);
            this.f143321d.setVisibility(0);
            this.f143322e.setVisibility(8);
        } else if (sab0.m182901s(this.f143329l)) {
            this.f143321d.setVisibility(8);
        }
        xdl0.m208345M0(this.f143323f, true);
        if (CoreModule.m29935P().m94651a().mo158204B() && sab0.m182901s(this.f143329l)) {
            ArrayList<Privilege> privilegeData = this.f143329l.getPrivilegeData(null);
            int size = privilegeData.size();
            if (privilegeData.contains(Privilege.see_chat_request_gp)) {
                size--;
            }
            this.f143323f.setText(String.format(this.f143328k.string(R$string.f27630v6), String.valueOf(size)));
        } else {
            boolean zMo36023yi = CoreModule.m29935P().m94655f().mo36023yi(CoreModule.f17545c.f19639e0.m169527p9());
            VText vText = this.f143323f;
            if (zMo36023yi) {
                vText.setText(String.format(this.f143328k.string(R$string.f27630v6), Integer.valueOf(this.f143329l.getPrivilegeDataForGP(null).size())));
            } else {
                vText.setText(String.format(this.f143328k.string(R$string.f27630v6), Integer.valueOf(this.f143329l.getPrivilegeDataForGP(null).size())));
            }
        }
        this.f143322e.setText(charSequenceM163958h);
        this.f143320c.setVisibility(0);
    }

    @Override // p149l.r0m
    /* JADX INFO: renamed from: a */
    public View mo155367a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f143328k.inflater().inflate(m6c0.f131492I2, viewGroup, false);
        m163960f(viewInflate);
        xdl0.m208344M(this.f143323f, false);
        m163961g(z);
        m163959k();
        m163964l();
        this.f143336s = viewInflate;
        return viewInflate;
    }

    @Override // p149l.r0m
    /* JADX INFO: renamed from: b */
    public void mo155368b(C8765d c8765d) {
        this.f143331n = c8765d;
    }

    @Override // p149l.r0m
    /* JADX INFO: renamed from: c */
    public void mo155369c(final List<wx80> list) {
        if (CoreModule.m29935P().m94651a().mo33442Xi() && this.f143329l == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && this.f143334q) {
            this.f143325h.setBackground(null);
            this.f143318a.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IjVGUFFFU08yUzdYUFdNVVhITU5HR1paNjJHVVhTVzExIiwidyI6MTA3NywiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6ODgxMzQ5MTQ1Nzc5OX0.png");
            xdl0.m208345M0(this.f143318a, true);
        }
        this.f143325h.setBackground(null);
        if (CoreModule.m29935P().m94651a().mo158204B() && this.f143329l == PurchaseType.TYPE_GET_LIKERS && this.f143334q) {
            this.f143320c.setGravity(16);
            this.f143325h.setBackground(null);
            this.f143318a.setImageResource(d3c0.f84089r9);
            xdl0.m208345M0(this.f143318a, true);
            this.f143322e.setTextColor(Color.parseColor("#ffffff"));
            this.f143323f.setTextColor(Color.parseColor("#ffffff"));
        }
        if (NullChecker.m81303a(this.f143333p)) {
            this.f143333p.unsubscribe();
        }
        int size = list.size();
        if (size > 1) {
            this.f143333p = C22306c.interval(5L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.nej
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f138617a.m163965m(list, (Long) obj);
                }
            }));
            xdl0.m208344M(this.f143327j, size > 5);
            xdl0.m208344M(this.f143326i, size <= 5);
        } else {
            this.f143333p = null;
            xdl0.m208344M(this.f143327j, false);
            xdl0.m208344M(this.f143326i, false);
        }
        this.f143325h.m4185d(new C18907a());
        this.f143332o.m163971v(list);
        if (list.size() <= 0 || this.f143335r != Privilege.intl_no_ad) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).m205960l() == this.f143335r) {
                this.f143325h.m4176T(i, true);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m163960f(View view) {
        tej.m188508a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m163961g(boolean z) {
        int iM186890d = t100.m186890d(8.0f);
        if (PurchaseType.TYPE_GET_LIKERS != this.f143329l) {
            if (z) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f143325h.getLayoutParams();
                layoutParams.height = iM186890d * 18;
                this.f143325h.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f143319b.getLayoutParams();
        layoutParams2.height = xdl0.m208408w0() <= 1280 ? 0 : (int) (((double) iM186890d) * 1.5d);
        this.f143319b.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f143325h.getLayoutParams();
        layoutParams3.height = (z ? 28 : 33) * iM186890d;
        this.f143325h.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: i */
    public void m163962i() {
        xdl0.m208344M(this.f143320c, false);
        xdl0.m208344M(this.f143323f, false);
    }

    /* JADX INFO: renamed from: j */
    public void m163963j() {
        xdl0.m208344M(this.f143319b, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m163964l() {
        C18908b c18908b = new C18908b(this.f143328k, this.f143329l, this.f143330m, this.f143334q);
        this.f143332o = c18908b;
        this.f143325h.setAdapter(c18908b);
        this.f143327j.setViewPager(this.f143325h);
        this.f143326i.setViewPager(this.f143325h);
        PurchaseType purchaseType = this.f143329l;
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        VPagerNewCircleIndicator vPagerNewCircleIndicator = this.f143327j;
        if (purchaseType == purchaseType2) {
            vPagerNewCircleIndicator.setNormalColor(654302882);
            this.f143327j.setSelectedColor(-8542);
            this.f143326i.setPageColor(654302882);
            this.f143326i.setFillColor(-8542);
            this.f143327j.setSelectedColor(-8542);
        } else {
            vPagerNewCircleIndicator.setNormalColor(637534208);
            this.f143327j.setSelectedColor(-12472);
            this.f143326i.setPageColor(637534208);
            this.f143326i.setFillColor(-12472);
        }
        this.f143327j.invalidate();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m163965m(List list, Long l2) {
        int currentItem = this.f143325h.getCurrentItem();
        int size = list.size() - 1;
        VPager vPager = this.f143325h;
        if (currentItem == size) {
            vPager.m4176T(0, true);
        } else {
            vPager.m4176T(vPager.getCurrentItem() + 1, true);
        }
    }

    @Override // p149l.r0m
    public void release() {
        if (NullChecker.m81303a(this.f143333p)) {
            this.f143333p.unsubscribe();
            this.f143333p = null;
        }
    }

    public oej(Act act, PurchaseType purchaseType, String str, boolean z) {
        this.f143328k = act;
        this.f143329l = purchaseType;
        this.f143330m = str;
        this.f143334q = z;
    }

    /* JADX INFO: renamed from: l.oej$a */
    public class C18907a implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        public int f143337a;

        /* JADX INFO: renamed from: b */
        public boolean f143338b;

        public C18907a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            if (this.f143337a == 1 && i == 2) {
                this.f143338b = true;
            } else if (i == 0) {
                this.f143338b = false;
            }
            this.f143337a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (this.f143338b && NullChecker.m81303a(oej.this.f143333p)) {
                oej.this.f143333p.unsubscribe();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
