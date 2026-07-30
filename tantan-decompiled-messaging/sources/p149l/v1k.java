package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.page.fansgroup.FansGroupActivity;
import com.p046p1.mobile.putong.live.external.page.fansgroup.FansGroupNoticeActivity;

/* JADX INFO: loaded from: classes13.dex */
public class v1k extends ztl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        if ("live/fanBaseGroupManage".equals(str)) {
            act.startActivity(FansGroupActivity.m70496V1(act));
        }
        if ("live/fanBaseGroupNotification".equals(str)) {
            act.startActivity(FansGroupNoticeActivity.m70497V1(act));
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return "live/fanBaseGroupManage".equals(str) || "live/fanBaseGroupNotification".equals(str);
    }
}
