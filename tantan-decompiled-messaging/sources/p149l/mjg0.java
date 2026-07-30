package p149l;

import com.cosmos.photon.push.service.PushService;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class mjg0 extends xeg0 {
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    @Override // p149l.gpg0
    /* JADX INFO: renamed from: b */
    public final void mo127353b(JSONObject jSONObject) {
        JSONException jSONException;
        String string;
        String string2;
        String string3;
        String str;
        String str2;
        String str3;
        String str4;
        y6g0 y6g0Var;
        oqg0 oqg0Var;
        njg0 njg0Var;
        rcg0 rcg0Var = (rcg0) this;
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
                yjg0 yjg0Var = rcg0Var.f158771c;
                y6g0Var = new y6g0(str4, yjg0Var.f198633b);
                String str5 = "handleCmd cmd = " + str2 + ", param = " + str3 + ", state = " + str4 + ", dataJson = " + str;
                LogUtils.file("SUDGameCustomCommandHandler", str5);
                SudLogger.m221565d(yjg0.f198631c, str5);
                oqg0Var = (oqg0) yjg0Var.f198632a;
                oqg0Var.getClass();
                if (str2.equals("game")) {
                }
                njg0Var = (njg0) oqg0Var.f145138a.get(str4);
                if (njg0Var != null) {
                    njg0Var.mo100626a(str2, str3, str4, str, y6g0Var);
                } else {
                    oqg0Var.m165427a(str2, str3, str4, str, y6g0Var);
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
        yjg0 yjg0Var2 = rcg0Var.f158771c;
        y6g0Var = new y6g0(str4, yjg0Var2.f198633b);
        String str6 = "handleCmd cmd = " + str2 + ", param = " + str3 + ", state = " + str4 + ", dataJson = " + str;
        LogUtils.file("SUDGameCustomCommandHandler", str6);
        SudLogger.m221565d(yjg0.f198631c, str6);
        oqg0Var = (oqg0) yjg0Var2.f198632a;
        oqg0Var.getClass();
        if (str2.equals("game") && !str2.equals(GameIdentity.player)) {
            try {
                y6g0Var.success(new JSONObject(g6g0.m124590b("cmd not equals game or player")).toString());
                return;
            } catch (JSONException unused) {
                return;
            }
        }
        njg0Var = (njg0) oqg0Var.f145138a.get(str4);
        if (njg0Var != null) {
            njg0Var.mo100626a(str2, str3, str4, str, y6g0Var);
        } else {
            oqg0Var.m165427a(str2, str3, str4, str, y6g0Var);
        }
    }

    @Override // p149l.gpg0
    /* JADX INFO: renamed from: a */
    public final void mo110226a() {
    }
}
