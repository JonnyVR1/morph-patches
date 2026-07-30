package p149l;

import com.immomo.momomediaext.utils.MMLiveUtils;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: classes4.dex */
public class kjx extends h4t<ho2, ljx> {
    public kjx(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        mo51532C(new ljx(bsmVar.f77095a));
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m146282J3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static C22306c<BaseLiveBean> m146284N3(String str) {
        return upv.m194934v(LiveApiBuilder.m67315u(ytr.m216073b("/live-room-info/" + str), new mt0[0]), "getAnchorMediaData", g7t.m124729b(BaseLiveBean.class));
    }

    /* JADX INFO: renamed from: L3 */
    public final void m146285L3(StringBuilder sb, String str) throws JSONException {
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
    public final void m146286M3(StringBuilder sb) {
        if (this.f188512e.f77098d) {
            ((zwl) m129297F3(new tt00(4400))).mo185826g();
            return;
        }
        sb.append("===================");
        sb.append("\r\n");
        sb.append("拉流信息：");
        sb.append("\r\n");
        PullWatchInfo pullWatchInfo = (PullWatchInfo) m129297F3(new vza0(3400));
        if (pullWatchInfo != null) {
            sb.append(pullWatchInfo.showPullInfos());
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m146287O3(StringBuilder sb) {
        sb.append("===================");
        sb.append("\r\n");
        sb.append("版本信息：");
        sb.append("\r\n");
        sb.append(MMLiveUtils.getPusherSDKInfo());
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m146288P3(BaseLiveBean baseLiveBean) {
        try {
            StringBuilder sb = new StringBuilder();
            m146285L3(sb, baseLiveBean.getData());
            m146286M3(sb);
            m146287O3(sb);
            ((ljx) this.viewModel).m150052j(sb.toString());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: R3 */
    public void m146289R3() {
        duringCreated(m146284N3(m206027E2().m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.ijx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113616a.m146288P3((BaseLiveBean) obj);
            }
        }, new e30() { // from class: l.jjx
            @Override // p149l.e30
            public final void call(Object obj) {
                kjx.m146282J3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
    }
}
