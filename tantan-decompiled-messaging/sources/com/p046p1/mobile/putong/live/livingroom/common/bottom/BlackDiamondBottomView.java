package com.p046p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p149l.i33;

/* JADX INFO: loaded from: classes4.dex */
public class BlackDiamondBottomView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public BlackDiamondBottomView f48474a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f48475b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f48476c;

    /* JADX INFO: renamed from: d */
    public View f48477d;

    public BlackDiamondBottomView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m72135a(View view) {
        i33.m134145a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72135a(this);
    }

    public BlackDiamondBottomView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BlackDiamondBottomView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
