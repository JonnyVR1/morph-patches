package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.SeeExposedUser;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.e51;
import l.stc0;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ll/h99;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "userId", "", "J3", "(Ljava/lang/String;)V", "q3", "()V", "w3", "", "leastTime", "C3", "(Ljava/lang/String;J)V", "conVersionId", "u3", "E3", "Ll/utc0;", "B3", "(Ljava/lang/String;)Ll/utc0;", "Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "R", "Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "A3", "()Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "I3", "(Lcom/p1/mobile/putong/core/data/SeeExposedUser;)V", "localConvUserData", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h99 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public SeeExposedUser localConvUserData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h99(@NotNull C0158c c0158c) {
        super(c0158c);
        c0158c.getClass();
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m16064D3(String str, long j) {
        Conversation conversationQuery = CoreModule.f1542k.f11205m.query(str);
        if (NullChecker.a(conversationQuery)) {
            if (Intrinsics.d(conversationQuery != null ? conversationQuery.convType : null, "fakeIntlReceiveLikeGuideSVip")) {
                return;
            }
        }
        Conversation conversationNew_ = Conversation.new_();
        ((DbObject) conversationNew_).id = str;
        double d = j * 1000;
        conversationNew_.latestTime = d;
        conversationNew_.createdTime = d;
        conversationNew_.localEverHasMessage = true;
        conversationNew_.read = Boolean.TRUE;
        conversationNew_.convType = "fakeIntlReceiveLikeGuideSVip";
        CoreModule.f1534c.f3631f0.m4980mq(conversationNew_);
        CoreModule.m1851K().dk(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F3 */
    public static final stc0 m16065F3(h99 h99Var, String str) {
        return C0154a.f3483P.auth().q(C0154a.m3177S1()).l(h99Var.m16092B3(str)).b();
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m16066G3(h99 h99Var, Envelope envelope) {
        envelope.getClass();
        if (200 == envelope.meta.code) {
            h99Var.m16099w3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m16067H3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g3 */
    public static c m16074g3(final h99 h99Var) {
        c cVarObserveOn = ia20.m16567a(new v9j() { // from class: l.c99
            public final Object call() {
                return h99.m16088x3();
            }
        }).observeOn(Schedulers.io());
        final Function1 function1 = new Function1() { // from class: l.d99
            public final Object invoke(Object obj) {
                return h99.m16089y3(this.f10071a, (Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.e99
            public final Object call(Object obj) {
                return h99.m16090z3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public static void m16076i3(h99 h99Var, final String str) {
        h99Var.f8580Q.f3598U.m13685a(new d30() { // from class: l.w89
            public final void call() {
                h99.m16087v3(str);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static c m16079l3(final h99 h99Var, final String str) {
        c<Envelope> cVarM16567a = ia20.m16567a(new v9j() { // from class: l.f99
            public final Object call() {
                return h99.m16065F3(this.f12583a, str);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.g99
            public final Object invoke(Object obj) {
                return h99.m16066G3(this.f13112a, (Envelope) obj);
            }
        };
        return cVarM16567a.map(new w9j() { // from class: l.s89
            public final Object call(Object obj) {
                return h99.m16067H3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public static void m16081n3(h99 h99Var, final String str, final long j) {
        h99Var.f8580Q.f3598U.m13685a(new d30() { // from class: l.x89
            public final void call() {
                h99.m16064D3(str, j);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public static c m16083p3(final h99 h99Var) {
        c cVarObserveOn = ia20.m16567a(new v9j() { // from class: l.t89
            public final Object call() {
                return h99.m16084r3();
            }
        }).observeOn(Schedulers.io());
        final Function1 function1 = new Function1() { // from class: l.u89
            public final Object invoke(Object obj) {
                return h99.m16085s3(this.f23427a, (Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.v89
            public final Object call(Object obj) {
                return h99.m16086t3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public static final stc0 m16084r3() {
        return C0154a.f3483P.auth().q(C0154a.m3177S1()).d().b();
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m16085s3(h99 h99Var, Envelope envelope) {
        h99Var.localConvUserData = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m16086t3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v3 */
    public static final void m16087v3(String str) {
        CoreModule.f1542k.f11205m.delete(str);
    }

    /* JADX INFO: renamed from: x3 */
    public static final stc0 m16088x3() {
        return C0154a.f3483P.auth().q(C0154a.m3177S1()).f().b();
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m16089y3(h99 h99Var, Envelope envelope) {
        envelope.getClass();
        if (200 == envelope.meta.code) {
            SeeExposedUser seeExposedUser = envelope.getModuleData(CoreData.class).seeExposedUser;
            seeExposedUser.getClass();
            List list = envelope.getModuleData(CommonData.class).users;
            list.getClass();
            if (TextUtils.isEmpty(seeExposedUser.userId) || !CoreModule.f1546o.m25557b().m5586wf()) {
                if (!TextUtils.isEmpty(CoreModule.m1851K().Ch())) {
                    String strCh = CoreModule.m1851K().Ch();
                    strCh.getClass();
                    h99Var.m16098u3(strCh);
                    CoreModule.m1851K().Rp("");
                    CoreModule.m1851K().Ne(0L);
                    h99Var.localConvUserData = null;
                }
                return Unit.INSTANCE;
            }
            if (!TextUtils.isEmpty(seeExposedUser.userId) && NullChecker.a(list) && list.size() == 1) {
                if (!Intrinsics.d(CoreModule.m1851K().Ch(), seeExposedUser.userId)) {
                    String strCh2 = CoreModule.m1851K().Ch();
                    strCh2.getClass();
                    h99Var.m16098u3(strCh2);
                }
                CoreModule.m1851K().Ne(Long.valueOf(seeExposedUser.timestamp * 1000));
                CoreModule.m1851K().Rp(seeExposedUser.userId);
                h99Var.f8580Q.m3422w3(envelope, null);
                h99Var.localConvUserData = seeExposedUser;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m16090z3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: A3, reason: from getter */
    public final SeeExposedUser getLocalConvUserData() {
        return this.localConvUserData;
    }

    /* JADX INFO: renamed from: B3 */
    public final utc0 m16092B3(String userId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", userId);
        utc0 utc0VarCreate = utc0.create(Network.JSON, jSONObject.toString());
        utc0VarCreate.getClass();
        return utc0VarCreate;
    }

    /* JADX INFO: renamed from: C3 */
    public final void m16093C3(@NotNull final String userId, final long leastTime) {
        userId.getClass();
        e51.y(new Runnable() { // from class: l.b99
            @Override // java.lang.Runnable
            public final void run() {
                h99.m16081n3(this.f8777a, userId, leastTime);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final void m16094E3(final String userId) {
        this.f8580Q.scheduled("intl_receive_like_guide_" + userId, -1, new v9j() { // from class: l.r89
            public final Object call() {
                return h99.m16079l3(this.f20405a, userId);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final void m16095I3(@Nullable SeeExposedUser seeExposedUser) {
        this.localConvUserData = seeExposedUser;
    }

    /* JADX INFO: renamed from: J3 */
    public final void m16096J3(@NotNull String userId) {
        userId.getClass();
        m16094E3(userId);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m16097q3() {
        this.f8580Q.scheduled("intl_receive_like_guide_clear", 0, new v9j() { // from class: l.z89
            public final Object call() {
                return h99.m16083p3(this.f28667a);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final void m16098u3(@NotNull final String conVersionId) {
        conVersionId.getClass();
        e51.y(new Runnable() { // from class: l.a99
            @Override // java.lang.Runnable
            public final void run() {
                h99.m16076i3(this.f8163a, conVersionId);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public final void m16099w3() {
        this.f8580Q.scheduled("intl_receive_like_guide_get", 0, new v9j() { // from class: l.y89
            public final Object call() {
                return h99.m16074g3(this.f28069a);
            }
        });
    }
}
