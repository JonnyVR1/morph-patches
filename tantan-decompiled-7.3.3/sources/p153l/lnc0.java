package p153l;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes7.dex */
public class lnc0 {

    /* JADX INFO: renamed from: a */
    private LinkedBlockingQueue<hqw> f132756a;

    /* JADX INFO: renamed from: b */
    private int f132757b;

    /* JADX INFO: renamed from: c */
    private int f132758c;

    /* JADX INFO: renamed from: d */
    private int f132759d;

    public lnc0(int i, int i2, int i3) {
        this.f132757b = Math.max(100, Math.max(0, i));
        this.f132759d = Math.max(10, Math.max(0, i2));
        this.f132758c = Math.max(1, Math.max(0, i3));
        this.f132756a = new LinkedBlockingQueue<>(this.f132757b);
    }

    /* JADX INFO: renamed from: a */
    public boolean m154969a() {
        return !this.f132756a.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public List<hqw> m154970b() {
        try {
            ArrayList arrayList = new ArrayList();
            gqw.m131499w("take " + this.f132756a.drainTo(arrayList, this.f132759d) + " records from cache");
            return arrayList;
        } catch (Exception e) {
            gqw.m131497u(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m154971c() {
        return this.f132758c;
    }

    /* JADX INFO: renamed from: d */
    public void m154972d(@NonNull fzv fzvVar) {
        try {
            hqw hqwVarM209467d = x6c.m209467d(fzvVar);
            if (hqwVarM209467d != null) {
                this.f132756a.put(hqwVarM209467d);
                gqw.m131498v("realtime log --> " + fzvVar.toString());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            gqw.m131499w("blocking queue reached to maxSize " + this.f132757b + " waiting...");
        }
    }
}
