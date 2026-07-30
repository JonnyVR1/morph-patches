package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p149l.ckq0;
import p149l.e01;
import p149l.i01;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(@Nullable Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : Collections.singletonList(tArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k, @NonNull V v2, @NonNull K k2, @NonNull V v3, @NonNull K k3, @NonNull V v4, @NonNull K k4, @NonNull V v5, @NonNull K k5, @NonNull V v6, @NonNull K k6, @NonNull V v7) {
        Map mapZza = zza(6, false);
        mapZza.put(k, v2);
        mapZza.put(k2, v3);
        mapZza.put(k3, v4);
        mapZza.put(k4, v5);
        mapZza.put(k5, v6);
        mapZza.put(k6, v7);
        return Collections.unmodifiableMap(mapZza);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@NonNull K[] kArr, @NonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            ckq0.m107426a("Key and values array lengths not equal: ", length, " != ", length2);
            return null;
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapZza = zza(length, false);
        for (int i = 0; i < kArr.length; i++) {
            mapZza.put(kArr[i], vArr[i]);
        }
        return Collections.unmodifiableMap(mapZza);
    }

    @NonNull
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i) {
        return i == 0 ? new i01() : zzb(i, true);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set setZzb = zzb(2, false);
            setZzb.add(t);
            setZzb.add(t2);
            return Collections.unmodifiableSet(setZzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setZzb2 = zzb(length, false);
            Collections.addAll(setZzb2, tArr);
            return Collections.unmodifiableSet(setZzb2);
        }
        T t3 = tArr[0];
        T t4 = tArr[1];
        T t5 = tArr[2];
        T t6 = tArr[3];
        Set setZzb3 = zzb(4, false);
        setZzb3.add(t3);
        setZzb3.add(t4);
        setZzb3.add(t5);
        setZzb3.add(t6);
        return Collections.unmodifiableSet(setZzb3);
    }

    private static Map zza(int i, boolean z) {
        return i <= 256 ? new e01(i) : new HashMap(i, 1.0f);
    }

    private static Set zzb(int i, boolean z) {
        if (i <= (true != z ? 256 : 128)) {
            return new i01(i);
        }
        return new HashSet(i, true != z ? 1.0f : 0.75f);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T t) {
        return Collections.singletonList(t);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k, @NonNull V v2, @NonNull K k2, @NonNull V v3, @NonNull K k3, @NonNull V v4) {
        Map mapZza = zza(3, false);
        mapZza.put(k, v2);
        mapZza.put(k2, v3);
        mapZza.put(k3, v4);
        return Collections.unmodifiableMap(mapZza);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T t, @NonNull T t2, @NonNull T t3) {
        Set setZzb = zzb(3, false);
        setZzb.add(t);
        setZzb.add(t2);
        setZzb.add(t3);
        return Collections.unmodifiableSet(setZzb);
    }
}
