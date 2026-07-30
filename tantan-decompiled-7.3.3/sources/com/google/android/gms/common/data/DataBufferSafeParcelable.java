package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {
    private static final String[] zaa = {"data"};
    private final Parcelable.Creator zab;

    @KeepForSdk
    public DataBufferSafeParcelable(@NonNull DataHolder dataHolder, @NonNull Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zab = creator;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void addValue(@NonNull DataHolder.Builder builder, @NonNull T t) {
        Parcel parcelObtain = Parcel.obtain();
        t.writeToParcel(parcelObtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", parcelObtain.marshall());
        builder.withRow(contentValues);
        parcelObtain.recycle();
    }

    @NonNull
    @KeepForSdk
    public static DataHolder.Builder buildDataHolder() {
        return DataHolder.builder(zaa);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @NonNull
    @KeepForSdk
    public T get(int i) {
        DataHolder dataHolder = (DataHolder) Preconditions.checkNotNull(this.mDataHolder);
        byte[] byteArray = dataHolder.getByteArray("data", i, dataHolder.getWindowIndex(i));
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(byteArray, 0, byteArray.length);
        parcelObtain.setDataPosition(0);
        T t = (T) this.zab.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return t;
    }
}
