package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import p153l.c30;
import p153l.cf20;
import p153l.e30;
import p153l.loi0;
import p153l.lu0;
import p153l.o30;
import p153l.v1l0;
import p153l.v40;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements lu0, loi0.InterfaceC18428a {
    private AbstractC0076b mDelegate;
    private Resources mResources;

    public AppCompatActivity() {
    }

    private boolean performMenuItemShortcut(int i, KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo294a(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        getDelegate().mo299d(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        c30 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo102179f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        c30 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo102192s(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@IdRes int i) {
        return (T) getDelegate().mo303g(i);
    }

    @NonNull
    public AbstractC0076b getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC0076b.m362e(this, this);
        }
        return this.mDelegate;
    }

    @Nullable
    public e30 getDrawerToggleDelegate() {
        return getDelegate().mo306i();
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return getDelegate().mo310k();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && v1l0.m199019b()) {
            this.mResources = new v1l0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    @Nullable
    public c30 getSupportActionBar() {
        return getDelegate().mo312l();
    }

    @Override // p153l.loi0.InterfaceC18428a
    @Nullable
    public Intent getSupportParentActivityIntent() {
        return cf20.m109506a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo316n();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().mo320q(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        AbstractC0076b delegate = getDelegate();
        delegate.mo314m();
        delegate.mo322r(bundle);
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull loi0 loi0Var) {
        loi0Var.m155081c(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo324s();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        c30 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo102182i() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @NonNull Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo326t(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo328u();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().mo330v(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().mo332w();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().mo334x();
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        loi0 loi0VarM155079g = loi0.m155079g(this);
        onCreateSupportNavigateUpTaskStack(loi0VarM155079g);
        onPrepareSupportNavigateUpTaskStack(loi0VarM155079g);
        loi0VarM155079g.m155083h();
        try {
            v40.m199640q(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo269G(charSequence);
    }

    @Override // p153l.lu0
    @Nullable
    public o30 onWindowStartingSupportActionMode(@NonNull o30.InterfaceC19018a interfaceC19018a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        c30 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo102193t()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@LayoutRes int i) {
        getDelegate().mo258A(i);
    }

    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        getDelegate().mo265E(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@StyleRes int i) {
        super.setTheme(i);
        getDelegate().mo267F(i);
    }

    @Nullable
    public o30 startSupportActionMode(@NonNull o30.InterfaceC19018a interfaceC19018a) {
        return getDelegate().mo271H(interfaceC19018a);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo316n();
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        cf20.m109511f(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo337z(i);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return cf20.m109512g(this, intent);
    }

    @ContentView
    public AppCompatActivity(@LayoutRes int i) {
        super(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        getDelegate().mo260B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo262C(view, layoutParams);
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull loi0 loi0Var) {
    }

    @Override // p153l.lu0
    @CallSuper
    public void onSupportActionModeFinished(@NonNull o30 o30Var) {
    }

    @Override // p153l.lu0
    @CallSuper
    public void onSupportActionModeStarted(@NonNull o30 o30Var) {
    }
}
