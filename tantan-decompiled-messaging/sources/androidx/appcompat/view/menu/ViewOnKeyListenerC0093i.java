package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;
import p149l.g7c0;
import p149l.gbl0;
import p149l.nhy;
import p149l.p2c0;
import p149l.qkq0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.i */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0093i extends nhy implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC0091g, View.OnKeyListener {

    /* JADX INFO: renamed from: v */
    public static final int f446v = g7c0.f101367o;

    /* JADX INFO: renamed from: b */
    public final Context f447b;

    /* JADX INFO: renamed from: c */
    public final MenuBuilder f448c;

    /* JADX INFO: renamed from: d */
    public final C0088d f449d;

    /* JADX INFO: renamed from: e */
    public final boolean f450e;

    /* JADX INFO: renamed from: f */
    public final int f451f;

    /* JADX INFO: renamed from: g */
    public final int f452g;

    /* JADX INFO: renamed from: h */
    public final int f453h;

    /* JADX INFO: renamed from: i */
    public final MenuPopupWindow f454i;

    /* JADX INFO: renamed from: l */
    public PopupWindow.OnDismissListener f457l;

    /* JADX INFO: renamed from: m */
    public View f458m;

    /* JADX INFO: renamed from: n */
    public View f459n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0091g.a f460o;

    /* JADX INFO: renamed from: p */
    public ViewTreeObserver f461p;

    /* JADX INFO: renamed from: q */
    public boolean f462q;

    /* JADX INFO: renamed from: r */
    public boolean f463r;

    /* JADX INFO: renamed from: s */
    public int f464s;

    /* JADX INFO: renamed from: u */
    public boolean f466u;

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserver.OnGlobalLayoutListener f455j = new a();

    /* JADX INFO: renamed from: k */
    public final View.OnAttachStateChangeListener f456k = new b();

    /* JADX INFO: renamed from: t */
    public int f465t = 0;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.i$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0093i.this.isShowing() || ViewOnKeyListenerC0093i.this.f454i.m636t()) {
                return;
            }
            View view = ViewOnKeyListenerC0093i.this.f459n;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0093i.this.dismiss();
            } else {
                ViewOnKeyListenerC0093i.this.f454i.show();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.i$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0093i.this.f461p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0093i.this.f461p = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0093i viewOnKeyListenerC0093i = ViewOnKeyListenerC0093i.this;
                viewOnKeyListenerC0093i.f461p.removeGlobalOnLayoutListener(viewOnKeyListenerC0093i.f455j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0093i(Context context, MenuBuilder menuBuilder, View view, int i, int i2, boolean z) {
        this.f447b = context;
        this.f448c = menuBuilder;
        this.f450e = z;
        this.f449d = new C0088d(menuBuilder, LayoutInflater.from(context), z, f446v);
        this.f452g = i;
        this.f453h = i2;
        Resources resources = context.getResources();
        this.f451f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p2c0.f146835d));
        this.f458m = view;
        this.f454i = new MenuPopupWindow(context, null, i, i2);
        menuBuilder.addMenuPresenter(this, context);
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: a */
    public void mo401a(MenuBuilder menuBuilder) {
    }

    @Override // p149l.tze0
    public void dismiss() {
        if (isShowing()) {
            this.f454i.dismiss();
        }
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: e */
    public void mo403e(View view) {
        this.f458m = view;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public boolean flagActionItems() {
        return false;
    }

    @Override // p149l.tze0
    /* JADX INFO: renamed from: g */
    public ListView mo404g() {
        return this.f454i.mo404g();
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: h */
    public void mo405h(boolean z) {
        this.f449d.m430d(z);
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: i */
    public void mo406i(int i) {
        this.f465t = i;
    }

    @Override // p149l.tze0
    public boolean isShowing() {
        return !this.f462q && this.f454i.isShowing();
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: j */
    public void mo407j(int i) {
        this.f454i.m629i(i);
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: k */
    public void mo408k(PopupWindow.OnDismissListener onDismissListener) {
        this.f457l = onDismissListener;
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: l */
    public void mo409l(boolean z) {
        this.f466u = z;
    }

    @Override // p149l.nhy
    /* JADX INFO: renamed from: m */
    public void mo410m(int i) {
        this.f454i.m626b(i);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder != this.f448c) {
            return;
        }
        dismiss();
        InterfaceC0091g.a aVar = this.f460o;
        if (aVar != null) {
            aVar.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f462q = true;
        this.f448c.close();
        ViewTreeObserver viewTreeObserver = this.f461p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f461p = this.f459n.getViewTreeObserver();
            }
            this.f461p.removeGlobalOnLayoutListener(this.f455j);
            this.f461p = null;
        }
        this.f459n.removeOnAttachStateChangeListener(this.f456k);
        PopupWindow.OnDismissListener onDismissListener = this.f457l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        if (subMenuC0094j.hasVisibleItems()) {
            C0090f c0090f = new C0090f(this.f447b, subMenuC0094j, this.f459n, this.f450e, this.f452g, this.f453h);
            c0090f.m442j(this.f460o);
            c0090f.m439g(nhy.m159479n(subMenuC0094j));
            c0090f.m441i(this.f457l);
            this.f457l = null;
            this.f448c.close(false);
            int iM628h = this.f454i.m628h();
            int iM627e = this.f454i.m627e();
            if ((Gravity.getAbsoluteGravity(this.f465t, gbl0.m125228x(this.f458m)) & 7) == 5) {
                iM628h += this.f458m.getWidth();
            }
            if (c0090f.m446n(iM628h, iM627e)) {
                InterfaceC0091g.a aVar = this.f460o;
                if (aVar == null) {
                    return true;
                }
                aVar.mo345a(subMenuC0094j);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m447p() {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.f462q || (view = this.f458m) == null) {
            return false;
        }
        this.f459n = view;
        this.f454i.m619C(this);
        this.f454i.m620D(this);
        this.f454i.m618B(true);
        View view2 = this.f459n;
        boolean z = this.f461p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f461p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f455j);
        }
        view2.addOnAttachStateChangeListener(this.f456k);
        this.f454i.m638v(view2);
        this.f454i.m641y(this.f465t);
        if (!this.f463r) {
            this.f464s = nhy.m159478d(this.f449d, null, this.f447b, this.f451f);
            this.f463r = true;
        }
        this.f454i.m640x(this.f464s);
        this.f454i.m617A(2);
        this.f454i.m642z(m159481c());
        this.f454i.show();
        ListView listViewMo404g = this.f454i.mo404g();
        listViewMo404g.setOnKeyListener(this);
        if (this.f466u && this.f448c.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f447b).inflate(g7c0.f101366n, (ViewGroup) listViewMo404g, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f448c.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            listViewMo404g.addHeaderView(frameLayout, null, false);
        }
        this.f454i.mo554l(this.f449d);
        this.f454i.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void setCallback(InterfaceC0091g.a aVar) {
        this.f460o = aVar;
    }

    @Override // p149l.tze0
    public void show() {
        if (m447p()) {
            return;
        }
        qkq0.m175383a("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void updateMenuView(boolean z) {
        this.f463r = false;
        C0088d c0088d = this.f449d;
        if (c0088d != null) {
            c0088d.notifyDataSetChanged();
        }
    }
}
