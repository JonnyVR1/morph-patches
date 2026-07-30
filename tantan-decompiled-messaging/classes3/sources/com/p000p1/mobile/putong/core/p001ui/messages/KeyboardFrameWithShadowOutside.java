package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.CoreModule;
import l.c3c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class KeyboardFrameWithShadowOutside extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Drawable f1475a;

    public KeyboardFrameWithShadowOutside(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m1914a(Context context) {
        this.f1475a = context.getResources().getDrawable(c3c0.J7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (CoreModule.l.i().G1()) {
            return;
        }
        if (this.f1475a == null) {
            m1914a(getContext());
        }
        Rect clipBounds = canvas.getClipBounds();
        Drawable drawable = this.f1475a;
        drawable.setBounds(clipBounds.left, clipBounds.top - drawable.getIntrinsicHeight(), clipBounds.right, clipBounds.top);
        this.f1475a.draw(canvas);
    }

    public KeyboardFrameWithShadowOutside(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardFrameWithShadowOutside(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
