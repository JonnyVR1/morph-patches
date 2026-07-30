package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p153l.y33;

/* JADX INFO: loaded from: classes4.dex */
public class BlackDiamondBottomView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public BlackDiamondBottomView f49322a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49323b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f49324c;

    /* JADX INFO: renamed from: d */
    public View f49325d;

    public BlackDiamondBottomView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m73318a(View view) {
        y33.m214114a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73318a(this);
    }

    public BlackDiamondBottomView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BlackDiamondBottomView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
