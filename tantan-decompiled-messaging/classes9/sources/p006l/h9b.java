package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.data.OMSConfigEnvelope;
import com.p1.mobile.putong.data.OMSThemeInfo;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import l.hpd0;
import l.ic50;
import l.tpd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.yki0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class h9b extends ax6 {

    /* JADX INFO: renamed from: R */
    public tpd0 f13750R;

    /* JADX INFO: renamed from: S */
    public tpd0 f13751S;

    /* JADX INFO: renamed from: T */
    public tpd0 f13752T;

    /* JADX INFO: renamed from: U */
    public uqd0 f13753U;

    /* JADX INFO: renamed from: V */
    public hpd0 f13754V;

    /* JADX INFO: renamed from: W */
    public hpd0 f13755W;

    /* JADX INFO: renamed from: X */
    public hpd0 f13756X;

    /* JADX INFO: renamed from: Y */
    public hpd0 f13757Y;

    /* JADX INFO: renamed from: Z */
    public hpd0 f13758Z;

    public h9b(C0158c c0158c) {
        super(c0158c);
        this.f13750R = new tpd0("theme_card_answered_count_key" + CoreModule.m1850H().userId(), 0);
        this.f13751S = new tpd0("undertake_pop_count_key" + CoreModule.m1850H().userId(), 0);
        this.f13752T = new tpd0("theme_card_swipe_count_key" + CoreModule.m1850H().userId(), 0);
        this.f13753U = new uqd0("theme_card_swipe_count_to_open_key" + CoreModule.m1850H().userId(), "0_0");
        String str = "show_theme_card_key" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f13754V = new hpd0(str, bool);
        this.f13755W = new hpd0("theme_card_force_first_key" + CoreModule.m1850H().userId(), bool);
        String str2 = "theme_card_need_show_pop_key" + CoreModule.m1850H().userId();
        Boolean bool2 = Boolean.TRUE;
        this.f13756X = new hpd0(str2, bool2);
        this.f13757Y = new hpd0("theme_card_need_show_open_pop_key" + CoreModule.m1850H().userId(), bool2);
        this.f13758Z = new hpd0("theme_card_force_home_page_key" + CoreModule.m1850H().userId(), bool2);
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ OMSThemeInfo m16101b3(OMSConfigEnvelope oMSConfigEnvelope) {
        if (oMSConfigEnvelope.meta.code != 200) {
            return null;
        }
        List list = oMSConfigEnvelope.data.themes;
        if (vwb.J(list)) {
            return null;
        }
        OMSThemeInfo oMSThemeInfo = (OMSThemeInfo) list.get(0);
        ic50.j().e().themes = list;
        yki0.b().m(oMSThemeInfo);
        return oMSThemeInfo;
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ c m16102c3(boolean z, String str, final String str2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("suggestSwitchOn", z);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("questionnaires", new JSONArray(str));
            }
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return ia20.m16572f(new v9j() { // from class: l.f9b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/oms/me/themes/" + str2)).l(utc0VarCreate).b();
            }
        }, OMSConfigEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.g9b
            public final Object call(Object obj) {
                return h9b.m16101b3((OMSConfigEnvelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: d3 */
    public c<OMSThemeInfo> m16103d3(final String str, final boolean z, final String str2) {
        return this.f8580Q.scheduled("postThemeCardInfo", -1, new v9j() { // from class: l.e9b
            public final Object call() {
                return h9b.m16102c3(z, str2, str);
            }
        }, false);
    }
}
