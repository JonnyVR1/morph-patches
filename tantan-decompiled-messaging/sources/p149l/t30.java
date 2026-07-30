package p149l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class t30 implements zyg0 {

    /* JADX INFO: renamed from: a */
    public final int f167559a;

    /* JADX INFO: renamed from: b */
    public final int f167560b;

    /* JADX INFO: renamed from: c */
    public final int f167561c;

    /* JADX INFO: renamed from: d */
    public final int f167562d;

    /* JADX INFO: renamed from: e */
    public CharSequence f167563e;

    /* JADX INFO: renamed from: f */
    public CharSequence f167564f;

    /* JADX INFO: renamed from: g */
    public Intent f167565g;

    /* JADX INFO: renamed from: h */
    public char f167566h;

    /* JADX INFO: renamed from: j */
    public char f167568j;

    /* JADX INFO: renamed from: l */
    public Drawable f167570l;

    /* JADX INFO: renamed from: n */
    public Context f167572n;

    /* JADX INFO: renamed from: o */
    public MenuItem.OnMenuItemClickListener f167573o;

    /* JADX INFO: renamed from: p */
    public CharSequence f167574p;

    /* JADX INFO: renamed from: q */
    public CharSequence f167575q;

    /* JADX INFO: renamed from: i */
    public int f167567i = 4096;

    /* JADX INFO: renamed from: k */
    public int f167569k = 4096;

    /* JADX INFO: renamed from: m */
    public int f167571m = 0;

    /* JADX INFO: renamed from: r */
    public ColorStateList f167576r = null;

    /* JADX INFO: renamed from: s */
    public PorterDuff.Mode f167577s = null;

    /* JADX INFO: renamed from: t */
    public boolean f167578t = false;

    /* JADX INFO: renamed from: u */
    public boolean f167579u = false;

    /* JADX INFO: renamed from: v */
    public int f167580v = 16;

    public t30(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f167572n = context;
        this.f167559a = i2;
        this.f167560b = i;
        this.f167561c = i3;
        this.f167562d = i4;
        this.f167563e = charSequence;
    }

    /* JADX INFO: renamed from: a */
    public final void m187084a() {
        Drawable drawable = this.f167570l;
        if (drawable != null) {
            if (this.f167578t || this.f167579u) {
                Drawable drawableM145284r = kbe.m145284r(drawable);
                this.f167570l = drawableM145284r;
                Drawable drawableMutate = drawableM145284r.mutate();
                this.f167570l = drawableMutate;
                if (this.f167578t) {
                    kbe.m145281o(drawableMutate, this.f167576r);
                }
                if (this.f167579u) {
                    kbe.m145282p(this.f167570l, this.f167577s);
                }
            }
        }
    }

    @Override // p149l.zyg0, android.view.MenuItem
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public zyg0 setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.zyg0, android.view.MenuItem
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public zyg0 setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public zyg0 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f167569k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f167568j;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f167574p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f167560b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f167570l;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f167576r;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f167577s;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f167565g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f167559a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f167567i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f167566h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f167562d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // p149l.zyg0
    public z30 getSupportActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f167563e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f167564f;
        return charSequence != null ? charSequence : this.f167563e;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f167575q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f167580v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f167580v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f167580v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f167580v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f167568j = Character.toLowerCase(c);
        this.f167569k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f167580v = (z ? 1 : 0) | (this.f167580v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f167580v = (z ? 2 : 0) | (this.f167580v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f167580v = (z ? 16 : 0) | (this.f167580v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f167571m = i;
        this.f167570l = e16.m114377e(this.f167572n, i);
        m187084a();
        return this;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f167576r = colorStateList;
        this.f167578t = true;
        m187084a();
        return this;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f167577s = mode;
        this.f167579u = true;
        m187084a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f167565g = intent;
        return this;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f167566h = c;
        this.f167567i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f167573o = onMenuItemClickListener;
        return this;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f167566h = c;
        this.f167567i = KeyEvent.normalizeMetaState(i);
        this.f167568j = Character.toLowerCase(c2);
        this.f167569k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p149l.zyg0
    public zyg0 setSupportActionProvider(z30 z30Var) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f167563e = this.f167572n.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f167564f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f167580v = (this.f167580v & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public zyg0 setContentDescription(CharSequence charSequence) {
        this.f167574p = charSequence;
        return this;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public zyg0 setTooltipText(CharSequence charSequence) {
        this.f167575q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f167566h = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f167568j = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f167563e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f167570l = drawable;
        this.f167571m = 0;
        m187084a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f167566h = c;
        this.f167568j = Character.toLowerCase(c2);
        return this;
    }

    @Override // p149l.zyg0, android.view.MenuItem
    public void setShowAsAction(int i) {
    }
}
