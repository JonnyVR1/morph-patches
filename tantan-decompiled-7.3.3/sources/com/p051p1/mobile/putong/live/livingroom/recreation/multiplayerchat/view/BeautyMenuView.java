package com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import p153l.aw2;

/* JADX INFO: loaded from: classes5.dex */
public class BeautyMenuView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f52297d;

    /* JADX INFO: renamed from: e */
    public BeautyFilterView f52298e;

    /* JADX INFO: renamed from: f */
    public ImageView f52299f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f52300g;

    public BeautyMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m77069h0(View view) {
        aw2.m100561a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77069h0(this);
    }

    public BeautyMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
