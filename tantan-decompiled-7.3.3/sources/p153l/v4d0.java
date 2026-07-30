package p153l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class v4d0 {
    private static v4d0 INSTANCE;

    /* JADX INFO: renamed from: h */
    public static final PorterDuff.Mode f182349h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: i */
    public static final C20753a f182350i = new C20753a(6);

    /* JADX INFO: renamed from: a */
    public WeakHashMap<Context, gvf0<ColorStateList>> f182351a;

    /* JADX INFO: renamed from: b */
    public l01<String, InterfaceC20754b> f182352b;

    /* JADX INFO: renamed from: c */
    public gvf0<String> f182353c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap<Context, j4w<WeakReference<Drawable.ConstantState>>> f182354d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e */
    public TypedValue f182355e;

    /* JADX INFO: renamed from: f */
    public boolean f182356f;

    /* JADX INFO: renamed from: g */
    public InterfaceC20755c f182357g;

    /* JADX INFO: renamed from: l.v4d0$a */
    public static class C20753a extends xgw<Integer, PorterDuffColorFilter> {
        public C20753a(int i) {
            super(i);
        }

        /* JADX INFO: renamed from: k */
        public static int m199686k(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* JADX INFO: renamed from: l */
        public PorterDuffColorFilter m199687l(int i, PorterDuff.Mode mode) {
            return m210954d(Integer.valueOf(m199686k(i, mode)));
        }

        /* JADX INFO: renamed from: m */
        public PorterDuffColorFilter m199688m(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m210955e(Integer.valueOf(m199686k(i, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: renamed from: l.v4d0$b */
    public interface InterfaceC20754b {
        /* JADX INFO: renamed from: a */
        Drawable m199689a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    /* JADX INFO: renamed from: l.v4d0$c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC20755c {
        /* JADX INFO: renamed from: a */
        ColorStateList mo169206a(@NonNull Context context, @DrawableRes int i);

        /* JADX INFO: renamed from: b */
        PorterDuff.Mode mo169207b(int i);

        /* JADX INFO: renamed from: c */
        boolean mo169208c(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable);

        /* JADX INFO: renamed from: d */
        Drawable mo169209d(@NonNull v4d0 v4d0Var, @NonNull Context context, @DrawableRes int i);

        /* JADX INFO: renamed from: e */
        boolean mo169210e(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable);
    }

    /* JADX INFO: renamed from: d */
    public static long m199663d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* JADX INFO: renamed from: f */
    public static PorterDuffColorFilter m199664f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m199666k(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* JADX INFO: renamed from: g */
    public static synchronized v4d0 m199665g() {
        try {
            if (INSTANCE == null) {
                v4d0 v4d0Var = new v4d0();
                INSTANCE = v4d0Var;
                m199667o(v4d0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static synchronized PorterDuffColorFilter m199666k(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM199687l;
        C20753a c20753a = f182350i;
        porterDuffColorFilterM199687l = c20753a.m199687l(i, mode);
        if (porterDuffColorFilterM199687l == null) {
            porterDuffColorFilterM199687l = new PorterDuffColorFilter(i, mode);
            c20753a.m199688m(i, mode, porterDuffColorFilterM199687l);
        }
        return porterDuffColorFilterM199687l;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m199668p(@NonNull Drawable drawable) {
        return (drawable instanceof u1l0) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX INFO: renamed from: v */
    public static void m199669v(Drawable drawable, r0j0 r0j0Var, int[] iArr) {
        if (!gde.m129921a(drawable) || drawable.mutate() == drawable) {
            boolean z = r0j0Var.f160641d;
            if (z || r0j0Var.f160640c) {
                drawable.setColorFilter(m199664f(z ? r0j0Var.f160638a : null, r0j0Var.f160640c ? r0j0Var.f160639b : f182349h, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m199670a(@NonNull Context context, long j, @NonNull Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            j4w<WeakReference<Drawable.ConstantState>> j4wVar = this.f182354d.get(context);
            if (j4wVar == null) {
                j4wVar = new j4w<>();
                this.f182354d.put(context, j4wVar);
            }
            j4wVar.m143464m(j, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m199671b(@NonNull Context context, @DrawableRes int i, @NonNull ColorStateList colorStateList) {
        if (this.f182351a == null) {
            this.f182351a = new WeakHashMap<>();
        }
        gvf0<ColorStateList> gvf0Var = this.f182351a.get(context);
        if (gvf0Var == null) {
            gvf0Var = new gvf0<>();
            this.f182351a.put(context, gvf0Var);
        }
        gvf0Var.m132546a(i, colorStateList);
    }

    /* JADX INFO: renamed from: c */
    public final void m199672c(@NonNull Context context) {
        if (this.f182356f) {
            return;
        }
        this.f182356f = true;
        Drawable drawableM199675i = m199675i(context, hbc0.f108581a);
        if (drawableM199675i == null || !m199668p(drawableM199675i)) {
            this.f182356f = false;
            wtq0.m207906a("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m199673e(@NonNull Context context, @DrawableRes int i) {
        if (this.f182355e == null) {
            this.f182355e = new TypedValue();
        }
        TypedValue typedValue = this.f182355e;
        context.getResources().getValue(i, typedValue, true);
        long jM199663d = m199663d(typedValue);
        Drawable drawableM199674h = m199674h(context, jM199663d);
        if (drawableM199674h != null) {
            return drawableM199674h;
        }
        InterfaceC20755c interfaceC20755c = this.f182357g;
        Drawable drawableMo169209d = interfaceC20755c == null ? null : interfaceC20755c.mo169209d(this, context, i);
        if (drawableMo169209d != null) {
            drawableMo169209d.setChangingConfigurations(typedValue.changingConfigurations);
            m199670a(context, jM199663d, drawableMo169209d);
        }
        return drawableMo169209d;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized Drawable m199674h(@NonNull Context context, long j) {
        j4w<WeakReference<Drawable.ConstantState>> j4wVar = this.f182354d.get(context);
        if (j4wVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceM143459e = j4wVar.m143459e(j);
        if (weakReferenceM143459e != null) {
            Drawable.ConstantState constantState = weakReferenceM143459e.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            j4wVar.m143457c(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public synchronized Drawable m199675i(@NonNull Context context, @DrawableRes int i) {
        return m199676j(context, i, false);
    }

    /* JADX INFO: renamed from: j */
    public synchronized Drawable m199676j(@NonNull Context context, @DrawableRes int i, boolean z) {
        Drawable drawableM199680q;
        try {
            m199672c(context);
            drawableM199680q = m199680q(context, i);
            if (drawableM199680q == null) {
                drawableM199680q = m199673e(context, i);
            }
            if (drawableM199680q == null) {
                drawableM199680q = j26.m143192e(context, i);
            }
            if (drawableM199680q != null) {
                drawableM199680q = m199684u(context, i, z, drawableM199680q);
            }
            if (drawableM199680q != null) {
                gde.m129922b(drawableM199680q);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM199680q;
    }

    /* JADX INFO: renamed from: l */
    public synchronized ColorStateList m199677l(@NonNull Context context, @DrawableRes int i) {
        ColorStateList colorStateListM199678m;
        colorStateListM199678m = m199678m(context, i);
        if (colorStateListM199678m == null) {
            InterfaceC20755c interfaceC20755c = this.f182357g;
            colorStateListM199678m = interfaceC20755c == null ? null : interfaceC20755c.mo169206a(context, i);
            if (colorStateListM199678m != null) {
                m199671b(context, i, colorStateListM199678m);
            }
        }
        return colorStateListM199678m;
    }

    /* JADX INFO: renamed from: m */
    public final ColorStateList m199678m(@NonNull Context context, @DrawableRes int i) {
        gvf0<ColorStateList> gvf0Var;
        WeakHashMap<Context, gvf0<ColorStateList>> weakHashMap = this.f182351a;
        if (weakHashMap == null || (gvf0Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return gvf0Var.m132549d(i);
    }

    /* JADX INFO: renamed from: n */
    public PorterDuff.Mode m199679n(int i) {
        InterfaceC20755c interfaceC20755c = this.f182357g;
        if (interfaceC20755c == null) {
            return null;
        }
        return interfaceC20755c.mo169207b(i);
    }

    /* JADX INFO: renamed from: q */
    public final Drawable m199680q(@NonNull Context context, @DrawableRes int i) {
        int next;
        l01<String, InterfaceC20754b> l01Var = this.f182352b;
        if (l01Var == null || l01Var.isEmpty()) {
            return null;
        }
        gvf0<String> gvf0Var = this.f182353c;
        if (gvf0Var != null) {
            String strM132549d = gvf0Var.m132549d(i);
            if ("appcompat_skip_skip".equals(strM132549d) || (strM132549d != null && this.f182352b.get(strM132549d) == null)) {
                return null;
            }
        } else {
            this.f182353c = new gvf0<>();
        }
        if (this.f182355e == null) {
            this.f182355e = new TypedValue();
        }
        TypedValue typedValue = this.f182355e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long jM199663d = m199663d(typedValue);
        Drawable drawableM199674h = m199674h(context, jM199663d);
        if (drawableM199674h != null) {
            return drawableM199674h;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f182353c.m132546a(i, name);
                InterfaceC20754b interfaceC20754b = this.f182352b.get(name);
                if (interfaceC20754b != null) {
                    drawableM199674h = interfaceC20754b.m199689a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM199674h != null) {
                    drawableM199674h.setChangingConfigurations(typedValue.changingConfigurations);
                    m199670a(context, jM199663d, drawableM199674h);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (drawableM199674h == null) {
            this.f182353c.m132546a(i, "appcompat_skip_skip");
        }
        return drawableM199674h;
    }

    /* JADX INFO: renamed from: r */
    public synchronized void m199681r(@NonNull Context context) {
        j4w<WeakReference<Drawable.ConstantState>> j4wVar = this.f182354d.get(context);
        if (j4wVar != null) {
            j4wVar.clear();
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized Drawable m199682s(@NonNull Context context, @NonNull v1l0 v1l0Var, @DrawableRes int i) {
        try {
            Drawable drawableM199680q = m199680q(context, i);
            if (drawableM199680q == null) {
                drawableM199680q = v1l0Var.m199020c(i);
            }
            if (drawableM199680q == null) {
                return null;
            }
            return m199684u(context, i, false, drawableM199680q);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m199683t(InterfaceC20755c interfaceC20755c) {
        this.f182357g = interfaceC20755c;
    }

    /* JADX INFO: renamed from: u */
    public final Drawable m199684u(@NonNull Context context, @DrawableRes int i, boolean z, @NonNull Drawable drawable) {
        ColorStateList colorStateListM199677l = m199677l(context, i);
        if (colorStateListM199677l == null) {
            InterfaceC20755c interfaceC20755c = this.f182357g;
            if ((interfaceC20755c == null || !interfaceC20755c.mo169208c(context, i, drawable)) && !m199685w(context, i, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (gde.m129921a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableM167178r = oce.m167178r(drawable);
        oce.m167175o(drawableM167178r, colorStateListM199677l);
        PorterDuff.Mode modeM199679n = m199679n(i);
        if (modeM199679n != null) {
            oce.m167176p(drawableM167178r, modeM199679n);
        }
        return drawableM167178r;
    }

    /* JADX INFO: renamed from: w */
    public boolean m199685w(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable) {
        InterfaceC20755c interfaceC20755c = this.f182357g;
        return interfaceC20755c != null && interfaceC20755c.mo169210e(context, i, drawable);
    }

    /* JADX INFO: renamed from: o */
    public static void m199667o(@NonNull v4d0 v4d0Var) {
    }
}
