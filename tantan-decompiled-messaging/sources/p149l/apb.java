package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.data.Envelope;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class apb extends ax6 {
    public apb(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ stc0 m98085a3(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("otherUserIds", jSONArray);
            jSONObject.put("questionLibId", str2);
        } catch (JSONException unused) {
        }
        return C4728a.f19494P.auth().m185898q(xh5.m208761i(str3)).m185894m(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: c3 */
    public C22306c<Envelope> m98087c3(final String str, final String str2) {
        final String str3 = "/tacitTest/invite";
        return this.f72126Q.scheduled("/tacitTest/invite", 0, new v9j() { // from class: l.yob
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.zob
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return apb.m98085a3(str, str, str);
                    }
                });
            }
        });
    }
}
