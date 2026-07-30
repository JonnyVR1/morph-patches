package p153l;

import com.google.android.gms.common.util.CollectionUtils;
import com.p051p1.mobile.putong.core.data.Portrait;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class hqs0 implements bqs0 {

    /* JADX INFO: renamed from: d */
    public static final Map f111175d = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* JADX INFO: renamed from: a */
    public final w9s0 f111176a;

    /* JADX INFO: renamed from: b */
    public final m0t0 f111177b;

    /* JADX INFO: renamed from: c */
    public final t0t0 f111178c;

    public hqs0(w9s0 w9s0Var, m0t0 m0t0Var, t0t0 t0t0Var) {
        this.f111176a = w9s0Var;
        this.f111177b = m0t0Var;
        this.f111178c = t0t0Var;
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        wit0 wit0Var = (wit0) obj;
        int iIntValue = ((Integer) f111175d.get((String) map.get("a"))).intValue();
        int i = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                w9s0 w9s0Var = this.f111176a;
                if (!w9s0Var.m205627c()) {
                    w9s0Var.m205626b(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.f111177b.m156535i(map);
                    return;
                }
                if (iIntValue == 3) {
                    new p0t0(wit0Var, map).m170182i();
                    return;
                }
                if (iIntValue == 4) {
                    new j0t0(wit0Var, map).m143004j();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.f111177b.m156534h(true);
                        return;
                    } else if (iIntValue != 7) {
                        dct0.m115297f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f111178c.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (wit0Var == null) {
            dct0.m115298g("AdWebView is null");
            return;
        }
        if (Portrait.TYPE.equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = z ? -1 : 14;
        }
        wit0Var.mo13767u0(i);
    }
}
