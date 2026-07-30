package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.CoreAudioMatch;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.VoiceChatInfo;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.ax6;
import p149l.la20;
import p149l.mkd0;
import p149l.roj0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes9.dex */
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

    public CoreAudioMatch(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ Pair m30046l3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (!NullChecker.m81304b(coreData) || !NullChecker.m81303a(coreData.voicechat) || !NullChecker.m81303a(coreData.voicechat.otherID) || !NullChecker.m81303a(coreData.voicechat.conversationID)) {
            return null;
        }
        VoiceChatInfo voiceChatInfo = coreData.voicechat;
        return Pair.create(voiceChatInfo.otherID, voiceChatInfo.conversationID);
    }

    /* JADX INFO: renamed from: o3 */
    public static String m30049o3(boolean z) {
        return z ? "coin" : "privilege";
    }

    /* JADX INFO: renamed from: p3 */
    public C22306c<roj0> m30050p3(String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "accept");
            jSONObject.put("secretKey", str);
            jSONObject.put("consumeType", str2);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return this.f72126Q.scheduled("accept_audio_broadcast", 0, new v9j() { // from class: l.fy6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.zx6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31218K1("/me")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }).map(new w9j() { // from class: l.ay6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final void m30051q3(User user) {
        this.f72126Q.f19642f0.m32902ap(user.f56011id);
        Relationship relationshipNew_ = Relationship.new_();
        relationshipNew_.conversationStatus = ConversationStatus.get("pending");
        ArrayList arrayList = new ArrayList();
        arrayList.add(MatchFrom.get("quickchat"));
        relationshipNew_.status = arrayList;
        user.localRelationship = relationshipNew_;
    }

    /* JADX INFO: renamed from: r3 */
    public C22306c<User> m30052r3(final String str) {
        return this.f72126Q.scheduled("quick_chat_query_user", 0, new v9j() { // from class: l.wx6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f188431a.m30054t3(str);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ User m30053s3(Envelope envelope) {
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (vwb.m200296J(commonData.users)) {
            return null;
        }
        m30051q3(commonData.users.get(0));
        this.f72126Q.m31493x3(envelope, null, true);
        return commonData.users.get(0);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ C22306c m30054t3(final String str) {
        return new la20(new v9j() { // from class: l.dy6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31366w2(String.format("/%s", str))).m185883b();
            }
        }).map(new w9j() { // from class: l.ey6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93726a.m30053s3((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: u3 */
    public C22306c<roj0> m30055u3() {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "reject");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return this.f72126Q.scheduled("reject_audio_broadcast", 0, new v9j() { // from class: l.cy6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.iy6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31218K1("/me")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }).map(new w9j() { // from class: l.jy6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public C22306c<Envelope> m30056v3(String str) {
        return m30057w3(str, false);
    }

    /* JADX INFO: renamed from: w3 */
    public C22306c<Envelope> m30057w3(String str, boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            if (TextUtils.equals(str, "start") || TextUtils.equals(str, "resume")) {
                jSONObject.put("consumeType", m30049o3(z));
            }
        } catch (JSONException e) {
            App.f15368d.m20433k(e);
        }
        return this.f72126Q.scheduled("soul_chat_search", -1, new v9j() { // from class: l.hy6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.xx6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31198F1()).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public C22306c<roj0> m30058x3() {
        return m30056v3("pause").map(new w9j() { // from class: l.gy6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public C22306c<roj0> m30059y3() {
        return m30056v3("stop").map(new w9j() { // from class: l.by6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public C22306c<Pair<String, String>> m30060z3(boolean z, boolean z2) {
        return m30057w3(z2 ? "resume" : "start", z).map(new w9j() { // from class: l.yx6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreAudioMatch.m30046l3((Envelope) obj);
            }
        });
    }
}
