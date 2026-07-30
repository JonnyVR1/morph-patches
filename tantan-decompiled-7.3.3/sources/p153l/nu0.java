package p153l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AbstractC0076b;

/* JADX INFO: loaded from: classes.dex */
public class nu0 extends Dialog implements lu0 {
    private AbstractC0076b mDelegate;
    private final lzq.InterfaceC18516a mKeyDispatcher;

    /* JADX INFO: renamed from: l.nu0$a */
    public class C18949a implements lzq.InterfaceC18516a {
        public C18949a() {
        }

        @Override // p153l.lzq.InterfaceC18516a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return nu0.this.superDispatchKeyEvent(keyEvent);
        }
    }

    public nu0(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new C18949a();
        AbstractC0076b delegate = getDelegate();
        delegate.mo267F(getThemeResId(context, i));
        delegate.mo322r(null);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(s8c0.f166764A, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo294a(view, layoutParams);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return lzq.m156463e(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @Nullable
    public <T extends View> T findViewById(@IdRes int i) {
        return (T) getDelegate().mo303g(i);
    }

    public AbstractC0076b getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC0076b.m363f(this, this);
        }
        return this.mDelegate;
    }

    public c30 getSupportActionBar() {
        return getDelegate().mo312l();
    }

    @Override // android.app.Dialog
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        getDelegate().mo316n();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().mo314m();
        super.onCreate(bundle);
        getDelegate().mo322r(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().mo334x();
    }

    @Override // p153l.lu0
    @Nullable
    public o30 onWindowStartingSupportActionMode(o30.InterfaceC19018a interfaceC19018a) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        getDelegate().mo258A(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo269G(getContext().getString(i));
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo337z(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        getDelegate().mo260B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo262C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo269G(charSequence);
    }

    @Override // p153l.lu0
    public void onSupportActionModeFinished(o30 o30Var) {
    }

    @Override // p153l.lu0
    public void onSupportActionModeStarted(o30 o30Var) {
    }

    public nu0(Context context) {
        this(context, 0);
    }

    public nu0(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.mKeyDispatcher = new C18949a();
    }
}
