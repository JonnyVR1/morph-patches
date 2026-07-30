package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;
import p153l.fq2;
import p153l.h7h0;
import p153l.qe5;
import p153l.t30;
import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuItemWrapperICS extends fq2 implements MenuItem {

    /* JADX INFO: renamed from: d */
    public final h7h0 f353d;

    /* JADX INFO: renamed from: e */
    public Method f354e;

    public static class CollapsibleActionViewWrapper extends FrameLayout implements qe5 {

        /* JADX INFO: renamed from: a */
        public final CollapsibleActionView f355a;

        /* JADX WARN: Multi-variable type inference failed */
        public CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.f355a = (CollapsibleActionView) view;
            addView(view);
        }

        /* JADX INFO: renamed from: a */
        public View m384a() {
            return (View) this.f355a;
        }

        @Override // p153l.qe5
        public void onActionViewCollapsed() {
            this.f355a.onActionViewCollapsed();
        }

        @Override // p153l.qe5
        public void onActionViewExpanded() {
            this.f355a.onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$a */
    public class C0082a extends t30 {

        /* JADX INFO: renamed from: d */
        public final ActionProvider f356d;

        public C0082a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f356d = actionProvider;
        }

        @Override // p153l.t30
        /* JADX INFO: renamed from: a */
        public boolean mo385a() {
            return this.f356d.hasSubMenu();
        }

        @Override // p153l.t30
        /* JADX INFO: renamed from: c */
        public View mo386c() {
            return this.f356d.onCreateActionView();
        }

        @Override // p153l.t30
        /* JADX INFO: renamed from: e */
        public boolean mo387e() {
            return this.f356d.onPerformDefaultAction();
        }

        @Override // p153l.t30
        /* JADX INFO: renamed from: f */
        public void mo388f(SubMenu subMenu) {
            this.f356d.onPrepareSubMenu(MenuItemWrapperICS.this.m126723b(subMenu));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$b */
    @RequiresApi(16)
    public class ActionProviderVisibilityListenerC0083b extends C0082a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: f */
        public t30.InterfaceC20220b f358f;

        public ActionProviderVisibilityListenerC0083b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p153l.t30
        /* JADX INFO: renamed from: b */
        public boolean mo389b() {
            return this.f356d.isVisible();
        }

        @Override // p153l.t30
        /* JADX INFO: renamed from: d */
        public View mo390d(MenuItem menuItem) {
            return this.f356d.onCreateActionView(menuItem);
        }

        @Override // p153l.t30
        /* JADX INFO: renamed from: g */
        public boolean mo391g() {
            return this.f356d.overridesItemVisibility();
        }

        @Override // p153l.t30
        /* JADX INFO: renamed from: j */
        public void mo392j(t30.InterfaceC20220b interfaceC20220b) {
            this.f358f = interfaceC20220b;
            ActionProvider actionProvider = this.f356d;
            if (interfaceC20220b == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            t30.InterfaceC20220b interfaceC20220b = this.f358f;
            if (interfaceC20220b != null) {
                interfaceC20220b.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$c */
    public class MenuItemOnActionExpandListenerC0084c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnActionExpandListener f360a;

        public MenuItemOnActionExpandListenerC0084c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f360a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f360a.onMenuItemActionCollapse(MenuItemWrapperICS.this.m126722a(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f360a.onMenuItemActionExpand(MenuItemWrapperICS.this.m126722a(menuItem));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$d */
    public class MenuItemOnMenuItemClickListenerC0085d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnMenuItemClickListener f362a;

        public MenuItemOnMenuItemClickListenerC0085d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f362a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f362a.onMenuItemClick(MenuItemWrapperICS.this.m126722a(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, h7h0 h7h0Var) {
        super(context);
        if (h7h0Var != null) {
            this.f353d = h7h0Var;
        } else {
            wg3.m206174a("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f353d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f353d.expandActionView();
    }

    /* JADX INFO: renamed from: f */
    public void m383f(boolean z) {
        try {
            if (this.f354e == null) {
                this.f354e = this.f353d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f354e.invoke(this.f353d, Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        t30 supportActionProvider = this.f353d.getSupportActionProvider();
        if (supportActionProvider instanceof C0082a) {
            return ((C0082a) supportActionProvider).f356d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f353d.getActionView();
        return actionView instanceof CollapsibleActionViewWrapper ? ((CollapsibleActionViewWrapper) actionView).m384a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f353d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f353d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f353d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f353d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f353d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f353d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f353d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f353d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f353d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f353d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f353d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f353d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f353d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m126723b(this.f353d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f353d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f353d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f353d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f353d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f353d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f353d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f353d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f353d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f353d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC0083b actionProviderVisibilityListenerC0083b = new ActionProviderVisibilityListenerC0083b(this.f100240a, actionProvider);
        h7h0 h7h0Var = this.f353d;
        if (actionProvider == null) {
            actionProviderVisibilityListenerC0083b = null;
        }
        h7h0Var.setSupportActionProvider(actionProviderVisibilityListenerC0083b);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f353d.setActionView(i);
        View actionView = this.f353d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f353d.setActionView(new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f353d.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f353d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f353d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f353d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f353d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f353d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f353d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f353d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f353d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f353d.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f353d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0084c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f353d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC0085d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f353d.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f353d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f353d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f353d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f353d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f353d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f353d.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f353d.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f353d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f353d.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f353d.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f353d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        this.f353d.setActionView(view);
        return this;
    }
}
