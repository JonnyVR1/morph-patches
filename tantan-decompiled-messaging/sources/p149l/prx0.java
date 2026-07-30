package p149l;

import com.google.android.gms.internal.measurement.AbstractC2349u0;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzjc;
import com.google.android.gms.internal.measurement.zzms;
import com.google.android.gms.internal.measurement.zzmz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.yrx0;

/* JADX INFO: loaded from: classes6.dex */
public final class prx0<T extends yrx0<T>> {

    /* JADX INFO: renamed from: d */
    public static final prx0<?> f150957d = new prx0<>(true);

    /* JADX INFO: renamed from: a */
    public final m3y0<T, Object> f150958a;

    /* JADX INFO: renamed from: b */
    public boolean f150959b;

    /* JADX INFO: renamed from: c */
    public boolean f150960c;

    public prx0(boolean z) {
        this(new w3y0());
        m171090q();
    }

    /* JADX INFO: renamed from: b */
    public static int m171074b(zzms zzmsVar, int i, Object obj) {
        int iM14674w0 = zzjc.m14674w0(i);
        if (zzmsVar == zzms.zzj) {
            ctx0.m108709g((g0y0) obj);
            iM14674w0 <<= 1;
        }
        return iM14674w0 + m171075c(zzmsVar, obj);
    }

