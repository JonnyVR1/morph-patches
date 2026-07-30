package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p149l.eu0;
import p149l.ku0;
import p149l.n0c0;
import p149l.nri0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    private final eu0 mBackgroundTintHelper;
    private final ku0 mImageHelper;

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(nri0.m160741b(context), attributeSet, i);
        eu0 eu0Var = new eu0(this);
        this.mBackgroundTintHelper = eu0Var;
        eu0Var.m118136e(attributeSet, i);
        ku0 ku0Var = new ku0(this);
        this.mImageHelper = ku0Var;
        ku0Var.m147232f(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            eu0Var.m118133b();
        }
        ku0 ku0Var = this.mImageHelper;
        if (ku0Var != null) {
            ku0Var.m147228b();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            return eu0Var.m118134c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            return eu0Var.m118135d();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        ku0 ku0Var = this.mImageHelper;
        if (ku0Var != null) {
            return ku0Var.m147229c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        ku0 ku0Var = this.mImageHelper;
        if (ku0Var != null) {
            return ku0Var.m147230d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.m147231e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            eu0Var.m118137f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            eu0Var.m118138g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ku0 ku0Var = this.mImageHelper;
        if (ku0Var != null) {
            ku0Var.m147228b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        ku0 ku0Var = this.mImageHelper;
        if (ku0Var != null) {
            ku0Var.m147228b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        this.mImageHelper.m147233g(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        ku0 ku0Var = this.mImageHelper;
        if (ku0Var != null) {
            ku0Var.m147228b();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            eu0Var.m118140i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            eu0Var.m118141j(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        ku0 ku0Var = this.mImageHelper;
        if (ku0Var != null) {
            ku0Var.m147234h(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        ku0 ku0Var = this.mImageHelper;
        if (ku0Var != null) {
            ku0Var.m147235i(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n0c0.f136496E);
    }

    public AppCompatImageButton(Context context) {
        this(context, null);
    }
}
