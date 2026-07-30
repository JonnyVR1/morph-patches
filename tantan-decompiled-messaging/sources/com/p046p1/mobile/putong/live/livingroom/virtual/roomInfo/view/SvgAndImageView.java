package com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p149l.ap0;
import p149l.hxs;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class SvgAndImageView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52726a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f52727b;

    public SvgAndImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m77475b();
    }

    /* JADX INFO: renamed from: a */
    public void m77474a() {
        AnimEffectPlayer animEffectPlayer = this.f52727b;
        if (animEffectPlayer == null || !animEffectPlayer.isAnimating()) {
            return;
        }
        this.f52727b.m68505o();
    }

    /* JADX INFO: renamed from: b */
    public final void m77475b() {
        this.f52726a = new VDraweeView(getContext());
        int i = xdl0.f192403e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        this.f52726a.setLayoutParams(layoutParams);
        addView(this.f52726a, layoutParams);
        this.f52727b = new AnimEffectPlayer(getContext());
        int i2 = xdl0.f192403e;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        this.f52727b.setLayoutParams(layoutParams2);
        addView(this.f52727b, layoutParams2);
    }

    /* JADX INFO: renamed from: c */
    public void m77476c(String str, String str2) {
        if (this.f52726a == null || TextUtils.isEmpty(str2)) {
            return;
        }
        hxs.m133406s(str, this.f52726a, str2);
    }

    /* JADX INFO: renamed from: d */
    public void m77477d(String str, int i, ap0 ap0Var) {
        if (this.f52727b == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f52727b.m68499i(str, i, ap0Var, true);
    }

    /* JADX INFO: renamed from: e */
    public void m77478e(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            m77477d(str2, -1, null);
            xdl0.m208344M(this.f52726a, false);
            xdl0.m208344M(this.f52727b, true);
        } else if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(this.f52726a, false);
            xdl0.m208344M(this.f52727b, false);
        } else {
            m77476c("context_livingAct", str);
            xdl0.m208344M(this.f52726a, true);
            xdl0.m208344M(this.f52727b, false);
        }
    }

    public VDraweeView getDraweeView() {
        return this.f52726a;
    }

    public SvgAndImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SvgAndImageView(@NonNull Context context) {
        this(context, null);
    }
}
