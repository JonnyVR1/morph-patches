package com.p046p1.mobile.putong.feed.newui.photoalbum.live;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes12.dex */
public class AnimationImageView extends AppCompatImageView {
    public AnimationImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        if (isAttachedToWindow() && (drawable instanceof AnimationDrawable)) {
            ((AnimationDrawable) drawable).start();
        }
    }

    public AnimationImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnimationImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
