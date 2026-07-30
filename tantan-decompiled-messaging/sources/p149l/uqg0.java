package p149l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class uqg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n7g0 f177747a;

    public uqg0(n7g0 n7g0Var) {
        this.f177747a = n7g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b1 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:7:0x0008, B:12:0x000f, B:17:0x0024, B:19:0x002c, B:20:0x0034, B:25:0x0040, B:26:0x0048, B:27:0x0051, B:47:0x00a9, B:49:0x00b1, B:50:0x00b9, B:53:0x00c2, B:54:0x00ca, B:55:0x00d3, B:57:0x00d5, B:59:0x00dd, B:60:0x00e5, B:63:0x00ee, B:64:0x00f6, B:65:0x00ff, B:14:0x0018, B:29:0x0054, B:31:0x0058, B:33:0x0060, B:35:0x0064, B:37:0x006c, B:40:0x007b, B:43:0x008c, B:45:0x009b, B:46:0x00a8, B:42:0x0089), top: B:77:0x0003, inners: #0, #1, #3, #4 }] */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int size;
        n7g0 n7g0Var = this.f177747a;
        synchronized (n7g0Var) {
            ArrayList arrayList2 = n7g0Var.f137526u;
            if (arrayList2 != null && !n7g0Var.f137510e) {
                n7g0Var.f137510e = true;
                n7g0Var.f137525t.addAll(arrayList2);
                int i = 0;
                try {
                    if (n7g0Var.f137508c.get() <= 0) {
                        ArrayList arrayList3 = n7g0Var.f137526u;
                        int size2 = arrayList3.size();
                        while (i < size2) {
                            Object obj = arrayList3.get(i);
                            i++;
                            try {
                                n7g0Var.m158128b(((Integer) obj).intValue());
                            } catch (IOException e) {
                                int i2 = n7g0Var.f137515j.f165190b;
                                e.toString();
                            }
                        }
                        n7g0Var.f137516k.mo98394e(n7g0Var.f137515j.f165190b, 3);
                        return;
                    }
                    if (n7g0Var.f137519n == null || n7g0Var.f137519n.isDone()) {
                        arrayList = n7g0Var.f137526u;
                        size = arrayList.size();
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            try {
                                n7g0Var.m158128b(((Integer) obj2).intValue());
                            } catch (IOException e2) {
                                int i3 = n7g0Var.f137515j.f165190b;
                                e2.toString();
                            }
                        }
                        n7g0Var.f137516k.mo98394e(n7g0Var.f137515j.f165190b, 3);
                        return;
                    }
                    if (n7g0Var.f137523r == null && n7g0Var.f137515j.m184802j() != null) {
                        n7g0Var.f137523r = n7g0Var.f137515j.m184802j().getAbsolutePath();
                    }
                    bog0.m102944a().f76520f.f112218a.m150482c(n7g0Var.f137523r);
                    try {
                        n7g0Var.m158129c(-1, true);
                        bog0.m102944a().f76520f.f112218a.m150480a(n7g0Var.f137523r);
                        arrayList = n7g0Var.f137526u;
                        size = arrayList.size();
                        while (i < size) {
                            Object obj3 = arrayList.get(i);
                            i++;
                            n7g0Var.m158128b(((Integer) obj3).intValue());
                        }
                        n7g0Var.f137516k.mo98394e(n7g0Var.f137515j.f165190b, 3);
                        return;
                    } catch (Throwable th) {
                        bog0.m102944a().f76520f.f112218a.m150480a(n7g0Var.f137523r);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ArrayList arrayList4 = n7g0Var.f137526u;
                    int size3 = arrayList4.size();
                    while (i < size3) {
                        Object obj4 = arrayList4.get(i);
                        i++;
                        try {
                            n7g0Var.m158128b(((Integer) obj4).intValue());
                        } catch (IOException e3) {
                            int i4 = n7g0Var.f137515j.f165190b;
                            e3.toString();
                        }
                    }
                    n7g0Var.f137516k.mo98394e(n7g0Var.f137515j.f165190b, 3);
                    throw th2;
                }
                throw th;
            }
        }
    }
}
