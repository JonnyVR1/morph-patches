package p153l;

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
public class l1g0 extends o30 implements MenuBuilder.InterfaceC0079a {

    /* JADX INFO: renamed from: c */
    public Context f129674c;

    /* JADX INFO: renamed from: d */
    public ActionBarContextView f129675d;

    /* JADX INFO: renamed from: e */
    public o30.InterfaceC19018a f129676e;

    /* JADX INFO: renamed from: f */
    public WeakReference<View> f129677f;

    /* JADX INFO: renamed from: g */
    public boolean f129678g;

    /* JADX INFO: renamed from: h */
    public boolean f129679h;

    /* JADX INFO: renamed from: i */
    public MenuBuilder f129680i;

    public l1g0(Context context, ActionBarContextView actionBarContextView, o30.InterfaceC19018a interfaceC19018a, boolean z) {
        this.f129674c = context;
        this.f129675d = actionBarContextView;
        this.f129676e = interfaceC19018a;
        MenuBuilder defaultShowAsAction = new MenuBuilder(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f129680i = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.f129679h = z;
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: a */
    public void mo152473a() {
        if (this.f129678g) {
            return;
        }
        this.f129678g = true;
        this.f129675d.sendAccessibilityEvent(32);
        this.f129676e.mo350d(this);
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: b */
    public View mo152474b() {
        WeakReference<View> weakReference = this.f129677f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: c */
    public Menu mo152475c() {
        return this.f129680i;
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: d */
    public MenuInflater mo152476d() {
        return new g7h0(this.f129675d.getContext());
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: e */
    public CharSequence mo152477e() {
        return this.f129675d.getSubtitle();
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: g */
    public CharSequence mo152478g() {
        return this.f129675d.getTitle();
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: i */
    public void mo152479i() {
        this.f129676e.mo349c(this, this.f129680i);
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: j */
    public boolean mo152480j() {
        return this.f129675d.m461j();
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: k */
    public void mo152481k(View view) {
        this.f129675d.setCustomView(view);
        this.f129677f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: l */
    public void mo152482l(int i) {
        mo152483m(this.f129674c.getString(i));
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: m */
    public void mo152483m(CharSequence charSequence) {
        this.f129675d.setSubtitle(charSequence);
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: o */
    public void mo152484o(int i) {
        mo152485p(this.f129674c.getString(i));
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0079a
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f129676e.mo347a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0079a
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        mo152479i();
        this.f129675d.m463l();
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: p */
    public void mo152485p(CharSequence charSequence) {
        this.f129675d.setTitle(charSequence);
    }

    @Override // p153l.o30
    /* JADX INFO: renamed from: q */
    public void mo152486q(boolean z) {
        super.mo152486q(z);
        this.f129675d.setTitleOptional(z);
    }
}
