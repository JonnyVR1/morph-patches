package com.p051p1.mobile.putong.feed.newui.photoalbum.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import p151v.VLinear;
import p151v.VText;
import p153l.dqh;
import p153l.k9c0;
import p153l.lbc0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPoiDialogLocationItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedPoiDialogLocationItem f43131c;

    /* JADX INFO: renamed from: d */
    public ImageView f43132d;

    /* JADX INFO: renamed from: e */
    public VText f43133e;

    public FeedPoiDialogLocationItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m66194P(View view) {
        dqh.m117521a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m66195Q() {
        this.f43133e.setText("搜索位置");
        this.f43133e.setTextColor(getResources().getColor(k9c0.f124529s));
        this.f43132d.setImageResource(lbc0.f130810B3);
    }

    /* JADX INFO: renamed from: R */
    public void m66196R(String str, boolean z) {
        this.f43133e.setText(str);
        VText vText = this.f43133e;
        if (z) {
            vText.setTextColor(getResources().getColor(k9c0.f124535y));
            this.f43132d.setImageResource(lbc0.f130911O4);
        } else {
            vText.setTextColor(getResources().getColor(k9c0.f124529s));
            this.f43132d.setImageResource(lbc0.f130918P4);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66194P(this);
        this.f43133e.setTypeface(null, 1);
    }

    public FeedPoiDialogLocationItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiDialogLocationItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
