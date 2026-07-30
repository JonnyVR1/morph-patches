package com.p000p1.mobile.putong.feed.newui.photoalbum.poi.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import p007l.e1c0;
import p007l.f3c0;
import p007l.ooh;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPoiDialogLocationItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedPoiDialogLocationItem f3744c;

    /* JADX INFO: renamed from: d */
    public ImageView f3745d;

    /* JADX INFO: renamed from: e */
    public VText f3746e;

    public FeedPoiDialogLocationItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m6112P(View view) {
        ooh.m12728a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public void m6113Q() {
        this.f3746e.setText("搜索位置");
        this.f3746e.setTextColor(getResources().getColor(e1c0.f7162s));
        this.f3745d.setImageResource(f3c0.f7575B3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public void m6114R(String str, boolean z) {
        this.f3746e.setText(str);
        VText vText = this.f3746e;
        if (z) {
            vText.setTextColor(getResources().getColor(e1c0.f7168y));
            this.f3745d.setImageResource(f3c0.f7676O4);
        } else {
            vText.setTextColor(getResources().getColor(e1c0.f7162s));
            this.f3745d.setImageResource(f3c0.f7683P4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6112P(this);
        this.f3746e.setTypeface((Typeface) null, 1);
    }

    public FeedPoiDialogLocationItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiDialogLocationItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
