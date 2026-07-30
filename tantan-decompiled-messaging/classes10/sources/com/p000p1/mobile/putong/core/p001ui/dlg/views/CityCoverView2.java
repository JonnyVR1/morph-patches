package com.p000p1.mobile.putong.core.p001ui.dlg.views;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.CityCData;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Region;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.eqh0;
import l.l9b;
import l.mqi0;
import p003l.s45;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CityCoverView2 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverView2 f1441a;

    /* JADX INFO: renamed from: b */
    public CityCoverSmallCardView f1442b;

    /* JADX INFO: renamed from: c */
    public VText f1443c;

    /* JADX INFO: renamed from: d */
    public VText f1444d;

    /* JADX INFO: renamed from: e */
    public CityCData f1445e;

    /* JADX INFO: renamed from: f */
    public CountDownTimer f1446f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView2$a */
    public class CountDownTimerC3094a extends CountDownTimer {
        public CountDownTimerC3094a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CityCoverView2.this.m2553c();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            List listO = l9b.O(j);
            if (listO.size() == 6) {
                CityCoverView2.this.f1444d.setText(String.format("剩余时间:%s%s:%s%s:%s%s", listO.get(0), listO.get(1), listO.get(2), listO.get(3), listO.get(4), listO.get(5)));
            }
        }
    }

    public CityCoverView2(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m2551a(View view) {
        s45.m9218a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m2552b() {
        if (NullChecker.a(this.f1446f)) {
            this.f1446f.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2553c() {
        m2552b();
    }

    /* JADX INFO: renamed from: d */
    public void m2554d() {
        m2555e();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX INFO: renamed from: e */
    public final void m2555e() {
        long j;
        m2552b();
        long jO = mqi0.o();
        CityCData cityCData = this.f1445e;
        if (cityCData != null) {
            double d = cityCData.expireAt;
            if (d > 0.0d) {
                j = (long) d;
                if (j < jO) {
                    return;
                }
            } else {
                j = 0;
            }
        } else {
            j = 0;
        }
        CountDownTimerC3094a countDownTimerC3094a = new CountDownTimerC3094a(j - jO, 1000L);
        this.f1446f = countDownTimerC3094a;
        countDownTimerC3094a.start();
    }

    public String getShowDesc() {
        Region region;
        User userP9 = CoreModule.c.e0.p9();
        Location location = userP9.location;
        String str = "";
        if (location != null && (region = location.region) != null && !TextUtils.isEmpty(region.city)) {
            Region region2 = userP9.location.region;
            String str2 = region2.city;
            String str3 = region2.district;
            str = TextUtils.isEmpty(str2) ? "" : str2;
            if (!TextUtils.isEmpty(str3) && !TextUtils.equals(str3, "null")) {
                str = str + str3;
            }
            str = str + "(1km)";
        }
        return !TextUtils.isEmpty(str) ? str.concat(".刚刚活跃") : "刚刚活跃";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2553c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2551a(this);
        this.f1443c.setTypeface(eqh0.c(3), 1);
    }

    public void setData(CityCData cityCData) {
        if (cityCData == null) {
            return;
        }
        this.f1445e = cityCData;
        User userPa = CoreModule.c.e0.Pa(cityCData.userId);
        if (userPa != null) {
            this.f1442b.m2537b(((Media) userPa.fp()).url, userPa.name, getShowDesc());
        }
    }

    public CityCoverView2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CityCoverView2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
