package p149l;

import com.google.android.gms.common.util.CollectionUtils;
import com.p046p1.mobile.putong.core.data.Portrait;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bhs0 implements vgs0 {

    /* JADX INFO: renamed from: d */
    public static final Map f75659d = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* JADX INFO: renamed from: a */
    public final q0s0 f75660a;

    /* JADX INFO: renamed from: b */
    public final grs0 f75661b;

    /* JADX INFO: renamed from: c */
    public final nrs0 f75662c;

    public bhs0(q0s0 q0s0Var, grs0 grs0Var, nrs0 nrs0Var) {
        this.f75660a = q0s0Var;
        this.f75661b = grs0Var;
        this.f75662c = nrs0Var;
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        q9t0 q9t0Var = (q9t0) obj;
        int iIntValue = ((Integer) f75659d.get((String) map.get("a"))).intValue();
        int i = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                q0s0 q0s0Var = this.f75660a;
                if (!q0s0Var.m172358c()) {
                    q0s0Var.m172357b(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.f75661b.m127767i(map);
                    return;
                }
                if (iIntValue == 3) {
                    new jrs0(q9t0Var, map).m142974i();
                    return;
                }
                if (iIntValue == 4) {
                    new drs0(q9t0Var, map).m113336j();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.f75661b.m127766h(true);
                        return;
                    } else if (iIntValue != 7) {
                        x2t0.m206868f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f75662c.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (q9t0Var == null) {
            x2t0.m206869g("AdWebView is null");
            return;
        }
        if (Portrait.TYPE.equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = z ? -1 : 14;
        }
        q9t0Var.mo13713u0(i);
    }
}
