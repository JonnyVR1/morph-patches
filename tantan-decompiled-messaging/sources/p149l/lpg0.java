package p149l;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lpg0 extends Handler {
    public lpg0(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Bitmap bitmapM193253b;
        int i = message.what;
        if (i == 3) {
            oig0 oig0Var = (oig0) message.obj;
            oig0Var.f144114a.m207085b(oig0Var.m164511b());
            return;
        }
        if (i == 8) {
            List list = (List) message.obj;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                l6g0 l6g0Var = (l6g0) list.get(i2);
                x5g0 x5g0Var = l6g0Var.f126622b;
                x5g0Var.getClass();
                oig0 oig0Var2 = l6g0Var.f126631k;
                ArrayList arrayList = l6g0Var.f126632l;
                boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
                if (oig0Var2 != null || z) {
                    Uri uri = l6g0Var.f126627g.f87271a;
                    Exception exc = l6g0Var.f126636p;
                    Bitmap bitmap = l6g0Var.f126633m;
                    int i3 = l6g0Var.f126635o;
                    if (oig0Var2 != null) {
                        x5g0Var.m207084a(bitmap, i3, oig0Var2, exc);
                    }
                    if (z) {
                        int size2 = arrayList.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            x5g0Var.m207084a(bitmap, i3, (oig0) arrayList.get(i4), exc);
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
            oig0 oig0Var3 = (oig0) list2.get(i5);
            x5g0 x5g0Var2 = oig0Var3.f144114a;
            if ((oig0Var3.f144117d & 1) == 0) {
                bitmapM193253b = x5g0Var2.f191141d.m193253b(oig0Var3.f144118e);
                rqg0 rqg0Var = x5g0Var2.f191142e;
                if (bitmapM193253b != null) {
                    rqg0Var.f160631b.sendEmptyMessage(0);
                } else {
                    rqg0Var.f160631b.sendEmptyMessage(1);
                }
            } else {
                bitmapM193253b = null;
            }
            if (bitmapM193253b != null) {
                x5g0Var2.m207084a(bitmapM193253b, 1, oig0Var3, null);
            } else {
                Object objM164511b = oig0Var3.m164511b();
                if (objM164511b != null && x5g0Var2.f191143f.get(objM164511b) != oig0Var3) {
                    x5g0Var2.m207085b(objM164511b);
                    x5g0Var2.f191143f.put(objM164511b, oig0Var3);
                }
                fng0 fng0Var = x5g0Var2.f191140c.f73813h;
                fng0Var.sendMessage(fng0Var.obtainMessage(1, oig0Var3));
            }
        }
    }
}
