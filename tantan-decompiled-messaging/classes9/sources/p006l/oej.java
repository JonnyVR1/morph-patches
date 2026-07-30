package p006l;

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
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0155a0;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.ExplodeLayout;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.SeeLetterBlockPage;
import com.p000p1.mobile.putong.core.p004ui.view.VPagerNewCircleIndicator;
import com.p000p1.mobile.putong.core.p004ui.vip.GPVipIntroPage;
import com.p000p1.mobile.putong.core.p004ui.vip.VipIntroPage;
import com.p000p1.mobile.putong.core.p004ui.vip.VipIntroPageBlock;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d3c0;
import l.e30;
import l.eb2;
import l.jo0;
import l.m6c0;
import l.mkd0;
import l.sab0;
import l.t100;
import l.tej;
import l.xdl0;
import l.z4c0;
import rx.c;
import v.AutoVDraweeView;
import v.VPager;
import v.VPagerCircleIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class oej implements r0m {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f18182a;

    /* JADX INFO: renamed from: b */
    public Space f18183b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f18184c;

    /* JADX INFO: renamed from: d */
    public ImageView f18185d;

    /* JADX INFO: renamed from: e */
    public VText f18186e;

    /* JADX INFO: renamed from: f */
    public VText f18187f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f18188g;

    /* JADX INFO: renamed from: h */
    public VPager f18189h;

    /* JADX INFO: renamed from: i */
    public VPagerCircleIndicator f18190i;

    /* JADX INFO: renamed from: j */
    public VPagerNewCircleIndicator f18191j;

    /* JADX INFO: renamed from: k */
    public final Act f18192k;

    /* JADX INFO: renamed from: l */
    public final PurchaseType f18193l;

    /* JADX INFO: renamed from: m */
    public final String f18194m;

    /* JADX INFO: renamed from: n */
    public d f18195n;

    /* JADX INFO: renamed from: o */
    public C1088b f18196o;

    /* JADX INFO: renamed from: p */
    public c4g0 f18197p;

    /* JADX INFO: renamed from: q */
    public boolean f18198q;

    /* JADX INFO: renamed from: r */
    public Privilege f18199r;

    /* JADX INFO: renamed from: s */
    public View f18200s;

    /* JADX INFO: renamed from: l.oej$b */
    public static class C1088b extends eb2 {

        /* JADX INFO: renamed from: e */
        public final Act f18204e;

        /* JADX INFO: renamed from: f */
        public final PurchaseType f18205f;

        /* JADX INFO: renamed from: g */
        public final String f18206g;

        /* JADX INFO: renamed from: h */
        public List<wx80> f18207h = new ArrayList();

        /* JADX INFO: renamed from: i */
        public boolean f18208i;

        public C1088b(Act act, PurchaseType purchaseType, String str, boolean z) {
            this.f18204e = act;
            this.f18205f = purchaseType;
            this.f18206g = str;
            this.f18208i = z;
        }

        /* JADX INFO: renamed from: q */
        public static /* synthetic */ void m20603q(Throwable th) {
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ void m20604r(Throwable th) {
        }

        public int getCount() {
            return this.f18207h.size();
        }

        public int getItemPosition(Object obj) {
            return -2;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: o */
        public void m20607o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        /* JADX INFO: renamed from: p */
        public Object m20608p(ViewGroup viewGroup, int i) {
            final View viewInflate;
            wx80 wx80Var = this.f18207h.get(i);
            if (!CoreModule.m1854P().m11706a().m19710B() || !sab0.s(this.f18205f)) {
                PurchaseType purchaseType = this.f18205f;
                PurchaseType purchaseType2 = PurchaseType.TYPE_GET_LIKERS;
                if (purchaseType == purchaseType2 && m20609u(wx80Var)) {
                    if (((Boolean) C0155a0.m3317j().f3515e.get()).booleanValue() && NullChecker.a(CoreModule.f1534c.f3652m0.f3383a0.e()) && !((PartialListOpt) CoreModule.f1534c.f3652m0.f3383a0.e()).loaded.isEmpty()) {
                        viewInflate = new abe0(this.f18204e, wx80Var, null).m11806a(viewGroup);
                    } else {
                        viewInflate = new c8e0(this.f18204e, wx80Var).m13316c(viewGroup);
                        c8e0.m13314h(viewInflate);
                        this.f18204e.duringCreated(CoreModule.f1534c.f3676u0.m2365e7()).subscribe(mkd0.H(new e30() { // from class: l.rej
                            public final void call(Object obj) {
                                c8e0.m13314h(viewInflate);
                            }
                        }, new e30() { // from class: l.sej
                            public final void call(Object obj) {
                                oej.C1088b.m20603q((Throwable) obj);
                            }
                        }));
                    }
                } else if (!((String) ura.m25555e().m25559d().m5596B8().get()).isEmpty() && this.f18205f == purchaseType2 && i == 0) {
                    viewInflate = new abe0(this.f18204e, wx80Var, null).m11806a(viewGroup);
                } else {
                    Privilege privilegeM26841l = this.f18207h.get(i).m26841l();
                    Privilege privilege = Privilege.vip_message_block_gp;
                    Act act = this.f18204e;
                    if (privilegeM26841l == privilege) {
                        viewInflate = act.inflater().inflate(m6c0.P2, viewGroup, false);
                        ((VipIntroPageBlock) viewInflate).m9700c(this.f18204e, wx80Var, this.f18205f);
                    } else {
                        viewInflate = act.inflater().inflate(m6c0.i, viewGroup, false);
                        ((GPVipIntroPage) viewInflate).m9663d(this.f18204e, wx80Var, this.f18208i, getCount(), i, this.f18205f);
                    }
                }
            } else if (wx80Var.m26841l() == Privilege.see_letter_gp) {
                User userMe_ = CoreModule.m1851K().me_();
                if (CoreModule.m1854P().m11706a().m19749I0() && NullChecker.a(userMe_) && !userMe_.isFemale()) {
                    viewInflate = this.f18204e.inflater().inflate(m6c0.Z1, viewGroup, false);
                    ((SeeLetterBlockPage) viewInflate).m7652c(this.f18204e, wx80Var);
                } else {
                    View viewInflate2 = this.f18204e.inflater().inflate(m6c0.Q2, viewGroup, false);
                    ((VipIntroPage) viewInflate2).m9685d(this.f18204e, wx80Var, this.f18208i, getCount(), i);
                    viewInflate = viewInflate2;
                }
            } else if (wx80Var.m26841l() != Privilege.see_chat_request_gp || ((String) ura.m25555e().m25559d().m5596B8().get()).isEmpty()) {
                viewInflate = new c8e0(this.f18204e, wx80Var).m13316c(viewGroup);
                c8e0.m13314h(viewInflate);
                this.f18204e.duringCreated(CoreModule.f1534c.f3676u0.m2365e7()).subscribe(mkd0.H(new e30() { // from class: l.pej
                    public final void call(Object obj) {
                        c8e0.m13314h(viewInflate);
                    }
                }, new e30() { // from class: l.qej
                    public final void call(Object obj) {
                        oej.C1088b.m20604r((Throwable) obj);
                    }
                }));
            } else {
                viewInflate = new abe0(this.f18204e, wx80Var, null).m11806a(viewGroup);
            }
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (obj instanceof View) {
                Object tag = ((View) obj).getTag(z4c0.J0);
                if (tag instanceof ExplodeLayout) {
                    ((ExplodeLayout) tag).m7562k();
                }
            }
            super/*l.w660*/.setPrimaryItem(viewGroup, i, obj);
        }

        /* JADX INFO: renamed from: u */
        public boolean m20609u(wx80 wx80Var) {
            return this.f18205f == PurchaseType.TYPE_GET_LIKERS && wx80Var.m26841l() == Privilege.see_who_likes_me && wx80Var.m26839j() != d3c0.vc;
        }

        /* JADX INFO: renamed from: v */
        public void m20610v(List<wx80> list) {
            this.f18207h.clear();
            this.f18207h.addAll(list);
            notifyDataSetChanged();
        }
    }

    public oej(Act act, PurchaseType purchaseType, String str, boolean z, Privilege privilege) {
        this.f18192k = act;
        this.f18193l = purchaseType;
        this.f18194m = str;
        this.f18198q = z;
        this.f18199r = privilege;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    private CharSequence m20595h() {
        if (sab0.w(this.f18193l)) {
            return this.f18192k.string(R.string.Y6);
        }
        if (this.f18193l == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return this.f18192k.string(R.string.o6);
        }
        if (CoreModule.m1854P().m11706a().m19710B() && sab0.s(this.f18193l)) {
            return this.f18192k.string(R.string.p3);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private void m20596k() {
        CharSequence charSequenceM20595h = m20595h();
        if (TextUtils.isEmpty(charSequenceM20595h)) {
            this.f18184c.setVisibility(8);
            return;
        }
        this.f18186e.setTypeface(Typeface.create("sans-serif", 1));
        PurchaseType purchaseType = this.f18193l;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            this.f18186e.setTextSize(21.0f);
            this.f18186e.setTextColor(Color.parseColor("#fde5ac"));
            this.f18186e.setText(charSequenceM20595h);
            this.f18184c.setVisibility(0);
            this.f18185d.setImageResource(d3c0.u2);
            this.f18185d.setVisibility(0);
            this.f18187f.setTextColor(Color.parseColor("#80edd7a3"));
        } else if (sab0.w(purchaseType)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f18185d.getLayoutParams();
            layoutParams.height = t100.d(18.0f);
            layoutParams.width = t100.d(44.0f);
            layoutParams.rightMargin = 0;
            this.f18185d.setLayoutParams(layoutParams);
            this.f18185d.setImageResource(d3c0.X2);
            this.f18185d.setVisibility(0);
            this.f18186e.setVisibility(8);
        } else if (sab0.s(this.f18193l)) {
            this.f18185d.setVisibility(8);
        }
        xdl0.M0(this.f18187f, true);
        if (CoreModule.m1854P().m11706a().m19710B() && sab0.s(this.f18193l)) {
            ArrayList privilegeData = this.f18193l.getPrivilegeData((Gender) null);
            int size = privilegeData.size();
            if (privilegeData.contains(Privilege.see_chat_request_gp)) {
                size--;
            }
            this.f18187f.setText(String.format(this.f18192k.string(R.string.v6), String.valueOf(size)));
        } else {
            boolean zYi = CoreModule.m1854P().m11710f().yi(CoreModule.f1534c.f3628e0.m21490p9());
            VText vText = this.f18187f;
            if (zYi) {
                vText.setText(String.format(this.f18192k.string(R.string.v6), Integer.valueOf(this.f18193l.getPrivilegeDataForGP((Gender) null).size())));
            } else {
                vText.setText(String.format(this.f18192k.string(R.string.v6), Integer.valueOf(this.f18193l.getPrivilegeDataForGP((Gender) null).size())));
            }
        }
        this.f18186e.setText(charSequenceM20595h);
        this.f18184c.setVisibility(0);
    }

    @Override // p006l.r0m
    /* JADX INFO: renamed from: a */
    public View mo19384a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f18192k.inflater().inflate(m6c0.I2, viewGroup, false);
        m20597f(viewInflate);
        xdl0.M(this.f18187f, false);
        m20598g(z);
        m20596k();
        m20601l();
        this.f18200s = viewInflate;
        return viewInflate;
    }

    @Override // p006l.r0m
    /* JADX INFO: renamed from: b */
    public void mo19385b(d dVar) {
        this.f18195n = dVar;
    }

    @Override // p006l.r0m
    /* JADX INFO: renamed from: c */
    public void mo19386c(final List<wx80> list) {
        if (CoreModule.m1854P().m11706a().m5379Xi() && this.f18193l == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && this.f18198q) {
            this.f18189h.setBackground(null);
            this.f18182a.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IjVGUFFFU08yUzdYUFdNVVhITU5HR1paNjJHVVhTVzExIiwidyI6MTA3NywiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6ODgxMzQ5MTQ1Nzc5OX0.png");
            xdl0.M0(this.f18182a, true);
        }
        this.f18189h.setBackground(null);
        if (CoreModule.m1854P().m11706a().m19710B() && this.f18193l == PurchaseType.TYPE_GET_LIKERS && this.f18198q) {
            this.f18184c.setGravity(16);
            this.f18189h.setBackground(null);
            this.f18182a.setImageResource(d3c0.r9);
            xdl0.M0(this.f18182a, true);
            this.f18186e.setTextColor(Color.parseColor("#ffffff"));
            this.f18187f.setTextColor(Color.parseColor("#ffffff"));
        }
        if (NullChecker.a(this.f18197p)) {
            this.f18197p.unsubscribe();
        }
        int size = list.size();
        if (size > 1) {
            this.f18197p = c.interval(5L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.nej
                public final void call(Object obj) {
                    this.f17633a.m20602m(list, (Long) obj);
                }
            }));
            xdl0.M(this.f18191j, size > 5);
            xdl0.M(this.f18190i, size <= 5);
        } else {
            this.f18197p = null;
            xdl0.M(this.f18191j, false);
            xdl0.M(this.f18190i, false);
        }
        this.f18189h.d(new C1087a());
        this.f18196o.m20610v(list);
        if (list.size() <= 0 || this.f18199r != Privilege.intl_no_ad) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).m26841l() == this.f18199r) {
                this.f18189h.T(i, true);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m20597f(View view) {
        tej.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m20598g(boolean z) {
        int iD = t100.d(8.0f);
        if (PurchaseType.TYPE_GET_LIKERS != this.f18193l) {
            if (z) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f18189h.getLayoutParams();
                layoutParams.height = iD * 18;
                this.f18189h.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f18183b.getLayoutParams();
        layoutParams2.height = xdl0.w0() <= 1280 ? 0 : (int) (((double) iD) * 1.5d);
        this.f18183b.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f18189h.getLayoutParams();
        layoutParams3.height = (z ? 28 : 33) * iD;
        this.f18189h.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: i */
    public void m20599i() {
        xdl0.M(this.f18184c, false);
        xdl0.M(this.f18187f, false);
    }

    /* JADX INFO: renamed from: j */
    public void m20600j() {
        xdl0.M(this.f18183b, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m20601l() {
        C1088b c1088b = new C1088b(this.f18192k, this.f18193l, this.f18194m, this.f18198q);
        this.f18196o = c1088b;
        this.f18189h.setAdapter(c1088b);
        this.f18191j.setViewPager(this.f18189h);
        this.f18190i.setViewPager(this.f18189h);
        PurchaseType purchaseType = this.f18193l;
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        VPagerNewCircleIndicator vPagerNewCircleIndicator = this.f18191j;
        if (purchaseType == purchaseType2) {
            vPagerNewCircleIndicator.setNormalColor(654302882);
            this.f18191j.setSelectedColor(-8542);
            this.f18190i.setPageColor(654302882);
            this.f18190i.setFillColor(-8542);
            this.f18191j.setSelectedColor(-8542);
        } else {
            vPagerNewCircleIndicator.setNormalColor(637534208);
            this.f18191j.setSelectedColor(-12472);
            this.f18190i.setPageColor(637534208);
            this.f18190i.setFillColor(-12472);
        }
        this.f18191j.invalidate();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m20602m(List list, Long l2) {
        int currentItem = this.f18189h.getCurrentItem();
        int size = list.size() - 1;
        VPager vPager = this.f18189h;
        if (currentItem == size) {
            vPager.T(0, true);
        } else {
            vPager.T(vPager.getCurrentItem() + 1, true);
        }
    }

    @Override // p006l.r0m
    public void release() {
        if (NullChecker.a(this.f18197p)) {
            this.f18197p.unsubscribe();
            this.f18197p = null;
        }
    }

    public oej(Act act, PurchaseType purchaseType, String str, boolean z) {
        this.f18192k = act;
        this.f18193l = purchaseType;
        this.f18194m = str;
        this.f18198q = z;
    }

    /* JADX INFO: renamed from: l.oej$a */
    public class C1087a implements ViewPager.j {

        /* JADX INFO: renamed from: a */
        public int f18201a;

        /* JADX INFO: renamed from: b */
        public boolean f18202b;

        public C1087a() {
        }

        public void onPageScrollStateChanged(int i) {
            if (this.f18201a == 1 && i == 2) {
                this.f18202b = true;
            } else if (i == 0) {
                this.f18202b = false;
            }
            this.f18201a = i;
        }

        public void onPageSelected(int i) {
            if (this.f18202b && NullChecker.a(oej.this.f18197p)) {
                oej.this.f18197p.unsubscribe();
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
