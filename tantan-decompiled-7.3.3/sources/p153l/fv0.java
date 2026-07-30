package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class fv0 {

    /* JADX INFO: renamed from: a */
    public final TextView f100961a;

    /* JADX INFO: renamed from: b */
    public r0j0 f100962b;

    /* JADX INFO: renamed from: c */
    public r0j0 f100963c;

    /* JADX INFO: renamed from: d */
    public r0j0 f100964d;

    /* JADX INFO: renamed from: e */
    public r0j0 f100965e;

    /* JADX INFO: renamed from: f */
    public r0j0 f100966f;

    /* JADX INFO: renamed from: g */
    public r0j0 f100967g;

    /* JADX INFO: renamed from: h */
    public r0j0 f100968h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final iv0 f100969i;

    /* JADX INFO: renamed from: j */
    public int f100970j = 0;

    /* JADX INFO: renamed from: k */
    public int f100971k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f100972l;

    /* JADX INFO: renamed from: m */
    public boolean f100973m;

    public fv0(TextView textView) {
        this.f100961a = textView;
        this.f100969i = new iv0(textView);
    }

    /* JADX INFO: renamed from: d */
    public static r0j0 m127557d(Context context, ou0 ou0Var, int i) {
        ColorStateList colorStateListM169204f = ou0Var.m169204f(context, i);
        if (colorStateListM169204f == null) {
            return null;
        }
        r0j0 r0j0Var = new r0j0();
        r0j0Var.f160641d = true;
        r0j0Var.f160638a = colorStateListM169204f;
        return r0j0Var;
    }

    /* JADX INFO: renamed from: A */
    public final void m127558A(int i, float f) {
        this.f100969i.m142270u(i, f);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: B */
    public void m127559B(@NonNull Typeface typeface) {
        if (this.f100973m) {
            this.f100961a.setTypeface(typeface);
            this.f100972l = typeface;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m127560C(Context context, t0j0 t0j0Var) {
        String strM188797o;
        this.f100970j = t0j0Var.m188793k(gic0.f104339Y2, this.f100970j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iM188793k = t0j0Var.m188793k(gic0.f104353b3, -1);
            this.f100971k = iM188793k;
            if (iM188793k != -1) {
                this.f100970j &= 2;
            }
        }
        if (!t0j0Var.m188800r(gic0.f104348a3) && !t0j0Var.m188800r(gic0.f104358c3)) {
            if (t0j0Var.m188800r(gic0.f104335X2)) {
                this.f100973m = false;
                int iM188793k2 = t0j0Var.m188793k(gic0.f104335X2, 1);
                if (iM188793k2 == 1) {
                    this.f100972l = Typeface.SANS_SERIF;
                    return;
                } else if (iM188793k2 == 2) {
                    this.f100972l = Typeface.SERIF;
                    return;
                } else {
                    if (iM188793k2 != 3) {
                        return;
                    }
                    this.f100972l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f100972l = null;
        int i2 = t0j0Var.m188800r(gic0.f104358c3) ? gic0.f104358c3 : gic0.f104348a3;
        int i3 = this.f100971k;
        int i4 = this.f100970j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM188792j = t0j0Var.m188792j(i2, this.f100970j, new C17082a(this, i3, i4));
                if (typefaceM188792j != null) {
                    if (i < 28 || this.f100971k == -1) {
                        this.f100972l = typefaceM188792j;
                    } else {
                        this.f100972l = Typeface.create(Typeface.create(typefaceM188792j, 0), this.f100971k, (this.f100970j & 2) != 0);
                    }
                }
                this.f100973m = this.f100972l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f100972l != null || (strM188797o = t0j0Var.m188797o(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f100971k == -1) {
            this.f100972l = Typeface.create(strM188797o, this.f100970j);
        } else {
            this.f100972l = Typeface.create(Typeface.create(strM188797o, 0), this.f100971k, (this.f100970j & 2) != 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m127561a(Drawable drawable, r0j0 r0j0Var) {
        if (drawable == null || r0j0Var == null) {
            return;
        }
        ou0.m169201i(drawable, r0j0Var, this.f100961a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public void m127562b() {
        if (this.f100962b != null || this.f100963c != null || this.f100964d != null || this.f100965e != null) {
            Drawable[] compoundDrawables = this.f100961a.getCompoundDrawables();
            m127561a(compoundDrawables[0], this.f100962b);
            m127561a(compoundDrawables[1], this.f100963c);
            m127561a(compoundDrawables[2], this.f100964d);
            m127561a(compoundDrawables[3], this.f100965e);
        }
        if (this.f100966f == null && this.f100967g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f100961a.getCompoundDrawablesRelative();
        m127561a(compoundDrawablesRelative[0], this.f100966f);
        m127561a(compoundDrawablesRelative[2], this.f100967g);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: c */
    public void m127563c() {
        this.f100969i.m142252a();
    }

    /* JADX INFO: renamed from: e */
    public int m127564e() {
        return this.f100969i.m142258g();
    }

    /* JADX INFO: renamed from: f */
    public int m127565f() {
        return this.f100969i.m142259h();
    }

    /* JADX INFO: renamed from: g */
    public int m127566g() {
        return this.f100969i.m142260i();
    }

    /* JADX INFO: renamed from: h */
    public int[] m127567h() {
        return this.f100969i.m142261j();
    }

    /* JADX INFO: renamed from: i */
    public int m127568i() {
        return this.f100969i.m142262k();
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public ColorStateList m127569j() {
        r0j0 r0j0Var = this.f100968h;
        if (r0j0Var != null) {
            return r0j0Var.f160638a;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode m127570k() {
        r0j0 r0j0Var = this.f100968h;
        if (r0j0Var != null) {
            return r0j0Var.f160639b;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: l */
    public boolean m127571l() {
        return this.f100969i.m142264o();
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: m */
    public void m127572m(AttributeSet attributeSet, int i) {
        boolean zM188783a;
        boolean z;
        String strM188797o;
        String strM188797o2;
        boolean z2;
        Context context = this.f100961a.getContext();
        ou0 ou0VarM169198b = ou0.m169198b();
        t0j0 t0j0VarM188782u = t0j0.m188782u(context, attributeSet, gic0.f104336Y, i, 0);
        int iM188796n = t0j0VarM188782u.m188796n(gic0.f104340Z, -1);
        if (t0j0VarM188782u.m188800r(gic0.f104355c0)) {
            this.f100962b = m127557d(context, ou0VarM169198b, t0j0VarM188782u.m188796n(gic0.f104355c0, 0));
        }
        if (t0j0VarM188782u.m188800r(gic0.f104345a0)) {
            this.f100963c = m127557d(context, ou0VarM169198b, t0j0VarM188782u.m188796n(gic0.f104345a0, 0));
        }
        if (t0j0VarM188782u.m188800r(gic0.f104360d0)) {
            this.f100964d = m127557d(context, ou0VarM169198b, t0j0VarM188782u.m188796n(gic0.f104360d0, 0));
        }
        if (t0j0VarM188782u.m188800r(gic0.f104350b0)) {
            this.f100965e = m127557d(context, ou0VarM169198b, t0j0VarM188782u.m188796n(gic0.f104350b0, 0));
        }
        if (t0j0VarM188782u.m188800r(gic0.f104365e0)) {
            this.f100966f = m127557d(context, ou0VarM169198b, t0j0VarM188782u.m188796n(gic0.f104365e0, 0));
        }
        if (t0j0VarM188782u.m188800r(gic0.f104370f0)) {
            this.f100967g = m127557d(context, ou0VarM169198b, t0j0VarM188782u.m188796n(gic0.f104370f0, 0));
        }
        t0j0VarM188782u.m188801v();
        boolean z3 = this.f100961a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iM188796n != -1) {
            t0j0 t0j0VarM188780s = t0j0.m188780s(context, iM188796n, gic0.f104327V2);
            if (z3 || !t0j0VarM188780s.m188800r(gic0.f104368e3)) {
                zM188783a = false;
                z = false;
            } else {
                zM188783a = t0j0VarM188780s.m188783a(gic0.f104368e3, false);
                z = true;
            }
            m127560C(context, t0j0VarM188780s);
            strM188797o = t0j0VarM188780s.m188800r(gic0.f104373f3) ? t0j0VarM188780s.m188797o(gic0.f104373f3) : null;
            strM188797o2 = (Build.VERSION.SDK_INT < 26 || !t0j0VarM188780s.m188800r(gic0.f104363d3)) ? null : t0j0VarM188780s.m188797o(gic0.f104363d3);
            t0j0VarM188780s.m188801v();
        } else {
            zM188783a = false;
            z = false;
            strM188797o = null;
            strM188797o2 = null;
        }
        t0j0 t0j0VarM188782u2 = t0j0.m188782u(context, attributeSet, gic0.f104327V2, i, 0);
        if (z3 || !t0j0VarM188782u2.m188800r(gic0.f104368e3)) {
            z2 = z;
        } else {
            zM188783a = t0j0VarM188782u2.m188783a(gic0.f104368e3, false);
            z2 = true;
        }
        if (t0j0VarM188782u2.m188800r(gic0.f104373f3)) {
            strM188797o = t0j0VarM188782u2.m188797o(gic0.f104373f3);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && t0j0VarM188782u2.m188800r(gic0.f104363d3)) {
            strM188797o2 = t0j0VarM188782u2.m188797o(gic0.f104363d3);
        }
        if (i2 >= 28 && t0j0VarM188782u2.m188800r(gic0.f104331W2) && t0j0VarM188782u2.m188788f(gic0.f104331W2, -1) == 0) {
            this.f100961a.setTextSize(0, 0.0f);
        }
        m127560C(context, t0j0VarM188782u2);
        t0j0VarM188782u2.m188801v();
        if (!z3 && z2) {
            m127577r(zM188783a);
        }
        Typeface typeface = this.f100972l;
        if (typeface != null) {
            int i3 = this.f100971k;
            TextView textView = this.f100961a;
            if (i3 == -1) {
                textView.setTypeface(typeface, this.f100970j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (strM188797o2 != null) {
            this.f100961a.setFontVariationSettings(strM188797o2);
        }
        if (strM188797o != null) {
            this.f100961a.setTextLocales(LocaleList.forLanguageTags(strM188797o));
        }
        this.f100969i.m142265p(attributeSet, i);
        if (qj1.f157911f0 && this.f100969i.m142262k() != 0) {
            int[] iArrM142261j = this.f100969i.m142261j();
            if (iArrM142261j.length > 0) {
                float autoSizeStepGranularity = this.f100961a.getAutoSizeStepGranularity();
                TextView textView2 = this.f100961a;
                if (autoSizeStepGranularity != -1.0f) {
                    textView2.setAutoSizeTextTypeUniformWithConfiguration(this.f100969i.m142259h(), this.f100969i.m142258g(), this.f100969i.m142260i(), 0);
                } else {
                    textView2.setAutoSizeTextTypeUniformWithPresetSizes(iArrM142261j, 0);
                }
            }
        }
        t0j0 t0j0VarM188781t = t0j0.m188781t(context, attributeSet, gic0.f104375g0);
        int iM188796n2 = t0j0VarM188781t.m188796n(gic0.f104415o0, -1);
        Drawable drawableM169202c = iM188796n2 != -1 ? ou0VarM169198b.m169202c(context, iM188796n2) : null;
        int iM188796n3 = t0j0VarM188781t.m188796n(gic0.f104440t0, -1);
        Drawable drawableM169202c2 = iM188796n3 != -1 ? ou0VarM169198b.m169202c(context, iM188796n3) : null;
        int iM188796n4 = t0j0VarM188781t.m188796n(gic0.f104420p0, -1);
        Drawable drawableM169202c3 = iM188796n4 != -1 ? ou0VarM169198b.m169202c(context, iM188796n4) : null;
        int iM188796n5 = t0j0VarM188781t.m188796n(gic0.f104405m0, -1);
        Drawable drawableM169202c4 = iM188796n5 != -1 ? ou0VarM169198b.m169202c(context, iM188796n5) : null;
        int iM188796n6 = t0j0VarM188781t.m188796n(gic0.f104425q0, -1);
        Drawable drawableM169202c5 = iM188796n6 != -1 ? ou0VarM169198b.m169202c(context, iM188796n6) : null;
        int iM188796n7 = t0j0VarM188781t.m188796n(gic0.f104410n0, -1);
        m127583x(drawableM169202c, drawableM169202c2, drawableM169202c3, drawableM169202c4, drawableM169202c5, iM188796n7 != -1 ? ou0VarM169198b.m169202c(context, iM188796n7) : null);
        if (t0j0VarM188781t.m188800r(gic0.f104430r0)) {
            msi0.m159810h(this.f100961a, t0j0VarM188781t.m188785c(gic0.f104430r0));
        }
        if (t0j0VarM188781t.m188800r(gic0.f104435s0)) {
            msi0.m159811i(this.f100961a, gde.m129924d(t0j0VarM188781t.m188793k(gic0.f104435s0, -1), null));
        }
        int iM188788f = t0j0VarM188781t.m188788f(gic0.f104445u0, -1);
        int iM188788f2 = t0j0VarM188781t.m188788f(gic0.f104450v0, -1);
        int iM188788f3 = t0j0VarM188781t.m188788f(gic0.f104455w0, -1);
        t0j0VarM188781t.m188801v();
        if (iM188788f != -1) {
            msi0.m159813k(this.f100961a, iM188788f);
        }
        if (iM188788f2 != -1) {
            msi0.m159814l(this.f100961a, iM188788f2);
        }
        if (iM188788f3 != -1) {
            msi0.m159815m(this.f100961a, iM188788f3);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: n */
    public void m127573n(boolean z, int i, int i2, int i3, int i4) {
        if (qj1.f157911f0) {
            return;
        }
        m127563c();
    }

    /* JADX INFO: renamed from: o */
    public void m127574o() {
        m127562b();
    }

    /* JADX INFO: renamed from: p */
    public void m127575p(Context context, int i) {
        String strM188797o;
        t0j0 t0j0VarM188780s = t0j0.m188780s(context, i, gic0.f104327V2);
        if (t0j0VarM188780s.m188800r(gic0.f104368e3)) {
            m127577r(t0j0VarM188780s.m188783a(gic0.f104368e3, false));
        }
        if (t0j0VarM188780s.m188800r(gic0.f104331W2) && t0j0VarM188780s.m188788f(gic0.f104331W2, -1) == 0) {
            this.f100961a.setTextSize(0, 0.0f);
        }
        m127560C(context, t0j0VarM188780s);
        if (Build.VERSION.SDK_INT >= 26 && t0j0VarM188780s.m188800r(gic0.f104363d3) && (strM188797o = t0j0VarM188780s.m188797o(gic0.f104363d3)) != null) {
            this.f100961a.setFontVariationSettings(strM188797o);
        }
        t0j0VarM188780s.m188801v();
        Typeface typeface = this.f100972l;
        if (typeface != null) {
            this.f100961a.setTypeface(typeface, this.f100970j);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: q */
    public void m127576q(@NonNull Runnable runnable) {
        this.f100961a.post(runnable);
    }

    /* JADX INFO: renamed from: r */
    public void m127577r(boolean z) {
        this.f100961a.setAllCaps(z);
    }

    /* JADX INFO: renamed from: s */
    public void m127578s(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f100969i.m142266q(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: t */
    public void m127579t(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        this.f100969i.m142267r(iArr, i);
    }

    /* JADX INFO: renamed from: u */
    public void m127580u(int i) {
        this.f100969i.m142268s(i);
    }

    /* JADX INFO: renamed from: v */
    public void m127581v(@Nullable ColorStateList colorStateList) {
        if (this.f100968h == null) {
            this.f100968h = new r0j0();
        }
        r0j0 r0j0Var = this.f100968h;
        r0j0Var.f160638a = colorStateList;
        r0j0Var.f160641d = colorStateList != null;
        m127584y();
    }

    /* JADX INFO: renamed from: w */
    public void m127582w(@Nullable PorterDuff.Mode mode) {
        if (this.f100968h == null) {
            this.f100968h = new r0j0();
        }
        r0j0 r0j0Var = this.f100968h;
        r0j0Var.f160639b = mode;
        r0j0Var.f160640c = mode != null;
        m127584y();
    }

    /* JADX INFO: renamed from: x */
    public final void m127583x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f100961a.getCompoundDrawablesRelative();
            TextView textView = this.f100961a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f100961a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f100961a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f100961a.getCompoundDrawables();
        TextView textView3 = this.f100961a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: y */
    public final void m127584y() {
        r0j0 r0j0Var = this.f100968h;
        this.f100962b = r0j0Var;
        this.f100963c = r0j0Var;
        this.f100964d = r0j0Var;
        this.f100965e = r0j0Var;
        this.f100966f = r0j0Var;
        this.f100967g = r0j0Var;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: z */
    public void m127585z(int i, float f) {
        if (qj1.f157911f0 || m127571l()) {
            return;
        }
        m127558A(i, f);
    }

    /* JADX INFO: renamed from: l.fv0$a */
    public static class C17082a extends c5d0.AbstractC16196e {

        /* JADX INFO: renamed from: a */
        public final WeakReference<fv0> f100974a;

        /* JADX INFO: renamed from: b */
        public final int f100975b;

        /* JADX INFO: renamed from: c */
        public final int f100976c;

        /* JADX INFO: renamed from: l.fv0$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final WeakReference<fv0> f100977a;

            /* JADX INFO: renamed from: b */
            public final Typeface f100978b;

            public a(@NonNull WeakReference<fv0> weakReference, Typeface typeface) {
                this.f100977a = weakReference;
                this.f100978b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                fv0 fv0Var = this.f100977a.get();
                if (fv0Var == null) {
                    return;
                }
                fv0Var.m127559B(this.f100978b);
            }
        }

        public C17082a(@NonNull fv0 fv0Var, int i, int i2) {
            this.f100974a = new WeakReference<>(fv0Var);
            this.f100975b = i;
            this.f100976c = i2;
        }

        @Override // p153l.c5d0.AbstractC16196e
        public void onFontRetrieved(@NonNull Typeface typeface) {
            int i;
            fv0 fv0Var = this.f100974a.get();
            if (fv0Var == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f100975b) != -1) {
                typeface = Typeface.create(typeface, i, (this.f100976c & 2) != 0);
            }
            fv0Var.m127576q(new a(this.f100974a, typeface));
        }

        @Override // p153l.c5d0.AbstractC16196e
        public void onFontRetrievalFailed(int i) {
        }
    }
}
