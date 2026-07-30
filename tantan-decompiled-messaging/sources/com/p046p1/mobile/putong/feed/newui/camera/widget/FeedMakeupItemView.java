package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bch;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMakeupItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedMakeupItemView f39600a;

    /* JADX INFO: renamed from: b */
    public ImageView f39601b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f39602c;

    /* JADX INFO: renamed from: d */
    public ImageView f39603d;

    /* JADX INFO: renamed from: e */
    public VText f39604e;

    /* JADX INFO: renamed from: f */
    public TextView f39605f;

    public FeedMakeupItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m61496a(View view) {
        bch.m101062a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m61497b(MakeUpMenuView.MakeupCategory makeupCategory, boolean z) {
        xdl0.m208345M0(this.f39601b, true);
        xdl0.m208345M0(this.f39602c, false);
        xdl0.m208345M0(this.f39605f, !makeupCategory.isNone());
        xdl0.m208345M0(this.f39604e, true);
        xdl0.m208345M0(this.f39603d, false);
        ImageView imageView = this.f39601b;
        if (z) {
            imageView.setImageResource(makeupCategory.selectedImgId);
        } else {
            imageView.setImageResource(makeupCategory.normalImgId);
        }
        this.f39601b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f39604e.setText(makeupCategory.name);
        this.f39605f.setText(String.valueOf((int) (makeupCategory.all * 100.0f)));
    }

    /* JADX INFO: renamed from: c */
    public void m61498c(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z) {
        xdl0.m208345M0(this.f39601b, true);
        xdl0.m208345M0(this.f39602c, false);
        xdl0.m208345M0(this.f39605f, false);
        xdl0.m208345M0(this.f39603d, false);
        xdl0.m208345M0(this.f39604e, true);
        this.f39601b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ImageView imageView = this.f39601b;
        if (z) {
            imageView.setImageResource(makeupItem.selectedImgId);
        } else {
            imageView.setImageResource(makeupItem.normalImgId);
        }
        this.f39604e.setText(makeupItem.name);
    }

    /* JADX INFO: renamed from: d */
    public void m61499d(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        xdl0.m208345M0(this.f39602c, true);
        xdl0.m208345M0(this.f39601b, true);
        xdl0.m208345M0(this.f39605f, z2);
        xdl0.m208345M0(this.f39603d, z);
        xdl0.m208345M0(this.f39604e, true);
        if (makeupItem.isLocal()) {
            xdl0.m208345M0(this.f39601b, false);
            xdl0.m208345M0(this.f39602c, true);
            this.f39602c.setActualImageResource(makeupItem.normalImgId);
        } else if (TextUtils.isEmpty(makeupItem.icon)) {
            xdl0.m208345M0(this.f39602c, false);
            this.f39601b.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f39601b.setImageResource(makeupItem.normalImgId);
        } else {
            xdl0.m208345M0(this.f39601b, false);
            qib0.f154691G.m102331L0(this.f39602c, makeupItem.icon);
        }
        this.f39604e.setText(makeupItem.name);
        this.f39605f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    /* JADX INFO: renamed from: e */
    public void m61500e(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        xdl0.m208345M0(this.f39605f, z2);
        xdl0.m208345M0(this.f39603d, false);
        xdl0.m208345M0(this.f39604e, true);
        xdl0.m208345M0(this.f39601b, true);
        xdl0.m208345M0(this.f39602c, false);
        ImageView imageView = this.f39601b;
        if (z) {
            imageView.setImageResource(makeupItem.selectedImgId);
        } else {
            imageView.setImageResource(makeupItem.normalImgId);
        }
        this.f39601b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f39604e.setText(makeupItem.name);
        this.f39605f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61496a(this);
    }

    public void setValue(int i) {
        xdl0.m208345M0(this.f39605f, true);
        this.f39605f.setText(String.valueOf(i));
    }

    public FeedMakeupItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedMakeupItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
