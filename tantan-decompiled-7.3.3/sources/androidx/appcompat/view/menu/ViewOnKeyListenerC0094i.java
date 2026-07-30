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
import p153l.kfc0;
import p153l.kkl0;
import p153l.kqy;
import p153l.wac0;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.i */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0094i extends kqy implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC0092g, View.OnKeyListener {

    /* JADX INFO: renamed from: v */
    public static final int f446v = kfc0.f126279o;

    /* JADX INFO: renamed from: b */
    public final Context f447b;

    /* JADX INFO: renamed from: c */
    public final MenuBuilder f448c;

    /* JADX INFO: renamed from: d */
    public final C0089d f449d;

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
    public InterfaceC0092g.a f460o;

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
            if (!ViewOnKeyListenerC0094i.this.isShowing() || ViewOnKeyListenerC0094i.this.f454i.m637t()) {
                return;
            }
            View view = ViewOnKeyListenerC0094i.this.f459n;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0094i.this.dismiss();
            } else {
                ViewOnKeyListenerC0094i.this.f454i.show();
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
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0094i.this.f461p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0094i.this.f461p = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0094i viewOnKeyListenerC0094i = ViewOnKeyListenerC0094i.this;
                viewOnKeyListenerC0094i.f461p.removeGlobalOnLayoutListener(viewOnKeyListenerC0094i.f455j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0094i(Context context, MenuBuilder menuBuilder, View view, int i, int i2, boolean z) {
        this.f447b = context;
        this.f448c = menuBuilder;
        this.f450e = z;
        this.f449d = new C0089d(menuBuilder, LayoutInflater.from(context), z, f446v);
        this.f452g = i;
        this.f453h = i2;
        Resources resources = context.getResources();
        this.f451f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(wac0.f188107d));
        this.f458m = view;
        this.f454i = new MenuPopupWindow(context, null, i, i2);
        menuBuilder.addMenuPresenter(this, context);
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: a */
    public void mo402a(MenuBuilder menuBuilder) {
    }

    @Override // p153l.a8f0
    public void dismiss() {
        if (isShowing()) {
            this.f454i.dismiss();
        }
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: e */
    public void mo404e(View view) {
        this.f458m = view;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public boolean flagActionItems() {
        return false;
    }

    @Override // p153l.a8f0
    /* JADX INFO: renamed from: g */
    public ListView mo405g() {
        return this.f454i.mo405g();
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: h */
    public void mo406h(boolean z) {
        this.f449d.m431d(z);
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: i */
    public void mo407i(int i) {
        this.f465t = i;
    }

    @Override // p153l.a8f0
    public boolean isShowing() {
        return !this.f462q && this.f454i.isShowing();
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: j */
    public void mo408j(int i) {
        this.f454i.m630i(i);
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: k */
    public void mo409k(PopupWindow.OnDismissListener onDismissListener) {
        this.f457l = onDismissListener;
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: l */
    public void mo410l(boolean z) {
        this.f466u = z;
    }

    @Override // p153l.kqy
    /* JADX INFO: renamed from: m */
    public void mo411m(int i) {
        this.f454i.m627b(i);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder != this.f448c) {
            return;
        }
        dismiss();
        InterfaceC0092g.a aVar = this.f460o;
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

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public boolean onSubMenuSelected(SubMenuC0095j subMenuC0095j) {
        if (subMenuC0095j.hasVisibleItems()) {
            C0091f c0091f = new C0091f(this.f447b, subMenuC0095j, this.f459n, this.f450e, this.f452g, this.f453h);
            c0091f.m443j(this.f460o);
            c0091f.m440g(kqy.m150970n(subMenuC0095j));
            c0091f.m442i(this.f457l);
            this.f457l = null;
            this.f448c.close(false);
            int iM629h = this.f454i.m629h();
            int iM628e = this.f454i.m628e();
            if ((Gravity.getAbsoluteGravity(this.f465t, kkl0.m150191x(this.f458m)) & 7) == 5) {
                iM629h += this.f458m.getWidth();
            }
            if (c0091f.m447n(iM629h, iM628e)) {
                InterfaceC0092g.a aVar = this.f460o;
                if (aVar == null) {
                    return true;
                }
                aVar.mo346a(subMenuC0095j);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m448p() {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.f462q || (view = this.f458m) == null) {
            return false;
        }
        this.f459n = view;
        this.f454i.m620C(this);
        this.f454i.m621D(this);
        this.f454i.m619B(true);
        View view2 = this.f459n;
        boolean z = this.f461p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f461p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f455j);
        }
        view2.addOnAttachStateChangeListener(this.f456k);
        this.f454i.m639v(view2);
        this.f454i.m642y(this.f465t);
        if (!this.f463r) {
            this.f464s = kqy.m150969d(this.f449d, null, this.f447b, this.f451f);
            this.f463r = true;
        }
        this.f454i.m641x(this.f464s);
        this.f454i.m618A(2);
        this.f454i.m643z(m150972c());
        this.f454i.show();
        ListView listViewMo405g = this.f454i.mo405g();
        listViewMo405g.setOnKeyListener(this);
        if (this.f466u && this.f448c.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f447b).inflate(kfc0.f126278n, (ViewGroup) listViewMo405g, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f448c.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            listViewMo405g.addHeaderView(frameLayout, null, false);
        }
        this.f454i.mo555l(this.f449d);
        this.f454i.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public void setCallback(InterfaceC0092g.a aVar) {
        this.f460o = aVar;
    }

    @Override // p153l.a8f0
    public void show() {
        if (m448p()) {
            return;
        }
        wtq0.m207906a("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g
    public void updateMenuView(boolean z) {
        this.f463r = false;
        C0089d c0089d = this.f449d;
        if (c0089d != null) {
            c0089d.notifyDataSetChanged();
        }
    }
}
