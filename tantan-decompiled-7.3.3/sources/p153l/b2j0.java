package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.InterfaceC0092g;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.C0165c;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b2j0 extends c30 {

    /* JADX INFO: renamed from: a */
    public qid f74622a;

    /* JADX INFO: renamed from: b */
    public boolean f74623b;

    /* JADX INFO: renamed from: c */
    public Window.Callback f74624c;

    /* JADX INFO: renamed from: d */
    public boolean f74625d;

    /* JADX INFO: renamed from: e */
    public boolean f74626e;

    /* JADX INFO: renamed from: f */
    public ArrayList<c30.InterfaceC16170b> f74627f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public final Runnable f74628g = new RunnableC15900a();

    /* JADX INFO: renamed from: h */
    public final Toolbar.InterfaceC0161f f74629h;

    /* JADX INFO: renamed from: l.b2j0$a */
    public class RunnableC15900a implements Runnable {
        public RunnableC15900a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b2j0.this.m102177K();
        }
    }

    /* JADX INFO: renamed from: l.b2j0$b */
    public class C15901b implements Toolbar.InterfaceC0161f {
        public C15901b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0161f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return b2j0.this.f74624c.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: renamed from: l.b2j0$c */
    public final class C15902c implements InterfaceC0092g.a {

        /* JADX INFO: renamed from: a */
        public boolean f74632a;

        public C15902c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g.a
        /* JADX INFO: renamed from: a */
        public boolean mo346a(MenuBuilder menuBuilder) {
            Window.Callback callback = b2j0.this.f74624c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0092g.a
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            if (this.f74632a) {
                return;
            }
            this.f74632a = true;
            b2j0.this.f74622a.mo666m();
            Window.Callback callback = b2j0.this.f74624c;
            if (callback != null) {
                callback.onPanelClosed(108, menuBuilder);
            }
            this.f74632a = false;
        }
    }

    /* JADX INFO: renamed from: l.b2j0$d */
    public final class C15903d implements MenuBuilder.InterfaceC0079a {
        public C15903d() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0079a
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0079a
        public void onMenuModeChange(MenuBuilder menuBuilder) {
            b2j0 b2j0Var = b2j0.this;
            if (b2j0Var.f74624c != null) {
                boolean zMo656c = b2j0Var.f74622a.mo656c();
                b2j0 b2j0Var2 = b2j0.this;
                if (zMo656c) {
                    b2j0Var2.f74624c.onPanelClosed(108, menuBuilder);
                } else if (b2j0Var2.f74624c.onPreparePanel(0, null, menuBuilder)) {
                    b2j0.this.f74624c.onMenuOpened(108, menuBuilder);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.b2j0$e */
    public class C15904e extends mfq0 {
        public C15904e(Window.Callback callback) {
            super(callback);
        }

        @Override // p153l.mfq0, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(b2j0.this.f74622a.getContext()) : super.onCreatePanelView(i);
        }

        @Override // p153l.mfq0, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (zOnPreparePanel) {
                b2j0 b2j0Var = b2j0.this;
                if (!b2j0Var.f74623b) {
                    b2j0Var.f74622a.mo659f();
                    b2j0.this.f74623b = true;
                }
            }
            return zOnPreparePanel;
        }
    }

    public b2j0(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C15901b c15901b = new C15901b();
        this.f74629h = c15901b;
        this.f74622a = new C0165c(toolbar, false);
        C15904e c15904e = new C15904e(callback);
        this.f74624c = c15904e;
        this.f74622a.setWindowCallback(c15904e);
        toolbar.setOnMenuItemClickListener(c15901b);
        this.f74622a.setWindowTitle(charSequence);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: A */
    public void mo102168A(float f) {
        kkl0.m150178q0(this.f74622a.mo673t(), f);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: B */
    public void mo102169B(int i) {
        this.f74622a.mo677x(i);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: C */
    public void mo102170C(Drawable drawable) {
        this.f74622a.mo670q(drawable);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: E */
    public void mo102172E(CharSequence charSequence) {
        this.f74622a.setTitle(charSequence);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: F */
    public void mo102173F(CharSequence charSequence) {
        this.f74622a.setWindowTitle(charSequence);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: G */
    public void mo102174G() {
        this.f74622a.mo667n(0);
    }

    /* JADX INFO: renamed from: I */
    public final Menu m102175I() {
        if (!this.f74625d) {
            this.f74622a.mo678y(new C15902c(), new C15903d());
            this.f74625d = true;
        }
        return this.f74622a.mo671r();
    }

    /* JADX INFO: renamed from: J */
    public Window.Callback m102176J() {
        return this.f74624c;
    }

    /* JADX INFO: renamed from: K */
    public void m102177K() {
        Menu menuM102175I = m102175I();
        MenuBuilder menuBuilder = menuM102175I instanceof MenuBuilder ? (MenuBuilder) menuM102175I : null;
        if (menuBuilder != null) {
            menuBuilder.stopDispatchingItemsChanged();
        }
        try {
            menuM102175I.clear();
            if (!this.f74624c.onCreatePanelMenu(0, menuM102175I) || !this.f74624c.onPreparePanel(0, null, menuM102175I)) {
                menuM102175I.clear();
            }
        } finally {
            if (menuBuilder != null) {
                menuBuilder.startDispatchingItemsChanged();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m102178L(int i, int i2) {
        this.f74622a.mo662i((i & i2) | ((~i2) & this.f74622a.mo668o()));
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: f */
    public boolean mo102179f() {
        return this.f74622a.mo657d();
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: g */
    public boolean mo102180g() {
        if (!this.f74622a.mo661h()) {
            return false;
        }
        this.f74622a.collapseActionView();
        return true;
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: h */
    public void mo102181h(boolean z) {
        if (z == this.f74626e) {
            return;
        }
        this.f74626e = z;
        int size = this.f74627f.size();
        for (int i = 0; i < size; i++) {
            this.f74627f.get(i).onMenuVisibilityChanged(z);
        }
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: i */
    public int mo102182i() {
        return this.f74622a.mo668o();
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: j */
    public float mo102183j() {
        return kkl0.m150183t(this.f74622a.mo673t());
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: k */
    public int mo102184k() {
        return this.f74622a.getHeight();
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: l */
    public Context mo102185l() {
        return this.f74622a.getContext();
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: m */
    public void mo102186m() {
        this.f74622a.mo667n(8);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: n */
    public boolean mo102187n() {
        this.f74622a.mo673t().removeCallbacks(this.f74628g);
        kkl0.m150148b0(this.f74622a.mo673t(), this.f74628g);
        return true;
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: o */
    public boolean mo102188o() {
        return this.f74622a.getVisibility() == 0;
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: p */
    public void mo102189p(Configuration configuration) {
        super.mo102189p(configuration);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: q */
    public void mo102190q() {
        this.f74622a.mo673t().removeCallbacks(this.f74628g);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: r */
    public boolean mo102191r(int i, KeyEvent keyEvent) {
        Menu menuM102175I = m102175I();
        if (menuM102175I == null) {
            return false;
        }
        menuM102175I.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuM102175I.performShortcut(i, keyEvent, 0);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: s */
    public boolean mo102192s(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo102193t();
        }
        return true;
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: t */
    public boolean mo102193t() {
        return this.f74622a.mo655b();
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: u */
    public void mo102194u(@Nullable Drawable drawable) {
        this.f74622a.setBackgroundDrawable(drawable);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: w */
    public void mo102196w(boolean z) {
        m102178L(z ? 4 : 0, 4);
    }

    @Override // p153l.c30
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: x */
    public void mo102197x(int i) {
        m102178L(i, -1);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: y */
    public void mo102198y(boolean z) {
        m102178L(z ? 2 : 0, 2);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: z */
    public void mo102199z(boolean z) {
        m102178L(z ? 8 : 0, 8);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: D */
    public void mo102171D(boolean z) {
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: v */
    public void mo102195v(boolean z) {
    }
}
