package p153l;

import com.google.android.gms.internal.play_billing.AbstractC2395a0;
import com.google.android.gms.internal.play_billing.AbstractC2403d0;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjv;
import com.google.android.gms.internal.play_billing.zzkn;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class yjx0 {

    /* JADX INFO: renamed from: d */
    public static final yjx0 f200354d = new yjx0(true);

    /* JADX INFO: renamed from: a */
    public final uzx0 f200355a = new xyx0();

    /* JADX INFO: renamed from: b */
    public boolean f200356b;

    /* JADX INFO: renamed from: c */
    public boolean f200357c;

    public yjx0(boolean z) {
        m216462f();
        m216462f();
    }

    /* JADX INFO: renamed from: a */
    public static int m216453a(zzju zzjuVar, int i, Object obj) {
        AbstractC2395a0.m14771B(i << 3);
        if (zzju.zzj == null) {
            Charset charset = srx0.f170385a;
            if (((yvx0) obj) instanceof lnw0) {
                throw null;
            }
        }
        zzjv zzjvVar = zzjv.INT;
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static int m216454b(zix0 zix0Var, Object obj) {
        zzju zzjuVarZzb = zix0Var.zzb();
        int iZza = zix0Var.zza();
        if (!zix0Var.zze()) {
            return m216453a(zzjuVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        if (!zix0Var.zzd()) {
            int iM216453a = 0;
            for (int i = 0; i < size; i++) {
                iM216453a += m216453a(zzjuVarZzb, iZza, list.get(i));
            }
            return iM216453a;
        }
        if (list.isEmpty()) {
            return 0;
        }
        if (size <= 0) {
            return AbstractC2395a0.m14771B(iZza << 3) + AbstractC2395a0.m14771B(0);
        }
        list.get(0);
        zzju zzjuVar = zzju.zza;
        zzjv zzjvVar = zzjv.INT;
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static yjx0 m216455d() {
        return f200354d;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m216456i(Map.Entry entry) {
        zix0 zix0Var = (zix0) entry.getKey();
        if (zix0Var.zzc() != zzjv.MESSAGE) {
            return true;
        }
        if (!zix0Var.zze()) {
            return m216457j(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!m216457j(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m216457j(Object obj) {
        if (obj instanceof dwx0) {
            return ((dwx0) obj).zzl();
        }
        if (obj instanceof tsx0) {
            return true;
        }
        wg3.m206174a("Wrong object type used with protocol message reflection.");
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static final int m216458k(Map.Entry entry) {
        int i;
        int iM14771B;
        int iM14771B2;
        int iZzk;
        int iM14771B3;
        zix0 zix0Var = (zix0) entry.getKey();
        Object value = entry.getValue();
        if (zix0Var.zzc() != zzjv.MESSAGE || zix0Var.zze() || zix0Var.zzd()) {
            return m216454b(zix0Var, value);
        }
        if (value instanceof tsx0) {
            int iZza = ((zix0) entry.getKey()).zza();
            int iM14771B4 = AbstractC2395a0.m14771B(8);
            i = iM14771B4 + iM14771B4;
            iM14771B = AbstractC2395a0.m14771B(16) + AbstractC2395a0.m14771B(iZza);
            iM14771B2 = AbstractC2395a0.m14771B(24);
            iZzk = ((tsx0) value).m14839a();
            iM14771B3 = AbstractC2395a0.m14771B(iZzk);
        } else {
            int iZza2 = ((zix0) entry.getKey()).zza();
            int iM14771B5 = AbstractC2395a0.m14771B(8);
            i = iM14771B5 + iM14771B5;
            iM14771B = AbstractC2395a0.m14771B(16) + AbstractC2395a0.m14771B(iZza2);
            iM14771B2 = AbstractC2395a0.m14771B(24);
            iZzk = ((yvx0) value).zzk();
            iM14771B3 = AbstractC2395a0.m14771B(iZzk);
        }
        return i + iM14771B + iM14771B2 + iM14771B3 + iZzk;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: l */
    public static final void m216459l(zix0 zix0Var, Object obj) {
        boolean z;
        zix0Var.zzb();
        Charset charset = srx0.f170385a;
        obj.getClass();
        zzju zzjuVar = zzju.zza;
        zzjv zzjvVar = zzjv.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zix0Var.zza()), zix0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zix0Var.zza()), zix0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zix0Var.zza()), zix0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zix0Var.zza()), zix0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zix0Var.zza()), zix0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zix0Var.zza()), zix0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case BYTE_STRING:
                if ((obj instanceof zzgk) || (obj instanceof byte[])) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zix0Var.zza()), zix0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzkn)) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zix0Var.zza()), zix0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case MESSAGE:
                if ((obj instanceof yvx0) || (obj instanceof tsx0)) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zix0Var.zza()), zix0Var.zzb().zza(), obj.getClass().getName()});
                break;
            default:
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zix0Var.zza()), zix0Var.zzb().zza(), obj.getClass().getName()});
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m216460c() {
        uzx0 uzx0Var;
        int iM198869c = this.f200355a.m198869c();
        int i = 0;
        int iM216458k = 0;
        while (true) {
            uzx0Var = this.f200355a;
            if (i >= iM198869c) {
                break;
            }
            iM216458k += m216458k(uzx0Var.m198872g(i));
            i++;
        }
        Iterator it = uzx0Var.m198870d().iterator();
        while (it.hasNext()) {
            iM216458k += m216458k((Map.Entry) it.next());
        }
        return iM216458k;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        uzx0 uzx0Var;
        yjx0 yjx0Var = new yjx0();
        int iM198869c = this.f200355a.m198869c();
        int i = 0;
        while (true) {
            uzx0Var = this.f200355a;
            if (i >= iM198869c) {
                break;
            }
            Map.Entry entryM198872g = uzx0Var.m198872g(i);
            yjx0Var.m216463g((zix0) ((czx0) entryM198872g).m113352a(), entryM198872g.getValue());
            i++;
        }
        for (Map.Entry entry : uzx0Var.m198870d()) {
            yjx0Var.m216463g((zix0) entry.getKey(), entry.getValue());
        }
        yjx0Var.f200357c = this.f200357c;
        return yjx0Var;
    }

    /* JADX INFO: renamed from: e */
    public final Iterator m216461e() {
        if (this.f200355a.isEmpty()) {
            return Collections.emptyIterator();
        }
        boolean z = this.f200357c;
        uzx0 uzx0Var = this.f200355a;
        return z ? new msx0(uzx0Var.entrySet().iterator()) : uzx0Var.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yjx0) {
            return this.f200355a.equals(((yjx0) obj).f200355a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m216462f() {
        uzx0 uzx0Var;
        if (this.f200356b) {
            return;
        }
        int iM198869c = this.f200355a.m198869c();
        int i = 0;
        while (true) {
            uzx0Var = this.f200355a;
            if (i >= iM198869c) {
                break;
            }
            Object value = uzx0Var.m198872g(i).getValue();
            if (value instanceof AbstractC2403d0) {
                ((AbstractC2403d0) value).m14829t();
            }
            i++;
        }
        Iterator it = uzx0Var.m198870d().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC2403d0) {
                ((AbstractC2403d0) value2).m14829t();
            }
        }
        this.f200355a.mo198868a();
        this.f200356b = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m216463g(zix0 zix0Var, Object obj) {
        if (!zix0Var.zze()) {
            m216459l(zix0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                wg3.m206174a("Wrong object type used with protocol message reflection.");
                return;
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                m216459l(zix0Var, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof tsx0) {
            this.f200357c = true;
        }
        this.f200355a.put(zix0Var, obj);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m216464h() {
        int iM198869c = this.f200355a.m198869c();
        int i = 0;
        while (true) {
            uzx0 uzx0Var = this.f200355a;
            if (i >= iM198869c) {
                Iterator it = uzx0Var.m198870d().iterator();
                while (it.hasNext()) {
                    if (!m216456i((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m216456i(uzx0Var.m198872g(i))) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        return this.f200355a.hashCode();
    }

    public yjx0() {
    }
}
