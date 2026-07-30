package p153l;

import com.google.android.gms.internal.measurement.AbstractC2372u0;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzjc;
import com.google.android.gms.internal.measurement.zzms;
import com.google.android.gms.internal.measurement.zzmz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.e1y0;

/* JADX INFO: loaded from: classes6.dex */
public final class v0y0<T extends e1y0<T>> {

    /* JADX INFO: renamed from: d */
    public static final v0y0<?> f181910d = new v0y0<>(true);

    /* JADX INFO: renamed from: a */
    public final scy0<T, Object> f181911a;

    /* JADX INFO: renamed from: b */
    public boolean f181912b;

    /* JADX INFO: renamed from: c */
    public boolean f181913c;

    public v0y0(boolean z) {
        this(new cdy0());
        m198960q();
    }

    /* JADX INFO: renamed from: b */
    public static int m198944b(zzms zzmsVar, int i, Object obj) {
        int iM14728w0 = zzjc.m14728w0(i);
        if (zzmsVar == zzms.zzj) {
            i2y0.m138255g((m9y0) obj);
            iM14728w0 <<= 1;
        }
        return iM14728w0 + m198945c(zzmsVar, obj);
    }

    /* JADX INFO: renamed from: c */
    public static int m198945c(zzms zzmsVar, Object obj) {
        switch (r0y0.f160735b[zzmsVar.ordinal()]) {
            case 1:
                return zzjc.m14702c(((Double) obj).doubleValue());
            case 2:
                return zzjc.m14704d(((Float) obj).floatValue());
            case 3:
                return zzjc.m14707e0(((Long) obj).longValue());
            case 4:
                return zzjc.m14725r0(((Long) obj).longValue());
            case 5:
                return zzjc.m14718k0(((Integer) obj).intValue());
            case 6:
                return zzjc.m14698W(((Long) obj).longValue());
            case 7:
                return zzjc.m14710g0(((Integer) obj).intValue());
            case 8:
                return zzjc.m14715j(((Boolean) obj).booleanValue());
            case 9:
                return zzjc.m14693G((m9y0) obj);
            case 10:
                return obj instanceof z4y0 ? zzjc.m14711h((z4y0) obj) : zzjc.m14699X((m9y0) obj);
            case 11:
                return obj instanceof zzik ? zzjc.m14691E((zzik) obj) : zzjc.m14692F((String) obj);
            case 12:
                return obj instanceof zzik ? zzjc.m14691E((zzik) obj) : zzjc.m14717k((byte[]) obj);
            case 13:
                return zzjc.m14732z0(((Integer) obj).intValue());
            case 14:
                return zzjc.m14722o0(((Integer) obj).intValue());
            case 15:
                return zzjc.m14716j0(((Long) obj).longValue());
            case 16:
                return zzjc.m14726s0(((Integer) obj).intValue());
            case 17:
                return zzjc.m14721n0(((Long) obj).longValue());
            case 18:
                return obj instanceof w2y0 ? zzjc.m14701b0(((w2y0) obj).zza()) : zzjc.m14701b0(((Integer) obj).intValue());
            default:
                azk0.m101074a("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m198946d(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() != zzmz.MESSAGE || key.zze() || key.zzd()) {
            return m198947e(key, value);
        }
        return value instanceof z4y0 ? zzjc.m14709g(entry.getKey().zza(), (z4y0) value) : zzjc.m14687B(entry.getKey().zza(), (m9y0) value);
    }

    /* JADX INFO: renamed from: e */
    public static int m198947e(e1y0<?> e1y0Var, Object obj) {
        zzms zzmsVarZzb = e1y0Var.zzb();
        int iZza = e1y0Var.zza();
        if (!e1y0Var.zze()) {
            return m198944b(zzmsVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!e1y0Var.zzd()) {
            int iM198944b = 0;
            while (i < size) {
                iM198944b += m198944b(zzmsVarZzb, iZza, list.get(i));
                i++;
            }
            return iM198944b;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iM198945c = 0;
        while (i < size) {
            iM198945c += m198945c(zzmsVarZzb, list.get(i));
            i++;
        }
        return zzjc.m14728w0(iZza) + iM198945c + zzjc.m14732z0(iM198945c);
    }

    /* JADX INFO: renamed from: f */
    public static Object m198948f(Object obj) {
        if (obj instanceof hay0) {
            return ((hay0) obj).zza();
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
    public static <T extends e1y0<T>> v0y0<T> m198949i() {
        return (v0y0<T>) f181910d;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m198950l(Object obj) {
        if (obj instanceof v9y0) {
            return ((v9y0) obj).mo14412a();
        }
        if (obj instanceof z4y0) {
            return true;
        }
        wg3.m206174a("Wrong object type used with protocol message reflection.");
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static void m198951n(T t, Object obj) {
        zzms zzmsVarZzb = t.zzb();
        i2y0.m138253e(obj);
        boolean z = true;
        switch (r0y0.f160734a[zzmsVarZzb.zzb().ordinal()]) {
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
                if (!(obj instanceof Integer) && !(obj instanceof w2y0)) {
                    z = false;
                }
                break;
            case 9:
                if (!(obj instanceof m9y0) && !(obj instanceof z4y0)) {
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
        gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.zzb().zzb(), obj.getClass().getName()});
    }

    /* JADX INFO: renamed from: o */
    public static <T extends e1y0<T>> boolean m198952o(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzmz.MESSAGE) {
            return true;
        }
        if (!key.zze()) {
            return m198950l(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!m198950l(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final int m198953a() {
        scy0<T, Object> scy0Var;
        int iM185401a = this.f181911a.m185401a();
        int i = 0;
        int iM198946d = 0;
        while (true) {
            scy0Var = this.f181911a;
            if (i >= iM185401a) {
                break;
            }
            iM198946d += m198946d(scy0Var.m185404f(i));
            i++;
        }
        Iterator it = scy0Var.m185405g().iterator();
        while (it.hasNext()) {
            iM198946d += m198946d((Map.Entry) it.next());
        }
        return iM198946d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        scy0<T, Object> scy0Var;
        v0y0 v0y0Var = new v0y0();
        int iM185401a = this.f181911a.m185401a();
        int i = 0;
        while (true) {
            scy0Var = this.f181911a;
            if (i >= iM185401a) {
                break;
            }
            Map.Entry<K, Object> entryM185404f = scy0Var.m185404f(i);
            v0y0Var.m198957k((e1y0) entryM185404f.getKey(), entryM185404f.getValue());
            i++;
        }
        Iterator it = scy0Var.m185405g().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            v0y0Var.m198957k((e1y0) entry.getKey(), entry.getValue());
        }
        v0y0Var.f181913c = this.f181913c;
        return v0y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0y0) {
            return this.f181911a.equals(((v0y0) obj).f181911a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final Object m198954g(T t) {
        Object obj = this.f181911a.get(t);
        if (obj instanceof z4y0) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final void m198955h(v0y0<T> v0y0Var) {
        scy0<T, Object> scy0Var;
        int iM185401a = v0y0Var.f181911a.m185401a();
        int i = 0;
        while (true) {
            scy0Var = v0y0Var.f181911a;
            if (i >= iM185401a) {
                break;
            }
            m198956j(scy0Var.m185404f(i));
            i++;
        }
        Iterator it = scy0Var.m185405g().iterator();
        while (it.hasNext()) {
            m198956j((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f181911a.hashCode();
    }

    /* JADX INFO: renamed from: j */
    public final void m198956j(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof z4y0;
        if (key.zze()) {
            if (z) {
                wtq0.m207906a("Lazy fields can not be repeated");
                return;
            }
            Object objM198954g = m198954g(key);
            List list = (List) value;
            int size = list.size();
            if (objM198954g == null) {
                objM198954g = new ArrayList(size);
            }
            List list2 = (List) objM198954g;
            for (int i = 0; i < size; i++) {
                list2.add(m198948f(list.get(i)));
            }
            this.f181911a.put(key, objM198954g);
            return;
        }
        if (key.zzc() != zzmz.MESSAGE) {
            if (z) {
                wtq0.m207906a("Lazy fields must be message-valued");
                return;
            } else {
                this.f181911a.put(key, m198948f(value));
                return;
            }
        }
        Object objM198954g2 = m198954g(key);
        if (objM198954g2 != null) {
            if (z) {
                throw new NoSuchMethodError();
            }
            this.f181911a.put(key, objM198954g2 instanceof hay0 ? key.mo14436d((hay0) objM198954g2, (hay0) value) : key.mo14437k(((m9y0) objM198954g2).mo14410R(), (m9y0) value).mo14423H());
        } else {
            this.f181911a.put(key, m198948f(value));
            if (z) {
                this.f181913c = true;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m198957k(T t, Object obj) {
        if (!t.zze()) {
            m198951n(t, obj);
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
                m198951n(t, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof z4y0) {
            this.f181913c = true;
        }
        this.f181911a.put(t, obj);
    }

    /* JADX INFO: renamed from: m */
    public final Iterator<Map.Entry<T, Object>> m198958m() {
        if (this.f181911a.isEmpty()) {
            return Collections.emptyIterator();
        }
        boolean z = this.f181913c;
        scy0<T, Object> scy0Var = this.f181911a;
        return z ? new j5y0(scy0Var.m185407k().iterator()) : scy0Var.m185407k().iterator();
    }

    /* JADX INFO: renamed from: p */
    public final Iterator<Map.Entry<T, Object>> m198959p() {
        if (this.f181911a.isEmpty()) {
            return Collections.emptyIterator();
        }
        boolean z = this.f181913c;
        scy0<T, Object> scy0Var = this.f181911a;
        return z ? new j5y0(scy0Var.entrySet().iterator()) : scy0Var.entrySet().iterator();
    }

    /* JADX INFO: renamed from: q */
    public final void m198960q() {
        scy0<T, Object> scy0Var;
        if (this.f181912b) {
            return;
        }
        int iM185401a = this.f181911a.m185401a();
        int i = 0;
        while (true) {
            scy0Var = this.f181911a;
            if (i >= iM185401a) {
                break;
            }
            Object value = scy0Var.m185404f(i).getValue();
            if (value instanceof AbstractC2372u0) {
                ((AbstractC2372u0) value).m14419y();
            }
            i++;
        }
        Iterator it = scy0Var.m185405g().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC2372u0) {
                ((AbstractC2372u0) value2).m14419y();
            }
        }
        this.f181911a.mo109265l();
        this.f181912b = true;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m198961r() {
        return this.f181912b;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m198962s() {
        int iM185401a = this.f181911a.m185401a();
        int i = 0;
        while (true) {
            scy0<T, Object> scy0Var = this.f181911a;
            if (i >= iM185401a) {
                Iterator it = scy0Var.m185405g().iterator();
                while (it.hasNext()) {
                    if (!m198952o((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m198952o(scy0Var.m185404f(i))) {
                return false;
            }
            i++;
        }
    }

    public v0y0(scy0<T, Object> scy0Var) {
        this.f181911a = scy0Var;
        m198960q();
    }

    public v0y0() {
        this.f181911a = new cdy0();
    }
}
