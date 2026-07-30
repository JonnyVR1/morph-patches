package p153l;

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
public final class ioy0 {

    /* JADX INFO: renamed from: a */
    public static final ioy0 f116230a = new ioy0();

    @VisibleForTesting
    public ioy0() {
    }

    /* JADX INFO: renamed from: a */
    public final zzl m141359a(Context context, xxu0 xxu0Var) {
        String strM167042s;
        String strM213566h = xxu0Var.m213566h();
        Set setM213571m = xxu0Var.m213571m();
        List listUnmodifiableList = !setM213571m.isEmpty() ? Collections.unmodifiableList(new ArrayList(setM213571m)) : null;
        boolean zM213573o = xxu0Var.m213573o(context);
        Bundle bundleM213562d = xxu0Var.m213562d(AdMobAdapter.class);
        String strM213567i = xxu0Var.m213567i();
        xxu0Var.m213564f();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            k6s0.m148569b();
            strM167042s = obt0.m167042s(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strM167042s = null;
        }
        boolean zM213572n = xxu0Var.m213572n();
        RequestConfiguration requestConfigurationM129950c = gdv0.m129942f().m129950c();
        return new zzl(8, -1L, bundleM213562d, -1, listUnmodifiableList, zM213573o, Math.max(xxu0Var.m213560b(), requestConfigurationM129950c.m12279c()), false, strM213567i, null, null, strM213566h, xxu0Var.m213563e(), xxu0Var.m213561c(), Collections.unmodifiableList(new ArrayList(xxu0Var.m213570l())), xxu0Var.m213568j(), strM167042s, zM213572n, null, requestConfigurationM129950c.m12280d(), (String) Collections.max(Arrays.asList(null, requestConfigurationM129950c.m12277a()), new Comparator() { // from class: l.wky0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = RequestConfiguration.f9677f;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            }
        }), xxu0Var.m213569k(), xxu0Var.m213559a(), xxu0Var.m213565g(), requestConfigurationM129950c.m12278b().getValue());
    }
}
