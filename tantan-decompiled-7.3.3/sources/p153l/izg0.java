package p153l;

import android.util.SparseArray;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class izg0 implements ehg0 {

    /* JADX INFO: renamed from: a */
    public final SparseArray f117696a;

    /* JADX INFO: renamed from: b */
    public final HashMap f117697b;

    /* JADX INFO: renamed from: c */
    public final fmg0 f117698c;

    /* JADX INFO: renamed from: d */
    public final SparseArray f117699d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f117700e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f117701f;

    public izg0() {
        SparseArray sparseArray = new SparseArray();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        this.f117699d = new SparseArray();
        this.f117696a = sparseArray;
        this.f117701f = arrayList;
        this.f117697b = map;
        this.f117698c = new fmg0();
        int size = sparseArray.size();
        this.f117700e = new ArrayList(size);
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.f117700e;
            if (i >= size) {
                Collections.sort(arrayList2);
                return;
            } else {
                arrayList2.add(Integer.valueOf(((bog0) sparseArray.valueAt(i)).f77674a));
                i++;
            }
        }
    }

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: b */
    public final boolean mo97630b(bog0 bog0Var) {
        String str = bog0Var.f77679f.f136848a;
        if (bog0Var.f77681h && str != null) {
            this.f117697b.put(bog0Var.f77675b, str);
        }
        bog0 bog0Var2 = (bog0) this.f117696a.get(bog0Var.f77674a);
        if (bog0Var2 == null) {
            return false;
        }
        if (bog0Var2 == bog0Var) {
            return true;
        }
        synchronized (this) {
            this.f117696a.put(bog0Var.f77674a, bog0Var.m105677a());
        }
        return true;
    }

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: c */
    public final bog0 mo97631c(aug0 aug0Var) {
        int i = aug0Var.f73493b;
        bog0 bog0Var = new bog0(i, aug0Var.f73494c, aug0Var.f73512u, aug0Var.f73510s.f136848a);
        synchronized (this) {
            this.f117696a.put(i, bog0Var);
            this.f117699d.remove(i);
        }
        return bog0Var;
    }

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: d */
    public final boolean mo97632d(int i) {
        boolean zRemove;
        synchronized (this.f117701f) {
            zRemove = this.f117701f.remove(Integer.valueOf(i));
        }
        return zRemove;
    }

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: e */
    public final void mo97633e(int i, int i2) {
        if (i2 == 1) {
            remove(i);
        }
    }

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: f */
    public final boolean mo97634f(int i) {
        if (this.f117701f.contains(Integer.valueOf(i))) {
            return false;
        }
        synchronized (this.f117701f) {
            try {
                if (this.f117701f.contains(Integer.valueOf(i))) {
                    return false;
                }
                this.f117701f.add(Integer.valueOf(i));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: g */
    public final void mo97635g(bog0 bog0Var, int i, long j) {
        bog0 bog0Var2 = (bog0) this.f117696a.get(bog0Var.f77674a);
        if (bog0Var == bog0Var2) {
            ((akg0) bog0Var2.f77680g.get(i)).f72005c.addAndGet(j);
        } else {
            zpg0.m220844a("Info not on store!");
        }
    }

    @Override // p153l.ehg0
    public final bog0 get(int i) {
        return (bog0) this.f117696a.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final bog0 m142801h(aug0 aug0Var, bog0 bog0Var) {
        SparseArray sparseArrayClone;
        synchronized (this) {
            sparseArrayClone = this.f117696a.clone();
        }
        int size = sparseArrayClone.size();
        for (int i = 0; i < size; i++) {
            bog0 bog0Var2 = (bog0) sparseArrayClone.valueAt(i);
            if (bog0Var2 != bog0Var && bog0Var2.m105678b(aug0Var)) {
                return bog0Var2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized int m142802i() {
        int iNextInt;
        Random random = new Random();
        while (true) {
            iNextInt = random.nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER) + 1;
            if (!this.f117700e.contains(Integer.valueOf(iNextInt)) && !jwg0.m147162a().f122919a.m139607f(iNextInt)) {
                this.f117700e.add(Integer.valueOf(iNextInt));
            }
        }
        return iNextInt;
    }

    @Override // p153l.ehg0
    public final synchronized void remove(int i) {
        try {
            this.f117696a.remove(i);
            if (this.f117699d.get(i) == null) {
                this.f117700e.remove(Integer.valueOf(i));
            }
            fmg0 fmg0Var = this.f117698c;
            String str = (String) fmg0Var.f99779b.get(i);
            if (str != null) {
                fmg0Var.f99778a.remove(str);
                fmg0Var.f99779b.remove(i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ehg0
    /* JADX INFO: renamed from: a */
    public final void mo97629a() {
    }
}
