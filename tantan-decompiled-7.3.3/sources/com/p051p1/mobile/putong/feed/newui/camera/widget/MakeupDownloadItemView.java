package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.lbc0;
import p153l.uqb0;
import p153l.utw;

/* JADX INFO: loaded from: classes13.dex */
public class MakeupDownloadItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MakeupDownloadItemView f40612a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f40613b;

    /* JADX INFO: renamed from: c */
    public ImageView f40614c;

    /* JADX INFO: renamed from: d */
    public ImageView f40615d;

    /* JADX INFO: renamed from: e */
    public VText f40616e;

    /* JADX INFO: renamed from: f */
    public VText f40617f;

    /* JADX INFO: renamed from: g */
    public AnimationDrawable f40618g;

    public MakeupDownloadItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m62862a(View view) {
        utw.m198110a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m62863b(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z) {
        bnl0.m105524M(this.f40613b, true);
        bnl0.m105524M(this.f40617f, false);
        bnl0.m105524M(this.f40615d, false);
        bnl0.m105524M(this.f40616e, true);
        bnl0.m105524M(this.f40614c, false);
        this.f40613b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        VDraweeView vDraweeView = this.f40613b;
        if (z) {
            vDraweeView.setActualImageResource(makeupItem.selectedImgId);
        } else {
            vDraweeView.setActualImageResource(makeupItem.normalImgId);
        }
        this.f40616e.setText(makeupItem.name);
    }

    /* JADX INFO: renamed from: c */
    public void m62864c(FeedMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        bnl0.m105524M(this.f40613b, true);
        bnl0.m105524M(this.f40617f, z2);
        bnl0.m105524M(this.f40615d, z);
        bnl0.m105524M(this.f40616e, true);
        if (makeupItem.hasModelFile || makeupItem.state != 1) {
            int i = makeupItem.state;
            if (i == 2) {
                bnl0.m105524M(this.f40614c, true);
                this.f40614c.setImageResource(lbc0.f131055i0);
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f40614c.getDrawable();
                this.f40618g = animationDrawable;
                animationDrawable.start();
            } else if (i == 4) {
                if (NullChecker.m82486a(this.f40618g)) {
                    this.f40618g.stop();
                }
                bnl0.m105524M(this.f40614c, true);
                this.f40614c.setImageResource(lbc0.f131047h0);
            } else {
                this.f40614c.setVisibility(8);
                if (NullChecker.m82486a(this.f40618g)) {
                    this.f40618g.stop();
                }
            }
        } else {
            bnl0.m105524M(this.f40614c, true);
            this.f40614c.setImageResource(lbc0.f131047h0);
        }
        if (TextUtils.isEmpty(makeupItem.icon)) {
            this.f40613b.setActualImageResource(makeupItem.normalImgId);
        } else {
            uqb0.f180374G.m127115L0(this.f40613b, makeupItem.icon);
        }
        this.f40613b.setBackgroundResource(lbc0.f131023e0);
        this.f40616e.setText(makeupItem.name);
        this.f40617f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62862a(this);
    }

    public MakeupDownloadItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MakeupDownloadItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
