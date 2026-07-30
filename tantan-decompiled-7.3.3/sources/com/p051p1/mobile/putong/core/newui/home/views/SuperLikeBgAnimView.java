package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.SVGAnimationView;
import p153l.k4h0;

/* JADX INFO: loaded from: classes11.dex */
public class SuperLikeBgAnimView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f24765a;

    public SuperLikeBgAnimView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m40211a(View view) {
        k4h0.m148244a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40211a(this);
    }

    public SuperLikeBgAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuperLikeBgAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
