package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.C2466R;
import p149l.bd50;
import p149l.gbl0;
import p149l.y6q0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ScrimInsetsFrameLayout extends FrameLayout {
    private boolean drawBottomInsetForeground;
    private boolean drawTopInsetForeground;

    @Nullable
    Drawable insetForeground;
    Rect insets;
    private Rect tempRect;

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tempRect = new Rect();
        this.drawTopInsetForeground = true;
        this.drawBottomInsetForeground = true;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C2466R.styleable.ScrimInsetsFrameLayout, i, C2466R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.insetForeground = typedArrayObtainStyledAttributes.getDrawable(C2466R.styleable.ScrimInsetsFrameLayout_insetForeground);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        gbl0.m125231y0(this, new bd50() { // from class: com.google.android.material.internal.ScrimInsetsFrameLayout.1
            @Override // p149l.bd50
            public y6q0 onApplyWindowInsets(View view, @NonNull y6q0 y6q0Var) {
                ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
                if (scrimInsetsFrameLayout.insets == null) {
                    scrimInsetsFrameLayout.insets = new Rect();
                }
                ScrimInsetsFrameLayout.this.insets.set(y6q0Var.m213183j(), y6q0Var.m213185l(), y6q0Var.m213184k(), y6q0Var.m213182i());
                ScrimInsetsFrameLayout.this.onInsetsChanged(y6q0Var);
                ScrimInsetsFrameLayout.this.setWillNotDraw(!y6q0Var.m213186m() || ScrimInsetsFrameLayout.this.insetForeground == null);
                gbl0.m125183a0(ScrimInsetsFrameLayout.this);
                return y6q0Var.m213176c();
            }
        });
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.insets == null || this.insetForeground == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.drawTopInsetForeground) {
            this.tempRect.set(0, 0, width, this.insets.top);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
        }
        if (this.drawBottomInsetForeground) {
            this.tempRect.set(0, height - this.insets.bottom, width, height);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
        }
        Rect rect = this.tempRect;
        Rect rect2 = this.insets;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.insetForeground.setBounds(this.tempRect);
        this.insetForeground.draw(canvas);
        Rect rect3 = this.tempRect;
        Rect rect4 = this.insets;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.insetForeground.setBounds(this.tempRect);
        this.insetForeground.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.insetForeground;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.insetForeground;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.drawBottomInsetForeground = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.drawTopInsetForeground = z;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.insetForeground = drawable;
    }

    public void onInsetsChanged(y6q0 y6q0Var) {
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@NonNull Context context) {
        this(context, null);
    }
}
