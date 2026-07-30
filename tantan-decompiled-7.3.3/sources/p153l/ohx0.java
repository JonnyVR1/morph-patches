package p153l;

import com.google.android.gms.internal.ads.AbstractC2245p5;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdg;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ohx0 {

    /* JADX INFO: renamed from: d */
    public static final ohx0 f147495d = new ohx0(true);

    /* JADX INFO: renamed from: a */
    public final llx0 f147496a = new blx0(16);

    /* JADX INFO: renamed from: b */
    public boolean f147497b;

    /* JADX INFO: renamed from: c */
    public boolean f147498c;

    public ohx0(boolean z) {
        m167764b();
        m167764b();
    }

    /* JADX INFO: renamed from: a */
    public static ohx0 m167762a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: d */
    public static final void m167763d(nhx0 nhx0Var, Object obj) {
        boolean z;
        nhx0Var.zzb();
        Charset charset = gjx0.f104688a;
        obj.getClass();
        zzhdf zzhdfVar = zzhdf.zza;
        zzhdg zzhdgVar = zzhdg.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(nhx0Var.zza()), nhx0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(nhx0Var.zza()), nhx0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(nhx0Var.zza()), nhx0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(nhx0Var.zza()), nhx0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(nhx0Var.zza()), nhx0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(nhx0Var.zza()), nhx0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case BYTE_STRING:
                if ((obj instanceof zzgyl) || (obj instanceof byte[])) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(nhx0Var.zza()), nhx0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof xhx0)) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(nhx0Var.zza()), nhx0Var.zzb().zza(), obj.getClass().getName()});
                break;
            case MESSAGE:
                if (obj instanceof fkx0) {
                }
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(nhx0Var.zza()), nhx0Var.zzb().zza(), obj.getClass().getName()});
                break;
            default:
                gzi0.m133102a("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(nhx0Var.zza()), nhx0Var.zzb().zza(), obj.getClass().getName()});
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m167764b() {
        if (this.f147497b) {
            return;
        }
        int i = 0;
        while (true) {
            int iM154804b = this.f147496a.m154804b();
            llx0 llx0Var = this.f147496a;
            if (i >= iM154804b) {
                llx0Var.mo104934a();
                this.f147497b = true;
                return;
            } else {
                Map.Entry entryM154807g = llx0Var.m154807g(i);
                if (entryM154807g.getValue() instanceof AbstractC2245p5) {
                    ((AbstractC2245p5) entryM154807g.getValue()).m13230A();
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m167765c(nhx0 nhx0Var, Object obj) {
        if (!nhx0Var.zzc()) {
            m167763d(nhx0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                wg3.m206174a("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m167763d(nhx0Var, arrayList.get(i));
            }
            obj = arrayList;
        }
        this.f147496a.put(nhx0Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        llx0 llx0Var;
        ohx0 ohx0Var = new ohx0();
        int i = 0;
        while (true) {
            int iM154804b = this.f147496a.m154804b();
            llx0Var = this.f147496a;
            if (i >= iM154804b) {
                break;
            }
            Map.Entry entryM154807g = llx0Var.m154807g(i);
            ohx0Var.m167765c((nhx0) entryM154807g.getKey(), entryM154807g.getValue());
            i++;
        }
        for (Map.Entry entry : llx0Var.m154805c()) {
            ohx0Var.m167765c((nhx0) entry.getKey(), entry.getValue());
        }
        ohx0Var.f147498c = this.f147498c;
        return ohx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ohx0) {
            return this.f147496a.equals(((ohx0) obj).f147496a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f147496a.hashCode();
    }

    public ohx0() {
    }
}
