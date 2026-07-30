package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.ft5;
import p153l.mwi;

/* JADX INFO: loaded from: classes13.dex */
public class FollowActionPopupView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f41741a;

    /* JADX INFO: renamed from: b */
    public VFrame f41742b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f41743c;

    /* JADX INFO: renamed from: d */
    public TextView f41744d;

    /* JADX INFO: renamed from: e */
    public TextView f41745e;

    /* JADX INFO: renamed from: f */
    public VButton f41746f;

    /* JADX INFO: renamed from: g */
    public ft5 f41747g;

    public FollowActionPopupView(Context context) {
        super(context);
        this.f41747g = new ft5();
    }

    /* JADX INFO: renamed from: a */
    public final void m64313a(View view) {
        mwi.m160552a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41747g.m127299c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64313a(this);
        this.f41746f.getPaint().setFakeBoldText(true);
    }

    public FollowActionPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41747g = new ft5();
    }

    public FollowActionPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41747g = new ft5();
    }
}
