package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/ui50;", "", "<init>", "()V", "", "userId", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "k", "j", BLiveStormDanmakuGiftResourceType.f44444l, "h", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "g", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ui50 {

    @NotNull
    public static final ui50 INSTANCE = new ui50();

    /* JADX INFO: renamed from: a */
    public static Boolean m193855a(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: b */
    public static C22306c m193856b(String str, Boolean bool) {
        return CoreModule.f17545c.f19642f0.m32902ap(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m193857c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m193858d(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static void m193859e(Act act, String str, roj0 roj0Var) {
        act.startActivity(MessagesAct.m48948o2(act, str, false, false, false, false, null, 40));
    }

    /* JADX INFO: renamed from: f */
    public static C22306c m193860f(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m193861g(@NotNull final Act act, @NotNull final String userId) {
        act.getClass();
        userId.getClass();
        C22306c<Boolean> c22306cM31161y5 = CoreModule.f17545c.f19663m0.m31161y5(userId);
        final Function1 function1 = new Function1() { // from class: l.oi50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ui50.m193855a((Boolean) obj);
            }
        };
        C22306c<Boolean> c22306cFilter = c22306cM31161y5.filter(new w9j() { // from class: l.pi50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ui50.m193858d(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.qi50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ui50.m193856b(userId, (Boolean) obj);
            }
        };
        act.duringCreated((C22306c) c22306cFilter.switchMap(new w9j() { // from class: l.ri50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ui50.m193860f(function2, obj);
            }
        })).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.si50
            @Override // p149l.e30
            public final void call(Object obj) {
                ui50.m193859e(act, userId, (roj0) obj);
            }
        }, new e30() { // from class: l.ti50
            @Override // p149l.e30
            public final void call(Object obj) {
                ui50.m193857c((Throwable) obj);
            }
        }));
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m193862h(@NotNull String userId) {
        userId.getClass();
        CoreModule.f17545c.f19663m0.m31160x8(userId).subscribe(mkd0.m154954F());
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m193863i(@NotNull String userId) {
        userId.getClass();
        zvf0.m220397s("e_peipei_card_accpet", "p_peipei_card", MapsKt.mapOf(TuplesKt.m87240a("peipei_uid", userId)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m193864j(@NotNull String userId) {
        userId.getClass();
        zvf0.m220403y("e_peipei_card", "p_suggest_users_home_view", MapsKt.mapOf(TuplesKt.m87240a("peipei_uid", userId)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m193865k(@NotNull String userId) {
        userId.getClass();
        zvf0.m220397s("e_peipei_pupup_accept", "p_peipei_pupup", MapsKt.mapOf(TuplesKt.m87240a("peipei_uid", userId)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m193866l(@NotNull String userId) {
        userId.getClass();
        zvf0.m220403y("e_peipei_pupup", OMSDialogPositon.p_messages_view, MapsKt.mapOf(TuplesKt.m87240a("peipei_uid", userId)));
    }
}
