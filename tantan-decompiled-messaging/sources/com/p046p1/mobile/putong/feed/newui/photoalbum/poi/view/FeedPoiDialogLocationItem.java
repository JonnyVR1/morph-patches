package com.p046p1.mobile.putong.feed.newui.photoalbum.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import p147v.VLinear;
import p147v.VText;
import p149l.e1c0;
import p149l.f3c0;
import p149l.ooh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPoiDialogLocationItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedPoiDialogLocationItem f42283c;

    /* JADX INFO: renamed from: d */
    public ImageView f42284d;

    /* JADX INFO: renamed from: e */
    public VText f42285e;

    public FeedPoiDialogLocationItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m65011P(View view) {
        ooh.m165257a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m65012Q() {
        this.f42285e.setText("搜索位置");
        this.f42285e.setTextColor(getResources().getColor(e1c0.f88806s));
        this.f42284d.setImageResource(f3c0.f94292B3);
    }

    /* JADX INFO: renamed from: R */
    public void m65013R(String str, boolean z) {
        this.f42285e.setText(str);
        VText vText = this.f42285e;
        if (z) {
            vText.setTextColor(getResources().getColor(e1c0.f88812y));
            this.f42284d.setImageResource(f3c0.f94393O4);
        } else {
            vText.setTextColor(getResources().getColor(e1c0.f88806s));
            this.f42284d.setImageResource(f3c0.f94400P4);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65011P(this);
        this.f42285e.setTypeface(null, 1);
    }

    public FeedPoiDialogLocationItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiDialogLocationItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
