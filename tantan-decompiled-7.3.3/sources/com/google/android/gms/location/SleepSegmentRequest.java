package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "SleepSegmentRequestCreator")
@SafeParcelable.Reserved({1000})
public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final int CLASSIFY_EVENTS_ONLY = 2;

    @NonNull
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new zzah();
    public static final int SEGMENT_AND_CLASSIFY_EVENTS = 0;
    public static final int SEGMENT_EVENTS_ONLY = 1;

    @Nullable
    @SafeParcelable.Field(getter = "getUserPreferredSleepWindow", m12517id = 1)
    private final List zza;

    @SafeParcelable.Field(defaultValue = "0", getter = "getRequestedDataType", m12517id = 2)
    private final int zzb;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepSegmentRequest(@Nullable @SafeParcelable.Param(m12518id = 1) List list, @SafeParcelable.Param(m12518id = 2) int i) {
        this.zza = list;
        this.zzb = i;
    }

    @NonNull
    public static SleepSegmentRequest getDefaultSleepSegmentRequest() {
        return new SleepSegmentRequest(null, 0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return Objects.equal(this.zza, sleepSegmentRequest.zza) && this.zzb == sleepSegmentRequest.zzb;
    }

    public int getRequestedDataType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, getRequestedDataType());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public SleepSegmentRequest(int i) {
        this(null, i);
    }
}
