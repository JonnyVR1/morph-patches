package com.p051p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p153l.dbc0;
import p153l.hph;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardBottomHintView extends RelativeLayout {

    /* JADX INFO: renamed from: c */
    public static final int f27115c = qa00.m175859d(45.0f);

    /* JADX INFO: renamed from: a */
    public FeedPoiCardBottomHintView f27116a;

    /* JADX INFO: renamed from: b */
    public ImageView f27117b;

    public FeedPoiCardBottomHintView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m44150a(View view) {
        hph.m136527a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public int m44151b(float f) {
        int i = f27115c;
        return ((int) (i * f)) - i;
    }

    /* JADX INFO: renamed from: c */
    public int m44152c(float f) {
        int i = f27115c;
        return i - ((int) (i * f));
    }

    /* JADX INFO: renamed from: d */
    public void m44153d(int i) {
        if (i == 1) {
            this.f27117b.setImageResource(dbc0.f86928dk);
        } else if (i == 2) {
            this.f27117b.setImageResource(dbc0.f86895ck);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44150a(this);
    }

    public FeedPoiCardBottomHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardBottomHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
