package com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import p149l.kv2;

/* JADX INFO: loaded from: classes5.dex */
public class BeautyMenuView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f51449d;

    /* JADX INFO: renamed from: e */
    public BeautyFilterView f51450e;

    /* JADX INFO: renamed from: f */
    public ImageView f51451f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f51452g;

    public BeautyMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75886h0(View view) {
        kv2.m147347a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75886h0(this);
    }

    public BeautyMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
