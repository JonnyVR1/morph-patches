package p153l;

import com.google.android.gms.internal.play_billing.AbstractC2444y;
import com.google.android.gms.internal.play_billing.zzgk;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p153l.clw0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class clw0<MessageType extends AbstractC2444y<MessageType, BuilderType>, BuilderType extends clw0<MessageType, BuilderType>> implements tvx0 {
    /* JADX INFO: renamed from: b */
    public static void m110706b(List list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m110707d(Iterable iterable, List list) {
        Charset charset = srx0.f170385a;
        iterable.getClass();
        if (iterable instanceof zsx0) {
            List listZza = ((zsx0) iterable).zza();
            zsx0 zsx0Var = (zsx0) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    String str = "Element at index " + (zsx0Var.size() - size) + " is null.";
                    int size2 = zsx0Var.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            mnd0.m159157a(str);
                            return;
                        }
                        zsx0Var.remove(size2);
                    }
                } else if (obj instanceof zzgk) {
                    zsx0Var.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    zzgk.zzj(bArr, 0, bArr.length);
                    zsx0Var.zzb();
                } else {
                    zsx0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof bxx0) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof kxx0) {
                ((kxx0) list).m151901f(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    m110706b(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i = 0; i < size5; i++) {
            Object obj3 = list2.get(i);
            if (obj3 == null) {
                m110706b(list, size4);
            }
            list.add(obj3);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: c */
    public abstract clw0 clone();
}
