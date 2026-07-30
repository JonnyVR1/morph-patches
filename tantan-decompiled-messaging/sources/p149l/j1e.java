package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class j1e<T> {

    /* JADX INFO: renamed from: a */
    public final hb80<ArrayList<T>> f115789a = new jb80(10);

    /* JADX INFO: renamed from: b */
    public final hgf0<T, ArrayList<T>> f115790b = new hgf0<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<T> f115791c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final HashSet<T> f115792d = new HashSet<>();

    /* JADX INFO: renamed from: a */
    public void m139292a(@NonNull T t, @NonNull T t2) {
        if (!this.f115790b.containsKey(t) || !this.f115790b.containsKey(t2)) {
            ig3.m135964a("All nodes must be present in the graph before being added as an edge");
            return;
        }
        ArrayList<T> arrayListM139297f = this.f115790b.get(t);
        if (arrayListM139297f == null) {
            arrayListM139297f = m139297f();
            this.f115790b.put(t, arrayListM139297f);
        }
        arrayListM139297f.add(t2);
    }

    /* JADX INFO: renamed from: b */
    public void m139293b(@NonNull T t) {
        if (this.f115790b.containsKey(t)) {
            return;
        }
        this.f115790b.put(t, null);
    }

    /* JADX INFO: renamed from: c */
    public void m139294c() {
        int size = this.f115790b.size();
        int i = 0;
        while (true) {
            hgf0<T, ArrayList<T>> hgf0Var = this.f115790b;
            if (i >= size) {
                hgf0Var.clear();
                return;
            }
            ArrayList<T> arrayListM130827m = hgf0Var.m130827m(i);
            if (arrayListM130827m != null) {
                m139302k(arrayListM130827m);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m139295d(@NonNull T t) {
        return this.f115790b.containsKey(t);
    }

    /* JADX INFO: renamed from: e */
    public final void m139296e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            upk0.m194883a("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f115790b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m139296e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final ArrayList<T> m139297f() {
        ArrayList<T> arrayListAcquire = this.f115789a.acquire();
        return arrayListAcquire == null ? new ArrayList<>() : arrayListAcquire;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public List m139298g(@NonNull T t) {
        return this.f115790b.get(t);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public List<T> m139299h(@NonNull T t) {
        int size = this.f115790b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListM130827m = this.f115790b.m130827m(i);
            if (arrayListM130827m != null && arrayListM130827m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f115790b.m130823i(i));
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public ArrayList<T> m139300i() {
        this.f115791c.clear();
        this.f115792d.clear();
        int size = this.f115790b.size();
        for (int i = 0; i < size; i++) {
            m139296e(this.f115790b.m130823i(i), this.f115791c, this.f115792d);
        }
        return this.f115791c;
    }

    /* JADX INFO: renamed from: j */
    public boolean m139301j(@NonNull T t) {
        int size = this.f115790b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListM130827m = this.f115790b.m130827m(i);
            if (arrayListM130827m != null && arrayListM130827m.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m139302k(@NonNull ArrayList<T> arrayList) {
        arrayList.clear();
        this.f115789a.release(arrayList);
    }
}
