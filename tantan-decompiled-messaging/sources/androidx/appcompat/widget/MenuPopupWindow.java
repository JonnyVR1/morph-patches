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
import androidx.appcompat.view.menu.C0088d;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.lang.reflect.Method;
import p149l.mhy;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuPopupWindow extends C0163b implements mhy {

    /* JADX INFO: renamed from: K */
    public static Method f683K;

    /* JADX INFO: renamed from: J */
    public mhy f684J;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class MenuDropDownListView extends DropDownListView {

        /* JADX INFO: renamed from: o */
        public final int f685o;

        /* JADX INFO: renamed from: p */
        public final int f686p;

        /* JADX INFO: renamed from: q */
        public mhy f687q;

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
        public /* bridge */ /* synthetic */ int mo566d(int i, int i2, int i3, int i4, int i5) {
            return super.mo566d(i, i2, i3, i4, i5);
        }

        @Override // androidx.appcompat.widget.DropDownListView
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo567e(MotionEvent motionEvent, int i) {
            return super.mo567e(motionEvent, i);
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
            C0088d c0088d;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.f687q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0088d = (C0088d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0088d = (C0088d) adapter;
                    headersCount = 0;
                }
                MenuItemImpl item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c0088d.getCount()) ? null : c0088d.getItem(i);
                MenuItem menuItem = this.f688r;
                if (menuItem != item) {
                    MenuBuilder menuBuilderM428b = c0088d.m428b();
                    if (menuItem != null) {
                        this.f687q.mo419f(menuBuilderM428b, menuItem);
                    }
                    this.f688r = item;
                    if (item != null) {
                        this.f687q.mo418a(menuBuilderM428b, item);
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
            ((C0088d) getAdapter()).m428b().close(false);
            return true;
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(mhy mhyVar) {
            this.f687q = mhyVar;
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
    public void m577J(Object obj) {
        this.f768G.setEnterTransition((Transition) obj);
    }

    /* JADX INFO: renamed from: K */
    public void m578K(Object obj) {
        this.f768G.setExitTransition((Transition) obj);
    }

    /* JADX INFO: renamed from: L */
    public void m579L(mhy mhyVar) {
        this.f684J = mhyVar;
    }

    /* JADX INFO: renamed from: M */
    public void m580M(boolean z) {
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

    @Override // p149l.mhy
    /* JADX INFO: renamed from: a */
    public void mo418a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        mhy mhyVar = this.f684J;
        if (mhyVar != null) {
            mhyVar.mo418a(menuBuilder, menuItem);
        }
    }

    @Override // p149l.mhy
    /* JADX INFO: renamed from: f */
    public void mo419f(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        mhy mhyVar = this.f684J;
        if (mhyVar != null) {
            mhyVar.mo419f(menuBuilder, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C0163b
    /* JADX INFO: renamed from: o */
    public DropDownListView mo581o(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
