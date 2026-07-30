package p149l;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class cfy0 {

    /* JADX INFO: renamed from: a */
    public static final cfy0 f80684a = new cfy0();

    @VisibleForTesting
    public cfy0() {
    }

    /* JADX INFO: renamed from: a */
    public final zzl m106615a(Context context, rou0 rou0Var) {
        String strM134089s;
        String strM180255h = rou0Var.m180255h();
        Set setM180260m = rou0Var.m180260m();
        List listUnmodifiableList = !setM180260m.isEmpty() ? Collections.unmodifiableList(new ArrayList(setM180260m)) : null;
        boolean zM180262o = rou0Var.m180262o(context);
        Bundle bundleM180251d = rou0Var.m180251d(AdMobAdapter.class);
        String strM180256i = rou0Var.m180256i();
        rou0Var.m180253f();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            exr0.m118703b();
            strM134089s = i2t0.m134089s(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strM134089s = null;
        }
        boolean zM180261n = rou0Var.m180261n();
        RequestConfiguration requestConfigurationM94939c = a4v0.m94931f().m94939c();
        return new zzl(8, -1L, bundleM180251d, -1, listUnmodifiableList, zM180262o, Math.max(rou0Var.m180249b(), requestConfigurationM94939c.m12225c()), false, strM180256i, null, null, strM180255h, rou0Var.m180252e(), rou0Var.m180250c(), Collections.unmodifiableList(new ArrayList(rou0Var.m180259l())), rou0Var.m180257j(), strM134089s, zM180261n, null, requestConfigurationM94939c.m12226d(), (String) Collections.max(Arrays.asList(null, requestConfigurationM94939c.m12223a()), new Comparator() { // from class: l.qby0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = RequestConfiguration.f9640f;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            }
        }), rou0Var.m180258k(), rou0Var.m180248a(), rou0Var.m180254g(), requestConfigurationM94939c.m12224b().getValue());
    }
}
