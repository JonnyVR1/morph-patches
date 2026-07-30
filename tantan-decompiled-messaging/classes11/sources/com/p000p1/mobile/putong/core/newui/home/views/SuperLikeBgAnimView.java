package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.SVGAnimationView;
import l.cwg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SuperLikeBgAnimView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f2801a;

    public SuperLikeBgAnimView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m3226a(View view) {
        cwg0.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3226a(this);
    }

    public SuperLikeBgAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuperLikeBgAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
