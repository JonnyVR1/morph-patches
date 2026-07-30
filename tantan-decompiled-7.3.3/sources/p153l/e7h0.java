package p153l;

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
public class e7h0 extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f92429a;

    /* JADX INFO: renamed from: b */
    public final o30 f92430b;

    /* JADX INFO: renamed from: l.e7h0$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class C16727a implements o30.InterfaceC19018a {

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f92431a;

        /* JADX INFO: renamed from: b */
        public final Context f92432b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<e7h0> f92433c = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        public final oof0<Menu, Menu> f92434d = new oof0<>();

        public C16727a(Context context, ActionMode.Callback callback) {
            this.f92432b = context;
            this.f92431a = callback;
        }

        @Override // p153l.o30.InterfaceC19018a
        /* JADX INFO: renamed from: a */
        public boolean mo347a(o30 o30Var, MenuItem menuItem) {
            return this.f92431a.onActionItemClicked(m119710e(o30Var), new MenuItemWrapperICS(this.f92432b, (h7h0) menuItem));
        }

        @Override // p153l.o30.InterfaceC19018a
        /* JADX INFO: renamed from: b */
        public boolean mo348b(o30 o30Var, Menu menu) {
            return this.f92431a.onCreateActionMode(m119710e(o30Var), m119711f(menu));
        }

        @Override // p153l.o30.InterfaceC19018a
        /* JADX INFO: renamed from: c */
        public boolean mo349c(o30 o30Var, Menu menu) {
            return this.f92431a.onPrepareActionMode(m119710e(o30Var), m119711f(menu));
        }

        @Override // p153l.o30.InterfaceC19018a
        /* JADX INFO: renamed from: d */
        public void mo350d(o30 o30Var) {
            this.f92431a.onDestroyActionMode(m119710e(o30Var));
        }

        /* JADX INFO: renamed from: e */
        public ActionMode m119710e(o30 o30Var) {
            int size = this.f92433c.size();
            for (int i = 0; i < size; i++) {
                e7h0 e7h0Var = this.f92433c.get(i);
                if (e7h0Var != null && e7h0Var.f92430b == o30Var) {
                    return e7h0Var;
                }
            }
            e7h0 e7h0Var2 = new e7h0(this.f92432b, o30Var);
            this.f92433c.add(e7h0Var2);
            return e7h0Var2;
        }

        /* JADX INFO: renamed from: f */
        public final Menu m119711f(Menu menu) {
            Menu menu2 = this.f92434d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            qqy qqyVar = new qqy(this.f92432b, (f7h0) menu);
            this.f92434d.put(menu, qqyVar);
            return qqyVar;
        }
    }

    public e7h0(Context context, o30 o30Var) {
        this.f92429a = context;
        this.f92430b = o30Var;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f92430b.mo152473a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f92430b.mo152474b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new qqy(this.f92429a, (f7h0) this.f92430b.mo152475c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f92430b.mo152476d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f92430b.mo152477e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f92430b.m165831f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f92430b.mo152478g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f92430b.m165832h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f92430b.mo152479i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f92430b.mo152480j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f92430b.mo152481k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f92430b.mo152483m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f92430b.m165833n(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f92430b.mo152485p(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f92430b.mo152486q(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f92430b.mo152482l(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f92430b.mo152484o(i);
    }
}
