package p153l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzcei;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class hdw0 {

    /* JADX INFO: renamed from: a */
    public final Context f109049a;

    /* JADX INFO: renamed from: b */
    public final String f109050b;

    /* JADX INFO: renamed from: c */
    public final String f109051c;

    public hdw0(Context context, zzcei zzceiVar) {
        this.f109049a = context;
        this.f109050b = context.getPackageName();
        this.f109051c = zzceiVar.zza;
    }

    /* JADX INFO: renamed from: a */
    public final void m134617a(Map map) {
        map.put(BLiveStormDanmakuGiftResourceType.f45294s, "gmob_sdk");
        map.put(ResourceDirection.f39656v, "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        bxy0.m106934r();
        map.put(Device.TYPE, C2098b.m12353T());
        map.put("app", this.f109050b);
        bxy0.m106934r();
        map.put("is_lite_sdk", true != C2098b.m12365d(this.f109049a) ? "0" : "1");
        dgs0 dgs0Var = sgs0.f168227a;
        List listM120797b = jas0.m144073a().m120797b();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168162U6)).booleanValue()) {
            listM120797b.addAll(bxy0.m106933q().m120264i().zzh().m214926d());
        }
        map.put("e", TextUtils.join(Constants.SEPARATOR_COMMA, listM120797b));
        map.put("sdkVersion", this.f109051c);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168058La)).booleanValue()) {
            bxy0.m106934r();
            map.put("is_bstar", true != C2098b.m12360a(this.f109049a) ? "0" : "1");
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168406n9)).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168256c2)).booleanValue()) {
                map.put("plugin", epw0.m121874c(bxy0.m106933q().m120267n()));
            }
        }
    }
}
