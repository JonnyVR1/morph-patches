package p149l;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdyz;
import com.p046p1.mobile.putong.data.OMSWidgeAnimationType;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class njt0 implements zit0 {

    /* JADX INFO: renamed from: a */
    public final dru0 f139333a;

    public njt0(dru0 dru0Var) {
        this.f139333a = dru0Var;
    }

    @Override // p149l.zit0
    /* JADX INFO: renamed from: a */
    public final void mo102229a(Map map) {
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals(OMSWidgeAnimationType.shake)) {
                this.f139333a.m113350l(zzdyz.SHAKE);
                return;
            }
        } else if (str.equals("flick")) {
            this.f139333a.m113350l(zzdyz.FLICK);
            return;
        }
        this.f139333a.m113350l(zzdyz.NONE);
    }
}
