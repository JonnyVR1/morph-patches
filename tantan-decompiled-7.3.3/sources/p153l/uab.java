package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.data.OMSConfigEnvelope;
import com.p051p1.mobile.putong.data.OMSThemeInfo;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class uab extends dy6 {

    /* JADX INFO: renamed from: R */
    public vxd0 f178190R;

    /* JADX INFO: renamed from: S */
    public vxd0 f178191S;

    /* JADX INFO: renamed from: T */
    public vxd0 f178192T;

    /* JADX INFO: renamed from: U */
    public wyd0 f178193U;

    /* JADX INFO: renamed from: V */
    public jxd0 f178194V;

    /* JADX INFO: renamed from: W */
    public jxd0 f178195W;

    /* JADX INFO: renamed from: X */
    public jxd0 f178196X;

    /* JADX INFO: renamed from: Y */
    public jxd0 f178197Y;

    /* JADX INFO: renamed from: Z */
    public jxd0 f178198Z;

    public uab(C4883c c4883c) {
        super(c4883c);
        this.f178190R = new vxd0("theme_card_answered_count_key" + CoreModule.m30929H().userId(), 0);
        this.f178191S = new vxd0("undertake_pop_count_key" + CoreModule.m30929H().userId(), 0);
        this.f178192T = new vxd0("theme_card_swipe_count_key" + CoreModule.m30929H().userId(), 0);
        this.f178193U = new wyd0("theme_card_swipe_count_to_open_key" + CoreModule.m30929H().userId(), Constants.TEST_IDENTIFIER);
        String str = "show_theme_card_key" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f178194V = new jxd0(str, bool);
        this.f178195W = new jxd0("theme_card_force_first_key" + CoreModule.m30929H().userId(), bool);
        String str2 = "theme_card_need_show_pop_key" + CoreModule.m30929H().userId();
        Boolean bool2 = Boolean.TRUE;
        this.f178196X = new jxd0(str2, bool2);
        this.f178197Y = new jxd0("theme_card_need_show_open_pop_key" + CoreModule.m30929H().userId(), bool2);
        this.f178198Z = new jxd0("theme_card_force_home_page_key" + CoreModule.m30929H().userId(), bool2);
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ OMSThemeInfo m195162b3(OMSConfigEnvelope oMSConfigEnvelope) {
        if (oMSConfigEnvelope.meta.code != 200) {
            return null;
        }
        List<OMSThemeInfo> list = oMSConfigEnvelope.data.themes;
        if (jyb.m147479J(list)) {
            return null;
        }
        OMSThemeInfo oMSThemeInfo = list.get(0);
        pk50.m172568j().m172573e().themes = list;
        yti0.m217322b().m217335m(oMSThemeInfo);
        return oMSThemeInfo;
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ C22421c m195163c3(boolean z, String str, final String str2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("suggestSwitchOn", z);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("questionnaires", new JSONArray(str));
            }
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, string);
        return qi20.m176659f(new pcj() { // from class: l.sab
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/oms/me/themes/" + str2)).m209038l(z1d0VarCreate).m209028b();
            }
        }, OMSConfigEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.tab
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uab.m195162b3((OMSConfigEnvelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: d3 */
    public C22421c<OMSThemeInfo> m195164d3(final String str, final boolean z, final String str2) {
        return this.f91137Q.scheduled("postThemeCardInfo", -1, new pcj() { // from class: l.rab
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uab.m195163c3(z, str2, str);
            }
        }, false);
    }
}
