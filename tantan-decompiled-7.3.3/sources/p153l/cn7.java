package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.ChatHeat;
import com.p051p1.mobile.putong.core.data.ChatHeatActionData;
import com.p051p1.mobile.putong.core.data.CoreBoxData;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.PermissionsItem;
import com.p051p1.mobile.putong.core.data.SpecialNotifyFlag;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class cn7 extends dy6 {

    /* JADX INFO: renamed from: R */
    public HashMap<String, SpecialNotifyFlag> f82693R;

    /* JADX INFO: renamed from: S */
    public C22508b<ChatHeatActionData> f82694S;

    public cn7(C4883c c4883c) {
        super(c4883c);
        this.f82693R = new HashMap<>();
        this.f82694S = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ x1d0 m111453b3(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "setLevelUp");
            jSONObject.put("isLevelUp", false);
        } catch (Exception unused) {
        }
        return uqb0.f180376H.auth().m209043q(C4879a.m32216J0("/chat-heat/" + str)).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ Boolean m111460i3(String str, Envelope envelope) {
        List<PermissionsItem> list = ((CoreData) envelope.getModuleData(CoreData.class)).chatHeatPermissions;
        if (jyb.m147479J(list)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (TextUtils.equals(list.get(0).f21209id, str) && list.get(0).enable) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ x1d0 m111461j3(ChatHeatActionData.ExclusiveAction exclusiveAction, pf60[] pf60VarArr, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", exclusiveAction.getAction());
            if (!jyb.m147480K(pf60VarArr)) {
                for (pf60 pf60Var : pf60VarArr) {
                    jSONObject.put((String) pf60Var.f152156a, pf60Var.f152157b);
                }
            }
        } catch (Exception unused) {
        }
        return uqb0.f180376H.auth().m209043q((exclusiveAction == ChatHeatActionData.ExclusiveAction.CHECK || exclusiveAction == ChatHeatActionData.ExclusiveAction.ENTER_CHECK || exclusiveAction == ChatHeatActionData.ExclusiveAction.INVITE || exclusiveAction == ChatHeatActionData.ExclusiveAction.ACCEPT || exclusiveAction == ChatHeatActionData.ExclusiveAction.CANCEL) ? C4879a.m32216J0("/exclusive-chat/" + str) : C4879a.m32216J0("/chat-heat/" + str)).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: A3 */
    public C22421c<uxj0> m111463A3(final String str) {
        if (CoreModule.f18264c.f20381e0.f89324s2.get().booleanValue()) {
            return C22421c.just(uxj0.f181467a);
        }
        return scheduled("chat-heat" + str, -1, new pcj() { // from class: l.an7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.bn7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return cn7.m111453b3(str);
                    }
                }).map(new qcj() { // from class: l.sm7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public C22421c<Envelope> m111464B3(String str, boolean z) {
        return m111472q3(ChatHeatActionData.ExclusiveAction.SPECIAL_REMIND, str, pf60.m172085a("specialRemind", Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: C3 */
    public void m111465C3(String str) {
        SpecialNotifyFlag specialNotifyFlag;
        if (gta.m132210e().m132214d().mo34670Cn()) {
            if (this.f82693R.containsKey(str)) {
                specialNotifyFlag = this.f82693R.get(str);
                if (NullChecker.m82486a(specialNotifyFlag)) {
                    specialNotifyFlag.reset();
                }
            } else {
                specialNotifyFlag = null;
            }
            if (specialNotifyFlag == null) {
                specialNotifyFlag = new SpecialNotifyFlag();
            }
            this.f82693R.put(str, specialNotifyFlag);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public void m111466D3(String str, int i) {
        m111472q3(ChatHeatActionData.ExclusiveAction.INVITE, str, pf60.m172085a("exclusiveChatDuration", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: l3 */
    public void m111467l3(String str, String str2) {
        m111472q3(ChatHeatActionData.ExclusiveAction.ACCEPT, str, pf60.m172085a("msgId", str2));
    }

    @Nullable
    /* JADX INFO: renamed from: m3 */
    public ChatHeat m111468m3(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CoreModule.f18272k.f115551s.queryCache(str);
    }

    /* JADX INFO: renamed from: n3 */
    public void m111469n3(String str) {
        m111472q3(ChatHeatActionData.ExclusiveAction.CANCEL, str, new pf60[0]);
    }

    /* JADX INFO: renamed from: o3 */
    public void m111470o3(String str) {
        this.f82693R.remove(str);
    }

    /* JADX INFO: renamed from: p3 */
    public final C22421c<Envelope> m111471p3(final ChatHeatActionData.ExclusiveAction exclusiveAction, final String str, final y20<ChatHeatActionData> y20Var, final pf60<String, Object>... pf60VarArr) {
        return scheduled("exclusive_action_" + exclusiveAction.getAction() + CoreModule.m30929H().userId() + "" + str, -1, new pcj() { // from class: l.um7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f179602a.m111481z3(exclusiveAction, pf60VarArr, str, y20Var);
            }
        }, false);
    }

    /* JADX INFO: renamed from: q3 */
    public final C22421c<Envelope> m111472q3(ChatHeatActionData.ExclusiveAction exclusiveAction, String str, pf60<String, Object>... pf60VarArr) {
        return m111471p3(exclusiveAction, str, null, pf60VarArr);
    }

    /* JADX INFO: renamed from: r3 */
    public C22421c<Envelope> m111473r3(String str) {
        return m111472q3(ChatHeatActionData.ExclusiveAction.ENTER_CHECK, str, new pf60[0]);
    }

    /* JADX INFO: renamed from: s3 */
    public C22421c<ChatHeat> m111474s3(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.just(null);
        }
        if (!CoreModule.f18264c.f20381e0.f89324s2.get().booleanValue()) {
            return CoreModule.f18272k.f115551s.uiGet(str);
        }
        ChatHeat chatHeatNew_ = ChatHeat.new_();
        chatHeatNew_.degree = CoreModule.f18264c.f20381e0.f89331t2.get().doubleValue();
        chatHeatNew_.levelUp = this.f91137Q.f20381e0.f89338u2.get().booleanValue();
        return C22421c.just(chatHeatNew_);
    }

    /* JADX INFO: renamed from: t3 */
    public C22421c<CoreBoxData<ChatHeat>> m111475t3(String str) {
        return CoreModule.f18272k.f115551s.uiGet(str).map(new qcj() { // from class: l.rm7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreBoxData.box((ChatHeat) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public C22421c<ChatHeatActionData> m111476u3() {
        return this.f82694S.observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: v3 */
    public SpecialNotifyFlag m111477v3(String str) {
        return this.f82693R.get(str);
    }

    /* JADX INFO: renamed from: w3 */
    public C22421c<Boolean> m111478w3(final String str) {
        if (CoreModule.f18264c.f20381e0.f89324s2.get().booleanValue()) {
            return C22421c.just(Boolean.TRUE);
        }
        if (TextUtils.isEmpty(str)) {
            return C22421c.just(Boolean.FALSE);
        }
        return this.f91137Q.scheduled("hasPermissions" + str, 0, new pcj() { // from class: l.tm7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return qi20.m176658e(new pcj() { // from class: l.ym7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/chat-heat/" + str2 + "/permissions")).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.zm7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return cn7.m111460i3(str2, (Envelope) obj);
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m111479x3(String str, ChatHeatActionData.ExclusiveAction exclusiveAction, pf60[] pf60VarArr, y20 y20Var, Envelope envelope) {
        this.f91137Q.m32497y3(envelope, null, true, false, true);
        ChatHeatActionData chatHeatActionData = new ChatHeatActionData(str, exclusiveAction, true, pf60VarArr);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(chatHeatActionData);
        }
        this.f82694S.m137019l(chatHeatActionData);
        CoreModule.f18264c.f20384f0.m33653Fo();
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m111480y3(String str, ChatHeatActionData.ExclusiveAction exclusiveAction, pf60[] pf60VarArr, y20 y20Var, Throwable th) {
        ChatHeatActionData chatHeatActionData = new ChatHeatActionData(str, exclusiveAction, false, pf60VarArr);
        chatHeatActionData.setThrowable(th);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(chatHeatActionData);
        }
        this.f82694S.m137019l(chatHeatActionData);
        CoreModule.f18264c.f20384f0.m33653Fo();
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ C22421c m111481z3(final ChatHeatActionData.ExclusiveAction exclusiveAction, final pf60[] pf60VarArr, final String str, final y20 y20Var) {
        return qi20.m176658e(new pcj() { // from class: l.vm7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return cn7.m111461j3(exclusiveAction, pf60VarArr, str);
            }
        }).doOnNext(new y20() { // from class: l.wm7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189775a.m111479x3(str, exclusiveAction, pf60VarArr, y20Var, (Envelope) obj);
            }
        }).doOnError(new y20() { // from class: l.xm7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195050a.m111480y3(str, exclusiveAction, pf60VarArr, y20Var, (Throwable) obj);
            }
        }).compose(psd0.m173592C());
    }
}
