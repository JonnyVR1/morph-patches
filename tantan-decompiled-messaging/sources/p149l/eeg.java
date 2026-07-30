package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.apibean.FanBaseGroupSummaryBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupCountBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class eeg {
    /* JADX INFO: renamed from: a */
    public static C22306c<BaseLiveBean> m115964a(String str, String str2, boolean z) {
        cll cllVarM67315u = LiveApiBuilder.m67315u(ytr.m216074c(str + "/audits/" + str2), new mt0[0]);
        if (!z) {
            cllVarM67315u = cllVarM67315u.m107524p().m107536c("reject", "1").m107537d();
        }
        return LiveExternalApi.buildLivePatch(cllVarM67315u, "agreeApply", "", g7t.m124729b(BaseLiveBean.class));
    }

    /* JADX INFO: renamed from: b */
    public static C22306c<FanBaseGroupSummaryBean> m115965b(String str, String str2) {
        return LiveExternalApi.buildLivePut(LiveApiBuilder.m67315u(ytr.m216074c(str + "/users/" + str2), new mt0[0]), "applyJoin", "", g7t.m124730c(FanBaseGroupSummaryBean.class, "fanbaseGroupSummary"));
    }

    /* JADX INFO: renamed from: c */
    public static C22306c<BaseLiveBean> m115966c(String str) {
        return LiveExternalApi.buildLivePost(LiveApiBuilder.m67315u(ytr.m216072a(str + "/fanbase-groups"), new mt0[0]), "createFansGroup", "", g7t.m124729b(BaseLiveBean.class));
    }

    /* JADX INFO: renamed from: d */
    public static C22306c<FanbaseGroupCountBean> m115967d(String str) {
        return LiveExternalApi.buildLiveRead(LiveApiBuilder.m67315u(ytr.m216072a(str + "/audits-counter"), new mt0[0]), "getCount", g7t.m124730c(FanbaseGroupCountBean.class, "fanbaseGroupAuditCounter"));
    }

    /* JADX INFO: renamed from: e */
    public static C22306c<FanbaseGroupsBean> m115968e(String str) {
        return LiveExternalApi.buildLiveRead(LiveApiBuilder.m67315u(ytr.m216072a(str + "/fanbase-groups"), new mt0[0]), "getFansGroupList", g7t.m124729b(FanbaseGroupsBean.class));
    }

    /* JADX INFO: renamed from: f */
    public static C22306c<BaseLiveListBean<FanbaseGroupAuditsItemBean>> m115969f(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/fanbase-group-audits?");
        if (TextUtils.isEmpty("next")) {
            str2 = "page=1";
        }
        sb.append(str2);
        return LiveExternalApi.buildLiveRead(LiveApiBuilder.m67315u(ytr.m216072a(sb.toString()), new mt0[0]), "getNoticeList", g7t.m124728a(FanbaseGroupAuditsItemBean.class, "fanbaseGroupAudits"));
    }
}
