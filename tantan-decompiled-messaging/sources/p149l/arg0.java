package p149l;

import android.util.SparseArray;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class arg0 implements w8g0 {

    /* JADX INFO: renamed from: a */
    public final SparseArray f71265a;

    /* JADX INFO: renamed from: b */
    public final HashMap f71266b;

    /* JADX INFO: renamed from: c */
    public final xdg0 f71267c;

    /* JADX INFO: renamed from: d */
    public final SparseArray f71268d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f71269e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f71270f;

    public arg0() {
        SparseArray sparseArray = new SparseArray();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        this.f71268d = new SparseArray();
        this.f71265a = sparseArray;
        this.f71270f = arrayList;
        this.f71266b = map;
        this.f71267c = new xdg0();
        int size = sparseArray.size();
        this.f71269e = new ArrayList(size);
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.f71269e;
            if (i >= size) {
                Collections.sort(arrayList2);
                return;
            } else {
                arrayList2.add(Integer.valueOf(((tfg0) sparseArray.valueAt(i)).f169975a));
                i++;
            }
        }
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: b */
    public final boolean mo98391b(tfg0 tfg0Var) {
        String str = tfg0Var.f169980f.f90099a;
        if (tfg0Var.f169982h && str != null) {
            this.f71266b.put(tfg0Var.f169976b, str);
        }
        tfg0 tfg0Var2 = (tfg0) this.f71265a.get(tfg0Var.f169975a);
        if (tfg0Var2 == null) {
            return false;
        }
        if (tfg0Var2 == tfg0Var) {
            return true;
        }
        synchronized (this) {
            this.f71265a.put(tfg0Var.f169975a, tfg0Var.m188705a());
        }
        return true;
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: c */
    public final tfg0 mo98392c(slg0 slg0Var) {
        int i = slg0Var.f165190b;
        tfg0 tfg0Var = new tfg0(i, slg0Var.f165191c, slg0Var.f165209u, slg0Var.f165207s.f90099a);
        synchronized (this) {
            this.f71265a.put(i, tfg0Var);
            this.f71268d.remove(i);
        }
        return tfg0Var;
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: d */
    public final boolean mo98393d(int i) {
        boolean zRemove;
        synchronized (this.f71270f) {
            zRemove = this.f71270f.remove(Integer.valueOf(i));
        }
        return zRemove;
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: e */
    public final void mo98394e(int i, int i2) {
        if (i2 == 1) {
            remove(i);
        }
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: f */
    public final boolean mo98395f(int i) {
        if (this.f71270f.contains(Integer.valueOf(i))) {
            return false;
        }
        synchronized (this.f71270f) {
            try {
                if (this.f71270f.contains(Integer.valueOf(i))) {
                    return false;
                }
                this.f71270f.add(Integer.valueOf(i));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: g */
    public final void mo98396g(tfg0 tfg0Var, int i, long j) {
        tfg0 tfg0Var2 = (tfg0) this.f71265a.get(tfg0Var.f169975a);
        if (tfg0Var == tfg0Var2) {
            ((sbg0) tfg0Var2.f169981g.get(i)).f163536c.addAndGet(j);
        } else {
            rhg0.m179353a("Info not on store!");
        }
    }

    @Override // p149l.w8g0
    public final tfg0 get(int i) {
        return (tfg0) this.f71265a.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final tfg0 m98397h(slg0 slg0Var, tfg0 tfg0Var) {
        SparseArray sparseArrayClone;
        synchronized (this) {
            sparseArrayClone = this.f71265a.clone();
        }
        int size = sparseArrayClone.size();
        for (int i = 0; i < size; i++) {
            tfg0 tfg0Var2 = (tfg0) sparseArrayClone.valueAt(i);
            if (tfg0Var2 != tfg0Var && tfg0Var2.m188706b(slg0Var)) {
                return tfg0Var2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized int m98398i() {
        int iNextInt;
        Random random = new Random();
        while (true) {
            iNextInt = random.nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER) + 1;
            if (!this.f71269e.contains(Integer.valueOf(iNextInt)) && !bog0.m102944a().f76515a.m95132f(iNextInt)) {
                this.f71269e.add(Integer.valueOf(iNextInt));
            }
        }
        return iNextInt;
    }

    @Override // p149l.w8g0
    public final synchronized void remove(int i) {
        try {
            this.f71265a.remove(i);
            if (this.f71268d.get(i) == null) {
                this.f71269e.remove(Integer.valueOf(i));
            }
            xdg0 xdg0Var = this.f71267c;
            String str = (String) xdg0Var.f192385b.get(i);
            if (str != null) {
                xdg0Var.f192384a.remove(str);
                xdg0Var.f192385b.remove(i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.w8g0
    /* JADX INFO: renamed from: a */
    public final void mo98390a() {
    }
}
