package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class zzasy {
    private final zzasx zza;

    private zzasy(zzasx zzasxVar) {
        byte[] bArr = zzaud.zzd;
        this.zza = zzasxVar;
        zzasxVar.zze = this;
    }

    public static zzasy zza(zzasx zzasxVar) {
        zzasy zzasyVar = zzasxVar.zze;
        return zzasyVar != null ? zzasyVar : new zzasy(zzasxVar);
    }

    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzB(int i, int i2) throws IOException {
        zzasx zzasxVar = this.zza;
        zzasxVar.zzt(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzasx zzasxVar = this.zza;
                int iIntValue = ((Integer) list.get(i2)).intValue();
                zzasxVar.zzt(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iZzB += zzasx.zzB((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.zza.zzu(iZzB);
        while (i2 < list.size()) {
            zzasx zzasxVar2 = this.zza;
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            zzasxVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    public final void zzD(int i, long j) throws IOException {
        zzasx zzasxVar = this.zza;
        zzasxVar.zzv(i, (j >> 63) ^ (j + j));
    }

    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzasx zzasxVar = this.zza;
                long jLongValue = ((Long) list.get(i2)).longValue();
                zzasxVar.zzv(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iZzC += zzasx.zzC((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.zza.zzu(iZzC);
        while (i2 < list.size()) {
            zzasx zzasxVar2 = this.zza;
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            zzasxVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzs(i, 3);
    }

    public final void zzG(int i, String str) throws IOException {
        this.zza.zzq(i, str);
    }

    public final void zzH(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzaun)) {
            while (i2 < list.size()) {
                this.zza.zzq(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzaun zzaunVar = (zzaun) list;
        while (i2 < list.size()) {
            Object objZzf = zzaunVar.zzf(i2);
            boolean z = objZzf instanceof String;
            zzasx zzasxVar = this.zza;
            if (z) {
                zzasxVar.zzq(i, (String) objZzf);
            } else {
                zzasxVar.zzM(i, (zzask) objZzf);
            }
            i2++;
        }
    }

    public final void zzI(int i, int i2) throws IOException {
        this.zza.zzt(i, i2);
    }

    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzt(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzB += zzasx.zzB(((Integer) list.get(i3)).intValue());
        }
        this.zza.zzu(iZzB);
        while (i2 < list.size()) {
            this.zza.zzu(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzK(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzC += zzasx.zzC(((Long) list.get(i3)).longValue());
        }
        this.zza.zzu(iZzC);
        while (i2 < list.size()) {
            this.zza.zzw(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzL(i, z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzL(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzK(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public final void zzd(int i, zzask zzaskVar) throws IOException {
        this.zza.zzM(i, zzaskVar);
    }

    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzM(i, (zzask) list.get(i2));
        }
    }

    public final void zzf(int i, double d) throws IOException {
        this.zza.zzj(i, Double.doubleToRawLongBits(d));
    }

    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzs(i, 4);
    }

    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzC += zzasx.zzC(((Integer) list.get(i3)).intValue());
        }
        this.zza.zzu(iZzC);
        while (i2 < list.size()) {
            this.zza.zzm(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzm(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzo(int i, float f) throws IOException {
        this.zza.zzh(i, Float.floatToRawIntBits(f));
    }

    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public final void zzq(int i, Object obj, zzavt zzavtVar) throws IOException {
        zzasx zzasxVar = this.zza;
        zzasxVar.zzs(i, 3);
        zzavtVar.zzj((zzavf) obj, zzasxVar.zze);
        zzasxVar.zzs(i, 4);
    }

    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzC += zzasx.zzC(((Integer) list.get(i3)).intValue());
        }
        this.zza.zzu(iZzC);
        while (i2 < list.size()) {
            this.zza.zzm(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzt(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzC += zzasx.zzC(((Long) list.get(i3)).longValue());
        }
        this.zza.zzu(iZzC);
        while (i2 < list.size()) {
            this.zza.zzw(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzv(int i, Object obj, zzavt zzavtVar) throws IOException {
        this.zza.zzn(i, (zzavf) obj, zzavtVar);
    }

    public final void zzw(int i, Object obj) throws IOException {
        boolean z = obj instanceof zzask;
        zzasx zzasxVar = this.zza;
        if (z) {
            zzasxVar.zzp(i, (zzask) obj);
        } else {
            zzasxVar.zzo(i, (zzavf) obj);
        }
    }

    public final void zzx(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.zza.zzu(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzz(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }
}
