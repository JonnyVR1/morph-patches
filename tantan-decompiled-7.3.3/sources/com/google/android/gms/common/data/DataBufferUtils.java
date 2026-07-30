package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.tantanapp.android.injecter.routes.Injecter$$Intermediate$$b_core;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class DataBufferUtils {

    @NonNull
    @KeepForSdk
    public static final String KEY_NEXT_PAGE_TOKEN = "next_page_token";

    @NonNull
    @KeepForSdk
    public static final String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    private DataBufferUtils() {
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeAndClose(@NonNull DataBuffer<E> dataBuffer) {
        Injecter$$Intermediate$$b_core.C136911 c136911 = (ArrayList<T>) new ArrayList(dataBuffer.getCount());
        try {
            Iterator<E> it = dataBuffer.iterator();
            while (it.hasNext()) {
                c136911.add(it.next().freeze());
            }
            dataBuffer.close();
            return c136911;
        } catch (Throwable th) {
            dataBuffer.close();
            throw th;
        }
    }

    public static boolean hasData(@NonNull DataBuffer<?> dataBuffer) {
        return dataBuffer != null && dataBuffer.getCount() > 0;
    }

    public static boolean hasNextPage(@NonNull DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_NEXT_PAGE_TOKEN) == null) ? false : true;
    }

    public static boolean hasPrevPage(@NonNull DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_PREV_PAGE_TOKEN) == null) ? false : true;
    }
}
