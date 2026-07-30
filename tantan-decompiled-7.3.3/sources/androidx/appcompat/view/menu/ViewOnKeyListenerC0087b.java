package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.MenuPopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.jqy;
import p153l.kfc0;
import p153l.kkl0;
import p153l.kqy;
import p153l.m9k;
import p153l.wac0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0087b extends kqy implements InterfaceC0092g, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: B */
    public static final int f374B = kfc0.f126271g;

    /* JADX INFO: renamed from: A */
    public boolean f375A;

    /* JADX INFO: renamed from: b */
    public final Context f376b;

    /* JADX INFO: renamed from: c */
    public final int f377c;

    /* JADX INFO: renamed from: d */
    public final int f378d;

    /* JADX INFO: renamed from: e */
    public final int f379e;

    /* JADX INFO: renamed from: f */
    public final boolean f380f;

    /* JADX INFO: renamed from: g */
    public final Handler f381g;

    /* JADX INFO: renamed from: o */
    public View f389o;

    /* JADX INFO: renamed from: p */
    public View f390p;

    /* JADX INFO: renamed from: r */
    public boolean f392r;

    /* JADX INFO: renamed from: s */
    public boolean f393s;

    /* JADX INFO: renamed from: t */
    public int f394t;

    /* JADX INFO: renamed from: u */
    public int f395u;

    /* JADX INFO: renamed from: w */
    public boolean f397w;

    /* JADX INFO: renamed from: x */
    public InterfaceC0092g.a f398x;

    /* JADX INFO: renamed from: y */
    public ViewTreeObserver f399y;

    /* JADX INFO: renamed from: z */
    public PopupWindow.OnDismissListener f400z;

    /* JADX INFO: renamed from: h */
    public final List<MenuBuilder> f382h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final List<d> f383i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserver.OnGlobalLayoutListener f384j = new a();

    /* JADX INFO: renamed from: k */
    public final View.OnAttachStateChangeListener f385k = new b();

    /* JADX INFO: renamed from: l */
    public final jqy f386l = new c();

    /* JADX INFO: renamed from: m */
    public int f387m = 0;

    /* JADX INFO: renamed from: n */
    public int f388n = 0;

    /* JADX INFO: renamed from: v */
    public boolean f396v = false;

    /* JADX INFO: renamed from: q */
    public int f391q = m416t();

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0087b.this.isShowing() || ViewOnKeyListenerC0087b.this.f383i.size() <= 0 || ViewOnKeyListenerC0087b.this.f383i.get(0).f408a.m637t()) {
                return;
            }
            View view = ViewOnKeyListenerC0087b.this.f390p;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0087b.this.dismiss();
                return;
            }
            Iterator<d> it = ViewOnKeyListenerC0087b.this.f383i.iterator();
            while (it.hasNext()) {
                it.next().f408a.show();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0087b.this.f399y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0087b.this.f399y = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0087b viewOnKeyListenerC0087b = ViewOnKeyListenerC0087b.this;
                viewOnKeyListenerC0087b.f399y.removeGlobalOnLayoutListener(viewOnKeyListenerC0087b.f384j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$c */
    public class c implements jqy {

        /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d f404a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MenuItem f405b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ MenuBuilder f406c;

            public a(d dVar, MenuItem menuItem, MenuBuilder menuBuilder) {
                this.f404a = dVar;
                this.f405b = menuItem;
                this.f406c = menuBuilder;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f404a;
                if (dVar != null) {
                    ViewOnKeyListenerC0087b.this.f375A = true;
                    dVar.f409b.close(false);
                    ViewOnKeyListenerC0087b.this.f375A = false;
                }
                if (this.f405b.isEnabled() && this.f405b.hasSubMenu()) {
                    this.f406c.performItemAction(this.f405b, 4);
                }
            }
        }

        public c() {
        }

        @Override // p153l.jqy
        /* JADX INFO: renamed from: a */
        public void mo419a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            ViewOnKeyListenerC0087b.this.f381g.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0087b.this.f383i.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (menuBuilder == ViewOnKeyListenerC0087b.this.f383i.get(i).f409b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            ViewOnKeyListenerC0087b.this.f381g.postAtTime(new a(i2 < ViewOnKeyListenerC0087b.this.f383i.size() ? ViewOnKeyListenerC0087b.this.f383i.get(i2) : null, menuItem, menuBuilder), menuBuilder, SystemClock.uptimeMillis() + 200);
        }

        @Override // p153l.jqy
        /* JADX INFO: renamed from: f */
        public void mo420f(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            ViewOnKeyListenerC0087b.this.f381g.removeCallbacksAndMessages(menuBuilder);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final MenuPopupWindow f408a;

        /* JADX INFO: renamed from: b */
        public final MenuBuilder f409b;

        /* JADX INFO: renamed from: c */
        public final int f410c;

        public d(@NonNull MenuPopupWindow menuPopupWindow, @NonNull MenuBuilder menuBuilder, int i) {
            this.f408a = menuPopupWindow;
            this.f409b = menuBuilder;
            this.f410c = i;
        }

        /* JADX INFO: renamed from: a */
        public ListView m421a() {
            return this.f408a.mo405g();
        }
    }

    public ViewOnKeyListenerC0087b(@NonNull Context context, @NonNull View view, @AttrRes int i, @StyleRes int i2, boolean z) {
        this.f376b = context;
        this.f389o = view;
        this.f378d = i;
        this.f379e = i2;
        this.f380f = z;
        Resources resources = context.getResources();
        this.f377c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(wac0.f188107d));
        this.f381g = new Handler();
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: a */
    public void mo402a(MenuBuilder menuBuilder) {
        menuBuilder.addMenuPresenter(this, this.f376b);
        if (isShowing()) {
            m418v(menuBuilder);
        } else {
            this.f382h.add(menuBuilder);
        }
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: b */
    public boolean mo403b() {
        return false;
    }

    @Override // p153l.a8f0
    public void dismiss() {
        int size = this.f383i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f383i.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.f408a.isShowing()) {
                    dVar.f408a.dismiss();
                }
            }
        }
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: e */
    public void mo404e(@NonNull View view) {
        if (this.f389o != view) {
            this.f389o = view;
            this.f388n = m9k.m157578b(this.f387m, kkl0.m150191x(view));
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public boolean flagActionItems() {
        return false;
    }

    @Override // p153l.a8f0
    /* JADX INFO: renamed from: g */
    public ListView mo405g() {
        if (this.f383i.isEmpty()) {
            return null;
        }
        List<d> list = this.f383i;
        return list.get(list.size() - 1).m421a();
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: h */
    public void mo406h(boolean z) {
        this.f396v = z;
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: i */
    public void mo407i(int i) {
        if (this.f387m != i) {
            this.f387m = i;
            this.f388n = m9k.m157578b(i, kkl0.m150191x(this.f389o));
        }
    }

    @Override // p153l.a8f0
    public boolean isShowing() {
        return this.f383i.size() > 0 && this.f383i.get(0).f408a.isShowing();
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: j */
    public void mo408j(int i) {
        this.f392r = true;
        this.f394t = i;
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: k */
    public void mo409k(PopupWindow.OnDismissListener onDismissListener) {
        this.f400z = onDismissListener;
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: l */
    public void mo410l(boolean z) {
        this.f397w = z;
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: m */
    public void mo411m(int i) {
        this.f393s = true;
        this.f395u = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        int iM413q = m413q(menuBuilder);
        if (iM413q < 0) {
            return;
        }
        int i = iM413q + 1;
        if (i < this.f383i.size()) {
            this.f383i.get(i).f409b.close(false);
        }
        d dVarRemove = this.f383i.remove(iM413q);
        dVarRemove.f409b.removeMenuPresenter(this);
        if (this.f375A) {
            dVarRemove.f408a.m579K(null);
            dVarRemove.f408a.m640w(0);
        }
        dVarRemove.f408a.dismiss();
        int size = this.f383i.size();
        if (size > 0) {
            this.f391q = this.f383i.get(size - 1).f410c;
        } else {
            this.f391q = m416t();
        }
        if (size != 0) {
            if (z) {
                this.f383i.get(0).f409b.close(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0092g.a aVar = this.f398x;
        if (aVar != null) {
            aVar.onCloseMenu(menuBuilder, true);
        }
        ViewTreeObserver viewTreeObserver = this.f399y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f399y.removeGlobalOnLayoutListener(this.f384j);
            }
            this.f399y = null;
        }
        this.f390p.removeOnAttachStateChangeListener(this.f385k);
        this.f400z.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f383i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f383i.get(i);
            if (!dVar.f408a.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.f409b.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public boolean onSubMenuSelected(SubMenuC0095j subMenuC0095j) {
        for (d dVar : this.f383i) {
            if (subMenuC0095j == dVar.f409b) {
                dVar.m421a().requestFocus();
                return true;
            }
        }
        if (!subMenuC0095j.hasVisibleItems()) {
            return false;
        }
        mo402a(subMenuC0095j);
        InterfaceC0092g.a aVar = this.f398x;
        if (aVar != null) {
            aVar.mo346a(subMenuC0095j);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final MenuPopupWindow m412p() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f376b, null, this.f378d, this.f379e);
        menuPopupWindow.m580L(this.f386l);
        menuPopupWindow.m621D(this);
        menuPopupWindow.m620C(this);
        menuPopupWindow.m639v(this.f389o);
        menuPopupWindow.m642y(this.f388n);
        menuPopupWindow.m619B(true);
        menuPopupWindow.m618A(2);
        return menuPopupWindow;
    }

    /* JADX INFO: renamed from: q */
    public final int m413q(@NonNull MenuBuilder menuBuilder) {
        int size = this.f383i.size();
        for (int i = 0; i < size; i++) {
            if (menuBuilder == this.f383i.get(i).f409b) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final MenuItem m414r(@NonNull MenuBuilder menuBuilder, @NonNull MenuBuilder menuBuilder2) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.hasSubMenu() && menuBuilder2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final View m415s(@NonNull d dVar, @NonNull MenuBuilder menuBuilder) {
        C0089d c0089d;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemM414r = m414r(dVar.f409b, menuBuilder);
        if (menuItemM414r == null) {
            return null;
        }
        ListView listViewM421a = dVar.m421a();
        ListAdapter adapter = listViewM421a.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c0089d = (C0089d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0089d = (C0089d) adapter;
            headersCount = 0;
        }
        int count = c0089d.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemM414r == c0089d.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewM421a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewM421a.getChildCount()) {
            return listViewM421a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public void setCallback(InterfaceC0092g.a aVar) {
        this.f398x = aVar;
    }

    @Override // p153l.a8f0
    public void show() {
        if (isShowing()) {
            return;
        }
        Iterator<MenuBuilder> it = this.f382h.iterator();
        while (it.hasNext()) {
            m418v(it.next());
        }
        this.f382h.clear();
        View view = this.f389o;
        this.f390p = view;
        if (view != null) {
            boolean z = this.f399y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f399y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f384j);
            }
            this.f390p.addOnAttachStateChangeListener(this.f385k);
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m416t() {
        return kkl0.m150191x(this.f389o) == 1 ? 0 : 1;
    }

    /* JADX INFO: renamed from: u */
    public final int m417u(int i) {
        List<d> list = this.f383i;
        ListView listViewM421a = list.get(list.size() - 1).m421a();
        int[] iArr = new int[2];
        listViewM421a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f390p.getWindowVisibleDisplayFrame(rect);
        if (this.f391q == 1) {
            return (iArr[0] + listViewM421a.getWidth()) + i > rect.right ? 0 : 1;
        }
        return iArr[0] - i < 0 ? 1 : 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public void updateMenuView(boolean z) {
        Iterator<d> it = this.f383i.iterator();
        while (it.hasNext()) {
            kqy.m150971o(it.next().m421a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m418v(@NonNull MenuBuilder menuBuilder) {
        d dVar;
        View viewM415s;
        int i;
        int i2;
        int i3;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f376b);
        C0089d c0089d = new C0089d(menuBuilder, layoutInflaterFrom, this.f380f, f374B);
        if (!isShowing() && this.f396v) {
            c0089d.m431d(true);
        } else if (isShowing()) {
            c0089d.m431d(kqy.m150970n(menuBuilder));
        }
        int iM150969d = kqy.m150969d(c0089d, null, this.f376b, this.f377c);
        MenuPopupWindow menuPopupWindowM412p = m412p();
        menuPopupWindowM412p.mo555l(c0089d);
        menuPopupWindowM412p.m641x(iM150969d);
        menuPopupWindowM412p.m642y(this.f388n);
        if (this.f383i.size() > 0) {
            List<d> list = this.f383i;
            dVar = list.get(list.size() - 1);
            viewM415s = m415s(dVar, menuBuilder);
        } else {
            dVar = null;
            viewM415s = null;
        }
        if (viewM415s != null) {
            menuPopupWindowM412p.m581M(false);
            menuPopupWindowM412p.m578J(null);
            int iM417u = m417u(iM150969d);
            boolean z = iM417u == 1;
            this.f391q = iM417u;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindowM412p.m639v(viewM415s);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f389o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewM415s.getLocationOnScreen(iArr2);
                if ((this.f388n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f389o.getWidth();
                    iArr2[0] = iArr2[0] + viewM415s.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f388n & 5) == 5) {
                if (z) {
                    i3 = i + iM150969d;
                } else {
                    iM150969d = viewM415s.getWidth();
                    i3 = i - iM150969d;
                }
            } else if (z) {
                iM150969d = viewM415s.getWidth();
                i3 = i + iM150969d;
            } else {
                i3 = i - iM150969d;
            }
            menuPopupWindowM412p.m630i(i3);
            menuPopupWindowM412p.m622E(true);
            menuPopupWindowM412p.m627b(i2);
        } else {
            if (this.f392r) {
                menuPopupWindowM412p.m630i(this.f394t);
            }
            if (this.f393s) {
                menuPopupWindowM412p.m627b(this.f395u);
            }
            menuPopupWindowM412p.m643z(m150972c());
        }
        this.f383i.add(new d(menuPopupWindowM412p, menuBuilder, this.f391q));
        menuPopupWindowM412p.show();
        ListView listViewMo405g = menuPopupWindowM412p.mo405g();
        listViewMo405g.setOnKeyListener(this);
        if (dVar == null && this.f397w && menuBuilder.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(kfc0.f126278n, (ViewGroup) listViewMo405g, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuBuilder.getHeaderTitle());
            listViewMo405g.addHeaderView(frameLayout, null, false);
            menuPopupWindowM412p.show();
        }
    }
}
