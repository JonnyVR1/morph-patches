package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {
    private final Parcelable mSuperState;
    public static final AbsSavedState EMPTY_STATE = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C0264a();

    /* JADX INFO: renamed from: androidx.customview.view.AbsSavedState$a */
    public static class C0264a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.EMPTY_STATE;
            }
            qkq0.m175383a("superState must be null");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    }

    public AbsSavedState(@NonNull Parcelable parcelable) {
        if (parcelable != null) {
            this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
        } else {
            ig3.m135964a("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }

    private AbsSavedState() {
        this.mSuperState = null;
    }

    public AbsSavedState(@NonNull Parcel parcel) {
        this(parcel, null);
    }

    public AbsSavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.mSuperState = parcelable == null ? EMPTY_STATE : parcelable;
    }
}
