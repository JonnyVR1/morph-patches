package p149l;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wag0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f185465a;

    public wag0(ArrayList arrayList) {
        this.f185465a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f185465a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            slg0 slg0Var = (slg0) obj;
            slg0Var.f165204p.m140924i(slg0Var, 3, null);
        }
    }
}
