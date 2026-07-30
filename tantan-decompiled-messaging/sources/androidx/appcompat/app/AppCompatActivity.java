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
import p149l.b50;
import p149l.fu0;
import p149l.i30;
import p149l.k30;
import p149l.lfi0;
import p149l.psk0;
import p149l.u30;
import p149l.u620;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements fu0, lfi0.InterfaceC18215a {
    private AbstractC0075b mDelegate;
    private Resources mResources;

    public AppCompatActivity() {
    }

    private boolean performMenuItemShortcut(int i, KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo293a(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        getDelegate().mo298d(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        i30 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo134119f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        i30 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo134132s(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@IdRes int i) {
        return (T) getDelegate().mo302g(i);
    }

    @NonNull
    public AbstractC0075b getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC0075b.m361e(this, this);
        }
        return this.mDelegate;
    }

    @Nullable
    public k30 getDrawerToggleDelegate() {
        return getDelegate().mo305i();
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return getDelegate().mo309k();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && psk0.m171179b()) {
            this.mResources = new psk0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    @Nullable
    public i30 getSupportActionBar() {
        return getDelegate().mo311l();
    }

    @Override // p149l.lfi0.InterfaceC18215a
    @Nullable
    public Intent getSupportParentActivityIntent() {
        return u620.m191904a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo315n();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().mo319q(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        AbstractC0075b delegate = getDelegate();
        delegate.mo313m();
        delegate.mo321r(bundle);
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull lfi0 lfi0Var) {
        lfi0Var.m149706c(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo323s();
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
        i30 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo134122i() & 4) == 0) {
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
        getDelegate().mo325t(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo327u();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().mo329v(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().mo331w();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().mo333x();
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
        lfi0 lfi0VarM149704g = lfi0.m149704g(this);
        onCreateSupportNavigateUpTaskStack(lfi0VarM149704g);
        onPrepareSupportNavigateUpTaskStack(lfi0VarM149704g);
        lfi0VarM149704g.m149708h();
        try {
            b50.m100283q(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo268G(charSequence);
    }

    @Override // p149l.fu0
    @Nullable
    public u30 onWindowStartingSupportActionMode(@NonNull u30.InterfaceC20342a interfaceC20342a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        i30 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo134133t()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@LayoutRes int i) {
        getDelegate().mo257A(i);
    }

    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        getDelegate().mo264E(toolbar);
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
        getDelegate().mo266F(i);
    }

    @Nullable
    public u30 startSupportActionMode(@NonNull u30.InterfaceC20342a interfaceC20342a) {
        return getDelegate().mo270H(interfaceC20342a);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo315n();
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        u620.m191909f(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo336z(i);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return u620.m191910g(this, intent);
    }

    @ContentView
    public AppCompatActivity(@LayoutRes int i) {
        super(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        getDelegate().mo259B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo261C(view, layoutParams);
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull lfi0 lfi0Var) {
    }

    @Override // p149l.fu0
    @CallSuper
    public void onSupportActionModeFinished(@NonNull u30 u30Var) {
    }

    @Override // p149l.fu0
    @CallSuper
    public void onSupportActionModeStarted(@NonNull u30 u30Var) {
    }
}
