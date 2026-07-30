package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p153l.ku0;
import p153l.q0j0;
import p153l.qu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    private final ku0 f618a;

    /* JADX INFO: renamed from: b */
    private final qu0 f619b;

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(q0j0.m174714b(context), attributeSet, i);
        ku0 ku0Var = new ku0(this);
        this.f618a = ku0Var;
        ku0Var.m151418e(attributeSet, i);
        qu0 qu0Var = new qu0(this);
        this.f619b = qu0Var;
        qu0Var.m178087f(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ku0 ku0Var = this.f618a;
        if (ku0Var != null) {
            ku0Var.m151415b();
        }
        qu0 qu0Var = this.f619b;
        if (qu0Var != null) {
            qu0Var.m178083b();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        ku0 ku0Var = this.f618a;
        if (ku0Var != null) {
            return ku0Var.m151416c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ku0 ku0Var = this.f618a;
        if (ku0Var != null) {
            return ku0Var.m151417d();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        qu0 qu0Var = this.f619b;
        if (qu0Var != null) {
            return qu0Var.m178084c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        qu0 qu0Var = this.f619b;
        if (qu0Var != null) {
            return qu0Var.m178085d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f619b.m178086e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ku0 ku0Var = this.f618a;
        if (ku0Var != null) {
            ku0Var.m151419f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        ku0 ku0Var = this.f618a;
        if (ku0Var != null) {
            ku0Var.m151420g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        qu0 qu0Var = this.f619b;
        if (qu0Var != null) {
            qu0Var.m178083b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        qu0 qu0Var = this.f619b;
        if (qu0Var != null) {
            qu0Var.m178083b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        qu0 qu0Var = this.f619b;
        if (qu0Var != null) {
            qu0Var.m178088g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        qu0 qu0Var = this.f619b;
        if (qu0Var != null) {
            qu0Var.m178083b();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        ku0 ku0Var = this.f618a;
        if (ku0Var != null) {
            ku0Var.m151422i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        ku0 ku0Var = this.f618a;
        if (ku0Var != null) {
            ku0Var.m151423j(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        qu0 qu0Var = this.f619b;
        if (qu0Var != null) {
            qu0Var.m178089h(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        qu0 qu0Var = this.f619b;
        if (qu0Var != null) {
            qu0Var.m178090i(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }
}
