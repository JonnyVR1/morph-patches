package p153l;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.util.C2098b;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public final class ygs0 {

    /* JADX INFO: renamed from: a */
    public final String f199873a = (String) sis0.f168866b.m149974e();

    /* JADX INFO: renamed from: b */
    public final Map f199874b;

    /* JADX INFO: renamed from: c */
    public final Context f199875c;

    /* JADX INFO: renamed from: d */
    public final String f199876d;

    public ygs0(Context context, String str) {
        this.f199875c = context;
        this.f199876d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f199874b = linkedHashMap;
        linkedHashMap.put(BLiveStormDanmakuGiftResourceType.f45294s, "gmob_sdk");
        linkedHashMap.put(ResourceDirection.f39656v, "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        bxy0.m106934r();
        linkedHashMap.put(Device.TYPE, C2098b.m12353T());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        bxy0.m106934r();
        linkedHashMap.put("is_lite_sdk", true != C2098b.m12365d(context) ? "0" : "1");
        Future futureM209351b = bxy0.m106931o().m209351b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((u4t0) futureM209351b.get()).f177497k));
            linkedHashMap.put("network_fine", Integer.toString(((u4t0) futureM209351b.get()).f177498l));
        } catch (Exception e) {
            bxy0.m106933q().m120275w(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168058La)).booleanValue()) {
            Map map = this.f199874b;
            bxy0.m106934r();
            map.put("is_bstar", true != C2098b.m12360a(context) ? "0" : "1");
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168406n9)).booleanValue()) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168256c2)).booleanValue() || epw0.m121875d(bxy0.m106933q().m120267n())) {
                return;
            }
            this.f199874b.put("plugin", bxy0.m106933q().m120267n());
        }
    }

    /* JADX INFO: renamed from: a */
    public final Context m215877a() {
        return this.f199875c;
    }

    /* JADX INFO: renamed from: b */
    public final String m215878b() {
        return this.f199876d;
    }

    /* JADX INFO: renamed from: c */
    public final String m215879c() {
        return this.f199873a;
    }

    /* JADX INFO: renamed from: d */
    public final Map m215880d() {
        return this.f199874b;
    }
}
