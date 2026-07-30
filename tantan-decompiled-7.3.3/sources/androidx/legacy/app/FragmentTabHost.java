package androidx.legacy.app;

import android.R;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;
import p153l.xtq0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: a */
    public final ArrayList<C0448a> f2248a;

    /* JADX INFO: renamed from: b */
    public Context f2249b;

    /* JADX INFO: renamed from: c */
    public FragmentManager f2250c;

    /* JADX INFO: renamed from: d */
    public int f2251d;

    /* JADX INFO: renamed from: e */
    public TabHost.OnTabChangeListener f2252e;

    /* JADX INFO: renamed from: f */
    public C0448a f2253f;

    /* JADX INFO: renamed from: g */
    public boolean f2254g;

    /* JADX INFO: renamed from: androidx.legacy.app.FragmentTabHost$a */
    public static final class C0448a {

        /* JADX INFO: renamed from: a */
        public final String f2255a;

        /* JADX INFO: renamed from: b */
        public final Class<?> f2256b;

        /* JADX INFO: renamed from: c */
        public final Bundle f2257c;

        /* JADX INFO: renamed from: d */
        public Fragment f2258d;
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, null);
        this.f2248a = new ArrayList<>();
        m2955b(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final FragmentTransaction m2954a(String str, FragmentTransaction fragmentTransaction) {
        Fragment fragment;
        C0448a c0448a = null;
        for (int i = 0; i < this.f2248a.size(); i++) {
            C0448a c0448a2 = this.f2248a.get(i);
            if (c0448a2.f2255a.equals(str)) {
                c0448a = c0448a2;
            }
        }
        if (c0448a == null) {
            xtq0.m213103a("No tab known for tag ", str);
            return null;
        }
        if (this.f2253f != c0448a) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.f2250c.beginTransaction();
            }
            C0448a c0448a3 = this.f2253f;
            if (c0448a3 != null && (fragment = c0448a3.f2258d) != null) {
                fragmentTransaction.detach(fragment);
            }
            Fragment fragment2 = c0448a.f2258d;
            if (fragment2 == null) {
                Fragment fragmentInstantiate = Fragment.instantiate(this.f2249b, c0448a.f2256b.getName(), c0448a.f2257c);
                c0448a.f2258d = fragmentInstantiate;
                fragmentTransaction.add(this.f2251d, fragmentInstantiate, c0448a.f2255a);
            } else {
                fragmentTransaction.attach(fragment2);
            }
            this.f2253f = c0448a;
        }
        return fragmentTransaction;
    }

    /* JADX INFO: renamed from: b */
    public final void m2955b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f2251d = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        FragmentTransaction fragmentTransactionBeginTransaction = null;
        for (int i = 0; i < this.f2248a.size(); i++) {
            C0448a c0448a = this.f2248a.get(i);
            Fragment fragmentFindFragmentByTag = this.f2250c.findFragmentByTag(c0448a.f2255a);
            c0448a.f2258d = fragmentFindFragmentByTag;
            if (fragmentFindFragmentByTag != null && !fragmentFindFragmentByTag.isDetached()) {
                if (c0448a.f2255a.equals(currentTabTag)) {
                    this.f2253f = c0448a;
                } else {
                    if (fragmentTransactionBeginTransaction == null) {
                        fragmentTransactionBeginTransaction = this.f2250c.beginTransaction();
                    }
                    fragmentTransactionBeginTransaction.detach(c0448a.f2258d);
                }
            }
        }
        this.f2254g = true;
        FragmentTransaction fragmentTransactionM2954a = m2954a(currentTabTag, fragmentTransactionBeginTransaction);
        if (fragmentTransactionM2954a != null) {
            fragmentTransactionM2954a.commit();
            this.f2250c.executePendingTransactions();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2254g = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.curTab);
    }

    @Override // android.view.View
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.curTab = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(String str) {
        FragmentTransaction fragmentTransactionM2954a;
        if (this.f2254g && (fragmentTransactionM2954a = m2954a(str, null)) != null) {
            fragmentTransactionM2954a.commit();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f2252e;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f2252e = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0447a();
        String curTab;

        /* JADX INFO: renamed from: androidx.legacy.app.FragmentTabHost$SavedState$a */
        public static class C0447a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.curTab = parcel.readString();
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.curTab + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.curTab);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2248a = new ArrayList<>();
        m2955b(context, attributeSet);
    }
}
