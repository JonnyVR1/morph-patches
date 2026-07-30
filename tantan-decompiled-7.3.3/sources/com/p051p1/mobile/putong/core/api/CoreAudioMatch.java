package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.CoreAudioMatch;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.VoiceChatInfo;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.dy6;
import p153l.jyb;
import p153l.pcj;
import p153l.psd0;
import p153l.qcj;
import p153l.ti20;
import p153l.uxj0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreAudioMatch extends dy6 {

    public enum AudioMatchError {
        NETWORK,
        TIMEOUT
    }

    public enum AudioMatchStatus {
        IDLE,
        SEARCHING,
        PAUSED,
        MATCHED,
        ERROR
    }

    public CoreAudioMatch(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ Pair m31044l3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (!NullChecker.m82487b(coreData) || !NullChecker.m82486a(coreData.voicechat) || !NullChecker.m82486a(coreData.voicechat.otherID) || !NullChecker.m82486a(coreData.voicechat.conversationID)) {
            return null;
        }
        VoiceChatInfo voiceChatInfo = coreData.voicechat;
        return Pair.create(voiceChatInfo.otherID, voiceChatInfo.conversationID);
    }

    /* JADX INFO: renamed from: o3 */
    public static String m31047o3(boolean z) {
        return z ? "coin" : "privilege";
    }

    /* JADX INFO: renamed from: p3 */
    public C22421c<uxj0> m31048p3(String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "accept");
            jSONObject.put("secretKey", str);
            jSONObject.put("consumeType", str2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return this.f91137Q.scheduled("accept_audio_broadcast", 0, new pcj() { // from class: l.iz6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.cz6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32221K1("/me")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }).map(new qcj() { // from class: l.dz6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final void m31049q3(User user) {
        this.f91137Q.f20384f0.m33905ap(user.f56859id);
        Relationship relationshipNew_ = Relationship.new_();
        relationshipNew_.conversationStatus = ConversationStatus.get("pending");
        ArrayList arrayList = new ArrayList();
        arrayList.add(MatchFrom.get("quickchat"));
        relationshipNew_.status = arrayList;
        user.localRelationship = relationshipNew_;
    }

    /* JADX INFO: renamed from: r3 */
    public C22421c<User> m31050r3(final String str) {
        return this.f91137Q.scheduled("quick_chat_query_user", 0, new pcj() { // from class: l.zy6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f206554a.m31052t3(str);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ User m31051s3(Envelope envelope) {
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (jyb.m147479J(commonData.users)) {
            return null;
        }
        m31049q3(commonData.users.get(0));
        this.f91137Q.m32496x3(envelope, null, true);
        return commonData.users.get(0);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ C22421c m31052t3(final String str) {
        return new ti20(new pcj() { // from class: l.gz6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32369w2(String.format("/%s", str))).m209028b();
            }
        }).map(new qcj() { // from class: l.hz6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112197a.m31051s3((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: u3 */
    public C22421c<uxj0> m31053u3() {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "reject");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return this.f91137Q.scheduled("reject_audio_broadcast", 0, new pcj() { // from class: l.fz6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.lz6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32221K1("/me")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }).map(new qcj() { // from class: l.mz6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public C22421c<Envelope> m31054v3(String str) {
        return m31055w3(str, false);
    }

    /* JADX INFO: renamed from: w3 */
    public C22421c<Envelope> m31055w3(String str, boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            if (TextUtils.equals(str, "start") || TextUtils.equals(str, "resume")) {
                jSONObject.put("consumeType", m31047o3(z));
            }
        } catch (JSONException e) {
            App.f16087d.m21432k(e);
        }
        return this.f91137Q.scheduled("soul_chat_search", -1, new pcj() { // from class: l.kz6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.az6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32201F1()).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public C22421c<uxj0> m31056x3() {
        return m31054v3("pause").map(new qcj() { // from class: l.jz6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public C22421c<uxj0> m31057y3() {
        return m31054v3("stop").map(new qcj() { // from class: l.ez6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public C22421c<Pair<String, String>> m31058z3(boolean z, boolean z2) {
        return m31055w3(z2 ? "resume" : "start", z).map(new qcj() { // from class: l.bz6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreAudioMatch.m31044l3((Envelope) obj);
            }
        });
    }
}
