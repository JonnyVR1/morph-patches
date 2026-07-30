package p153l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeItemIntroOutstanding;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeItemIntroPage1;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeItemIntroPage2;
import com.p051p1.mobile.putong.core.p058ui.view.VPagerNewCircleIndicator;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class oud0 implements l3m {

    /* JADX INFO: renamed from: a */
    public VImage f149120a;

    /* JADX INFO: renamed from: b */
    public VText f149121b;

    /* JADX INFO: renamed from: c */
    public VText f149122c;

    /* JADX INFO: renamed from: d */
    public VPager f149123d;

    /* JADX INFO: renamed from: e */
    public VPagerCircleIndicator f149124e;

    /* JADX INFO: renamed from: f */
    public VPagerNewCircleIndicator f149125f;

    /* JADX INFO: renamed from: g */
    public VText f149126g;

    /* JADX INFO: renamed from: h */
    public final Act f149127h;

    /* JADX INFO: renamed from: i */
    public final PurchaseType f149128i;

    /* JADX INFO: renamed from: j */
    public C19218b f149129j;

    /* JADX INFO: renamed from: k */
    public kcg0 f149130k;

    /* JADX INFO: renamed from: l */
    public C8928d f149131l;

    /* JADX INFO: renamed from: m */
    public List<a690> f149132m;

    /* JADX INFO: renamed from: l.oud0$b */
    public class C19218b extends cf60 {

        /* JADX INFO: renamed from: a */
        public List<a690> f149136a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public int f149137b = -1;

        public C19218b() {
        }

        @Override // p153l.cf60
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f149136a.size();
        }

        @Override // p153l.cf60
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // p153l.cf60
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            a690 a690Var = this.f149136a.get(i);
            if (a690Var.m96262A() || a690Var.m96317w() || a690Var.m96320z() || a690Var.m96263B() || a690Var.m96318x() || a690Var.m96319y()) {
                PrivilegeItemIntroOutstanding privilegeItemIntroOutstanding = (PrivilegeItemIntroOutstanding) p9r.m171370a(oud0.this.f149127h).inflate(rec0.f162529b2, viewGroup, false);
                privilegeItemIntroOutstanding.m55431d(a690Var, i, oud0.this.f149128i);
                viewGroup.addView(privilegeItemIntroOutstanding);
                return privilegeItemIntroOutstanding;
            }
            PrivilegeItemIntroPage2 privilegeItemIntroPage2 = (PrivilegeItemIntroPage2) p9r.m171370a(oud0.this.f149127h).inflate(rec0.f162454J0, viewGroup, false);
            privilegeItemIntroPage2.m55440d(a690Var, oud0.this.f149128i);
            viewGroup.addView(privilegeItemIntroPage2);
            return privilegeItemIntroPage2;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: j */
        public void m169296j(List<a690> list) {
            this.f149136a.clear();
            this.f149136a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // p153l.cf60
        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (this.f149137b != i) {
                this.f149137b = i;
                if (obj instanceof PrivilegeItemIntroOutstanding) {
                    ((PrivilegeItemIntroOutstanding) obj).m55430c();
                } else if (obj instanceof PrivilegeItemIntroPage1) {
                    ((PrivilegeItemIntroPage1) obj).m55436b();
                } else if (obj instanceof PrivilegeItemIntroPage2) {
                    ((PrivilegeItemIntroPage2) obj).m55439c();
                }
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m169289h() {
        if (wib0.m206557a(this.f149128i)) {
            this.f149124e.setFillColor(Color.parseColor("#F27310"));
            this.f149124e.setPageColor(Color.parseColor("#2a000000"));
            this.f149121b.setTextColor(this.f149127h.color(h9c0.f108360b0));
            this.f149122c.setTextColor(this.f149127h.color(h9c0.f108356Z));
            return;
        }
        if (wib0.m206565i(this.f149128i) || wib0.m206572p(this.f149128i) || wib0.m206566j(this.f149128i)) {
            this.f149121b.setTextColor(this.f149127h.color(h9c0.f108401x));
            this.f149122c.setTextColor(this.f149127h.color(h9c0.f108402y));
            this.f149124e.setPageColor(Color.parseColor("#26edd7a3"));
            this.f149124e.setFillColor(Color.parseColor("#ffdea2"));
            this.f149125f.setNormalColor(Color.parseColor("#26edd7a3"));
            this.f149125f.setSelectedColor(Color.parseColor("#ffdea2"));
            return;
        }
        if (wib0.m206571o(this.f149128i)) {
            this.f149121b.setTextColor(this.f149127h.color(h9c0.f108403z));
            this.f149122c.setTextColor(this.f149127h.color(h9c0.f108332B));
            this.f149124e.setPageColor(Color.parseColor("#E8E9EB"));
            this.f149124e.setFillColor(Color.parseColor("#656F7B"));
            this.f149125f.setNormalColor(Color.parseColor("#26edd7a3"));
            this.f149125f.setSelectedColor(Color.parseColor("#ffdea2"));
            return;
        }
        if (wib0.m206563g(this.f149128i)) {
            this.f149121b.setTextColor(this.f149127h.color(h9c0.f108365e));
            this.f149122c.setTextColor(this.f149127h.color(h9c0.f108361c));
            this.f149124e.setPageColor(Color.parseColor("#26000000"));
            this.f149124e.setFillColor(Color.parseColor("#F482CE"));
            this.f149125f.setNormalColor(Color.parseColor("#26000000"));
            this.f149125f.setSelectedColor(Color.parseColor("#F482CE"));
            return;
        }
        if (!wib0.m206580x(this.f149128i)) {
            this.f149124e.setFillColor(Color.parseColor("#E19971"));
            this.f149124e.setPageColor(Color.parseColor("#2a000000"));
            return;
        }
        this.f149121b.setTextColor(this.f149127h.color(h9c0.f108365e));
        this.f149122c.setTextColor(this.f149127h.color(h9c0.f108361c));
        this.f149124e.setPageColor(Color.parseColor("#26000000"));
        this.f149124e.setFillColor(Color.parseColor("#BCE46A"));
        this.f149125f.setNormalColor(Color.parseColor("#26000000"));
        this.f149125f.setSelectedColor(Color.parseColor("#BCE46A"));
    }

    @Override // p153l.l3m
    /* JADX INFO: renamed from: a */
    public View mo116073a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f149127h.inflater().inflate(rec0.f162608t2, viewGroup, false);
        m169290f(viewInflate);
        this.f149121b.getPaint().setFakeBoldText(true);
        this.f149122c.getPaint().setFakeBoldText(true);
        m169289h();
        C19218b c19218b = new C19218b();
        this.f149129j = c19218b;
        this.f149123d.setAdapter(c19218b);
        this.f149124e.setViewPager(this.f149123d);
        if (wib0.m206571o(this.f149128i)) {
            this.f149121b.setTextColor(this.f149127h.color(h9c0.f108403z));
            this.f149122c.setTextColor(this.f149127h.color(h9c0.f108332B));
            bnl0.m105563k(this.f149121b, this.f149127h.getResources().getDrawable(jbc0.f119853z6));
            return viewInflate;
        }
        if (wib0.m206565i(this.f149128i) || wib0.m206566j(this.f149128i)) {
            this.f149121b.setTextColor(Color.parseColor("#E8CA8A"));
            this.f149122c.setTextColor(Color.parseColor("#60E8CA8A"));
            bnl0.m105563k(this.f149121b, this.f149127h.getResources().getDrawable(jbc0.f119839y6));
            return viewInflate;
        }
        if (wib0.m206572p(this.f149128i)) {
            this.f149121b.setTextColor(Color.parseColor("#E8CA8A"));
            this.f149122c.setTextColor(Color.parseColor("#60E8CA8A"));
            return viewInflate;
        }
        if (wib0.m206563g(this.f149128i)) {
            bnl0.m105563k(this.f149121b, this.f149127h.getResources().getDrawable(jbc0.f119392S));
            return viewInflate;
        }
        boolean zM206580x = wib0.m206580x(this.f149128i);
        VText vText = this.f149121b;
        if (zM206580x) {
            bnl0.m105563k(vText, this.f149127h.getResources().getDrawable(jbc0.f119742r7));
            return viewInflate;
        }
        bnl0.m105563k(vText, this.f149127h.getResources().getDrawable(jbc0.f119731qa));
        return viewInflate;
    }

    @Override // p153l.l3m
    /* JADX INFO: renamed from: b */
    public void mo116074b(C8928d c8928d) {
        this.f149131l = c8928d;
    }

    @Override // p153l.l3m
    /* JADX INFO: renamed from: c */
    public void mo116075c(List<a690> list) {
        this.f149132m = list;
        if (list.isEmpty()) {
            this.f149121b.setVisibility(8);
            this.f149122c.setVisibility(8);
        } else if (wib0.m206563g(this.f149128i) && list.get(0).m96319y()) {
            this.f149121b.setTypeface(lyh0.m156283c(3));
            this.f149121b.setVisibility(0);
            this.f149122c.setVisibility(0);
            this.f149121b.setText("开通她专享会员");
            this.f149122c.setText("畅享安心交友体验");
        } else if (wib0.m206580x(this.f149128i) && list.get(0).m96319y()) {
            this.f149121b.setTypeface(lyh0.m156283c(3));
            this.f149121b.setVisibility(0);
            this.f149122c.setVisibility(0);
            this.f149121b.setText("开通青春专享会员");
            this.f149122c.setText("结交同龄好友，畅享青春生活");
        } else if (list.get(0).m96318x()) {
            this.f149121b.setText("解锁白金会员");
            this.f149122c.setText(String.format(s7a.m184990s() ? "享抢先告白等%s项特权" : "享置顶喜欢等%s项特权", Integer.valueOf(PurchaseType.TYPE_O_PLATINUM.getPrivilegeData(null).size())));
            this.f149121b.setTypeface(lyh0.m156283c(3));
            this.f149121b.setVisibility(0);
            this.f149122c.setVisibility(0);
        } else if (list.get(0).m96263B()) {
            this.f149121b.setText("解锁黑金会员");
            this.f149122c.setText("尊享探探全平台权益");
            this.f149121b.setTypeface(lyh0.m156283c(3));
            this.f149121b.setVisibility(0);
            this.f149122c.setVisibility(0);
        } else if (list.get(0).m96262A()) {
            this.f149121b.setTypeface(lyh0.m156283c(3));
            this.f149121b.setVisibility(0);
            this.f149122c.setVisibility(0);
            this.f149121b.setText(R$string.f28471v);
            this.f149122c.setText(String.format(this.f149127h.string(R$string.f28460u), Integer.valueOf(list.size())));
        } else if (list.get(0).m96317w()) {
            this.f149121b.setText(gta.m132210e().m132214d().mo34719Lc() ? "开通每日精选特权" : "开通每日心动特权");
            this.f149121b.setTypeface(lyh0.m156283c(3));
            this.f149121b.setVisibility(0);
            this.f149122c.setVisibility(8);
        } else if (list.get(0).m96320z()) {
            this.f149121b.setText("开通SVIP+权益包");
            this.f149121b.setTypeface(lyh0.m156283c(3));
            this.f149121b.setVisibility(0);
            this.f149122c.setText((gta.m132210e().m132214d().mo34719Lc() ? "每日精选" : "每日心动").concat("+SVIP14项特权"));
            this.f149122c.setVisibility(0);
        } else if (wib0.m206572p(this.f149128i) && list.get(0).m96319y()) {
            this.f149121b.setText("获取私人定制特权");
            this.f149121b.setTypeface(lyh0.m156283c(3));
            this.f149121b.setVisibility(0);
            this.f149122c.setVisibility(8);
        } else if (wib0.m206566j(this.f149128i) && list.get(0).m96319y()) {
            this.f149121b.setText("开通黑金会员+权益包");
            this.f149122c.setText("私人定制+黑金会员全部特权");
            this.f149121b.setTypeface(lyh0.m156283c(3));
            this.f149121b.setVisibility(0);
            this.f149122c.setVisibility(0);
        } else {
            this.f149121b.setVisibility(8);
            this.f149122c.setVisibility(8);
        }
        bnl0.m105524M(this.f149124e, list.size() > 1);
        this.f149123d.m4187d(new C19217a());
        this.f149129j.m169296j(list);
        m169294k(list);
    }

    /* JADX INFO: renamed from: f */
    public final void m169290f(View view) {
        pud0.m173862a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m169291g() {
        kcg0 kcg0Var = this.f149130k;
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            this.f149130k = C22421c.interval(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.mud0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f138767a.m169292i((Long) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.nud0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f143699a.m169293j((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m169292i(Long l2) {
        return Boolean.valueOf(this.f149132m != null);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m169293j(Long l2) {
        int currentItem = this.f149123d.getCurrentItem();
        int size = this.f149132m.size() - 1;
        VPager vPager = this.f149123d;
        if (currentItem == size) {
            vPager.m4178T(0, true);
        } else {
            vPager.m4178T(vPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m169294k(List<a690> list) {
        if (!wib0.m206565i(this.f149128i) && !wib0.m206572p(this.f149128i) && !wib0.m206566j(this.f149128i)) {
            bnl0.m105524M(this.f149120a, false);
            return;
        }
        bnl0.m105524M(this.f149120a, true);
        if (jyb.m147479J(list) || !(list.get(0).m96262A() || list.get(0).m96317w() || list.get(0).m96320z() || list.get(0).m96263B() || list.get(0).m96319y())) {
            this.f149120a.setImageResource(jbc0.f119357P4);
        } else {
            this.f149120a.setImageResource(jbc0.f119837y4);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m169295l() {
        if (!NullChecker.m82486a(this.f149130k) || this.f149130k.isUnsubscribed()) {
            return;
        }
        this.f149130k.unsubscribe();
        this.f149130k = null;
    }

    @Override // p153l.l3m
    public void release() {
        m169295l();
    }

    /* JADX INFO: renamed from: l.oud0$a */
    public class C19217a implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        public int f149133a;

        /* JADX INFO: renamed from: b */
        public boolean f149134b;

        public C19217a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            if (this.f149133a == 1 && i == 2) {
                this.f149134b = true;
            } else if (i == 0) {
                this.f149134b = false;
            }
            this.f149133a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (this.f149134b) {
                oud0.this.m169295l();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
