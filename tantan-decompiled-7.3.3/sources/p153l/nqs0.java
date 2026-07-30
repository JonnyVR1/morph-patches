package p153l;

import android.text.TextUtils;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class nqs0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final d1v0 f143257a;

    public nqs0(d1v0 d1v0Var) {
        this.f143257a = d1v0Var;
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final void mo12917a(Object obj, Map map) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168380l9)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals(TrackLoadSettingsAtom.TYPE) && !TextUtils.isEmpty(str4)) {
                this.f143257a.m113642t8(str2, str4, str3);
            } else if (str.equals("show")) {
                this.f143257a.m113643u8(str2, str3);
            }
        }
    }
}
