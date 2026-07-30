package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: a */
    public final ArrayList<C0409a> f1951a;

    /* JADX INFO: renamed from: b */
    public Context f1952b;

    /* JADX INFO: renamed from: c */
    public FragmentManager f1953c;

    /* JADX INFO: renamed from: d */
    public int f1954d;

    /* JADX INFO: renamed from: e */
    public TabHost.OnTabChangeListener f1955e;

    /* JADX INFO: renamed from: f */
    public C0409a f1956f;

    /* JADX INFO: renamed from: g */
    public boolean f1957g;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentTabHost$a */
    public static final class C0409a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final String f1958a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final Class<?> f1959b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Bundle f1960c;

        /* JADX INFO: renamed from: d */
        public Fragment f1961d;
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context) {
        super(context, null);
        this.f1951a = new ArrayList<>();
        m2656c(context, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final AbstractC0427k m2654a(@Nullable String str, @Nullable AbstractC0427k abstractC0427k) {
        Fragment fragment;
        C0409a c0409aM2655b = m2655b(str);
        if (this.f1956f != c0409aM2655b) {
            if (abstractC0427k == null) {
                abstractC0427k = this.f1953c.m2567m();
            }
            C0409a c0409a = this.f1956f;
            if (c0409a != null && (fragment = c0409a.f1961d) != null) {
                abstractC0427k.mo2711m(fragment);
            }
            if (c0409aM2655b != null) {
                Fragment fragment2 = c0409aM2655b.f1961d;
                if (fragment2 == null) {
                    Fragment fragmentInstantiate = this.f1953c.m2583r0().instantiate(this.f1952b.getClassLoader(), c0409aM2655b.f1959b.getName());
                    c0409aM2655b.f1961d = fragmentInstantiate;
                    fragmentInstantiate.setArguments(c0409aM2655b.f1960c);
                    abstractC0427k.m2804c(this.f1954d, c0409aM2655b.f1961d, c0409aM2655b.f1958a);
                } else {
                    abstractC0427k.m2809h(fragment2);
                }
            }
            this.f1956f = c0409aM2655b;
        }
        return abstractC0427k;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C0409a m2655b(String str) {
        int size = this.f1951a.size();
        for (int i = 0; i < size; i++) {
            C0409a c0409a = this.f1951a.get(i);
            if (c0409a.f1958a.equals(str)) {
                return c0409a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2656c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f1954d = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f1951a.size();
        AbstractC0427k abstractC0427kM2567m = null;
        for (int i = 0; i < size; i++) {
            C0409a c0409a = this.f1951a.get(i);
            Fragment fragmentM2557i0 = this.f1953c.m2557i0(c0409a.f1958a);
            c0409a.f1961d = fragmentM2557i0;
            if (fragmentM2557i0 != null && !fragmentM2557i0.isDetached()) {
                if (c0409a.f1958a.equals(currentTabTag)) {
                    this.f1956f = c0409a;
                } else {
                    if (abstractC0427kM2567m == null) {
                        abstractC0427kM2567m = this.f1953c.m2567m();
                    }
                    abstractC0427kM2567m.mo2711m(c0409a.f1961d);
                }
            }
        }
        this.f1957g = true;
        AbstractC0427k abstractC0427kM2654a = m2654a(currentTabTag, abstractC0427kM2567m);
        if (abstractC0427kM2654a != null) {
            abstractC0427kM2654a.mo2707i();
            this.f1953c.m2545e0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1957g = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.curTab);
    }

    @Override // android.view.View
    @NonNull
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.curTab = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@Nullable String str) {
        AbstractC0427k abstractC0427kM2654a;
        if (this.f1957g && (abstractC0427kM2654a = m2654a(str, null)) != null) {
            abstractC0427kM2654a.mo2707i();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f1955e;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@Nullable TabHost.OnTabChangeListener onTabChangeListener) {
        this.f1955e = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0408a();
        String curTab;

        /* JADX INFO: renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        public class C0408a implements Parcelable.Creator<SavedState> {
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

        @NonNull
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
    public FragmentTabHost(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1951a = new ArrayList<>();
        m2656c(context, attributeSet);
    }
}
