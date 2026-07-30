package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import p153l.d9r0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "CloudMessageCreator")
public final class CloudMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new d9r0();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    @NonNull
    @SafeParcelable.Field(m12517id = 1)
    final Intent zza;
    private Map zzb;

    @SafeParcelable.Constructor
    @KeepForSdk
    public CloudMessage(@NonNull @SafeParcelable.Param(m12518id = 1) Intent intent) {
        this.zza = intent;
    }

    @NonNull
    /* JADX INFO: renamed from: F */
    public Intent m12502F() {
        return this.zza;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public final Integer m12503H() {
        if (this.zza.hasExtra(Constants.MessagePayloadKeys.PRODUCT_ID)) {
            return Integer.valueOf(this.zza.getIntExtra(Constants.MessagePayloadKeys.PRODUCT_ID, 0));
        }
        return null;
    }

    @Nullable
    public String getMessageId() {
        String stringExtra = this.zza.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        return stringExtra == null ? this.zza.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER) : stringExtra;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
