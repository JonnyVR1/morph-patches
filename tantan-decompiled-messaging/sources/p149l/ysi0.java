package p149l;

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
import androidx.appcompat.view.menu.InterfaceC0091g;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.C0164c;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ysi0 extends i30 {

    /* JADX INFO: renamed from: a */
    public khd f199771a;

    /* JADX INFO: renamed from: b */
    public boolean f199772b;

    /* JADX INFO: renamed from: c */
    public Window.Callback f199773c;

    /* JADX INFO: renamed from: d */
    public boolean f199774d;

    /* JADX INFO: renamed from: e */
    public boolean f199775e;

    /* JADX INFO: renamed from: f */
    public ArrayList<i30.InterfaceC17466b> f199776f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public final Runnable f199777g = new RunnableC21499a();

    /* JADX INFO: renamed from: h */
    public final Toolbar.InterfaceC0160f f199778h;

    /* JADX INFO: renamed from: l.ysi0$a */
    public class RunnableC21499a implements Runnable {
        public RunnableC21499a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ysi0.this.m215910K();
        }
    }

    /* JADX INFO: renamed from: l.ysi0$b */
    public class C21500b implements Toolbar.InterfaceC0160f {
        public C21500b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0160f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return ysi0.this.f199773c.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: renamed from: l.ysi0$c */
    public final class C21501c implements InterfaceC0091g.a {

        /* JADX INFO: renamed from: a */
        public boolean f199781a;

        public C21501c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091g.a
        /* JADX INFO: renamed from: a */
        public boolean mo345a(MenuBuilder menuBuilder) {
            Window.Callback callback = ysi0.this.f199773c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091g.a
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            if (this.f199781a) {
                return;
            }
            this.f199781a = true;
            ysi0.this.f199771a.mo665m();
            Window.Callback callback = ysi0.this.f199773c;
            if (callback != null) {
                callback.onPanelClosed(108, menuBuilder);
            }
            this.f199781a = false;
        }
    }

    /* JADX INFO: renamed from: l.ysi0$d */
    public final class C21502d implements MenuBuilder.InterfaceC0078a {
        public C21502d() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0078a
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0078a
        public void onMenuModeChange(MenuBuilder menuBuilder) {
            ysi0 ysi0Var = ysi0.this;
            if (ysi0Var.f199773c != null) {
                boolean zMo655c = ysi0Var.f199771a.mo655c();
                ysi0 ysi0Var2 = ysi0.this;
                if (zMo655c) {
                    ysi0Var2.f199773c.onPanelClosed(108, menuBuilder);
                } else if (ysi0Var2.f199773c.onPreparePanel(0, null, menuBuilder)) {
                    ysi0.this.f199773c.onMenuOpened(108, menuBuilder);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.ysi0$e */
    public class C21503e extends h6q0 {
        public C21503e(Window.Callback callback) {
            super(callback);
        }

        @Override // p149l.h6q0, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(ysi0.this.f199771a.getContext()) : super.onCreatePanelView(i);
        }

        @Override // p149l.h6q0, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (zOnPreparePanel) {
                ysi0 ysi0Var = ysi0.this;
                if (!ysi0Var.f199772b) {
                    ysi0Var.f199771a.mo658f();
                    ysi0.this.f199772b = true;
                }
            }
            return zOnPreparePanel;
        }
    }

    public ysi0(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C21500b c21500b = new C21500b();
        this.f199778h = c21500b;
        this.f199771a = new C0164c(toolbar, false);
        C21503e c21503e = new C21503e(callback);
        this.f199773c = c21503e;
        this.f199771a.setWindowCallback(c21503e);
        toolbar.setOnMenuItemClickListener(c21500b);
        this.f199771a.setWindowTitle(charSequence);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: A */
    public void mo134111A(float f) {
        gbl0.m125215q0(this.f199771a.mo672t(), f);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: B */
    public void mo134112B(int i) {
        this.f199771a.mo676x(i);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: C */
    public void mo134113C(Drawable drawable) {
        this.f199771a.mo669q(drawable);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: E */
    public void mo134115E(CharSequence charSequence) {
        this.f199771a.setTitle(charSequence);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: F */
    public void mo134116F(CharSequence charSequence) {
        this.f199771a.setWindowTitle(charSequence);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: G */
    public void mo134117G() {
        this.f199771a.mo666n(0);
    }

    /* JADX INFO: renamed from: I */
    public final Menu m215908I() {
        if (!this.f199774d) {
            this.f199771a.mo677y(new C21501c(), new C21502d());
            this.f199774d = true;
        }
        return this.f199771a.mo670r();
    }

    /* JADX INFO: renamed from: J */
    public Window.Callback m215909J() {
        return this.f199773c;
    }

    /* JADX INFO: renamed from: K */
    public void m215910K() {
        Menu menuM215908I = m215908I();
        MenuBuilder menuBuilder = menuM215908I instanceof MenuBuilder ? (MenuBuilder) menuM215908I : null;
        if (menuBuilder != null) {
            menuBuilder.stopDispatchingItemsChanged();
        }
        try {
            menuM215908I.clear();
            if (!this.f199773c.onCreatePanelMenu(0, menuM215908I) || !this.f199773c.onPreparePanel(0, null, menuM215908I)) {
                menuM215908I.clear();
            }
        } finally {
            if (menuBuilder != null) {
                menuBuilder.startDispatchingItemsChanged();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m215911L(int i, int i2) {
        this.f199771a.mo661i((i & i2) | ((~i2) & this.f199771a.mo667o()));
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: f */
    public boolean mo134119f() {
        return this.f199771a.mo656d();
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: g */
    public boolean mo134120g() {
        if (!this.f199771a.mo660h()) {
            return false;
        }
        this.f199771a.collapseActionView();
        return true;
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: h */
    public void mo134121h(boolean z) {
        if (z == this.f199775e) {
            return;
        }
        this.f199775e = z;
        int size = this.f199776f.size();
        for (int i = 0; i < size; i++) {
            this.f199776f.get(i).onMenuVisibilityChanged(z);
        }
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: i */
    public int mo134122i() {
        return this.f199771a.mo667o();
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: j */
    public float mo134123j() {
        return gbl0.m125220t(this.f199771a.mo672t());
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: k */
    public int mo134124k() {
        return this.f199771a.getHeight();
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: l */
    public Context mo134125l() {
        return this.f199771a.getContext();
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: m */
    public void mo134126m() {
        this.f199771a.mo666n(8);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: n */
    public boolean mo134127n() {
        this.f199771a.mo672t().removeCallbacks(this.f199777g);
        gbl0.m125185b0(this.f199771a.mo672t(), this.f199777g);
        return true;
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: o */
    public boolean mo134128o() {
        return this.f199771a.getVisibility() == 0;
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: p */
    public void mo134129p(Configuration configuration) {
        super.mo134129p(configuration);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: q */
    public void mo134130q() {
        this.f199771a.mo672t().removeCallbacks(this.f199777g);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: r */
    public boolean mo134131r(int i, KeyEvent keyEvent) {
        Menu menuM215908I = m215908I();
        if (menuM215908I == null) {
            return false;
        }
        menuM215908I.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuM215908I.performShortcut(i, keyEvent, 0);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: s */
    public boolean mo134132s(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo134133t();
        }
        return true;
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: t */
    public boolean mo134133t() {
        return this.f199771a.mo654b();
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: u */
    public void mo134134u(@Nullable Drawable drawable) {
        this.f199771a.setBackgroundDrawable(drawable);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: w */
    public void mo134136w(boolean z) {
        m215911L(z ? 4 : 0, 4);
    }

    @Override // p149l.i30
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: x */
    public void mo134137x(int i) {
        m215911L(i, -1);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: y */
    public void mo134138y(boolean z) {
        m215911L(z ? 2 : 0, 2);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: z */
    public void mo134139z(boolean z) {
        m215911L(z ? 8 : 0, 8);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: D */
    public void mo134114D(boolean z) {
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: v */
    public void mo134135v(boolean z) {
    }
}
