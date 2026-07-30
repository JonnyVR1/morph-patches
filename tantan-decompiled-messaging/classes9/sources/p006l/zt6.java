package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.AIChatAdvice;
import com.p1.mobile.putong.core.data.AIChatAnalysis;
import com.p1.mobile.putong.core.data.AiChatAdviceConvs;
import com.p1.mobile.putong.core.data.AnalysisGuide;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import l.dpd0;
import l.l9b;
import l.mqi0;
import l.utc0;
import l.v9j;
import l.vqd0;
import l.w9j;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zt6 extends ax6 {

    /* JADX INFO: renamed from: R */
    public String f28964R;

    /* JADX INFO: renamed from: S */
    public final a<AIChatAdvice> f28965S;

    /* JADX INFO: renamed from: T */
    public vqd0 f28966T;

    /* JADX INFO: renamed from: U */
    public vqd0 f28967U;

    /* JADX INFO: renamed from: V */
    public dpd0 f28968V;

    public zt6(C0158c c0158c) {
        super(c0158c);
        this.f28964R = "";
        this.f28965S = a.b();
        this.f28966T = new vqd0("ai_chat_analysis_guide_conv_ids_" + CoreModule.m1850H().userId(), new HashSet());
        this.f28967U = new vqd0("used_ai_chat_analysis_conv_ids_" + CoreModule.m1850H().userId(), new HashSet());
        this.f28968V = new dpd0("ai_chat_advice_guide_conv_" + CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ c m28815b3(String str, boolean z) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("method", "feedback");
            jSONObject.put("messageId", str);
            jSONObject.put("value", z ? "good" : "bad");
        } catch (JSONException unused) {
        }
        return ia20.m16567a(new v9j() { // from class: l.tt6
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3213c("/analysis")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.ut6
            public final Object call(Object obj) {
                return zt6.m28820g3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ Envelope m28820g3(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ c m28822i3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otherUserId", str);
        } catch (JSONException unused) {
        }
        return ia20.m16567a(new v9j() { // from class: l.xt6
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3213c("/analysis")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.yt6
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CoreData.class).aiChatAnalysis;
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public c<Envelope> m28825l3(final String str, final boolean z) {
        return this.f8580Q.scheduled("ai_chat_analysisFeedBack", -1, new v9j() { // from class: l.qt6
            public final Object call() {
                return zt6.m28815b3(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public c<AIChatAnalysis> m28826m3(final String str) {
        return this.f8580Q.scheduled("ai_chat_createAnalysis", -1, new v9j() { // from class: l.vt6
            public final Object call() {
                return zt6.m28822i3(str);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public c<Envelope> m28827n3(final String str, String str2) {
        final String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "?source=" + str2;
        }
        return this.f8580Q.scheduled("ai_chat_getIceBreakings" + str, 0, new v9j() { // from class: l.wt6
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.pt6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3213c("/icebreakings/" + str + str)).f().b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public String m28828o3() {
        return this.f28964R;
    }

    /* JADX INFO: renamed from: p3 */
    public boolean m28829p3(String str) {
        if (NullChecker.a(this.f28968V.get()) && ((AiChatAdviceConvs) this.f28968V.get()).adviceConvList.containsKey(str)) {
            return l9b.C(((Long) ((AiChatAdviceConvs) this.f28968V.get()).adviceConvList.get(str)).longValue(), mqi0.o());
        }
        return false;
    }

    /* JADX INFO: renamed from: q3 */
    public boolean m28830q3(String str) {
        HashSet hashSet = (HashSet) this.f28966T.get();
        return NullChecker.a(hashSet) && hashSet.contains(str);
    }

    /* JADX INFO: renamed from: r3 */
    public void m28831r3(String str) {
        AiChatAdviceConvs aiChatAdviceConvsNew_ = (AiChatAdviceConvs) this.f28968V.get();
        if (aiChatAdviceConvsNew_ == null) {
            aiChatAdviceConvsNew_ = AiChatAdviceConvs.new_();
        }
        if (aiChatAdviceConvsNew_.adviceConvList == null) {
            aiChatAdviceConvsNew_.adviceConvList = new HashMap();
        }
        aiChatAdviceConvsNew_.adviceConvList.put(str, Long.valueOf(mqi0.o()));
        this.f28968V.put(aiChatAdviceConvsNew_);
    }

    /* JADX INFO: renamed from: s3 */
    public void m28832s3(String str) {
        HashSet hashSet = (HashSet) this.f28966T.get();
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        this.f28966T.put(hashSet);
    }

    /* JADX INFO: renamed from: t3 */
    public void m28833t3(String str) {
        HashSet hashSet = (HashSet) this.f28967U.get();
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        this.f28967U.put(hashSet);
    }

    /* JADX INFO: renamed from: u3 */
    public void m28834u3(String str) {
        this.f28964R = str;
    }

    /* JADX INFO: renamed from: v3 */
    public c<AnalysisGuide> m28835v3(final String str) {
        return this.f8580Q.scheduled("ai_chat_show_analysis_guide_" + str, 0, new v9j() { // from class: l.ot6
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.rt6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3213c("/show-analysis-guide/" + str)).f().b();
                    }
                }).map(new w9j() { // from class: l.st6
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).analysisGuide;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m28836w3(String str) {
        HashSet hashSet = (HashSet) this.f28967U.get();
        return NullChecker.a(hashSet) && hashSet.contains(str);
    }
}
