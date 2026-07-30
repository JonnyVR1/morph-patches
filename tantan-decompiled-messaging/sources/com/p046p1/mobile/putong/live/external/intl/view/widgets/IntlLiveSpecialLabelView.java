package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveLabel;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import p147v.VText;
import p149l.f5c0;
import p149l.s6c0;
import p149l.uep0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSpecialLabelView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f45804a;

    public IntlLiveSpecialLabelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m70341b(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m70341b(Context context) {
        LayoutInflater.from(context).inflate(s6c0.f162694P, (ViewGroup) this, true);
        this.f45804a = (VText) findViewById(f5c0.f95087e2);
    }

    /* JADX INFO: renamed from: c */
    public void m70342c() {
        xdl0.m208345M0(this, false);
    }

    /* JADX INFO: renamed from: d */
    public void m70343d(@Nullable final BLiveSuggestLabel bLiveSuggestLabel, BLiveSettings bLiveSettings) {
        if (bLiveSuggestLabel == null) {
            m70342c();
            return;
        }
        BLiveLabel bLiveLabel = (BLiveLabel) vwb.m200346r(bLiveSettings.liveLabels, new w9j() { // from class: l.mzn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveLabel) obj).f44392id.equals(bLiveSuggestLabel.templateId));
            }
        });
        if (bLiveLabel == null) {
            m70342c();
            return;
        }
        xdl0.m208345M0(this, true);
        this.f45804a.setText(bLiveSuggestLabel.value);
        String strM193323j = uep0.m193323j(bLiveLabel.textColor);
        this.f45804a.setTextSize(2, bLiveLabel.textSize);
        this.f45804a.setTextColor(Color.parseColor(strM193323j));
        GradientDrawable gradientDrawableM213885j = yb2.m213885j(uep0.m193307B(bLiveLabel.background.startColor), uep0.m193307B(bLiveLabel.background.endColor), 6);
        this.f45804a.setBackground(gradientDrawableM213885j);
        gradientDrawableM213885j.setAlpha((int) (bLiveLabel.alpha * 255.0d));
    }

    public IntlLiveSpecialLabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m70341b(context);
    }
}
