package p149l;

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
public abstract class i30 {

    /* JADX INFO: renamed from: l.i30$b */
    public interface InterfaceC17466b {
        void onMenuVisibilityChanged(boolean z);
    }

    /* JADX INFO: renamed from: l.i30$c */
    @Deprecated
    public static abstract class AbstractC17467c {
        /* JADX INFO: renamed from: a */
        public abstract CharSequence m134140a();

        /* JADX INFO: renamed from: b */
        public abstract View m134141b();

        /* JADX INFO: renamed from: c */
        public abstract Drawable m134142c();

        /* JADX INFO: renamed from: d */
        public abstract CharSequence m134143d();

        /* JADX INFO: renamed from: e */
        public abstract void m134144e();
    }

    /* JADX INFO: renamed from: A */
    public void mo134111A(float f) {
        if (f == 0.0f) {
            return;
        }
        qq3.m175877a("Setting a non-zero elevation is not supported in this action bar configuration.");
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo134115E(CharSequence charSequence);

    /* JADX INFO: renamed from: G */
    public abstract void mo134117G();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: H */
    public u30 mo134118H(u30.InterfaceC20342a interfaceC20342a) {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: f */
    public boolean mo134119f() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: g */
    public boolean mo134120g() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo134122i();

    /* JADX INFO: renamed from: j */
    public float mo134123j() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo134124k();

    /* JADX INFO: renamed from: l */
    public Context mo134125l() {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo134126m();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: n */
    public boolean mo134127n() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public abstract boolean mo134128o();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: r */
    public boolean mo134131r(int i, KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: s */
    public boolean mo134132s(KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: t */
    public boolean mo134133t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo134134u(@Nullable Drawable drawable);

    /* JADX INFO: renamed from: w */
    public abstract void mo134136w(boolean z);

    /* JADX INFO: renamed from: x */
    public abstract void mo134137x(int i);

    /* JADX INFO: renamed from: y */
    public abstract void mo134138y(boolean z);

    /* JADX INFO: renamed from: z */
    public abstract void mo134139z(boolean z);

    /* JADX INFO: renamed from: q */
    public void mo134130q() {
    }

    /* JADX INFO: renamed from: l.i30$a */
    public static class C17465a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f110601a;

        public C17465a(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f110601a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aac0.f68513t);
            this.f110601a = typedArrayObtainStyledAttributes.getInt(aac0.f68518u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C17465a(int i, int i2) {
            super(i, i2);
            this.f110601a = 8388627;
        }

        public C17465a(C17465a c17465a) {
            super((ViewGroup.MarginLayoutParams) c17465a);
            this.f110601a = 0;
            this.f110601a = c17465a.f110601a;
        }

        public C17465a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f110601a = 0;
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo134112B(@DrawableRes int i) {
    }

    /* JADX INFO: renamed from: C */
    public void mo134113C(@Nullable Drawable drawable) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: D */
    public void mo134114D(boolean z) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: F */
    public void mo134116F(CharSequence charSequence) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: h */
    public void mo134121h(boolean z) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: p */
    public void mo134129p(Configuration configuration) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: v */
    public void mo134135v(boolean z) {
    }
}
