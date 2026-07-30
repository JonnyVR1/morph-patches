package p153l;

import com.immomo.momomediaext.utils.MMLiveUtils;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: classes4.dex */
public class hsx extends i6t<oo2, isx> {
    public hsx(dum<? extends oo2> dumVar) {
        super(dumVar);
        mo52715C(new isx(dumVar.f90815a));
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m137047J3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static C22421c<BaseLiveBean> m137049N3(String str) {
        return vrv.m202561v(LiveApiBuilder.m68498u(zvr.m221802b("/live-room-info/" + str), new st0[0]), "getAnchorMediaData", h9t.m134085b(BaseLiveBean.class));
    }

    /* JADX INFO: renamed from: L3 */
    public final void m137050L3(StringBuilder sb, String str) throws JSONException {
        sb.append("主播端信息：");
        sb.append("\r\n");
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            sb.append(next);
            sb.append(":");
            sb.append(strOptString);
            sb.append("\r\n");
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m137051M3(StringBuilder sb) {
        if (this.f196918e.f90818d) {
            ((szl) m138856F3(new c210(4400))).mo101589g();
            return;
        }
        sb.append("===================");
        sb.append("\r\n");
        sb.append("拉流信息：");
        sb.append("\r\n");
        PullWatchInfo pullWatchInfo = (PullWatchInfo) m138856F3(new z7b0(3400));
        if (pullWatchInfo != null) {
            sb.append(pullWatchInfo.showPullInfos());
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m137052O3(StringBuilder sb) {
        sb.append("===================");
        sb.append("\r\n");
        sb.append("版本信息：");
        sb.append("\r\n");
        sb.append(MMLiveUtils.getPusherSDKInfo());
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m137053P3(BaseLiveBean baseLiveBean) {
        try {
            StringBuilder sb = new StringBuilder();
            m137050L3(sb, baseLiveBean.getData());
            m137051M3(sb);
            m137052O3(sb);
            ((isx) this.viewModel).m142005j(sb.toString());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: R3 */
    public void m137054R3() {
        duringCreated(m137049N3(m213810E2().m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.fsx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100696a.m137053P3((BaseLiveBean) obj);
            }
        }, new y20() { // from class: l.gsx
            @Override // p153l.y20
            public final void call(Object obj) {
                hsx.m137047J3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
    }
}
