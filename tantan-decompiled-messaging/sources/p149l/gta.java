package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.QuickChatPartyType;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class gta extends ax6 {
    public gta(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: h3 */
    public C22306c<roj0> m127916h3(@NonNull QuickChatPartyType quickChatPartyType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "accept");
            jSONObject.put("partyType", quickChatPartyType.toString());
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return m127917i3(jSONObject);
    }

    /* JADX INFO: renamed from: i3 */
    public final C22306c<roj0> m127917i3(final JSONObject jSONObject) {
        return this.f72126Q.scheduled("do_quick_chat_party_action", -1, new v9j() { // from class: l.zsa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.bta
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31202G1()).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }).map(new w9j() { // from class: l.cta
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public C22306c<Envelope> m127918j3() {
        return this.f72126Q.scheduled("get_quickchat_party_campaign_page", 0, new v9j() { // from class: l.ata
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.dta
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31210I1()).m185887f().m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public C22306c<Envelope> m127919k3() {
        return this.f72126Q.scheduled("get_quickchat_party_invitation", 0, new v9j() { // from class: l.eta
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.fta
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31214J1()).m185887f().m185883b();
                    }
                });
            }
        });
    }
}
