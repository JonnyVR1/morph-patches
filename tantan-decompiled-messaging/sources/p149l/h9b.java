package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.data.OMSConfigEnvelope;
import com.p046p1.mobile.putong.data.OMSThemeInfo;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class h9b extends ax6 {

    /* JADX INFO: renamed from: R */
    public tpd0 f106525R;

    /* JADX INFO: renamed from: S */
    public tpd0 f106526S;

    /* JADX INFO: renamed from: T */
    public tpd0 f106527T;

    /* JADX INFO: renamed from: U */
    public uqd0 f106528U;

    /* JADX INFO: renamed from: V */
    public hpd0 f106529V;

    /* JADX INFO: renamed from: W */
    public hpd0 f106530W;

    /* JADX INFO: renamed from: X */
    public hpd0 f106531X;

    /* JADX INFO: renamed from: Y */
    public hpd0 f106532Y;

    /* JADX INFO: renamed from: Z */
    public hpd0 f106533Z;

    public h9b(C4732c c4732c) {
        super(c4732c);
        this.f106525R = new tpd0("theme_card_answered_count_key" + CoreModule.m29931H().userId(), 0);
        this.f106526S = new tpd0("undertake_pop_count_key" + CoreModule.m29931H().userId(), 0);
        this.f106527T = new tpd0("theme_card_swipe_count_key" + CoreModule.m29931H().userId(), 0);
        this.f106528U = new uqd0("theme_card_swipe_count_to_open_key" + CoreModule.m29931H().userId(), Constants.TEST_IDENTIFIER);
        String str = "show_theme_card_key" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f106529V = new hpd0(str, bool);
        this.f106530W = new hpd0("theme_card_force_first_key" + CoreModule.m29931H().userId(), bool);
        String str2 = "theme_card_need_show_pop_key" + CoreModule.m29931H().userId();
        Boolean bool2 = Boolean.TRUE;
        this.f106531X = new hpd0(str2, bool2);
        this.f106532Y = new hpd0("theme_card_need_show_open_pop_key" + CoreModule.m29931H().userId(), bool2);
        this.f106533Z = new hpd0("theme_card_force_home_page_key" + CoreModule.m29931H().userId(), bool2);
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ OMSThemeInfo m129988b3(OMSConfigEnvelope oMSConfigEnvelope) {
        if (oMSConfigEnvelope.meta.code != 200) {
            return null;
        }
        List<OMSThemeInfo> list = oMSConfigEnvelope.data.themes;
        if (vwb.m200296J(list)) {
            return null;
        }
        OMSThemeInfo oMSThemeInfo = list.get(0);
        ic50.m135327j().m135332e().themes = list;
        yki0.m215127b().m215140m(oMSThemeInfo);
        return oMSThemeInfo;
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ C22306c m129989c3(boolean z, String str, final String str2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("suggestSwitchOn", z);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("questionnaires", new JSONArray(str));
            }
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return ia20.m135122f(new v9j() { // from class: l.f9b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/oms/me/themes/" + str2)).m185893l(utc0VarCreate).m185883b();
            }
        }, OMSConfigEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.g9b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h9b.m129988b3((OMSConfigEnvelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: d3 */
    public C22306c<OMSThemeInfo> m129990d3(final String str, final boolean z, final String str2) {
        return this.f72126Q.scheduled("postThemeCardInfo", -1, new v9j() { // from class: l.e9b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return h9b.m129989c3(z, str2, str);
            }
        }, false);
    }
}
