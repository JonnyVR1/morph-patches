package p149l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class wyg0 extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f188561a;

    /* JADX INFO: renamed from: b */
    public final u30 f188562b;

    /* JADX INFO: renamed from: l.wyg0$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class C20993a implements u30.InterfaceC20342a {

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f188563a;

        /* JADX INFO: renamed from: b */
        public final Context f188564b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<wyg0> f188565c = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        public final hgf0<Menu, Menu> f188566d = new hgf0<>();

        public C20993a(Context context, ActionMode.Callback callback) {
            this.f188564b = context;
            this.f188563a = callback;
        }

        @Override // p149l.u30.InterfaceC20342a
        /* JADX INFO: renamed from: a */
        public boolean mo346a(u30 u30Var, MenuItem menuItem) {
            return this.f188563a.onActionItemClicked(m206099e(u30Var), new MenuItemWrapperICS(this.f188564b, (zyg0) menuItem));
        }

        @Override // p149l.u30.InterfaceC20342a
        /* JADX INFO: renamed from: b */
        public boolean mo347b(u30 u30Var, Menu menu) {
            return this.f188563a.onCreateActionMode(m206099e(u30Var), m206100f(menu));
        }

        @Override // p149l.u30.InterfaceC20342a
        /* JADX INFO: renamed from: c */
        public boolean mo348c(u30 u30Var, Menu menu) {
            return this.f188563a.onPrepareActionMode(m206099e(u30Var), m206100f(menu));
        }

        @Override // p149l.u30.InterfaceC20342a
        /* JADX INFO: renamed from: d */
        public void mo349d(u30 u30Var) {
            this.f188563a.onDestroyActionMode(m206099e(u30Var));
        }

        /* JADX INFO: renamed from: e */
        public ActionMode m206099e(u30 u30Var) {
            int size = this.f188565c.size();
            for (int i = 0; i < size; i++) {
                wyg0 wyg0Var = this.f188565c.get(i);
                if (wyg0Var != null && wyg0Var.f188562b == u30Var) {
                    return wyg0Var;
                }
            }
            wyg0 wyg0Var2 = new wyg0(this.f188564b, u30Var);
            this.f188565c.add(wyg0Var2);
            return wyg0Var2;
        }

        /* JADX INFO: renamed from: f */
        public final Menu m206100f(Menu menu) {
            Menu menu2 = this.f188566d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            thy thyVar = new thy(this.f188564b, (xyg0) menu);
            this.f188566d.put(menu, thyVar);
            return thyVar;
        }
    }

    public wyg0(Context context, u30 u30Var) {
        this.f188561a = context;
        this.f188562b = u30Var;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f188562b.mo108669a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f188562b.mo108670b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new thy(this.f188561a, (xyg0) this.f188562b.mo108671c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f188562b.mo108672d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f188562b.mo108673e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f188562b.m191557f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f188562b.mo108674g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f188562b.m191558h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f188562b.mo108675i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f188562b.mo108676j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f188562b.mo108677k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f188562b.mo108679m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f188562b.m191559n(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f188562b.mo108681p(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f188562b.mo108682q(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f188562b.mo108678l(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f188562b.mo108680o(i);
    }
}
