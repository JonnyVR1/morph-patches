package p006l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.PrivilegeItemIntroOutstanding;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.PrivilegeItemIntroPage1;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.PrivilegeItemIntroPage2;
import com.p000p1.mobile.putong.core.p004ui.view.VPagerNewCircleIndicator;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.Gender;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.b1c0;
import l.c4g0;
import l.d3c0;
import l.e30;
import l.eqh0;
import l.jo0;
import l.m6c0;
import l.mkd0;
import l.nmd0;
import l.o7r;
import l.sab0;
import l.vwb;
import l.w660;
import l.w9j;
import l.xdl0;
import rx.c;
import v.VImage;
import v.VPager;
import v.VPagerCircleIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class mmd0 implements r0m {

    /* JADX INFO: renamed from: a */
    public VImage f17096a;

    /* JADX INFO: renamed from: b */
    public VText f17097b;

    /* JADX INFO: renamed from: c */
    public VText f17098c;

    /* JADX INFO: renamed from: d */
    public VPager f17099d;

    /* JADX INFO: renamed from: e */
    public VPagerCircleIndicator f17100e;

    /* JADX INFO: renamed from: f */
    public VPagerNewCircleIndicator f17101f;

    /* JADX INFO: renamed from: g */
    public VText f17102g;

    /* JADX INFO: renamed from: h */
    public final Act f17103h;

    /* JADX INFO: renamed from: i */
    public final PurchaseType f17104i;

    /* JADX INFO: renamed from: j */
    public C1023b f17105j;

    /* JADX INFO: renamed from: k */
    public c4g0 f17106k;

    /* JADX INFO: renamed from: l */
    public d f17107l;

    /* JADX INFO: renamed from: m */
    public List<wx80> f17108m;

    /* JADX INFO: renamed from: l.mmd0$b */
    public class C1023b extends w660 {

        /* JADX INFO: renamed from: a */
        public List<wx80> f17112a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public int f17113b = -1;

        public C1023b() {
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return this.f17112a.size();
        }

        public int getItemPosition(Object obj) {
            return -2;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            wx80 wx80Var = this.f17112a.get(i);
            if (wx80Var.m26797A() || wx80Var.m26852w() || wx80Var.m26855z() || wx80Var.m26798B() || wx80Var.m26853x() || wx80Var.m26854y()) {
                PrivilegeItemIntroOutstanding privilegeItemIntroOutstanding = (PrivilegeItemIntroOutstanding) o7r.a(mmd0.this.f17103h).inflate(m6c0.b2, viewGroup, false);
                privilegeItemIntroOutstanding.m7583d(wx80Var, i, mmd0.this.f17104i);
                viewGroup.addView(privilegeItemIntroOutstanding);
                return privilegeItemIntroOutstanding;
            }
            PrivilegeItemIntroPage2 privilegeItemIntroPage2 = (PrivilegeItemIntroPage2) o7r.a(mmd0.this.f17103h).inflate(m6c0.J0, viewGroup, false);
            privilegeItemIntroPage2.m7592d(wx80Var, mmd0.this.f17104i);
            viewGroup.addView(privilegeItemIntroPage2);
            return privilegeItemIntroPage2;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: j */
        public void m19393j(List<wx80> list) {
            this.f17112a.clear();
            this.f17112a.addAll(list);
            notifyDataSetChanged();
        }

        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (this.f17113b != i) {
                this.f17113b = i;
                if (obj instanceof PrivilegeItemIntroOutstanding) {
                    ((PrivilegeItemIntroOutstanding) obj).m7582c();
                } else if (obj instanceof PrivilegeItemIntroPage1) {
                    ((PrivilegeItemIntroPage1) obj).m7588b();
                } else if (obj instanceof PrivilegeItemIntroPage2) {
                    ((PrivilegeItemIntroPage2) obj).m7591c();
                }
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m19383h() {
        if (sab0.a(this.f17104i)) {
            this.f17100e.setFillColor(Color.parseColor("#F27310"));
            this.f17100e.setPageColor(Color.parseColor("#2a000000"));
            this.f17097b.setTextColor(this.f17103h.color(b1c0.b0));
            this.f17098c.setTextColor(this.f17103h.color(b1c0.Z));
            return;
        }
        if (sab0.i(this.f17104i) || sab0.p(this.f17104i) || sab0.j(this.f17104i)) {
            this.f17097b.setTextColor(this.f17103h.color(b1c0.x));
            this.f17098c.setTextColor(this.f17103h.color(b1c0.y));
            this.f17100e.setPageColor(Color.parseColor("#26edd7a3"));
            this.f17100e.setFillColor(Color.parseColor("#ffdea2"));
            this.f17101f.setNormalColor(Color.parseColor("#26edd7a3"));
            this.f17101f.setSelectedColor(Color.parseColor("#ffdea2"));
            return;
        }
        if (sab0.o(this.f17104i)) {
            this.f17097b.setTextColor(this.f17103h.color(b1c0.z));
            this.f17098c.setTextColor(this.f17103h.color(b1c0.B));
            this.f17100e.setPageColor(Color.parseColor("#E8E9EB"));
            this.f17100e.setFillColor(Color.parseColor("#656F7B"));
            this.f17101f.setNormalColor(Color.parseColor("#26edd7a3"));
            this.f17101f.setSelectedColor(Color.parseColor("#ffdea2"));
            return;
        }
        if (sab0.g(this.f17104i)) {
            this.f17097b.setTextColor(this.f17103h.color(b1c0.e));
            this.f17098c.setTextColor(this.f17103h.color(b1c0.c));
            this.f17100e.setPageColor(Color.parseColor("#26000000"));
            this.f17100e.setFillColor(Color.parseColor("#F482CE"));
            this.f17101f.setNormalColor(Color.parseColor("#26000000"));
            this.f17101f.setSelectedColor(Color.parseColor("#F482CE"));
            return;
        }
        if (!sab0.x(this.f17104i)) {
            this.f17100e.setFillColor(Color.parseColor("#E19971"));
            this.f17100e.setPageColor(Color.parseColor("#2a000000"));
            return;
        }
        this.f17097b.setTextColor(this.f17103h.color(b1c0.e));
        this.f17098c.setTextColor(this.f17103h.color(b1c0.c));
        this.f17100e.setPageColor(Color.parseColor("#26000000"));
        this.f17100e.setFillColor(Color.parseColor("#BCE46A"));
        this.f17101f.setNormalColor(Color.parseColor("#26000000"));
        this.f17101f.setSelectedColor(Color.parseColor("#BCE46A"));
    }

    @Override // p006l.r0m
    /* JADX INFO: renamed from: a */
    public View mo19384a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f17103h.inflater().inflate(m6c0.t2, viewGroup, false);
        m19387f(viewInflate);
        this.f17097b.getPaint().setFakeBoldText(true);
        this.f17098c.getPaint().setFakeBoldText(true);
        m19383h();
        C1023b c1023b = new C1023b();
        this.f17105j = c1023b;
        this.f17099d.setAdapter(c1023b);
        this.f17100e.setViewPager(this.f17099d);
        if (sab0.o(this.f17104i)) {
            this.f17097b.setTextColor(this.f17103h.color(b1c0.z));
            this.f17098c.setTextColor(this.f17103h.color(b1c0.B));
            xdl0.k(this.f17097b, this.f17103h.getResources().getDrawable(d3c0.z6));
            return viewInflate;
        }
        if (sab0.i(this.f17104i) || sab0.j(this.f17104i)) {
            this.f17097b.setTextColor(Color.parseColor("#E8CA8A"));
            this.f17098c.setTextColor(Color.parseColor("#60E8CA8A"));
            xdl0.k(this.f17097b, this.f17103h.getResources().getDrawable(d3c0.y6));
            return viewInflate;
        }
        if (sab0.p(this.f17104i)) {
            this.f17097b.setTextColor(Color.parseColor("#E8CA8A"));
            this.f17098c.setTextColor(Color.parseColor("#60E8CA8A"));
            return viewInflate;
        }
        if (sab0.g(this.f17104i)) {
            xdl0.k(this.f17097b, this.f17103h.getResources().getDrawable(d3c0.S));
            return viewInflate;
        }
        boolean zX = sab0.x(this.f17104i);
        VText vText = this.f17097b;
        if (zX) {
            xdl0.k(vText, this.f17103h.getResources().getDrawable(d3c0.r7));
            return viewInflate;
        }
        xdl0.k(vText, this.f17103h.getResources().getDrawable(d3c0.qa));
        return viewInflate;
    }

    @Override // p006l.r0m
    /* JADX INFO: renamed from: b */
    public void mo19385b(d dVar) {
        this.f17107l = dVar;
    }

    @Override // p006l.r0m
    /* JADX INFO: renamed from: c */
    public void mo19386c(List<wx80> list) {
        this.f17108m = list;
        if (list.isEmpty()) {
            this.f17097b.setVisibility(8);
            this.f17098c.setVisibility(8);
        } else if (sab0.g(this.f17104i) && list.get(0).m26854y()) {
            this.f17097b.setTypeface(eqh0.c(3));
            this.f17097b.setVisibility(0);
            this.f17098c.setVisibility(0);
            this.f17097b.setText("开通她专享会员");
            this.f17098c.setText("畅享安心交友体验");
        } else if (sab0.x(this.f17104i) && list.get(0).m26854y()) {
            this.f17097b.setTypeface(eqh0.c(3));
            this.f17097b.setVisibility(0);
            this.f17098c.setVisibility(0);
            this.f17097b.setText("开通青春专享会员");
            this.f17098c.setText("结交同龄好友，畅享青春生活");
        } else if (list.get(0).m26853x()) {
            this.f17097b.setText("解锁白金会员");
            this.f17098c.setText(String.format(g6a.m15596s() ? "享抢先告白等%s项特权" : "享置顶喜欢等%s项特权", Integer.valueOf(PurchaseType.TYPE_O_PLATINUM.getPrivilegeData((Gender) null).size())));
            this.f17097b.setTypeface(eqh0.c(3));
            this.f17097b.setVisibility(0);
            this.f17098c.setVisibility(0);
        } else if (list.get(0).m26798B()) {
            this.f17097b.setText("解锁黑金会员");
            this.f17098c.setText("尊享探探全平台权益");
            this.f17097b.setTypeface(eqh0.c(3));
            this.f17097b.setVisibility(0);
            this.f17098c.setVisibility(0);
        } else if (list.get(0).m26797A()) {
            this.f17097b.setTypeface(eqh0.c(3));
            this.f17097b.setVisibility(0);
            this.f17098c.setVisibility(0);
            this.f17097b.setText(R.string.v);
            this.f17098c.setText(String.format(this.f17103h.string(R.string.u), Integer.valueOf(list.size())));
        } else if (list.get(0).m26852w()) {
            this.f17097b.setText(ura.m25555e().m25559d().m5653Lc() ? "开通每日精选特权" : "开通每日心动特权");
            this.f17097b.setTypeface(eqh0.c(3));
            this.f17097b.setVisibility(0);
            this.f17098c.setVisibility(8);
        } else if (list.get(0).m26855z()) {
            this.f17097b.setText("开通SVIP+权益包");
            this.f17097b.setTypeface(eqh0.c(3));
            this.f17097b.setVisibility(0);
            this.f17098c.setText((ura.m25555e().m25559d().m5653Lc() ? "每日精选" : "每日心动").concat("+SVIP14项特权"));
            this.f17098c.setVisibility(0);
        } else if (sab0.p(this.f17104i) && list.get(0).m26854y()) {
            this.f17097b.setText("获取私人定制特权");
            this.f17097b.setTypeface(eqh0.c(3));
            this.f17097b.setVisibility(0);
            this.f17098c.setVisibility(8);
        } else if (sab0.j(this.f17104i) && list.get(0).m26854y()) {
            this.f17097b.setText("开通黑金会员+权益包");
            this.f17098c.setText("私人定制+黑金会员全部特权");
            this.f17097b.setTypeface(eqh0.c(3));
            this.f17097b.setVisibility(0);
            this.f17098c.setVisibility(0);
        } else {
            this.f17097b.setVisibility(8);
            this.f17098c.setVisibility(8);
        }
        xdl0.M(this.f17100e, list.size() > 1);
        this.f17099d.d(new C1022a());
        this.f17105j.m19393j(list);
        m19391k(list);
    }

    /* JADX INFO: renamed from: f */
    public final void m19387f(View view) {
        nmd0.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m19388g() {
        c4g0 c4g0Var = this.f17106k;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f17106k = c.interval(5000L, 5000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).filter(new w9j() { // from class: l.kmd0
                public final Object call(Object obj) {
                    return this.f15902a.m19389i((Long) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.lmd0
                public final void call(Object obj) {
                    this.f16522a.m19390j((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m19389i(Long l2) {
        return Boolean.valueOf(this.f17108m != null);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m19390j(Long l2) {
        int currentItem = this.f17099d.getCurrentItem();
        int size = this.f17108m.size() - 1;
        VPager vPager = this.f17099d;
        if (currentItem == size) {
            vPager.T(0, true);
        } else {
            vPager.T(vPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m19391k(List<wx80> list) {
        if (!sab0.i(this.f17104i) && !sab0.p(this.f17104i) && !sab0.j(this.f17104i)) {
            xdl0.M(this.f17096a, false);
            return;
        }
        xdl0.M(this.f17096a, true);
        if (vwb.J(list) || !(list.get(0).m26797A() || list.get(0).m26852w() || list.get(0).m26855z() || list.get(0).m26798B() || list.get(0).m26854y())) {
            this.f17096a.setImageResource(d3c0.P4);
        } else {
            this.f17096a.setImageResource(d3c0.y4);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m19392l() {
        if (!NullChecker.a(this.f17106k) || this.f17106k.isUnsubscribed()) {
            return;
        }
        this.f17106k.unsubscribe();
        this.f17106k = null;
    }

    @Override // p006l.r0m
    public void release() {
        m19392l();
    }

    /* JADX INFO: renamed from: l.mmd0$a */
    public class C1022a implements ViewPager.j {

        /* JADX INFO: renamed from: a */
        public int f17109a;

        /* JADX INFO: renamed from: b */
        public boolean f17110b;

        public C1022a() {
        }

        public void onPageScrollStateChanged(int i) {
            if (this.f17109a == 1 && i == 2) {
                this.f17110b = true;
            } else if (i == 0) {
                this.f17110b = false;
            }
            this.f17109a = i;
        }

        public void onPageSelected(int i) {
            if (this.f17110b) {
                mmd0.this.m19392l();
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
