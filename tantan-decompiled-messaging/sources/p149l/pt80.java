package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.ExplodeLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.QuickChatPrivilegeAnimView;
import com.p046p1.mobile.putong.core.p053ui.vip.VipIntroGroupPage;
import com.p046p1.mobile.putong.core.p053ui.vip.VipIntroPage;
import com.p046p1.mobile.putong.core.p053ui.vip.VipIntroPage2;
import com.p046p1.mobile.putong.core.p053ui.vip.VipIntroPage3;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class pt80 implements r0m {

    /* JADX INFO: renamed from: a */
    public Space f151125a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f151126b;

    /* JADX INFO: renamed from: c */
    public ImageView f151127c;

    /* JADX INFO: renamed from: d */
    public VText f151128d;

    /* JADX INFO: renamed from: e */
    public VText f151129e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f151130f;

    /* JADX INFO: renamed from: g */
    public VPager f151131g;

    /* JADX INFO: renamed from: h */
    public VPagerCircleIndicator f151132h;

    /* JADX INFO: renamed from: i */
    public VText f151133i;

    /* JADX INFO: renamed from: j */
    public final Act f151134j;

    /* JADX INFO: renamed from: k */
    public final PurchaseType f151135k;

    /* JADX INFO: renamed from: l */
    public boolean f151136l;

    /* JADX INFO: renamed from: m */
    public C19334b f151137m;

    /* JADX INFO: renamed from: n */
    public c4g0 f151138n;

    /* JADX INFO: renamed from: o */
    public c4g0 f151139o;

    /* JADX INFO: renamed from: p */
    public C8765d f151140p;

    /* JADX INFO: renamed from: q */
    public List<wx80> f151141q;

    /* JADX INFO: renamed from: r */
    public final boolean f151142r;

    /* JADX INFO: renamed from: s */
    public final boolean f151143s;

    /* JADX INFO: renamed from: l.pt80$b */
    public static class C19334b extends w660 {

        /* JADX INFO: renamed from: a */
        public final Act f151147a;

        /* JADX INFO: renamed from: b */
        public final PurchaseType f151148b;

        /* JADX INFO: renamed from: e */
        public boolean f151151e;

        /* JADX INFO: renamed from: c */
        public List<wx80> f151149c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final List<c4g0> f151150d = vwb.m200324f0(new c4g0[0]);

        /* JADX INFO: renamed from: f */
        public int f151152f = -1;

        /* JADX INFO: renamed from: g */
        public boolean f151153g = false;

        public C19334b(Act act, PurchaseType purchaseType, boolean z) {
            this.f151147a = act;
            this.f151148b = purchaseType;
            this.f151151e = z;
        }

        @Override // p149l.w660
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f151149c.size();
        }

        @Override // p149l.w660
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // p149l.w660
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View viewM171299j = m171299j(viewGroup, this.f151149c.get(i));
            viewGroup.addView(viewM171299j);
            return viewM171299j;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: j */
        public View m171299j(ViewGroup viewGroup, wx80 wx80Var) {
            if (sab0.m182902t(this.f151148b) || (CoreModule.m29935P().m94651a().mo33507h5() && (sab0.m182899q(this.f151148b) || sab0.m182905w(this.f151148b)))) {
                View viewInflate = m171300k().inflate(m6c0.f131640r2, viewGroup, false);
                ((VipIntroPage3) viewInflate).m56259b(wx80Var);
                return viewInflate;
            }
            if (sab0.m182905w(this.f151148b) || (this.f151151e && sab0.m182901s(this.f151148b))) {
                View viewInflate2 = m171300k().inflate(m6c0.f131636q2, viewGroup, false);
                ((VipIntroPage2) viewInflate2).m56253b(wx80Var);
                return viewInflate2;
            }
            if (wx80Var.m205970v()) {
                View viewInflate3 = m171300k().inflate(m6c0.f131516O2, viewGroup, false);
                ((VipIntroGroupPage) viewInflate3).m56247b(wx80Var);
                return viewInflate3;
            }
            View viewInflate4 = m171300k().inflate(m6c0.f131524Q2, viewGroup, false);
            ((VipIntroPage) viewInflate4).m56250c(this.f151147a, wx80Var);
            return viewInflate4;
        }

        /* JADX INFO: renamed from: k */
        public LayoutInflater m171300k() {
            return this.f151147a.inflater();
        }

        /* JADX INFO: renamed from: l */
        public void m171301l(List<wx80> list) {
            this.f151149c.clear();
            this.f151149c.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: m */
        public void m171302m(boolean z) {
            this.f151153g = z;
        }

        /* JADX INFO: renamed from: n */
        public void m171303n() {
            Iterator<c4g0> it = this.f151150d.iterator();
            while (it.hasNext()) {
                it.next().unsubscribe();
            }
            this.f151150d.clear();
        }

        @Override // p149l.w660
        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (obj instanceof View) {
                if (CoreModule.m29935P().m94651a().mo33507h5() && this.f151153g && i != this.f151152f) {
                    this.f151152f = i;
                    View view = (View) obj;
                    View viewFindViewById = view.findViewById(z4c0.f201475I0);
                    if (viewFindViewById instanceof ExplodeLayout) {
                        ((ExplodeLayout) viewFindViewById).m54228l(true);
                    }
                    View viewFindViewById2 = view.findViewById(z4c0.f201465D0);
                    if (viewFindViewById2 instanceof QuickChatPrivilegeAnimView) {
                        ((QuickChatPrivilegeAnimView) viewFindViewById2).m54309t0();
                    }
                } else {
                    Object tag = ((View) obj).getTag(z4c0.f201477J0);
                    if (tag instanceof ExplodeLayout) {
                        ((ExplodeLayout) tag).m54227k();
                    }
                }
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m171287j(boolean z) {
        int iM186890d = t100.m186890d(8.0f);
        if (!this.f151136l && CoreModule.m29935P().m94651a().mo33507h5() && (sab0.m182905w(this.f151135k) || sab0.m182899q(this.f151135k))) {
            xdl0.m208344M(this.f151125a, false);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f151131g.getLayoutParams();
            layoutParams.height += t100.f167261j;
            this.f151131g.setLayoutParams(layoutParams);
        }
        if (z || this.f151143s) {
            float f = this.f151142r ? 0.7f : 0.9f;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f151125a.getLayoutParams();
            layoutParams2.height = (int) (layoutParams2.height * f);
            this.f151125a.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f151131g.getLayoutParams();
            layoutParams3.height = (int) ((this.f151142r ? 19.0f : 23.0f) * iM186890d);
            this.f151131g.setLayoutParams(layoutParams3);
            xdl0.m208404u0(this.f151131g, f);
            this.f151132h.setRadius(iM186890d / 4);
        }
    }

    @Override // p149l.r0m
    /* JADX INFO: renamed from: a */
    public View mo155367a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f151134j.inflater().inflate(m6c0.f131544V2, viewGroup, false);
        m171288i(viewInflate);
        m171294p();
        m171287j(z);
        m171290l();
        C19334b c19334bM171291m = m171291m(this.f151134j, this.f151135k);
        this.f151137m = c19334bM171291m;
        this.f151131g.setAdapter(c19334bM171291m);
        VPagerCircleIndicator vPagerCircleIndicator = this.f151132h;
        VPager vPager = this.f151131g;
        vPagerCircleIndicator.m223143c(vPager, vPager.getCurrentItem());
        this.f151132h.invalidate();
        return viewInflate;
    }

    @Override // p149l.r0m
    /* JADX INFO: renamed from: b */
    public void mo155368b(C8765d c8765d) {
        this.f151140p = c8765d;
    }

    @Override // p149l.r0m
    /* JADX INFO: renamed from: c */
    public void mo155369c(final List<wx80> list) {
        this.f151141q = list;
        int size = list.size();
        xdl0.m208344M(this.f151132h, size > 1);
        if (size > 1 && !m171297s()) {
            this.f151138n = C22306c.interval(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.lt80
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f129947a.m171296r(list, (Long) obj);
                }
            }));
        }
        this.f151131g.m4185d(new C19333a());
        wx80 wx80Var = (wx80) vwb.m200346r(list, new w9j() { // from class: l.mt80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((wx80) obj).m205970v());
            }
        });
        boolean zM81303a = NullChecker.m81303a(wx80Var);
        VText vText = this.f151129e;
        if (zM81303a) {
            xdl0.m208344M(vText, true);
            this.f151128d.setTypeface(eqh0.m117752c(3));
            this.f151129e.setText(String.format(Locale.getDefault(), "（%d项特权）", Integer.valueOf(vwb.m200323f(list, new w9j() { // from class: l.nt80
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a(((wx80) obj).m205960l()));
                }
            }) - 1)));
            if (wx80Var.m205954g() != 0) {
                xdl0.m208344M(this.f151127c, true);
                this.f151127c.setImageResource(wx80Var.m205954g());
            }
        } else {
            xdl0.m208344M(vText, false);
        }
        this.f151137m.m171301l(list);
    }

    /* JADX INFO: renamed from: i */
    public final void m171288i(View view) {
        qt80.m176409a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m171289k() {
        if (m171297s()) {
            this.f151137m.m171302m(true);
            this.f151131g.setCurrentItem(0);
            if (this.f151131g.getChildAt(0) instanceof VipIntroPage3) {
                ((VipIntroPage3) this.f151131g.getChildAt(0)).m56263f();
            }
            if (this.f151138n == null) {
                this.f151138n = C22306c.interval(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.ot80
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f145552a.m171295q((Long) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m171290l() {
        if (sab0.m182883a(this.f151135k)) {
            this.f151132h.setFillColor(this.f151134j.color(b1c0.f72564n0));
        }
    }

    /* JADX INFO: renamed from: m */
    public C19334b m171291m(Act act, PurchaseType purchaseType) {
        return new C19334b(act, purchaseType, this.f151136l);
    }

    /* JADX INFO: renamed from: n */
    public void m171292n() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f151131g.getLayoutParams();
        layoutParams.bottomMargin = -t100.m186890d(15.0f);
        this.f151131g.setLayoutParams(layoutParams);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public CharSequence m171293o() {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public void m171294p() {
        float f;
        CharSequence charSequenceM171293o = m171293o();
        if (TextUtils.isEmpty(charSequenceM171293o)) {
            this.f151126b.setVisibility(8);
            return;
        }
        VText vText = this.f151128d;
        if (this.f151142r) {
            f = 14.0f;
        } else {
            f = this.f151143s ? 16 : 18;
        }
        vText.setTextSize(f);
        this.f151128d.setText(charSequenceM171293o);
        this.f151126b.setVisibility(0);
        if (this.f151142r || this.f151143s) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f151126b.getLayoutParams();
            layoutParams.topMargin = (int) (layoutParams.topMargin * (this.f151142r ? 0.7f : 0.9f));
            this.f151126b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m171295q(Long l2) {
        int currentItem = this.f151131g.getCurrentItem();
        int size = this.f151141q.size() - 1;
        VPager vPager = this.f151131g;
        if (currentItem == size) {
            vPager.m4176T(0, true);
        } else {
            vPager.m4176T(vPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m171296r(List list, Long l2) {
        int currentItem = this.f151131g.getCurrentItem();
        int size = list.size() - 1;
        VPager vPager = this.f151131g;
        if (currentItem == size) {
            vPager.m4176T(0, true);
        } else {
            vPager.m4176T(vPager.getCurrentItem() + 1, true);
        }
    }

    @Override // p149l.r0m
    public void release() {
        if (NullChecker.m81303a(this.f151138n)) {
            this.f151138n.unsubscribe();
            this.f151138n = null;
        }
        if (NullChecker.m81303a(this.f151137m)) {
            this.f151137m.m171303n();
        }
        yij0.m214943U(this.f151139o);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m171297s() {
        if (CoreModule.m29935P().m94651a().mo33507h5()) {
            return sab0.m182905w(this.f151135k) || sab0.m182899q(this.f151135k);
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public void m171298t() {
        this.f151137m.m171302m(false);
        if (NullChecker.m81303a(this.f151138n)) {
            this.f151138n.unsubscribe();
            this.f151138n = null;
        }
    }

    /* JADX INFO: renamed from: l.pt80$a */
    public class C19333a implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        public int f151144a;

        /* JADX INFO: renamed from: b */
        public boolean f151145b;

        public C19333a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            if (this.f151144a == 1 && i == 2) {
                this.f151145b = true;
            } else if (i == 0) {
                this.f151145b = false;
            }
            this.f151144a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (this.f151145b && NullChecker.m81303a(pt80.this.f151138n)) {
                pt80.this.f151138n.unsubscribe();
                pt80.this.f151138n = null;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
