package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.c3c0;

/* JADX INFO: loaded from: classes3.dex */
public class KeyboardFrameWithShadowOutside extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Drawable f31584a;

    public KeyboardFrameWithShadowOutside(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m48829a(Context context) {
        this.f31584a = context.getResources().getDrawable(c3c0.f78556J7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (CoreModule.f17554l.m94658i().mo158233G1()) {
            return;
        }
        if (this.f31584a == null) {
            m48829a(getContext());
        }
        Rect clipBounds = canvas.getClipBounds();
        Drawable drawable = this.f31584a;
        drawable.setBounds(clipBounds.left, clipBounds.top - drawable.getIntrinsicHeight(), clipBounds.right, clipBounds.top);
        this.f31584a.draw(canvas);
    }

    public KeyboardFrameWithShadowOutside(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardFrameWithShadowOutside(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
