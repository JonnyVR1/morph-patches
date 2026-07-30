package p149l;

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
import androidx.appcompat.app.AbstractC0075b;

/* JADX INFO: loaded from: classes.dex */
public class hu0 extends Dialog implements fu0 {
    private AbstractC0075b mDelegate;
    private final lxq.InterfaceC18347a mKeyDispatcher;

    /* JADX INFO: renamed from: l.hu0$a */
    public class C17391a implements lxq.InterfaceC18347a {
        public C17391a() {
        }

        @Override // p149l.lxq.InterfaceC18347a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return hu0.this.superDispatchKeyEvent(keyEvent);
        }
    }

    public hu0(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new C17391a();
        AbstractC0075b delegate = getDelegate();
        delegate.mo266F(getThemeResId(context, i));
        delegate.mo321r(null);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n0c0.f136492A, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo293a(view, layoutParams);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return lxq.m152082e(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @Nullable
    public <T extends View> T findViewById(@IdRes int i) {
        return (T) getDelegate().mo302g(i);
    }

    public AbstractC0075b getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC0075b.m362f(this, this);
        }
        return this.mDelegate;
    }

    public i30 getSupportActionBar() {
        return getDelegate().mo311l();
    }

    @Override // android.app.Dialog
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        getDelegate().mo315n();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().mo313m();
        super.onCreate(bundle);
        getDelegate().mo321r(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().mo333x();
    }

    @Override // p149l.fu0
    @Nullable
    public u30 onWindowStartingSupportActionMode(u30.InterfaceC20342a interfaceC20342a) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        getDelegate().mo257A(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo268G(getContext().getString(i));
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo336z(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        getDelegate().mo259B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo261C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo268G(charSequence);
    }

    @Override // p149l.fu0
    public void onSupportActionModeFinished(u30 u30Var) {
    }

    @Override // p149l.fu0
    public void onSupportActionModeStarted(u30 u30Var) {
    }

    public hu0(Context context) {
        this(context, 0);
    }

    public hu0(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.mKeyDispatcher = new C17391a();
    }
}
