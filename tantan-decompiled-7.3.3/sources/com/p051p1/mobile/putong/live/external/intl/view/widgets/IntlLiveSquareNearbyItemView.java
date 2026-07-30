package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.live.base.data.BLiveLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p051p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.fc2;
import p153l.jyb;
import p153l.p7o;
import p153l.qcj;
import p153l.xau;
import p153l.y6u;
import p153l.ynp0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareNearbyItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveSquareMediaView f46677a;

    /* JADX INFO: renamed from: b */
    public VFrame f46678b;

    /* JADX INFO: renamed from: c */
    public IntlLiveSpecialLabelView f46679c;

    /* JADX INFO: renamed from: d */
    public LiveNewOptLabelView f46680d;

    /* JADX INFO: renamed from: e */
    public VText f46681e;

    /* JADX INFO: renamed from: f */
    public VText f46682f;

    /* JADX INFO: renamed from: g */
    public VText f46683g;

    /* JADX INFO: renamed from: h */
    public VText f46684h;

    public IntlLiveSquareNearbyItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m71537b(View view) {
        p7o.m171159a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m71538c(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            bnl0.m105525M0(this.f46684h, false);
            return;
        }
        String strM214503g = y6u.m214503g(d);
        bnl0.m105525M0(this.f46684h, !TextUtils.isEmpty(strM214503g));
        this.f46684h.setText(strM214503g);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m71539d(@NonNull Location location) {
        return location.distance >= 100000;
    }

    /* JADX INFO: renamed from: e */
    public void m71540e(@Nullable final BLiveSuggestLabel bLiveSuggestLabel, BLiveSettings bLiveSettings) {
        VText vText = this.f46681e;
        if (bLiveSuggestLabel == null) {
            bnl0.m105524M(vText, false);
            return;
        }
        bnl0.m105525M0(vText, true);
        this.f46681e.setText(bLiveSuggestLabel.value);
        BLiveLabel bLiveLabel = (BLiveLabel) jyb.m147529r(bLiveSettings.liveLabels, new qcj() { // from class: l.o7o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveLabel) obj).f45240id.equals(bLiveSuggestLabel.templateId));
            }
        });
        if (bLiveLabel != null) {
            String strM216933j = ynp0.m216933j(bLiveLabel.textColor);
            this.f46681e.setTextSize(2, bLiveLabel.textSize);
            this.f46681e.setTextColor(Color.parseColor(strM216933j));
            this.f46681e.setBackground(fc2.m124980j(ynp0.m216917B(bLiveLabel.background.startColor), ynp0.m216917B(bLiveLabel.background.endColor), 4));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m71541f(boolean z) {
        bnl0.m105524M(this.f46678b, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71537b(this);
    }

    public void setDistance(@NonNull Location location) {
        String strM209914x = xau.m209914x(location);
        if (TextUtils.isEmpty(strM209914x)) {
            this.f46683g.setText("");
            return;
        }
        if (!bnl0.m105529O0(this.f46684h) || !m71539d(location)) {
            this.f46683g.setText(strM209914x);
            return;
        }
        if (strM209914x.length() > 4) {
            strM209914x = strM209914x.substring(0, 4).concat("...");
        }
        this.f46683g.setText(strM209914x);
    }

    public void setLiveName(String str) {
        this.f46682f.setText(str);
    }

    public IntlLiveSquareNearbyItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareNearbyItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
