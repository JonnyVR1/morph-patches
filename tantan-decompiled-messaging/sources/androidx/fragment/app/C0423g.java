package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.g */
/* JADX INFO: loaded from: classes.dex */
public class C0423g {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CopyOnWriteArrayList<a> f2060a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FragmentManager f2061b;

    /* JADX INFO: renamed from: androidx.fragment.app.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final FragmentManager.AbstractC0400l f2062a;

        /* JADX INFO: renamed from: b */
        public final boolean f2063b;

        public a(@NonNull FragmentManager.AbstractC0400l abstractC0400l, boolean z) {
            this.f2062a = abstractC0400l;
            this.f2063b = z;
        }
    }

    public C0423g(@NonNull FragmentManager fragmentManager) {
        this.f2061b = fragmentManager;
    }

    /* JADX INFO: renamed from: a */
    public void m2740a(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2740a(fragment, bundle, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2621a(this.f2061b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2741b(@NonNull Fragment fragment, boolean z) {
        Context contextM196786f = this.f2061b.m2592u0().m196786f();
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2741b(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2622b(this.f2061b, fragment, contextM196786f);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2742c(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2742c(fragment, bundle, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2623c(this.f2061b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2743d(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2743d(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2624d(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2744e(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2744e(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2625e(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2745f(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2745f(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2626f(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2746g(@NonNull Fragment fragment, boolean z) {
        Context contextM196786f = this.f2061b.m2592u0().m196786f();
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2746g(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2627g(this.f2061b, fragment, contextM196786f);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2747h(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2747h(fragment, bundle, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2628h(this.f2061b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2748i(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2748i(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2629i(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m2749j(@NonNull Fragment fragment, @NonNull Bundle bundle, boolean z) {
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2749j(fragment, bundle, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2630j(this.f2061b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2750k(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2750k(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2631k(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m2751l(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2751l(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2632l(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m2752m(@NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle, boolean z) {
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2752m(fragment, view, bundle, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.mo2633m(this.f2061b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2753n(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2601x0 = this.f2061b.m2601x0();
        if (fragmentM2601x0 != null) {
            fragmentM2601x0.getParentFragmentManager().m2598w0().m2753n(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2634n(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m2754o(@NonNull FragmentManager.AbstractC0400l abstractC0400l, boolean z) {
        this.f2060a.add(new a(abstractC0400l, z));
    }

    /* JADX INFO: renamed from: p */
    public void m2755p(@NonNull FragmentManager.AbstractC0400l abstractC0400l) {
        synchronized (this.f2060a) {
            try {
                int size = this.f2060a.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2060a.get(i).f2062a == abstractC0400l) {
                        this.f2060a.remove(i);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
