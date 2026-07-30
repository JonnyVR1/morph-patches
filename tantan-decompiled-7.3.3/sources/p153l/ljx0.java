package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ljx0 extends pjx0 {

    /* JADX INFO: renamed from: c */
    public static final Class f132420c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ ljx0(kjx0 kjx0Var) {
        super(null);
    }

    /* JADX INFO: renamed from: f */
    public static List m154592f(Object obj, long j, int i) {
        List listZzd;
        List list = (List) xlx0.m211703p(obj, j);
        if (list.isEmpty()) {
            if (list instanceof jjx0) {
                listZzd = new ijx0(i);
            } else {
                listZzd = ((list instanceof mkx0) && (list instanceof fjx0)) ? ((fjx0) list).zzd(i) : new ArrayList(i);
            }
            xlx0.m211683D(obj, j, listZzd);
            return listZzd;
        }
        if (f132420c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            xlx0.m211683D(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof slx0) {
            ijx0 ijx0Var = new ijx0(list.size() + i);
            ijx0Var.addAll(ijx0Var.size(), (slx0) list);
            xlx0.m211683D(obj, j, ijx0Var);
            return ijx0Var;
        }
        if ((list instanceof mkx0) && (list instanceof fjx0)) {
            fjx0 fjx0Var = (fjx0) list;
            if (!fjx0Var.zzc()) {
                fjx0 fjx0VarZzd = fjx0Var.zzd(list.size() + i);
                xlx0.m211683D(obj, j, fjx0VarZzd);
                return fjx0VarZzd;
            }
        }
        return list;
    }

    @Override // p153l.pjx0
    /* JADX INFO: renamed from: a */
    public final List mo154593a(Object obj, long j) {
        return m154592f(obj, j, 10);
    }

    @Override // p153l.pjx0
    /* JADX INFO: renamed from: b */
    public final void mo154594b(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) xlx0.m211703p(obj, j);
        if (list instanceof jjx0) {
            objUnmodifiableList = ((jjx0) list).zze();
        } else {
            if (f132420c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof mkx0) && (list instanceof fjx0)) {
                fjx0 fjx0Var = (fjx0) list;
                if (fjx0Var.zzc()) {
                    fjx0Var.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        xlx0.m211683D(obj, j, objUnmodifiableList);
    }

    @Override // p153l.pjx0
    /* JADX INFO: renamed from: c */
    public final void mo154595c(Object obj, Object obj2, long j) {
        List list = (List) xlx0.m211703p(obj2, j);
        List listM154592f = m154592f(obj, j, list.size());
        int size = listM154592f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM154592f.addAll(list);
        }
        if (size > 0) {
            list = listM154592f;
        }
        xlx0.m211683D(obj, j, list);
    }
}
