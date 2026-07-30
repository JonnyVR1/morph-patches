package p153l;

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
public class qqy extends fq2 implements Menu {

    /* JADX INFO: renamed from: d */
    public final f7h0 f159056d;

    public qqy(Context context, f7h0 f7h0Var) {
        super(context);
        if (f7h0Var != null) {
            this.f159056d = f7h0Var;
        } else {
            wg3.m206174a("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m126722a(this.f159056d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f159056d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m126722a(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m126723b(this.f159056d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m126724c();
        this.f159056d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f159056d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m126722a(this.f159056d.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m126722a(this.f159056d.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f159056d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f159056d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f159056d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f159056d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m126725d(i);
        this.f159056d.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m126726e(i);
        this.f159056d.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f159056d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f159056d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f159056d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f159056d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f159056d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m126722a(this.f159056d.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m126723b(this.f159056d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m126722a(this.f159056d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m126723b(this.f159056d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m126722a(this.f159056d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m126723b(this.f159056d.addSubMenu(i, i2, i3, i4));
    }
}
