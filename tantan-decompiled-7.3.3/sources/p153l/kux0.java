package p153l;

import Sudchar.Suddo;
import com.google.android.gms.internal.measurement.AbstractC2360o0;
import com.google.android.gms.internal.measurement.C2368s0;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzkb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p153l.kux0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kux0<MessageType extends AbstractC2360o0<MessageType, BuilderType>, BuilderType extends kux0<MessageType, BuilderType>> implements i9y0 {
    /* JADX INFO: renamed from: j */
    public static <T> void m151623j(Iterable<T> iterable, List<? super T> list) {
        i2y0.m138253e(iterable);
        if (iterable instanceof n5y0) {
            List<?> listZza = ((n5y0) iterable).zza();
            n5y0 n5y0Var = (n5y0) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    String str = "Element at index " + (n5y0Var.size() - size) + " is null.";
                    for (int size2 = n5y0Var.size() - 1; size2 >= size; size2--) {
                        n5y0Var.remove(size2);
                    }
                    mnd0.m159157a(str);
                    return;
                }
                if (obj instanceof zzik) {
                    n5y0Var.m161737B((zzik) obj);
                } else if (obj instanceof byte[]) {
                    n5y0Var.m161737B(zzik.zza((byte[]) obj));
                } else {
                    n5y0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof lby0) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof qby0) {
                ((qby0) list).m176095c(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    m151624k(list, size4);
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
                m151624k(list, size4);
            }
            list.add(suddo);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m151624k(List<?> list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    @Override // p153l.i9y0
    /* JADX INFO: renamed from: J */
    public final /* synthetic */ i9y0 mo139157J(byte[] bArr, C2368s0 c2368s0) throws zzkb {
        return mo14426f(bArr, 0, bArr.length, c2368s0);
    }

    /* JADX INFO: renamed from: c */
    public final String m151625c(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    @Override // 
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType mo14428m(nxx0 nxx0Var, C2368s0 c2368s0) throws IOException;

    /* JADX INFO: renamed from: e */
    public BuilderType mo14425e(byte[] bArr, int i, int i2) throws zzkb {
        try {
            nxx0 nxx0VarM165305d = nxx0.m165305d(bArr, 0, i2, false);
            mo14428m(nxx0VarM165305d, C2368s0.f10294c);
            nxx0VarM165305d.mo123313h(0);
            return this;
        } catch (zzkb e) {
            throw e;
        } catch (IOException e2) {
            vtq0.m202761a(m151625c("byte array"), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public BuilderType mo14426f(byte[] bArr, int i, int i2, C2368s0 c2368s0) throws zzkb {
        try {
            nxx0 nxx0VarM165305d = nxx0.m165305d(bArr, 0, i2, false);
            mo14428m(nxx0VarM165305d, c2368s0);
            nxx0VarM165305d.mo123313h(0);
            return this;
        } catch (zzkb e) {
            throw e;
        } catch (IOException e2) {
            vtq0.m202761a(m151625c("byte array"), e2);
            return null;
        }
    }

    @Override // 
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    @Override // p153l.i9y0
    public final /* synthetic */ i9y0 zza(byte[] bArr) throws zzkb {
        return mo14425e(bArr, 0, bArr.length);
    }
}
