package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.SeeExposedUser;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.e51;
import l.stc0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\nJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Ll/vta;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "userId", "", "C3", "(Ljava/lang/String;)V", "Ll/utc0;", "A3", "(Ljava/lang/String;)Ll/utc0;", "H3", "o3", "()V", "u3", "conVersionId", "s3", "", "B3", "(Ljava/lang/String;)Z", "Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "R", "Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "y3", "()Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "G3", "(Lcom/p1/mobile/putong/core/data/SeeExposedUser;)V", "localConvUserData", "Ll/uqd0;", "S", "Ll/uqd0;", "z3", "()Ll/uqd0;", "setLocalReceiveLikeGuideText", "(Ll/uqd0;)V", "localReceiveLikeGuideText", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class vta extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public SeeExposedUser localConvUserData;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public uqd0 localReceiveLikeGuideText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vta(@NotNull C0158c c0158c) {
        super(c0158c);
        c0158c.getClass();
        this.localReceiveLikeGuideText = new uqd0("local_receive_like_guide_text_" + CoreModule.m1850H().userId(), "");
    }

    /* JADX INFO: renamed from: A3 */
    private final utc0 m25866A3(String userId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", userId);
        utc0 utc0VarCreate = utc0.create(Network.JSON, jSONObject.toString());
        utc0VarCreate.getClass();
        return utc0VarCreate;
    }

    /* JADX INFO: renamed from: C3 */
    private final void m25867C3(final String userId) {
        this.f8580Q.scheduled("receive_like_guide_" + userId, 0, new v9j() { // from class: l.rta
            public final Object call() {
                return vta.m25878h3(this.f20733a, userId);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public static final stc0 m25868D3(vta vtaVar, String str) {
        return C0154a.f3483P.auth().q(C0154a.m3177S1()).l(vtaVar.m25866A3(str)).b();
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m25869E3(vta vtaVar, Envelope envelope) {
        envelope.getClass();
        if (200 == envelope.meta.code) {
            vtaVar.m25897u3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public static final Unit m25870F3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h3 */
    public static c m25878h3(final vta vtaVar, final String str) {
        c<Envelope> cVarM16567a = ia20.m16567a(new v9j() { // from class: l.sta
            public final Object call() {
                return vta.m25868D3(this.f21648a, str);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.tta
            public final Object invoke(Object obj) {
                return vta.m25869E3(this.f22269a, (Envelope) obj);
            }
        };
        return cVarM16567a.map(new w9j() { // from class: l.uta
            public final Object call(Object obj) {
                return vta.m25870F3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public static c m25879i3(final vta vtaVar) {
        c cVarObserveOn = ia20.m16567a(new v9j() { // from class: l.nta
            public final Object call() {
                return vta.m25885p3();
            }
        }).observeOn(Schedulers.io());
        final Function1 function1 = new Function1() { // from class: l.ota
            public final Object invoke(Object obj) {
                return vta.m25886q3(this.f18365a, (Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.pta
            public final Object call(Object obj) {
                return vta.m25887r3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public static void m25880j3(vta vtaVar, final String str) {
        vtaVar.f8580Q.f3598U.m13685a(new d30() { // from class: l.qta
            public final void call() {
                vta.m25888t3(str);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public static c m25883m3(final vta vtaVar) {
        c cVarObserveOn = ia20.m16567a(new v9j() { // from class: l.jta
            public final Object call() {
                return vta.m25889v3();
            }
        }).observeOn(Schedulers.io());
        final Function1 function1 = new Function1() { // from class: l.kta
            public final Object invoke(Object obj) {
                return vta.m25890w3(this.f15992a, (Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.lta
            public final Object call(Object obj) {
                return vta.m25891x3(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public static final stc0 m25885p3() {
        return C0154a.f3483P.auth().q(C0154a.m3177S1()).d().b();
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m25886q3(vta vtaVar, Envelope envelope) {
        vtaVar.localConvUserData = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public static final Unit m25887r3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public static final void m25888t3(String str) {
        CoreModule.f1542k.f11205m.delete(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v3 */
    public static final stc0 m25889v3() {
        return C0154a.f3483P.auth().q(C0154a.m3177S1()).f().b();
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m25890w3(vta vtaVar, Envelope envelope) {
        envelope.getClass();
        if (200 == envelope.meta.code) {
            SeeExposedUser seeExposedUser = envelope.getModuleData(CoreData.class).seeExposedUser;
            seeExposedUser.getClass();
            List list = envelope.getModuleData(CommonData.class).users;
            list.getClass();
            if (TextUtils.isEmpty(seeExposedUser.userId) || !CoreModule.f1543l.m11709e().m6911Vh()) {
                if (!TextUtils.isEmpty(CoreModule.m1851K().q8())) {
                    String strQ8 = CoreModule.m1851K().q8();
                    strQ8.getClass();
                    vtaVar.m25896s3(strQ8);
                    CoreModule.m1851K().Io("");
                }
                CoreModule.m1851K().Mq(0L);
                vtaVar.localConvUserData = null;
                return Unit.INSTANCE;
            }
            if (!TextUtils.isEmpty(seeExposedUser.userId) && NullChecker.a(list) && list.size() == 1) {
                if (!Intrinsics.d(CoreModule.m1851K().q8(), seeExposedUser.userId)) {
                    String strQ9 = CoreModule.m1851K().q8();
                    strQ9.getClass();
                    vtaVar.m25896s3(strQ9);
                }
                CoreModule.m1851K().Mq(Long.valueOf(seeExposedUser.timestamp * 1000));
                CoreModule.m1851K().Io(seeExposedUser.userId);
                vtaVar.f8580Q.m3422w3(envelope, null);
                vtaVar.localConvUserData = seeExposedUser;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public static final Unit m25891x3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B3 */
    public final boolean m25892B3(@NotNull String userId) {
        userId.getClass();
        SeeExposedUser seeExposedUser = this.localConvUserData;
        if (seeExposedUser != null) {
            return !Intrinsics.d(seeExposedUser != null ? seeExposedUser.userId : null, userId);
        }
        return true;
    }

    /* JADX INFO: renamed from: G3 */
    public final void m25893G3(@Nullable SeeExposedUser seeExposedUser) {
        this.localConvUserData = seeExposedUser;
    }

    /* JADX INFO: renamed from: H3 */
    public final void m25894H3(@NotNull String userId) {
        userId.getClass();
        m25867C3(userId);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m25895o3() {
        this.f8580Q.scheduled("receive_like_guide_clear", 0, new v9j() { // from class: l.mta
            public final Object call() {
                return vta.m25879i3(this.f17237a);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final void m25896s3(@NotNull final String conVersionId) {
        conVersionId.getClass();
        e51.y(new Runnable() { // from class: l.hta
            @Override // java.lang.Runnable
            public final void run() {
                vta.m25880j3(this.f14049a, conVersionId);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final void m25897u3() {
        this.f8580Q.scheduled("receive_like_guide_get", 0, new v9j() { // from class: l.ita
            public final Object call() {
                return vta.m25883m3(this.f14779a);
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
