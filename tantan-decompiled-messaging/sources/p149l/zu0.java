package p149l;

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
public class zu0 {

    /* JADX INFO: renamed from: a */
    public final TextView f204788a;

    /* JADX INFO: renamed from: b */
    public ori0 f204789b;

    /* JADX INFO: renamed from: c */
    public ori0 f204790c;

    /* JADX INFO: renamed from: d */
    public ori0 f204791d;

    /* JADX INFO: renamed from: e */
    public ori0 f204792e;

    /* JADX INFO: renamed from: f */
    public ori0 f204793f;

    /* JADX INFO: renamed from: g */
    public ori0 f204794g;

    /* JADX INFO: renamed from: h */
    public ori0 f204795h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final cv0 f204796i;

    /* JADX INFO: renamed from: j */
    public int f204797j = 0;

    /* JADX INFO: renamed from: k */
    public int f204798k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f204799l;

    /* JADX INFO: renamed from: m */
    public boolean f204800m;

    public zu0(TextView textView) {
        this.f204788a = textView;
        this.f204796i = new cv0(textView);
    }

    /* JADX INFO: renamed from: d */
    public static ori0 m220165d(Context context, iu0 iu0Var, int i) {
        ColorStateList colorStateListM138321f = iu0Var.m138321f(context, i);
        if (colorStateListM138321f == null) {
            return null;
        }
        ori0 ori0Var = new ori0();
        ori0Var.f145325d = true;
        ori0Var.f145322a = colorStateListM138321f;
        return ori0Var;
    }

