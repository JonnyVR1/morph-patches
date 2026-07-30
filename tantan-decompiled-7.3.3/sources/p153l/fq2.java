package p153l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class fq2 {

    /* JADX INFO: renamed from: a */
    public final Context f100240a;

    /* JADX INFO: renamed from: b */
    public Map<h7h0, MenuItem> f100241b;

    /* JADX INFO: renamed from: c */
    public Map<s7h0, SubMenu> f100242c;

    public fq2(Context context) {
        this.f100240a = context;
    }

    /* JADX INFO: renamed from: a */
    public final MenuItem m126722a(MenuItem menuItem) {
        if (!(menuItem instanceof h7h0)) {
            return menuItem;
        }
        h7h0 h7h0Var = (h7h0) menuItem;
        if (this.f100241b == null) {
            this.f100241b = new l01();
        }
        MenuItem menuItem2 = this.f100241b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f100240a, h7h0Var);
        this.f100241b.put(h7h0Var, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    /* JADX INFO: renamed from: b */
    public final SubMenu m126723b(SubMenu subMenu) {
        if (!(subMenu instanceof s7h0)) {
            return subMenu;
        }
        s7h0 s7h0Var = (s7h0) subMenu;
        if (this.f100242c == null) {
            this.f100242c = new l01();
        }
        SubMenu subMenu2 = this.f100242c.get(s7h0Var);
        if (subMenu2 != null) {
            return subMenu2;
        }
        ubg0 ubg0Var = new ubg0(this.f100240a, s7h0Var);
        this.f100242c.put(s7h0Var, ubg0Var);
        return ubg0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m126724c() {
        Map<h7h0, MenuItem> map = this.f100241b;
        if (map != null) {
            map.clear();
        }
        Map<s7h0, SubMenu> map2 = this.f100242c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m126725d(int i) {
        Map<h7h0, MenuItem> map = this.f100241b;
        if (map == null) {
            return;
        }
        Iterator<h7h0> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m126726e(int i) {
        Map<h7h0, MenuItem> map = this.f100241b;
        if (map == null) {
            return;
        }
        Iterator<h7h0> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
