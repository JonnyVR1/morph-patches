package p153l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.AIChatAdvice;
import com.p051p1.mobile.putong.core.data.AIChatAnalysis;
import com.p051p1.mobile.putong.core.data.AIMessageFeedback;
import com.p051p1.mobile.putong.core.data.AiChatAdviceConvs;
import com.p051p1.mobile.putong.core.data.AnalysisGuide;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class cv6 extends dy6 {

    /* JADX INFO: renamed from: R */
    public String f83948R;

    /* JADX INFO: renamed from: S */
    public final C22507a<AIChatAdvice> f83949S;

    /* JADX INFO: renamed from: T */
    public xyd0 f83950T;

    /* JADX INFO: renamed from: U */
    public xyd0 f83951U;

    /* JADX INFO: renamed from: V */
    public fxd0 f83952V;

    public cv6(C4883c c4883c) {
        super(c4883c);
        this.f83948R = "";
        this.f83949S = C22507a.m222758b();
        this.f83950T = new xyd0("ai_chat_analysis_guide_conv_ids_" + CoreModule.m30929H().userId(), new HashSet());
        this.f83951U = new xyd0("used_ai_chat_analysis_conv_ids_" + CoreModule.m30929H().userId(), new HashSet());
        this.f83952V = new fxd0("ai_chat_advice_guide_conv_" + CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ C22421c m112760b3(String str, boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FirebaseAnalytics.Param.METHOD, MessageType.feedback);
            jSONObject.put("messageId", str);
            jSONObject.put("value", z ? AIMessageFeedback.good : AIMessageFeedback.bad);
        } catch (JSONException unused) {
        }
        return qi20.m176654a(new pcj() { // from class: l.wu6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32286c("/analysis")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.xu6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cv6.m112765g3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ Envelope m112765g3(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ C22421c m112767i3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otherUserId", str);
        } catch (JSONException unused) {
        }
        return qi20.m176654a(new pcj() { // from class: l.av6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32286c("/analysis")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.bv6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).aiChatAnalysis;
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public C22421c<Envelope> m112770l3(final String str, final boolean z) {
        return this.f91137Q.scheduled("ai_chat_analysisFeedBack", -1, new pcj() { // from class: l.tu6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return cv6.m112760b3(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public C22421c<AIChatAnalysis> m112771m3(final String str) {
        return this.f91137Q.scheduled("ai_chat_createAnalysis", -1, new pcj() { // from class: l.yu6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return cv6.m112767i3(str);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public C22421c<Envelope> m112772n3(final String str, String str2) {
        final String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "?source=" + str2;
        }
        return this.f91137Q.scheduled("ai_chat_getIceBreakings" + str, 0, new pcj() { // from class: l.zu6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.su6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32286c("/icebreakings/" + str + str)).m209032f().m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public String m112773o3() {
        return this.f83948R;
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m112774p3(String str) {
        if (NullChecker.m82486a(this.f83952V.get()) && this.f83952V.get().adviceConvList.containsKey(str)) {
            return yab.m214857C(this.f83952V.get().adviceConvList.get(str).longValue(), pzi0.m174454o());
        }
        return false;
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m112775q3(String str) {
        HashSet<String> hashSet = this.f83950T.get();
        return NullChecker.m82486a(hashSet) && hashSet.contains(str);
    }

    /* JADX INFO: renamed from: r3 */
    public void m112776r3(String str) {
        AiChatAdviceConvs aiChatAdviceConvsNew_ = this.f83952V.get();
        if (aiChatAdviceConvsNew_ == null) {
            aiChatAdviceConvsNew_ = AiChatAdviceConvs.new_();
        }
        if (aiChatAdviceConvsNew_.adviceConvList == null) {
            aiChatAdviceConvsNew_.adviceConvList = new HashMap();
        }
        aiChatAdviceConvsNew_.adviceConvList.put(str, Long.valueOf(pzi0.m174454o()));
        this.f83952V.put(aiChatAdviceConvsNew_);
    }

    /* JADX INFO: renamed from: s3 */
    public void m112777s3(String str) {
        HashSet<String> hashSet = this.f83950T.get();
        if (hashSet == null) {
            hashSet = new HashSet<>();
        }
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        this.f83950T.put(hashSet);
    }

    /* JADX INFO: renamed from: t3 */
    public void m112778t3(String str) {
        HashSet<String> hashSet = this.f83951U.get();
        if (hashSet == null) {
            hashSet = new HashSet<>();
        }
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        this.f83951U.put(hashSet);
    }

    /* JADX INFO: renamed from: u3 */
    public void m112779u3(String str) {
        this.f83948R = str;
    }

    /* JADX INFO: renamed from: v3 */
    public C22421c<AnalysisGuide> m112780v3(final String str) {
        return this.f91137Q.scheduled("ai_chat_show_analysis_guide_" + str, 0, new pcj() { // from class: l.ru6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.uu6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32286c("/show-analysis-guide/" + str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.vu6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).analysisGuide;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m112781w3(String str) {
        HashSet<String> hashSet = this.f83951U.get();
        return NullChecker.m82486a(hashSet) && hashSet.contains(str);
    }
}
