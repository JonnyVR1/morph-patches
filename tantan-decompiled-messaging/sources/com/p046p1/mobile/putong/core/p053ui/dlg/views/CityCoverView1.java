package com.p046p1.mobile.putong.core.p053ui.dlg.views;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.CityCBanner;
import p147v.VDraweeView;
import p147v.VPagerCircleIndicator;
import p147v.VText;
import p149l.d30;
import p149l.eb2;
import p149l.eqh0;
import p149l.o6j0;
import p149l.pc8;
import p149l.qib0;
import p149l.r45;
import p149l.xaj0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class CityCoverView1 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverView1 f29031a;

    /* JADX INFO: renamed from: b */
    public ViewPager f29032b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f29033c;

    /* JADX INFO: renamed from: d */
    public VText f29034d;

    /* JADX INFO: renamed from: e */
    public VText f29035e;

    /* JADX INFO: renamed from: f */
    public VText f29036f;

    /* JADX INFO: renamed from: g */
    public int f29037g;

    /* JADX INFO: renamed from: h */
    public CountDownTimer f29038h;

    /* JADX INFO: renamed from: i */
    public d30 f29039i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public CityCBanner f29040j;

    /* JADX INFO: renamed from: k */
    public final ViewPager.InterfaceC0716j f29041k;

    /* JADX INFO: renamed from: l */
    public xaj0<String, String, String>[] f29042l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView1$a */
    public class C8315a implements ViewPager.InterfaceC0716j {
        public C8315a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            CityCoverView1.this.f29037g = i;
            CityCoverView1 cityCoverView1 = CityCoverView1.this;
            cityCoverView1.setTitleAndSub(cityCoverView1.getCurrentIndex());
            CityCoverView1.this.m45231k();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView1$b */
    public class ViewOnClickListenerC8316b implements View.OnClickListener {
        public ViewOnClickListenerC8316b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o6j0.m162859c("e_city_cover_go_up", "p_city_cover_feature_show", new o6j0.C18854a[0]);
            if (CityCoverView1.this.f29039i != null) {
                CityCoverView1.this.f29039i.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView1$c */
    public class CountDownTimerC8317c extends CountDownTimer {
        public CountDownTimerC8317c(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CityCoverView1.this.f29037g++;
            CityCoverView1 cityCoverView1 = CityCoverView1.this;
            cityCoverView1.f29032b.setCurrentItem(cityCoverView1.getCurrentIndex());
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView1$d */
    public class C8318d extends eb2 {
        public C8318d() {
        }

        @Override // p149l.w660
        public int getCount() {
            return CityCoverView1.this.f29042l.length;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            VDraweeView vDraweeView = new VDraweeView(viewGroup.getContext());
            vDraweeView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            qib0.f154691G.m102331L0(vDraweeView, CityCoverView1.this.f29042l[i].f191753c);
            viewGroup.addView(vDraweeView, new ViewGroup.LayoutParams(-1, -1));
            return vDraweeView;
        }
    }

    public CityCoverView1(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29037g = 0;
        this.f29041k = new C8315a();
        this.f29042l = new xaj0[]{pc8.m168319w0("占领全城首卡", "24小时内，全%s所有女生看到的首卡都是你", "https://auto.tancdn.com/v1/images/eyJpZCI6IkpOWkNVM01MQldCV1hPUEVPTDNCQVZVVzIyQ1hSTjE0IiwidyI6ODg1LCJoIjo5MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MDcwMzYxMTk0OTQ3Nzk2ODd9.png"), pc8.m168319w0("置顶专属名片", "霸占全城女性的消息页顶部，独享全城聚光灯", "https://auto.tancdn.com/v1/images/eyJpZCI6IjZMNzY3TlEyUkpTSFZZMkpSVjdSMzVEQjJWWDdBVDE0IiwidyI6ODg1LCJoIjo5MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTE1NDk0MTgwMjI4MDIwNn0.png")};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentIndex() {
        return this.f29037g % this.f29042l.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleAndSub(int i) {
        xaj0<String, String, String>[] xaj0VarArr = this.f29042l;
        if (i >= xaj0VarArr.length) {
            i = 0;
        }
        xaj0<String, String, String> xaj0Var = xaj0VarArr[i];
        this.f29034d.setText(xaj0Var.f191751a);
        if (i != 0) {
            this.f29035e.setText(xaj0Var.f191752b);
        } else {
            CityCBanner cityCBanner = this.f29040j;
            this.f29035e.setText(String.format(xaj0Var.f191752b, (cityCBanner == null || TextUtils.isEmpty(cityCBanner.cityName)) ? "城市" : this.f29040j.cityName));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m45227g(View view) {
        r45.m177772a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m45228h() {
        CountDownTimer countDownTimer = this.f29038h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m45229i() {
        this.f29032b.setAdapter(new C8318d());
        this.f29033c.setViewPager(this.f29032b);
        this.f29032b.m4185d(this.f29041k);
    }

    /* JADX INFO: renamed from: j */
    public void m45230j(CityCBanner cityCBanner, d30 d30Var) {
        this.f29039i = d30Var;
        this.f29040j = cityCBanner;
        m45231k();
        setTitleAndSub(0);
        o6j0.m162864h("e_city_cover_go_up", "p_city_cover_feature_show", new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: k */
    public final void m45231k() {
        CountDownTimer countDownTimer = this.f29038h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimerC8317c countDownTimerC8317c = new CountDownTimerC8317c(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        this.f29038h = countDownTimerC8317c;
        countDownTimerC8317c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m45228h();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45227g(this);
        this.f29034d.setTypeface(eqh0.m117752c(3), 1);
        this.f29036f.setTypeface(eqh0.m117752c(3), 1);
        m45229i();
        xdl0.m208329E0(this.f29036f, new ViewOnClickListenerC8316b());
    }

    public CityCoverView1(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CityCoverView1(@NonNull Context context) {
        this(context, null);
    }
}
