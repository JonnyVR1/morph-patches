package p149l;

import com.p046p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class det extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final String f85854i;

    public det(bsm bsmVar) {
        super(bsmVar);
        this.f85854i = "lotteryRedPacketWatchTime";
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ho2] */
    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m111395L3(LongLinkReportMsg.LiveReportMsg liveReportMsg) {
        m111397N3(liveReportMsg);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reportType", liveReportMsg.getReportType());
            jSONObject.put("roomId", m206027E2().m149818o());
            jSONObject.put("roomType", "live".equals(m206027E2().mo132054A0()) ? "video" : "voice");
            jSONObject.put("anchorUserId", m206027E2().m132146l0().f56011id);
            jSONObject.put("data", liveReportMsg.getData());
        } catch (JSONException unused) {
        }
        LivingNormalApiProvider.m71537o6(jSONObject.toString());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m111396M3(final LongLinkReportMsg.LiveReportMsg liveReportMsg) {
        m129293B3(liveReportMsg.getDelaySeconds(), TimeUnit.SECONDS, new Runnable() { // from class: l.cet
            @Override // java.lang.Runnable
            public final void run() {
                this.f80492a.m111395L3(liveReportMsg);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: N3 */
    public final void m111397N3(LongLinkReportMsg.LiveReportMsg liveReportMsg) {
        if ("lotteryRedPacketWatchTime".equals(liveReportMsg.getReportType())) {
            zvf0.m220371D("e_gift_redpacket_thirty_seconds", mo77274R2(), vwb.m200311Y("anchor_id", m206027E2().m132146l0().f56011id), vwb.m200311Y("live_id", m206027E2().m149814k()), vwb.m200311Y("red_packet_send_id", liveReportMsg.getData()));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132176z0()).subscribe(ffw.m121193d(new e30() { // from class: l.bet
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75237a.m111396M3((LongLinkReportMsg.LiveReportMsg) obj);
            }
        }));
    }
}
