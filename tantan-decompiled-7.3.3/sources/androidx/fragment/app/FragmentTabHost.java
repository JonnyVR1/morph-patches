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
    public final ArrayList<C0410a> f1951a;

    /* JADX INFO: renamed from: b */
    public Context f1952b;

    /* JADX INFO: renamed from: c */
    public FragmentManager f1953c;

    /* JADX INFO: renamed from: d */
    public int f1954d;

    /* JADX INFO: renamed from: e */
    public TabHost.OnTabChangeListener f1955e;

    /* JADX INFO: renamed from: f */
    public C0410a f1956f;

    /* JADX INFO: renamed from: g */
    public boolean f1957g;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentTabHost$a */
    public static final class C0410a {

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
        m2657c(context, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final AbstractC0428k m2655a(@Nullable String str, @Nullable AbstractC0428k abstractC0428k) {
        Fragment fragment;
        C0410a c0410aM2656b = m2656b(str);
        if (this.f1956f != c0410aM2656b) {
            if (abstractC0428k == null) {
                abstractC0428k = this.f1953c.m2568m();
            }
            C0410a c0410a = this.f1956f;
            if (c0410a != null && (fragment = c0410a.f1961d) != null) {
                abstractC0428k.mo2712m(fragment);
            }
            if (c0410aM2656b != null) {
                Fragment fragment2 = c0410aM2656b.f1961d;
                if (fragment2 == null) {
                    Fragment fragmentInstantiate = this.f1953c.m2584r0().instantiate(this.f1952b.getClassLoader(), c0410aM2656b.f1959b.getName());
                    c0410aM2656b.f1961d = fragmentInstantiate;
                    fragmentInstantiate.setArguments(c0410aM2656b.f1960c);
                    abstractC0428k.m2805c(this.f1954d, c0410aM2656b.f1961d, c0410aM2656b.f1958a);
                } else {
                    abstractC0428k.m2810h(fragment2);
                }
            }
            this.f1956f = c0410aM2656b;
        }
        return abstractC0428k;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C0410a m2656b(String str) {
        int size = this.f1951a.size();
        for (int i = 0; i < size; i++) {
            C0410a c0410a = this.f1951a.get(i);
            if (c0410a.f1958a.equals(str)) {
                return c0410a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2657c(Context context, AttributeSet attributeSet) {
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
        AbstractC0428k abstractC0428kM2568m = null;
        for (int i = 0; i < size; i++) {
            C0410a c0410a = this.f1951a.get(i);
            Fragment fragmentM2558i0 = this.f1953c.m2558i0(c0410a.f1958a);
            c0410a.f1961d = fragmentM2558i0;
            if (fragmentM2558i0 != null && !fragmentM2558i0.isDetached()) {
                if (c0410a.f1958a.equals(currentTabTag)) {
                    this.f1956f = c0410a;
                } else {
                    if (abstractC0428kM2568m == null) {
                        abstractC0428kM2568m = this.f1953c.m2568m();
                    }
                    abstractC0428kM2568m.mo2712m(c0410a.f1961d);
                }
            }
        }
        this.f1957g = true;
        AbstractC0428k abstractC0428kM2655a = m2655a(currentTabTag, abstractC0428kM2568m);
        if (abstractC0428kM2655a != null) {
            abstractC0428kM2655a.mo2708i();
            this.f1953c.m2546e0();
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
        AbstractC0428k abstractC0428kM2655a;
        if (this.f1957g && (abstractC0428kM2655a = m2655a(str, null)) != null) {
            abstractC0428kM2655a.mo2708i();
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
        public static final Parcelable.Creator<SavedState> CREATOR = new C0409a();
        String curTab;

        /* JADX INFO: renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        public class C0409a implements Parcelable.Creator<SavedState> {
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
        m2657c(context, attributeSet);
    }
}
