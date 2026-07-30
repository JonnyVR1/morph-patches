package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import p149l.w660;
import p149l.xjw;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FragmentPagerAdapter extends w660 {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private AbstractC0427k mCurTransaction;
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

    @Override // p149l.w660
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m2567m();
        }
        this.mCurTransaction.mo2711m(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // p149l.w660
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        AbstractC0427k abstractC0427k = this.mCurTransaction;
        if (abstractC0427k != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    abstractC0427k.mo2710l();
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

    @Override // p149l.w660
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m2567m();
        }
        long itemId = getItemId(i);
        Fragment fragmentM2557i0 = this.mFragmentManager.m2557i0(makeFragmentName(viewGroup.getId(), itemId));
        if (fragmentM2557i0 != null) {
            this.mCurTransaction.m2809h(fragmentM2557i0);
        } else {
            fragmentM2557i0 = getItem(i);
            this.mCurTransaction.m2804c(viewGroup.getId(), fragmentM2557i0, makeFragmentName(viewGroup.getId(), itemId));
        }
        if (fragmentM2557i0 != this.mCurrentPrimaryItem) {
            fragmentM2557i0.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.mo2716w(fragmentM2557i0, Lifecycle.State.STARTED);
                return fragmentM2557i0;
            }
            fragmentM2557i0.setUserVisibleHint(false);
        }
        return fragmentM2557i0;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // p149l.w660
    public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }

    @Override // p149l.w660
    @Nullable
    public Parcelable saveState() {
        return null;
    }

    @Override // p149l.w660
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.m2567m();
                    }
                    this.mCurTransaction.mo2716w(this.mCurrentPrimaryItem, Lifecycle.State.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.m2567m();
                }
                this.mCurTransaction.mo2716w(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
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
    public FragmentPagerAdapter(@NonNull FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }
}
