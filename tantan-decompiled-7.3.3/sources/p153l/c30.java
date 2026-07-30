package p153l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class c30 {

    /* JADX INFO: renamed from: l.c30$b */
    public interface InterfaceC16170b {
        void onMenuVisibilityChanged(boolean z);
    }

    /* JADX INFO: renamed from: l.c30$c */
    @Deprecated
    public static abstract class AbstractC16171c {
        /* JADX INFO: renamed from: a */
        public abstract CharSequence m107734a();

        /* JADX INFO: renamed from: b */
        public abstract View m107735b();

        /* JADX INFO: renamed from: c */
        public abstract Drawable m107736c();

        /* JADX INFO: renamed from: d */
        public abstract CharSequence m107737d();

        /* JADX INFO: renamed from: e */
        public abstract void m107738e();
    }

    /* JADX INFO: renamed from: A */
    public void mo102168A(float f) {
        if (f == 0.0f) {
            return;
        }
        pr3.m173429a("Setting a non-zero elevation is not supported in this action bar configuration.");
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo102172E(CharSequence charSequence);

    /* JADX INFO: renamed from: G */
    public abstract void mo102174G();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: H */
    public o30 mo107733H(o30.InterfaceC19018a interfaceC19018a) {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: f */
    public boolean mo102179f() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: g */
    public boolean mo102180g() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo102182i();

    /* JADX INFO: renamed from: j */
    public float mo102183j() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo102184k();

    /* JADX INFO: renamed from: l */
    public Context mo102185l() {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo102186m();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: n */
    public boolean mo102187n() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public abstract boolean mo102188o();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: r */
    public boolean mo102191r(int i, KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: s */
    public boolean mo102192s(KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: t */
    public boolean mo102193t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo102194u(@Nullable Drawable drawable);

    /* JADX INFO: renamed from: w */
    public abstract void mo102196w(boolean z);

    /* JADX INFO: renamed from: x */
    public abstract void mo102197x(int i);

    /* JADX INFO: renamed from: y */
    public abstract void mo102198y(boolean z);

    /* JADX INFO: renamed from: z */
    public abstract void mo102199z(boolean z);

    /* JADX INFO: renamed from: q */
    public void mo102190q() {
    }

    /* JADX INFO: renamed from: l.c30$a */
    public static class C16169a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f79555a;

        public C16169a(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f79555a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gic0.f104439t);
            this.f79555a = typedArrayObtainStyledAttributes.getInt(gic0.f104444u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C16169a(int i, int i2) {
            super(i, i2);
            this.f79555a = 8388627;
        }

        public C16169a(C16169a c16169a) {
            super((ViewGroup.MarginLayoutParams) c16169a);
            this.f79555a = 0;
            this.f79555a = c16169a.f79555a;
        }

        public C16169a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f79555a = 0;
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo102169B(@DrawableRes int i) {
    }

    /* JADX INFO: renamed from: C */
    public void mo102170C(@Nullable Drawable drawable) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: D */
    public void mo102171D(boolean z) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: F */
    public void mo102173F(CharSequence charSequence) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: h */
    public void mo102181h(boolean z) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: p */
    public void mo102189p(Configuration configuration) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: v */
    public void mo102195v(boolean z) {
    }
}
