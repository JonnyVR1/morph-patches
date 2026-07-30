package p153l;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcag;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class sqs0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final rqs0 f170266a;

    public sqs0(rqs0 rqs0Var) {
        this.f170266a = rqs0Var;
    }

    /* JADX INFO: renamed from: b */
    public static void m187562b(wit0 wit0Var, rqs0 rqs0Var) {
        wit0Var.mo13747j0("/reward", new sqs0(rqs0Var));
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final void mo12917a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f170266a.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f170266a.zzb();
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
            dct0.m115299h("Unable to parse reward amount.", e);
        }
        this.f170266a.mo137038f0(zzcagVar);
    }
}
