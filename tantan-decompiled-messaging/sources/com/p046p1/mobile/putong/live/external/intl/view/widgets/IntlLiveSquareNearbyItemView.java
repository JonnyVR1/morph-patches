package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.live.base.data.BLiveLabel;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p046p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p147v.VFrame;
import p147v.VText;
import p149l.p5o;
import p149l.uep0;
import p149l.vwb;
import p149l.w8u;
import p149l.w9j;
import p149l.x4u;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareNearbyItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveSquareMediaView f45829a;

    /* JADX INFO: renamed from: b */
    public VFrame f45830b;

    /* JADX INFO: renamed from: c */
    public IntlLiveSpecialLabelView f45831c;

    /* JADX INFO: renamed from: d */
    public LiveNewOptLabelView f45832d;

    /* JADX INFO: renamed from: e */
    public VText f45833e;

    /* JADX INFO: renamed from: f */
    public VText f45834f;

    /* JADX INFO: renamed from: g */
    public VText f45835g;

    /* JADX INFO: renamed from: h */
    public VText f45836h;

    public IntlLiveSquareNearbyItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m70354b(View view) {
        p5o.m167512a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m70355c(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            xdl0.m208345M0(this.f45836h, false);
            return;
        }
        String strM207021g = x4u.m207021g(d);
        xdl0.m208345M0(this.f45836h, !TextUtils.isEmpty(strM207021g));
        this.f45836h.setText(strM207021g);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m70356d(@NonNull Location location) {
        return location.distance >= 100000;
    }

    /* JADX INFO: renamed from: e */
    public void m70357e(@Nullable final BLiveSuggestLabel bLiveSuggestLabel, BLiveSettings bLiveSettings) {
        VText vText = this.f45833e;
        if (bLiveSuggestLabel == null) {
            xdl0.m208344M(vText, false);
            return;
        }
        xdl0.m208345M0(vText, true);
        this.f45833e.setText(bLiveSuggestLabel.value);
        BLiveLabel bLiveLabel = (BLiveLabel) vwb.m200346r(bLiveSettings.liveLabels, new w9j() { // from class: l.o5o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveLabel) obj).f44392id.equals(bLiveSuggestLabel.templateId));
            }
        });
        if (bLiveLabel != null) {
            String strM193323j = uep0.m193323j(bLiveLabel.textColor);
            this.f45833e.setTextSize(2, bLiveLabel.textSize);
            this.f45833e.setTextColor(Color.parseColor(strM193323j));
            this.f45833e.setBackground(yb2.m213885j(uep0.m193307B(bLiveLabel.background.startColor), uep0.m193307B(bLiveLabel.background.endColor), 4));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m70358f(boolean z) {
        xdl0.m208344M(this.f45830b, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70354b(this);
    }

    public void setDistance(@NonNull Location location) {
        String strM202221x = w8u.m202221x(location);
        if (TextUtils.isEmpty(strM202221x)) {
            this.f45835g.setText("");
            return;
        }
        if (!xdl0.m208349O0(this.f45836h) || !m70356d(location)) {
            this.f45835g.setText(strM202221x);
            return;
        }
        if (strM202221x.length() > 4) {
            strM202221x = strM202221x.substring(0, 4).concat("...");
        }
        this.f45835g.setText(strM202221x);
    }

    public void setLiveName(String str) {
        this.f45834f.setText(str);
    }

    public IntlLiveSquareNearbyItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareNearbyItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
