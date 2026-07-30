package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.CoreAudioMatch;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.VoiceChatInfo;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.mkd0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ax6;
import p006l.la20;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreAudioMatch extends ax6 {

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

    public CoreAudioMatch(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ Pair m1974l3(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        if (!NullChecker.b(moduleData) || !NullChecker.a(moduleData.voicechat) || !NullChecker.a(moduleData.voicechat.otherID) || !NullChecker.a(moduleData.voicechat.conversationID)) {
            return null;
        }
        VoiceChatInfo voiceChatInfo = moduleData.voicechat;
        return Pair.create(voiceChatInfo.otherID, voiceChatInfo.conversationID);
    }

    /* JADX INFO: renamed from: o3 */
    public static String m1977o3(boolean z) {
        return z ? "coin" : "privilege";
    }

    /* JADX INFO: renamed from: p3 */
    public c<roj0> m1978p3(String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "accept");
            jSONObject.put("secretKey", str);
            jSONObject.put("consumeType", str2);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return this.f8580Q.scheduled("accept_audio_broadcast", 0, new v9j() { // from class: l.fy6
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.zx6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3148K1("/me")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }).map(new w9j() { // from class: l.ay6
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final void m1979q3(User user) {
        this.f8580Q.f3631f0.m4832ap(((DbObject) user).id);
        Relationship relationshipNew_ = Relationship.new_();
        relationshipNew_.conversationStatus = ConversationStatus.get("pending");
        ArrayList arrayList = new ArrayList();
        arrayList.add(MatchFrom.get("quickchat"));
        relationshipNew_.status = arrayList;
        user.localRelationship = relationshipNew_;
    }

    /* JADX INFO: renamed from: r3 */
    public c<User> m1980r3(final String str) {
        return this.f8580Q.scheduled("quick_chat_query_user", 0, new v9j() { // from class: l.wx6
            public final Object call() {
                return this.f25453a.m1982t3(str);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ User m1981s3(Envelope envelope) {
        CommonData moduleData = envelope.getModuleData(CommonData.class);
        if (vwb.J(moduleData.users)) {
            return null;
        }
        m1979q3((User) moduleData.users.get(0));
        this.f8580Q.m3423x3(envelope, null, true);
        return (User) moduleData.users.get(0);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ c m1982t3(final String str) {
        return new la20(new v9j() { // from class: l.dy6
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3296w2(String.format("/%s", str))).b();
            }
        }).map(new w9j() { // from class: l.ey6
            public final Object call(Object obj) {
                return this.f11500a.m1981s3((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: u3 */
    public c<roj0> m1983u3() {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "reject");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return this.f8580Q.scheduled("reject_audio_broadcast", 0, new v9j() { // from class: l.cy6
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.iy6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3148K1("/me")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }).map(new w9j() { // from class: l.jy6
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public c<Envelope> m1984v3(String str) {
        return m1985w3(str, false);
    }

    /* JADX INFO: renamed from: w3 */
    public c<Envelope> m1985w3(String str, boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            if (TextUtils.equals(str, "start") || TextUtils.equals(str, "resume")) {
                jSONObject.put("consumeType", m1977o3(z));
            }
        } catch (JSONException e) {
            App.d.k(e);
        }
        return this.f8580Q.scheduled("soul_chat_search", -1, new v9j() { // from class: l.hy6
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.xx6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3128F1()).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public c<roj0> m1986x3() {
        return m1984v3("pause").map(new w9j() { // from class: l.gy6
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public c<roj0> m1987y3() {
        return m1984v3("stop").map(new w9j() { // from class: l.by6
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public c<Pair<String, String>> m1988z3(boolean z, boolean z2) {
        return m1985w3(z2 ? "resume" : "start", z).map(new w9j() { // from class: l.yx6
            public final Object call(Object obj) {
                return CoreAudioMatch.m1974l3((Envelope) obj);
            }
        });
    }
}
