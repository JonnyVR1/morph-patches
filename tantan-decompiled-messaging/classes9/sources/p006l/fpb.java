package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.GrowthBlindBox;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import l.hpd0;
import l.mkd0;
import l.mqi0;
import l.uqd0;
import l.v9j;
import l.w9j;
import l.zpd0;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class fpb extends ax6 {

    /* JADX INFO: renamed from: R */
    public final zpd0 f12831R;

    /* JADX INFO: renamed from: S */
    public final zpd0 f12832S;

    /* JADX INFO: renamed from: T */
    public final uqd0 f12833T;

    /* JADX INFO: renamed from: U */
    public final hpd0 f12834U;

    public fpb(C0158c c0158c) {
        super(c0158c);
        this.f12831R = new zpd0("youthvip_tab_show_red_dot_time_" + CoreModule.m1850H().userId(), 0L);
        this.f12832S = new zpd0("youthvip_tab_first_default_enter_time_" + CoreModule.m1850H().userId(), 0L);
        this.f12833T = new uqd0("youthvip_tab_blindbox_entrance_h5_url_" + CoreModule.m1850H().userId(), "");
        this.f12834U = new hpd0("youthvip_guide_dialog_shown_" + CoreModule.m1850H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d3 */
    public String m15418d3(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + "&from=youth_vip";
    }

    /* JADX INFO: renamed from: e3 */
    public void m15419e3() {
        this.f12834U.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: f3 */
    public c<GrowthBlindBox> m15420f3() {
        return scheduled("fetch_blindbox_entrance_youthvip", 0, new v9j() { // from class: l.cpb
            public final Object call() {
                return this.f9781a.m15425k3();
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public String m15421g3() {
        return m15418d3((String) this.f12833T.get());
    }

    /* JADX INFO: renamed from: h3 */
    public final boolean m15422h3() {
        try {
            String strF = RemoteConfig.x().F("youth_vip_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("default_youth_vip_tab", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m15423i3() {
        return ((Boolean) this.f12834U.get()).booleanValue();
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ GrowthBlindBox m15424j3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        GrowthBlindBox growthBlindBox = envelope.getModuleData(CoreData.class).blindbox;
        if (NullChecker.a(growthBlindBox) && NullChecker.a(growthBlindBox.view) && !TextUtils.isEmpty(growthBlindBox.view.h5URL)) {
            this.f12833T.put(growthBlindBox.view.h5URL);
        }
        return growthBlindBox;
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ c m15425k3() {
        return ia20.m16571e(new v9j() { // from class: l.dpb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3198Y("/blindbox/entrance?source=young")).f().b();
            }
        }).map(new w9j() { // from class: l.epb
            public final Object call(Object obj) {
                return this.f11387a.m15424j3((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: l3 */
    public boolean m15426l3() {
        return !mqi0.D(((Long) this.f12831R.get()).longValue()) && mqi0.z(12, 0, 0);
    }

    /* JADX INFO: renamed from: m3 */
    public boolean m15427m3() {
        return m15422h3() && !mqi0.D(((Long) this.f12832S.get()).longValue());
    }

    /* JADX INFO: renamed from: n3 */
    public void m15428n3() {
        this.f12834U.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: o3 */
    public void m15429o3() {
        this.f12831R.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: p3 */
    public void m15430p3() {
        this.f12832S.put(Long.valueOf(mqi0.o()));
    }
}
