package p149l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.AIChatAdvice;
import com.p046p1.mobile.putong.core.data.AIChatAnalysis;
import com.p046p1.mobile.putong.core.data.AIMessageFeedback;
import com.p046p1.mobile.putong.core.data.AiChatAdviceConvs;
import com.p046p1.mobile.putong.core.data.AnalysisGuide;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class zt6 extends ax6 {

    /* JADX INFO: renamed from: R */
    public String f204695R;

    /* JADX INFO: renamed from: S */
    public final C22392a<AIChatAdvice> f204696S;

    /* JADX INFO: renamed from: T */
    public vqd0 f204697T;

    /* JADX INFO: renamed from: U */
    public vqd0 f204698U;

    /* JADX INFO: renamed from: V */
    public dpd0 f204699V;

    public zt6(C4732c c4732c) {
        super(c4732c);
        this.f204695R = "";
        this.f204696S = C22392a.m221512b();
        this.f204697T = new vqd0("ai_chat_analysis_guide_conv_ids_" + CoreModule.m29931H().userId(), new HashSet());
        this.f204698U = new vqd0("used_ai_chat_analysis_conv_ids_" + CoreModule.m29931H().userId(), new HashSet());
        this.f204699V = new dpd0("ai_chat_advice_guide_conv_" + CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ C22306c m220095b3(String str, boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FirebaseAnalytics.Param.METHOD, MessageType.feedback);
            jSONObject.put("messageId", str);
            jSONObject.put("value", z ? AIMessageFeedback.good : AIMessageFeedback.bad);
        } catch (JSONException unused) {
        }
        return ia20.m135117a(new v9j() { // from class: l.tt6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31283c("/analysis")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.ut6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zt6.m220100g3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ Envelope m220100g3(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ C22306c m220102i3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otherUserId", str);
        } catch (JSONException unused) {
        }
        return ia20.m135117a(new v9j() { // from class: l.xt6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31283c("/analysis")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.yt6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).aiChatAnalysis;
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public C22306c<Envelope> m220105l3(final String str, final boolean z) {
        return this.f72126Q.scheduled("ai_chat_analysisFeedBack", -1, new v9j() { // from class: l.qt6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return zt6.m220095b3(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public C22306c<AIChatAnalysis> m220106m3(final String str) {
        return this.f72126Q.scheduled("ai_chat_createAnalysis", -1, new v9j() { // from class: l.vt6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return zt6.m220102i3(str);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public C22306c<Envelope> m220107n3(final String str, String str2) {
        final String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "?source=" + str2;
        }
        return this.f72126Q.scheduled("ai_chat_getIceBreakings" + str, 0, new v9j() { // from class: l.wt6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.pt6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31283c("/icebreakings/" + str + str)).m185887f().m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public String m220108o3() {
        return this.f204695R;
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m220109p3(String str) {
        if (NullChecker.m81303a(this.f204699V.get()) && this.f204699V.get().adviceConvList.containsKey(str)) {
            return l9b.m149005C(this.f204699V.get().adviceConvList.get(str).longValue(), mqi0.m155944o());
        }
        return false;
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m220110q3(String str) {
        HashSet<String> hashSet = this.f204697T.get();
        return NullChecker.m81303a(hashSet) && hashSet.contains(str);
    }

    /* JADX INFO: renamed from: r3 */
    public void m220111r3(String str) {
        AiChatAdviceConvs aiChatAdviceConvsNew_ = this.f204699V.get();
        if (aiChatAdviceConvsNew_ == null) {
            aiChatAdviceConvsNew_ = AiChatAdviceConvs.new_();
        }
        if (aiChatAdviceConvsNew_.adviceConvList == null) {
            aiChatAdviceConvsNew_.adviceConvList = new HashMap();
        }
        aiChatAdviceConvsNew_.adviceConvList.put(str, Long.valueOf(mqi0.m155944o()));
        this.f204699V.put(aiChatAdviceConvsNew_);
    }

    /* JADX INFO: renamed from: s3 */
    public void m220112s3(String str) {
        HashSet<String> hashSet = this.f204697T.get();
        if (hashSet == null) {
            hashSet = new HashSet<>();
        }
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        this.f204697T.put(hashSet);
    }

    /* JADX INFO: renamed from: t3 */
    public void m220113t3(String str) {
        HashSet<String> hashSet = this.f204698U.get();
        if (hashSet == null) {
            hashSet = new HashSet<>();
        }
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        this.f204698U.put(hashSet);
    }

    /* JADX INFO: renamed from: u3 */
    public void m220114u3(String str) {
        this.f204695R = str;
    }

    /* JADX INFO: renamed from: v3 */
    public C22306c<AnalysisGuide> m220115v3(final String str) {
        return this.f72126Q.scheduled("ai_chat_show_analysis_guide_" + str, 0, new v9j() { // from class: l.ot6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.rt6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31283c("/show-analysis-guide/" + str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.st6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).analysisGuide;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m220116w3(String str) {
        HashSet<String> hashSet = this.f204698U.get();
        return NullChecker.m81303a(hashSet) && hashSet.contains(str);
    }
}
