package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.apibean.FanBaseGroupSummaryBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupCountBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class sfg {
    /* JADX INFO: renamed from: a */
    public static C22421c<BaseLiveBean> m185586a(String str, String str2, boolean z) {
        rnl rnlVarM68498u = LiveApiBuilder.m68498u(zvr.m221803c(str + "/audits/" + str2), new st0[0]);
        if (!z) {
            rnlVarM68498u = rnlVarM68498u.m182288p().m182300c("reject", "1").m182301d();
        }
        return LiveExternalApi.buildLivePatch(rnlVarM68498u, "agreeApply", "", h9t.m134085b(BaseLiveBean.class));
    }

    /* JADX INFO: renamed from: b */
    public static C22421c<FanBaseGroupSummaryBean> m185587b(String str, String str2) {
        return LiveExternalApi.buildLivePut(LiveApiBuilder.m68498u(zvr.m221803c(str + "/users/" + str2), new st0[0]), "applyJoin", "", h9t.m134086c(FanBaseGroupSummaryBean.class, "fanbaseGroupSummary"));
    }

    /* JADX INFO: renamed from: c */
    public static C22421c<BaseLiveBean> m185588c(String str) {
        return LiveExternalApi.buildLivePost(LiveApiBuilder.m68498u(zvr.m221801a(str + "/fanbase-groups"), new st0[0]), "createFansGroup", "", h9t.m134085b(BaseLiveBean.class));
    }

    /* JADX INFO: renamed from: d */
    public static C22421c<FanbaseGroupCountBean> m185589d(String str) {
        return LiveExternalApi.buildLiveRead(LiveApiBuilder.m68498u(zvr.m221801a(str + "/audits-counter"), new st0[0]), "getCount", h9t.m134086c(FanbaseGroupCountBean.class, "fanbaseGroupAuditCounter"));
    }

    /* JADX INFO: renamed from: e */
    public static C22421c<FanbaseGroupsBean> m185590e(String str) {
        return LiveExternalApi.buildLiveRead(LiveApiBuilder.m68498u(zvr.m221801a(str + "/fanbase-groups"), new st0[0]), "getFansGroupList", h9t.m134085b(FanbaseGroupsBean.class));
    }

    /* JADX INFO: renamed from: f */
    public static C22421c<BaseLiveListBean<FanbaseGroupAuditsItemBean>> m185591f(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/fanbase-group-audits?");
        if (TextUtils.isEmpty("next")) {
            str2 = "page=1";
        }
        sb.append(str2);
        return LiveExternalApi.buildLiveRead(LiveApiBuilder.m68498u(zvr.m221801a(sb.toString()), new st0[0]), "getNoticeList", h9t.m134084a(FanbaseGroupAuditsItemBean.class, "fanbaseGroupAudits"));
    }
}
