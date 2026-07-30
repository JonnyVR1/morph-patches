package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0366a();
    private static final String TAG = "FragmentManager";
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int[] mCurrentMaxLifecycleStates;
    final ArrayList<String> mFragmentWhos;
    final int mIndex;
    final String mName;
    final int[] mOldMaxLifecycleStates;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final ArrayList<String> mSharedElementSourceNames;
    final ArrayList<String> mSharedElementTargetNames;
    final int mTransition;

    /* JADX INFO: renamed from: androidx.fragment.app.BackStackState$a */
    public class C0366a implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(C0418a c0418a) {
        int size = c0418a.f2084c.size();
        this.mOps = new int[size * 5];
        if (!c0418a.f2090i) {
            wtq0.m207906a("Not on back stack");
            throw null;
        }
        this.mFragmentWhos = new ArrayList<>(size);
        this.mOldMaxLifecycleStates = new int[size];
        this.mCurrentMaxLifecycleStates = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0428k.a aVar = c0418a.f2084c.get(i2);
            int i3 = i + 1;
            this.mOps[i] = aVar.f2101a;
            ArrayList<String> arrayList = this.mFragmentWhos;
            Fragment fragment = aVar.f2102b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.mOps;
            iArr[i3] = aVar.f2103c;
            iArr[i + 2] = aVar.f2104d;
            int i4 = i + 4;
            iArr[i + 3] = aVar.f2105e;
            i += 5;
            iArr[i4] = aVar.f2106f;
            this.mOldMaxLifecycleStates[i2] = aVar.f2107g.ordinal();
            this.mCurrentMaxLifecycleStates[i2] = aVar.f2108h.ordinal();
        }
        this.mTransition = c0418a.f2089h;
        this.mName = c0418a.f2092k;
        this.mIndex = c0418a.f1997v;
        this.mBreadCrumbTitleRes = c0418a.f2093l;
        this.mBreadCrumbTitleText = c0418a.f2094m;
        this.mBreadCrumbShortTitleRes = c0418a.f2095n;
        this.mBreadCrumbShortTitleText = c0418a.f2096o;
        this.mSharedElementSourceNames = c0418a.f2097p;
        this.mSharedElementTargetNames = c0418a.f2098q;
        this.mReorderingAllowed = c0418a.f2099r;
    }

    /* JADX INFO: renamed from: a */
    public C0418a m2455a(FragmentManager fragmentManager) {
        C0418a c0418a = new C0418a(fragmentManager);
        int i = 0;
        int i2 = 0;
        while (i < this.mOps.length) {
            AbstractC0428k.a aVar = new AbstractC0428k.a();
            int i3 = i + 1;
            aVar.f2101a = this.mOps[i];
            if (FragmentManager.m2481G0(2)) {
                c0418a.toString();
                int i4 = this.mOps[i3];
            }
            String str = this.mFragmentWhos.get(i2);
            if (str != null) {
                aVar.f2102b = fragmentManager.m2552g0(str);
            } else {
                aVar.f2102b = null;
            }
            aVar.f2107g = Lifecycle.State.values()[this.mOldMaxLifecycleStates[i2]];
            aVar.f2108h = Lifecycle.State.values()[this.mCurrentMaxLifecycleStates[i2]];
            int[] iArr = this.mOps;
            int i5 = iArr[i3];
            aVar.f2103c = i5;
            int i6 = iArr[i + 2];
            aVar.f2104d = i6;
            int i7 = i + 4;
            int i8 = iArr[i + 3];
            aVar.f2105e = i8;
            i += 5;
            int i9 = iArr[i7];
            aVar.f2106f = i9;
            c0418a.f2085d = i5;
            c0418a.f2086e = i6;
            c0418a.f2087f = i8;
            c0418a.f2088g = i9;
            c0418a.m2808f(aVar);
            i2++;
        }
        c0418a.f2089h = this.mTransition;
        c0418a.f2092k = this.mName;
        c0418a.f1997v = this.mIndex;
        c0418a.f2090i = true;
        c0418a.f2093l = this.mBreadCrumbTitleRes;
        c0418a.f2094m = this.mBreadCrumbTitleText;
        c0418a.f2095n = this.mBreadCrumbShortTitleRes;
        c0418a.f2096o = this.mBreadCrumbShortTitleText;
        c0418a.f2097p = this.mSharedElementSourceNames;
        c0418a.f2098q = this.mSharedElementTargetNames;
        c0418a.f2099r = this.mReorderingAllowed;
        c0418a.m2719z(1);
        return c0418a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.mOps);
        parcel.writeStringList(this.mFragmentWhos);
        parcel.writeIntArray(this.mOldMaxLifecycleStates);
        parcel.writeIntArray(this.mCurrentMaxLifecycleStates);
        parcel.writeInt(this.mTransition);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
        parcel.writeInt(this.mReorderingAllowed ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mFragmentWhos = parcel.createStringArrayList();
        this.mOldMaxLifecycleStates = parcel.createIntArray();
        this.mCurrentMaxLifecycleStates = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.mBreadCrumbTitleText = (CharSequence) creator.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) creator.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
        this.mReorderingAllowed = parcel.readInt() != 0;
    }
}
