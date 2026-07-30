package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.ibc0;

/* JADX INFO: loaded from: classes3.dex */
public class KeyboardFrameWithShadowOutside extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Drawable f32432a;

    public KeyboardFrameWithShadowOutside(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m50012a(Context context) {
        this.f32432a = context.getResources().getDrawable(ibc0.f113831J7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (CoreModule.f18273l.m143412i().mo180325G1()) {
            return;
        }
        if (this.f32432a == null) {
            m50012a(getContext());
        }
        Rect clipBounds = canvas.getClipBounds();
        Drawable drawable = this.f32432a;
        drawable.setBounds(clipBounds.left, clipBounds.top - drawable.getIntrinsicHeight(), clipBounds.right, clipBounds.top);
        this.f32432a.draw(canvas);
    }

    public KeyboardFrameWithShadowOutside(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardFrameWithShadowOutside(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
