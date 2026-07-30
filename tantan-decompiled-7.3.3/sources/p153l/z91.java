package p153l;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class z91 {

    /* JADX INFO: renamed from: a */
    public static long f203435a;

    /* JADX INFO: renamed from: b */
    public static long f203436b;

    /* JADX INFO: renamed from: c */
    public static final List<a3g0> f203437c;

    static {
        ArrayList arrayList = new ArrayList();
        f203437c = arrayList;
        if (!wft.m206159b(2)) {
            arrayList.add(new c1w());
            arrayList.add(new n35());
        }
        arrayList.add(new bn80());
        arrayList.add(new a45());
        arrayList.add(new ezl0());
        arrayList.add(new zki());
    }

    /* JADX INFO: renamed from: a */
    public static Intent m219041a(Context context, AudienceStartData audienceStartData) {
        x91 x91Var = new x91();
        d3g0 d3g0Var = new d3g0(null, audienceStartData, context);
        x91Var.m209762c(f203437c, 0, d3g0Var);
        x91Var.mo170351b(d3g0Var);
        BLiveAbsData bLiveAbsData = audienceStartData.live;
        if (bLiveAbsData != null && bLiveAbsData.isNormalLive()) {
            f203435a = pzi0.m174454o();
        }
        f203436b = pzi0.m174454o();
        return d3g0Var.m113812b();
    }

    /* JADX INFO: renamed from: b */
    public static long m219042b() {
        long j = f203435a;
        f203435a = 0L;
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static long m219043c() {
        return f203435a;
    }
}
