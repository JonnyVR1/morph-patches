package p149l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class eu0 {

    /* JADX INFO: renamed from: a */
    public final View f93199a;

    /* JADX INFO: renamed from: d */
    public ori0 f93202d;

    /* JADX INFO: renamed from: e */
    public ori0 f93203e;

    /* JADX INFO: renamed from: f */
    public ori0 f93204f;

    /* JADX INFO: renamed from: c */
    public int f93201c = -1;

    /* JADX INFO: renamed from: b */
    public final iu0 f93200b = iu0.m138315b();

    public eu0(View view) {
        this.f93199a = view;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m118132a(@NonNull Drawable drawable) {
        if (this.f93204f == null) {
            this.f93204f = new ori0();
        }
        ori0 ori0Var = this.f93204f;
        ori0Var.m165668a();
        ColorStateList colorStateListM125212p = gbl0.m125212p(this.f93199a);
        if (colorStateListM125212p != null) {
            ori0Var.f145325d = true;
            ori0Var.f145322a = colorStateListM125212p;
        }
        PorterDuff.Mode modeM125214q = gbl0.m125214q(this.f93199a);
        if (modeM125214q != null) {
            ori0Var.f145324c = true;
            ori0Var.f145323b = modeM125214q;
        }
        if (!ori0Var.f145325d && !ori0Var.f145324c) {
            return false;
        }
        iu0.m138318i(drawable, ori0Var, this.f93199a.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m118133b() {
        Drawable background = this.f93199a.getBackground();
        if (background != null) {
            if (m118142k() && m118132a(background)) {
                return;
            }
            ori0 ori0Var = this.f93203e;
            if (ori0Var != null) {
                iu0.m138318i(background, ori0Var, this.f93199a.getDrawableState());
                return;
            }
            ori0 ori0Var2 = this.f93202d;
            if (ori0Var2 != null) {
                iu0.m138318i(background, ori0Var2, this.f93199a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m118134c() {
        ori0 ori0Var = this.f93203e;
        if (ori0Var != null) {
            return ori0Var.f145322a;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode m118135d() {
        ori0 ori0Var = this.f93203e;
        if (ori0Var != null) {
            return ori0Var.f145323b;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m118136e(AttributeSet attributeSet, int i) {
        qri0 qri0VarM175993u = qri0.m175993u(this.f93199a.getContext(), attributeSet, aac0.f68362N3, i, 0);
        try {
            if (qri0VarM175993u.m176011r(aac0.f68367O3)) {
                this.f93201c = qri0VarM175993u.m176007n(aac0.f68367O3, -1);
                ColorStateList colorStateListM138321f = this.f93200b.m138321f(this.f93199a.getContext(), this.f93201c);
                if (colorStateListM138321f != null) {
                    m118139h(colorStateListM138321f);
                }
            }
            if (qri0VarM175993u.m176011r(aac0.f68372P3)) {
                gbl0.m125209n0(this.f93199a, qri0VarM175993u.m175996c(aac0.f68372P3));
            }
            if (qri0VarM175993u.m176011r(aac0.f68377Q3)) {
                gbl0.m125211o0(this.f93199a, cce.m106048d(qri0VarM175993u.m176004k(aac0.f68377Q3, -1), null));
            }
        } finally {
            qri0VarM175993u.m176012v();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m118137f(Drawable drawable) {
        this.f93201c = -1;
        m118139h(null);
        m118133b();
    }

    /* JADX INFO: renamed from: g */
    public void m118138g(int i) {
        this.f93201c = i;
        iu0 iu0Var = this.f93200b;
        m118139h(iu0Var != null ? iu0Var.m138321f(this.f93199a.getContext(), i) : null);
        m118133b();
    }

    /* JADX INFO: renamed from: h */
    public void m118139h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f93202d == null) {
                this.f93202d = new ori0();
            }
            ori0 ori0Var = this.f93202d;
            ori0Var.f145322a = colorStateList;
            ori0Var.f145325d = true;
        } else {
            this.f93202d = null;
        }
        m118133b();
    }

    /* JADX INFO: renamed from: i */
    public void m118140i(ColorStateList colorStateList) {
        if (this.f93203e == null) {
            this.f93203e = new ori0();
        }
        ori0 ori0Var = this.f93203e;
        ori0Var.f145322a = colorStateList;
        ori0Var.f145325d = true;
        m118133b();
    }

    /* JADX INFO: renamed from: j */
    public void m118141j(PorterDuff.Mode mode) {
        if (this.f93203e == null) {
            this.f93203e = new ori0();
        }
        ori0 ori0Var = this.f93203e;
        ori0Var.f145323b = mode;
        ori0Var.f145324c = true;
        m118133b();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m118142k() {
        return this.f93202d != null;
    }
}
