package p149l;

import com.google.android.gms.internal.ads.AbstractC2222p5;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdg;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class i8x0 {

    /* JADX INFO: renamed from: d */
    public static final i8x0 f112076d = new i8x0(true);

    /* JADX INFO: renamed from: a */
    public final fcx0 f112077a = new vbx0(16);

    /* JADX INFO: renamed from: b */
    public boolean f112078b;

    /* JADX INFO: renamed from: c */
    public boolean f112079c;

    public i8x0(boolean z) {
        m134991b();
        m134991b();
    }

    /* JADX INFO: renamed from: a */
    public static i8x0 m134989a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: d */
    public static final void m134990d(h8x0 h8x0Var, Object obj) {
        boolean z;
        h8x0Var.zzb();
        Charset charset = aax0.f68607a;
        obj.getClass();
        zzhdf zzhdfVar = zzhdf.zza;
        zzhdg zzhdgVar = zzhdg.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(h8x0Var.zza()), h8x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(h8x0Var.zza()), h8x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(h8x0Var.zza()), h8x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(h8x0Var.zza()), h8x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(h8x0Var.zza()), h8x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(h8x0Var.zza()), h8x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case BYTE_STRING:
                if ((obj instanceof zzgyl) || (obj instanceof byte[])) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(h8x0Var.zza()), h8x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof r8x0)) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(h8x0Var.zza()), h8x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case MESSAGE:
                if (obj instanceof zax0) {
                }
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(h8x0Var.zza()), h8x0Var.zzb().zza(), obj.getClass().getName()});
                break;
            default:
                dqi0.m113073a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(h8x0Var.zza()), h8x0Var.zzb().zza(), obj.getClass().getName()});
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m134991b() {
        if (this.f112078b) {
            return;
        }
        int i = 0;
        while (true) {
            int iM120494b = this.f112077a.m120494b();
            fcx0 fcx0Var = this.f112077a;
            if (i >= iM120494b) {
                fcx0Var.mo120493a();
                this.f112078b = true;
                return;
            } else {
                Map.Entry entryM120497g = fcx0Var.m120497g(i);
                if (entryM120497g.getValue() instanceof AbstractC2222p5) {
                    ((AbstractC2222p5) entryM120497g.getValue()).m13176A();
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m134992c(h8x0 h8x0Var, Object obj) {
        if (!h8x0Var.zzc()) {
            m134990d(h8x0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                ig3.m135964a("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m134990d(h8x0Var, arrayList.get(i));
            }
            obj = arrayList;
        }
        this.f112077a.put(h8x0Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        fcx0 fcx0Var;
        i8x0 i8x0Var = new i8x0();
        int i = 0;
        while (true) {
            int iM120494b = this.f112077a.m120494b();
            fcx0Var = this.f112077a;
            if (i >= iM120494b) {
                break;
            }
            Map.Entry entryM120497g = fcx0Var.m120497g(i);
            i8x0Var.m134992c((h8x0) entryM120497g.getKey(), entryM120497g.getValue());
            i++;
        }
        for (Map.Entry entry : fcx0Var.m120495c()) {
            i8x0Var.m134992c((h8x0) entry.getKey(), entry.getValue());
        }
        i8x0Var.f112079c = this.f112079c;
        return i8x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i8x0) {
            return this.f112077a.equals(((i8x0) obj).f112077a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f112077a.hashCode();
    }

    public i8x0() {
    }
}
