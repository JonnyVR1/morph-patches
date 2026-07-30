package p153l;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdyz;
import com.p051p1.mobile.putong.data.OMSWidgeAnimationType;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class tst0 implements fst0 {

    /* JADX INFO: renamed from: a */
    public final j0v0 f176040a;

    public tst0(j0v0 j0v0Var) {
        this.f176040a = j0v0Var;
    }

    @Override // p153l.fst0
    /* JADX INFO: renamed from: a */
    public final void mo100273a(Map map) {
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals(OMSWidgeAnimationType.shake)) {
                this.f176040a.m143047l(zzdyz.SHAKE);
                return;
            }
        } else if (str.equals("flick")) {
            this.f176040a.m143047l(zzdyz.FLICK);
            return;
        }
        this.f176040a.m143047l(zzdyz.NONE);
    }
}
