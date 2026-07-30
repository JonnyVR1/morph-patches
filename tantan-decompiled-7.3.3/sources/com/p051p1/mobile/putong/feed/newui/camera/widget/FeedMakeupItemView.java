package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.qdh;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMakeupItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedMakeupItemView f40448a;

    /* JADX INFO: renamed from: b */
    public ImageView f40449b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f40450c;

    /* JADX INFO: renamed from: d */
    public ImageView f40451d;

    /* JADX INFO: renamed from: e */
    public VText f40452e;

    /* JADX INFO: renamed from: f */
    public TextView f40453f;

    public FeedMakeupItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m62680a(View view) {
        qdh.m176164a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m62681b(MakeUpMenuView.MakeupCategory makeupCategory, boolean z) {
        bnl0.m105525M0(this.f40449b, true);
        bnl0.m105525M0(this.f40450c, false);
        bnl0.m105525M0(this.f40453f, !makeupCategory.isNone());
        bnl0.m105525M0(this.f40452e, true);
        bnl0.m105525M0(this.f40451d, false);
        ImageView imageView = this.f40449b;
        if (z) {
            imageView.setImageResource(makeupCategory.selectedImgId);
        } else {
            imageView.setImageResource(makeupCategory.normalImgId);
        }
        this.f40449b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f40452e.setText(makeupCategory.name);
        this.f40453f.setText(String.valueOf((int) (makeupCategory.all * 100.0f)));
    }

    /* JADX INFO: renamed from: c */
    public void m62682c(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z) {
        bnl0.m105525M0(this.f40449b, true);
        bnl0.m105525M0(this.f40450c, false);
        bnl0.m105525M0(this.f40453f, false);
        bnl0.m105525M0(this.f40451d, false);
        bnl0.m105525M0(this.f40452e, true);
        this.f40449b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ImageView imageView = this.f40449b;
        if (z) {
            imageView.setImageResource(makeupItem.selectedImgId);
        } else {
            imageView.setImageResource(makeupItem.normalImgId);
        }
        this.f40452e.setText(makeupItem.name);
    }

    /* JADX INFO: renamed from: d */
    public void m62683d(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        bnl0.m105525M0(this.f40450c, true);
        bnl0.m105525M0(this.f40449b, true);
        bnl0.m105525M0(this.f40453f, z2);
        bnl0.m105525M0(this.f40451d, z);
        bnl0.m105525M0(this.f40452e, true);
        if (makeupItem.isLocal()) {
            bnl0.m105525M0(this.f40449b, false);
            bnl0.m105525M0(this.f40450c, true);
            this.f40450c.setActualImageResource(makeupItem.normalImgId);
        } else if (TextUtils.isEmpty(makeupItem.icon)) {
            bnl0.m105525M0(this.f40450c, false);
            this.f40449b.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f40449b.setImageResource(makeupItem.normalImgId);
        } else {
            bnl0.m105525M0(this.f40449b, false);
            uqb0.f180374G.m127115L0(this.f40450c, makeupItem.icon);
        }
        this.f40452e.setText(makeupItem.name);
        this.f40453f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    /* JADX INFO: renamed from: e */
    public void m62684e(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        bnl0.m105525M0(this.f40453f, z2);
        bnl0.m105525M0(this.f40451d, false);
        bnl0.m105525M0(this.f40452e, true);
        bnl0.m105525M0(this.f40449b, true);
        bnl0.m105525M0(this.f40450c, false);
        ImageView imageView = this.f40449b;
        if (z) {
            imageView.setImageResource(makeupItem.selectedImgId);
        } else {
            imageView.setImageResource(makeupItem.normalImgId);
        }
        this.f40449b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f40452e.setText(makeupItem.name);
        this.f40453f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62680a(this);
    }

    public void setValue(int i) {
        bnl0.m105525M0(this.f40453f, true);
        this.f40453f.setText(String.valueOf(i));
    }

    public FeedMakeupItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedMakeupItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
