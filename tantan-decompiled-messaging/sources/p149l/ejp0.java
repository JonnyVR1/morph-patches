package p149l;

import com.clevertap.android.sdk.Constants;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.net.URI;
import java.util.HashMap;
import org.java_websocket.drafts.Draft_6455;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ejp0 extends fnl {

    /* JADX INFO: renamed from: c */
    private HashMap<String, jzb> f91775c;

    public ejp0(MKWebView mKWebView) {
        super(mKWebView);
        this.f91775c = new HashMap<>();
    }

    @Override // p149l.fnl
    /* JADX INFO: renamed from: h */
    public boolean mo104437h(String str, String str2, JSONObject jSONObject) throws Exception {
        str2.getClass();
        switch (str2) {
            case "send":
                String strOptString = jSONObject.optString(Constants.KEY_KEY);
                String strOptString2 = jSONObject.optString("param");
                jzb jzbVar = this.f91775c.get(strOptString);
                if (jzbVar != null) {
                    if (jzbVar.m143891a() == 1) {
                        jzbVar.send(new String(he2.m130616a(strOptString2.getBytes())));
                    } else {
                        jzbVar.send(he2.m130616a(strOptString2.getBytes()));
                    }
                }
                return true;
            case "disconnect":
                jzb jzbVar2 = this.f91775c.get(jSONObject.optString(Constants.KEY_KEY));
                if (jzbVar2 != null) {
                    jzbVar2.close();
                }
                return true;
            case "connect":
                String strOptString3 = jSONObject.optString("url");
                String strOptString4 = jSONObject.optString(Constants.KEY_KEY);
                int iOptInt = jSONObject.optInt("pType");
                if (!b0g0.m99770c(strOptString3) && !b0g0.m99770c(strOptString4) && iOptInt != 0) {
                    jzb jzbVar3 = new jzb(new URI(strOptString3), new Draft_6455(), strOptString4, iOptInt);
                    jzbVar3.connect();
                    this.f91775c.put(strOptString4, jzbVar3);
                }
                return true;
            default:
                return false;
        }
    }
}
