package p149l;

import com.google.android.gms.internal.play_billing.AbstractC2372a0;
import com.google.android.gms.internal.play_billing.AbstractC2380d0;
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
public final class sax0 {

    /* JADX INFO: renamed from: d */
    public static final sax0 f163459d = new sax0(true);

    /* JADX INFO: renamed from: a */
    public final oqx0 f163460a = new rpx0();

    /* JADX INFO: renamed from: b */
    public boolean f163461b;

    /* JADX INFO: renamed from: c */
    public boolean f163462c;

    public sax0(boolean z) {
        m183124f();
        m183124f();
    }

    /* JADX INFO: renamed from: a */
    public static int m183115a(zzju zzjuVar, int i, Object obj) {
        AbstractC2372a0.m14717B(i << 3);
        if (zzju.zzj == null) {
            Charset charset = mix0.f134047a;
            if (((smx0) obj) instanceof few0) {
                throw null;
            }
        }
        zzjv zzjvVar = zzjv.INT;
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static int m183116b(t9x0 t9x0Var, Object obj) {
        zzju zzjuVarZzb = t9x0Var.zzb();
        int iZza = t9x0Var.zza();
        if (!t9x0Var.zze()) {
            return m183115a(zzjuVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        if (!t9x0Var.zzd()) {
            int iM183115a = 0;
            for (int i = 0; i < size; i++) {
                iM183115a += m183115a(zzjuVarZzb, iZza, list.get(i));
            }
            return iM183115a;
        }
        if (list.isEmpty()) {
            return 0;
        }
        if (size <= 0) {
            return AbstractC2372a0.m14717B(iZza << 3) + AbstractC2372a0.m14717B(0);
        }
        list.get(0);
        zzju zzjuVar = zzju.zza;
        zzjv zzjvVar = zzjv.INT;
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static sax0 m183117d() {
        return f163459d;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m183118i(Map.Entry entry) {
        t9x0 t9x0Var = (t9x0) entry.getKey();
        if (t9x0Var.zzc() != zzjv.MESSAGE) {
            return true;
        }
        if (!t9x0Var.zze()) {
            return m183119j(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!m183119j(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m183119j(Object obj) {
        if (obj instanceof xmx0) {
            return ((xmx0) obj).zzl();
        }
        if (obj instanceof njx0) {
            return true;
        }
        ig3.m135964a("Wrong object type used with protocol message reflection.");
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static final int m183120k(Map.Entry entry) {
        int i;
        int iM14717B;
        int iM14717B2;
        int iZzk;
        int iM14717B3;
        t9x0 t9x0Var = (t9x0) entry.getKey();
        Object value = entry.getValue();
        if (t9x0Var.zzc() != zzjv.MESSAGE || t9x0Var.zze() || t9x0Var.zzd()) {
            return m183116b(t9x0Var, value);
        }
        if (value instanceof njx0) {
            int iZza = ((t9x0) entry.getKey()).zza();
            int iM14717B4 = AbstractC2372a0.m14717B(8);
            i = iM14717B4 + iM14717B4;
            iM14717B = AbstractC2372a0.m14717B(16) + AbstractC2372a0.m14717B(iZza);
            iM14717B2 = AbstractC2372a0.m14717B(24);
            iZzk = ((njx0) value).m14785a();
            iM14717B3 = AbstractC2372a0.m14717B(iZzk);
        } else {
            int iZza2 = ((t9x0) entry.getKey()).zza();
            int iM14717B5 = AbstractC2372a0.m14717B(8);
            i = iM14717B5 + iM14717B5;
            iM14717B = AbstractC2372a0.m14717B(16) + AbstractC2372a0.m14717B(iZza2);
            iM14717B2 = AbstractC2372a0.m14717B(24);
            iZzk = ((smx0) value).zzk();
            iM14717B3 = AbstractC2372a0.m14717B(iZzk);
        }
        return i + iM14717B + iM14717B2 + iM14717B3 + iZzk;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: l */
    public static final void m183121l(t9x0 t9x0Var, Object obj) {
        boolean z;
        t9x0Var.zzb();
        Charset charset = mix0.f134047a;
        obj.getClass();
        zzju zzjuVar = zzju.zza;
        zzjv zzjvVar = zzjv.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t9x0Var.zza()), t9x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t9x0Var.zza()), t9x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t9x0Var.zza()), t9x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t9x0Var.zza()), t9x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t9x0Var.zza()), t9x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t9x0Var.zza()), t9x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case BYTE_STRING:
                if ((obj instanceof zzgk) || (obj instanceof byte[])) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t9x0Var.zza()), t9x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzkn)) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t9x0Var.zza()), t9x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case MESSAGE:
                if ((obj instanceof smx0) || (obj instanceof njx0)) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t9x0Var.zza()), t9x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            default:
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t9x0Var.zza()), t9x0Var.zzb().zza(), obj.getClass().getName()});
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m183122c() {
        oqx0 oqx0Var;
        int iM165500c = this.f163460a.m165500c();
        int i = 0;
        int iM183120k = 0;
        while (true) {
            oqx0Var = this.f163460a;
            if (i >= iM165500c) {
                break;
            }
            iM183120k += m183120k(oqx0Var.m165503g(i));
            i++;
        }
        Iterator it = oqx0Var.m165501d().iterator();
        while (it.hasNext()) {
            iM183120k += m183120k((Map.Entry) it.next());
        }
        return iM183120k;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        oqx0 oqx0Var;
        sax0 sax0Var = new sax0();
        int iM165500c = this.f163460a.m165500c();
        int i = 0;
        while (true) {
            oqx0Var = this.f163460a;
            if (i >= iM165500c) {
                break;
            }
            Map.Entry entryM165503g = oqx0Var.m165503g(i);
            sax0Var.m183125g((t9x0) ((wpx0) entryM165503g).m204951a(), entryM165503g.getValue());
            i++;
        }
        for (Map.Entry entry : oqx0Var.m165501d()) {
            sax0Var.m183125g((t9x0) entry.getKey(), entry.getValue());
        }
        sax0Var.f163462c = this.f163462c;
        return sax0Var;
    }

    /* JADX INFO: renamed from: e */
    public final Iterator m183123e() {
        if (this.f163460a.isEmpty()) {
            return Collections.emptyIterator();
        }
        boolean z = this.f163462c;
        oqx0 oqx0Var = this.f163460a;
        return z ? new gjx0(oqx0Var.entrySet().iterator()) : oqx0Var.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sax0) {
            return this.f163460a.equals(((sax0) obj).f163460a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m183124f() {
        oqx0 oqx0Var;
        if (this.f163461b) {
            return;
        }
        int iM165500c = this.f163460a.m165500c();
        int i = 0;
        while (true) {
            oqx0Var = this.f163460a;
            if (i >= iM165500c) {
                break;
            }
            Object value = oqx0Var.m165503g(i).getValue();
            if (value instanceof AbstractC2380d0) {
                ((AbstractC2380d0) value).m14775t();
            }
            i++;
        }
        Iterator it = oqx0Var.m165501d().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC2380d0) {
                ((AbstractC2380d0) value2).m14775t();
            }
        }
        this.f163460a.mo165499a();
        this.f163461b = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m183125g(t9x0 t9x0Var, Object obj) {
        if (!t9x0Var.zze()) {
            m183121l(t9x0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                ig3.m135964a("Wrong object type used with protocol message reflection.");
                return;
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                m183121l(t9x0Var, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof njx0) {
            this.f163462c = true;
        }
        this.f163460a.put(t9x0Var, obj);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m183126h() {
        int iM165500c = this.f163460a.m165500c();
        int i = 0;
        while (true) {
            oqx0 oqx0Var = this.f163460a;
            if (i >= iM165500c) {
                Iterator it = oqx0Var.m165501d().iterator();
                while (it.hasNext()) {
                    if (!m183118i((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m183118i(oqx0Var.m165503g(i))) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        return this.f163460a.hashCode();
    }

    public sax0() {
    }
}
