package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.GrowthBlindBox;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class tqb extends dy6 {

    /* JADX INFO: renamed from: R */
    public final byd0 f175689R;

    /* JADX INFO: renamed from: S */
    public final byd0 f175690S;

    /* JADX INFO: renamed from: T */
    public final wyd0 f175691T;

    /* JADX INFO: renamed from: U */
    public final jxd0 f175692U;

    public tqb(C4883c c4883c) {
        super(c4883c);
        this.f175689R = new byd0("youthvip_tab_show_red_dot_time_" + CoreModule.m30929H().userId(), 0L);
        this.f175690S = new byd0("youthvip_tab_first_default_enter_time_" + CoreModule.m30929H().userId(), 0L);
        this.f175691T = new wyd0("youthvip_tab_blindbox_entrance_h5_url_" + CoreModule.m30929H().userId(), "");
        this.f175692U = new jxd0("youthvip_guide_dialog_shown_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d3 */
    public String m192261d3(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + "&from=youth_vip";
    }

    /* JADX INFO: renamed from: e3 */
    public void m192262e3() {
        this.f175692U.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: f3 */
    public C22421c<GrowthBlindBox> m192263f3() {
        return scheduled("fetch_blindbox_entrance_youthvip", 0, new pcj() { // from class: l.qqb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f158975a.m192268k3();
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public String m192264g3() {
        return m192261d3(this.f175691T.get());
    }

    /* JADX INFO: renamed from: h3 */
    public final boolean m192265h3() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("youth_vip_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).optBoolean("default_youth_vip_tab", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m192266i3() {
        return this.f175692U.get().booleanValue();
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ GrowthBlindBox m192267j3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        GrowthBlindBox growthBlindBox = ((CoreData) envelope.getModuleData(CoreData.class)).blindbox;
        if (NullChecker.m82486a(growthBlindBox) && NullChecker.m82486a(growthBlindBox.view) && !TextUtils.isEmpty(growthBlindBox.view.h5URL)) {
            this.f175691T.put(growthBlindBox.view.h5URL);
        }
        return growthBlindBox;
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ C22421c m192268k3() {
        return qi20.m176658e(new pcj() { // from class: l.rqb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32271Y("/blindbox/entrance?source=young")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.sqb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f170155a.m192267j3((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: l3 */
    public boolean m192269l3() {
        return !pzi0.m174439D(this.f175689R.get().longValue()) && pzi0.m174465z(12, 0, 0);
    }

    /* JADX INFO: renamed from: m3 */
    public boolean m192270m3() {
        return m192265h3() && !pzi0.m174439D(this.f175690S.get().longValue());
    }

    /* JADX INFO: renamed from: n3 */
    public void m192271n3() {
        this.f175692U.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: o3 */
    public void m192272o3() {
        this.f175689R.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: p3 */
    public void m192273p3() {
        this.f175690S.put(Long.valueOf(pzi0.m174454o()));
    }
}
