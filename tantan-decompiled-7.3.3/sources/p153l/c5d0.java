package p153l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class c5d0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f79845a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    @GuardedBy("sColorStateCacheLock")
    public static final WeakHashMap<C16195d, SparseArray<C16194c>> f79846b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c */
    public static final Object f79847c = new Object();

    /* JADX INFO: renamed from: l.c5d0$a */
    @RequiresApi(21)
    public static class C16192a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Drawable m108044a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }
    }

    /* JADX INFO: renamed from: l.c5d0$b */
    @RequiresApi(23)
    public static class C16193b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m108045a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @NonNull
        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static ColorStateList m108046b(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* JADX INFO: renamed from: l.c5d0$c */
    public static class C16194c {

        /* JADX INFO: renamed from: a */
        public final ColorStateList f79848a;

        /* JADX INFO: renamed from: b */
        public final Configuration f79849b;

        /* JADX INFO: renamed from: c */
        public final int f79850c;

        public C16194c(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, @Nullable Resources.Theme theme) {
            this.f79848a = colorStateList;
            this.f79849b = configuration;
            this.f79850c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: renamed from: l.c5d0$d */
    public static final class C16195d {

        /* JADX INFO: renamed from: a */
        public final Resources f79851a;

        /* JADX INFO: renamed from: b */
        public final Resources.Theme f79852b;

        public C16195d(@NonNull Resources resources, @Nullable Resources.Theme theme) {
            this.f79851a = resources;
            this.f79852b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C16195d.class == obj.getClass()) {
                C16195d c16195d = (C16195d) obj;
                if (this.f79851a.equals(c16195d.f79851a) && l950.m153327a(this.f79852b, c16195d.f79852b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return l950.m153328b(this.f79851a, this.f79852b);
        }
    }

    /* JADX INFO: renamed from: l.c5d0$e */
    public static abstract class AbstractC16196e {
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Handler getHandler(@Nullable Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(final int i, @Nullable Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: l.e5d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f92210a.onFontRetrievalFailed(i);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(@NonNull final Typeface typeface, @Nullable Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: l.d5d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f85149a.onFontRetrieved(typeface);
                }
            });
        }

        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(@NonNull Typeface typeface);
    }

    /* JADX INFO: renamed from: a */
    public static void m108031a(@NonNull C16195d c16195d, @ColorRes int i, @NonNull ColorStateList colorStateList, @Nullable Resources.Theme theme) {
        synchronized (f79847c) {
            try {
                WeakHashMap<C16195d, SparseArray<C16194c>> weakHashMap = f79846b;
                SparseArray<C16194c> sparseArray = weakHashMap.get(c16195d);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(c16195d, sparseArray);
                }
                sparseArray.append(i, new C16194c(colorStateList, c16195d.f79851a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f79850c == r5.hashCode()) goto L22;
     */
    @Nullable
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m108032b(@NonNull C16195d c16195d, @ColorRes int i) {
        C16194c c16194c;
        synchronized (f79847c) {
            try {
                SparseArray<C16194c> sparseArray = f79846b.get(c16195d);
                if (sparseArray != null && sparseArray.size() > 0 && (c16194c = sparseArray.get(i)) != null) {
                    if (c16194c.f79849b.equals(c16195d.f79851a.getConfiguration())) {
                        Resources.Theme theme = c16195d.f79852b;
                        if (theme != null || c16194c.f79850c != 0) {
                            if (theme != null) {
                            }
                        }
                        return c16194c.f79848a;
                    }
                    sparseArray.remove(i);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ColorInt
    /* JADX INFO: renamed from: c */
    public static int m108033c(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return C16193b.m108045a(resources, i, theme);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static ColorStateList m108034d(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        C16195d c16195d = new C16195d(resources, theme);
        ColorStateList colorStateListM108032b = m108032b(c16195d, i);
        if (colorStateListM108032b != null) {
            return colorStateListM108032b;
        }
        ColorStateList colorStateListM108040j = m108040j(resources, i, theme);
        if (colorStateListM108040j == null) {
            return C16193b.m108046b(resources, i, theme);
        }
        m108031a(c16195d, i, colorStateListM108040j, theme);
        return colorStateListM108040j;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static Drawable m108035e(@NonNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return C16192a.m108044a(resources, i, theme);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static Typeface m108036f(@NonNull Context context, @FontRes int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m108042l(context, i, new TypedValue(), 0, null, null, false, false);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: g */
    public static Typeface m108037g(@NonNull Context context, @FontRes int i, @NonNull TypedValue typedValue, int i2, @Nullable AbstractC16196e abstractC16196e) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m108042l(context, i, typedValue, i2, abstractC16196e, null, true, false);
    }

    /* JADX INFO: renamed from: h */
    public static void m108038h(@NonNull Context context, @FontRes int i, @NonNull AbstractC16196e abstractC16196e, @Nullable Handler handler) throws Resources.NotFoundException {
        yn80.m216775e(abstractC16196e);
        if (context.isRestricted()) {
            abstractC16196e.callbackFailAsync(-4, handler);
        } else {
            m108042l(context, i, new TypedValue(), 0, abstractC16196e, handler, false, false);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static TypedValue m108039i() {
        ThreadLocal<TypedValue> threadLocal = f79845a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static ColorStateList m108040j(Resources resources, int i, @Nullable Resources.Theme theme) {
        if (m108041k(resources, i)) {
            return null;
        }
        try {
            return ff5.m125351a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m108041k(@NonNull Resources resources, @ColorRes int i) {
        TypedValue typedValueM108039i = m108039i();
        resources.getValue(i, typedValueM108039i, true);
        int i2 = typedValueM108039i.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* JADX INFO: renamed from: l */
    public static Typeface m108042l(@NonNull Context context, int i, @NonNull TypedValue typedValue, int i2, @Nullable AbstractC16196e abstractC16196e, @Nullable Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceM108043m = m108043m(context, resources, typedValue, i, i2, abstractC16196e, handler, z, z2);
        if (typefaceM108043m != null || abstractC16196e != null || z2) {
            return typefaceM108043m;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX INFO: renamed from: m */
    public static Typeface m108043m(@NonNull Context context, Resources resources, @NonNull TypedValue typedValue, int i, int i2, @Nullable AbstractC16196e abstractC16196e, @Nullable Handler handler, boolean z, boolean z2) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (abstractC16196e != null) {
                abstractC16196e.callbackFailAsync(-3, handler);
            }
            return null;
        }
        Typeface typefaceM126461f = foj0.m126461f(resources, i, string, typedValue.assetCookie, i2);
        if (typefaceM126461f != null) {
            if (abstractC16196e != null) {
                abstractC16196e.callbackSuccessAsync(typefaceM126461f, handler);
            }
            return typefaceM126461f;
        }
        if (z2) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceM126459d = foj0.m126459d(context, resources, i, string, typedValue.assetCookie, i2);
                if (abstractC16196e != null) {
                    if (typefaceM126459d != null) {
                        abstractC16196e.callbackSuccessAsync(typefaceM126459d, handler);
                        return typefaceM126459d;
                    }
                    abstractC16196e.callbackFailAsync(-3, handler);
                }
                return typefaceM126459d;
            }
            w0j.InterfaceC20973b interfaceC20973bM204182b = w0j.m204182b(resources.getXml(i), resources);
            if (interfaceC20973bM204182b == null) {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (abstractC16196e != null) {
                    abstractC16196e.callbackFailAsync(-3, handler);
                }
                return null;
            }
            try {
                return foj0.m126458c(context, interfaceC20973bM204182b, resources, i, string, typedValue.assetCookie, i2, abstractC16196e, handler, z);
            } catch (IOException e) {
                e = e;
                string = string;
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                if (abstractC16196e != null) {
                    abstractC16196e.callbackFailAsync(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e2) {
                e = e2;
                string = string;
                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e);
                if (abstractC16196e != null) {
                    abstractC16196e.callbackFailAsync(-3, handler);
                }
                return null;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        }
    }
}
