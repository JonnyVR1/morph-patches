package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p149l.rkq0;
import p149l.xjw;

/* JADX INFO: renamed from: androidx.fragment.app.j */
/* JADX INFO: loaded from: classes.dex */
public class C0426j {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Fragment> f2079a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final HashMap<String, C0424h> f2080b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public FragmentManagerViewModel f2081c;

    /* JADX INFO: renamed from: a */
    public void m2779a(@NonNull Fragment fragment) {
        if (this.f2079a.contains(fragment)) {
            rkq0.m179764a("Fragment already added: ", fragment);
            return;
        }
        synchronized (this.f2079a) {
            this.f2079a.add(fragment);
        }
        fragment.mAdded = true;
    }

    /* JADX INFO: renamed from: b */
    public void m2780b() {
        this.f2080b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: renamed from: c */
    public boolean m2781c(@NonNull String str) {
        return this.f2080b.get(str) != null;
    }

    /* JADX INFO: renamed from: d */
    public void m2782d(int i) {
        for (C0424h c0424h : this.f2080b.values()) {
            if (c0424h != null) {
                c0424h.m2776u(i);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2783e(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2080b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C0424h c0424h : this.f2080b.values()) {
                printWriter.print(str);
                if (c0424h != null) {
                    Fragment fragmentM2766k = c0424h.m2766k();
                    printWriter.println(fragmentM2766k);
                    fragmentM2766k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2079a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = this.f2079a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public Fragment m2784f(@NonNull String str) {
        C0424h c0424h = this.f2080b.get(str);
        if (c0424h != null) {
            return c0424h.m2766k();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public Fragment m2785g(@IdRes int i) {
        for (int size = this.f2079a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2079a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C0424h c0424h : this.f2080b.values()) {
            if (c0424h != null) {
                Fragment fragmentM2766k = c0424h.m2766k();
                if (fragmentM2766k.mFragmentId == i) {
                    return fragmentM2766k;
                }
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public Fragment m2786h(@Nullable String str) {
        if (str != null) {
            for (int size = this.f2079a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2079a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0424h c0424h : this.f2080b.values()) {
            if (c0424h != null) {
                Fragment fragmentM2766k = c0424h.m2766k();
                if (str.equals(fragmentM2766k.mTag)) {
                    return fragmentM2766k;
                }
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public Fragment m2787i(@NonNull String str) {
        Fragment fragmentFindFragmentByWho;
        for (C0424h c0424h : this.f2080b.values()) {
            if (c0424h != null && (fragmentFindFragmentByWho = c0424h.m2766k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public int m2788j(@NonNull Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f2079a.indexOf(fragment);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f2079a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f2079a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f2079a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public List<C0424h> m2789k() {
        ArrayList arrayList = new ArrayList();
        for (C0424h c0424h : this.f2080b.values()) {
            if (c0424h != null) {
                arrayList.add(c0424h);
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public List<Fragment> m2790l() {
        ArrayList arrayList = new ArrayList();
        for (C0424h c0424h : this.f2080b.values()) {
            if (c0424h != null) {
                arrayList.add(c0424h.m2766k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public C0424h m2791m(@NonNull String str) {
        return this.f2080b.get(str);
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public List<Fragment> m2792n() {
        ArrayList arrayList;
        if (this.f2079a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f2079a) {
            arrayList = new ArrayList(this.f2079a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public FragmentManagerViewModel m2793o() {
        return this.f2081c;
    }

    /* JADX INFO: renamed from: p */
    public void m2794p(@NonNull C0424h c0424h) {
        Fragment fragmentM2766k = c0424h.m2766k();
        if (m2781c(fragmentM2766k.mWho)) {
            return;
        }
        this.f2080b.put(fragmentM2766k.mWho, c0424h);
        if (fragmentM2766k.mRetainInstanceChangedWhileDetached) {
            boolean z = fragmentM2766k.mRetainInstance;
            FragmentManagerViewModel fragmentManagerViewModel = this.f2081c;
            if (z) {
                fragmentManagerViewModel.m2642a(fragmentM2766k);
            } else {
                fragmentManagerViewModel.m2649i(fragmentM2766k);
            }
            fragmentM2766k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.m2480G0(2)) {
            fragmentM2766k.toString();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2795q(@NonNull C0424h c0424h) {
        Fragment fragmentM2766k = c0424h.m2766k();
        if (fragmentM2766k.mRetainInstance) {
            this.f2081c.m2649i(fragmentM2766k);
        }
        if (this.f2080b.put(fragmentM2766k.mWho, null) != null && FragmentManager.m2480G0(2)) {
            fragmentM2766k.toString();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2796r() {
        Iterator<Fragment> it = this.f2079a.iterator();
        while (it.hasNext()) {
            C0424h c0424h = this.f2080b.get(it.next().mWho);
            if (c0424h != null) {
                c0424h.m2768m();
            }
        }
        for (C0424h c0424h2 : this.f2080b.values()) {
            if (c0424h2 != null) {
                c0424h2.m2768m();
                Fragment fragmentM2766k = c0424h2.m2766k();
                if (fragmentM2766k.mRemoving && !fragmentM2766k.isInBackStack()) {
                    m2795q(c0424h2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m2797s(@NonNull Fragment fragment) {
        synchronized (this.f2079a) {
            this.f2079a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: renamed from: t */
    public void m2798t() {
        this.f2080b.clear();
    }

    /* JADX INFO: renamed from: u */
    public void m2799u(@Nullable List<String> list) {
        this.f2079a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentM2784f = m2784f(str);
                if (fragmentM2784f == null) {
                    xjw.m209754a("No instantiated fragment for (", str, ")");
                    return;
                } else {
                    if (FragmentManager.m2480G0(2)) {
                        fragmentM2784f.toString();
                    }
                    m2779a(fragmentM2784f);
                }
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public ArrayList<FragmentState> m2800v() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f2080b.size());
        for (C0424h c0424h : this.f2080b.values()) {
            if (c0424h != null) {
                Fragment fragmentM2766k = c0424h.m2766k();
                FragmentState fragmentStateM2774s = c0424h.m2774s();
                arrayList.add(fragmentStateM2774s);
                if (FragmentManager.m2480G0(2)) {
                    Objects.toString(fragmentM2766k);
                    Objects.toString(fragmentStateM2774s.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public ArrayList<String> m2801w() {
        synchronized (this.f2079a) {
            try {
                if (this.f2079a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f2079a.size());
                for (Fragment fragment : this.f2079a) {
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.m2480G0(2)) {
                        fragment.toString();
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m2802x(@NonNull FragmentManagerViewModel fragmentManagerViewModel) {
        this.f2081c = fragmentManagerViewModel;
    }
}
