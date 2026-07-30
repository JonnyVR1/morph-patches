package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/ar50;", "", "<init>", "()V", "", "userId", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "k", "j", BLiveStormDanmakuGiftResourceType.f45292l, "h", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "g", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ar50 {

    @NotNull
    public static final ar50 INSTANCE = new ar50();

    /* JADX INFO: renamed from: a */
    public static Boolean m99646a(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: b */
    public static C22421c m99647b(String str, Boolean bool) {
        return CoreModule.f18264c.f20384f0.m33905ap(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m99648c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m99649d(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static void m99650e(Act act, String str, uxj0 uxj0Var) {
        act.startActivity(MessagesAct.m50131p2(act, str, false, false, false, false, null, 40));
    }

    /* JADX INFO: renamed from: f */
    public static C22421c m99651f(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m99652g(@NotNull final Act act, @NotNull final String userId) {
        act.getClass();
        userId.getClass();
        C22421c<Boolean> c22421cM32164y5 = CoreModule.f18264c.f20405m0.m32164y5(userId);
        final Function1 function1 = new Function1() { // from class: l.uq50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ar50.m99646a((Boolean) obj);
            }
        };
        C22421c<Boolean> c22421cFilter = c22421cM32164y5.filter(new qcj() { // from class: l.vq50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ar50.m99649d(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.wq50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ar50.m99647b(userId, (Boolean) obj);
            }
        };
        act.duringCreated((C22421c) c22421cFilter.switchMap(new qcj() { // from class: l.xq50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ar50.m99651f(function2, obj);
            }
        })).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.yq50
            @Override // p153l.y20
            public final void call(Object obj) {
                ar50.m99650e(act, userId, (uxj0) obj);
            }
        }, new y20() { // from class: l.zq50
            @Override // p153l.y20
            public final void call(Object obj) {
                ar50.m99648c((Throwable) obj);
            }
        }));
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m99653h(@NotNull String userId) {
        userId.getClass();
        CoreModule.f18264c.f20405m0.m32163x8(userId).subscribe(psd0.m173595F());
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m99654i(@NotNull String userId) {
        userId.getClass();
        i4g0.m138521s("e_peipei_card_accpet", "p_peipei_card", MapsKt.mapOf(TuplesKt.m88129a("peipei_uid", userId)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m99655j(@NotNull String userId) {
        userId.getClass();
        i4g0.m138527y("e_peipei_card", "p_suggest_users_home_view", MapsKt.mapOf(TuplesKt.m88129a("peipei_uid", userId)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m99656k(@NotNull String userId) {
        userId.getClass();
        i4g0.m138521s("e_peipei_pupup_accept", "p_peipei_pupup", MapsKt.mapOf(TuplesKt.m88129a("peipei_uid", userId)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m99657l(@NotNull String userId) {
        userId.getClass();
        i4g0.m138527y("e_peipei_pupup", OMSDialogPositon.p_messages_view, MapsKt.mapOf(TuplesKt.m88129a("peipei_uid", userId)));
    }
}
