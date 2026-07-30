package com.p046p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p149l.snh;
import p149l.t100;
import p149l.x2c0;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardBottomHintView extends RelativeLayout {

    /* JADX INFO: renamed from: c */
    public static final int f26373c = t100.m186890d(45.0f);

    /* JADX INFO: renamed from: a */
    public FeedPoiCardBottomHintView f26374a;

    /* JADX INFO: renamed from: b */
    public ImageView f26375b;

    public FeedPoiCardBottomHintView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m43139a(View view) {
        snh.m185067a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public int m43140b(float f) {
        int i = f26373c;
        return ((int) (i * f)) - i;
    }

    /* JADX INFO: renamed from: c */
    public int m43141c(float f) {
        int i = f26373c;
        return i - ((int) (i * f));
    }

    /* JADX INFO: renamed from: d */
    public void m43142d(int i) {
        if (i == 1) {
            this.f26375b.setImageResource(x2c0.f190462pj);
        } else if (i == 2) {
            this.f26375b.setImageResource(x2c0.f190430oj);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43139a(this);
    }

    public FeedPoiCardBottomHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardBottomHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
