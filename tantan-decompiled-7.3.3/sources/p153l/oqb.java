package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.data.Envelope;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class oqb extends dy6 {
    public oqb(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ x1d0 m168801a3(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("otherUserIds", jSONArray);
            jSONObject.put("questionLibId", str2);
        } catch (JSONException unused) {
        }
        return C4879a.f20236P.auth().m209043q(xi5.m211107i(str3)).m209039m(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: c3 */
    public C22421c<Envelope> m168803c3(final String str, final String str2) {
        final String str3 = "/tacitTest/invite";
        return this.f91137Q.scheduled("/tacitTest/invite", 0, new pcj() { // from class: l.mqb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.nqb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return oqb.m168801a3(str, str, str);
                    }
                });
            }
        });
    }
}
