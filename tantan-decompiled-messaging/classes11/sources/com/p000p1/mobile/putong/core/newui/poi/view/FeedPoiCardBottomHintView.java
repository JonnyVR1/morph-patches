package com.p000p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import l.snh;
import l.t100;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FeedPoiCardBottomHintView extends RelativeLayout {

    /* JADX INFO: renamed from: c */
    public static final int f5151c = t100.d(45.0f);

    /* JADX INFO: renamed from: a */
    public FeedPoiCardBottomHintView f5152a;

    /* JADX INFO: renamed from: b */
    public ImageView f5153b;

    public FeedPoiCardBottomHintView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7354a(View view) {
        snh.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public int m7355b(float f) {
        int i = f5151c;
        return ((int) (i * f)) - i;
    }

    /* JADX INFO: renamed from: c */
    public int m7356c(float f) {
        int i = f5151c;
        return i - ((int) (i * f));
    }

    /* JADX INFO: renamed from: d */
    public void m7357d(int i) {
        if (i == 1) {
            this.f5153b.setImageResource(x2c0.pj);
        } else if (i == 2) {
            this.f5153b.setImageResource(x2c0.oj);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7354a(this);
    }

    public FeedPoiCardBottomHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardBottomHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
