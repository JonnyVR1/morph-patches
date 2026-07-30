package p149l;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcag;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mhs0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final lhs0 f133908a;

    public mhs0(lhs0 lhs0Var) {
        this.f133908a = lhs0Var;
    }

    /* JADX INFO: renamed from: b */
    public static void m154637b(q9t0 q9t0Var, lhs0 lhs0Var) {
        q9t0Var.mo13693j0("/reward", new mhs0(lhs0Var));
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f133908a.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f133908a.zzb();
                    return;
                }
                return;
            }
        }
        zzcag zzcagVar = null;
        try {
            int i = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcagVar = new zzcag(str2, i);
            }
        } catch (NumberFormatException e) {
            x2t0.m206870h("Unable to parse reward amount.", e);
        }
        this.f133908a.mo102230f0(zzcagVar);
    }
}
