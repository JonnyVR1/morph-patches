package p153l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class qu0 {

    /* JADX INFO: renamed from: a */
    public final ImageView f159503a;

    /* JADX INFO: renamed from: b */
    public r0j0 f159504b;

    /* JADX INFO: renamed from: c */
    public r0j0 f159505c;

    /* JADX INFO: renamed from: d */
    public r0j0 f159506d;

    public qu0(ImageView imageView) {
        this.f159503a = imageView;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m178082a(@NonNull Drawable drawable) {
        if (this.f159506d == null) {
            this.f159506d = new r0j0();
        }
        r0j0 r0j0Var = this.f159506d;
        r0j0Var.m179219a();
        ColorStateList colorStateListM98693a = alm.m98693a(this.f159503a);
        if (colorStateListM98693a != null) {
            r0j0Var.f160641d = true;
            r0j0Var.f160638a = colorStateListM98693a;
        }
        PorterDuff.Mode modeM98694b = alm.m98694b(this.f159503a);
        if (modeM98694b != null) {
            r0j0Var.f160640c = true;
            r0j0Var.f160639b = modeM98694b;
        }
        if (!r0j0Var.f160641d && !r0j0Var.f160640c) {
            return false;
        }
        ou0.m169201i(drawable, r0j0Var, this.f159503a.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m178083b() {
        Drawable drawable = this.f159503a.getDrawable();
        if (drawable != null) {
            gde.m129922b(drawable);
        }
        if (drawable != null) {
            if (m178091j() && m178082a(drawable)) {
                return;
            }
            r0j0 r0j0Var = this.f159505c;
            if (r0j0Var != null) {
                ou0.m169201i(drawable, r0j0Var, this.f159503a.getDrawableState());
                return;
            }
            r0j0 r0j0Var2 = this.f159504b;
            if (r0j0Var2 != null) {
                ou0.m169201i(drawable, r0j0Var2, this.f159503a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m178084c() {
        r0j0 r0j0Var = this.f159505c;
        if (r0j0Var != null) {
            return r0j0Var.f160638a;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode m178085d() {
        r0j0 r0j0Var = this.f159505c;
        if (r0j0Var != null) {
            return r0j0Var.f160639b;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m178086e() {
        return !(this.f159503a.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: f */
    public void m178087f(AttributeSet attributeSet, int i) {
        int iM188796n;
        t0j0 t0j0VarM188782u = t0j0.m188782u(this.f159503a.getContext(), attributeSet, gic0.f104294P, i, 0);
        try {
            Drawable drawable = this.f159503a.getDrawable();
            if (drawable == null && (iM188796n = t0j0VarM188782u.m188796n(gic0.f104299Q, -1)) != -1 && (drawable = tu0.m192702b(this.f159503a.getContext(), iM188796n)) != null) {
                this.f159503a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                gde.m129922b(drawable);
            }
            if (t0j0VarM188782u.m188800r(gic0.f104304R)) {
                alm.m98695c(this.f159503a, t0j0VarM188782u.m188785c(gic0.f104304R));
            }
            if (t0j0VarM188782u.m188800r(gic0.f104309S)) {
                alm.m98696d(this.f159503a, gde.m129924d(t0j0VarM188782u.m188793k(gic0.f104309S, -1), null));
            }
        } finally {
            t0j0VarM188782u.m188801v();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m178088g(int i) {
        ImageView imageView = this.f159503a;
        if (i != 0) {
            Drawable drawableM192702b = tu0.m192702b(imageView.getContext(), i);
            if (drawableM192702b != null) {
                gde.m129922b(drawableM192702b);
            }
            this.f159503a.setImageDrawable(drawableM192702b);
        } else {
            imageView.setImageDrawable(null);
        }
        m178083b();
    }

    /* JADX INFO: renamed from: h */
    public void m178089h(ColorStateList colorStateList) {
        if (this.f159505c == null) {
            this.f159505c = new r0j0();
        }
        r0j0 r0j0Var = this.f159505c;
        r0j0Var.f160638a = colorStateList;
        r0j0Var.f160641d = true;
        m178083b();
    }

    /* JADX INFO: renamed from: i */
    public void m178090i(PorterDuff.Mode mode) {
        if (this.f159505c == null) {
            this.f159505c = new r0j0();
        }
        r0j0 r0j0Var = this.f159505c;
        r0j0Var.f160639b = mode;
        r0j0Var.f160640c = true;
        m178083b();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m178091j() {
        return this.f159504b != null;
    }
}
