package p006l;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.QuickChatPartyType;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import l.roj0;
import l.utc0;
import l.v9j;
import l.w9j;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gta extends ax6 {
    public gta(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: h3 */
    public c<roj0> m15978h3(@NonNull QuickChatPartyType quickChatPartyType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "accept");
            jSONObject.put("partyType", quickChatPartyType.toString());
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return m15979i3(jSONObject);
    }

    /* JADX INFO: renamed from: i3 */
    public final c<roj0> m15979i3(final JSONObject jSONObject) {
        return this.f8580Q.scheduled("do_quick_chat_party_action", -1, new v9j() { // from class: l.zsa
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.bta
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3132G1()).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }).map(new w9j() { // from class: l.cta
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public c<Envelope> m15980j3() {
        return this.f8580Q.scheduled("get_quickchat_party_campaign_page", 0, new v9j() { // from class: l.ata
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.dta
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3140I1()).f().b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public c<Envelope> m15981k3() {
        return this.f8580Q.scheduled("get_quickchat_party_invitation", 0, new v9j() { // from class: l.eta
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.fta
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3144J1()).f().b();
                    }
                });
            }
        });
    }
}
