package p149l;

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
public final class ywc0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f200468a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    @GuardedBy("sColorStateCacheLock")
    public static final WeakHashMap<C21561d, SparseArray<C21560c>> f200469b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c */
    public static final Object f200470c = new Object();

    /* JADX INFO: renamed from: l.ywc0$a */
    @RequiresApi(21)
    public static class C21558a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Drawable m216343a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }
    }

    /* JADX INFO: renamed from: l.ywc0$b */
    @RequiresApi(23)
    public static class C21559b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m216344a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @NonNull
        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static ColorStateList m216345b(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* JADX INFO: renamed from: l.ywc0$c */
    public static class C21560c {

        /* JADX INFO: renamed from: a */
        public final ColorStateList f200471a;

        /* JADX INFO: renamed from: b */
        public final Configuration f200472b;

        /* JADX INFO: renamed from: c */
        public final int f200473c;

        public C21560c(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, @Nullable Resources.Theme theme) {
            this.f200471a = colorStateList;
            this.f200472b = configuration;
            this.f200473c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: renamed from: l.ywc0$d */
    public static final class C21561d {

        /* JADX INFO: renamed from: a */
        public final Resources f200474a;

        /* JADX INFO: renamed from: b */
        public final Resources.Theme f200475b;

        public C21561d(@NonNull Resources resources, @Nullable Resources.Theme theme) {
            this.f200474a = resources;
            this.f200475b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C21561d.class == obj.getClass()) {
                C21561d c21561d = (C21561d) obj;
                if (this.f200474a.equals(c21561d.f200474a) && w050.m200828a(this.f200475b, c21561d.f200475b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return w050.m200829b(this.f200474a, this.f200475b);
        }
    }

    /* JADX INFO: renamed from: l.ywc0$e */
    public static abstract class AbstractC21562e {
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Handler getHandler(@Nullable Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(final int i, @Nullable Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: l.axc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72144a.onFontRetrievalFailed(i);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(@NonNull final Typeface typeface, @Nullable Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: l.zwc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f205168a.onFontRetrieved(typeface);
                }
            });
        }

        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(@NonNull Typeface typeface);
    }

    /* JADX INFO: renamed from: a */
    public static void m216330a(@NonNull C21561d c21561d, @ColorRes int i, @NonNull ColorStateList colorStateList, @Nullable Resources.Theme theme) {
        synchronized (f200470c) {
            try {
                WeakHashMap<C21561d, SparseArray<C21560c>> weakHashMap = f200469b;
                SparseArray<C21560c> sparseArray = weakHashMap.get(c21561d);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(c21561d, sparseArray);
                }
                sparseArray.append(i, new C21560c(colorStateList, c21561d.f200474a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f200473c == r5.hashCode()) goto L22;
     */
    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList m216331b(@androidx.annotation.NonNull p149l.ywc0.C21561d r5, @androidx.annotation.ColorRes int r6) {
        /*
            java.lang.Object r0 = p149l.ywc0.f200470c
            monitor-enter(r0)
            java.util.WeakHashMap<l.ywc0$d, android.util.SparseArray<l.ywc0$c>> r1 = p149l.ywc0.f200469b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            l.ywc0$c r2 = (p149l.ywc0.C21560c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f200472b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f200474a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f200475b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f200473c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f200473c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f200471a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.ywc0.m216331b(l.ywc0$d, int):android.content.res.ColorStateList");
    }

    @ColorInt
    /* JADX INFO: renamed from: c */
    public static int m216332c(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return C21559b.m216344a(resources, i, theme);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static ColorStateList m216333d(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        C21561d c21561d = new C21561d(resources, theme);
        ColorStateList colorStateListM216331b = m216331b(c21561d, i);
        if (colorStateListM216331b != null) {
            return colorStateListM216331b;
        }
        ColorStateList colorStateListM216339j = m216339j(resources, i, theme);
        if (colorStateListM216339j == null) {
            return C21559b.m216345b(resources, i, theme);
        }
        m216330a(c21561d, i, colorStateListM216339j, theme);
        return colorStateListM216339j;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static Drawable m216334e(@NonNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return C21558a.m216343a(resources, i, theme);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static Typeface m216335f(@NonNull Context context, @FontRes int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m216341l(context, i, new TypedValue(), 0, null, null, false, false);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: g */
    public static Typeface m216336g(@NonNull Context context, @FontRes int i, @NonNull TypedValue typedValue, int i2, @Nullable AbstractC21562e abstractC21562e) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m216341l(context, i, typedValue, i2, abstractC21562e, null, true, false);
    }

    /* JADX INFO: renamed from: h */
    public static void m216337h(@NonNull Context context, @FontRes int i, @NonNull AbstractC21562e abstractC21562e, @Nullable Handler handler) throws Resources.NotFoundException {
        tf80.m188658e(abstractC21562e);
        if (context.isRestricted()) {
            abstractC21562e.callbackFailAsync(-4, handler);
        } else {
            m216341l(context, i, new TypedValue(), 0, abstractC21562e, handler, false, false);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static TypedValue m216338i() {
        ThreadLocal<TypedValue> threadLocal = f200468a;
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
    public static ColorStateList m216339j(Resources resources, int i, @Nullable Resources.Theme theme) {
        if (m216340k(resources, i)) {
            return null;
        }
        try {
            return fe5.m121018a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m216340k(@NonNull Resources resources, @ColorRes int i) {
        TypedValue typedValueM216338i = m216338i();
        resources.getValue(i, typedValueM216338i, true);
        int i2 = typedValueM216338i.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* JADX INFO: renamed from: l */
    public static Typeface m216341l(@NonNull Context context, int i, @NonNull TypedValue typedValue, int i2, @Nullable AbstractC21562e abstractC21562e, @Nullable Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceM216342m = m216342m(context, resources, typedValue, i, i2, abstractC21562e, handler, z, z2);
        if (typefaceM216342m != null || abstractC21562e != null || z2) {
            return typefaceM216342m;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX INFO: renamed from: m */
    public static Typeface m216342m(@NonNull Context context, Resources resources, @NonNull TypedValue typedValue, int i, int i2, @Nullable AbstractC21562e abstractC21562e, @Nullable Handler handler, boolean z, boolean z2) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (abstractC21562e != null) {
                abstractC21562e.callbackFailAsync(-3, handler);
            }
            return null;
        }
        Typeface typefaceM101542f = bfj0.m101542f(resources, i, string, typedValue.assetCookie, i2);
        if (typefaceM101542f != null) {
            if (abstractC21562e != null) {
                abstractC21562e.callbackSuccessAsync(typefaceM101542f, handler);
            }
            return typefaceM101542f;
        }
        if (z2) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceM101540d = bfj0.m101540d(context, resources, i, string, typedValue.assetCookie, i2);
                if (abstractC21562e != null) {
                    if (typefaceM101540d != null) {
                        abstractC21562e.callbackSuccessAsync(typefaceM101540d, handler);
                        return typefaceM101540d;
                    }
                    abstractC21562e.callbackFailAsync(-3, handler);
                }
                return typefaceM101540d;
            }
            ayi.InterfaceC15759b interfaceC15759bM99546b = ayi.m99546b(resources.getXml(i), resources);
            if (interfaceC15759bM99546b == null) {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (abstractC21562e != null) {
                    abstractC21562e.callbackFailAsync(-3, handler);
                }
                return null;
            }
            try {
                return bfj0.m101539c(context, interfaceC15759bM99546b, resources, i, string, typedValue.assetCookie, i2, abstractC21562e, handler, z);
            } catch (IOException e) {
                e = e;
                string = string;
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                if (abstractC21562e != null) {
                    abstractC21562e.callbackFailAsync(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e2) {
                e = e2;
                string = string;
                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e);
                if (abstractC21562e != null) {
                    abstractC21562e.callbackFailAsync(-3, handler);
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
