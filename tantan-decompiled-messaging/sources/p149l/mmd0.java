package p149l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeItemIntroOutstanding;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeItemIntroPage1;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeItemIntroPage2;
import com.p046p1.mobile.putong.core.p053ui.view.VPagerNewCircleIndicator;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class mmd0 implements r0m {

    /* JADX INFO: renamed from: a */
    public VImage f134599a;

    /* JADX INFO: renamed from: b */
    public VText f134600b;

    /* JADX INFO: renamed from: c */
    public VText f134601c;

    /* JADX INFO: renamed from: d */
    public VPager f134602d;

    /* JADX INFO: renamed from: e */
    public VPagerCircleIndicator f134603e;

    /* JADX INFO: renamed from: f */
    public VPagerNewCircleIndicator f134604f;

    /* JADX INFO: renamed from: g */
    public VText f134605g;

    /* JADX INFO: renamed from: h */
    public final Act f134606h;

    /* JADX INFO: renamed from: i */
    public final PurchaseType f134607i;

    /* JADX INFO: renamed from: j */
    public C18501b f134608j;

    /* JADX INFO: renamed from: k */
    public c4g0 f134609k;

    /* JADX INFO: renamed from: l */
    public C8765d f134610l;

    /* JADX INFO: renamed from: m */
    public List<wx80> f134611m;

    /* JADX INFO: renamed from: l.mmd0$b */
    public class C18501b extends w660 {

        /* JADX INFO: renamed from: a */
        public List<wx80> f134615a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public int f134616b = -1;

        public C18501b() {
        }

        @Override // p149l.w660
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f134615a.size();
        }

        @Override // p149l.w660
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // p149l.w660
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            wx80 wx80Var = this.f134615a.get(i);
            if (wx80Var.m205916A() || wx80Var.m205971w() || wx80Var.m205974z() || wx80Var.m205917B() || wx80Var.m205972x() || wx80Var.m205973y()) {
                PrivilegeItemIntroOutstanding privilegeItemIntroOutstanding = (PrivilegeItemIntroOutstanding) o7r.m163037a(mmd0.this.f134606h).inflate(m6c0.f131569b2, viewGroup, false);
                privilegeItemIntroOutstanding.m54248d(wx80Var, i, mmd0.this.f134607i);
                viewGroup.addView(privilegeItemIntroOutstanding);
                return privilegeItemIntroOutstanding;
            }
            PrivilegeItemIntroPage2 privilegeItemIntroPage2 = (PrivilegeItemIntroPage2) o7r.m163037a(mmd0.this.f134606h).inflate(m6c0.f131494J0, viewGroup, false);
            privilegeItemIntroPage2.m54257d(wx80Var, mmd0.this.f134607i);
            viewGroup.addView(privilegeItemIntroPage2);
            return privilegeItemIntroPage2;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: j */
        public void m155376j(List<wx80> list) {
            this.f134615a.clear();
            this.f134615a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // p149l.w660
        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            if (this.f134616b != i) {
                this.f134616b = i;
                if (obj instanceof PrivilegeItemIntroOutstanding) {
                    ((PrivilegeItemIntroOutstanding) obj).m54247c();
                } else if (obj instanceof PrivilegeItemIntroPage1) {
                    ((PrivilegeItemIntroPage1) obj).m54253b();
                } else if (obj instanceof PrivilegeItemIntroPage2) {
                    ((PrivilegeItemIntroPage2) obj).m54256c();
                }
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m155366h() {
        if (sab0.m182883a(this.f134607i)) {
            this.f134603e.setFillColor(Color.parseColor("#F27310"));
            this.f134603e.setPageColor(Color.parseColor("#2a000000"));
            this.f134600b.setTextColor(this.f134606h.color(b1c0.f72540b0));
            this.f134601c.setTextColor(this.f134606h.color(b1c0.f72536Z));
            return;
        }
        if (sab0.m182891i(this.f134607i) || sab0.m182898p(this.f134607i) || sab0.m182892j(this.f134607i)) {
            this.f134600b.setTextColor(this.f134606h.color(b1c0.f72581x));
            this.f134601c.setTextColor(this.f134606h.color(b1c0.f72582y));
            this.f134603e.setPageColor(Color.parseColor("#26edd7a3"));
            this.f134603e.setFillColor(Color.parseColor("#ffdea2"));
            this.f134604f.setNormalColor(Color.parseColor("#26edd7a3"));
            this.f134604f.setSelectedColor(Color.parseColor("#ffdea2"));
            return;
        }
        if (sab0.m182897o(this.f134607i)) {
            this.f134600b.setTextColor(this.f134606h.color(b1c0.f72583z));
            this.f134601c.setTextColor(this.f134606h.color(b1c0.f72512B));
            this.f134603e.setPageColor(Color.parseColor("#E8E9EB"));
            this.f134603e.setFillColor(Color.parseColor("#656F7B"));
            this.f134604f.setNormalColor(Color.parseColor("#26edd7a3"));
            this.f134604f.setSelectedColor(Color.parseColor("#ffdea2"));
            return;
        }
        if (sab0.m182889g(this.f134607i)) {
            this.f134600b.setTextColor(this.f134606h.color(b1c0.f72545e));
            this.f134601c.setTextColor(this.f134606h.color(b1c0.f72541c));
            this.f134603e.setPageColor(Color.parseColor("#26000000"));
            this.f134603e.setFillColor(Color.parseColor("#F482CE"));
            this.f134604f.setNormalColor(Color.parseColor("#26000000"));
            this.f134604f.setSelectedColor(Color.parseColor("#F482CE"));
            return;
        }
        if (!sab0.m182906x(this.f134607i)) {
            this.f134603e.setFillColor(Color.parseColor("#E19971"));
            this.f134603e.setPageColor(Color.parseColor("#2a000000"));
            return;
        }
        this.f134600b.setTextColor(this.f134606h.color(b1c0.f72545e));
        this.f134601c.setTextColor(this.f134606h.color(b1c0.f72541c));
        this.f134603e.setPageColor(Color.parseColor("#26000000"));
        this.f134603e.setFillColor(Color.parseColor("#BCE46A"));
        this.f134604f.setNormalColor(Color.parseColor("#26000000"));
        this.f134604f.setSelectedColor(Color.parseColor("#BCE46A"));
    }

    @Override // p149l.r0m
    /* JADX INFO: renamed from: a */
    public View mo155367a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f134606h.inflater().inflate(m6c0.f131648t2, viewGroup, false);
        m155370f(viewInflate);
        this.f134600b.getPaint().setFakeBoldText(true);
        this.f134601c.getPaint().setFakeBoldText(true);
        m155366h();
        C18501b c18501b = new C18501b();
        this.f134608j = c18501b;
        this.f134602d.setAdapter(c18501b);
        this.f134603e.setViewPager(this.f134602d);
        if (sab0.m182897o(this.f134607i)) {
            this.f134600b.setTextColor(this.f134606h.color(b1c0.f72583z));
            this.f134601c.setTextColor(this.f134606h.color(b1c0.f72512B));
            xdl0.m208383k(this.f134600b, this.f134606h.getResources().getDrawable(d3c0.f84198z6));
            return viewInflate;
        }
        if (sab0.m182891i(this.f134607i) || sab0.m182892j(this.f134607i)) {
            this.f134600b.setTextColor(Color.parseColor("#E8CA8A"));
            this.f134601c.setTextColor(Color.parseColor("#60E8CA8A"));
            xdl0.m208383k(this.f134600b, this.f134606h.getResources().getDrawable(d3c0.f84184y6));
            return viewInflate;
        }
        if (sab0.m182898p(this.f134607i)) {
            this.f134600b.setTextColor(Color.parseColor("#E8CA8A"));
            this.f134601c.setTextColor(Color.parseColor("#60E8CA8A"));
            return viewInflate;
        }
        if (sab0.m182889g(this.f134607i)) {
            xdl0.m208383k(this.f134600b, this.f134606h.getResources().getDrawable(d3c0.f83737S));
            return viewInflate;
        }
        boolean zM182906x = sab0.m182906x(this.f134607i);
        VText vText = this.f134600b;
        if (zM182906x) {
            xdl0.m208383k(vText, this.f134606h.getResources().getDrawable(d3c0.f84087r7));
            return viewInflate;
        }
        xdl0.m208383k(vText, this.f134606h.getResources().getDrawable(d3c0.f84076qa));
        return viewInflate;
    }

    @Override // p149l.r0m
    /* JADX INFO: renamed from: b */
    public void mo155368b(C8765d c8765d) {
        this.f134610l = c8765d;
    }

    @Override // p149l.r0m
    /* JADX INFO: renamed from: c */
    public void mo155369c(List<wx80> list) {
        this.f134611m = list;
        if (list.isEmpty()) {
            this.f134600b.setVisibility(8);
            this.f134601c.setVisibility(8);
        } else if (sab0.m182889g(this.f134607i) && list.get(0).m205973y()) {
            this.f134600b.setTypeface(eqh0.m117752c(3));
            this.f134600b.setVisibility(0);
            this.f134601c.setVisibility(0);
            this.f134600b.setText("开通她专享会员");
            this.f134601c.setText("畅享安心交友体验");
        } else if (sab0.m182906x(this.f134607i) && list.get(0).m205973y()) {
            this.f134600b.setTypeface(eqh0.m117752c(3));
            this.f134600b.setVisibility(0);
            this.f134601c.setVisibility(0);
            this.f134600b.setText("开通青春专享会员");
            this.f134601c.setText("结交同龄好友，畅享青春生活");
        } else if (list.get(0).m205972x()) {
            this.f134600b.setText("解锁白金会员");
            this.f134601c.setText(String.format(g6a.m124570s() ? "享抢先告白等%s项特权" : "享置顶喜欢等%s项特权", Integer.valueOf(PurchaseType.TYPE_O_PLATINUM.getPrivilegeData(null).size())));
            this.f134600b.setTypeface(eqh0.m117752c(3));
            this.f134600b.setVisibility(0);
            this.f134601c.setVisibility(0);
        } else if (list.get(0).m205917B()) {
            this.f134600b.setText("解锁黑金会员");
            this.f134601c.setText("尊享探探全平台权益");
            this.f134600b.setTypeface(eqh0.m117752c(3));
            this.f134600b.setVisibility(0);
            this.f134601c.setVisibility(0);
        } else if (list.get(0).m205916A()) {
            this.f134600b.setTypeface(eqh0.m117752c(3));
            this.f134600b.setVisibility(0);
            this.f134601c.setVisibility(0);
            this.f134600b.setText(R$string.f27623v);
            this.f134601c.setText(String.format(this.f134606h.string(R$string.f27612u), Integer.valueOf(list.size())));
        } else if (list.get(0).m205971w()) {
            this.f134600b.setText(ura.m195053e().m195057d().mo33716Lc() ? "开通每日精选特权" : "开通每日心动特权");
            this.f134600b.setTypeface(eqh0.m117752c(3));
            this.f134600b.setVisibility(0);
            this.f134601c.setVisibility(8);
        } else if (list.get(0).m205974z()) {
            this.f134600b.setText("开通SVIP+权益包");
            this.f134600b.setTypeface(eqh0.m117752c(3));
            this.f134600b.setVisibility(0);
            this.f134601c.setText((ura.m195053e().m195057d().mo33716Lc() ? "每日精选" : "每日心动").concat("+SVIP14项特权"));
            this.f134601c.setVisibility(0);
        } else if (sab0.m182898p(this.f134607i) && list.get(0).m205973y()) {
            this.f134600b.setText("获取私人定制特权");
            this.f134600b.setTypeface(eqh0.m117752c(3));
            this.f134600b.setVisibility(0);
            this.f134601c.setVisibility(8);
        } else if (sab0.m182892j(this.f134607i) && list.get(0).m205973y()) {
            this.f134600b.setText("开通黑金会员+权益包");
            this.f134601c.setText("私人定制+黑金会员全部特权");
            this.f134600b.setTypeface(eqh0.m117752c(3));
            this.f134600b.setVisibility(0);
            this.f134601c.setVisibility(0);
        } else {
            this.f134600b.setVisibility(8);
            this.f134601c.setVisibility(8);
        }
        xdl0.m208344M(this.f134603e, list.size() > 1);
        this.f134602d.m4185d(new C18500a());
        this.f134608j.m155376j(list);
        m155374k(list);
    }

    /* JADX INFO: renamed from: f */
    public final void m155370f(View view) {
        nmd0.m160088a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m155371g() {
        c4g0 c4g0Var = this.f134609k;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f134609k = C22306c.interval(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.kmd0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f123784a.m155372i((Long) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.lmd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128782a.m155373j((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m155372i(Long l2) {
        return Boolean.valueOf(this.f134611m != null);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m155373j(Long l2) {
        int currentItem = this.f134602d.getCurrentItem();
        int size = this.f134611m.size() - 1;
        VPager vPager = this.f134602d;
        if (currentItem == size) {
            vPager.m4176T(0, true);
        } else {
            vPager.m4176T(vPager.getCurrentItem() + 1, true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m155374k(List<wx80> list) {
        if (!sab0.m182891i(this.f134607i) && !sab0.m182898p(this.f134607i) && !sab0.m182892j(this.f134607i)) {
            xdl0.m208344M(this.f134599a, false);
            return;
        }
        xdl0.m208344M(this.f134599a, true);
        if (vwb.m200296J(list) || !(list.get(0).m205916A() || list.get(0).m205971w() || list.get(0).m205974z() || list.get(0).m205917B() || list.get(0).m205973y())) {
            this.f134599a.setImageResource(d3c0.f83702P4);
        } else {
            this.f134599a.setImageResource(d3c0.f84182y4);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m155375l() {
        if (!NullChecker.m81303a(this.f134609k) || this.f134609k.isUnsubscribed()) {
            return;
        }
        this.f134609k.unsubscribe();
        this.f134609k = null;
    }

    @Override // p149l.r0m
    public void release() {
        m155375l();
    }

    /* JADX INFO: renamed from: l.mmd0$a */
    public class C18500a implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        public int f134612a;

        /* JADX INFO: renamed from: b */
        public boolean f134613b;

        public C18500a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            if (this.f134612a == 1 && i == 2) {
                this.f134613b = true;
            } else if (i == 0) {
                this.f134613b = false;
            }
            this.f134612a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (this.f134613b) {
                mmd0.this.m155375l();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
