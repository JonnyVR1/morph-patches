package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p149l.ig3;
import p149l.qkq0;
import p149l.r2j;

/* JADX INFO: renamed from: androidx.fragment.app.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0427k {

    /* JADX INFO: renamed from: a */
    public final C0421e f2082a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f2083b;

    /* JADX INFO: renamed from: c */
    public ArrayList<a> f2084c;

    /* JADX INFO: renamed from: d */
    public int f2085d;

    /* JADX INFO: renamed from: e */
    public int f2086e;

    /* JADX INFO: renamed from: f */
    public int f2087f;

    /* JADX INFO: renamed from: g */
    public int f2088g;

    /* JADX INFO: renamed from: h */
    public int f2089h;

    /* JADX INFO: renamed from: i */
    public boolean f2090i;

    /* JADX INFO: renamed from: j */
    public boolean f2091j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public String f2092k;

    /* JADX INFO: renamed from: l */
    public int f2093l;

    /* JADX INFO: renamed from: m */
    public CharSequence f2094m;

    /* JADX INFO: renamed from: n */
    public int f2095n;

    /* JADX INFO: renamed from: o */
    public CharSequence f2096o;

    /* JADX INFO: renamed from: p */
    public ArrayList<String> f2097p;

    /* JADX INFO: renamed from: q */
    public ArrayList<String> f2098q;

    /* JADX INFO: renamed from: r */
    public boolean f2099r;

    /* JADX INFO: renamed from: s */
    public ArrayList<Runnable> f2100s;

    @Deprecated
    public AbstractC0427k() {
        this.f2084c = new ArrayList<>();
        this.f2091j = true;
        this.f2099r = false;
        this.f2082a = null;
        this.f2083b = null;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public AbstractC0427k m2803b(@IdRes int i, @NonNull Fragment fragment) {
        mo2712o(i, fragment, null, 1);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public AbstractC0427k m2804c(@IdRes int i, @NonNull Fragment fragment, @Nullable String str) {
        mo2712o(i, fragment, str, 1);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC0427k m2805d(@NonNull ViewGroup viewGroup, @NonNull Fragment fragment, @Nullable String str) {
        fragment.mContainer = viewGroup;
        return m2804c(viewGroup.getId(), fragment, str);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public AbstractC0427k m2806e(@NonNull Fragment fragment, @Nullable String str) {
        mo2712o(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m2807f(a aVar) {
        this.f2084c.add(aVar);
        aVar.f2103c = this.f2085d;
        aVar.f2104d = this.f2086e;
        aVar.f2105e = this.f2087f;
        aVar.f2106f = this.f2088g;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public AbstractC0427k m2808g(@Nullable String str) {
        if (!this.f2091j) {
            qkq0.m175383a("This FragmentTransaction is not allowed to be added to the back stack.");
            return null;
        }
        this.f2090i = true;
        this.f2092k = str;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public AbstractC0427k m2809h(@NonNull Fragment fragment) {
        m2807f(new a(7, fragment));
        return this;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo2707i();

    /* JADX INFO: renamed from: j */
    public abstract int mo2708j();

    /* JADX INFO: renamed from: k */
    public abstract void mo2709k();

    /* JADX INFO: renamed from: l */
    public abstract void mo2710l();

    @NonNull
    /* JADX INFO: renamed from: m */
    public AbstractC0427k mo2711m(@NonNull Fragment fragment) {
        m2807f(new a(6, fragment));
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public AbstractC0427k m2810n() {
        if (this.f2090i) {
            qkq0.m175383a("This transaction is already being added to the back stack");
            return null;
        }
        this.f2091j = false;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public void mo2712o(int i, Fragment fragment, @Nullable String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            r2j.m177608a("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 != null && !str.equals(str2)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                String str3 = fragment.mTag;
                sb.append(": was ");
                sb.append(str3);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fragment);
                int i4 = fragment.mFragmentId;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        m2807f(new a(i2, fragment));
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public AbstractC0427k mo2713p(@NonNull Fragment fragment) {
        m2807f(new a(4, fragment));
        return this;
    }

    /* JADX INFO: renamed from: q */
    public boolean mo2714q() {
        return this.f2084c.isEmpty();
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public AbstractC0427k mo2715r(@NonNull Fragment fragment) {
        m2807f(new a(3, fragment));
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public AbstractC0427k m2811s(@IdRes int i, @NonNull Fragment fragment) {
        return m2812t(i, fragment, null);
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public AbstractC0427k m2812t(@IdRes int i, @NonNull Fragment fragment, @Nullable String str) {
        if (i != 0) {
            mo2712o(i, fragment, str, 2);
            return this;
        }
        ig3.m135964a("Must use non-zero containerViewId");
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public AbstractC0427k m2813u(@AnimRes @AnimatorRes int i, @AnimRes @AnimatorRes int i2) {
        return m2814v(i, i2, 0, 0);
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public AbstractC0427k m2814v(@AnimRes @AnimatorRes int i, @AnimRes @AnimatorRes int i2, @AnimRes @AnimatorRes int i3, @AnimRes @AnimatorRes int i4) {
        this.f2085d = i;
        this.f2086e = i2;
        this.f2087f = i3;
        this.f2088g = i4;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: w */
    public AbstractC0427k mo2716w(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        m2807f(new a(10, fragment, state));
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public AbstractC0427k m2815x(boolean z) {
        this.f2099r = z;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: y */
    public AbstractC0427k mo2717y(@NonNull Fragment fragment) {
        m2807f(new a(5, fragment));
        return this;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f2101a;

        /* JADX INFO: renamed from: b */
        public Fragment f2102b;

        /* JADX INFO: renamed from: c */
        public int f2103c;

        /* JADX INFO: renamed from: d */
        public int f2104d;

        /* JADX INFO: renamed from: e */
        public int f2105e;

        /* JADX INFO: renamed from: f */
        public int f2106f;

        /* JADX INFO: renamed from: g */
        public Lifecycle.State f2107g;

        /* JADX INFO: renamed from: h */
        public Lifecycle.State f2108h;

        public a(int i, Fragment fragment) {
            this.f2101a = i;
            this.f2102b = fragment;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f2107g = state;
            this.f2108h = state;
        }

        public a() {
        }

        public a(int i, @NonNull Fragment fragment, Lifecycle.State state) {
            this.f2101a = i;
            this.f2102b = fragment;
            this.f2107g = fragment.mMaxState;
            this.f2108h = state;
        }
    }

    public AbstractC0427k(@NonNull C0421e c0421e, @Nullable ClassLoader classLoader) {
        this.f2084c = new ArrayList<>();
        this.f2091j = true;
        this.f2099r = false;
        this.f2082a = c0421e;
        this.f2083b = classLoader;
    }
}
