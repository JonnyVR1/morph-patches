package com.p046p1.mobile.putong.core.p053ui.dlg.views;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CityCData;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VText;
import p149l.eqh0;
import p149l.l9b;
import p149l.mqi0;
import p149l.s45;

/* JADX INFO: loaded from: classes10.dex */
public class CityCoverView2 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverView2 f29047a;

    /* JADX INFO: renamed from: b */
    public CityCoverSmallCardView f29048b;

    /* JADX INFO: renamed from: c */
    public VText f29049c;

    /* JADX INFO: renamed from: d */
    public VText f29050d;

    /* JADX INFO: renamed from: e */
    public CityCData f29051e;

    /* JADX INFO: renamed from: f */
    public CountDownTimer f29052f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView2$a */
    public class CountDownTimerC8319a extends CountDownTimer {
        public CountDownTimerC8319a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CityCoverView2.this.m45234c();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            List<String> listM149006O = l9b.m149006O(j);
            if (listM149006O.size() == 6) {
                CityCoverView2.this.f29050d.setText(String.format("剩余时间:%s%s:%s%s:%s%s", listM149006O.get(0), listM149006O.get(1), listM149006O.get(2), listM149006O.get(3), listM149006O.get(4), listM149006O.get(5)));
            }
        }
    }

    public CityCoverView2(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m45232a(View view) {
        s45.m182207a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m45233b() {
        if (NullChecker.m81303a(this.f29052f)) {
            this.f29052f.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m45234c() {
        m45233b();
    }

    /* JADX INFO: renamed from: d */
    public void m45235d() {
        m45236e();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX INFO: renamed from: e */
    public final void m45236e() {
        long j;
        m45233b();
        long jM155944o = mqi0.m155944o();
        CityCData cityCData = this.f29051e;
        if (cityCData != null) {
            double d = cityCData.expireAt;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                j = (long) d;
                if (j < jM155944o) {
                    return;
                }
            } else {
                j = 0;
            }
        } else {
            j = 0;
        }
        CountDownTimerC8319a countDownTimerC8319a = new CountDownTimerC8319a(j - jM155944o, 1000L);
        this.f29052f = countDownTimerC8319a;
        countDownTimerC8319a.start();
    }

    public String getShowDesc() {
        Region region;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        Location location = userM169527p9.location;
        String str = "";
        if (location != null && (region = location.region) != null && !TextUtils.isEmpty(region.city)) {
            Region region2 = userM169527p9.location.region;
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
        m45234c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45232a(this);
        this.f29049c.setTypeface(eqh0.m117752c(3), 1);
    }

    public void setData(CityCData cityCData) {
        if (cityCData == null) {
            return;
        }
        this.f29051e = cityCData;
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(cityCData.userId);
        if (userM169430Pa != null) {
            this.f29048b.m45220b(userM169430Pa.m60124fp().url, userM169430Pa.name, getShowDesc());
        }
    }

    public CityCoverView2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CityCoverView2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
