package p153l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class o30 {

    /* JADX INFO: renamed from: a */
    public Object f144812a;

    /* JADX INFO: renamed from: b */
    public boolean f144813b;

    /* JADX INFO: renamed from: l.o30$a */
    public interface InterfaceC19018a {
        /* JADX INFO: renamed from: a */
        boolean mo347a(o30 o30Var, MenuItem menuItem);

        /* JADX INFO: renamed from: b */
        boolean mo348b(o30 o30Var, Menu menu);

        /* JADX INFO: renamed from: c */
        boolean mo349c(o30 o30Var, Menu menu);

        /* JADX INFO: renamed from: d */
        void mo350d(o30 o30Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo152473a();

    /* JADX INFO: renamed from: b */
    public abstract View mo152474b();

    /* JADX INFO: renamed from: c */
    public abstract Menu mo152475c();

    /* JADX INFO: renamed from: d */
    public abstract MenuInflater mo152476d();

    /* JADX INFO: renamed from: e */
    public abstract CharSequence mo152477e();

    /* JADX INFO: renamed from: f */
    public Object m165831f() {
        return this.f144812a;
    }

    /* JADX INFO: renamed from: g */
    public abstract CharSequence mo152478g();

    /* JADX INFO: renamed from: h */
    public boolean m165832h() {
        return this.f144813b;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo152479i();

    /* JADX INFO: renamed from: j */
    public boolean mo152480j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo152481k(View view);

    /* JADX INFO: renamed from: l */
    public abstract void mo152482l(int i);

    /* JADX INFO: renamed from: m */
    public abstract void mo152483m(CharSequence charSequence);

    /* JADX INFO: renamed from: n */
    public void m165833n(Object obj) {
        this.f144812a = obj;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo152484o(int i);

    /* JADX INFO: renamed from: p */
    public abstract void mo152485p(CharSequence charSequence);

    /* JADX INFO: renamed from: q */
    public void mo152486q(boolean z) {
        this.f144813b = z;
    }
}
