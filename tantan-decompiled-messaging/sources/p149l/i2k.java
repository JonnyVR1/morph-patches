package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class i2k extends ztl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        if (ytl.m216064h(act)) {
            return;
        }
        m216069b(act, "voiceSquare", null);
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        boolean z = mapM201098f.containsKey("withNotice") ? Boolean.parseBoolean(mapM201098f.get("withNotice")) : true;
        String str2 = mapM201098f.get("template");
        String str3 = mapM201098f.get("voiceEntranceType");
        String str4 = mapM201098f.get("gameType");
        AnchorStartData.C11429a c11429a = new AnchorStartData.C11429a();
        if (!TextUtils.isEmpty(str3)) {
            c11429a.m67569t(str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            c11429a.m67567r(str2);
        }
        if (!TextUtils.isEmpty(str4)) {
            c11429a.m67565p(str4);
        }
        AnchorStartData anchorStartDataM67560k = c11429a.m67560k();
        if (z) {
            ehn0.m116502e(act, anchorStartDataM67560k);
        } else {
            s9s.f163232f.m134369b(act, anchorStartDataM67560k);
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return mo99015a("voiceAnchor").equals(str);
    }
}
