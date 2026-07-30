package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.SVGAnimationView;
import p149l.cwg0;

/* JADX INFO: loaded from: classes11.dex */
public class SuperLikeBgAnimView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f24023a;

    public SuperLikeBgAnimView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m39208a(View view) {
        cwg0.m109046a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39208a(this);
    }

    public SuperLikeBgAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuperLikeBgAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
