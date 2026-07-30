package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.f3c0;
import p149l.qib0;
import p149l.vqw;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class MakeupDownloadItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MakeupDownloadItemView f39764a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f39765b;

    /* JADX INFO: renamed from: c */
    public ImageView f39766c;

    /* JADX INFO: renamed from: d */
    public ImageView f39767d;

    /* JADX INFO: renamed from: e */
    public VText f39768e;

    /* JADX INFO: renamed from: f */
    public VText f39769f;

    /* JADX INFO: renamed from: g */
    public AnimationDrawable f39770g;

    public MakeupDownloadItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m61678a(View view) {
        vqw.m199604a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m61679b(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z) {
        xdl0.m208344M(this.f39765b, true);
        xdl0.m208344M(this.f39769f, false);
        xdl0.m208344M(this.f39767d, false);
        xdl0.m208344M(this.f39768e, true);
        xdl0.m208344M(this.f39766c, false);
        this.f39765b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        VDraweeView vDraweeView = this.f39765b;
        if (z) {
            vDraweeView.setActualImageResource(makeupItem.selectedImgId);
        } else {
            vDraweeView.setActualImageResource(makeupItem.normalImgId);
        }
        this.f39768e.setText(makeupItem.name);
    }

    /* JADX INFO: renamed from: c */
    public void m61680c(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        xdl0.m208344M(this.f39765b, true);
        xdl0.m208344M(this.f39769f, z2);
        xdl0.m208344M(this.f39767d, z);
        xdl0.m208344M(this.f39768e, true);
        if (makeupItem.hasModelFile || makeupItem.state != 1) {
            int i = makeupItem.state;
            if (i == 2) {
                xdl0.m208344M(this.f39766c, true);
                this.f39766c.setImageResource(f3c0.f94537i0);
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f39766c.getDrawable();
                this.f39770g = animationDrawable;
                animationDrawable.start();
            } else if (i == 4) {
                if (NullChecker.m81303a(this.f39770g)) {
                    this.f39770g.stop();
                }
                xdl0.m208344M(this.f39766c, true);
                this.f39766c.setImageResource(f3c0.f94529h0);
            } else {
                this.f39766c.setVisibility(8);
                if (NullChecker.m81303a(this.f39770g)) {
                    this.f39770g.stop();
                }
            }
        } else {
            xdl0.m208344M(this.f39766c, true);
            this.f39766c.setImageResource(f3c0.f94529h0);
        }
        if (TextUtils.isEmpty(makeupItem.icon)) {
            this.f39765b.setActualImageResource(makeupItem.normalImgId);
        } else {
            qib0.f154691G.m102331L0(this.f39765b, makeupItem.icon);
        }
        this.f39765b.setBackgroundResource(f3c0.f94505e0);
        this.f39768e.setText(makeupItem.name);
        this.f39769f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61678a(this);
    }

    public MakeupDownloadItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MakeupDownloadItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
