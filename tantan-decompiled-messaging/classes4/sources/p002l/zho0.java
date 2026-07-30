package p002l;

import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSparkReportConfig;
import java.util.concurrent.TimeUnit;
import l.ypv;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zho0 extends pat<ho2> {
    public zho0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m27378K3(BLiveVoiceSparkReportConfig bLiveVoiceSparkReportConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reportType", bLiveVoiceSparkReportConfig.reportType);
            jSONObject.put("roomType", bLiveVoiceSparkReportConfig.roomType);
            jSONObject.put("voiceLiveId", m25547E2().m17235k());
            jSONObject.put("roomId", m25547E2().m17239o());
        } catch (JSONException unused) {
        } finally {
            LivingNormalApiProvider.m4903o6(jSONObject.toString());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m27379t() {
        super.t();
        final BLiveVoiceSparkReportConfig bLiveVoiceSparkReportConfigK6 = ypv.k().k6();
        if (bLiveVoiceSparkReportConfigK6 != null) {
            m14180B3(bLiveVoiceSparkReportConfigK6.delaySecond, TimeUnit.SECONDS, new Runnable() { // from class: l.yho0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22888a.m27378K3(bLiveVoiceSparkReportConfigK6);
                }
            });
        }
    }
}
