package com.p051p1.mobile.putong.core.p058ui.dlg.views;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CityCData;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VText;
import p153l.lyh0;
import p153l.pzi0;
import p153l.t55;
import p153l.yab;

/* JADX INFO: loaded from: classes2.dex */
public class CityCoverView2 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverView2 f29895a;

    /* JADX INFO: renamed from: b */
    public CityCoverSmallCardView f29896b;

    /* JADX INFO: renamed from: c */
    public VText f29897c;

    /* JADX INFO: renamed from: d */
    public VText f29898d;

    /* JADX INFO: renamed from: e */
    public CityCData f29899e;

    /* JADX INFO: renamed from: f */
    public CountDownTimer f29900f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView2$a */
    public class CountDownTimerC8482a extends CountDownTimer {
        public CountDownTimerC8482a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CityCoverView2.this.m46417c();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            List<String> listM214858O = yab.m214858O(j);
            if (listM214858O.size() == 6) {
                CityCoverView2.this.f29898d.setText(String.format("剩余时间:%s%s:%s%s:%s%s", listM214858O.get(0), listM214858O.get(1), listM214858O.get(2), listM214858O.get(3), listM214858O.get(4), listM214858O.get(5)));
            }
        }
    }

    public CityCoverView2(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m46415a(View view) {
        t55.m189375a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m46416b() {
        if (NullChecker.m82486a(this.f29900f)) {
            this.f29900f.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m46417c() {
        m46416b();
    }

    /* JADX INFO: renamed from: d */
    public void m46418d() {
        m46419e();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX INFO: renamed from: e */
    public final void m46419e() {
        long j;
        m46416b();
        long jM174454o = pzi0.m174454o();
        CityCData cityCData = this.f29899e;
        if (cityCData != null) {
            double d = cityCData.expireAt;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                j = (long) d;
                if (j < jM174454o) {
                    return;
                }
            } else {
                j = 0;
            }
        } else {
            j = 0;
        }
        CountDownTimerC8482a countDownTimerC8482a = new CountDownTimerC8482a(j - jM174454o, 1000L);
        this.f29900f = countDownTimerC8482a;
        countDownTimerC8482a.start();
    }

    public String getShowDesc() {
        Region region;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        Location location = userM116600p9.location;
        String str = "";
        if (location != null && (region = location.region) != null && !TextUtils.isEmpty(region.city)) {
            Region region2 = userM116600p9.location.region;
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
        m46417c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46415a(this);
        this.f29897c.setTypeface(lyh0.m156283c(3), 1);
    }

    public void setData(CityCData cityCData) {
        if (cityCData == null) {
            return;
        }
        this.f29899e = cityCData;
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(cityCData.userId);
        if (userM116503Pa != null) {
            this.f29896b.m46403b(userM116503Pa.m61308fp().url, userM116503Pa.name, getShowDesc());
        }
    }

    public CityCoverView2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CityCoverView2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
