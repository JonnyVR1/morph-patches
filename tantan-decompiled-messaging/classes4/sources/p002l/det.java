package p002l;

import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg;
import com.tantanapp.common.data.DbObject;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.ffw;
import l.j760;
import l.vwb;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class det extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final String f9189i;

    public det(bsm bsmVar) {
        super(bsmVar);
        this.f9189i = "lotteryRedPacketWatchTime";
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ho2] */
    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m11800L3(LongLinkReportMsg.LiveReportMsg liveReportMsg) {
        m11802N3(liveReportMsg);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reportType", liveReportMsg.getReportType());
            jSONObject.put("roomId", m25547E2().m17239o());
            jSONObject.put("roomType", "live".equals(m25547E2().mo14489A0()) ? "video" : "voice");
            jSONObject.put("anchorUserId", ((DbObject) m25547E2().m14582l0()).id);
            jSONObject.put("data", liveReportMsg.getData());
        } catch (JSONException unused) {
        }
        LivingNormalApiProvider.m4903o6(jSONObject.toString());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m11801M3(final LongLinkReportMsg.LiveReportMsg liveReportMsg) {
        m14180B3(liveReportMsg.getDelaySeconds(), TimeUnit.SECONDS, new Runnable() { // from class: l.cet
            @Override // java.lang.Runnable
            public final void run() {
                this.f8620a.m11800L3(liveReportMsg);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: N3 */
    public final void m11802N3(LongLinkReportMsg.LiveReportMsg liveReportMsg) {
        if ("lotteryRedPacketWatchTime".equals(liveReportMsg.getReportType())) {
            zvf0.D("e_gift_redpacket_thirty_seconds", mo21430R2(), new j760[]{vwb.Y("anchor_id", ((DbObject) m25547E2().m14582l0()).id), vwb.Y("live_id", m25547E2().m17235k()), vwb.Y("red_packet_send_id", liveReportMsg.getData())});
        }
    }

    /* JADX INFO: renamed from: T */
    public void m11803T() {
        super.T();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m11804t() {
        super.t();
        duringCreated(m25547E2().m14612z0()).subscribe(ffw.d(new e30() { // from class: l.bet
            public final void call(Object obj) {
                this.f8098a.m11801M3((LongLinkReportMsg.LiveReportMsg) obj);
            }
        }));
    }
}
