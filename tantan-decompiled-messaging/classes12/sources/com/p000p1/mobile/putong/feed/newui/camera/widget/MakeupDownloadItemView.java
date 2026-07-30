package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.qib0;
import l.xdl0;
import p007l.f3c0;
import p007l.vqw;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MakeupDownloadItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MakeupDownloadItemView f1225a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1226b;

    /* JADX INFO: renamed from: c */
    public ImageView f1227c;

    /* JADX INFO: renamed from: d */
    public ImageView f1228d;

    /* JADX INFO: renamed from: e */
    public VText f1229e;

    /* JADX INFO: renamed from: f */
    public VText f1230f;

    /* JADX INFO: renamed from: g */
    public AnimationDrawable f1231g;

    public MakeupDownloadItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m2630a(View view) {
        vqw.m15555a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m2631b(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z) {
        xdl0.M(this.f1226b, true);
        xdl0.M(this.f1230f, false);
        xdl0.M(this.f1228d, false);
        xdl0.M(this.f1229e, true);
        xdl0.M(this.f1227c, false);
        this.f1226b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        VDraweeView vDraweeView = this.f1226b;
        if (z) {
            vDraweeView.setActualImageResource(makeupItem.selectedImgId);
        } else {
            vDraweeView.setActualImageResource(makeupItem.normalImgId);
        }
        this.f1229e.setText(makeupItem.name);
    }

    /* JADX INFO: renamed from: c */
    public void m2632c(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        xdl0.M(this.f1226b, true);
        xdl0.M(this.f1230f, z2);
        xdl0.M(this.f1228d, z);
        xdl0.M(this.f1229e, true);
        if (makeupItem.hasModelFile || makeupItem.state != 1) {
            int i = makeupItem.state;
            if (i == 2) {
                xdl0.M(this.f1227c, true);
                this.f1227c.setImageResource(f3c0.f7820i0);
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f1227c.getDrawable();
                this.f1231g = animationDrawable;
                animationDrawable.start();
            } else if (i == 4) {
                if (NullChecker.a(this.f1231g)) {
                    this.f1231g.stop();
                }
                xdl0.M(this.f1227c, true);
                this.f1227c.setImageResource(f3c0.f7812h0);
            } else {
                this.f1227c.setVisibility(8);
                if (NullChecker.a(this.f1231g)) {
                    this.f1231g.stop();
                }
            }
        } else {
            xdl0.M(this.f1227c, true);
            this.f1227c.setImageResource(f3c0.f7812h0);
        }
        if (TextUtils.isEmpty(makeupItem.icon)) {
            this.f1226b.setActualImageResource(makeupItem.normalImgId);
        } else {
            qib0.G.L0(this.f1226b, makeupItem.icon);
        }
        this.f1226b.setBackgroundResource(f3c0.f7788e0);
        this.f1229e.setText(makeupItem.name);
        this.f1230f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2630a(this);
    }

    public MakeupDownloadItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MakeupDownloadItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
