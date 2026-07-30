package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.C0490t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p149l.jcl0;
import p149l.ocl0;

/* JADX INFO: loaded from: classes.dex */
final class FragmentManagerViewModel extends jcl0 {

    /* JADX INFO: renamed from: h */
    public static final C0490t.c f1943h = new C0406a();

    /* JADX INFO: renamed from: d */
    public final boolean f1947d;

    /* JADX INFO: renamed from: a */
    public final HashMap<String, Fragment> f1944a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final HashMap<String, FragmentManagerViewModel> f1945b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final HashMap<String, ocl0> f1946c = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public boolean f1948e = false;

    /* JADX INFO: renamed from: f */
    public boolean f1949f = false;

    /* JADX INFO: renamed from: g */
    public boolean f1950g = false;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManagerViewModel$a */
    public class C0406a implements C0490t.c {
        @Override // androidx.lifecycle.C0490t.c
        @NonNull
        public <T extends jcl0> T create(@NonNull Class<T> cls) {
            return new FragmentManagerViewModel(true);
        }
    }

    public FragmentManagerViewModel(boolean z) {
        this.f1947d = z;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static FragmentManagerViewModel m2641e(ocl0 ocl0Var) {
        return (FragmentManagerViewModel) new C0490t(ocl0Var, f1943h).m3073a(FragmentManagerViewModel.class);
    }

    /* JADX INFO: renamed from: a */
    public void m2642a(@NonNull Fragment fragment) {
        if (this.f1950g) {
            FragmentManager.m2480G0(2);
        } else {
            if (this.f1944a.containsKey(fragment.mWho)) {
                return;
            }
            this.f1944a.put(fragment.mWho, fragment);
            if (FragmentManager.m2480G0(2)) {
                fragment.toString();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2643b(@NonNull Fragment fragment) {
        if (FragmentManager.m2480G0(3)) {
            Objects.toString(fragment);
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.f1945b.get(fragment.mWho);
        if (fragmentManagerViewModel != null) {
            fragmentManagerViewModel.onCleared();
            this.f1945b.remove(fragment.mWho);
        }
        ocl0 ocl0Var = this.f1946c.get(fragment.mWho);
        if (ocl0Var != null) {
            ocl0Var.m163534a();
            this.f1946c.remove(fragment.mWho);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public Fragment m2644c(String str) {
        return this.f1944a.get(str);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public FragmentManagerViewModel m2645d(@NonNull Fragment fragment) {
        FragmentManagerViewModel fragmentManagerViewModel = this.f1945b.get(fragment.mWho);
        if (fragmentManagerViewModel != null) {
            return fragmentManagerViewModel;
        }
        FragmentManagerViewModel fragmentManagerViewModel2 = new FragmentManagerViewModel(this.f1947d);
        this.f1945b.put(fragment.mWho, fragmentManagerViewModel2);
        return fragmentManagerViewModel2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FragmentManagerViewModel.class == obj.getClass()) {
            FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
            if (this.f1944a.equals(fragmentManagerViewModel.f1944a) && this.f1945b.equals(fragmentManagerViewModel.f1945b) && this.f1946c.equals(fragmentManagerViewModel.f1946c)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public Collection<Fragment> m2646f() {
        return new ArrayList(this.f1944a.values());
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public ocl0 m2647g(@NonNull Fragment fragment) {
        ocl0 ocl0Var = this.f1946c.get(fragment.mWho);
        if (ocl0Var != null) {
            return ocl0Var;
        }
        ocl0 ocl0Var2 = new ocl0();
        this.f1946c.put(fragment.mWho, ocl0Var2);
        return ocl0Var2;
    }

    /* JADX INFO: renamed from: h */
    public boolean m2648h() {
        return this.f1948e;
    }

    public int hashCode() {
        return (((this.f1944a.hashCode() * 31) + this.f1945b.hashCode()) * 31) + this.f1946c.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public void m2649i(@NonNull Fragment fragment) {
        if (this.f1950g) {
            FragmentManager.m2480G0(2);
        } else {
            if (this.f1944a.remove(fragment.mWho) == null || !FragmentManager.m2480G0(2)) {
                return;
            }
            fragment.toString();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m2650j(boolean z) {
        this.f1950g = z;
    }

    /* JADX INFO: renamed from: k */
    public boolean m2651k(@NonNull Fragment fragment) {
        if (this.f1944a.containsKey(fragment.mWho)) {
            return this.f1947d ? this.f1948e : !this.f1949f;
        }
        return true;
    }

    @Override // p149l.jcl0
    public void onCleared() {
        if (FragmentManager.m2480G0(3)) {
            toString();
        }
        this.f1948e = true;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f1944a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1945b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1946c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
