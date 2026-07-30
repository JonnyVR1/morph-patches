package p002l;

import com.immomo.momomediaext.utils.MMLiveUtils;
import com.p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Iterator;
import l.bwr;
import l.e30;
import l.ffw;
import l.g7t;
import l.mt0;
import l.upv;
import l.ytr;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kjx extends h4t<ho2, ljx> {
    public kjx(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        C(new ljx(bsmVar.f8332a));
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m16646J3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static c<BaseLiveBean> m16648N3(String str) {
        return upv.v(LiveApiBuilder.u(ytr.b("/live-room-info/" + str), new mt0[0]), "getAnchorMediaData", g7t.b(BaseLiveBean.class));
    }

    /* JADX INFO: renamed from: L3 */
    public final void m16649L3(StringBuilder sb, String str) throws JSONException {
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
    public final void m16650M3(StringBuilder sb) {
        if (this.f22036e.f8335d) {
            ((zwl) m14184F3(new tt00(4400))).mo22656g();
            return;
        }
        sb.append("===================");
        sb.append("\r\n");
        sb.append("拉流信息：");
        sb.append("\r\n");
        PullWatchInfo pullWatchInfo = (PullWatchInfo) m14184F3(new vza0(3400));
        if (pullWatchInfo != null) {
            sb.append(pullWatchInfo.showPullInfos());
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m16651O3(StringBuilder sb) {
        sb.append("===================");
        sb.append("\r\n");
        sb.append("版本信息：");
        sb.append("\r\n");
        sb.append(MMLiveUtils.getPusherSDKInfo());
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m16652P3(BaseLiveBean baseLiveBean) {
        try {
            StringBuilder sb = new StringBuilder();
            m16649L3(sb, baseLiveBean.getData());
            m16650M3(sb);
            m16651O3(sb);
            ((ljx) ((bwr) this).viewModel).m17275j(sb.toString());
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: R3 */
    public void m16653R3() {
        duringCreated(m16648N3(m25547E2().m17239o())).subscribe(ffw.e(new e30() { // from class: l.ijx
            public final void call(Object obj) {
                this.f13280a.m16652P3((BaseLiveBean) obj);
            }
        }, new e30() { // from class: l.jjx
            public final void call(Object obj) {
                kjx.m16646J3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m16654t() {
        super.t();
    }
}
