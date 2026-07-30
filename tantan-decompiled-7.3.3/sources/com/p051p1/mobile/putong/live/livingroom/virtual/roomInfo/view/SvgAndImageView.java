package com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.wo0;

/* JADX INFO: loaded from: classes5.dex */
public class SvgAndImageView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53574a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f53575b;

    public SvgAndImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m78658b();
    }

    /* JADX INFO: renamed from: a */
    public void m78657a() {
        AnimEffectPlayer animEffectPlayer = this.f53575b;
        if (animEffectPlayer == null || !animEffectPlayer.isAnimating()) {
            return;
        }
        this.f53575b.m69688o();
    }

    /* JADX INFO: renamed from: b */
    public final void m78658b() {
        this.f53574a = new VDraweeView(getContext());
        int i = bnl0.f77544e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        this.f53574a.setLayoutParams(layoutParams);
        addView(this.f53574a, layoutParams);
        this.f53575b = new AnimEffectPlayer(getContext());
        int i2 = bnl0.f77544e;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        this.f53575b.setLayoutParams(layoutParams2);
        addView(this.f53575b, layoutParams2);
    }

    /* JADX INFO: renamed from: c */
    public void m78659c(String str, String str2) {
        if (this.f53574a == null || TextUtils.isEmpty(str2)) {
            return;
        }
        izs.m142868s(str, this.f53574a, str2);
    }

    /* JADX INFO: renamed from: d */
    public void m78660d(String str, int i, wo0 wo0Var) {
        if (this.f53575b == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f53575b.m69682i(str, i, wo0Var, true);
    }

    /* JADX INFO: renamed from: e */
    public void m78661e(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            m78660d(str2, -1, null);
            bnl0.m105524M(this.f53574a, false);
            bnl0.m105524M(this.f53575b, true);
        } else if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(this.f53574a, false);
            bnl0.m105524M(this.f53575b, false);
        } else {
            m78659c("context_livingAct", str);
            bnl0.m105524M(this.f53574a, true);
            bnl0.m105524M(this.f53575b, false);
        }
    }

    public VDraweeView getDraweeView() {
        return this.f53574a;
    }

    public SvgAndImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SvgAndImageView(@NonNull Context context) {
        this(context, null);
    }
}
