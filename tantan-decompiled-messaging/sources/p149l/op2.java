package p149l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class op2 {

    /* JADX INFO: renamed from: a */
    public final Context f144945a;

    /* JADX INFO: renamed from: b */
    public Map<zyg0, MenuItem> f144946b;

    /* JADX INFO: renamed from: c */
    public Map<kzg0, SubMenu> f144947c;

    public op2(Context context) {
        this.f144945a = context;
    }

    /* JADX INFO: renamed from: a */
    public final MenuItem m165291a(MenuItem menuItem) {
        if (!(menuItem instanceof zyg0)) {
            return menuItem;
        }
        zyg0 zyg0Var = (zyg0) menuItem;
        if (this.f144946b == null) {
            this.f144946b = new e01();
        }
        MenuItem menuItem2 = this.f144946b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f144945a, zyg0Var);
        this.f144946b.put(zyg0Var, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    /* JADX INFO: renamed from: b */
    public final SubMenu m165292b(SubMenu subMenu) {
        if (!(subMenu instanceof kzg0)) {
            return subMenu;
        }
        kzg0 kzg0Var = (kzg0) subMenu;
        if (this.f144947c == null) {
            this.f144947c = new e01();
        }
        SubMenu subMenu2 = this.f144947c.get(kzg0Var);
        if (subMenu2 != null) {
            return subMenu2;
        }
        n3g0 n3g0Var = new n3g0(this.f144945a, kzg0Var);
        this.f144947c.put(kzg0Var, n3g0Var);
        return n3g0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m165293c() {
        Map<zyg0, MenuItem> map = this.f144946b;
        if (map != null) {
            map.clear();
        }
        Map<kzg0, SubMenu> map2 = this.f144947c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m165294d(int i) {
        Map<zyg0, MenuItem> map = this.f144946b;
        if (map == null) {
            return;
        }
        Iterator<zyg0> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m165295e(int i) {
        Map<zyg0, MenuItem> map = this.f144946b;
        if (map == null) {
            return;
        }
        Iterator<zyg0> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
