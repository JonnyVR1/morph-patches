package p149l;

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
public final class iu0 {
    private static iu0 INSTANCE;

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f114955b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public swc0 f114956a;

    /* JADX INFO: renamed from: l.iu0$a */
    public static class C17619a implements swc0.InterfaceC20049c {

        /* JADX INFO: renamed from: a */
        public final int[] f114957a = {w3c0.f184345S, w3c0.f184343Q, w3c0.f184347a};

        /* JADX INFO: renamed from: b */
        public final int[] f114958b = {w3c0.f184361o, w3c0.f184328B, w3c0.f184366t, w3c0.f184362p, w3c0.f184363q, w3c0.f184365s, w3c0.f184364r};

        /* JADX INFO: renamed from: c */
        public final int[] f114959c = {w3c0.f184342P, w3c0.f184344R, w3c0.f184357k, w3c0.f184335I, w3c0.f184336J, w3c0.f184338L, w3c0.f184340N, w3c0.f184337K, w3c0.f184339M, w3c0.f184341O};

        /* JADX INFO: renamed from: d */
        public final int[] f114960d = {w3c0.f184369w, w3c0.f184355i, w3c0.f184368v};

        /* JADX INFO: renamed from: e */
        public final int[] f114961e = {w3c0.f184334H, w3c0.f184346T};

        /* JADX INFO: renamed from: f */
        public final int[] f114962f = {w3c0.f184349c, w3c0.f184353g, w3c0.f184350d, w3c0.f184354h};

        @Override // p149l.swc0.InterfaceC20049c
        /* JADX INFO: renamed from: a */
        public ColorStateList mo138323a(@NonNull Context context, int i) {
            if (i == w3c0.f184359m) {
                return nu0.m161423a(context, t1c0.f167309d);
            }
            if (i == w3c0.f184333G) {
                return nu0.m161423a(context, t1c0.f167312g);
            }
            if (i == w3c0.f184332F) {
                return m138333k(context);
            }
            if (i == w3c0.f184352f) {
                return m138332j(context);
            }
            if (i == w3c0.f184348b) {
                return m138329g(context);
            }
            if (i == w3c0.f184351e) {
                return m138331i(context);
            }
            if (i == w3c0.f184330D || i == w3c0.f184331E) {
                return nu0.m161423a(context, t1c0.f167311f);
            }
            if (m138328f(this.f114958b, i)) {
                return hmi0.m131736d(context, n0c0.f136532x);
            }
            if (m138328f(this.f114961e, i)) {
                return nu0.m161423a(context, t1c0.f167308c);
            }
            if (m138328f(this.f114962f, i)) {
                return nu0.m161423a(context, t1c0.f167307b);
            }
            if (i == w3c0.f184327A) {
                return nu0.m161423a(context, t1c0.f167310e);
            }
            return null;
        }

