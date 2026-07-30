package p153l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ou0 {
    private static ou0 INSTANCE;

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f149036b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public v4d0 f149037a;

    /* JADX INFO: renamed from: l.ou0$a */
    public static class C19215a implements v4d0.InterfaceC20755c {

        /* JADX INFO: renamed from: a */
        public final int[] f149038a = {ccc0.f80922S, ccc0.f80920Q, ccc0.f80924a};

        /* JADX INFO: renamed from: b */
        public final int[] f149039b = {ccc0.f80938o, ccc0.f80905B, ccc0.f80943t, ccc0.f80939p, ccc0.f80940q, ccc0.f80942s, ccc0.f80941r};

        /* JADX INFO: renamed from: c */
        public final int[] f149040c = {ccc0.f80919P, ccc0.f80921R, ccc0.f80934k, ccc0.f80912I, ccc0.f80913J, ccc0.f80915L, ccc0.f80917N, ccc0.f80914K, ccc0.f80916M, ccc0.f80918O};

        /* JADX INFO: renamed from: d */
        public final int[] f149041d = {ccc0.f80946w, ccc0.f80932i, ccc0.f80945v};

        /* JADX INFO: renamed from: e */
        public final int[] f149042e = {ccc0.f80911H, ccc0.f80923T};

        /* JADX INFO: renamed from: f */
        public final int[] f149043f = {ccc0.f80926c, ccc0.f80930g, ccc0.f80927d, ccc0.f80931h};

        @Override // p153l.v4d0.InterfaceC20755c
        /* JADX INFO: renamed from: a */
        public ColorStateList mo169206a(@NonNull Context context, int i) {
            if (i == ccc0.f80936m) {
                return tu0.m192701a(context, z9c0.f203465d);
            }
            if (i == ccc0.f80910G) {
                return tu0.m192701a(context, z9c0.f203468g);
            }
            if (i == ccc0.f80909F) {
                return m169216k(context);
            }
            if (i == ccc0.f80929f) {
                return m169215j(context);
            }
            if (i == ccc0.f80925b) {
                return m169212g(context);
            }
            if (i == ccc0.f80928e) {
                return m169214i(context);
            }
            if (i == ccc0.f80907D || i == ccc0.f80908E) {
                return tu0.m192701a(context, z9c0.f203467f);
            }
            if (m169211f(this.f149039b, i)) {
                return ivi0.m142319d(context, s8c0.f166804x);
            }
            if (m169211f(this.f149042e, i)) {
                return tu0.m192701a(context, z9c0.f203464c);
            }
            if (m169211f(this.f149043f, i)) {
                return tu0.m192701a(context, z9c0.f203463b);
            }
            if (i == ccc0.f80904A) {
                return tu0.m192701a(context, z9c0.f203466e);
            }
            return null;
        }

        @Override // p153l.v4d0.InterfaceC20755c
        /* JADX INFO: renamed from: b */
        public PorterDuff.Mode mo169207b(int i) {
            if (i == ccc0.f80909F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // p153l.v4d0.InterfaceC20755c
        /* JADX INFO: renamed from: c */
        public boolean mo169208c(@NonNull Context context, int i, @NonNull Drawable drawable) {
            if (i == ccc0.f80906C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m169217l(layerDrawable.findDrawableByLayerId(R.id.background), ivi0.m142317b(context, s8c0.f166804x), ou0.f149036b);
                m169217l(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), ivi0.m142317b(context, s8c0.f166804x), ou0.f149036b);
                m169217l(layerDrawable.findDrawableByLayerId(R.id.progress), ivi0.m142317b(context, s8c0.f166802v), ou0.f149036b);
                return true;
            }
            if (i != ccc0.f80948y && i != ccc0.f80947x && i != ccc0.f80949z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m169217l(layerDrawable2.findDrawableByLayerId(R.id.background), ivi0.m142316a(context, s8c0.f166804x), ou0.f149036b);
            m169217l(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), ivi0.m142317b(context, s8c0.f166802v), ou0.f149036b);
            m169217l(layerDrawable2.findDrawableByLayerId(R.id.progress), ivi0.m142317b(context, s8c0.f166802v), ou0.f149036b);
            return true;
        }

        @Override // p153l.v4d0.InterfaceC20755c
        /* JADX INFO: renamed from: d */
        public Drawable mo169209d(@NonNull v4d0 v4d0Var, @NonNull Context context, int i) {
            if (i == ccc0.f80933j) {
                return new LayerDrawable(new Drawable[]{v4d0Var.m199675i(context, ccc0.f80932i), v4d0Var.m199675i(context, ccc0.f80934k)});
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004b  */
        /* JADX WARN: Code duplicated, block: B:24:0x0051  */
        /* JADX WARN: Code duplicated, block: B:27:0x0062  */
        /* JADX WARN: Code duplicated, block: B:29:0x0066 A[RETURN] */
        @Override // p153l.v4d0.InterfaceC20755c
        /* JADX INFO: renamed from: e */
        public boolean mo169210e(@NonNull Context context, int i, @NonNull Drawable drawable) {
            int i2;
            boolean z;
            int iRound;
            PorterDuff.Mode mode = ou0.f149036b;
            if (m169211f(this.f149038a, i)) {
                i2 = s8c0.f166804x;
            } else if (m169211f(this.f149040c, i)) {
                i2 = s8c0.f166802v;
            } else {
                if (!m169211f(this.f149041d, i)) {
                    if (i == ccc0.f80944u) {
                        iRound = Math.round(40.8f);
                        i2 = 16842800;
                        z = true;
                    } else {
                        if (i != ccc0.f80935l) {
                            i2 = 0;
                            z = false;
                        }
                        iRound = -1;
                    }
                    if (z) {
                        return false;
                    }
                    if (gde.m129921a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(ou0.m169199e(ivi0.m142317b(context, i2), mode));
                    if (iRound != -1) {
                        drawable.setAlpha(iRound);
                    }
                    return true;
                }
                mode = PorterDuff.Mode.MULTIPLY;
                i2 = 16842801;
            }
            z = true;
            iRound = -1;
            if (z) {
                return false;
            }
            if (gde.m129921a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(ou0.m169199e(ivi0.m142317b(context, i2), mode));
            if (iRound != -1) {
                drawable.setAlpha(iRound);
            }
            return true;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m169211f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public final ColorStateList m169212g(@NonNull Context context) {
            return m169213h(context, 0);
        }

        /* JADX INFO: renamed from: h */
        public final ColorStateList m169213h(@NonNull Context context, @ColorInt int i) {
            int iM142317b = ivi0.m142317b(context, s8c0.f166803w);
            return new ColorStateList(new int[][]{ivi0.f117072b, ivi0.f117075e, ivi0.f117073c, ivi0.f117079i}, new int[]{ivi0.m142316a(context, s8c0.f166801u), gf5.m130047j(iM142317b, i), gf5.m130047j(iM142317b, i), i});
        }

        /* JADX INFO: renamed from: i */
        public final ColorStateList m169214i(@NonNull Context context) {
            return m169213h(context, ivi0.m142317b(context, s8c0.f166800t));
        }

        /* JADX INFO: renamed from: j */
        public final ColorStateList m169215j(@NonNull Context context) {
            return m169213h(context, ivi0.m142317b(context, s8c0.f166801u));
        }

        /* JADX INFO: renamed from: k */
        public final ColorStateList m169216k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListM142319d = ivi0.m142319d(context, s8c0.f166806z);
            if (colorStateListM142319d == null || !colorStateListM142319d.isStateful()) {
                iArr[0] = ivi0.f117072b;
                iArr2[0] = ivi0.m142316a(context, s8c0.f166806z);
                iArr[1] = ivi0.f117076f;
                iArr2[1] = ivi0.m142317b(context, s8c0.f166802v);
                iArr[2] = ivi0.f117079i;
                iArr2[2] = ivi0.m142317b(context, s8c0.f166806z);
            } else {
                int[] iArr3 = ivi0.f117072b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListM142319d.getColorForState(iArr3, 0);
                iArr[1] = ivi0.f117076f;
                iArr2[1] = ivi0.m142317b(context, s8c0.f166802v);
                iArr[2] = ivi0.f117079i;
                iArr2[2] = colorStateListM142319d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* JADX INFO: renamed from: l */
        public final void m169217l(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (gde.m129921a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = ou0.f149036b;
            }
            drawable.setColorFilter(ou0.m169199e(i, mode));
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized ou0 m169198b() {
        try {
            if (INSTANCE == null) {
                m169200h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m169199e(int i, PorterDuff.Mode mode) {
        return v4d0.m199666k(i, mode);
    }

    /* JADX INFO: renamed from: h */
    public static synchronized void m169200h() {
        if (INSTANCE == null) {
            ou0 ou0Var = new ou0();
            INSTANCE = ou0Var;
            ou0Var.f149037a = v4d0.m199665g();
            INSTANCE.f149037a.m199683t(new C19215a());
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m169201i(Drawable drawable, r0j0 r0j0Var, int[] iArr) {
        v4d0.m199669v(drawable, r0j0Var, iArr);
    }

    /* JADX INFO: renamed from: c */
    public synchronized Drawable m169202c(@NonNull Context context, @DrawableRes int i) {
        return this.f149037a.m199675i(context, i);
    }

    /* JADX INFO: renamed from: d */
    public synchronized Drawable m169203d(@NonNull Context context, @DrawableRes int i, boolean z) {
        return this.f149037a.m199676j(context, i, z);
    }

    /* JADX INFO: renamed from: f */
    public synchronized ColorStateList m169204f(@NonNull Context context, @DrawableRes int i) {
        return this.f149037a.m199677l(context, i);
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m169205g(@NonNull Context context) {
        this.f149037a.m199681r(context);
    }
}
