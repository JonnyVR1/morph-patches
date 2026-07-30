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
import p149l.g7c0;
import p149l.gbl0;
import p149l.mhy;
import p149l.nhy;
import p149l.p2c0;
import p149l.u6k;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0086b extends nhy implements InterfaceC0091g, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: B */
    public static final int f374B = g7c0.f101359g;

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
    public InterfaceC0091g.a f398x;

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
    public final mhy f386l = new c();

    /* JADX INFO: renamed from: m */
    public int f387m = 0;

    /* JADX INFO: renamed from: n */
    public int f388n = 0;

    /* JADX INFO: renamed from: v */
    public boolean f396v = false;

    /* JADX INFO: renamed from: q */
    public int f391q = m415t();

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0086b.this.isShowing() || ViewOnKeyListenerC0086b.this.f383i.size() <= 0 || ViewOnKeyListenerC0086b.this.f383i.get(0).f408a.m636t()) {
                return;
            }
            View view = ViewOnKeyListenerC0086b.this.f390p;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0086b.this.dismiss();
                return;
            }
            Iterator<d> it = ViewOnKeyListenerC0086b.this.f383i.iterator();
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
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0086b.this.f399y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0086b.this.f399y = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0086b viewOnKeyListenerC0086b = ViewOnKeyListenerC0086b.this;
                viewOnKeyListenerC0086b.f399y.removeGlobalOnLayoutListener(viewOnKeyListenerC0086b.f384j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$c */
    public class c implements mhy {

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
                    ViewOnKeyListenerC0086b.this.f375A = true;
                    dVar.f409b.close(false);
                    ViewOnKeyListenerC0086b.this.f375A = false;
                }
                if (this.f405b.isEnabled() && this.f405b.hasSubMenu()) {
                    this.f406c.performItemAction(this.f405b, 4);
                }
            }
        }

        public c() {
        }

        @Override // p149l.mhy
        /* JADX INFO: renamed from: a */
        public void mo418a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            ViewOnKeyListenerC0086b.this.f381g.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0086b.this.f383i.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (menuBuilder == ViewOnKeyListenerC0086b.this.f383i.get(i).f409b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            ViewOnKeyListenerC0086b.this.f381g.postAtTime(new a(i2 < ViewOnKeyListenerC0086b.this.f383i.size() ? ViewOnKeyListenerC0086b.this.f383i.get(i2) : null, menuItem, menuBuilder), menuBuilder, SystemClock.uptimeMillis() + 200);
        }

        @Override // p149l.mhy
        /* JADX INFO: renamed from: f */
        public void mo419f(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            ViewOnKeyListenerC0086b.this.f381g.removeCallbacksAndMessages(menuBuilder);
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
        public ListView m420a() {
            return this.f408a.mo404g();
        }
    }

    public ViewOnKeyListenerC0086b(@NonNull Context context, @NonNull View view, @AttrRes int i, @StyleRes int i2, boolean z) {
        this.f376b = context;
        this.f389o = view;
        this.f378d = i;
        this.f379e = i2;
        this.f380f = z;
        Resources resources = context.getResources();
        this.f377c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p2c0.f146835d));
        this.f381g = new Handler();
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: a */
    public void mo401a(MenuBuilder menuBuilder) {
        menuBuilder.addMenuPresenter(this, this.f376b);
        if (isShowing()) {
            m417v(menuBuilder);
        } else {
            this.f382h.add(menuBuilder);
        }
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: b */
    public boolean mo402b() {
        return false;
    }

    @Override // p149l.tze0
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

    @Override // p149l.nhy
    /* JADX INFO: renamed from: e */
    public void mo403e(@NonNull View view) {
        if (this.f389o != view) {
            this.f389o = view;
            this.f388n = u6k.m191981b(this.f387m, gbl0.m125228x(view));
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public boolean flagActionItems() {
        return false;
    }

    @Override // p149l.tze0
    /* JADX INFO: renamed from: g */
    public ListView mo404g() {
        if (this.f383i.isEmpty()) {
            return null;
        }
        List<d> list = this.f383i;
        return list.get(list.size() - 1).m420a();
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: h */
    public void mo405h(boolean z) {
        this.f396v = z;
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: i */
    public void mo406i(int i) {
        if (this.f387m != i) {
            this.f387m = i;
            this.f388n = u6k.m191981b(i, gbl0.m125228x(this.f389o));
        }
    }

    @Override // p149l.tze0
    public boolean isShowing() {
        return this.f383i.size() > 0 && this.f383i.get(0).f408a.isShowing();
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: j */
    public void mo407j(int i) {
        this.f392r = true;
        this.f394t = i;
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: k */
    public void mo408k(PopupWindow.OnDismissListener onDismissListener) {
        this.f400z = onDismissListener;
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: l */
    public void mo409l(boolean z) {
        this.f397w = z;
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: m */
    public void mo410m(int i) {
        this.f393s = true;
        this.f395u = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        int iM412q = m412q(menuBuilder);
        if (iM412q < 0) {
            return;
        }
        int i = iM412q + 1;
        if (i < this.f383i.size()) {
            this.f383i.get(i).f409b.close(false);
        }
        d dVarRemove = this.f383i.remove(iM412q);
        dVarRemove.f409b.removeMenuPresenter(this);
        if (this.f375A) {
            dVarRemove.f408a.m578K(null);
            dVarRemove.f408a.m639w(0);
        }
        dVarRemove.f408a.dismiss();
        int size = this.f383i.size();
        if (size > 0) {
            this.f391q = this.f383i.get(size - 1).f410c;
        } else {
            this.f391q = m415t();
        }
        if (size != 0) {
            if (z) {
                this.f383i.get(0).f409b.close(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0091g.a aVar = this.f398x;
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

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public boolean onSubMenuSelected(SubMenuC0094j subMenuC0094j) {
        for (d dVar : this.f383i) {
            if (subMenuC0094j == dVar.f409b) {
                dVar.m420a().requestFocus();
                return true;
            }
        }
        if (!subMenuC0094j.hasVisibleItems()) {
            return false;
        }
        mo401a(subMenuC0094j);
        InterfaceC0091g.a aVar = this.f398x;
        if (aVar != null) {
            aVar.mo345a(subMenuC0094j);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final MenuPopupWindow m411p() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f376b, null, this.f378d, this.f379e);
        menuPopupWindow.m579L(this.f386l);
        menuPopupWindow.m620D(this);
        menuPopupWindow.m619C(this);
        menuPopupWindow.m638v(this.f389o);
        menuPopupWindow.m641y(this.f388n);
        menuPopupWindow.m618B(true);
        menuPopupWindow.m617A(2);
        return menuPopupWindow;
    }

    /* JADX INFO: renamed from: q */
    public final int m412q(@NonNull MenuBuilder menuBuilder) {
        int size = this.f383i.size();
        for (int i = 0; i < size; i++) {
            if (menuBuilder == this.f383i.get(i).f409b) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final MenuItem m413r(@NonNull MenuBuilder menuBuilder, @NonNull MenuBuilder menuBuilder2) {
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
    public final View m414s(@NonNull d dVar, @NonNull MenuBuilder menuBuilder) {
        C0088d c0088d;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemM413r = m413r(dVar.f409b, menuBuilder);
        if (menuItemM413r == null) {
            return null;
        }
        ListView listViewM420a = dVar.m420a();
        ListAdapter adapter = listViewM420a.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c0088d = (C0088d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0088d = (C0088d) adapter;
            headersCount = 0;
        }
        int count = c0088d.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemM413r == c0088d.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewM420a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewM420a.getChildCount()) {
            return listViewM420a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void setCallback(InterfaceC0091g.a aVar) {
        this.f398x = aVar;
    }

    @Override // p149l.tze0
    public void show() {
        if (isShowing()) {
            return;
        }
        Iterator<MenuBuilder> it = this.f382h.iterator();
        while (it.hasNext()) {
            m417v(it.next());
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
    public final int m415t() {
        return gbl0.m125228x(this.f389o) == 1 ? 0 : 1;
    }

    /* JADX INFO: renamed from: u */
    public final int m416u(int i) {
        List<d> list = this.f383i;
        ListView listViewM420a = list.get(list.size() - 1).m420a();
        int[] iArr = new int[2];
        listViewM420a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f390p.getWindowVisibleDisplayFrame(rect);
        if (this.f391q == 1) {
            return (iArr[0] + listViewM420a.getWidth()) + i > rect.right ? 0 : 1;
        }
        return iArr[0] - i < 0 ? 1 : 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void updateMenuView(boolean z) {
        Iterator<d> it = this.f383i.iterator();
        while (it.hasNext()) {
            nhy.m159480o(it.next().m420a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m417v(@NonNull MenuBuilder menuBuilder) {
        d dVar;
        View viewM414s;
        int i;
        int i2;
        int i3;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f376b);
        C0088d c0088d = new C0088d(menuBuilder, layoutInflaterFrom, this.f380f, f374B);
        if (!isShowing() && this.f396v) {
            c0088d.m430d(true);
        } else if (isShowing()) {
            c0088d.m430d(nhy.m159479n(menuBuilder));
        }
        int iM159478d = nhy.m159478d(c0088d, null, this.f376b, this.f377c);
        MenuPopupWindow menuPopupWindowM411p = m411p();
        menuPopupWindowM411p.mo554l(c0088d);
        menuPopupWindowM411p.m640x(iM159478d);
        menuPopupWindowM411p.m641y(this.f388n);
        if (this.f383i.size() > 0) {
            List<d> list = this.f383i;
            dVar = list.get(list.size() - 1);
            viewM414s = m414s(dVar, menuBuilder);
        } else {
            dVar = null;
            viewM414s = null;
        }
        if (viewM414s != null) {
            menuPopupWindowM411p.m580M(false);
            menuPopupWindowM411p.m577J(null);
            int iM416u = m416u(iM159478d);
            boolean z = iM416u == 1;
            this.f391q = iM416u;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindowM411p.m638v(viewM414s);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f389o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewM414s.getLocationOnScreen(iArr2);
                if ((this.f388n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f389o.getWidth();
                    iArr2[0] = iArr2[0] + viewM414s.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f388n & 5) == 5) {
                if (z) {
                    i3 = i + iM159478d;
                } else {
                    iM159478d = viewM414s.getWidth();
                    i3 = i - iM159478d;
                }
            } else if (z) {
                iM159478d = viewM414s.getWidth();
                i3 = i + iM159478d;
            } else {
                i3 = i - iM159478d;
            }
            menuPopupWindowM411p.m629i(i3);
            menuPopupWindowM411p.m621E(true);
            menuPopupWindowM411p.m626b(i2);
        } else {
            if (this.f392r) {
                menuPopupWindowM411p.m629i(this.f394t);
            }
            if (this.f393s) {
                menuPopupWindowM411p.m626b(this.f395u);
            }
            menuPopupWindowM411p.m642z(m159481c());
        }
        this.f383i.add(new d(menuPopupWindowM411p, menuBuilder, this.f391q));
        menuPopupWindowM411p.show();
        ListView listViewMo404g = menuPopupWindowM411p.mo404g();
        listViewMo404g.setOnKeyListener(this);
        if (dVar == null && this.f397w && menuBuilder.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(g7c0.f101366n, (ViewGroup) listViewMo404g, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuBuilder.getHeaderTitle());
            listViewMo404g.addHeaderView(frameLayout, null, false);
            menuPopupWindowM411p.show();
        }
    }
}
