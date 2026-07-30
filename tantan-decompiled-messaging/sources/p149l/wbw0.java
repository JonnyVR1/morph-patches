package p149l;

import com.google.android.gms.internal.play_billing.AbstractC2421y;
import com.google.android.gms.internal.play_billing.zzgk;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p149l.wbw0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wbw0<MessageType extends AbstractC2421y<MessageType, BuilderType>, BuilderType extends wbw0<MessageType, BuilderType>> implements nmx0 {
    /* JADX INFO: renamed from: b */
    public static void m202586b(List list, int i) {
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
    public static void m202587d(Iterable iterable, List list) {
        Charset charset = mix0.f134047a;
        iterable.getClass();
        if (iterable instanceof tjx0) {
            List listZza = ((tjx0) iterable).zza();
            tjx0 tjx0Var = (tjx0) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    String str = "Element at index " + (tjx0Var.size() - size) + " is null.";
                    int size2 = tjx0Var.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            jfd0.m141176a(str);
                            return;
                        }
                        tjx0Var.remove(size2);
                    }
                } else if (obj instanceof zzgk) {
                    tjx0Var.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    zzgk.zzj(bArr, 0, bArr.length);
                    tjx0Var.zzb();
                } else {
                    tjx0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof vnx0) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof eox0) {
                ((eox0) list).m117523f(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    m202586b(list, size4);
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
                m202586b(list, size4);
            }
            list.add(obj3);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: c */
    public abstract wbw0 clone();
}
