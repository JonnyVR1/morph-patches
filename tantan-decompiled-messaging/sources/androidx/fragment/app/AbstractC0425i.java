package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import p149l.w660;
import p149l.xjw;

/* JADX INFO: renamed from: androidx.fragment.app.i */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC0425i extends w660 {

    /* JADX INFO: renamed from: a */
    public final FragmentManager f2072a;

    /* JADX INFO: renamed from: b */
    public final int f2073b;

    /* JADX INFO: renamed from: c */
    public AbstractC0427k f2074c;

    /* JADX INFO: renamed from: d */
    public ArrayList<Fragment.SavedState> f2075d;

    /* JADX INFO: renamed from: e */
    public ArrayList<Fragment> f2076e;

    /* JADX INFO: renamed from: f */
    public Fragment f2077f;

    /* JADX INFO: renamed from: g */
    public boolean f2078g;

    public AbstractC0425i(@NonNull FragmentManager fragmentManager, int i) {
        this.f2074c = null;
        this.f2075d = new ArrayList<>();
        this.f2076e = new ArrayList<>();
        this.f2077f = null;
        this.f2072a = fragmentManager;
        this.f2073b = i;
    }

    @Override // p149l.w660
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        ArrayList<Fragment.SavedState> arrayList;
        Fragment fragment = (Fragment) obj;
        if (this.f2074c == null) {
            this.f2074c = this.f2072a.m2567m();
        }
        while (true) {
            int size = this.f2075d.size();
            arrayList = this.f2075d;
            if (size > i) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i, fragment.isAdded() ? this.f2072a.m2572n1(fragment) : null);
        this.f2076e.set(i, null);
        this.f2074c.mo2715r(fragment);
        if (fragment.equals(this.f2077f)) {
            this.f2077f = null;
        }
    }

    @Override // p149l.w660
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        AbstractC0427k abstractC0427k = this.f2074c;
        if (abstractC0427k != null) {
            if (!this.f2078g) {
                try {
                    this.f2078g = true;
                    abstractC0427k.mo2710l();
                    this.f2078g = false;
                } catch (Throwable th) {
                    this.f2078g = false;
                    throw th;
                }
            }
            this.f2074c = null;
        }
    }

    @NonNull
    public abstract Fragment getItem(int i);

    @Override // p149l.w660
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f2076e.size() > i && (fragment = this.f2076e.get(i)) != null) {
            return fragment;
        }
        if (this.f2074c == null) {
            this.f2074c = this.f2072a.m2567m();
        }
        Fragment item = getItem(i);
        if (this.f2075d.size() > i && (savedState = this.f2075d.get(i)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.f2076e.size() <= i) {
            this.f2076e.add(null);
        }
        item.setMenuVisibility(false);
        if (this.f2073b == 0) {
            item.setUserVisibleHint(false);
        }
        this.f2076e.set(i, item);
        this.f2074c.m2803b(viewGroup.getId(), item);
        if (this.f2073b == 1) {
            this.f2074c.mo2716w(item, Lifecycle.State.STARTED);
        }
        return item;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // p149l.w660
    public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f2075d.clear();
            this.f2076e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f2075d.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i = Integer.parseInt(str.substring(1));
                    Fragment fragmentM2577p0 = this.f2072a.m2577p0(bundle, str);
                    if (fragmentM2577p0 != null) {
                        while (this.f2076e.size() <= i) {
                            this.f2076e.add(null);
                        }
                        fragmentM2577p0.setMenuVisibility(false);
                        this.f2076e.set(i, fragmentM2577p0);
                    }
                }
            }
        }
    }

    @Override // p149l.w660
    @Nullable
    public Parcelable saveState() {
        Bundle bundle;
        if (this.f2075d.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f2075d.size()];
            this.f2075d.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f2076e.size(); i++) {
            Fragment fragment = this.f2076e.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f2072a.m2543d1(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    @Override // p149l.w660
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f2077f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f2073b == 1) {
                    if (this.f2074c == null) {
                        this.f2074c = this.f2072a.m2567m();
                    }
                    this.f2074c.mo2716w(this.f2077f, Lifecycle.State.STARTED);
                } else {
                    this.f2077f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f2073b == 1) {
                if (this.f2074c == null) {
                    this.f2074c = this.f2072a.m2567m();
                }
                this.f2074c.mo2716w(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f2077f = fragment;
        }
    }

    @Override // p149l.w660
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        xjw.m209754a("ViewPager with adapter ", this, " requires a view id");
    }

    @Deprecated
    public AbstractC0425i(@NonNull FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }
}
