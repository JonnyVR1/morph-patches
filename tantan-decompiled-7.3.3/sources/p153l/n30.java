package p153l;

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
public class n30 implements h7h0 {

    /* JADX INFO: renamed from: a */
    public final int f139905a;

    /* JADX INFO: renamed from: b */
    public final int f139906b;

    /* JADX INFO: renamed from: c */
    public final int f139907c;

    /* JADX INFO: renamed from: d */
    public final int f139908d;

    /* JADX INFO: renamed from: e */
    public CharSequence f139909e;

    /* JADX INFO: renamed from: f */
    public CharSequence f139910f;

    /* JADX INFO: renamed from: g */
    public Intent f139911g;

    /* JADX INFO: renamed from: h */
    public char f139912h;

    /* JADX INFO: renamed from: j */
    public char f139914j;

    /* JADX INFO: renamed from: l */
    public Drawable f139916l;

    /* JADX INFO: renamed from: n */
    public Context f139918n;

    /* JADX INFO: renamed from: o */
    public MenuItem.OnMenuItemClickListener f139919o;

    /* JADX INFO: renamed from: p */
    public CharSequence f139920p;

    /* JADX INFO: renamed from: q */
    public CharSequence f139921q;

    /* JADX INFO: renamed from: i */
    public int f139913i = 4096;

    /* JADX INFO: renamed from: k */
    public int f139915k = 4096;

    /* JADX INFO: renamed from: m */
    public int f139917m = 0;

    /* JADX INFO: renamed from: r */
    public ColorStateList f139922r = null;

    /* JADX INFO: renamed from: s */
    public PorterDuff.Mode f139923s = null;

    /* JADX INFO: renamed from: t */
    public boolean f139924t = false;

    /* JADX INFO: renamed from: u */
    public boolean f139925u = false;

    /* JADX INFO: renamed from: v */
    public int f139926v = 16;

    public n30(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f139918n = context;
        this.f139905a = i2;
        this.f139906b = i;
        this.f139907c = i3;
        this.f139908d = i4;
        this.f139909e = charSequence;
    }

    /* JADX INFO: renamed from: a */
    public final void m161260a() {
        Drawable drawable = this.f139916l;
        if (drawable != null) {
            if (this.f139924t || this.f139925u) {
                Drawable drawableM167178r = oce.m167178r(drawable);
                this.f139916l = drawableM167178r;
                Drawable drawableMutate = drawableM167178r.mutate();
                this.f139916l = drawableMutate;
                if (this.f139924t) {
                    oce.m167175o(drawableMutate, this.f139922r);
                }
                if (this.f139925u) {
                    oce.m167176p(this.f139916l, this.f139923s);
                }
            }
        }
    }

    @Override // p153l.h7h0, android.view.MenuItem
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h7h0 setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.h7h0, android.view.MenuItem
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h7h0 setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public h7h0 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f139915k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f139914j;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f139920p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f139906b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f139916l;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f139922r;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f139923s;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f139911g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f139905a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f139913i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f139912h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f139908d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // p153l.h7h0
    public t30 getSupportActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f139909e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f139910f;
        return charSequence != null ? charSequence : this.f139909e;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f139921q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f139926v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f139926v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f139926v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f139926v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f139914j = Character.toLowerCase(c);
        this.f139915k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f139926v = (z ? 1 : 0) | (this.f139926v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f139926v = (z ? 2 : 0) | (this.f139926v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f139926v = (z ? 16 : 0) | (this.f139926v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f139917m = i;
        this.f139916l = j26.m143192e(this.f139918n, i);
        m161260a();
        return this;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f139922r = colorStateList;
        this.f139924t = true;
        m161260a();
        return this;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f139923s = mode;
        this.f139925u = true;
        m161260a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f139911g = intent;
        return this;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f139912h = c;
        this.f139913i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f139919o = onMenuItemClickListener;
        return this;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f139912h = c;
        this.f139913i = KeyEvent.normalizeMetaState(i);
        this.f139914j = Character.toLowerCase(c2);
        this.f139915k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p153l.h7h0
    public h7h0 setSupportActionProvider(t30 t30Var) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f139909e = this.f139918n.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f139910f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f139926v = (this.f139926v & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public h7h0 setContentDescription(CharSequence charSequence) {
        this.f139920p = charSequence;
        return this;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public h7h0 setTooltipText(CharSequence charSequence) {
        this.f139921q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f139912h = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f139914j = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f139909e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f139916l = drawable;
        this.f139917m = 0;
        m161260a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f139912h = c;
        this.f139914j = Character.toLowerCase(c2);
        return this;
    }

    @Override // p153l.h7h0, android.view.MenuItem
    public void setShowAsAction(int i) {
    }
}
