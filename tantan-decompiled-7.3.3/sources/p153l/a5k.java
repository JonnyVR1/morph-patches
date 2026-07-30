package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class a5k extends nwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        if (mwl.m160558h(act)) {
            return;
        }
        m160564b(act, "voiceSquare", null);
        Map<String, String> mapM96743f = abe0Var.m96743f();
        boolean z = mapM96743f.containsKey("withNotice") ? Boolean.parseBoolean(mapM96743f.get("withNotice")) : true;
        String str2 = mapM96743f.get("template");
        String str3 = mapM96743f.get("voiceEntranceType");
        String str4 = mapM96743f.get("gameType");
        AnchorStartData.C11592a c11592a = new AnchorStartData.C11592a();
        if (!TextUtils.isEmpty(str3)) {
            c11592a.m68752t(str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            c11592a.m68750r(str2);
        }
        if (!TextUtils.isEmpty(str4)) {
            c11592a.m68748p(str4);
        }
        AnchorStartData anchorStartDataM68743k = c11592a.m68743k();
        if (z) {
            iqn0.m141677e(act, anchorStartDataM68743k);
        } else {
            tbs.f172993f.m143700b(act, anchorStartDataM68743k);
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return mo160563a("voiceAnchor").equals(str);
    }
}
