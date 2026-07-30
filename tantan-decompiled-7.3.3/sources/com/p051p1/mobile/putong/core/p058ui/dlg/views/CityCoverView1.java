package com.p051p1.mobile.putong.core.p058ui.dlg.views;

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
import com.p051p1.mobile.putong.core.data.CityCBanner;
import p151v.VDraweeView;
import p151v.VPagerCircleIndicator;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.lb2;
import p153l.lyh0;
import p153l.s55;
import p153l.sfj0;
import p153l.td8;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes2.dex */
public class CityCoverView1 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverView1 f29879a;

    /* JADX INFO: renamed from: b */
    public ViewPager f29880b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f29881c;

    /* JADX INFO: renamed from: d */
    public VText f29882d;

    /* JADX INFO: renamed from: e */
    public VText f29883e;

    /* JADX INFO: renamed from: f */
    public VText f29884f;

    /* JADX INFO: renamed from: g */
    public int f29885g;

    /* JADX INFO: renamed from: h */
    public CountDownTimer f29886h;

    /* JADX INFO: renamed from: i */
    public x20 f29887i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public CityCBanner f29888j;

    /* JADX INFO: renamed from: k */
    public final ViewPager.InterfaceC0718j f29889k;

    /* JADX INFO: renamed from: l */
    public bkj0<String, String, String>[] f29890l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView1$a */
    public class C8478a implements ViewPager.InterfaceC0718j {
        public C8478a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            CityCoverView1.this.f29885g = i;
            CityCoverView1 cityCoverView1 = CityCoverView1.this;
            cityCoverView1.setTitleAndSub(cityCoverView1.getCurrentIndex());
            CityCoverView1.this.m46414k();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView1$b */
    public class ViewOnClickListenerC8479b implements View.OnClickListener {
        public ViewOnClickListenerC8479b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            sfj0.m185596c("e_city_cover_go_up", "p_city_cover_feature_show", new sfj0.C20032a[0]);
            if (CityCoverView1.this.f29887i != null) {
                CityCoverView1.this.f29887i.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView1$c */
    public class CountDownTimerC8480c extends CountDownTimer {
        public CountDownTimerC8480c(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CityCoverView1.this.f29885g++;
            CityCoverView1 cityCoverView1 = CityCoverView1.this;
            cityCoverView1.f29880b.setCurrentItem(cityCoverView1.getCurrentIndex());
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView1$d */
    public class C8481d extends lb2 {
        public C8481d() {
        }

        @Override // p153l.cf60
        public int getCount() {
            return CityCoverView1.this.f29890l.length;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            VDraweeView vDraweeView = new VDraweeView(viewGroup.getContext());
            vDraweeView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            uqb0.f180374G.m127115L0(vDraweeView, CityCoverView1.this.f29890l[i].f77083c);
            viewGroup.addView(vDraweeView, new ViewGroup.LayoutParams(-1, -1));
            return vDraweeView;
        }
    }

    public CityCoverView1(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29885g = 0;
        this.f29889k = new C8478a();
        this.f29890l = new bkj0[]{td8.m190613w0("占领全城首卡", "24小时内，全%s所有女生看到的首卡都是你", "https://auto.tancdn.com/v1/images/eyJpZCI6IkpOWkNVM01MQldCV1hPUEVPTDNCQVZVVzIyQ1hSTjE0IiwidyI6ODg1LCJoIjo5MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MDcwMzYxMTk0OTQ3Nzk2ODd9.png"), td8.m190613w0("置顶专属名片", "霸占全城女性的消息页顶部，独享全城聚光灯", "https://auto.tancdn.com/v1/images/eyJpZCI6IjZMNzY3TlEyUkpTSFZZMkpSVjdSMzVEQjJWWDdBVDE0IiwidyI6ODg1LCJoIjo5MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTE1NDk0MTgwMjI4MDIwNn0.png")};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentIndex() {
        return this.f29885g % this.f29890l.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleAndSub(int i) {
        bkj0<String, String, String>[] bkj0VarArr = this.f29890l;
        if (i >= bkj0VarArr.length) {
            i = 0;
        }
        bkj0<String, String, String> bkj0Var = bkj0VarArr[i];
        this.f29882d.setText(bkj0Var.f77081a);
        if (i != 0) {
            this.f29883e.setText(bkj0Var.f77082b);
        } else {
            CityCBanner cityCBanner = this.f29888j;
            this.f29883e.setText(String.format(bkj0Var.f77082b, (cityCBanner == null || TextUtils.isEmpty(cityCBanner.cityName)) ? "城市" : this.f29888j.cityName));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m46410g(View view) {
        s55.m184601a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m46411h() {
        CountDownTimer countDownTimer = this.f29886h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m46412i() {
        this.f29880b.setAdapter(new C8481d());
        this.f29881c.setViewPager(this.f29880b);
        this.f29880b.m4187d(this.f29889k);
    }

    /* JADX INFO: renamed from: j */
    public void m46413j(CityCBanner cityCBanner, x20 x20Var) {
        this.f29887i = x20Var;
        this.f29888j = cityCBanner;
        m46414k();
        setTitleAndSub(0);
        sfj0.m185601h("e_city_cover_go_up", "p_city_cover_feature_show", new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: k */
    public final void m46414k() {
        CountDownTimer countDownTimer = this.f29886h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimerC8480c countDownTimerC8480c = new CountDownTimerC8480c(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        this.f29886h = countDownTimerC8480c;
        countDownTimerC8480c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m46411h();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46410g(this);
        this.f29882d.setTypeface(lyh0.m156283c(3), 1);
        this.f29884f.setTypeface(lyh0.m156283c(3), 1);
        m46412i();
        bnl0.m105509E0(this.f29884f, new ViewOnClickListenerC8479b());
    }

    public CityCoverView1(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CityCoverView1(@NonNull Context context) {
        this(context, null);
    }
}
