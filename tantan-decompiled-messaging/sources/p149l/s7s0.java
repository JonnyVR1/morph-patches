package p149l;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.util.C2075b;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public final class s7s0 {

    /* JADX INFO: renamed from: a */
    public final String f162932a = (String) m9s0.f132798b.m115379e();

    /* JADX INFO: renamed from: b */
    public final Map f162933b;

    /* JADX INFO: renamed from: c */
    public final Context f162934c;

    /* JADX INFO: renamed from: d */
    public final String f162935d;

    public s7s0(Context context, String str) {
        this.f162934c = context;
        this.f162935d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f162933b = linkedHashMap;
        linkedHashMap.put(BLiveStormDanmakuGiftResourceType.f44446s, "gmob_sdk");
        linkedHashMap.put(ResourceDirection.f38808v, "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        vny0.m199080r();
        linkedHashMap.put(Device.TYPE, C2075b.m12299T());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        vny0.m199080r();
        linkedHashMap.put("is_lite_sdk", true != C2075b.m12311d(context) ? "0" : "1");
        Future futureM181365b = vny0.m199077o().m181365b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((ovs0) futureM181365b.get()).f145841k));
            linkedHashMap.put("network_fine", Integer.toString(((ovs0) futureM181365b.get()).f145842l));
        } catch (Exception e) {
            vny0.m199079q().m212290w(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131987La)).booleanValue()) {
            Map map = this.f162933b;
            vny0.m199080r();
            map.put("is_bstar", true != C2075b.m12306a(context) ? "0" : "1");
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132335n9)).booleanValue()) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132185c2)).booleanValue() || yfw0.m214596d(vny0.m199079q().m212282n())) {
                return;
            }
            this.f162933b.put("plugin", vny0.m199079q().m212282n());
        }
    }

    /* JADX INFO: renamed from: a */
    public final Context m182518a() {
        return this.f162934c;
    }

    /* JADX INFO: renamed from: b */
    public final String m182519b() {
        return this.f162935d;
    }

    /* JADX INFO: renamed from: c */
    public final String m182520c() {
        return this.f162932a;
    }

    /* JADX INFO: renamed from: d */
    public final Map m182521d() {
        return this.f162933b;
    }
}
