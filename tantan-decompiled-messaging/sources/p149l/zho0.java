package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSparkReportConfig;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class zho0 extends pat<ho2> {
    public zho0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m218827K3(BLiveVoiceSparkReportConfig bLiveVoiceSparkReportConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reportType", bLiveVoiceSparkReportConfig.reportType);
            jSONObject.put("roomType", bLiveVoiceSparkReportConfig.roomType);
            jSONObject.put("voiceLiveId", m206027E2().m149814k());
            jSONObject.put("roomId", m206027E2().m149818o());
        } catch (JSONException unused) {
        } finally {
            LivingNormalApiProvider.m71537o6(jSONObject.toString());
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        final BLiveVoiceSparkReportConfig bLiveVoiceSparkReportConfigM195873k6 = ypv.m215672k().m195873k6();
        if (bLiveVoiceSparkReportConfigM195873k6 != null) {
            m129293B3(bLiveVoiceSparkReportConfigM195873k6.delaySecond, TimeUnit.SECONDS, new Runnable() { // from class: l.yho0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f198377a.m218827K3(bLiveVoiceSparkReportConfigM195873k6);
                }
            });
        }
    }
}
