package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.gzi0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzatk {
    private static final zzatk zzb = new zzatk(true);
    final zzawg zza = new zzavw(16);
    private boolean zzc;
    private boolean zzd;

    private zzatk(boolean z) {
        zzg();
        zzg();
    }

    public static int zza(zzaxd zzaxdVar, int i, Object obj) {
        zzasx.zzB(i << 3);
        if (zzaxd.zzj == null) {
            byte[] bArr = zzaud.zzd;
            if (((zzavf) obj) instanceof zzaru) {
                throw null;
            }
        }
        zzaxe zzaxeVar = zzaxe.INT;
        throw null;
    }

    public static int zzb(zzatj zzatjVar, Object obj) {
        zzaxd zzaxdVarZzd = zzatjVar.zzd();
        int iZza = zzatjVar.zza();
        if (!zzatjVar.zzg()) {
            return zza(zzaxdVarZzd, iZza, obj);
        }
        List list = (List) obj;
        int iZza2 = 0;
        if (!zzatjVar.zzf()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iZza2 += zza(zzaxdVarZzd, iZza, it.next());
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            return zzasx.zzB(iZza << 3) + zzasx.zzB(0);
        }
        it2.next();
        zzaxd zzaxdVar = zzaxd.zza;
        zzaxe zzaxeVar = zzaxe.INT;
        throw null;
    }

    public static zzatk zzd() {
        return zzb;
    }

    private static Object zzk(Object obj) {
        if (obj instanceof zzavk) {
            return ((zzavk) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzl(Map.Entry entry) {
        zzatj zzatjVar = (zzatj) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzauk;
        if (zzatjVar.zzg()) {
            if (z) {
                wtq0.m207906a("Lazy fields can not be repeated");
                return;
            }
            Object objZze = zze(zzatjVar);
            if (objZze == null) {
                objZze = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZze).add(zzk(it.next()));
            }
            this.zza.put(zzatjVar, objZze);
            return;
        }
        if (zzatjVar.zze() != zzaxe.MESSAGE) {
            if (z) {
                wtq0.m207906a("Lazy fields must be message-valued");
                return;
            } else {
                this.zza.put(zzatjVar, zzk(value));
                return;
            }
        }
        Object objZze2 = zze(zzatjVar);
        if (objZze2 != null) {
            if (z) {
                throw null;
            }
            this.zza.put(zzatjVar, objZze2 instanceof zzavk ? zzatjVar.zzc((zzavk) objZze2, (zzavk) value) : zzatjVar.zzb(((zzavf) objZze2).zzaJ(), (zzavf) value).zzt());
        } else {
            this.zza.put(zzatjVar, zzk(value));
            if (z) {
                this.zzd = true;
            }
        }
    }

    private static boolean zzm(Map.Entry entry) {
        zzatj zzatjVar = (zzatj) entry.getKey();
        if (zzatjVar.zze() != zzaxe.MESSAGE) {
            return true;
        }
        if (!zzatjVar.zzg()) {
            return zzn(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!zzn(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzn(Object obj) {
        if (obj instanceof zzavg) {
            return ((zzavg) obj).zzaM();
        }
        if (obj instanceof zzauk) {
            return true;
        }
        wg3.m206174a("Wrong object type used with protocol message reflection.");
        return false;
    }

    private static final int zzo(Map.Entry entry) {
        int i;
        int iZzB;
        int iZzB2;
        int iZzaq;
        int iZzB3;
        zzatj zzatjVar = (zzatj) entry.getKey();
        Object value = entry.getValue();
        if (zzatjVar.zze() != zzaxe.MESSAGE || zzatjVar.zzg() || zzatjVar.zzf()) {
            return zzb(zzatjVar, value);
        }
        if (value instanceof zzauk) {
            int iZza = ((zzatj) entry.getKey()).zza();
            int iZzB4 = zzasx.zzB(8);
            i = iZzB4 + iZzB4;
            iZzB = zzasx.zzB(16) + zzasx.zzB(iZza);
            iZzB2 = zzasx.zzB(24);
            iZzaq = ((zzauk) value).zza();
            iZzB3 = zzasx.zzB(iZzaq);
        } else {
            int iZza2 = ((zzatj) entry.getKey()).zza();
            int iZzB5 = zzasx.zzB(8);
            i = iZzB5 + iZzB5;
            iZzB = zzasx.zzB(16) + zzasx.zzB(iZza2);
            iZzB2 = zzasx.zzB(24);
            iZzaq = ((zzavf) value).zzaq();
            iZzB3 = zzasx.zzB(iZzaq);
        }
        return i + iZzB + iZzB2 + iZzB3 + iZzaq;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final void zzp(zzatj zzatjVar, Object obj) {
        boolean z;
        zzatjVar.zzd();
        byte[] bArr = zzaud.zzd;
        obj.getClass();
        zzaxd zzaxdVar = zzaxd.zza;
        zzaxe zzaxeVar = zzaxe.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzatjVar.zza()), zzatjVar.zzd().zza(), obj.getClass().getName()});
                break;
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzatjVar.zza()), zzatjVar.zzd().zza(), obj.getClass().getName()});
                break;
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzatjVar.zza()), zzatjVar.zzd().zza(), obj.getClass().getName()});
                break;
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzatjVar.zza()), zzatjVar.zzd().zza(), obj.getClass().getName()});
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzatjVar.zza()), zzatjVar.zzd().zza(), obj.getClass().getName()});
                break;
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzatjVar.zza()), zzatjVar.zzd().zza(), obj.getClass().getName()});
                break;
            case BYTE_STRING:
                if ((obj instanceof zzask) || (obj instanceof byte[])) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzatjVar.zza()), zzatjVar.zzd().zza(), obj.getClass().getName()});
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzatw)) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzatjVar.zza()), zzatjVar.zzd().zza(), obj.getClass().getName()});
                break;
            case MESSAGE:
                if ((obj instanceof zzavf) || (obj instanceof zzauk)) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzatjVar.zza()), zzatjVar.zzd().zza(), obj.getClass().getName()});
                break;
            default:
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzatjVar.zza()), zzatjVar.zzd().zza(), obj.getClass().getName()});
                break;
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzawg zzawgVar;
        zzatk zzatkVar = new zzatk();
        int i = 0;
        while (true) {
            int iZzb = this.zza.zzb();
            zzawgVar = this.zza;
            if (i >= iZzb) {
                break;
            }
            Map.Entry entryZzg = zzawgVar.zzg(i);
            zzatkVar.zzi((zzatj) entryZzg.getKey(), entryZzg.getValue());
            i++;
        }
        for (Map.Entry entry : zzawgVar.zzc()) {
            zzatkVar.zzi((zzatj) entry.getKey(), entry.getValue());
        }
        zzatkVar.zzd = this.zzd;
        return zzatkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzatk) {
            return this.zza.equals(((zzatk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        zzawg zzawgVar;
        int i = 0;
        int iZzo = 0;
        while (true) {
            int iZzb = this.zza.zzb();
            zzawgVar = this.zza;
            if (i >= iZzb) {
                break;
            }
            iZzo += zzo(zzawgVar.zzg(i));
            i++;
        }
        Iterator it = zzawgVar.zzc().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    public final Object zze(zzatj zzatjVar) {
        Object obj = this.zza.get(zzatjVar);
        if (obj instanceof zzauk) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        boolean z = this.zzd;
        zzawg zzawgVar = this.zza;
        return z ? new zzauj(zzawgVar.entrySet().iterator()) : zzawgVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int i = 0;
        while (true) {
            int iZzb = this.zza.zzb();
            zzawg zzawgVar = this.zza;
            if (i >= iZzb) {
                zzawgVar.zza();
                this.zzc = true;
                return;
            } else {
                Map.Entry entryZzg = zzawgVar.zzg(i);
                if (entryZzg.getValue() instanceof zzatu) {
                    ((zzatu) entryZzg.getValue()).zzaC();
                }
                i++;
            }
        }
    }

    public final void zzh(zzatk zzatkVar) {
        zzawg zzawgVar;
        int i = 0;
        while (true) {
            int iZzb = zzatkVar.zza.zzb();
            zzawgVar = zzatkVar.zza;
            if (i >= iZzb) {
                break;
            }
            zzl(zzawgVar.zzg(i));
            i++;
        }
        Iterator it = zzawgVar.zzc().iterator();
        while (it.hasNext()) {
            zzl((Map.Entry) it.next());
        }
    }

    public final void zzi(zzatj zzatjVar, Object obj) {
        if (!zzatjVar.zzg()) {
            zzp(zzatjVar, obj);
        } else {
            if (!(obj instanceof List)) {
                wg3.m206174a("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzp(zzatjVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof zzauk) {
            this.zzd = true;
        }
        this.zza.put(zzatjVar, obj);
    }

    public final boolean zzj() {
        int i = 0;
        while (true) {
            int iZzb = this.zza.zzb();
            zzawg zzawgVar = this.zza;
            if (i >= iZzb) {
                Iterator it = zzawgVar.zzc().iterator();
                while (it.hasNext()) {
                    if (!zzm((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!zzm(zzawgVar.zzg(i))) {
                return false;
            }
            i++;
        }
    }

    private zzatk() {
    }
}
