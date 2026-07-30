package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import p151v.VText;
import p153l.bnl0;
import p153l.fc2;
import p153l.jyb;
import p153l.ldc0;
import p153l.qcj;
import p153l.xec0;
import p153l.ynp0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSpecialLabelView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f46652a;

    public IntlLiveSpecialLabelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m71524b(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m71524b(Context context) {
        LayoutInflater.from(context).inflate(xec0.f193808P, (ViewGroup) this, true);
        this.f46652a = (VText) findViewById(ldc0.f131544e2);
    }

    /* JADX INFO: renamed from: c */
    public void m71525c() {
        bnl0.m105525M0(this, false);
    }

    /* JADX INFO: renamed from: d */
    public void m71526d(@Nullable final BLiveSuggestLabel bLiveSuggestLabel, BLiveSettings bLiveSettings) {
        if (bLiveSuggestLabel == null) {
            m71525c();
            return;
        }
        BLiveLabel bLiveLabel = (BLiveLabel) jyb.m147529r(bLiveSettings.liveLabels, new qcj() { // from class: l.m1o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveLabel) obj).f45240id.equals(bLiveSuggestLabel.templateId));
            }
        });
        if (bLiveLabel == null) {
            m71525c();
            return;
        }
        bnl0.m105525M0(this, true);
        this.f46652a.setText(bLiveSuggestLabel.value);
        String strM216933j = ynp0.m216933j(bLiveLabel.textColor);
        this.f46652a.setTextSize(2, bLiveLabel.textSize);
        this.f46652a.setTextColor(Color.parseColor(strM216933j));
        GradientDrawable gradientDrawableM124980j = fc2.m124980j(ynp0.m216917B(bLiveLabel.background.startColor), ynp0.m216917B(bLiveLabel.background.endColor), 6);
        this.f46652a.setBackground(gradientDrawableM124980j);
        gradientDrawableM124980j.setAlpha((int) (bLiveLabel.alpha * 255.0d));
    }

    public IntlLiveSpecialLabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m71524b(context);
    }
}
