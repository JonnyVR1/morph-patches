package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.ChatHeat;
import com.p046p1.mobile.putong.core.data.ChatHeatActionData;
import com.p046p1.mobile.putong.core.data.CoreBoxData;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.PermissionsItem;
import com.p046p1.mobile.putong.core.data.SpecialNotifyFlag;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class yl7 extends ax6 {

    /* JADX INFO: renamed from: R */
    public HashMap<String, SpecialNotifyFlag> f198865R;

    /* JADX INFO: renamed from: S */
    public C22393b<ChatHeatActionData> f198866S;

    public yl7(C4732c c4732c) {
        super(c4732c);
        this.f198865R = new HashMap<>();
        this.f198866S = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ stc0 m215228b3(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "setLevelUp");
            jSONObject.put("isLevelUp", false);
        } catch (Exception unused) {
        }
        return qib0.f154693H.auth().m185898q(C4728a.m31213J0("/chat-heat/" + str)).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ Boolean m215235i3(String str, Envelope envelope) {
        List<PermissionsItem> list = ((CoreData) envelope.getModuleData(CoreData.class)).chatHeatPermissions;
        if (vwb.m200296J(list)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (TextUtils.equals(list.get(0).f20467id, str) && list.get(0).enable) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ stc0 m215236j3(ChatHeatActionData.ExclusiveAction exclusiveAction, j760[] j760VarArr, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", exclusiveAction.getAction());
            if (!vwb.m200297K(j760VarArr)) {
                for (j760 j760Var : j760VarArr) {
                    jSONObject.put((String) j760Var.f116564a, j760Var.f116565b);
                }
            }
        } catch (Exception unused) {
        }
        return qib0.f154693H.auth().m185898q((exclusiveAction == ChatHeatActionData.ExclusiveAction.CHECK || exclusiveAction == ChatHeatActionData.ExclusiveAction.ENTER_CHECK || exclusiveAction == ChatHeatActionData.ExclusiveAction.INVITE || exclusiveAction == ChatHeatActionData.ExclusiveAction.ACCEPT || exclusiveAction == ChatHeatActionData.ExclusiveAction.CANCEL) ? C4728a.m31213J0("/exclusive-chat/" + str) : C4728a.m31213J0("/chat-heat/" + str)).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: A3 */
    public C22306c<roj0> m215238A3(final String str) {
        if (CoreModule.f17545c.f19639e0.f149467s2.get().booleanValue()) {
            return C22306c.just(roj0.f160388a);
        }
        return scheduled("chat-heat" + str, -1, new v9j() { // from class: l.wl7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.xl7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return yl7.m215228b3(str);
                    }
                }).map(new w9j() { // from class: l.ol7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public C22306c<Envelope> m215239B3(String str, boolean z) {
        return m215247q3(ChatHeatActionData.ExclusiveAction.SPECIAL_REMIND, str, j760.m140076a("specialRemind", Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: C3 */
    public void m215240C3(String str) {
        SpecialNotifyFlag specialNotifyFlag;
        if (ura.m195053e().m195057d().mo33667Cn()) {
            if (this.f198865R.containsKey(str)) {
                specialNotifyFlag = this.f198865R.get(str);
                if (NullChecker.m81303a(specialNotifyFlag)) {
                    specialNotifyFlag.reset();
                }
            } else {
                specialNotifyFlag = null;
            }
            if (specialNotifyFlag == null) {
                specialNotifyFlag = new SpecialNotifyFlag();
            }
            this.f198865R.put(str, specialNotifyFlag);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public void m215241D3(String str, int i) {
        m215247q3(ChatHeatActionData.ExclusiveAction.INVITE, str, j760.m140076a("exclusiveChatDuration", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: l3 */
    public void m215242l3(String str, String str2) {
        m215247q3(ChatHeatActionData.ExclusiveAction.ACCEPT, str, j760.m140076a("msgId", str2));
    }

    @Nullable
    /* JADX INFO: renamed from: m3 */
    public ChatHeat m215243m3(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CoreModule.f17553k.f91956s.queryCache(str);
    }

    /* JADX INFO: renamed from: n3 */
    public void m215244n3(String str) {
        m215247q3(ChatHeatActionData.ExclusiveAction.CANCEL, str, new j760[0]);
    }

    /* JADX INFO: renamed from: o3 */
    public void m215245o3(String str) {
        this.f198865R.remove(str);
    }

    /* JADX INFO: renamed from: p3 */
    public final C22306c<Envelope> m215246p3(final ChatHeatActionData.ExclusiveAction exclusiveAction, final String str, final e30<ChatHeatActionData> e30Var, final j760<String, Object>... j760VarArr) {
        return scheduled("exclusive_action_" + exclusiveAction.getAction() + CoreModule.m29931H().userId() + "" + str, -1, new v9j() { // from class: l.ql7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f155194a.m215256z3(exclusiveAction, j760VarArr, str, e30Var);
            }
        }, false);
    }

    /* JADX INFO: renamed from: q3 */
    public final C22306c<Envelope> m215247q3(ChatHeatActionData.ExclusiveAction exclusiveAction, String str, j760<String, Object>... j760VarArr) {
        return m215246p3(exclusiveAction, str, null, j760VarArr);
    }

    /* JADX INFO: renamed from: r3 */
    public C22306c<Envelope> m215248r3(String str) {
        return m215247q3(ChatHeatActionData.ExclusiveAction.ENTER_CHECK, str, new j760[0]);
    }

    /* JADX INFO: renamed from: s3 */
    public C22306c<ChatHeat> m215249s3(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.just(null);
        }
        if (!CoreModule.f17545c.f19639e0.f149467s2.get().booleanValue()) {
            return CoreModule.f17553k.f91956s.uiGet(str);
        }
        ChatHeat chatHeatNew_ = ChatHeat.new_();
        chatHeatNew_.degree = CoreModule.f17545c.f19639e0.f149474t2.get().doubleValue();
        chatHeatNew_.levelUp = this.f72126Q.f19639e0.f149481u2.get().booleanValue();
        return C22306c.just(chatHeatNew_);
    }

    /* JADX INFO: renamed from: t3 */
    public C22306c<CoreBoxData<ChatHeat>> m215250t3(String str) {
        return CoreModule.f17553k.f91956s.uiGet(str).map(new w9j() { // from class: l.nl7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreBoxData.box((ChatHeat) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public C22306c<ChatHeatActionData> m215251u3() {
        return this.f198866S.observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: v3 */
    public SpecialNotifyFlag m215252v3(String str) {
        return this.f198865R.get(str);
    }

    /* JADX INFO: renamed from: w3 */
    public C22306c<Boolean> m215253w3(final String str) {
        if (CoreModule.f17545c.f19639e0.f149467s2.get().booleanValue()) {
            return C22306c.just(Boolean.TRUE);
        }
        if (TextUtils.isEmpty(str)) {
            return C22306c.just(Boolean.FALSE);
        }
        return this.f72126Q.scheduled("hasPermissions" + str, 0, new v9j() { // from class: l.pl7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return ia20.m135121e(new v9j() { // from class: l.ul7
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/chat-heat/" + str2 + "/permissions")).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.vl7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return yl7.m215235i3(str2, (Envelope) obj);
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m215254x3(String str, ChatHeatActionData.ExclusiveAction exclusiveAction, j760[] j760VarArr, e30 e30Var, Envelope envelope) {
        this.f72126Q.m31494y3(envelope, null, true, false, true);
        ChatHeatActionData chatHeatActionData = new ChatHeatActionData(str, exclusiveAction, true, j760VarArr);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(chatHeatActionData);
        }
        this.f198866S.m132487l(chatHeatActionData);
        CoreModule.f17545c.f19642f0.m32650Fo();
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m215255y3(String str, ChatHeatActionData.ExclusiveAction exclusiveAction, j760[] j760VarArr, e30 e30Var, Throwable th) {
        ChatHeatActionData chatHeatActionData = new ChatHeatActionData(str, exclusiveAction, false, j760VarArr);
        chatHeatActionData.setThrowable(th);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(chatHeatActionData);
        }
        this.f198866S.m132487l(chatHeatActionData);
        CoreModule.f17545c.f19642f0.m32650Fo();
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ C22306c m215256z3(final ChatHeatActionData.ExclusiveAction exclusiveAction, final j760[] j760VarArr, final String str, final e30 e30Var) {
        return ia20.m135121e(new v9j() { // from class: l.rl7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return yl7.m215236j3(exclusiveAction, j760VarArr, str);
            }
        }).doOnNext(new e30() { // from class: l.sl7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165138a.m215254x3(str, exclusiveAction, j760VarArr, e30Var, (Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.tl7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170999a.m215255y3(str, exclusiveAction, j760VarArr, e30Var, (Throwable) obj);
            }
        }).compose(mkd0.m154951C());
    }
}
