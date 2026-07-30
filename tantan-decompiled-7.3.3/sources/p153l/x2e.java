package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class x2e<T> {

    /* JADX INFO: renamed from: a */
    public final nj80<ArrayList<T>> f192142a = new pj80(10);

    /* JADX INFO: renamed from: b */
    public final oof0<T, ArrayList<T>> f192143b = new oof0<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<T> f192144c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final HashSet<T> f192145d = new HashSet<>();

    /* JADX INFO: renamed from: a */
    public void m209133a(@NonNull T t, @NonNull T t2) {
        if (!this.f192143b.containsKey(t) || !this.f192143b.containsKey(t2)) {
            wg3.m206174a("All nodes must be present in the graph before being added as an edge");
            return;
        }
        ArrayList<T> arrayListM209138f = this.f192143b.get(t);
        if (arrayListM209138f == null) {
            arrayListM209138f = m209138f();
            this.f192143b.put(t, arrayListM209138f);
        }
        arrayListM209138f.add(t2);
    }

    /* JADX INFO: renamed from: b */
    public void m209134b(@NonNull T t) {
        if (this.f192143b.containsKey(t)) {
            return;
        }
        this.f192143b.put(t, null);
    }

    /* JADX INFO: renamed from: c */
    public void m209135c() {
        int size = this.f192143b.size();
        int i = 0;
        while (true) {
            oof0<T, ArrayList<T>> oof0Var = this.f192143b;
            if (i >= size) {
                oof0Var.clear();
                return;
            }
            ArrayList<T> arrayListM168583m = oof0Var.m168583m(i);
            if (arrayListM168583m != null) {
                m209143k(arrayListM168583m);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m209136d(@NonNull T t) {
        return this.f192143b.containsKey(t);
    }

    /* JADX INFO: renamed from: e */
    public final void m209137e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            azk0.m101074a("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f192143b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m209137e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final ArrayList<T> m209138f() {
        ArrayList<T> arrayListAcquire = this.f192142a.acquire();
        return arrayListAcquire == null ? new ArrayList<>() : arrayListAcquire;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public List m209139g(@NonNull T t) {
        return this.f192143b.get(t);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public List<T> m209140h(@NonNull T t) {
        int size = this.f192143b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListM168583m = this.f192143b.m168583m(i);
            if (arrayListM168583m != null && arrayListM168583m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f192143b.m168582i(i));
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public ArrayList<T> m209141i() {
        this.f192144c.clear();
        this.f192145d.clear();
        int size = this.f192143b.size();
        for (int i = 0; i < size; i++) {
            m209137e(this.f192143b.m168582i(i), this.f192144c, this.f192145d);
        }
        return this.f192144c;
    }

    /* JADX INFO: renamed from: j */
    public boolean m209142j(@NonNull T t) {
        int size = this.f192143b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListM168583m = this.f192143b.m168583m(i);
            if (arrayListM168583m != null && arrayListM168583m.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m209143k(@NonNull ArrayList<T> arrayList) {
        arrayList.clear();
        this.f192142a.release(arrayList);
    }
}
