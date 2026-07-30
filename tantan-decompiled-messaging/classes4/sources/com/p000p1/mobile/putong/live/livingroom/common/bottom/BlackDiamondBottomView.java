package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p002l.i33;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class BlackDiamondBottomView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public BlackDiamondBottomView f4516a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4517b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f4518c;

    /* JADX INFO: renamed from: d */
    public View f4519d;

    public BlackDiamondBottomView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m5608a(View view) {
        i33.m14988a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5608a(this);
    }

    public BlackDiamondBottomView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BlackDiamondBottomView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
