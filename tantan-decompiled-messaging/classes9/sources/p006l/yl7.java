package p006l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.ChatHeat;
import com.p1.mobile.putong.core.data.ChatHeatActionData;
import com.p1.mobile.putong.core.data.CoreBoxData;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.PermissionsItem;
import com.p1.mobile.putong.core.data.SpecialNotifyFlag;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import l.roj0;
import l.stc0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import org.json.JSONObject;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yl7 extends ax6 {

    /* JADX INFO: renamed from: R */
    public HashMap<String, SpecialNotifyFlag> f28283R;

    /* JADX INFO: renamed from: S */
    public b<ChatHeatActionData> f28284S;

    public yl7(C0158c c0158c) {
        super(c0158c);
        this.f28283R = new HashMap<>();
        this.f28284S = b.b();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ stc0 m28286b3(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "setLevelUp");
            jSONObject.put("isLevelUp", false);
        } catch (Exception unused) {
        }
        return qib0.f19784H.auth().q(C0154a.m3143J0("/chat-heat/" + str)).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ Boolean m28293i3(String str, Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).chatHeatPermissions;
        if (vwb.J(list)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (TextUtils.equals(((PermissionsItem) list.get(0)).id, str) && ((PermissionsItem) list.get(0)).enable) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ stc0 m28294j3(ChatHeatActionData.ExclusiveAction exclusiveAction, j760[] j760VarArr, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", exclusiveAction.getAction());
            if (!vwb.K(j760VarArr)) {
                for (j760 j760Var : j760VarArr) {
                    jSONObject.put((String) j760Var.a, j760Var.b);
                }
            }
        } catch (Exception unused) {
        }
        return qib0.f19784H.auth().q((exclusiveAction == ChatHeatActionData.ExclusiveAction.CHECK || exclusiveAction == ChatHeatActionData.ExclusiveAction.ENTER_CHECK || exclusiveAction == ChatHeatActionData.ExclusiveAction.INVITE || exclusiveAction == ChatHeatActionData.ExclusiveAction.ACCEPT || exclusiveAction == ChatHeatActionData.ExclusiveAction.CANCEL) ? C0154a.m3143J0("/exclusive-chat/" + str) : C0154a.m3143J0("/chat-heat/" + str)).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: A3 */
    public c<roj0> m28296A3(final String str) {
        if (((Boolean) CoreModule.f1534c.f3628e0.f19079s2.get()).booleanValue()) {
            return c.just(roj0.a);
        }
        return scheduled("chat-heat" + str, -1, new v9j() { // from class: l.wl7
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.xl7
                    public final Object call() {
                        return yl7.m28286b3(str);
                    }
                }).map(new w9j() { // from class: l.ol7
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public c<Envelope> m28297B3(String str, boolean z) {
        return m28305q3(ChatHeatActionData.ExclusiveAction.SPECIAL_REMIND, str, j760.a("specialRemind", Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: C3 */
    public void m28298C3(String str) {
        SpecialNotifyFlag specialNotifyFlag;
        if (ura.m25555e().m25559d().m5604Cn()) {
            if (this.f28283R.containsKey(str)) {
                specialNotifyFlag = this.f28283R.get(str);
                if (NullChecker.a(specialNotifyFlag)) {
                    specialNotifyFlag.reset();
                }
            } else {
                specialNotifyFlag = null;
            }
            if (specialNotifyFlag == null) {
                specialNotifyFlag = new SpecialNotifyFlag();
            }
            this.f28283R.put(str, specialNotifyFlag);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public void m28299D3(String str, int i) {
        m28305q3(ChatHeatActionData.ExclusiveAction.INVITE, str, j760.a("exclusiveChatDuration", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: l3 */
    public void m28300l3(String str, String str2) {
        m28305q3(ChatHeatActionData.ExclusiveAction.ACCEPT, str, j760.a("msgId", str2));
    }

    @Nullable
    /* JADX INFO: renamed from: m3 */
    public ChatHeat m28301m3(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CoreModule.f1542k.f11211s.queryCache(str);
    }

    /* JADX INFO: renamed from: n3 */
    public void m28302n3(String str) {
        m28305q3(ChatHeatActionData.ExclusiveAction.CANCEL, str, new j760[0]);
    }

    /* JADX INFO: renamed from: o3 */
    public void m28303o3(String str) {
        this.f28283R.remove(str);
    }

    /* JADX INFO: renamed from: p3 */
    public final c<Envelope> m28304p3(final ChatHeatActionData.ExclusiveAction exclusiveAction, final String str, final e30<ChatHeatActionData> e30Var, final j760<String, Object>... j760VarArr) {
        return scheduled("exclusive_action_" + exclusiveAction.getAction() + CoreModule.m1850H().userId() + "" + str, -1, new v9j() { // from class: l.ql7
            public final Object call() {
                return this.f19881a.m28314z3(exclusiveAction, j760VarArr, str, e30Var);
            }
        }, false);
    }

    /* JADX INFO: renamed from: q3 */
    public final c<Envelope> m28305q3(ChatHeatActionData.ExclusiveAction exclusiveAction, String str, j760<String, Object>... j760VarArr) {
        return m28304p3(exclusiveAction, str, null, j760VarArr);
    }

    /* JADX INFO: renamed from: r3 */
    public c<Envelope> m28306r3(String str) {
        return m28305q3(ChatHeatActionData.ExclusiveAction.ENTER_CHECK, str, new j760[0]);
    }

    /* JADX INFO: renamed from: s3 */
    public c<ChatHeat> m28307s3(String str) {
        if (TextUtils.isEmpty(str)) {
            return c.just((Object) null);
        }
        if (!((Boolean) CoreModule.f1534c.f3628e0.f19079s2.get()).booleanValue()) {
            return CoreModule.f1542k.f11211s.uiGet(str);
        }
        ChatHeat chatHeatNew_ = ChatHeat.new_();
        chatHeatNew_.degree = ((Double) CoreModule.f1534c.f3628e0.f19086t2.get()).doubleValue();
        chatHeatNew_.levelUp = ((Boolean) this.f8580Q.f3628e0.f19093u2.get()).booleanValue();
        return c.just(chatHeatNew_);
    }

    /* JADX INFO: renamed from: t3 */
    public c<CoreBoxData<ChatHeat>> m28308t3(String str) {
        return CoreModule.f1542k.f11211s.uiGet(str).map(new w9j() { // from class: l.nl7
            public final Object call(Object obj) {
                return CoreBoxData.box((ChatHeat) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public c<ChatHeatActionData> m28309u3() {
        return this.f28284S.observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: v3 */
    public SpecialNotifyFlag m28310v3(String str) {
        return this.f28283R.get(str);
    }

    /* JADX INFO: renamed from: w3 */
    public c<Boolean> m28311w3(final String str) {
        if (((Boolean) CoreModule.f1534c.f3628e0.f19079s2.get()).booleanValue()) {
            return c.just(Boolean.TRUE);
        }
        if (TextUtils.isEmpty(str)) {
            return c.just(Boolean.FALSE);
        }
        return this.f8580Q.scheduled("hasPermissions" + str, 0, new v9j() { // from class: l.pl7
            public final Object call() {
                String str2 = str;
                return ia20.m16571e(new v9j() { // from class: l.ul7
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/chat-heat/" + str2 + "/permissions")).f().b();
                    }
                }).map(new w9j() { // from class: l.vl7
                    public final Object call(Object obj) {
                        return yl7.m28293i3(str2, (Envelope) obj);
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m28312x3(String str, ChatHeatActionData.ExclusiveAction exclusiveAction, j760[] j760VarArr, e30 e30Var, Envelope envelope) {
        this.f8580Q.m3424y3(envelope, null, true, false, true);
        ChatHeatActionData chatHeatActionData = new ChatHeatActionData(str, exclusiveAction, true, j760VarArr);
        if (NullChecker.a(e30Var)) {
            e30Var.call(chatHeatActionData);
        }
        this.f28284S.onNext(chatHeatActionData);
        CoreModule.f1534c.f3631f0.m4580Fo();
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m28313y3(String str, ChatHeatActionData.ExclusiveAction exclusiveAction, j760[] j760VarArr, e30 e30Var, Throwable th) {
        ChatHeatActionData chatHeatActionData = new ChatHeatActionData(str, exclusiveAction, false, j760VarArr);
        chatHeatActionData.setThrowable(th);
        if (NullChecker.a(e30Var)) {
            e30Var.call(chatHeatActionData);
        }
        this.f28284S.onNext(chatHeatActionData);
        CoreModule.f1534c.f3631f0.m4580Fo();
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ c m28314z3(final ChatHeatActionData.ExclusiveAction exclusiveAction, final j760[] j760VarArr, final String str, final e30 e30Var) {
        return ia20.m16571e(new v9j() { // from class: l.rl7
            public final Object call() {
                return yl7.m28294j3(exclusiveAction, j760VarArr, str);
            }
        }).doOnNext(new e30() { // from class: l.sl7
            public final void call(Object obj) {
                this.f21413a.m28312x3(str, exclusiveAction, j760VarArr, e30Var, (Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.tl7
            public final void call(Object obj) {
                this.f22166a.m28313y3(str, exclusiveAction, j760VarArr, e30Var, (Throwable) obj);
            }
        }).compose(mkd0.C());
    }
}
