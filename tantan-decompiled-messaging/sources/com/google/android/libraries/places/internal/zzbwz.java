package com.google.android.libraries.places.internal;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@JvmName
@SourceDebugExtension
public final class zzbwz {
    /* JADX WARN: Code duplicated, block: B:11:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    public static final int zza(@NotNull zzbwp zzbwpVar, int i) {
        int i2;
        zzbwpVar.getClass();
        int[] iArrZzq = zzbwpVar.zzq();
        int length = zzbwpVar.zzr().length;
        iArrZzq.getClass();
        int i3 = length - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = i + 1;
            i2 = (i4 + i3) >>> 1;
            int i6 = iArrZzq[i2];
            if (i6 < i5) {
                i4 = i2 + 1;
            } else {
                if (i6 <= i5) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                i3 = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }
}
