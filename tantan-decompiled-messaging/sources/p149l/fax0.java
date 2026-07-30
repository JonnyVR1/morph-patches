package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fax0 extends jax0 {

    /* JADX INFO: renamed from: c */
    public static final Class f96672c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ fax0(eax0 eax0Var) {
        super(null);
    }

    /* JADX INFO: renamed from: f */
    public static List m120318f(Object obj, long j, int i) {
        List listZzd;
        List list = (List) rcx0.m178838p(obj, j);
        if (list.isEmpty()) {
            if (list instanceof dax0) {
                listZzd = new cax0(i);
            } else {
                listZzd = ((list instanceof gbx0) && (list instanceof z9x0)) ? ((z9x0) list).zzd(i) : new ArrayList(i);
            }
            rcx0.m178818D(obj, j, listZzd);
            return listZzd;
        }
        if (f96672c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            rcx0.m178818D(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof mcx0) {
            cax0 cax0Var = new cax0(list.size() + i);
            cax0Var.addAll(cax0Var.size(), (mcx0) list);
            rcx0.m178818D(obj, j, cax0Var);
            return cax0Var;
        }
        if ((list instanceof gbx0) && (list instanceof z9x0)) {
            z9x0 z9x0Var = (z9x0) list;
            if (!z9x0Var.zzc()) {
                z9x0 z9x0VarZzd = z9x0Var.zzd(list.size() + i);
                rcx0.m178818D(obj, j, z9x0VarZzd);
                return z9x0VarZzd;
            }
        }
        return list;
    }

    @Override // p149l.jax0
    /* JADX INFO: renamed from: a */
    public final List mo120319a(Object obj, long j) {
        return m120318f(obj, j, 10);
    }

    @Override // p149l.jax0
    /* JADX INFO: renamed from: b */
    public final void mo120320b(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) rcx0.m178838p(obj, j);
        if (list instanceof dax0) {
            objUnmodifiableList = ((dax0) list).zze();
        } else {
            if (f96672c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof gbx0) && (list instanceof z9x0)) {
                z9x0 z9x0Var = (z9x0) list;
                if (z9x0Var.zzc()) {
                    z9x0Var.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        rcx0.m178818D(obj, j, objUnmodifiableList);
    }

    @Override // p149l.jax0
    /* JADX INFO: renamed from: c */
    public final void mo120321c(Object obj, Object obj2, long j) {
        List list = (List) rcx0.m178838p(obj2, j);
        List listM120318f = m120318f(obj, j, list.size());
        int size = listM120318f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM120318f.addAll(list);
        }
        if (size > 0) {
            list = listM120318f;
        }
        rcx0.m178818D(obj, j, list);
    }
}
