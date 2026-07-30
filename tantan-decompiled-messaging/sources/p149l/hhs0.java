package p149l;

import android.text.TextUtils;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class hhs0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final xru0 f107825a;

    public hhs0(xru0 xru0Var) {
        this.f107825a = xru0Var;
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132309l9)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals(TrackLoadSettingsAtom.TYPE) && !TextUtils.isEmpty(str4)) {
                this.f107825a.m210718t8(str2, str4, str3);
            } else if (str.equals("show")) {
                this.f107825a.m210719u8(str2, str3);
            }
        }
    }
}
