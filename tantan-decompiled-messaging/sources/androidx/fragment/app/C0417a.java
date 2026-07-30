package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import p149l.bub;
import p149l.kg3;
import p149l.pxv;
import p149l.qkq0;
import p149l.qtc0;
import p149l.xb2;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0417a extends AbstractC0427k implements FragmentManager.InterfaceC0402n {

    /* JADX INFO: renamed from: t */
    public final FragmentManager f1995t;

    /* JADX INFO: renamed from: u */
    public boolean f1996u;

    /* JADX INFO: renamed from: v */
    public int f1997v;

    public C0417a(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager.m2583r0(), fragmentManager.m2592u0() != null ? fragmentManager.m2592u0().m196786f().getClassLoader() : null);
        this.f1997v = -1;
        this.f1995t = fragmentManager;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m2693J(AbstractC0427k.a aVar) {
        Fragment fragment = aVar.f2102b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public int m2694A(boolean z) {
        if (this.f1996u) {
            qkq0.m175383a("commit already called");
            return 0;
        }
        if (FragmentManager.m2480G0(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new pxv("FragmentManager"));
            m2695B("  ", printWriter);
            printWriter.close();
        }
        this.f1996u = true;
        if (this.f2090i) {
            this.f1997v = this.f1995t.m2559j();
        } else {
            this.f1997v = -1;
        }
        this.f1995t.m2532Y(this, z);
        return this.f1997v;
    }

    /* JADX INFO: renamed from: B */
    public void m2695B(String str, PrintWriter printWriter) {
        m2696C(str, printWriter, true);
    }

    /* JADX INFO: renamed from: C */
    public void m2696C(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2092k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1997v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1996u);
            if (this.f2089h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2089h));
            }
            if (this.f2085d != 0 || this.f2086e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2085d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2086e));
            }
            if (this.f2087f != 0 || this.f2088g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2087f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2088g));
            }
            if (this.f2093l != 0 || this.f2094m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2093l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2094m);
            }
            if (this.f2095n != 0 || this.f2096o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2095n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2096o);
            }
        }
        if (this.f2084c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2084c.size();
        for (int i = 0; i < size; i++) {
            AbstractC0427k.a aVar = this.f2084c.get(i);
            switch (aVar.f2101a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f2101a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            printWriter.println(aVar.f2102b);
            if (z) {
                if (aVar.f2103c != 0 || aVar.f2104d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2103c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2104d));
                }
                if (aVar.f2105e != 0 || aVar.f2106f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2105e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2106f));
                }
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m2697D() {
        int size = this.f2084c.size();
        for (int i = 0; i < size; i++) {
            AbstractC0427k.a aVar = this.f2084c.get(i);
            Fragment fragment = aVar.f2102b;
            if (fragment != null) {
                fragment.setNextTransition(this.f2089h);
                fragment.setSharedElementNames(this.f2097p, this.f2098q);
            }
            switch (aVar.f2101a) {
                case 1:
                    fragment.setNextAnim(aVar.f2103c);
                    this.f1995t.m2578p1(fragment, false);
                    this.f1995t.m2550g(fragment);
                    break;
                case 2:
                default:
                    bub.m103905a("Unknown cmd: ", aVar.f2101a);
                    return;
                case 3:
                    fragment.setNextAnim(aVar.f2104d);
                    this.f1995t.m2552g1(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f2104d);
                    this.f1995t.m2492D0(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f2103c);
                    this.f1995t.m2578p1(fragment, false);
                    this.f1995t.m2593u1(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f2104d);
                    this.f1995t.m2600x(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f2103c);
                    this.f1995t.m2578p1(fragment, false);
                    this.f1995t.m2565l(fragment);
                    break;
                case 8:
                    this.f1995t.m2587s1(fragment);
                    break;
                case 9:
                    this.f1995t.m2587s1(null);
                    break;
                case 10:
                    this.f1995t.m2584r1(fragment, aVar.f2108h);
                    break;
            }
            if (!this.f2099r && aVar.f2101a != 1 && fragment != null && !FragmentManager.f1881P) {
                this.f1995t.m2517Q0(fragment);
            }
        }
        if (this.f2099r || FragmentManager.f1881P) {
            return;
        }
        FragmentManager fragmentManager = this.f1995t;
        fragmentManager.m2519R0(fragmentManager.f1912q, true);
    }

    /* JADX INFO: renamed from: E */
    public void m2698E(boolean z) {
        for (int size = this.f2084c.size() - 1; size >= 0; size--) {
            AbstractC0427k.a aVar = this.f2084c.get(size);
            Fragment fragment = aVar.f2102b;
            if (fragment != null) {
                fragment.setNextTransition(FragmentManager.m2485l1(this.f2089h));
                fragment.setSharedElementNames(this.f2098q, this.f2097p);
            }
            switch (aVar.f2101a) {
                case 1:
                    fragment.setNextAnim(aVar.f2106f);
                    this.f1995t.m2578p1(fragment, true);
                    this.f1995t.m2552g1(fragment);
                    break;
                case 2:
                default:
                    bub.m103905a("Unknown cmd: ", aVar.f2101a);
                    return;
                case 3:
                    fragment.setNextAnim(aVar.f2105e);
                    this.f1995t.m2550g(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f2105e);
                    this.f1995t.m2593u1(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f2106f);
                    this.f1995t.m2578p1(fragment, true);
                    this.f1995t.m2492D0(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f2105e);
                    this.f1995t.m2565l(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f2106f);
                    this.f1995t.m2578p1(fragment, true);
                    this.f1995t.m2600x(fragment);
                    break;
                case 8:
                    this.f1995t.m2587s1(null);
                    break;
                case 9:
                    this.f1995t.m2587s1(fragment);
                    break;
                case 10:
                    this.f1995t.m2584r1(fragment, aVar.f2107g);
                    break;
            }
            if (!this.f2099r && aVar.f2101a != 3 && fragment != null && !FragmentManager.f1881P) {
                this.f1995t.m2517Q0(fragment);
            }
        }
        if (this.f2099r || !z || FragmentManager.f1881P) {
            return;
        }
        FragmentManager fragmentManager = this.f1995t;
        fragmentManager.m2519R0(fragmentManager.f1912q, true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX INFO: renamed from: F */
    public Fragment m2699F(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f2084c.size()) {
            AbstractC0427k.a aVar = this.f2084c.get(i);
            int i2 = aVar.f2101a;
            if (i2 == 1) {
                arrayList.add(aVar.f2102b);
            } else if (i2 == 2) {
                Fragment fragment3 = aVar.f2102b;
                int i3 = fragment3.mContainerId;
                boolean z = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = arrayList.get(size);
                    if (fragment4.mContainerId == i3) {
                        if (fragment4 == fragment3) {
                            z = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f2084c.add(i, new AbstractC0427k.a(9, fragment4));
                                i++;
                                fragment2 = null;
                            }
                            AbstractC0427k.a aVar2 = new AbstractC0427k.a(3, fragment4);
                            aVar2.f2103c = aVar.f2103c;
                            aVar2.f2105e = aVar.f2105e;
                            aVar2.f2104d = aVar.f2104d;
                            aVar2.f2106f = aVar.f2106f;
                            this.f2084c.add(i, aVar2);
                            arrayList.remove(fragment4);
                            i++;
                        }
                    }
                }
                if (z) {
                    this.f2084c.remove(i);
                    i--;
                } else {
                    aVar.f2101a = 1;
                    arrayList.add(fragment3);
                }
            } else if (i2 == 3 || i2 == 6) {
                arrayList.remove(aVar.f2102b);
                Fragment fragment5 = aVar.f2102b;
                if (fragment5 == fragment2) {
                    this.f2084c.add(i, new AbstractC0427k.a(9, fragment5));
                    i++;
                    fragment2 = null;
                }
            } else if (i2 == 7) {
                arrayList.add(aVar.f2102b);
            } else if (i2 == 8) {
                this.f2084c.add(i, new AbstractC0427k.a(9, fragment2));
                i++;
                fragment2 = aVar.f2102b;
            }
            i++;
        }
        return fragment2;
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    public String m2700G() {
        return this.f2092k;
    }

    /* JADX INFO: renamed from: H */
    public boolean m2701H(int i) {
        int size = this.f2084c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f2084c.get(i2).f2102b;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public boolean m2702I(ArrayList<C0417a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2084c.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f2084c.get(i4).f2102b;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0417a c0417a = arrayList.get(i6);
                    int size2 = c0417a.f2084c.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = c0417a.f2084c.get(i7).f2102b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public boolean m2703K() {
        for (int i = 0; i < this.f2084c.size(); i++) {
            if (m2693J(this.f2084c.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public void m2704L() {
        if (this.f2100s != null) {
            for (int i = 0; i < this.f2100s.size(); i++) {
                this.f2100s.get(i).run();
            }
            this.f2100s = null;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m2705M(Fragment.InterfaceC0383k interfaceC0383k) {
        for (int i = 0; i < this.f2084c.size(); i++) {
            AbstractC0427k.a aVar = this.f2084c.get(i);
            if (m2693J(aVar)) {
                aVar.f2102b.setOnStartEnterTransitionListener(interfaceC0383k);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX INFO: renamed from: N */
    public Fragment m2706N(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2084c.size() - 1; size >= 0; size--) {
            AbstractC0427k.a aVar = this.f2084c.get(size);
            int i = aVar.f2101a;
            if (i == 1) {
                arrayList.remove(aVar.f2102b);
            } else if (i != 3) {
                switch (i) {
                    case 6:
                        arrayList.add(aVar.f2102b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f2102b);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = aVar.f2102b;
                        break;
                    case 10:
                        aVar.f2108h = aVar.f2107g;
                        break;
                }
            } else {
                arrayList.add(aVar.f2102b);
            }
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC0402n
    /* JADX INFO: renamed from: a */
    public boolean mo2635a(@NonNull ArrayList<C0417a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m2480G0(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2090i) {
            return true;
        }
        this.f1995t.m2544e(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0427k
    /* JADX INFO: renamed from: i */
    public int mo2707i() {
        return m2694A(false);
    }

    @Override // androidx.fragment.app.AbstractC0427k
    /* JADX INFO: renamed from: j */
    public int mo2708j() {
        return m2694A(true);
    }

    @Override // androidx.fragment.app.AbstractC0427k
    /* JADX INFO: renamed from: k */
    public void mo2709k() {
        m2810n();
        this.f1995t.m2538b0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC0427k
    /* JADX INFO: renamed from: l */
    public void mo2710l() {
        m2810n();
        this.f1995t.m2538b0(this, true);
    }

    @Override // androidx.fragment.app.AbstractC0427k
    @NonNull
    /* JADX INFO: renamed from: m */
    public AbstractC0427k mo2711m(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f1995t) {
            return super.mo2711m(fragment);
        }
        xb2.m207687a("Cannot detach Fragment attached to a different FragmentManager. Fragment ", fragment);
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0427k
    /* JADX INFO: renamed from: o */
    public void mo2712o(int i, Fragment fragment, @Nullable String str, int i2) {
        super.mo2712o(i, fragment, str, i2);
        fragment.mFragmentManager = this.f1995t;
    }

    @Override // androidx.fragment.app.AbstractC0427k
    @NonNull
    /* JADX INFO: renamed from: p */
    public AbstractC0427k mo2713p(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f1995t) {
            return super.mo2713p(fragment);
        }
        xb2.m207687a("Cannot hide Fragment attached to a different FragmentManager. Fragment ", fragment);
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0427k
    /* JADX INFO: renamed from: q */
    public boolean mo2714q() {
        return this.f2084c.isEmpty();
    }

    @Override // androidx.fragment.app.AbstractC0427k
    @NonNull
    /* JADX INFO: renamed from: r */
    public AbstractC0427k mo2715r(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f1995t) {
            return super.mo2715r(fragment);
        }
        xb2.m207687a("Cannot remove Fragment attached to a different FragmentManager. Fragment ", fragment);
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1997v >= 0) {
            sb.append(" #");
            sb.append(this.f1997v);
        }
        if (this.f2092k != null) {
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(this.f2092k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.AbstractC0427k
    @NonNull
    /* JADX INFO: renamed from: w */
    public AbstractC0427k mo2716w(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.mFragmentManager != this.f1995t) {
            kg3.m145878a("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ", this.f1995t);
            return null;
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            qtc0.m176411a("Cannot set maximum Lifecycle to ", state, " after the Fragment has been created");
            return null;
        }
        if (state != Lifecycle.State.DESTROYED) {
            return super.mo2716w(fragment, state);
        }
        qtc0.m176411a("Cannot set maximum Lifecycle to ", state, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0427k
    @NonNull
    /* JADX INFO: renamed from: y */
    public AbstractC0427k mo2717y(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f1995t) {
            return super.mo2717y(fragment);
        }
        xb2.m207687a("Cannot show Fragment attached to a different FragmentManager. Fragment ", fragment);
        return null;
    }

    /* JADX INFO: renamed from: z */
    public void m2718z(int i) {
        if (this.f2090i) {
            if (FragmentManager.m2480G0(2)) {
                toString();
            }
            int size = this.f2084c.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0427k.a aVar = this.f2084c.get(i2);
                Fragment fragment = aVar.f2102b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.m2480G0(2)) {
                        Objects.toString(aVar.f2102b);
                        int i3 = aVar.f2102b.mBackStackNesting;
                    }
                }
            }
        }
    }
}
