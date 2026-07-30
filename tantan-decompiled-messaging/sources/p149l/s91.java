package p149l;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class s91 {

    /* JADX INFO: renamed from: a */
    public static long f163131a;

    /* JADX INFO: renamed from: b */
    public static long f163132b;

    /* JADX INFO: renamed from: c */
    public static final List<ruf0> f163133c;

    static {
        ArrayList arrayList = new ArrayList();
        f163133c = arrayList;
        if (!vdt.m198092b(2)) {
            arrayList.add(new ezv());
            arrayList.add(new o25());
        }
        arrayList.add(new ve80());
        arrayList.add(new z25());
        arrayList.add(new aql0());
        arrayList.add(new cii());
    }

    /* JADX INFO: renamed from: a */
    public static Intent m182688a(Context context, AudienceStartData audienceStartData) {
        q91 q91Var = new q91();
        uuf0 uuf0Var = new uuf0(null, audienceStartData, context);
        q91Var.m173581c(f163133c, 0, uuf0Var);
        q91Var.mo128031b(uuf0Var);
        BLiveAbsData bLiveAbsData = audienceStartData.live;
        if (bLiveAbsData != null && bLiveAbsData.isNormalLive()) {
            f163131a = mqi0.m155944o();
        }
        f163132b = mqi0.m155944o();
        return uuf0Var.m195358b();
    }

    /* JADX INFO: renamed from: b */
    public static long m182689b() {
        long j = f163131a;
        f163131a = 0L;
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static long m182690c() {
        return f163131a;
    }
}