    /* JADX INFO: renamed from: A */
    public final void m220166A(int i, float f) {
        this.f204796i.m108840u(i, f);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: B */
    public void m220167B(@NonNull Typeface typeface) {
        if (this.f204800m) {
            this.f204788a.setTypeface(typeface);
            this.f204799l = typeface;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m220168C(Context context, qri0 qri0Var) {
        String strM176008o;
        this.f204797j = qri0Var.m176004k(aac0.f68413Y2, this.f204797j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iM176004k = qri0Var.m176004k(aac0.f68427b3, -1);
            this.f204798k = iM176004k;
            if (iM176004k != -1) {
                this.f204797j &= 2;
            }
        }
        if (!qri0Var.m176011r(aac0.f68422a3) && !qri0Var.m176011r(aac0.f68432c3)) {
            if (qri0Var.m176011r(aac0.f68409X2)) {
                this.f204800m = false;
                int iM176004k2 = qri0Var.m176004k(aac0.f68409X2, 1);
                if (iM176004k2 == 1) {
                    this.f204799l = Typeface.SANS_SERIF;
                    return;
                } else if (iM176004k2 == 2) {
                    this.f204799l = Typeface.SERIF;
                    return;
                } else {
                    if (iM176004k2 != 3) {
                        return;
                    }
                    this.f204799l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f204799l = null;
        int i2 = qri0Var.m176011r(aac0.f68432c3) ? aac0.f68432c3 : aac0.f68422a3;
        int i3 = this.f204798k;
        int i4 = this.f204797j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM176003j = qri0Var.m176003j(i2, this.f204797j, new C21769a(this, i3, i4));
                if (typefaceM176003j != null) {
                    if (i < 28 || this.f204798k == -1) {
                        this.f204799l = typefaceM176003j;
                    } else {
                        this.f204799l = Typeface.create(Typeface.create(typefaceM176003j, 0), this.f204798k, (this.f204797j & 2) != 0);
                    }
                }
                this.f204800m = this.f204799l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f204799l != null || (strM176008o = qri0Var.m176008o(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f204798k == -1) {
            this.f204799l = Typeface.create(strM176008o, this.f204797j);
        } else {
            this.f204799l = Typeface.create(Typeface.create(strM176008o, 0), this.f204798k, (this.f204797j & 2) != 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m220169a(Drawable drawable, ori0 ori0Var) {
        if (drawable == null || ori0Var == null) {
            return;
        }
        iu0.m138318i(drawable, ori0Var, this.f204788a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public void m220170b() {
        if (this.f204789b != null || this.f204790c != null || this.f204791d != null || this.f204792e != null) {
            Drawable[] compoundDrawables = this.f204788a.getCompoundDrawables();
            m220169a(compoundDrawables[0], this.f204789b);
            m220169a(compoundDrawables[1], this.f204790c);
            m220169a(compoundDrawables[2], this.f204791d);
            m220169a(compoundDrawables[3], this.f204792e);
        }
        if (this.f204793f == null && this.f204794g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f204788a.getCompoundDrawablesRelative();
        m220169a(compoundDrawablesRelative[0], this.f204793f);
        m220169a(compoundDrawablesRelative[2], this.f204794g);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: c */
    public void m220171c() {
        this.f204796i.m108822a();
    }

    /* JADX INFO: renamed from: e */
    public int m220172e() {
        return this.f204796i.m108828g();
    }

    /* JADX INFO: renamed from: f */
    public int m220173f() {
        return this.f204796i.m108829h();
    }

    /* JADX INFO: renamed from: g */
    public int m220174g() {
        return this.f204796i.m108830i();
    }

    /* JADX INFO: renamed from: h */
    public int[] m220175h() {
        return this.f204796i.m108831j();
    }

    /* JADX INFO: renamed from: i */
    public int m220176i() {
        return this.f204796i.m108832k();
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public ColorStateList m220177j() {
        ori0 ori0Var = this.f204795h;
        if (ori0Var != null) {
            return ori0Var.f145322a;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode m220178k() {
        ori0 ori0Var = this.f204795h;
        if (ori0Var != null) {
            return ori0Var.f145323b;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: l */
    public boolean m220179l() {
        return this.f204796i.m108834o();
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: m */
    public void m220180m(AttributeSet attributeSet, int i) {
        boolean zM175994a;
        boolean z;
        String strM176008o;
        String strM176008o2;
        boolean z2;
        Context context = this.f204788a.getContext();
        iu0 iu0VarM138315b = iu0.m138315b();
        qri0 qri0VarM175993u = qri0.m175993u(context, attributeSet, aac0.f68410Y, i, 0);
        int iM176007n = qri0VarM175993u.m176007n(aac0.f68414Z, -1);
        if (qri0VarM175993u.m176011r(aac0.f68429c0)) {
            this.f204789b = m220165d(context, iu0VarM138315b, qri0VarM175993u.m176007n(aac0.f68429c0, 0));
        }
        if (qri0VarM175993u.m176011r(aac0.f68419a0)) {
            this.f204790c = m220165d(context, iu0VarM138315b, qri0VarM175993u.m176007n(aac0.f68419a0, 0));
        }
        if (qri0VarM175993u.m176011r(aac0.f68434d0)) {
            this.f204791d = m220165d(context, iu0VarM138315b, qri0VarM175993u.m176007n(aac0.f68434d0, 0));
        }
        if (qri0VarM175993u.m176011r(aac0.f68424b0)) {
            this.f204792e = m220165d(context, iu0VarM138315b, qri0VarM175993u.m176007n(aac0.f68424b0, 0));
        }
        if (qri0VarM175993u.m176011r(aac0.f68439e0)) {
            this.f204793f = m220165d(context, iu0VarM138315b, qri0VarM175993u.m176007n(aac0.f68439e0, 0));
        }
        if (qri0VarM175993u.m176011r(aac0.f68444f0)) {
            this.f204794g = m220165d(context, iu0VarM138315b, qri0VarM175993u.m176007n(aac0.f68444f0, 0));
        }
        qri0VarM175993u.m176012v();
        boolean z3 = this.f204788a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iM176007n != -1) {
            qri0 qri0VarM175991s = qri0.m175991s(context, iM176007n, aac0.f68401V2);
            if (z3 || !qri0VarM175991s.m176011r(aac0.f68442e3)) {
                zM175994a = false;
                z = false;
            } else {
                zM175994a = qri0VarM175991s.m175994a(aac0.f68442e3, false);
                z = true;
            }
            m220168C(context, qri0VarM175991s);
            strM176008o = qri0VarM175991s.m176011r(aac0.f68447f3) ? qri0VarM175991s.m176008o(aac0.f68447f3) : null;
            strM176008o2 = (Build.VERSION.SDK_INT < 26 || !qri0VarM175991s.m176011r(aac0.f68437d3)) ? null : qri0VarM175991s.m176008o(aac0.f68437d3);
            qri0VarM175991s.m176012v();
        } else {
            zM175994a = false;
            z = false;
            strM176008o = null;
            strM176008o2 = null;
        }
        qri0 qri0VarM175993u2 = qri0.m175993u(context, attributeSet, aac0.f68401V2, i, 0);
        if (z3 || !qri0VarM175993u2.m176011r(aac0.f68442e3)) {
            z2 = z;
        } else {
            zM175994a = qri0VarM175993u2.m175994a(aac0.f68442e3, false);
            z2 = true;
        }
        if (qri0VarM175993u2.m176011r(aac0.f68447f3)) {
            strM176008o = qri0VarM175993u2.m176008o(aac0.f68447f3);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && qri0VarM175993u2.m176011r(aac0.f68437d3)) {
            strM176008o2 = qri0VarM175993u2.m176008o(aac0.f68437d3);
        }
        if (i2 >= 28 && qri0VarM175993u2.m176011r(aac0.f68405W2) && qri0VarM175993u2.m175999f(aac0.f68405W2, -1) == 0) {
            this.f204788a.setTextSize(0, 0.0f);
        }
        m220168C(context, qri0VarM175993u2);
        qri0VarM175993u2.m176012v();
        if (!z3 && z2) {
            m220185r(zM175994a);
        }
        Typeface typeface = this.f204799l;
        if (typeface != null) {
            int i3 = this.f204798k;
            TextView textView = this.f204788a;
            if (i3 == -1) {
                textView.setTypeface(typeface, this.f204797j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (strM176008o2 != null) {
            this.f204788a.setFontVariationSettings(strM176008o2);
        }
        if (strM176008o != null) {
            this.f204788a.setTextLocales(LocaleList.forLanguageTags(strM176008o));
        }
        this.f204796i.m108835p(attributeSet, i);
        if (jj1.f118213f0 && this.f204796i.m108832k() != 0) {
            int[] iArrM108831j = this.f204796i.m108831j();
            if (iArrM108831j.length > 0) {
                float autoSizeStepGranularity = this.f204788a.getAutoSizeStepGranularity();
                TextView textView2 = this.f204788a;
                if (autoSizeStepGranularity != -1.0f) {
                    textView2.setAutoSizeTextTypeUniformWithConfiguration(this.f204796i.m108829h(), this.f204796i.m108828g(), this.f204796i.m108830i(), 0);
                } else {
                    textView2.setAutoSizeTextTypeUniformWithPresetSizes(iArrM108831j, 0);
                }
            }
        }
        qri0 qri0VarM175992t = qri0.m175992t(context, attributeSet, aac0.f68449g0);
        int iM176007n2 = qri0VarM175992t.m176007n(aac0.f68489o0, -1);
        Drawable drawableM138319c = iM176007n2 != -1 ? iu0VarM138315b.m138319c(context, iM176007n2) : null;
        int iM176007n3 = qri0VarM175992t.m176007n(aac0.f68514t0, -1);
        Drawable drawableM138319c2 = iM176007n3 != -1 ? iu0VarM138315b.m138319c(context, iM176007n3) : null;
        int iM176007n4 = qri0VarM175992t.m176007n(aac0.f68494p0, -1);
        Drawable drawableM138319c3 = iM176007n4 != -1 ? iu0VarM138315b.m138319c(context, iM176007n4) : null;
        int iM176007n5 = qri0VarM175992t.m176007n(aac0.f68479m0, -1);
        Drawable drawableM138319c4 = iM176007n5 != -1 ? iu0VarM138315b.m138319c(context, iM176007n5) : null;
        int iM176007n6 = qri0VarM175992t.m176007n(aac0.f68499q0, -1);
        Drawable drawableM138319c5 = iM176007n6 != -1 ? iu0VarM138315b.m138319c(context, iM176007n6) : null;
        int iM176007n7 = qri0VarM175992t.m176007n(aac0.f68484n0, -1);
        m220191x(drawableM138319c, drawableM138319c2, drawableM138319c3, drawableM138319c4, drawableM138319c5, iM176007n7 != -1 ? iu0VarM138315b.m138319c(context, iM176007n7) : null);
        if (qri0VarM175992t.m176011r(aac0.f68504r0)) {
            mji0.m154814h(this.f204788a, qri0VarM175992t.m175996c(aac0.f68504r0));
        }
        if (qri0VarM175992t.m176011r(aac0.f68509s0)) {
            mji0.m154815i(this.f204788a, cce.m106048d(qri0VarM175992t.m176004k(aac0.f68509s0, -1), null));
        }
        int iM175999f = qri0VarM175992t.m175999f(aac0.f68519u0, -1);
        int iM175999f2 = qri0VarM175992t.m175999f(aac0.f68524v0, -1);
        int iM175999f3 = qri0VarM175992t.m175999f(aac0.f68529w0, -1);
        qri0VarM175992t.m176012v();
        if (iM175999f != -1) {
            mji0.m154817k(this.f204788a, iM175999f);
        }
        if (iM175999f2 != -1) {
            mji0.m154818l(this.f204788a, iM175999f2);
        }
        if (iM175999f3 != -1) {
            mji0.m154819m(this.f204788a, iM175999f3);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: n */
    public void m220181n(boolean z, int i, int i2, int i3, int i4) {
        if (jj1.f118213f0) {
            return;
        }
        m220171c();
    }

    /* JADX INFO: renamed from: o */
    public void m220182o() {
        m220170b();
    }

    /* JADX INFO: renamed from: p */
    public void m220183p(Context context, int i) {
        String strM176008o;
        qri0 qri0VarM175991s = qri0.m175991s(context, i, aac0.f68401V2);
        if (qri0VarM175991s.m176011r(aac0.f68442e3)) {
            m220185r(qri0VarM175991s.m175994a(aac0.f68442e3, false));
        }
        if (qri0VarM175991s.m176011r(aac0.f68405W2) && qri0VarM175991s.m175999f(aac0.f68405W2, -1) == 0) {
            this.f204788a.setTextSize(0, 0.0f);
        }
        m220168C(context, qri0VarM175991s);
        if (Build.VERSION.SDK_INT >= 26 && qri0VarM175991s.m176011r(aac0.f68437d3) && (strM176008o = qri0VarM175991s.m176008o(aac0.f68437d3)) != null) {
            this.f204788a.setFontVariationSettings(strM176008o);
        }
        qri0VarM175991s.m176012v();
        Typeface typeface = this.f204799l;
        if (typeface != null) {
            this.f204788a.setTypeface(typeface, this.f204797j);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: q */
    public void m220184q(@NonNull Runnable runnable) {
        this.f204788a.post(runnable);
    }

    /* JADX INFO: renamed from: r */
    public void m220185r(boolean z) {
        this.f204788a.setAllCaps(z);
    }

    /* JADX INFO: renamed from: s */
    public void m220186s(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f204796i.m108836q(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: t */
    public void m220187t(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        this.f204796i.m108837r(iArr, i);
    }

    /* JADX INFO: renamed from: u */
    public void m220188u(int i) {
        this.f204796i.m108838s(i);
    }

    /* JADX INFO: renamed from: v */
    public void m220189v(@Nullable ColorStateList colorStateList) {
        if (this.f204795h == null) {
            this.f204795h = new ori0();
        }
        ori0 ori0Var = this.f204795h;
        ori0Var.f145322a = colorStateList;
        ori0Var.f145325d = colorStateList != null;
        m220192y();
    }

    /* JADX INFO: renamed from: w */
    public void m220190w(@Nullable PorterDuff.Mode mode) {
        if (this.f204795h == null) {
            this.f204795h = new ori0();
        }
        ori0 ori0Var = this.f204795h;
        ori0Var.f145323b = mode;
        ori0Var.f145324c = mode != null;
        m220192y();
    }

    /* JADX INFO: renamed from: x */
    public final void m220191x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f204788a.getCompoundDrawablesRelative();
            TextView textView = this.f204788a;
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
        Drawable[] compoundDrawablesRelative2 = this.f204788a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f204788a;
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
        Drawable[] compoundDrawables = this.f204788a.getCompoundDrawables();
        TextView textView3 = this.f204788a;
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
    public final void m220192y() {
        ori0 ori0Var = this.f204795h;
        this.f204789b = ori0Var;
        this.f204790c = ori0Var;
        this.f204791d = ori0Var;
        this.f204792e = ori0Var;
        this.f204793f = ori0Var;
        this.f204794g = ori0Var;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: z */
    public void m220193z(int i, float f) {
        if (jj1.f118213f0 || m220179l()) {
            return;
        }
        m220166A(i, f);
    }

    /* JADX INFO: renamed from: l.zu0$a */
    public static class C21769a extends ywc0.AbstractC21562e {

        /* JADX INFO: renamed from: a */
        public final WeakReference<zu0> f204801a;

        /* JADX INFO: renamed from: b */
        public final int f204802b;

        /* JADX INFO: renamed from: c */
        public final int f204803c;

        /* JADX INFO: renamed from: l.zu0$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final WeakReference<zu0> f204804a;

            /* JADX INFO: renamed from: b */
            public final Typeface f204805b;

            public a(@NonNull WeakReference<zu0> weakReference, Typeface typeface) {
                this.f204804a = weakReference;
                this.f204805b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                zu0 zu0Var = this.f204804a.get();
                if (zu0Var == null) {
                    return;
                }
                zu0Var.m220167B(this.f204805b);
            }
        }

        public C21769a(@NonNull zu0 zu0Var, int i, int i2) {
            this.f204801a = new WeakReference<>(zu0Var);
            this.f204802b = i;
            this.f204803c = i2;
        }

        @Override // p149l.ywc0.AbstractC21562e
        public void onFontRetrieved(@NonNull Typeface typeface) {
            int i;
            zu0 zu0Var = this.f204801a.get();
            if (zu0Var == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f204802b) != -1) {
                typeface = Typeface.create(typeface, i, (this.f204803c & 2) != 0);
            }
            zu0Var.m220184q(new a(this.f204801a, typeface));
        }

        @Override // p149l.ywc0.AbstractC21562e
        public void onFontRetrievalFailed(int i) {
        }
    }
}
