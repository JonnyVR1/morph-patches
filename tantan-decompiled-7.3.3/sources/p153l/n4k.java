package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.page.fansgroup.FansGroupActivity;
import com.p051p1.mobile.putong.live.external.page.fansgroup.FansGroupNoticeActivity;

/* JADX INFO: loaded from: classes9.dex */
public class n4k extends nwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        if ("live/fanBaseGroupManage".equals(str)) {
            act.startActivity(FansGroupActivity.m71679X1(act));
        }
        if ("live/fanBaseGroupNotification".equals(str)) {
            act.startActivity(FansGroupNoticeActivity.m71680X1(act));
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return "live/fanBaseGroupManage".equals(str) || "live/fanBaseGroupNotification".equals(str);
    }
}
