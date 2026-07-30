package p153l;

import com.p051p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class egt extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public final String f93974i;

    public egt(dum dumVar) {
        super(dumVar);
        this.f93974i = "lotteryRedPacketWatchTime";
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.oo2] */
    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m120803L3(LongLinkReportMsg.LiveReportMsg liveReportMsg) {
        m120805N3(liveReportMsg);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reportType", liveReportMsg.getReportType());
            jSONObject.put("roomId", m213810E2().m202194o());
            jSONObject.put("roomType", "live".equals(m213810E2().mo118362A0()) ? "video" : "voice");
            jSONObject.put("anchorUserId", m213810E2().m168532l0().f56859id);
            jSONObject.put("data", liveReportMsg.getData());
        } catch (JSONException unused) {
        }
        LivingNormalApiProvider.m72720o6(jSONObject.toString());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m120804M3(final LongLinkReportMsg.LiveReportMsg liveReportMsg) {
        m138852B3(liveReportMsg.getDelaySeconds(), TimeUnit.SECONDS, new Runnable() { // from class: l.dgt
            @Override // java.lang.Runnable
            public final void run() {
                this.f88376a.m120803L3(liveReportMsg);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: N3 */
    public final void m120805N3(LongLinkReportMsg.LiveReportMsg liveReportMsg) {
        if ("lotteryRedPacketWatchTime".equals(liveReportMsg.getReportType())) {
            i4g0.m138495D("e_gift_redpacket_thirty_seconds", mo78457R2(), jyb.m147494Y("anchor_id", m213810E2().m168532l0().f56859id), jyb.m147494Y("live_id", m213810E2().m202191k()), jyb.m147494Y("red_packet_send_id", liveReportMsg.getData()));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168560z0()).subscribe(dhw.m115825d(new y20() { // from class: l.cgt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81729a.m120804M3((LongLinkReportMsg.LiveReportMsg) obj);
            }
        }));
    }
}
