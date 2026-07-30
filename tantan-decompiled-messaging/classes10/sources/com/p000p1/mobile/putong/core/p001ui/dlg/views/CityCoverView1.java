package com.p000p1.mobile.putong.core.p001ui.dlg.views;

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
import com.p000p1.mobile.putong.core.data.CityCBanner;
import l.d30;
import l.eb2;
import l.eqh0;
import l.qib0;
import l.xaj0;
import l.xdl0;
import p003l.o6j0;
import p003l.pc8;
import p003l.r45;
import v.VDraweeView;
import v.VPagerCircleIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CityCoverView1 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverView1 f1425a;

    /* JADX INFO: renamed from: b */
    public ViewPager f1426b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f1427c;

    /* JADX INFO: renamed from: d */
    public VText f1428d;

    /* JADX INFO: renamed from: e */
    public VText f1429e;

    /* JADX INFO: renamed from: f */
    public VText f1430f;

    /* JADX INFO: renamed from: g */
    public int f1431g;

    /* JADX INFO: renamed from: h */
    public CountDownTimer f1432h;

    /* JADX INFO: renamed from: i */
    public d30 f1433i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public CityCBanner f1434j;

    /* JADX INFO: renamed from: k */
    public final ViewPager.j f1435k;

    /* JADX INFO: renamed from: l */
    public xaj0<String, String, String>[] f1436l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView1$a */
    public class C3090a implements ViewPager.j {
        public C3090a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            CityCoverView1.this.f1431g = i;
            CityCoverView1 cityCoverView1 = CityCoverView1.this;
            cityCoverView1.setTitleAndSub(cityCoverView1.getCurrentIndex());
            CityCoverView1.this.m2548k();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView1$b */
    public class ViewOnClickListenerC3091b implements View.OnClickListener {
        public ViewOnClickListenerC3091b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o6j0.m8403c("e_city_cover_go_up", "p_city_cover_feature_show", new o6j0.C3390a[0]);
            if (CityCoverView1.this.f1433i != null) {
                CityCoverView1.this.f1433i.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView1$c */
    public class CountDownTimerC3092c extends CountDownTimer {
        public CountDownTimerC3092c(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CityCoverView1.this.f1431g++;
            CityCoverView1 cityCoverView1 = CityCoverView1.this;
            cityCoverView1.f1426b.setCurrentItem(cityCoverView1.getCurrentIndex());
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView1$d */
    public class C3093d extends eb2 {
        public C3093d() {
        }

        public int getCount() {
            return CityCoverView1.this.f1436l.length;
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: o */
        public void m2549o(ViewGroup viewGroup, int i, Object obj) {
        }

        /* JADX INFO: renamed from: p */
        public Object m2550p(ViewGroup viewGroup, int i) {
            VDraweeView vDraweeView = new VDraweeView(viewGroup.getContext());
            vDraweeView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            qib0.G.L0(vDraweeView, (String) CityCoverView1.this.f1436l[i].c);
            viewGroup.addView((View) vDraweeView, new ViewGroup.LayoutParams(-1, -1));
            return vDraweeView;
        }
    }

    public CityCoverView1(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1431g = 0;
        this.f1435k = new C3090a();
        this.f1436l = new xaj0[]{pc8.m8731w0("占领全城首卡", "24小时内，全%s所有女生看到的首卡都是你", "https://auto.tancdn.com/v1/images/eyJpZCI6IkpOWkNVM01MQldCV1hPUEVPTDNCQVZVVzIyQ1hSTjE0IiwidyI6ODg1LCJoIjo5MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4MDcwMzYxMTk0OTQ3Nzk2ODd9.png"), pc8.m8731w0("置顶专属名片", "霸占全城女性的消息页顶部，独享全城聚光灯", "https://auto.tancdn.com/v1/images/eyJpZCI6IjZMNzY3TlEyUkpTSFZZMkpSVjdSMzVEQjJWWDdBVDE0IiwidyI6ODg1LCJoIjo5MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTE1NDk0MTgwMjI4MDIwNn0.png")};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentIndex() {
        return this.f1431g % this.f1436l.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleAndSub(int i) {
        xaj0<String, String, String>[] xaj0VarArr = this.f1436l;
        if (i >= xaj0VarArr.length) {
            i = 0;
        }
        xaj0<String, String, String> xaj0Var = xaj0VarArr[i];
        this.f1428d.setText((CharSequence) xaj0Var.a);
        if (i != 0) {
            this.f1429e.setText((CharSequence) xaj0Var.b);
        } else {
            CityCBanner cityCBanner = this.f1434j;
            this.f1429e.setText(String.format((String) xaj0Var.b, (cityCBanner == null || TextUtils.isEmpty(cityCBanner.cityName)) ? "城市" : this.f1434j.cityName));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2544g(View view) {
        r45.m9084a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m2545h() {
        CountDownTimer countDownTimer = this.f1432h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2546i() {
        this.f1426b.setAdapter(new C3093d());
        this.f1427c.setViewPager(this.f1426b);
        this.f1426b.d(this.f1435k);
    }

    /* JADX INFO: renamed from: j */
    public void m2547j(CityCBanner cityCBanner, d30 d30Var) {
        this.f1433i = d30Var;
        this.f1434j = cityCBanner;
        m2548k();
        setTitleAndSub(0);
        o6j0.m8408h("e_city_cover_go_up", "p_city_cover_feature_show", new o6j0.C3390a[0]);
    }

    /* JADX INFO: renamed from: k */
    public final void m2548k() {
        CountDownTimer countDownTimer = this.f1432h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimerC3092c countDownTimerC3092c = new CountDownTimerC3092c(5000L, 5000L);
        this.f1432h = countDownTimerC3092c;
        countDownTimerC3092c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2545h();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2544g(this);
        this.f1428d.setTypeface(eqh0.c(3), 1);
        this.f1430f.setTypeface(eqh0.c(3), 1);
        m2546i();
        xdl0.E0(this.f1430f, new ViewOnClickListenerC3091b());
    }

    public CityCoverView1(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CityCoverView1(@NonNull Context context) {
        this(context, null);
    }
}
