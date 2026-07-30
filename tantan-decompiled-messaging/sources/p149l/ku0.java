package p149l;

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
public class ku0 {

    /* JADX INFO: renamed from: a */
    public final ImageView f124633a;

    /* JADX INFO: renamed from: b */
    public ori0 f124634b;

    /* JADX INFO: renamed from: c */
    public ori0 f124635c;

    /* JADX INFO: renamed from: d */
    public ori0 f124636d;

    public ku0(ImageView imageView) {
        this.f124633a = imageView;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m147227a(@NonNull Drawable drawable) {
        if (this.f124636d == null) {
            this.f124636d = new ori0();
        }
        ori0 ori0Var = this.f124636d;
        ori0Var.m165668a();
        ColorStateList colorStateListM209666a = xim.m209666a(this.f124633a);
        if (colorStateListM209666a != null) {
            ori0Var.f145325d = true;
            ori0Var.f145322a = colorStateListM209666a;
        }
        PorterDuff.Mode modeM209667b = xim.m209667b(this.f124633a);
        if (modeM209667b != null) {
            ori0Var.f145324c = true;
            ori0Var.f145323b = modeM209667b;
        }
        if (!ori0Var.f145325d && !ori0Var.f145324c) {
            return false;
        }
        iu0.m138318i(drawable, ori0Var, this.f124633a.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m147228b() {
        Drawable drawable = this.f124633a.getDrawable();
        if (drawable != null) {
            cce.m106046b(drawable);
        }
        if (drawable != null) {
            if (m147236j() && m147227a(drawable)) {
                return;
            }
            ori0 ori0Var = this.f124635c;
            if (ori0Var != null) {
                iu0.m138318i(drawable, ori0Var, this.f124633a.getDrawableState());
                return;
            }
            ori0 ori0Var2 = this.f124634b;
            if (ori0Var2 != null) {
                iu0.m138318i(drawable, ori0Var2, this.f124633a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m147229c() {
        ori0 ori0Var = this.f124635c;
        if (ori0Var != null) {
            return ori0Var.f145322a;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode m147230d() {
        ori0 ori0Var = this.f124635c;
        if (ori0Var != null) {
            return ori0Var.f145323b;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m147231e() {
        return !(this.f124633a.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: f */
    public void m147232f(AttributeSet attributeSet, int i) {
        int iM176007n;
        qri0 qri0VarM175993u = qri0.m175993u(this.f124633a.getContext(), attributeSet, aac0.f68368P, i, 0);
        try {
            Drawable drawable = this.f124633a.getDrawable();
            if (drawable == null && (iM176007n = qri0VarM175993u.m176007n(aac0.f68373Q, -1)) != -1 && (drawable = nu0.m161424b(this.f124633a.getContext(), iM176007n)) != null) {
                this.f124633a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                cce.m106046b(drawable);
            }
            if (qri0VarM175993u.m176011r(aac0.f68378R)) {
                xim.m209668c(this.f124633a, qri0VarM175993u.m175996c(aac0.f68378R));
            }
            if (qri0VarM175993u.m176011r(aac0.f68383S)) {
                xim.m209669d(this.f124633a, cce.m106048d(qri0VarM175993u.m176004k(aac0.f68383S, -1), null));
            }
        } finally {
            qri0VarM175993u.m176012v();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m147233g(int i) {
        ImageView imageView = this.f124633a;
        if (i != 0) {
            Drawable drawableM161424b = nu0.m161424b(imageView.getContext(), i);
            if (drawableM161424b != null) {
                cce.m106046b(drawableM161424b);
            }
            this.f124633a.setImageDrawable(drawableM161424b);
        } else {
            imageView.setImageDrawable(null);
        }
        m147228b();
    }

    /* JADX INFO: renamed from: h */
    public void m147234h(ColorStateList colorStateList) {
        if (this.f124635c == null) {
            this.f124635c = new ori0();
        }
        ori0 ori0Var = this.f124635c;
        ori0Var.f145322a = colorStateList;
        ori0Var.f145325d = true;
        m147228b();
    }

    /* JADX INFO: renamed from: i */
    public void m147235i(PorterDuff.Mode mode) {
        if (this.f124635c == null) {
            this.f124635c = new ori0();
        }
        ori0 ori0Var = this.f124635c;
        ori0Var.f145323b = mode;
        ori0Var.f145324c = true;
        m147228b();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m147236j() {
        return this.f124634b != null;
    }
}
