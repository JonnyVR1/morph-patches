package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import l.qib0;
import l.xdl0;
import p007l.bch;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMakeupItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedMakeupItemView f1061a;

    /* JADX INFO: renamed from: b */
    public ImageView f1062b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1063c;

    /* JADX INFO: renamed from: d */
    public ImageView f1064d;

    /* JADX INFO: renamed from: e */
    public VText f1065e;

    /* JADX INFO: renamed from: f */
    public TextView f1066f;

    public FeedMakeupItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m2448a(View view) {
        bch.m8798a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m2449b(MakeUpMenuView.MakeupCategory makeupCategory, boolean z) {
        xdl0.M0(this.f1062b, true);
        xdl0.M0(this.f1063c, false);
        xdl0.M0(this.f1066f, !makeupCategory.isNone());
        xdl0.M0(this.f1065e, true);
        xdl0.M0(this.f1064d, false);
        ImageView imageView = this.f1062b;
        if (z) {
            imageView.setImageResource(makeupCategory.selectedImgId);
        } else {
            imageView.setImageResource(makeupCategory.normalImgId);
        }
        this.f1062b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f1065e.setText(makeupCategory.name);
        this.f1066f.setText(String.valueOf((int) (makeupCategory.all * 100.0f)));
    }

    /* JADX INFO: renamed from: c */
    public void m2450c(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z) {
        xdl0.M0(this.f1062b, true);
        xdl0.M0(this.f1063c, false);
        xdl0.M0(this.f1066f, false);
        xdl0.M0(this.f1064d, false);
        xdl0.M0(this.f1065e, true);
        this.f1062b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ImageView imageView = this.f1062b;
        if (z) {
            imageView.setImageResource(makeupItem.selectedImgId);
        } else {
            imageView.setImageResource(makeupItem.normalImgId);
        }
        this.f1065e.setText(makeupItem.name);
    }

    /* JADX INFO: renamed from: d */
    public void m2451d(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        xdl0.M0(this.f1063c, true);
        xdl0.M0(this.f1062b, true);
        xdl0.M0(this.f1066f, z2);
        xdl0.M0(this.f1064d, z);
        xdl0.M0(this.f1065e, true);
        if (makeupItem.isLocal()) {
            xdl0.M0(this.f1062b, false);
            xdl0.M0(this.f1063c, true);
            this.f1063c.setActualImageResource(makeupItem.normalImgId);
        } else if (TextUtils.isEmpty(makeupItem.icon)) {
            xdl0.M0(this.f1063c, false);
            this.f1062b.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f1062b.setImageResource(makeupItem.normalImgId);
        } else {
            xdl0.M0(this.f1062b, false);
            qib0.G.L0(this.f1063c, makeupItem.icon);
        }
        this.f1065e.setText(makeupItem.name);
        this.f1066f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    /* JADX INFO: renamed from: e */
    public void m2452e(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        xdl0.M0(this.f1066f, z2);
        xdl0.M0(this.f1064d, false);
        xdl0.M0(this.f1065e, true);
        xdl0.M0(this.f1062b, true);
        xdl0.M0(this.f1063c, false);
        ImageView imageView = this.f1062b;
        if (z) {
            imageView.setImageResource(makeupItem.selectedImgId);
        } else {
            imageView.setImageResource(makeupItem.normalImgId);
        }
        this.f1062b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f1065e.setText(makeupItem.name);
        this.f1066f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2448a(this);
    }

    public void setValue(int i) {
        xdl0.M0(this.f1066f, true);
        this.f1066f.setText(String.valueOf(i));
    }

    public FeedMakeupItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedMakeupItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
