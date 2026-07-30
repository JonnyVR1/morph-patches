package p149l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class oyv0 {
    /* JADX INFO: renamed from: a */
    public static zzq m166723a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lxv0 lxv0Var = (lxv0) it.next();
            if (lxv0Var.f130447c) {
                arrayList.add(a80.f67975p);
            } else {
                arrayList.add(new a80(lxv0Var.f130445a, lxv0Var.f130446b));
            }
        }
        return new zzq(context, (a80[]) arrayList.toArray(new a80[arrayList.size()]));
    }

    /* JADX INFO: renamed from: b */
    public static lxv0 m166724b(zzq zzqVar) {
        return zzqVar.zzi ? new lxv0(-3, 0, true) : new lxv0(zzqVar.zze, zzqVar.zzb, false);
    }
}
