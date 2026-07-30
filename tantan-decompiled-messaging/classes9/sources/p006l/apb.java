package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.data.Envelope;
import l.stc0;
import l.utc0;
import l.v9j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class apb extends ax6 {
    public apb(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ stc0 m12178a3(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("otherUserIds", jSONArray);
            jSONObject.put("questionLibId", str2);
        } catch (JSONException unused) {
        }
        return C0154a.f3483P.auth().q(xh5.m27250i(str3)).m(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: c3 */
    public c<Envelope> m12180c3(final String str, final String str2) {
        final String str3 = "/tacitTest/invite";
        return this.f8580Q.scheduled("/tacitTest/invite", 0, new v9j() { // from class: l.yob
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.zob
                    public final Object call() {
                        return apb.m12178a3(str, str, str);
                    }
                });
            }
        });
    }
}
