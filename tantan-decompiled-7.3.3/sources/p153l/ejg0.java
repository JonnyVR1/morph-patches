package p153l;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ejg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f94299a;

    public ejg0(ArrayList arrayList) {
        this.f94299a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f94299a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            aug0 aug0Var = (aug0) obj;
            aug0Var.f73507p.m181856i(aug0Var, 3, null);
        }
    }
}
