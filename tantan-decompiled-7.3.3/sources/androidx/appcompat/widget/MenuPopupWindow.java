package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0089d;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.lang.reflect.Method;
import p153l.jqy;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuPopupWindow extends C0164b implements jqy {

    /* JADX INFO: renamed from: K */
    public static Method f683K;

    /* JADX INFO: renamed from: J */
    public jqy f684J;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class MenuDropDownListView extends DropDownListView {

        /* JADX INFO: renamed from: o */
        public final int f685o;

        /* JADX INFO: renamed from: p */
        public final int f686p;

        /* JADX INFO: renamed from: q */
        public jqy f687q;

        /* JADX INFO: renamed from: r */
        public MenuItem f688r;

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f685o = 21;
                this.f686p = 22;
            } else {
                this.f685o = 22;
                this.f686p = 21;
            }
        }

        @Override // androidx.appcompat.widget.DropDownListView
        /* JADX INFO: renamed from: d */
        public /* bridge */ /* synthetic */ int mo567d(int i, int i2, int i3, int i4, int i5) {
            return super.mo567d(i, i2, i3, i4, i5);
        }

        @Override // androidx.appcompat.widget.DropDownListView
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo568e(MotionEvent motionEvent, int i) {
            return super.mo568e(motionEvent, i);
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            C0089d c0089d;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.f687q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0089d = (C0089d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0089d = (C0089d) adapter;
                    headersCount = 0;
                }
                MenuItemImpl item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c0089d.getCount()) ? null : c0089d.getItem(i);
                MenuItem menuItem = this.f688r;
                if (menuItem != item) {
                    MenuBuilder menuBuilderM429b = c0089d.m429b();
                    if (menuItem != null) {
                        this.f687q.mo420f(menuBuilderM429b, menuItem);
                    }
                    this.f688r = item;
                    if (item != null) {
                        this.f687q.mo419a(menuBuilderM429b, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f685o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f686p) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ((C0089d) getAdapter()).m429b().close(false);
            return true;
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(jqy jqyVar) {
            this.f687q = jqyVar;
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f683K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* JADX INFO: renamed from: J */
    public void m578J(Object obj) {
        this.f768G.setEnterTransition((Transition) obj);
    }

    /* JADX INFO: renamed from: K */
    public void m579K(Object obj) {
        this.f768G.setExitTransition((Transition) obj);
    }

    /* JADX INFO: renamed from: L */
    public void m580L(jqy jqyVar) {
        this.f684J = jqyVar;
    }

    /* JADX INFO: renamed from: M */
    public void m581M(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f768G.setTouchModal(z);
            return;
        }
        Method method = f683K;
        if (method != null) {
            try {
                method.invoke(this.f768G, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    @Override // p153l.jqy
    /* JADX INFO: renamed from: a */
    public void mo419a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        jqy jqyVar = this.f684J;
        if (jqyVar != null) {
            jqyVar.mo419a(menuBuilder, menuItem);
        }
    }

    @Override // p153l.jqy
    /* JADX INFO: renamed from: f */
    public void mo420f(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        jqy jqyVar = this.f684J;
        if (jqyVar != null) {
            jqyVar.mo420f(menuBuilder, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C0164b
    /* JADX INFO: renamed from: o */
    public DropDownListView mo582o(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