        @Override // p149l.swc0.InterfaceC20049c
        /* JADX INFO: renamed from: b */
        public PorterDuff.Mode mo138324b(int i) {
            if (i == w3c0.f184332F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // p149l.swc0.InterfaceC20049c
        /* JADX INFO: renamed from: c */
        public boolean mo138325c(@NonNull Context context, int i, @NonNull Drawable drawable) {
            if (i == w3c0.f184329C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m138334l(layerDrawable.findDrawableByLayerId(R.id.background), hmi0.m131734b(context, n0c0.f136532x), iu0.f114955b);
                m138334l(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), hmi0.m131734b(context, n0c0.f136532x), iu0.f114955b);
                m138334l(layerDrawable.findDrawableByLayerId(R.id.progress), hmi0.m131734b(context, n0c0.f136530v), iu0.f114955b);
                return true;
            }
            if (i != w3c0.f184371y && i != w3c0.f184370x && i != w3c0.f184372z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m138334l(layerDrawable2.findDrawableByLayerId(R.id.background), hmi0.m131733a(context, n0c0.f136532x), iu0.f114955b);
            m138334l(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), hmi0.m131734b(context, n0c0.f136530v), iu0.f114955b);
            m138334l(layerDrawable2.findDrawableByLayerId(R.id.progress), hmi0.m131734b(context, n0c0.f136530v), iu0.f114955b);
            return true;
        }

        @Override // p149l.swc0.InterfaceC20049c
        /* JADX INFO: renamed from: d */
        public Drawable mo138326d(@NonNull swc0 swc0Var, @NonNull Context context, int i) {
            if (i == w3c0.f184356j) {
                return new LayerDrawable(new Drawable[]{swc0Var.m186142i(context, w3c0.f184355i), swc0Var.m186142i(context, w3c0.f184357k)});
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004b  */
        /* JADX WARN: Code duplicated, block: B:24:0x0051  */
        /* JADX WARN: Code duplicated, block: B:27:0x0062  */
        /* JADX WARN: Code duplicated, block: B:29:0x0066 A[RETURN] */
        @Override // p149l.swc0.InterfaceC20049c
        /* JADX INFO: renamed from: e */
        public boolean mo138327e(@NonNull Context context, int i, @NonNull Drawable drawable) {
            int i2;
            boolean z;
            int iRound;
            PorterDuff.Mode mode = iu0.f114955b;
            if (m138328f(this.f114957a, i)) {
                i2 = n0c0.f136532x;
            } else if (m138328f(this.f114959c, i)) {
                i2 = n0c0.f136530v;
            } else {
                if (!m138328f(this.f114960d, i)) {
                    if (i == w3c0.f184367u) {
                        iRound = Math.round(40.8f);
                        i2 = 16842800;
                        z = true;
                    } else {
                        if (i != w3c0.f184358l) {
                            i2 = 0;
                            z = false;
                        }
                        iRound = -1;
                    }
                    if (z) {
                        return false;
                    }
                    if (cce.m106045a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(iu0.m138316e(hmi0.m131734b(context, i2), mode));
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
            if (cce.m106045a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(iu0.m138316e(hmi0.m131734b(context, i2), mode));
            if (iRound != -1) {
                drawable.setAlpha(iRound);
            }
            return true;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m138328f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public final ColorStateList m138329g(@NonNull Context context) {
            return m138330h(context, 0);
        }

        /* JADX INFO: renamed from: h */
        public final ColorStateList m138330h(@NonNull Context context, @ColorInt int i) {
            int iM131734b = hmi0.m131734b(context, n0c0.f136531w);
            return new ColorStateList(new int[][]{hmi0.f108433b, hmi0.f108436e, hmi0.f108434c, hmi0.f108440i}, new int[]{hmi0.m131733a(context, n0c0.f136529u), ge5.m125673j(iM131734b, i), ge5.m125673j(iM131734b, i), i});
        }

        /* JADX INFO: renamed from: i */
        public final ColorStateList m138331i(@NonNull Context context) {
            return m138330h(context, hmi0.m131734b(context, n0c0.f136528t));
        }

        /* JADX INFO: renamed from: j */
        public final ColorStateList m138332j(@NonNull Context context) {
            return m138330h(context, hmi0.m131734b(context, n0c0.f136529u));
        }

        /* JADX INFO: renamed from: k */
        public final ColorStateList m138333k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListM131736d = hmi0.m131736d(context, n0c0.f136534z);
            if (colorStateListM131736d == null || !colorStateListM131736d.isStateful()) {
                iArr[0] = hmi0.f108433b;
                iArr2[0] = hmi0.m131733a(context, n0c0.f136534z);
                iArr[1] = hmi0.f108437f;
                iArr2[1] = hmi0.m131734b(context, n0c0.f136530v);
                iArr[2] = hmi0.f108440i;
                iArr2[2] = hmi0.m131734b(context, n0c0.f136534z);
            } else {
                int[] iArr3 = hmi0.f108433b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListM131736d.getColorForState(iArr3, 0);
                iArr[1] = hmi0.f108437f;
                iArr2[1] = hmi0.m131734b(context, n0c0.f136530v);
                iArr[2] = hmi0.f108440i;
                iArr2[2] = colorStateListM131736d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* JADX INFO: renamed from: l */
        public final void m138334l(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (cce.m106045a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = iu0.f114955b;
            }
            drawable.setColorFilter(iu0.m138316e(i, mode));
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized iu0 m138315b() {
        try {
            if (INSTANCE == null) {
                m138317h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m138316e(int i, PorterDuff.Mode mode) {
        return swc0.m186133k(i, mode);
    }

    /* JADX INFO: renamed from: h */
    public static synchronized void m138317h() {
        if (INSTANCE == null) {
            iu0 iu0Var = new iu0();
            INSTANCE = iu0Var;
            iu0Var.f114956a = swc0.m186132g();
            INSTANCE.f114956a.m186150t(new C17619a());
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m138318i(Drawable drawable, ori0 ori0Var, int[] iArr) {
        swc0.m186136v(drawable, ori0Var, iArr);
    }

    /* JADX INFO: renamed from: c */
    public synchronized Drawable m138319c(@NonNull Context context, @DrawableRes int i) {
        return this.f114956a.m186142i(context, i);
    }

    /* JADX INFO: renamed from: d */
    public synchronized Drawable m138320d(@NonNull Context context, @DrawableRes int i, boolean z) {
        return this.f114956a.m186143j(context, i, z);
    }

    /* JADX INFO: renamed from: f */
    public synchronized ColorStateList m138321f(@NonNull Context context, @DrawableRes int i) {
        return this.f114956a.m186144l(context, i);
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m138322g(@NonNull Context context) {
        this.f114956a.m186148r(context);
    }
}
