package p153l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class ku0 {

    /* JADX INFO: renamed from: a */
    public final View f128776a;

    /* JADX INFO: renamed from: d */
    public r0j0 f128779d;

    /* JADX INFO: renamed from: e */
    public r0j0 f128780e;

    /* JADX INFO: renamed from: f */
    public r0j0 f128781f;

    /* JADX INFO: renamed from: c */
    public int f128778c = -1;

    /* JADX INFO: renamed from: b */
    public final ou0 f128777b = ou0.m169198b();

    public ku0(View view) {
        this.f128776a = view;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m151414a(@NonNull Drawable drawable) {
        if (this.f128781f == null) {
            this.f128781f = new r0j0();
        }
        r0j0 r0j0Var = this.f128781f;
        r0j0Var.m179219a();
        ColorStateList colorStateListM150175p = kkl0.m150175p(this.f128776a);
        if (colorStateListM150175p != null) {
            r0j0Var.f160641d = true;
            r0j0Var.f160638a = colorStateListM150175p;
        }
        PorterDuff.Mode modeM150177q = kkl0.m150177q(this.f128776a);
        if (modeM150177q != null) {
            r0j0Var.f160640c = true;
            r0j0Var.f160639b = modeM150177q;
        }
        if (!r0j0Var.f160641d && !r0j0Var.f160640c) {
            return false;
        }
        ou0.m169201i(drawable, r0j0Var, this.f128776a.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m151415b() {
        Drawable background = this.f128776a.getBackground();
        if (background != null) {
            if (m151424k() && m151414a(background)) {
                return;
            }
            r0j0 r0j0Var = this.f128780e;
            if (r0j0Var != null) {
                ou0.m169201i(background, r0j0Var, this.f128776a.getDrawableState());
                return;
            }
            r0j0 r0j0Var2 = this.f128779d;
            if (r0j0Var2 != null) {
                ou0.m169201i(background, r0j0Var2, this.f128776a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m151416c() {
        r0j0 r0j0Var = this.f128780e;
        if (r0j0Var != null) {
            return r0j0Var.f160638a;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode m151417d() {
        r0j0 r0j0Var = this.f128780e;
        if (r0j0Var != null) {
            return r0j0Var.f160639b;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m151418e(AttributeSet attributeSet, int i) {
        t0j0 t0j0VarM188782u = t0j0.m188782u(this.f128776a.getContext(), attributeSet, gic0.f104288N3, i, 0);
        try {
            if (t0j0VarM188782u.m188800r(gic0.f104293O3)) {
                this.f128778c = t0j0VarM188782u.m188796n(gic0.f104293O3, -1);
                ColorStateList colorStateListM169204f = this.f128777b.m169204f(this.f128776a.getContext(), this.f128778c);
                if (colorStateListM169204f != null) {
                    m151421h(colorStateListM169204f);
                }
            }
            if (t0j0VarM188782u.m188800r(gic0.f104298P3)) {
                kkl0.m150172n0(this.f128776a, t0j0VarM188782u.m188785c(gic0.f104298P3));
            }
            if (t0j0VarM188782u.m188800r(gic0.f104303Q3)) {
                kkl0.m150174o0(this.f128776a, gde.m129924d(t0j0VarM188782u.m188793k(gic0.f104303Q3, -1), null));
            }
        } finally {
            t0j0VarM188782u.m188801v();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m151419f(Drawable drawable) {
        this.f128778c = -1;
        m151421h(null);
        m151415b();
    }

    /* JADX INFO: renamed from: g */
    public void m151420g(int i) {
        this.f128778c = i;
        ou0 ou0Var = this.f128777b;
        m151421h(ou0Var != null ? ou0Var.m169204f(this.f128776a.getContext(), i) : null);
        m151415b();
    }

    /* JADX INFO: renamed from: h */
    public void m151421h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f128779d == null) {
                this.f128779d = new r0j0();
            }
            r0j0 r0j0Var = this.f128779d;
            r0j0Var.f160638a = colorStateList;
            r0j0Var.f160641d = true;
        } else {
            this.f128779d = null;
        }
        m151415b();
    }

    /* JADX INFO: renamed from: i */
    public void m151422i(ColorStateList colorStateList) {
        if (this.f128780e == null) {
            this.f128780e = new r0j0();
        }
        r0j0 r0j0Var = this.f128780e;
        r0j0Var.f160638a = colorStateList;
        r0j0Var.f160641d = true;
        m151415b();
    }

    /* JADX INFO: renamed from: j */
    public void m151423j(PorterDuff.Mode mode) {
        if (this.f128780e == null) {
            this.f128780e = new r0j0();
        }
        r0j0 r0j0Var = this.f128780e;
        r0j0Var.f160639b = mode;
        r0j0Var.f160640c = true;
        m151415b();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m151424k() {
        return this.f128779d != null;
    }
}
