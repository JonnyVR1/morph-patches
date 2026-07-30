package p153l;

import com.cosmos.photon.push.service.PushService;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class urg0 extends fng0 {
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    @Override // p153l.oxg0
    /* JADX INFO: renamed from: b */
    public final void mo169706b(JSONObject jSONObject) {
        JSONException jSONException;
        String string;
        String string2;
        String string3;
        String str;
        String str2;
        String str3;
        String str4;
        gfg0 gfg0Var;
        wyg0 wyg0Var;
        vrg0 vrg0Var;
        zkg0 zkg0Var = (zkg0) this;
        String string4 = "";
        try {
            string = jSONObject.getString(PushService.KEY_COMMAND);
            try {
                string2 = jSONObject.getString("param");
                try {
                    string3 = jSONObject.getString("state");
                    try {
                        string4 = jSONObject.getJSONObject("dataJson").toString();
                    } catch (JSONException e) {
                        jSONException = e;
                        jSONException.printStackTrace();
                    }
                } catch (JSONException e2) {
                    jSONException = e2;
                    string3 = "";
                }
            } catch (JSONException e3) {
                jSONException = e3;
                string2 = "";
                string3 = string2;
                jSONException.printStackTrace();
                str = string4;
                str2 = string;
                str3 = string2;
                str4 = string3;
                gsg0 gsg0Var = zkg0Var.f204776c;
                gfg0Var = new gfg0(str4, gsg0Var.f106277b);
                String str5 = "handleCmd cmd = " + str2 + ", param = " + str3 + ", state = " + str4 + ", dataJson = " + str;
                LogUtils.file("SUDGameCustomCommandHandler", str5);
                SudLogger.m222811d(gsg0.f106275c, str5);
                wyg0Var = (wyg0) gsg0Var.f106276a;
                wyg0Var.getClass();
                if (str2.equals("game")) {
                }
                vrg0Var = (vrg0) wyg0Var.f191640a.get(str4);
                if (vrg0Var != null) {
                    vrg0Var.mo115645a(str2, str3, str4, str, gfg0Var);
                } else {
                    wyg0Var.m208616a(str2, str3, str4, str, gfg0Var);
                }
            }
        } catch (JSONException e4) {
            jSONException = e4;
            string = "";
            string2 = string;
        }
        str = string4;
        str2 = string;
        str3 = string2;
        str4 = string3;
        gsg0 gsg0Var2 = zkg0Var.f204776c;
        gfg0Var = new gfg0(str4, gsg0Var2.f106277b);
        String str6 = "handleCmd cmd = " + str2 + ", param = " + str3 + ", state = " + str4 + ", dataJson = " + str;
        LogUtils.file("SUDGameCustomCommandHandler", str6);
        SudLogger.m222811d(gsg0.f106275c, str6);
        wyg0Var = (wyg0) gsg0Var2.f106276a;
        wyg0Var.getClass();
        if (str2.equals("game") && !str2.equals(GameIdentity.player)) {
            try {
                gfg0Var.success(new JSONObject(oeg0.m167367b("cmd not equals game or player")).toString());
                return;
            } catch (JSONException unused) {
                return;
            }
        }
        vrg0Var = (vrg0) wyg0Var.f191640a.get(str4);
        if (vrg0Var != null) {
            vrg0Var.mo115645a(str2, str3, str4, str, gfg0Var);
        } else {
            wyg0Var.m208616a(str2, str3, str4, str, gfg0Var);
        }
    }

    @Override // p153l.oxg0
    /* JADX INFO: renamed from: a */
    public final void mo112981a() {
    }
}
