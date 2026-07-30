package p002l;

import android.content.Intent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import l.e30;
import l.mkd0;
import l.roj0;
import l.w9j;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ll/ui50;", "", "<init>", "()V", "", "userId", "", "i", "(Ljava/lang/String;)V", "k", "j", "l", "h", "Lcom/p1/mobile/android/app/Act;", "act", "g", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ui50 {

    @NotNull
    public static final ui50 INSTANCE = new ui50();

    /* JADX INFO: renamed from: a */
    public static Boolean m23470a(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: b */
    public static c m23471b(String str, Boolean bool) {
        return CoreModule.c.f0.ap(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m23472c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m23473d(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static void m23474e(Act act, String str, roj0 roj0Var) {
        act.startActivity(MessagesAct.o2(act, str, false, false, false, false, (Intent) null, 40));
    }

    /* JADX INFO: renamed from: f */
    public static c m23475f(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m23476g(@NotNull final Act act, @NotNull final String userId) {
        act.getClass();
        userId.getClass();
        c cVarY5 = CoreModule.c.m0.y5(userId);
        final Function1 function1 = new Function1() { // from class: l.oi50
            public final Object invoke(Object obj) {
                return ui50.m23470a((Boolean) obj);
            }
        };
        c cVarFilter = cVarY5.filter(new w9j() { // from class: l.pi50
            public final Object call(Object obj) {
                return ui50.m23473d(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.qi50
            public final Object invoke(Object obj) {
                return ui50.m23471b(userId, (Boolean) obj);
            }
        };
        act.duringCreated(cVarFilter.switchMap(new w9j() { // from class: l.ri50
            public final Object call(Object obj) {
                return ui50.m23475f(function2, obj);
            }
        })).take(1).subscribe(mkd0.H(new e30() { // from class: l.si50
            public final void call(Object obj) {
                ui50.m23474e(act, userId, (roj0) obj);
            }
        }, new e30() { // from class: l.ti50
            public final void call(Object obj) {
                ui50.m23472c((Throwable) obj);
            }
        }));
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m23477h(@NotNull String userId) {
        userId.getClass();
        CoreModule.c.m0.x8(userId).subscribe(mkd0.F());
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m23478i(@NotNull String userId) {
        userId.getClass();
        zvf0.s("e_peipei_card_accpet", "p_peipei_card", MapsKt.mapOf(TuplesKt.a("peipei_uid", userId)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m23479j(@NotNull String userId) {
        userId.getClass();
        zvf0.y("e_peipei_card", "p_suggest_users_home_view", MapsKt.mapOf(TuplesKt.a("peipei_uid", userId)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m23480k(@NotNull String userId) {
        userId.getClass();
        zvf0.s("e_peipei_pupup_accept", "p_peipei_pupup", MapsKt.mapOf(TuplesKt.a("peipei_uid", userId)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m23481l(@NotNull String userId) {
        userId.getClass();
        zvf0.y("e_peipei_pupup", "p_messages_view", MapsKt.mapOf(TuplesKt.a("peipei_uid", userId)));
    }
}
