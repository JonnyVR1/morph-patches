package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.SeeExposedUser;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
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
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Ll/qa9;", "Ll/dy6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "userId", "", "J3", "(Ljava/lang/String;)V", "q3", "()V", "w3", "", "leastTime", "C3", "(Ljava/lang/String;J)V", "conVersionId", "u3", "E3", "Ll/z1d0;", "B3", "(Ljava/lang/String;)Ll/z1d0;", "Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "R", "Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "A3", "()Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "I3", "(Lcom/p1/mobile/putong/core/data/SeeExposedUser;)V", "localConvUserData", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qa9 extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public SeeExposedUser localConvUserData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa9(@NotNull C4883c c4883c) {
        super(c4883c);
        c4883c.getClass();
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m175863D3(String str, long j) {
        Conversation conversationQuery = CoreModule.f18272k.f115545m.query(str);
        if (NullChecker.m82486a(conversationQuery)) {
            if (Intrinsics.m88377d(conversationQuery != null ? conversationQuery.convType : null, ConversationType.fakeIntlReceiveLikeGuideSVip)) {
                return;
            }
        }
        Conversation conversationNew_ = Conversation.new_();
        conversationNew_.f56859id = str;
        double d = j * 1000;
        conversationNew_.latestTime = d;
        conversationNew_.createdTime = d;
        conversationNew_.localEverHasMessage = true;
        conversationNew_.read = Boolean.TRUE;
        conversationNew_.convType = ConversationType.fakeIntlReceiveLikeGuideSVip;
        CoreModule.f18264c.f20384f0.m34053mq(conversationNew_);
        CoreModule.m30930K().mo31759dk(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F3 */
    public static final x1d0 m175864F3(qa9 qa9Var, String str) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32250S1()).m209038l(qa9Var.m175891B3(str)).m209028b();
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m175865G3(qa9 qa9Var, Envelope envelope) {
        envelope.getClass();
        if (200 == envelope.meta.code) {
            qa9Var.m175898w3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m175866H3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g3 */
    public static C22421c m175873g3(final qa9 qa9Var) {
        C22421c<Envelope> c22421cObserveOn = qi20.m176654a(new pcj() { // from class: l.la9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qa9.m175887x3();
            }
        }).observeOn(Schedulers.m222739io());
        final Function1 function1 = new Function1() { // from class: l.ma9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qa9.m175888y3(this.f135491a, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.na9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qa9.m175889z3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public static void m175875i3(qa9 qa9Var, final String str) {
        qa9Var.f91137Q.f20351U.m128074a(new x20() { // from class: l.fa9
            @Override // p153l.x20
            public final void call() {
                qa9.m175886v3(str);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static C22421c m175878l3(final qa9 qa9Var, final String str) {
        C22421c<Envelope> c22421cM176654a = qi20.m176654a(new pcj() { // from class: l.oa9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qa9.m175864F3(this.f145670a, str);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.pa9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qa9.m175865G3(this.f151252a, (Envelope) obj);
            }
        };
        return c22421cM176654a.map(new qcj() { // from class: l.ba9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qa9.m175866H3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public static void m175880n3(qa9 qa9Var, final String str, final long j) {
        qa9Var.f91137Q.f20351U.m128074a(new x20() { // from class: l.ga9
            @Override // p153l.x20
            public final void call() {
                qa9.m175863D3(str, j);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public static C22421c m175882p3(final qa9 qa9Var) {
        C22421c<Envelope> c22421cObserveOn = qi20.m176654a(new pcj() { // from class: l.ca9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qa9.m175883r3();
            }
        }).observeOn(Schedulers.m222739io());
        final Function1 function1 = new Function1() { // from class: l.da9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qa9.m175884s3(this.f85852a, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.ea9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qa9.m175885t3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public static final x1d0 m175883r3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32250S1()).m209030d().m209028b();
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m175884s3(qa9 qa9Var, Envelope envelope) {
        qa9Var.localConvUserData = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m175885t3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v3 */
    public static final void m175886v3(String str) {
        CoreModule.f18272k.f115545m.delete(str);
    }

    /* JADX INFO: renamed from: x3 */
    public static final x1d0 m175887x3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32250S1()).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m175888y3(qa9 qa9Var, Envelope envelope) {
        envelope.getClass();
        if (200 == envelope.meta.code) {
            SeeExposedUser seeExposedUser = ((CoreData) envelope.getModuleData(CoreData.class)).seeExposedUser;
            seeExposedUser.getClass();
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            list.getClass();
            if (TextUtils.isEmpty(seeExposedUser.userId) || !CoreModule.f18276o.m132212b().mo34652wf()) {
                if (!TextUtils.isEmpty(CoreModule.m30930K().mo31681Ch())) {
                    String strMo31681Ch = CoreModule.m30930K().mo31681Ch();
                    strMo31681Ch.getClass();
                    qa9Var.m175897u3(strMo31681Ch);
                    CoreModule.m30930K().mo31727Rp("");
                    CoreModule.m30930K().mo31713Ne(0L);
                    qa9Var.localConvUserData = null;
                }
                return Unit.INSTANCE;
            }
            if (!TextUtils.isEmpty(seeExposedUser.userId) && NullChecker.m82486a(list) && list.size() == 1) {
                if (!Intrinsics.m88377d(CoreModule.m30930K().mo31681Ch(), seeExposedUser.userId)) {
                    String strMo31681Ch2 = CoreModule.m30930K().mo31681Ch();
                    strMo31681Ch2.getClass();
                    qa9Var.m175897u3(strMo31681Ch2);
                }
                CoreModule.m30930K().mo31713Ne(Long.valueOf(seeExposedUser.timestamp * 1000));
                CoreModule.m30930K().mo31727Rp(seeExposedUser.userId);
                qa9Var.f91137Q.m32495w3(envelope, null);
                qa9Var.localConvUserData = seeExposedUser;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m175889z3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: A3, reason: from getter */
    public final SeeExposedUser getLocalConvUserData() {
        return this.localConvUserData;
    }

    /* JADX INFO: renamed from: B3 */
    public final z1d0 m175891B3(String userId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", userId);
        z1d0 z1d0VarCreate = z1d0.create(Network.JSON, jSONObject.toString());
        z1d0VarCreate.getClass();
        return z1d0VarCreate;
    }

    /* JADX INFO: renamed from: C3 */
    public final void m175892C3(@NotNull final String userId, final long leastTime) {
        userId.getClass();
        l51.m152919y(new Runnable() { // from class: l.ka9
            @Override // java.lang.Runnable
            public final void run() {
                qa9.m175880n3(this.f124637a, userId, leastTime);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final void m175893E3(final String userId) {
        this.f91137Q.scheduled("intl_receive_like_guide_" + userId, -1, new pcj() { // from class: l.aa9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qa9.m175878l3(this.f69109a, userId);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final void m175894I3(@Nullable SeeExposedUser seeExposedUser) {
        this.localConvUserData = seeExposedUser;
    }

    /* JADX INFO: renamed from: J3 */
    public final void m175895J3(@NotNull String userId) {
        userId.getClass();
        m175893E3(userId);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m175896q3() {
        this.f91137Q.scheduled("intl_receive_like_guide_clear", 0, new pcj() { // from class: l.ia9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qa9.m175882p3(this.f113567a);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final void m175897u3(@NotNull final String conVersionId) {
        conVersionId.getClass();
        l51.m152919y(new Runnable() { // from class: l.ja9
            @Override // java.lang.Runnable
            public final void run() {
                qa9.m175875i3(this.f118961a, conVersionId);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public final void m175898w3() {
        this.f91137Q.scheduled("intl_receive_like_guide_get", 0, new pcj() { // from class: l.ha9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qa9.m175873g3(this.f108482a);
            }
        });
    }
}
