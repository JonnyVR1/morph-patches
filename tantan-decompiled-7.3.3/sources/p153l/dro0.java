package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSparkReportConfig;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class dro0 extends qct<oo2> {
    public dro0(dum dumVar) {
        super(dumVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m117694K3(BLiveVoiceSparkReportConfig bLiveVoiceSparkReportConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reportType", bLiveVoiceSparkReportConfig.reportType);
            jSONObject.put("roomType", bLiveVoiceSparkReportConfig.roomType);
            jSONObject.put("voiceLiveId", m213810E2().m202191k());
            jSONObject.put("roomId", m213810E2().m202194o());
        } catch (JSONException unused) {
        } finally {
            LivingNormalApiProvider.m72720o6(jSONObject.toString());
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        final BLiveVoiceSparkReportConfig bLiveVoiceSparkReportConfigM203660k6 = zrv.m221193k().m203660k6();
        if (bLiveVoiceSparkReportConfigM203660k6 != null) {
            m138852B3(bLiveVoiceSparkReportConfigM203660k6.delaySecond, TimeUnit.SECONDS, new Runnable() { // from class: l.cro0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f83346a.m117694K3(bLiveVoiceSparkReportConfigM203660k6);
                }
            });
        }
    }
}
