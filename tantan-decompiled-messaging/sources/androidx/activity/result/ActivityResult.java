package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C0047a();

    @Nullable
    private final Intent mData;
    private final int mResultCode;

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResult$a */
    public class C0047a implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(@NonNull Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(Parcel parcel) {
        this.mResultCode = parcel.readInt();
        this.mData = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static String m199c(int i) {
        if (i != -1) {
            return i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public Intent m200a() {
        return this.mData;
    }

    /* JADX INFO: renamed from: b */
    public int m201b() {
        return this.mResultCode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m199c(this.mResultCode) + ", data=" + this.mData + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.mResultCode);
        parcel.writeInt(this.mData == null ? 0 : 1);
        Intent intent = this.mData;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(int i, @Nullable Intent intent) {
        this.mResultCode = i;
        this.mData = intent;
    }
}
