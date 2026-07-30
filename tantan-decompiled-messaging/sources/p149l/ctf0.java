package p149l;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ctf0 extends u30 implements MenuBuilder.InterfaceC0078a {

    /* JADX INFO: renamed from: c */
    public Context f82473c;

    /* JADX INFO: renamed from: d */
    public ActionBarContextView f82474d;

    /* JADX INFO: renamed from: e */
    public u30.InterfaceC20342a f82475e;

    /* JADX INFO: renamed from: f */
    public WeakReference<View> f82476f;

    /* JADX INFO: renamed from: g */
    public boolean f82477g;

    /* JADX INFO: renamed from: h */
    public boolean f82478h;

    /* JADX INFO: renamed from: i */
    public MenuBuilder f82479i;

    public ctf0(Context context, ActionBarContextView actionBarContextView, u30.InterfaceC20342a interfaceC20342a, boolean z) {
        this.f82473c = context;
        this.f82474d = actionBarContextView;
        this.f82475e = interfaceC20342a;
        MenuBuilder defaultShowAsAction = new MenuBuilder(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f82479i = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.f82478h = z;
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: a */
    public void mo108669a() {
        if (this.f82477g) {
            return;
        }
        this.f82477g = true;
        this.f82474d.sendAccessibilityEvent(32);
        this.f82475e.mo349d(this);
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: b */
    public View mo108670b() {
        WeakReference<View> weakReference = this.f82476f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: c */
    public Menu mo108671c() {
        return this.f82479i;
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: d */
    public MenuInflater mo108672d() {
        return new yyg0(this.f82474d.getContext());
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: e */
    public CharSequence mo108673e() {
        return this.f82474d.getSubtitle();
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: g */
    public CharSequence mo108674g() {
        return this.f82474d.getTitle();
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: i */
    public void mo108675i() {
        this.f82475e.mo348c(this, this.f82479i);
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: j */
    public boolean mo108676j() {
        return this.f82474d.m460j();
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: k */
    public void mo108677k(View view) {
        this.f82474d.setCustomView(view);
        this.f82476f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: l */
    public void mo108678l(int i) {
        mo108679m(this.f82473c.getString(i));
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: m */
    public void mo108679m(CharSequence charSequence) {
        this.f82474d.setSubtitle(charSequence);
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: o */
    public void mo108680o(int i) {
        mo108681p(this.f82473c.getString(i));
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0078a
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f82475e.mo346a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0078a
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        mo108675i();
        this.f82474d.m462l();
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: p */
    public void mo108681p(CharSequence charSequence) {
        this.f82474d.setTitle(charSequence);
    }

    @Override // p149l.u30
    /* JADX INFO: renamed from: q */
    public void mo108682q(boolean z) {
        super.mo108682q(z);
        this.f82474d.setTitleOptional(z);
    }
}
