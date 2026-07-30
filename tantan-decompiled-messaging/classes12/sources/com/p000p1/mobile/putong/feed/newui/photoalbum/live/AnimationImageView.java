package com.p000p1.mobile.putong.feed.newui.photoalbum.live;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AnimationImageView extends AppCompatImageView {
    public AnimationImageView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        Drawable drawable = getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        Drawable drawable = getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
