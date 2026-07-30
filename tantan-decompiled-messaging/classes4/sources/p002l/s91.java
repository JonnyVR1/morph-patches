package p002l;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import java.util.ArrayList;
import java.util.List;
import l.mqi0;
import l.vdt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class s91 {

    /* JADX INFO: renamed from: a */
    public static long f18846a;

    /* JADX INFO: renamed from: b */
    public static long f18847b;

    /* JADX INFO: renamed from: c */
    public static final List<ruf0> f18848c;

    static {
        ArrayList arrayList = new ArrayList();
        f18848c = arrayList;
        if (!vdt.b(2)) {
            arrayList.add(new ezv());
            arrayList.add(new o25());
        }
        arrayList.add(new ve80());
        arrayList.add(new z25());
        arrayList.add(new aql0());
        arrayList.add(new cii());
    }

    /* JADX INFO: renamed from: a */
    public static Intent m22252a(Context context, AudienceStartData audienceStartData) {
        q91 q91Var = new q91();
        uuf0 uuf0Var = new uuf0(null, audienceStartData, context);
        q91Var.m21105c(f18848c, 0, uuf0Var);
        q91Var.mo14047b(uuf0Var);
        BLiveAbsData bLiveAbsData = audienceStartData.live;
        if (bLiveAbsData != null && bLiveAbsData.isNormalLive()) {
            f18846a = mqi0.o();
        }
        f18847b = mqi0.o();
        return uuf0Var.m23632b();
    }

    /* JADX INFO: renamed from: b */
    public static long m22253b() {
        long j = f18846a;
        f18846a = 0L;
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static long m22254c() {
        return f18846a;
    }
}
