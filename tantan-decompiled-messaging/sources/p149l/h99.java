package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
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
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m87232d2 = {"Ll/h99;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "userId", "", "J3", "(Ljava/lang/String;)V", "q3", "()V", "w3", "", "leastTime", "C3", "(Ljava/lang/String;J)V", "conVersionId", "u3", "E3", "Ll/utc0;", "B3", "(Ljava/lang/String;)Ll/utc0;", "Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "R", "Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "A3", "()Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "I3", "(Lcom/p1/mobile/putong/core/data/SeeExposedUser;)V", "localConvUserData", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class h99 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public SeeExposedUser localConvUserData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h99(@NotNull C4732c c4732c) {
        super(c4732c);
        c4732c.getClass();
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m129951D3(String str, long j) {
        Conversation conversationQuery = CoreModule.f17553k.f91950m.query(str);
        if (NullChecker.m81303a(conversationQuery)) {
            if (Intrinsics.m87488d(conversationQuery != null ? conversationQuery.convType : null, ConversationType.fakeIntlReceiveLikeGuideSVip)) {
                return;
            }
        }
        Conversation conversationNew_ = Conversation.new_();
        conversationNew_.f56011id = str;
        double d = j * 1000;
        conversationNew_.latestTime = d;
        conversationNew_.createdTime = d;
        conversationNew_.localEverHasMessage = true;
        conversationNew_.read = Boolean.TRUE;
        conversationNew_.convType = ConversationType.fakeIntlReceiveLikeGuideSVip;
        CoreModule.f17545c.f19642f0.m33050mq(conversationNew_);
        CoreModule.m29932K().mo30756dk(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F3 */
    public static final stc0 m129952F3(h99 h99Var, String str) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31247S1()).m185893l(h99Var.m129979B3(str)).m185883b();
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m129953G3(h99 h99Var, Envelope envelope) {
        envelope.getClass();
        if (200 == envelope.meta.code) {
            h99Var.m129986w3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m129954H3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g3 */
    public static C22306c m129961g3(final h99 h99Var) {
        C22306c<Envelope> c22306cObserveOn = ia20.m135117a(new v9j() { // from class: l.c99
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return h99.m129975x3();
            }
        }).observeOn(Schedulers.m221493io());
        final Function1 function1 = new Function1() { // from class: l.d99
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h99.m129976y3(this.f84943a, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.e99
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h99.m129977z3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public static void m129963i3(h99 h99Var, final String str) {
        h99Var.f72126Q.f19609U.m109085a(new d30() { // from class: l.w89
            @Override // p149l.d30
            public final void call() {
                h99.m129974v3(str);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static C22306c m129966l3(final h99 h99Var, final String str) {
        C22306c<Envelope> c22306cM135117a = ia20.m135117a(new v9j() { // from class: l.f99
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return h99.m129952F3(this.f96460a, str);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.g99
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h99.m129953G3(this.f101551a, (Envelope) obj);
            }
        };
        return c22306cM135117a.map(new w9j() { // from class: l.s89
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h99.m129954H3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public static void m129968n3(h99 h99Var, final String str, final long j) {
        h99Var.f72126Q.f19609U.m109085a(new d30() { // from class: l.x89
            @Override // p149l.d30
            public final void call() {
                h99.m129951D3(str, j);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public static C22306c m129970p3(final h99 h99Var) {
        C22306c<Envelope> c22306cObserveOn = ia20.m135117a(new v9j() { // from class: l.t89
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return h99.m129971r3();
            }
        }).observeOn(Schedulers.m221493io());
        final Function1 function1 = new Function1() { // from class: l.u89
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h99.m129972s3(this.f175104a, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.v89
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h99.m129973t3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public static final stc0 m129971r3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31247S1()).m185885d().m185883b();
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m129972s3(h99 h99Var, Envelope envelope) {
        h99Var.localConvUserData = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m129973t3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v3 */
    public static final void m129974v3(String str) {
        CoreModule.f17553k.f91950m.delete(str);
    }

    /* JADX INFO: renamed from: x3 */
    public static final stc0 m129975x3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31247S1()).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m129976y3(h99 h99Var, Envelope envelope) {
        envelope.getClass();
        if (200 == envelope.meta.code) {
            SeeExposedUser seeExposedUser = ((CoreData) envelope.getModuleData(CoreData.class)).seeExposedUser;
            seeExposedUser.getClass();
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            list.getClass();
            if (TextUtils.isEmpty(seeExposedUser.userId) || !CoreModule.f17557o.m195055b().mo33649wf()) {
                if (!TextUtils.isEmpty(CoreModule.m29932K().mo30678Ch())) {
                    String strMo30678Ch = CoreModule.m29932K().mo30678Ch();
                    strMo30678Ch.getClass();
                    h99Var.m129985u3(strMo30678Ch);
                    CoreModule.m29932K().mo30724Rp("");
                    CoreModule.m29932K().mo30710Ne(0L);
                    h99Var.localConvUserData = null;
                }
                return Unit.INSTANCE;
            }
            if (!TextUtils.isEmpty(seeExposedUser.userId) && NullChecker.m81303a(list) && list.size() == 1) {
                if (!Intrinsics.m87488d(CoreModule.m29932K().mo30678Ch(), seeExposedUser.userId)) {
                    String strMo30678Ch2 = CoreModule.m29932K().mo30678Ch();
                    strMo30678Ch2.getClass();
                    h99Var.m129985u3(strMo30678Ch2);
                }
                CoreModule.m29932K().mo30710Ne(Long.valueOf(seeExposedUser.timestamp * 1000));
                CoreModule.m29932K().mo30724Rp(seeExposedUser.userId);
                h99Var.f72126Q.m31492w3(envelope, null);
                h99Var.localConvUserData = seeExposedUser;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m129977z3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: A3, reason: from getter */
    public final SeeExposedUser getLocalConvUserData() {
        return this.localConvUserData;
    }

    /* JADX INFO: renamed from: B3 */
    public final utc0 m129979B3(String userId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", userId);
        utc0 utc0VarCreate = utc0.create(Network.JSON, jSONObject.toString());
        utc0VarCreate.getClass();
        return utc0VarCreate;
    }

    /* JADX INFO: renamed from: C3 */
    public final void m129980C3(@NotNull final String userId, final long leastTime) {
        userId.getClass();
        e51.m114774y(new Runnable() { // from class: l.b99
            @Override // java.lang.Runnable
            public final void run() {
                h99.m129968n3(this.f74207a, userId, leastTime);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final void m129981E3(final String userId) {
        this.f72126Q.scheduled("intl_receive_like_guide_" + userId, -1, new v9j() { // from class: l.r89
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return h99.m129966l3(this.f158163a, userId);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final void m129982I3(@Nullable SeeExposedUser seeExposedUser) {
        this.localConvUserData = seeExposedUser;
    }

    /* JADX INFO: renamed from: J3 */
    public final void m129983J3(@NotNull String userId) {
        userId.getClass();
        m129981E3(userId);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m129984q3() {
        this.f72126Q.scheduled("intl_receive_like_guide_clear", 0, new v9j() { // from class: l.z89
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return h99.m129970p3(this.f202111a);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final void m129985u3(@NotNull final String conVersionId) {
        conVersionId.getClass();
        e51.m114774y(new Runnable() { // from class: l.a99
            @Override // java.lang.Runnable
            public final void run() {
                h99.m129963i3(this.f68121a, conVersionId);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public final void m129986w3() {
        this.f72126Q.scheduled("intl_receive_like_guide_get", 0, new v9j() { // from class: l.y89
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return h99.m129961g3(this.f196784a);
            }
        });
    }
}
