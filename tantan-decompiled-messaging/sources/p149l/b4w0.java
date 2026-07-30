package p149l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzcei;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class b4w0 {

    /* JADX INFO: renamed from: a */
    public final Context f73419a;

    /* JADX INFO: renamed from: b */
    public final String f73420b;

    /* JADX INFO: renamed from: c */
    public final String f73421c;

    public b4w0(Context context, zzcei zzceiVar) {
        this.f73419a = context;
        this.f73420b = context.getPackageName();
        this.f73421c = zzceiVar.zza;
    }

    /* JADX INFO: renamed from: a */
    public final void m100277a(Map map) {
        map.put(BLiveStormDanmakuGiftResourceType.f44446s, "gmob_sdk");
        map.put(ResourceDirection.f38808v, "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        vny0.m199080r();
        map.put(Device.TYPE, C2075b.m12299T());
        map.put("app", this.f73420b);
        vny0.m199080r();
        map.put("is_lite_sdk", true != C2075b.m12311d(this.f73419a) ? "0" : "1");
        x6s0 x6s0Var = m7s0.f132156a;
        List listM213242b = d1s0.m109675a().m213242b();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132091U6)).booleanValue()) {
            listM213242b.addAll(vny0.m199079q().m212279i().zzh().m182045d());
        }
        map.put("e", TextUtils.join(Constants.SEPARATOR_COMMA, listM213242b));
        map.put("sdkVersion", this.f73421c);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131987La)).booleanValue()) {
            vny0.m199080r();
            map.put("is_bstar", true != C2075b.m12306a(this.f73419a) ? "0" : "1");
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132335n9)).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132185c2)).booleanValue()) {
                map.put("plugin", yfw0.m214595c(vny0.m199079q().m212282n()));
            }
        }
    }
}
