package p149l;

import Sudchar.Suddo;
import com.google.android.gms.internal.measurement.AbstractC2337o0;
import com.google.android.gms.internal.measurement.C2345s0;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzkb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p149l.elx0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class elx0<MessageType extends AbstractC2337o0<MessageType, BuilderType>, BuilderType extends elx0<MessageType, BuilderType>> implements c0y0 {
    /* JADX INFO: renamed from: j */
    public static <T> void m117157j(Iterable<T> iterable, List<? super T> list) {
        ctx0.m108707e(iterable);
        if (iterable instanceof hwx0) {
            List<?> listZza = ((hwx0) iterable).zza();
            hwx0 hwx0Var = (hwx0) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    String str = "Element at index " + (hwx0Var.size() - size) + " is null.";
                    for (int size2 = hwx0Var.size() - 1; size2 >= size; size2--) {
                        hwx0Var.remove(size2);
                    }
                    jfd0.m141176a(str);
                    return;
                }
                if (obj instanceof zzik) {
                    hwx0Var.m133281B((zzik) obj);
                } else if (obj instanceof byte[]) {
                    hwx0Var.m133281B(zzik.zza((byte[]) obj));
                } else {
                    hwx0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof f2y0) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof k2y0) {
                ((k2y0) list).m144361c(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    m117158k(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i = 0; i < size5; i++) {
            Suddo suddo = (Object) list2.get(i);
            if (suddo == null) {
                m117158k(list, size4);
            }
            list.add(suddo);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m117158k(List<?> list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    @Override // p149l.c0y0
    /* JADX INFO: renamed from: J */
    public final /* synthetic */ c0y0 mo104781J(byte[] bArr, C2345s0 c2345s0) throws zzkb {
        return mo14372f(bArr, 0, bArr.length, c2345s0);
    }

    /* JADX INFO: renamed from: c */
    public final String m117159c(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    @Override // 
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType mo14374m(hox0 hox0Var, C2345s0 c2345s0) throws IOException;

    /* JADX INFO: renamed from: e */
    public BuilderType mo14371e(byte[] bArr, int i, int i2) throws zzkb {
        try {
            hox0 hox0VarM132291d = hox0.m132291d(bArr, 0, i2, false);
            mo14374m(hox0VarM132291d, C2345s0.f10257c);
            hox0VarM132291d.mo132298h(0);
            return this;
        } catch (zzkb e) {
            throw e;
        } catch (IOException e2) {
            pkq0.m170054a(m117159c("byte array"), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public BuilderType mo14372f(byte[] bArr, int i, int i2, C2345s0 c2345s0) throws zzkb {
        try {
            hox0 hox0VarM132291d = hox0.m132291d(bArr, 0, i2, false);
            mo14374m(hox0VarM132291d, c2345s0);
            hox0VarM132291d.mo132298h(0);
            return this;
        } catch (zzkb e) {
            throw e;
        } catch (IOException e2) {
            pkq0.m170054a(m117159c("byte array"), e2);
            return null;
        }
    }

    @Override // 
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    @Override // p149l.c0y0
    public final /* synthetic */ c0y0 zza(byte[] bArr) throws zzkb {
        return mo14371e(bArr, 0, bArr.length);
    }
}
