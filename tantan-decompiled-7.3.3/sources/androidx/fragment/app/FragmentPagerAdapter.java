package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import p153l.cf60;
import p153l.wmw;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FragmentPagerAdapter extends cf60 {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private AbstractC0428k mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final FragmentManager mFragmentManager;

    public FragmentPagerAdapter(@NonNull FragmentManager fragmentManager, int i) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i;
    }

    private static String makeFragmentName(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // p153l.cf60
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m2568m();
        }
        this.mCurTransaction.mo2712m(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // p153l.cf60
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        AbstractC0428k abstractC0428k = this.mCurTransaction;
        if (abstractC0428k != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    abstractC0428k.mo2711l();
                    this.mExecutingFinishUpdate = false;
                } catch (Throwable th) {
                    this.mExecutingFinishUpdate = false;
                    throw th;
                }
            }
            this.mCurTransaction = null;
        }
    }

    @NonNull
    public abstract Fragment getItem(int i);

    public long getItemId(int i) {
        return i;
    }

    @Override // p153l.cf60
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m2568m();
        }
        long itemId = getItemId(i);
        Fragment fragmentM2558i0 = this.mFragmentManager.m2558i0(makeFragmentName(viewGroup.getId(), itemId));
        if (fragmentM2558i0 != null) {
            this.mCurTransaction.m2810h(fragmentM2558i0);
        } else {
            fragmentM2558i0 = getItem(i);
            this.mCurTransaction.m2805c(viewGroup.getId(), fragmentM2558i0, makeFragmentName(viewGroup.getId(), itemId));
        }
        if (fragmentM2558i0 != this.mCurrentPrimaryItem) {
            fragmentM2558i0.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.mo2717w(fragmentM2558i0, Lifecycle.State.STARTED);
                return fragmentM2558i0;
            }
            fragmentM2558i0.setUserVisibleHint(false);
        }
        return fragmentM2558i0;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // p153l.cf60
    public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }

    @Override // p153l.cf60
    @Nullable
    public Parcelable saveState() {
        return null;
    }

    @Override // p153l.cf60
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.m2568m();
                    }
                    this.mCurTransaction.mo2717w(this.mCurrentPrimaryItem, Lifecycle.State.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.m2568m();
                }
                this.mCurTransaction.mo2717w(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // p153l.cf60
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        wmw.m207134a("ViewPager with adapter ", this, " requires a view id");
    }

    @Deprecated
    public FragmentPagerAdapter(@NonNull FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }
}
