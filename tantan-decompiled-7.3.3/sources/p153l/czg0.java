package p153l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class czg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vfg0 f84472a;

    public czg0(vfg0 vfg0Var) {
        this.f84472a = vfg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b1 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:7:0x0008, B:12:0x000f, B:17:0x0024, B:19:0x002c, B:20:0x0034, B:25:0x0040, B:26:0x0048, B:27:0x0051, B:47:0x00a9, B:49:0x00b1, B:50:0x00b9, B:53:0x00c2, B:54:0x00ca, B:55:0x00d3, B:57:0x00d5, B:59:0x00dd, B:60:0x00e5, B:63:0x00ee, B:64:0x00f6, B:65:0x00ff, B:14:0x0018, B:29:0x0054, B:31:0x0058, B:33:0x0060, B:35:0x0064, B:37:0x006c, B:40:0x007b, B:43:0x008c, B:45:0x009b, B:46:0x00a8, B:42:0x0089), top: B:77:0x0003, inners: #0, #1, #3, #4 }] */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int size;
        vfg0 vfg0Var = this.f84472a;
        synchronized (vfg0Var) {
            ArrayList arrayList2 = vfg0Var.f183921u;
            if (arrayList2 != null && !vfg0Var.f183905e) {
                vfg0Var.f183905e = true;
                vfg0Var.f183920t.addAll(arrayList2);
                int i = 0;
                try {
                    if (vfg0Var.f183903c.get() <= 0) {
                        ArrayList arrayList3 = vfg0Var.f183921u;
                        int size2 = arrayList3.size();
                        while (i < size2) {
                            Object obj = arrayList3.get(i);
                            i++;
                            try {
                                vfg0Var.m201118b(((Integer) obj).intValue());
                            } catch (IOException e) {
                                int i2 = vfg0Var.f183910j.f73493b;
                                e.toString();
                            }
                        }
                        vfg0Var.f183911k.mo97633e(vfg0Var.f183910j.f73493b, 3);
                        return;
                    }
                    if (vfg0Var.f183914n == null || vfg0Var.f183914n.isDone()) {
                        arrayList = vfg0Var.f183921u;
                        size = arrayList.size();
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            try {
                                vfg0Var.m201118b(((Integer) obj2).intValue());
                            } catch (IOException e2) {
                                int i3 = vfg0Var.f183910j.f73493b;
                                e2.toString();
                            }
                        }
                        vfg0Var.f183911k.mo97633e(vfg0Var.f183910j.f73493b, 3);
                        return;
                    }
                    if (vfg0Var.f183918r == null && vfg0Var.f183910j.m100397j() != null) {
                        vfg0Var.f183918r = vfg0Var.f183910j.m100397j().getAbsolutePath();
                    }
                    jwg0.m147162a().f122924f.f157680a.m192669c(vfg0Var.f183918r);
                    try {
                        vfg0Var.m201119c(-1, true);
                        jwg0.m147162a().f122924f.f157680a.m192667a(vfg0Var.f183918r);
                        arrayList = vfg0Var.f183921u;
                        size = arrayList.size();
                        while (i < size) {
                            Object obj3 = arrayList.get(i);
                            i++;
                            vfg0Var.m201118b(((Integer) obj3).intValue());
                        }
                        vfg0Var.f183911k.mo97633e(vfg0Var.f183910j.f73493b, 3);
                        return;
                    } catch (Throwable th) {
                        jwg0.m147162a().f122924f.f157680a.m192667a(vfg0Var.f183918r);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ArrayList arrayList4 = vfg0Var.f183921u;
                    int size3 = arrayList4.size();
                    while (i < size3) {
                        Object obj4 = arrayList4.get(i);
                        i++;
                        try {
                            vfg0Var.m201118b(((Integer) obj4).intValue());
                        } catch (IOException e3) {
                            int i4 = vfg0Var.f183910j.f73493b;
                            e3.toString();
                        }
                    }
                    vfg0Var.f183911k.mo97633e(vfg0Var.f183910j.f73493b, 3);
                    throw th2;
                }
                throw th;
            }
        }
    }
}
