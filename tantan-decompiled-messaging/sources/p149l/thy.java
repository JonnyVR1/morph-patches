package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class thy extends op2 implements Menu {

    /* JADX INFO: renamed from: d */
    public final xyg0 f170337d;

    public thy(Context context, xyg0 xyg0Var) {
        super(context);
        if (xyg0Var != null) {
            this.f170337d = xyg0Var;
        } else {
            ig3.m135964a("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m165291a(this.f170337d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f170337d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m165291a(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m165292b(this.f170337d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m165293c();
        this.f170337d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f170337d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m165291a(this.f170337d.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m165291a(this.f170337d.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f170337d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f170337d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f170337d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f170337d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m165294d(i);
        this.f170337d.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m165295e(i);
        this.f170337d.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f170337d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f170337d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f170337d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f170337d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f170337d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m165291a(this.f170337d.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m165292b(this.f170337d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m165291a(this.f170337d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m165292b(this.f170337d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m165291a(this.f170337d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m165292b(this.f170337d.addSubMenu(i, i2, i3, i4));
    }
}
