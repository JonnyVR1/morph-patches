package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p153l.wg3;

/* JADX INFO: loaded from: classes7.dex */
final class zzavv {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzawn zzc;
    private static final zzawn zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzawn zzawnVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzawnVar = (zzawn) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzawnVar;
        zzd = new zzawp();
    }

    public static void zzA(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzs(i, list, z);
    }

    public static void zzB(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzu(i, list, z);
    }

    public static void zzC(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzy(i, list, z);
    }

    public static void zzD(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzA(i, list, z);
    }

    public static void zzE(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzC(i, list, z);
    }

    public static void zzF(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzE(i, list, z);
    }

    public static void zzG(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzJ(i, list, z);
    }

    public static void zzH(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzL(i, list, z);
    }

    public static int zza(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzatv)) {
            int iZzC = 0;
            while (i < size) {
                iZzC += zzasx.zzC(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzC;
        }
        zzatv zzatvVar = (zzatv) list;
        int iZzC2 = 0;
        while (i < size) {
            iZzC2 += zzasx.zzC(zzatvVar.zze(i));
            i++;
        }
        return iZzC2;
    }

    public static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzasx.zzB(i << 3) + 4);
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzasx.zzB(i << 3) + 8);
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzatv)) {
            int iZzC = 0;
            while (i < size) {
                iZzC += zzasx.zzC(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzC;
        }
        zzatv zzatvVar = (zzatv) list;
        int iZzC2 = 0;
        while (i < size) {
            iZzC2 += zzasx.zzC(zzatvVar.zze(i));
            i++;
        }
        return iZzC2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzauu)) {
            int iZzC = 0;
            while (i < size) {
                iZzC += zzasx.zzC(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzC;
        }
        zzauu zzauuVar = (zzauu) list;
        int iZzC2 = 0;
        while (i < size) {
            iZzC2 += zzasx.zzC(zzauuVar.zze(i));
            i++;
        }
        return iZzC2;
    }

    public static int zzh(int i, Object obj, zzavt zzavtVar) {
        int i2 = i << 3;
        if (!(obj instanceof zzaul)) {
            return zzasx.zzB(i2) + zzasx.zzz((zzavf) obj, zzavtVar);
        }
        int iZzB = zzasx.zzB(i2);
        int iZza = ((zzaul) obj).zza();
        return iZzB + zzasx.zzB(iZza) + iZza;
    }

    public static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzatv)) {
            int iZzB = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzB += zzasx.zzB((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzB;
        }
        zzatv zzatvVar = (zzatv) list;
        int iZzB2 = 0;
        while (i < size) {
            int iZze = zzatvVar.zze(i);
            iZzB2 += zzasx.zzB((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzB2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzauu)) {
            int iZzC = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzC += zzasx.zzC((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzC;
        }
        zzauu zzauuVar = (zzauu) list;
        int iZzC2 = 0;
        while (i < size) {
            long jZze = zzauuVar.zze(i);
            iZzC2 += zzasx.zzC((jZze >> 63) ^ (jZze + jZze));
            i++;
        }
        return iZzC2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzatv)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzasx.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzB;
        }
        zzatv zzatvVar = (zzatv) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzasx.zzB(zzatvVar.zze(i));
            i++;
        }
        return iZzB2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzauu)) {
            int iZzC = 0;
            while (i < size) {
                iZzC += zzasx.zzC(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzC;
        }
        zzauu zzauuVar = (zzauu) list;
        int iZzC2 = 0;
        while (i < size) {
            iZzC2 += zzasx.zzC(zzauuVar.zze(i));
            i++;
        }
        return iZzC2;
    }

    public static zzawn zzm() {
        return zzc;
    }

    public static zzawn zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i, List list, zzaty zzatyVar, Object obj2, zzawn zzawnVar) {
        if (zzatyVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzatyVar.zza(iIntValue)) {
                    obj2 = zzp(obj, i, iIntValue, obj2, zzawnVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (zzatyVar.zza(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = zzp(obj, i, iIntValue2, obj2, zzawnVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i, int i2, Object obj2, zzawn zzawnVar) {
        if (obj2 == null) {
            obj2 = zzawnVar.zzc(obj);
        }
        zzawnVar.zzl(obj2, i, i2);
        return obj2;
    }

    public static void zzq(zzatg zzatgVar, Object obj, Object obj2) {
        zzatk zzatkVarZzb = zzatgVar.zzb(obj2);
        if (zzatkVarZzb.zza.isEmpty()) {
            return;
        }
        zzatgVar.zzc(obj).zzh(zzatkVarZzb);
    }

    public static void zzr(zzawn zzawnVar, Object obj, Object obj2) {
        zzawnVar.zzo(obj, zzawnVar.zze(zzawnVar.zzd(obj), zzawnVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (zzatu.class.isAssignableFrom(cls) || (cls2 = zzb) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        wg3.m206174a("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    public static boolean zzt(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzu(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzc(i, list, z);
    }

    public static void zzv(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzg(i, list, z);
    }

    public static void zzw(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzj(i, list, z);
    }

    public static void zzx(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzl(i, list, z);
    }

    public static void zzy(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzn(i, list, z);
    }

    public static void zzz(int i, List list, zzasy zzasyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzasyVar.zzp(i, list, z);
    }
}
