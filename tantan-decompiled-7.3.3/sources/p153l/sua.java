package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.QuickChatPartyType;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class sua extends dy6 {
    public sua(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: h3 */
    public C22421c<uxj0> m188006h3(@NonNull QuickChatPartyType quickChatPartyType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "accept");
            jSONObject.put("partyType", quickChatPartyType.toString());
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return m188007i3(jSONObject);
    }

    /* JADX INFO: renamed from: i3 */
    public final C22421c<uxj0> m188007i3(final JSONObject jSONObject) {
        return this.f91137Q.scheduled("do_quick_chat_party_action", -1, new pcj() { // from class: l.lua
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.nua
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32205G1()).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }).map(new qcj() { // from class: l.oua
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public C22421c<Envelope> m188008j3() {
        return this.f91137Q.scheduled("get_quickchat_party_campaign_page", 0, new pcj() { // from class: l.mua
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.pua
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32213I1()).m209032f().m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public C22421c<Envelope> m188009k3() {
        return this.f91137Q.scheduled("get_quickchat_party_invitation", 0, new pcj() { // from class: l.qua
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.rua
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32217J1()).m209032f().m209028b();
                    }
                });
            }
        });
    }
}
