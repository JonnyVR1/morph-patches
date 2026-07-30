package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.tantanapp.android.injecter.routes.Injecter$$Intermediate$$b_core;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        Injecter$$Intermediate$$b_core.C136911 c136911 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c136911.add(arrayList.get(i).freeze());
        }
        return c136911;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        Injecter$$Intermediate$$b_core.C136911 c136911 = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            c136911.add(it.next().freeze());
        }
        return c136911;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        Injecter$$Intermediate$$b_core.C136911 c136911 = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            c136911.add(e.freeze());
        }
        return c136911;
    }
}
