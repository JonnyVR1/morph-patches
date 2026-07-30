package p149l;

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
public final class swc0 {
    private static swc0 INSTANCE;

    /* JADX INFO: renamed from: h */
    public static final PorterDuff.Mode f166646h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: i */
    public static final C20047a f166647i = new C20047a(6);

    /* JADX INFO: renamed from: a */
    public WeakHashMap<Context, xmf0<ColorStateList>> f166648a;

    /* JADX INFO: renamed from: b */
    public e01<String, InterfaceC20048b> f166649b;

    /* JADX INFO: renamed from: c */
    public xmf0<String> f166650c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap<Context, l2w<WeakReference<Drawable.ConstantState>>> f166651d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e */
    public TypedValue f166652e;

    /* JADX INFO: renamed from: f */
    public boolean f166653f;

    /* JADX INFO: renamed from: g */
    public InterfaceC20049c f166654g;

    /* JADX INFO: renamed from: l.swc0$a */
    public static class C20047a extends zew<Integer, PorterDuffColorFilter> {
        public C20047a(int i) {
            super(i);
        }

        /* JADX INFO: renamed from: k */
        public static int m186153k(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* JADX INFO: renamed from: l */
        public PorterDuffColorFilter m186154l(int i, PorterDuff.Mode mode) {
            return m218420d(Integer.valueOf(m186153k(i, mode)));
        }

        /* JADX INFO: renamed from: m */
        public PorterDuffColorFilter m186155m(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m218421e(Integer.valueOf(m186153k(i, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: renamed from: l.swc0$b */
    public interface InterfaceC20048b {
        /* JADX INFO: renamed from: a */
        Drawable m186156a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    /* JADX INFO: renamed from: l.swc0$c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC20049c {
        /* JADX INFO: renamed from: a */
        ColorStateList mo138323a(@NonNull Context context, @DrawableRes int i);

        /* JADX INFO: renamed from: b */
        PorterDuff.Mode mo138324b(int i);

        /* JADX INFO: renamed from: c */
        boolean mo138325c(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable);

        /* JADX INFO: renamed from: d */
        Drawable mo138326d(@NonNull swc0 swc0Var, @NonNull Context context, @DrawableRes int i);

        /* JADX INFO: renamed from: e */
        boolean mo138327e(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable);
    }

    /* JADX INFO: renamed from: d */
    public static long m186130d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* JADX INFO: renamed from: f */
    public static PorterDuffColorFilter m186131f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m186133k(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* JADX INFO: renamed from: g */
    public static synchronized swc0 m186132g() {
        try {
            if (INSTANCE == null) {
                swc0 swc0Var = new swc0();
                INSTANCE = swc0Var;
                m186134o(swc0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static synchronized PorterDuffColorFilter m186133k(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM186154l;
        C20047a c20047a = f166647i;
        porterDuffColorFilterM186154l = c20047a.m186154l(i, mode);
        if (porterDuffColorFilterM186154l == null) {
            porterDuffColorFilterM186154l = new PorterDuffColorFilter(i, mode);
            c20047a.m186155m(i, mode, porterDuffColorFilterM186154l);
        }
        return porterDuffColorFilterM186154l;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m186135p(@NonNull Drawable drawable) {
        return (drawable instanceof osk0) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX INFO: renamed from: v */
    public static void m186136v(Drawable drawable, ori0 ori0Var, int[] iArr) {
        if (!cce.m106045a(drawable) || drawable.mutate() == drawable) {
            boolean z = ori0Var.f145325d;
            if (z || ori0Var.f145324c) {
                drawable.setColorFilter(m186131f(z ? ori0Var.f145322a : null, ori0Var.f145324c ? ori0Var.f145323b : f166646h, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m186137a(@NonNull Context context, long j, @NonNull Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            l2w<WeakReference<Drawable.ConstantState>> l2wVar = this.f166651d.get(context);
            if (l2wVar == null) {
                l2wVar = new l2w<>();
                this.f166651d.put(context, l2wVar);
            }
            l2wVar.m148316m(j, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m186138b(@NonNull Context context, @DrawableRes int i, @NonNull ColorStateList colorStateList) {
        if (this.f166648a == null) {
            this.f166648a = new WeakHashMap<>();
        }
        xmf0<ColorStateList> xmf0Var = this.f166648a.get(context);
        if (xmf0Var == null) {
            xmf0Var = new xmf0<>();
            this.f166648a.put(context, xmf0Var);
        }
        xmf0Var.m210126a(i, colorStateList);
    }

    /* JADX INFO: renamed from: c */
    public final void m186139c(@NonNull Context context) {
        if (this.f166653f) {
            return;
        }
        this.f166653f = true;
        Drawable drawableM186142i = m186142i(context, a3c0.f67343a);
        if (drawableM186142i == null || !m186135p(drawableM186142i)) {
            this.f166653f = false;
            qkq0.m175383a("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m186140e(@NonNull Context context, @DrawableRes int i) {
        if (this.f166652e == null) {
            this.f166652e = new TypedValue();
        }
        TypedValue typedValue = this.f166652e;
        context.getResources().getValue(i, typedValue, true);
        long jM186130d = m186130d(typedValue);
        Drawable drawableM186141h = m186141h(context, jM186130d);
        if (drawableM186141h != null) {
            return drawableM186141h;
        }
        InterfaceC20049c interfaceC20049c = this.f166654g;
        Drawable drawableMo138326d = interfaceC20049c == null ? null : interfaceC20049c.mo138326d(this, context, i);
        if (drawableMo138326d != null) {
            drawableMo138326d.setChangingConfigurations(typedValue.changingConfigurations);
            m186137a(context, jM186130d, drawableMo138326d);
        }
        return drawableMo138326d;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized Drawable m186141h(@NonNull Context context, long j) {
        l2w<WeakReference<Drawable.ConstantState>> l2wVar = this.f166651d.get(context);
        if (l2wVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceM148311e = l2wVar.m148311e(j);
        if (weakReferenceM148311e != null) {
            Drawable.ConstantState constantState = weakReferenceM148311e.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            l2wVar.m148309c(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public synchronized Drawable m186142i(@NonNull Context context, @DrawableRes int i) {
        return m186143j(context, i, false);
    }

    /* JADX INFO: renamed from: j */
    public synchronized Drawable m186143j(@NonNull Context context, @DrawableRes int i, boolean z) {
        Drawable drawableM186147q;
        try {
            m186139c(context);
            drawableM186147q = m186147q(context, i);
            if (drawableM186147q == null) {
                drawableM186147q = m186140e(context, i);
            }
            if (drawableM186147q == null) {
                drawableM186147q = e16.m114377e(context, i);
            }
            if (drawableM186147q != null) {
                drawableM186147q = m186151u(context, i, z, drawableM186147q);
            }
            if (drawableM186147q != null) {
                cce.m106046b(drawableM186147q);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM186147q;
    }

    /* JADX INFO: renamed from: l */
    public synchronized ColorStateList m186144l(@NonNull Context context, @DrawableRes int i) {
        ColorStateList colorStateListM186145m;
        colorStateListM186145m = m186145m(context, i);
        if (colorStateListM186145m == null) {
            InterfaceC20049c interfaceC20049c = this.f166654g;
            colorStateListM186145m = interfaceC20049c == null ? null : interfaceC20049c.mo138323a(context, i);
            if (colorStateListM186145m != null) {
                m186138b(context, i, colorStateListM186145m);
            }
        }
        return colorStateListM186145m;
    }

    /* JADX INFO: renamed from: m */
    public final ColorStateList m186145m(@NonNull Context context, @DrawableRes int i) {
        xmf0<ColorStateList> xmf0Var;
        WeakHashMap<Context, xmf0<ColorStateList>> weakHashMap = this.f166648a;
        if (weakHashMap == null || (xmf0Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return xmf0Var.m210129d(i);
    }

    /* JADX INFO: renamed from: n */
    public PorterDuff.Mode m186146n(int i) {
        InterfaceC20049c interfaceC20049c = this.f166654g;
        if (interfaceC20049c == null) {
            return null;
        }
        return interfaceC20049c.mo138324b(i);
    }

    /* JADX INFO: renamed from: q */
    public final Drawable m186147q(@NonNull Context context, @DrawableRes int i) {
        int next;
        e01<String, InterfaceC20048b> e01Var = this.f166649b;
        if (e01Var == null || e01Var.isEmpty()) {
            return null;
        }
        xmf0<String> xmf0Var = this.f166650c;
        if (xmf0Var != null) {
            String strM210129d = xmf0Var.m210129d(i);
            if ("appcompat_skip_skip".equals(strM210129d) || (strM210129d != null && this.f166649b.get(strM210129d) == null)) {
                return null;
            }
        } else {
            this.f166650c = new xmf0<>();
        }
        if (this.f166652e == null) {
            this.f166652e = new TypedValue();
        }
        TypedValue typedValue = this.f166652e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long jM186130d = m186130d(typedValue);
        Drawable drawableM186141h = m186141h(context, jM186130d);
        if (drawableM186141h != null) {
            return drawableM186141h;
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
                this.f166650c.m210126a(i, name);
                InterfaceC20048b interfaceC20048b = this.f166649b.get(name);
                if (interfaceC20048b != null) {
                    drawableM186141h = interfaceC20048b.m186156a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM186141h != null) {
                    drawableM186141h.setChangingConfigurations(typedValue.changingConfigurations);
                    m186137a(context, jM186130d, drawableM186141h);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (drawableM186141h == null) {
            this.f166650c.m210126a(i, "appcompat_skip_skip");
        }
        return drawableM186141h;
    }

    /* JADX INFO: renamed from: r */
    public synchronized void m186148r(@NonNull Context context) {
        l2w<WeakReference<Drawable.ConstantState>> l2wVar = this.f166651d.get(context);
        if (l2wVar != null) {
            l2wVar.clear();
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized Drawable m186149s(@NonNull Context context, @NonNull psk0 psk0Var, @DrawableRes int i) {
        try {
            Drawable drawableM186147q = m186147q(context, i);
            if (drawableM186147q == null) {
                drawableM186147q = psk0Var.m171180c(i);
            }
            if (drawableM186147q == null) {
                return null;
            }
            return m186151u(context, i, false, drawableM186147q);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m186150t(InterfaceC20049c interfaceC20049c) {
        this.f166654g = interfaceC20049c;
    }

    /* JADX INFO: renamed from: u */
    public final Drawable m186151u(@NonNull Context context, @DrawableRes int i, boolean z, @NonNull Drawable drawable) {
        ColorStateList colorStateListM186144l = m186144l(context, i);
        if (colorStateListM186144l == null) {
            InterfaceC20049c interfaceC20049c = this.f166654g;
            if ((interfaceC20049c == null || !interfaceC20049c.mo138325c(context, i, drawable)) && !m186152w(context, i, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (cce.m106045a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableM145284r = kbe.m145284r(drawable);
        kbe.m145281o(drawableM145284r, colorStateListM186144l);
        PorterDuff.Mode modeM186146n = m186146n(i);
        if (modeM186146n != null) {
            kbe.m145282p(drawableM145284r, modeM186146n);
        }
        return drawableM145284r;
    }

    /* JADX INFO: renamed from: w */
    public boolean m186152w(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable) {
        InterfaceC20049c interfaceC20049c = this.f166654g;
        return interfaceC20049c != null && interfaceC20049c.mo138327e(context, i, drawable);
    }

    /* JADX INFO: renamed from: o */
    public static void m186134o(@NonNull swc0 swc0Var) {
    }
}
