package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.g */
/* JADX INFO: loaded from: classes.dex */
public class C0424g {

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
        public final FragmentManager.AbstractC0401l f2062a;

        /* JADX INFO: renamed from: b */
        public final boolean f2063b;

        public a(@NonNull FragmentManager.AbstractC0401l abstractC0401l, boolean z) {
            this.f2062a = abstractC0401l;
            this.f2063b = z;
        }
    }

    public C0424g(@NonNull FragmentManager fragmentManager) {
        this.f2061b = fragmentManager;
    }

    /* JADX INFO: renamed from: a */
    public void m2741a(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2741a(fragment, bundle, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2622a(this.f2061b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2742b(@NonNull Fragment fragment, boolean z) {
        Context contextM175362f = this.f2061b.m2593u0().m175362f();
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2742b(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2623b(this.f2061b, fragment, contextM175362f);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2743c(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2743c(fragment, bundle, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2624c(this.f2061b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2744d(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2744d(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2625d(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2745e(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2745e(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2626e(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2746f(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2746f(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2627f(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2747g(@NonNull Fragment fragment, boolean z) {
        Context contextM175362f = this.f2061b.m2593u0().m175362f();
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2747g(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2628g(this.f2061b, fragment, contextM175362f);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2748h(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2748h(fragment, bundle, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2629h(this.f2061b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2749i(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2749i(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2630i(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m2750j(@NonNull Fragment fragment, @NonNull Bundle bundle, boolean z) {
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2750j(fragment, bundle, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2631j(this.f2061b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2751k(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2751k(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2632k(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m2752l(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2752l(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2633l(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m2753m(@NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle, boolean z) {
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2753m(fragment, view, bundle, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.mo2634m(this.f2061b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2754n(@NonNull Fragment fragment, boolean z) {
        Fragment fragmentM2602x0 = this.f2061b.m2602x0();
        if (fragmentM2602x0 != null) {
            fragmentM2602x0.getParentFragmentManager().m2599w0().m2754n(fragment, true);
        }
        for (a aVar : this.f2060a) {
            if (!z || aVar.f2063b) {
                aVar.f2062a.m2635n(this.f2061b, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m2755o(@NonNull FragmentManager.AbstractC0401l abstractC0401l, boolean z) {
        this.f2060a.add(new a(abstractC0401l, z));
    }

    /* JADX INFO: renamed from: p */
    public void m2756p(@NonNull FragmentManager.AbstractC0401l abstractC0401l) {
        synchronized (this.f2060a) {
            try {
                int size = this.f2060a.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2060a.get(i).f2062a == abstractC0401l) {
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
