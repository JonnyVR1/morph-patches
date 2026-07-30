package p153l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class u7w0 {
    /* JADX INFO: renamed from: a */
    public static zzq m194892a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r6w0 r6w0Var = (r6w0) it.next();
            if (r6w0Var.f161509c) {
                arrayList.add(w70.f187688p);
            } else {
                arrayList.add(new w70(r6w0Var.f161507a, r6w0Var.f161508b));
            }
        }
        return new zzq(context, (w70[]) arrayList.toArray(new w70[arrayList.size()]));
    }

    /* JADX INFO: renamed from: b */
    public static r6w0 m194893b(zzq zzqVar) {
        return zzqVar.zzi ? new r6w0(-3, 0, true) : new r6w0(zzqVar.zze, zzqVar.zzb, false);
    }
}
