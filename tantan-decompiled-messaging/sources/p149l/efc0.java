package p149l;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes7.dex */
public class efc0 {

    /* JADX INFO: renamed from: a */
    private LinkedBlockingQueue<jnw> f90819a;

    /* JADX INFO: renamed from: b */
    private int f90820b;

    /* JADX INFO: renamed from: c */
    private int f90821c;

    /* JADX INFO: renamed from: d */
    private int f90822d;

    public efc0(int i, int i2, int i3) {
        this.f90820b = Math.max(100, Math.max(0, i));
        this.f90822d = Math.max(10, Math.max(0, i2));
        this.f90821c = Math.max(1, Math.max(0, i3));
        this.f90819a = new LinkedBlockingQueue<>(this.f90820b);
    }

    /* JADX INFO: renamed from: a */
    public boolean m116027a() {
        return !this.f90819a.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public List<jnw> m116028b() {
        try {
            ArrayList arrayList = new ArrayList();
            inw.m137185w("take " + this.f90819a.drainTo(arrayList, this.f90822d) + " records from cache");
            return arrayList;
        } catch (Exception e) {
            inw.m137183u(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m116029c() {
        return this.f90821c;
    }

    /* JADX INFO: renamed from: d */
    public void m116030d(@NonNull gxv gxvVar) {
        try {
            jnw jnwVarM177930d = r5c.m177930d(gxvVar);
            if (jnwVarM177930d != null) {
                this.f90819a.put(jnwVarM177930d);
                inw.m137184v("realtime log --> " + gxvVar.toString());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            inw.m137185w("blocking queue reached to maxSize " + this.f90820b + " waiting...");
        }
    }
}
