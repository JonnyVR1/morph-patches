package p153l;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class txg0 extends Handler {
    public txg0(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Bitmap bitmapM111516b;
        int i = message.what;
        if (i == 3) {
            wqg0 wqg0Var = (wqg0) message.obj;
            wqg0Var.f190400a.m125309b(wqg0Var.m207517b());
            return;
        }
        if (i == 8) {
            List list = (List) message.obj;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                teg0 teg0Var = (teg0) list.get(i2);
                feg0 feg0Var = teg0Var.f173820b;
                feg0Var.getClass();
                wqg0 wqg0Var2 = teg0Var.f173829k;
                ArrayList arrayList = teg0Var.f173830l;
                boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
                if (wqg0Var2 != null || z) {
                    Uri uri = teg0Var.f173825g.f133955a;
                    Exception exc = teg0Var.f173834p;
                    Bitmap bitmap = teg0Var.f173831m;
                    int i3 = teg0Var.f173833o;
                    if (wqg0Var2 != null) {
                        feg0Var.m125308a(bitmap, i3, wqg0Var2, exc);
                    }
                    if (z) {
                        int size2 = arrayList.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            feg0Var.m125308a(bitmap, i3, (wqg0) arrayList.get(i4), exc);
                        }
                    }
                }
            }
            return;
        }
        if (i != 13) {
            throw new AssertionError("Unknown handler message received: " + message.what);
        }
        List list2 = (List) message.obj;
        int size3 = list2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            wqg0 wqg0Var3 = (wqg0) list2.get(i5);
            feg0 feg0Var2 = wqg0Var3.f190400a;
            if ((wqg0Var3.f190403d & 1) == 0) {
                bitmapM111516b = feg0Var2.f98670d.m111516b(wqg0Var3.f190404e);
                zyg0 zyg0Var = feg0Var2.f98671e;
                if (bitmapM111516b != null) {
                    zyg0Var.f206579b.sendEmptyMessage(0);
                } else {
                    zyg0Var.f206579b.sendEmptyMessage(1);
                }
            } else {
                bitmapM111516b = null;
            }
            if (bitmapM111516b != null) {
                feg0Var2.m125308a(bitmapM111516b, 1, wqg0Var3, null);
            } else {
                Object objM207517b = wqg0Var3.m207517b();
                if (objM207517b != null && feg0Var2.f98672f.get(objM207517b) != wqg0Var3) {
                    feg0Var2.m125309b(objM207517b);
                    feg0Var2.f98672f.put(objM207517b, wqg0Var3);
                }
                nvg0 nvg0Var = feg0Var2.f98669c.f120493h;
                nvg0Var.sendMessage(nvg0Var.obtainMessage(1, wqg0Var3));
            }
        }
    }
}
