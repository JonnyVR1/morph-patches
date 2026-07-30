package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.SeeExposedUser;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\nJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m87232d2 = {"Ll/vta;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "userId", "", "C3", "(Ljava/lang/String;)V", "Ll/utc0;", "A3", "(Ljava/lang/String;)Ll/utc0;", "H3", "o3", "()V", "u3", "conVersionId", "s3", "", "B3", "(Ljava/lang/String;)Z", "Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "R", "Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "y3", "()Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "G3", "(Lcom/p1/mobile/putong/core/data/SeeExposedUser;)V", "localConvUserData", "Ll/uqd0;", j6f.LATITUDE_SOUTH, "Ll/uqd0;", "z3", "()Ll/uqd0;", "setLocalReceiveLikeGuideText", "(Ll/uqd0;)V", "localReceiveLikeGuideText", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vta extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public SeeExposedUser localConvUserData;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public uqd0 localReceiveLikeGuideText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vta(@NotNull C4732c c4732c) {
        super(c4732c);
        c4732c.getClass();
        this.localReceiveLikeGuideText = new uqd0("local_receive_like_guide_text_" + CoreModule.m29931H().userId(), "");
    }

    /* JADX INFO: renamed from: A3 */
    private final utc0 m199941A3(String userId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", userId);
        utc0 utc0VarCreate = utc0.create(Network.JSON, jSONObject.toString());
        utc0VarCreate.getClass();
        return utc0VarCreate;
    }

    /* JADX INFO: renamed from: C3 */
    private final void m199942C3(final String userId) {
        this.f72126Q.scheduled("receive_like_guide_" + userId, 0, new v9j() { // from class: l.rta
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vta.m199953h3(this.f160953a, userId);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public static final stc0 m199943D3(vta vtaVar, String str) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31247S1()).m185893l(vtaVar.m199941A3(str)).m185883b();
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m199944E3(vta vtaVar, Envelope envelope) {
        envelope.getClass();
        if (200 == envelope.meta.code) {
            vtaVar.m199972u3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public static final Unit m199945F3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h3 */
    public static C22306c m199953h3(final vta vtaVar, final String str) {
        C22306c<Envelope> c22306cM135117a = ia20.m135117a(new v9j() { // from class: l.sta
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vta.m199943D3(this.f166309a, str);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.tta
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vta.m199944E3(this.f172004a, (Envelope) obj);
            }
        };
        return c22306cM135117a.map(new w9j() { // from class: l.uta
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vta.m199945F3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public static C22306c m199954i3(final vta vtaVar) {
        C22306c<Envelope> c22306cObserveOn = ia20.m135117a(new v9j() { // from class: l.nta
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vta.m199960p3();
            }
        }).observeOn(Schedulers.m221493io());
        final Function1 function1 = new Function1() { // from class: l.ota
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vta.m199961q3(this.f145554a, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.pta
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vta.m199962r3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public static void m199955j3(vta vtaVar, final String str) {
        vtaVar.f72126Q.f19609U.m109085a(new d30() { // from class: l.qta
            @Override // p149l.d30
            public final void call() {
                vta.m199963t3(str);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public static C22306c m199958m3(final vta vtaVar) {
        C22306c<Envelope> c22306cObserveOn = ia20.m135117a(new v9j() { // from class: l.jta
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vta.m199964v3();
            }
        }).observeOn(Schedulers.m221493io());
        final Function1 function1 = new Function1() { // from class: l.kta
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vta.m199965w3(this.f124572a, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.lta
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vta.m199966x3(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public static final stc0 m199960p3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31247S1()).m185885d().m185883b();
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m199961q3(vta vtaVar, Envelope envelope) {
        vtaVar.localConvUserData = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public static final Unit m199962r3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public static final void m199963t3(String str) {
        CoreModule.f17553k.f91950m.delete(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v3 */
    public static final stc0 m199964v3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31247S1()).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m199965w3(vta vtaVar, Envelope envelope) {
        envelope.getClass();
        if (200 == envelope.meta.code) {
            SeeExposedUser seeExposedUser = ((CoreData) envelope.getModuleData(CoreData.class)).seeExposedUser;
            seeExposedUser.getClass();
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            list.getClass();
            if (TextUtils.isEmpty(seeExposedUser.userId) || !CoreModule.f17554l.m94654e().mo34974Vh()) {
                if (!TextUtils.isEmpty(CoreModule.m29932K().mo30810q8())) {
                    String strMo30810q8 = CoreModule.m29932K().mo30810q8();
                    strMo30810q8.getClass();
                    vtaVar.m199971s3(strMo30810q8);
                    CoreModule.m29932K().mo30697Io("");
                }
                CoreModule.m29932K().mo30709Mq(0L);
                vtaVar.localConvUserData = null;
                return Unit.INSTANCE;
            }
            if (!TextUtils.isEmpty(seeExposedUser.userId) && NullChecker.m81303a(list) && list.size() == 1) {
                if (!Intrinsics.m87488d(CoreModule.m29932K().mo30810q8(), seeExposedUser.userId)) {
                    String strMo30810q9 = CoreModule.m29932K().mo30810q8();
                    strMo30810q9.getClass();
                    vtaVar.m199971s3(strMo30810q9);
                }
                CoreModule.m29932K().mo30709Mq(Long.valueOf(seeExposedUser.timestamp * 1000));
                CoreModule.m29932K().mo30697Io(seeExposedUser.userId);
                vtaVar.f72126Q.m31492w3(envelope, null);
                vtaVar.localConvUserData = seeExposedUser;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public static final Unit m199966x3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B3 */
    public final boolean m199967B3(@NotNull String userId) {
        userId.getClass();
        SeeExposedUser seeExposedUser = this.localConvUserData;
        if (seeExposedUser != null) {
            return !Intrinsics.m87488d(seeExposedUser != null ? seeExposedUser.userId : null, userId);
        }
        return true;
    }

    /* JADX INFO: renamed from: G3 */
    public final void m199968G3(@Nullable SeeExposedUser seeExposedUser) {
        this.localConvUserData = seeExposedUser;
    }

    /* JADX INFO: renamed from: H3 */
    public final void m199969H3(@NotNull String userId) {
        userId.getClass();
        m199942C3(userId);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m199970o3() {
        this.f72126Q.scheduled("receive_like_guide_clear", 0, new v9j() { // from class: l.mta
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vta.m199954i3(this.f135561a);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final void m199971s3(@NotNull final String conVersionId) {
        conVersionId.getClass();
        e51.m114774y(new Runnable() { // from class: l.hta
            @Override // java.lang.Runnable
            public final void run() {
                vta.m199955j3(this.f109380a, conVersionId);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final void m199972u3() {
        this.f72126Q.scheduled("receive_like_guide_get", 0, new v9j() { // from class: l.ita
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vta.m199958m3(this.f114867a);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: y3, reason: from getter */
    public final SeeExposedUser getLocalConvUserData() {
        return this.localConvUserData;
    }

    @NotNull
    /* JADX INFO: renamed from: z3, reason: from getter */
    public final uqd0 getLocalReceiveLikeGuideText() {
        return this.localReceiveLikeGuideText;
    }
}
