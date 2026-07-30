package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.a */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class AbstractC0086a implements InterfaceC0092g {

    /* JADX INFO: renamed from: a */
    public Context f364a;

    /* JADX INFO: renamed from: b */
    public Context f365b;

    /* JADX INFO: renamed from: c */
    public MenuBuilder f366c;

    /* JADX INFO: renamed from: d */
    public LayoutInflater f367d;

    /* JADX INFO: renamed from: e */
    public LayoutInflater f368e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0092g.a f369f;

    /* JADX INFO: renamed from: g */
    public int f370g;

    /* JADX INFO: renamed from: h */
    public int f371h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0093h f372i;

    /* JADX INFO: renamed from: j */
    public int f373j;

    public AbstractC0086a(Context context, int i, int i2) {
        this.f364a = context;
        this.f367d = LayoutInflater.from(context);
        this.f370g = i;
        this.f371h = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m393b(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f372i).addView(view, i);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo394c(MenuItemImpl menuItemImpl, InterfaceC0093h.a aVar);

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0093h.a m395d(ViewGroup viewGroup) {
        return (InterfaceC0093h.a) this.f367d.inflate(this.f371h, viewGroup, false);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo396e(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0092g.a m397f() {
        return this.f369f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public View mo398g(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        InterfaceC0093h.a aVarM395d = view instanceof InterfaceC0093h.a ? (InterfaceC0093h.a) view : m395d(viewGroup);
        mo394c(menuItemImpl, aVarM395d);
        return (View) aVarM395d;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public int getId() {
        return this.f373j;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC0093h mo399h(ViewGroup viewGroup) {
        if (this.f372i == null) {
            InterfaceC0093h interfaceC0093h = (InterfaceC0093h) this.f367d.inflate(this.f370g, viewGroup, false);
            this.f372i = interfaceC0093h;
            interfaceC0093h.initialize(this.f366c);
            updateMenuView(true);
        }
        return this.f372i;
    }

    /* JADX INFO: renamed from: i */
    public void m400i(int i) {
        this.f373j = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.f365b = context;
        this.f368e = LayoutInflater.from(context);
        this.f366c = menuBuilder;
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo401j(int i, MenuItemImpl menuItemImpl);

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        InterfaceC0092g.a aVar = this.f369f;
        if (aVar != null) {
            aVar.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public boolean onSubMenuSelected(SubMenuC0095j subMenuC0095j) {
        InterfaceC0092g.a aVar = this.f369f;
        if (aVar != null) {
            return aVar.mo346a(subMenuC0095j);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public void setCallback(InterfaceC0092g.a aVar) {
        this.f369f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f372i;
        if (viewGroup == null) {
            return;
        }
        MenuBuilder menuBuilder = this.f366c;
        int i = 0;
        if (menuBuilder != null) {
            menuBuilder.flagActionItems();
            ArrayList<MenuItemImpl> visibleItems = this.f366c.getVisibleItems();
            int size = visibleItems.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = visibleItems.get(i3);
                if (mo401j(i2, menuItemImpl)) {
                    View childAt = viewGroup.getChildAt(i2);
                    MenuItemImpl itemData = childAt instanceof InterfaceC0093h.a ? ((InterfaceC0093h.a) childAt).getItemData() : null;
                    View viewMo398g = mo398g(menuItemImpl, childAt, viewGroup);
                    if (menuItemImpl != itemData) {
                        viewMo398g.setPressed(false);
                        viewMo398g.jumpDrawablesToCurrentState();
                    }
                    if (viewMo398g != childAt) {
                        m393b(viewMo398g, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo396e(viewGroup, i)) {
                i++;
            }
        }
    }
}
