package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
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
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\nJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m88121d2 = {"Ll/hva;", "Ll/dy6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "userId", "", "C3", "(Ljava/lang/String;)V", "Ll/z1d0;", "A3", "(Ljava/lang/String;)Ll/z1d0;", "H3", "o3", "()V", "u3", "conVersionId", "s3", "", "B3", "(Ljava/lang/String;)Z", "Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "R", "Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "y3", "()Lcom/p1/mobile/putong/core/data/SeeExposedUser;", "G3", "(Lcom/p1/mobile/putong/core/data/SeeExposedUser;)V", "localConvUserData", "Ll/wyd0;", p7f.LATITUDE_SOUTH, "Ll/wyd0;", "z3", "()Ll/wyd0;", "setLocalReceiveLikeGuideText", "(Ll/wyd0;)V", "localReceiveLikeGuideText", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class hva extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public SeeExposedUser localConvUserData;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public wyd0 localReceiveLikeGuideText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hva(@NotNull C4883c c4883c) {
        super(c4883c);
        c4883c.getClass();
        this.localReceiveLikeGuideText = new wyd0("local_receive_like_guide_text_" + CoreModule.m30929H().userId(), "");
    }

    /* JADX INFO: renamed from: A3 */
    private final z1d0 m137275A3(String userId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", userId);
        z1d0 z1d0VarCreate = z1d0.create(Network.JSON, jSONObject.toString());
        z1d0VarCreate.getClass();
        return z1d0VarCreate;
    }

    /* JADX INFO: renamed from: C3 */
    private final void m137276C3(final String userId) {
        this.f91137Q.scheduled("receive_like_guide_" + userId, 0, new pcj() { // from class: l.dva
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hva.m137287h3(this.f90920a, userId);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public static final x1d0 m137277D3(hva hvaVar, String str) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32250S1()).m209038l(hvaVar.m137275A3(str)).m209028b();
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m137278E3(hva hvaVar, Envelope envelope) {
        envelope.getClass();
        if (200 == envelope.meta.code) {
            hvaVar.m137306u3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public static final Unit m137279F3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h3 */
    public static C22421c m137287h3(final hva hvaVar, final String str) {
        C22421c<Envelope> c22421cM176654a = qi20.m176654a(new pcj() { // from class: l.eva
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hva.m137277D3(this.f95992a, str);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.fva
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hva.m137278E3(this.f100996a, (Envelope) obj);
            }
        };
        return c22421cM176654a.map(new qcj() { // from class: l.gva
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hva.m137279F3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public static C22421c m137288i3(final hva hvaVar) {
        C22421c<Envelope> c22421cObserveOn = qi20.m176654a(new pcj() { // from class: l.zua
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hva.m137294p3();
            }
        }).observeOn(Schedulers.m222739io());
        final Function1 function1 = new Function1() { // from class: l.ava
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hva.m137295q3(this.f73600a, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.bva
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hva.m137296r3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public static void m137289j3(hva hvaVar, final String str) {
        hvaVar.f91137Q.f20351U.m128074a(new x20() { // from class: l.cva
            @Override // p153l.x20
            public final void call() {
                hva.m137297t3(str);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public static C22421c m137292m3(final hva hvaVar) {
        C22421c<Envelope> c22421cObserveOn = qi20.m176654a(new pcj() { // from class: l.vua
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hva.m137298v3();
            }
        }).observeOn(Schedulers.m222739io());
        final Function1 function1 = new Function1() { // from class: l.wua
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hva.m137299w3(this.f190850a, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.xua
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hva.m137300x3(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public static final x1d0 m137294p3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32250S1()).m209030d().m209028b();
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m137295q3(hva hvaVar, Envelope envelope) {
        hvaVar.localConvUserData = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public static final Unit m137296r3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public static final void m137297t3(String str) {
        CoreModule.f18272k.f115545m.delete(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v3 */
    public static final x1d0 m137298v3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32250S1()).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m137299w3(hva hvaVar, Envelope envelope) {
        envelope.getClass();
        if (200 == envelope.meta.code) {
            SeeExposedUser seeExposedUser = ((CoreData) envelope.getModuleData(CoreData.class)).seeExposedUser;
            seeExposedUser.getClass();
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            list.getClass();
            if (TextUtils.isEmpty(seeExposedUser.userId) || !CoreModule.f18273l.m143408e().mo35977Vh()) {
                if (!TextUtils.isEmpty(CoreModule.m30930K().mo31813q8())) {
                    String strMo31813q8 = CoreModule.m30930K().mo31813q8();
                    strMo31813q8.getClass();
                    hvaVar.m137305s3(strMo31813q8);
                    CoreModule.m30930K().mo31700Io("");
                }
                CoreModule.m30930K().mo31712Mq(0L);
                hvaVar.localConvUserData = null;
                return Unit.INSTANCE;
            }
            if (!TextUtils.isEmpty(seeExposedUser.userId) && NullChecker.m82486a(list) && list.size() == 1) {
                if (!Intrinsics.m88377d(CoreModule.m30930K().mo31813q8(), seeExposedUser.userId)) {
                    String strMo31813q9 = CoreModule.m30930K().mo31813q8();
                    strMo31813q9.getClass();
                    hvaVar.m137305s3(strMo31813q9);
                }
                CoreModule.m30930K().mo31712Mq(Long.valueOf(seeExposedUser.timestamp * 1000));
                CoreModule.m30930K().mo31700Io(seeExposedUser.userId);
                hvaVar.f91137Q.m32495w3(envelope, null);
                hvaVar.localConvUserData = seeExposedUser;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public static final Unit m137300x3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B3 */
    public final boolean m137301B3(@NotNull String userId) {
        userId.getClass();
        SeeExposedUser seeExposedUser = this.localConvUserData;
        if (seeExposedUser != null) {
            return !Intrinsics.m88377d(seeExposedUser != null ? seeExposedUser.userId : null, userId);
        }
        return true;
    }

    /* JADX INFO: renamed from: G3 */
    public final void m137302G3(@Nullable SeeExposedUser seeExposedUser) {
        this.localConvUserData = seeExposedUser;
    }

    /* JADX INFO: renamed from: H3 */
    public final void m137303H3(@NotNull String userId) {
        userId.getClass();
        m137276C3(userId);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m137304o3() {
        this.f91137Q.scheduled("receive_like_guide_clear", 0, new pcj() { // from class: l.yua
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hva.m137288i3(this.f201598a);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final void m137305s3(@NotNull final String conVersionId) {
        conVersionId.getClass();
        l51.m152919y(new Runnable() { // from class: l.tua
            @Override // java.lang.Runnable
            public final void run() {
                hva.m137289j3(this.f176175a, conVersionId);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final void m137306u3() {
        this.f91137Q.scheduled("receive_like_guide_get", 0, new pcj() { // from class: l.uua
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hva.m137292m3(this.f181049a);
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
    public final wyd0 getLocalReceiveLikeGuideText() {
        return this.localReceiveLikeGuideText;
    }
}
