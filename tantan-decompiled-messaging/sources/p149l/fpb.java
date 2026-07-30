package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.GrowthBlindBox;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class fpb extends ax6 {

    /* JADX INFO: renamed from: R */
    public final zpd0 f98678R;

    /* JADX INFO: renamed from: S */
    public final zpd0 f98679S;

    /* JADX INFO: renamed from: T */
    public final uqd0 f98680T;

    /* JADX INFO: renamed from: U */
    public final hpd0 f98681U;

    public fpb(C4732c c4732c) {
        super(c4732c);
        this.f98678R = new zpd0("youthvip_tab_show_red_dot_time_" + CoreModule.m29931H().userId(), 0L);
        this.f98679S = new zpd0("youthvip_tab_first_default_enter_time_" + CoreModule.m29931H().userId(), 0L);
        this.f98680T = new uqd0("youthvip_tab_blindbox_entrance_h5_url_" + CoreModule.m29931H().userId(), "");
        this.f98681U = new hpd0("youthvip_guide_dialog_shown_" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d3 */
    public String m122571d3(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + "&from=youth_vip";
    }

    /* JADX INFO: renamed from: e3 */
    public void m122572e3() {
        this.f98681U.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: f3 */
    public C22306c<GrowthBlindBox> m122573f3() {
        return scheduled("fetch_blindbox_entrance_youthvip", 0, new v9j() { // from class: l.cpb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f81913a.m122578k3();
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public String m122574g3() {
        return m122571d3(this.f98680T.get());
    }

    /* JADX INFO: renamed from: h3 */
    public final boolean m122575h3() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("youth_vip_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("default_youth_vip_tab", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m122576i3() {
        return this.f98681U.get().booleanValue();
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ GrowthBlindBox m122577j3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        GrowthBlindBox growthBlindBox = ((CoreData) envelope.getModuleData(CoreData.class)).blindbox;
        if (NullChecker.m81303a(growthBlindBox) && NullChecker.m81303a(growthBlindBox.view) && !TextUtils.isEmpty(growthBlindBox.view.h5URL)) {
            this.f98680T.put(growthBlindBox.view.h5URL);
        }
        return growthBlindBox;
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ C22306c m122578k3() {
        return ia20.m135121e(new v9j() { // from class: l.dpb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31268Y("/blindbox/entrance?source=young")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.epb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f92640a.m122577j3((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: l3 */
    public boolean m122579l3() {
        return !mqi0.m155929D(this.f98678R.get().longValue()) && mqi0.m155955z(12, 0, 0);
    }

    /* JADX INFO: renamed from: m3 */
    public boolean m122580m3() {
        return m122575h3() && !mqi0.m155929D(this.f98679S.get().longValue());
    }

    /* JADX INFO: renamed from: n3 */
    public void m122581n3() {
        this.f98681U.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: o3 */
    public void m122582o3() {
        this.f98678R.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: p3 */
    public void m122583p3() {
        this.f98679S.put(Long.valueOf(mqi0.m155944o()));
    }
}
