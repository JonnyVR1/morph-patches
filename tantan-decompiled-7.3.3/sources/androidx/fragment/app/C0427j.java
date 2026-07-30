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
import p153l.wmw;
import p153l.xtq0;

/* JADX INFO: renamed from: androidx.fragment.app.j */
/* JADX INFO: loaded from: classes.dex */
public class C0427j {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Fragment> f2079a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final HashMap<String, C0425h> f2080b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public FragmentManagerViewModel f2081c;

    /* JADX INFO: renamed from: a */
    public void m2780a(@NonNull Fragment fragment) {
        if (this.f2079a.contains(fragment)) {
            xtq0.m213103a("Fragment already added: ", fragment);
            return;
        }
        synchronized (this.f2079a) {
            this.f2079a.add(fragment);
        }
        fragment.mAdded = true;
    }

    /* JADX INFO: renamed from: b */
    public void m2781b() {
        this.f2080b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: renamed from: c */
    public boolean m2782c(@NonNull String str) {
        return this.f2080b.get(str) != null;
    }

    /* JADX INFO: renamed from: d */
    public void m2783d(int i) {
        for (C0425h c0425h : this.f2080b.values()) {
            if (c0425h != null) {
                c0425h.m2777u(i);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2784e(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2080b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C0425h c0425h : this.f2080b.values()) {
                printWriter.print(str);
                if (c0425h != null) {
                    Fragment fragmentM2767k = c0425h.m2767k();
                    printWriter.println(fragmentM2767k);
                    fragmentM2767k.dump(str2, fileDescriptor, printWriter, strArr);
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
    public Fragment m2785f(@NonNull String str) {
        C0425h c0425h = this.f2080b.get(str);
        if (c0425h != null) {
            return c0425h.m2767k();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public Fragment m2786g(@IdRes int i) {
        for (int size = this.f2079a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2079a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C0425h c0425h : this.f2080b.values()) {
            if (c0425h != null) {
                Fragment fragmentM2767k = c0425h.m2767k();
                if (fragmentM2767k.mFragmentId == i) {
                    return fragmentM2767k;
                }
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public Fragment m2787h(@Nullable String str) {
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
        for (C0425h c0425h : this.f2080b.values()) {
            if (c0425h != null) {
                Fragment fragmentM2767k = c0425h.m2767k();
                if (str.equals(fragmentM2767k.mTag)) {
                    return fragmentM2767k;
                }
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public Fragment m2788i(@NonNull String str) {
        Fragment fragmentFindFragmentByWho;
        for (C0425h c0425h : this.f2080b.values()) {
            if (c0425h != null && (fragmentFindFragmentByWho = c0425h.m2767k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public int m2789j(@NonNull Fragment fragment) {
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
    public List<C0425h> m2790k() {
        ArrayList arrayList = new ArrayList();
        for (C0425h c0425h : this.f2080b.values()) {
            if (c0425h != null) {
                arrayList.add(c0425h);
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public List<Fragment> m2791l() {
        ArrayList arrayList = new ArrayList();
        for (C0425h c0425h : this.f2080b.values()) {
            if (c0425h != null) {
                arrayList.add(c0425h.m2767k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public C0425h m2792m(@NonNull String str) {
        return this.f2080b.get(str);
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public List<Fragment> m2793n() {
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
    public FragmentManagerViewModel m2794o() {
        return this.f2081c;
    }

    /* JADX INFO: renamed from: p */
    public void m2795p(@NonNull C0425h c0425h) {
        Fragment fragmentM2767k = c0425h.m2767k();
        if (m2782c(fragmentM2767k.mWho)) {
            return;
        }
        this.f2080b.put(fragmentM2767k.mWho, c0425h);
        if (fragmentM2767k.mRetainInstanceChangedWhileDetached) {
            boolean z = fragmentM2767k.mRetainInstance;
            FragmentManagerViewModel fragmentManagerViewModel = this.f2081c;
            if (z) {
                fragmentManagerViewModel.m2643a(fragmentM2767k);
            } else {
                fragmentManagerViewModel.m2650i(fragmentM2767k);
            }
            fragmentM2767k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.m2481G0(2)) {
            fragmentM2767k.toString();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2796q(@NonNull C0425h c0425h) {
        Fragment fragmentM2767k = c0425h.m2767k();
        if (fragmentM2767k.mRetainInstance) {
            this.f2081c.m2650i(fragmentM2767k);
        }
        if (this.f2080b.put(fragmentM2767k.mWho, null) != null && FragmentManager.m2481G0(2)) {
            fragmentM2767k.toString();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2797r() {
        Iterator<Fragment> it = this.f2079a.iterator();
        while (it.hasNext()) {
            C0425h c0425h = this.f2080b.get(it.next().mWho);
            if (c0425h != null) {
                c0425h.m2769m();
            }
        }
        for (C0425h c0425h2 : this.f2080b.values()) {
            if (c0425h2 != null) {
                c0425h2.m2769m();
                Fragment fragmentM2767k = c0425h2.m2767k();
                if (fragmentM2767k.mRemoving && !fragmentM2767k.isInBackStack()) {
                    m2796q(c0425h2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m2798s(@NonNull Fragment fragment) {
        synchronized (this.f2079a) {
            this.f2079a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: renamed from: t */
    public void m2799t() {
        this.f2080b.clear();
    }

    /* JADX INFO: renamed from: u */
    public void m2800u(@Nullable List<String> list) {
        this.f2079a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentM2785f = m2785f(str);
                if (fragmentM2785f == null) {
                    wmw.m207134a("No instantiated fragment for (", str, ")");
                    return;
                } else {
                    if (FragmentManager.m2481G0(2)) {
                        fragmentM2785f.toString();
                    }
                    m2780a(fragmentM2785f);
                }
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public ArrayList<FragmentState> m2801v() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f2080b.size());
        for (C0425h c0425h : this.f2080b.values()) {
            if (c0425h != null) {
                Fragment fragmentM2767k = c0425h.m2767k();
                FragmentState fragmentStateM2775s = c0425h.m2775s();
                arrayList.add(fragmentStateM2775s);
                if (FragmentManager.m2481G0(2)) {
                    Objects.toString(fragmentM2767k);
                    Objects.toString(fragmentStateM2775s.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public ArrayList<String> m2802w() {
        synchronized (this.f2079a) {
            try {
                if (this.f2079a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f2079a.size());
                for (Fragment fragment : this.f2079a) {
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.m2481G0(2)) {
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
    public void m2803x(@NonNull FragmentManagerViewModel fragmentManagerViewModel) {
        this.f2081c = fragmentManagerViewModel;
    }
}
