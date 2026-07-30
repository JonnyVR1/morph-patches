package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.common.zzag;
import com.tantanapp.android.injecter.routes.Injecter$$Intermediate$$b_core;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class SafeParcelableSerializer {
    private SafeParcelableSerializer() {
    }

    @NonNull
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromBytes(@NonNull byte[] bArr, @NonNull Parcelable.Creator<T> creator) {
        Preconditions.checkNotNull(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    @Nullable
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromIntentExtra(@NonNull Intent intent, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) deserializeFromBytes(byteArrayExtra, creator);
    }

    @NonNull
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromString(@NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        return (T) deserializeFromBytes(Base64Utils.decodeUrlSafe(str), creator);
    }

    @Nullable
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundle(@NonNull Bundle bundle, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        Injecter$$Intermediate$$b_core.C136911 c136911 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c136911.add(deserializeFromBytes((byte[]) arrayList.get(i), creator));
        }
        return c136911;
    }

    @Nullable
    @KeepForSdk
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundleSafe(@NonNull Bundle bundle, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(bundle.getByteArray(str), creator);
    }

    @Nullable
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBytes(@Nullable byte[] bArr, @NonNull Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            parcelObtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            parcelObtain.recycle();
        }
    }

    @Nullable
    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtra(@NonNull Intent intent, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        Injecter$$Intermediate$$b_core.C136911 c136911 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c136911.add(deserializeFromBytes((byte[]) arrayList.get(i), creator));
        }
        return c136911;
    }

    @Nullable
    @KeepForSdk
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtraSafe(@NonNull Intent intent, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToBundle(@NonNull Iterable<T> iterable, @NonNull Bundle bundle, @NonNull String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <T extends SafeParcelable> void serializeIterableToBundleSafe(@NonNull Iterable<T> iterable, @NonNull Bundle bundle, @NonNull String str) {
        bundle.putByteArray(str, zza(iterable));
    }

    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToIntentExtra(@NonNull Iterable<T> iterable, @NonNull Intent intent, @NonNull String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeIterableToIntentExtraSafe(@NonNull Iterable<T> iterable, @NonNull Intent intent, @NonNull String str) {
        intent.putExtra(str, zza(iterable));
    }

    @NonNull
    @KeepForSdk
    public static <T extends SafeParcelable> byte[] serializeToBytes(@NonNull T t) {
        Parcel parcelObtain = Parcel.obtain();
        t.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeToIntentExtra(@NonNull T t, @NonNull Intent intent, @NonNull String str) {
        intent.putExtra(str, serializeToBytes(t));
    }

    @NonNull
    @KeepForSdk
    public static <T extends SafeParcelable> String serializeToString(@NonNull T t) {
        return Base64Utils.encodeUrlSafe(serializeToBytes(t));
    }

    private static byte[] zza(Iterable iterable) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeTypedList(zzag.zzj(iterable));
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }
}