    /* JADX INFO: renamed from: c */
    public static int m171075c(zzms zzmsVar, Object obj) {
        switch (lrx0.f129789b[zzmsVar.ordinal()]) {
            case 1:
                return zzjc.m14648c(((Double) obj).doubleValue());
            case 2:
                return zzjc.m14650d(((Float) obj).floatValue());
            case 3:
                return zzjc.m14653e0(((Long) obj).longValue());
            case 4:
                return zzjc.m14671r0(((Long) obj).longValue());
            case 5:
                return zzjc.m14664k0(((Integer) obj).intValue());
            case 6:
                return zzjc.m14644W(((Long) obj).longValue());
            case 7:
                return zzjc.m14656g0(((Integer) obj).intValue());
            case 8:
                return zzjc.m14661j(((Boolean) obj).booleanValue());
            case 9:
                return zzjc.m14639G((g0y0) obj);
            case 10:
                return obj instanceof tvx0 ? zzjc.m14657h((tvx0) obj) : zzjc.m14645X((g0y0) obj);
            case 11:
                return obj instanceof zzik ? zzjc.m14637E((zzik) obj) : zzjc.m14638F((String) obj);
            case 12:
                return obj instanceof zzik ? zzjc.m14637E((zzik) obj) : zzjc.m14663k((byte[]) obj);
            case 13:
                return zzjc.m14678z0(((Integer) obj).intValue());
            case 14:
                return zzjc.m14668o0(((Integer) obj).intValue());
            case 15:
                return zzjc.m14662j0(((Long) obj).longValue());
            case 16:
                return zzjc.m14672s0(((Integer) obj).intValue());
            case 17:
                return zzjc.m14667n0(((Long) obj).longValue());
            case 18:
                return obj instanceof qtx0 ? zzjc.m14647b0(((qtx0) obj).zza()) : zzjc.m14647b0(((Integer) obj).intValue());
            default:
                upk0.m194883a("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m171076d(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() != zzmz.MESSAGE || key.zze() || key.zzd()) {
            return m171077e(key, value);
        }
        return value instanceof tvx0 ? zzjc.m14655g(entry.getKey().zza(), (tvx0) value) : zzjc.m14633B(entry.getKey().zza(), (g0y0) value);
    }

    /* JADX INFO: renamed from: e */
    public static int m171077e(yrx0<?> yrx0Var, Object obj) {
        zzms zzmsVarZzb = yrx0Var.zzb();
        int iZza = yrx0Var.zza();
        if (!yrx0Var.zze()) {
            return m171074b(zzmsVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!yrx0Var.zzd()) {
            int iM171074b = 0;
            while (i < size) {
                iM171074b += m171074b(zzmsVarZzb, iZza, list.get(i));
                i++;
            }
            return iM171074b;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iM171075c = 0;
        while (i < size) {
            iM171075c += m171075c(zzmsVarZzb, list.get(i));
            i++;
        }
        return zzjc.m14674w0(iZza) + iM171075c + zzjc.m14678z0(iM171075c);
    }

    /* JADX INFO: renamed from: f */
    public static Object m171078f(Object obj) {
        if (obj instanceof b1y0) {
            return ((b1y0) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: i */
    public static <T extends yrx0<T>> prx0<T> m171079i() {
        return (prx0<T>) f150957d;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m171080l(Object obj) {
        if (obj instanceof p0y0) {
            return ((p0y0) obj).mo14358a();
        }
        if (obj instanceof tvx0) {
            return true;
        }
        ig3.m135964a("Wrong object type used with protocol message reflection.");
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static void m171081n(T t, Object obj) {
        zzms zzmsVarZzb = t.zzb();
        ctx0.m108707e(obj);
        boolean z = true;
        switch (lrx0.f129788a[zzmsVarZzb.zzb().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzik) && !(obj instanceof byte[])) {
                    z = false;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof qtx0)) {
                    z = false;
                }
                break;
            case 9:
                if (!(obj instanceof g0y0) && !(obj instanceof tvx0)) {
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            return;
        }
        dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.zzb().zzb(), obj.getClass().getName()});
    }

    /* JADX INFO: renamed from: o */
    public static <T extends yrx0<T>> boolean m171082o(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzmz.MESSAGE) {
            return true;
        }
        if (!key.zze()) {
            return m171080l(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!m171080l(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final int m171083a() {
        m3y0<T, Object> m3y0Var;
        int iM152969a = this.f150958a.m152969a();
        int i = 0;
        int iM171076d = 0;
        while (true) {
            m3y0Var = this.f150958a;
            if (i >= iM152969a) {
                break;
            }
            iM171076d += m171076d(m3y0Var.m152972f(i));
            i++;
        }
        Iterator it = m3y0Var.m152973g().iterator();
        while (it.hasNext()) {
            iM171076d += m171076d((Map.Entry) it.next());
        }
        return iM171076d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        m3y0<T, Object> m3y0Var;
        prx0 prx0Var = new prx0();
        int iM152969a = this.f150958a.m152969a();
        int i = 0;
        while (true) {
            m3y0Var = this.f150958a;
            if (i >= iM152969a) {
                break;
            }
            Map.Entry<K, Object> entryM152972f = m3y0Var.m152972f(i);
            prx0Var.m171087k((yrx0) entryM152972f.getKey(), entryM152972f.getValue());
            i++;
        }
        Iterator it = m3y0Var.m152973g().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            prx0Var.m171087k((yrx0) entry.getKey(), entry.getValue());
        }
        prx0Var.f150960c = this.f150960c;
        return prx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof prx0) {
            return this.f150958a.equals(((prx0) obj).f150958a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final Object m171084g(T t) {
        Object obj = this.f150958a.get(t);
        if (obj instanceof tvx0) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final void m171085h(prx0<T> prx0Var) {
        m3y0<T, Object> m3y0Var;
        int iM152969a = prx0Var.f150958a.m152969a();
        int i = 0;
        while (true) {
            m3y0Var = prx0Var.f150958a;
            if (i >= iM152969a) {
                break;
            }
            m171086j(m3y0Var.m152972f(i));
            i++;
        }
        Iterator it = m3y0Var.m152973g().iterator();
        while (it.hasNext()) {
            m171086j((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f150958a.hashCode();
    }

    /* JADX INFO: renamed from: j */
    public final void m171086j(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof tvx0;
        if (key.zze()) {
            if (z) {
                qkq0.m175383a("Lazy fields can not be repeated");
                return;
            }
            Object objM171084g = m171084g(key);
            List list = (List) value;
            int size = list.size();
            if (objM171084g == null) {
                objM171084g = new ArrayList(size);
            }
            List list2 = (List) objM171084g;
            for (int i = 0; i < size; i++) {
                list2.add(m171078f(list.get(i)));
            }
            this.f150958a.put(key, objM171084g);
            return;
        }
        if (key.zzc() != zzmz.MESSAGE) {
            if (z) {
                qkq0.m175383a("Lazy fields must be message-valued");
                return;
            } else {
                this.f150958a.put(key, m171078f(value));
                return;
            }
        }
        Object objM171084g2 = m171084g(key);
        if (objM171084g2 != null) {
            if (z) {
                throw new NoSuchMethodError();
            }
            this.f150958a.put(key, objM171084g2 instanceof b1y0 ? key.mo14382d((b1y0) objM171084g2, (b1y0) value) : key.mo14383k(((g0y0) objM171084g2).mo14356R(), (g0y0) value).mo14369H());
        } else {
            this.f150958a.put(key, m171078f(value));
            if (z) {
                this.f150960c = true;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m171087k(T t, Object obj) {
        if (!t.zze()) {
            m171081n(t, obj);
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
                m171081n(t, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof tvx0) {
            this.f150960c = true;
        }
        this.f150958a.put(t, obj);
    }

    /* JADX INFO: renamed from: m */
    public final Iterator<Map.Entry<T, Object>> m171088m() {
        if (this.f150958a.isEmpty()) {
            return Collections.emptyIterator();
        }
        boolean z = this.f150960c;
        m3y0<T, Object> m3y0Var = this.f150958a;
        return z ? new dwx0(m3y0Var.m152975k().iterator()) : m3y0Var.m152975k().iterator();
    }

    /* JADX INFO: renamed from: p */
    public final Iterator<Map.Entry<T, Object>> m171089p() {
        if (this.f150958a.isEmpty()) {
            return Collections.emptyIterator();
        }
        boolean z = this.f150960c;
        m3y0<T, Object> m3y0Var = this.f150958a;
        return z ? new dwx0(m3y0Var.entrySet().iterator()) : m3y0Var.entrySet().iterator();
    }

    /* JADX INFO: renamed from: q */
    public final void m171090q() {
        m3y0<T, Object> m3y0Var;
        if (this.f150959b) {
            return;
        }
        int iM152969a = this.f150958a.m152969a();
        int i = 0;
        while (true) {
            m3y0Var = this.f150958a;
            if (i >= iM152969a) {
                break;
            }
            Object value = m3y0Var.m152972f(i).getValue();
            if (value instanceof AbstractC2349u0) {
                ((AbstractC2349u0) value).m14365y();
            }
            i++;
        }
        Iterator it = m3y0Var.m152973g().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC2349u0) {
                ((AbstractC2349u0) value2).m14365y();
            }
        }
        this.f150958a.mo152976l();
        this.f150959b = true;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m171091r() {
        return this.f150959b;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m171092s() {
        int iM152969a = this.f150958a.m152969a();
        int i = 0;
        while (true) {
            m3y0<T, Object> m3y0Var = this.f150958a;
            if (i >= iM152969a) {
                Iterator it = m3y0Var.m152973g().iterator();
                while (it.hasNext()) {
                    if (!m171082o((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m171082o(m3y0Var.m152972f(i))) {
                return false;
            }
            i++;
        }
    }

    public prx0(m3y0<T, Object> m3y0Var) {
        this.f150958a = m3y0Var;
        m171090q();
    }

    public prx0() {
        this.f150958a = new w3y0();
    }
}
