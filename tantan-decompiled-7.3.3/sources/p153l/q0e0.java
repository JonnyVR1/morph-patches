package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.data.IdBoxed;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u000bJ\u001d\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, m88121d2 = {"Ll/q0e0;", "", "<init>", "()V", "", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/android/app/Act;", "context", "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "builder", "g", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/greet/d$a;)V", "Ll/y20;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "afterPaySuccess", "h", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/greet/d$a;Ll/y20;)V", "k", "f", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class q0e0 {

    @NotNull
    public static final q0e0 INSTANCE = new q0e0();

    /* JADX INFO: renamed from: a */
    public static void m174696a(C8523d.a aVar, Act act, GreetingHotLevelInfo greetingHotLevelInfo) {
        String strM47094h;
        IdBoxed idBoxed;
        List<Greeting> list;
        Greeting greeting = (greetingHotLevelInfo == null || (list = greetingHotLevelInfo.greetings) == null) ? null : list.get(0);
        if (NullChecker.m82486a(greeting)) {
            if (TextUtils.equals(aVar.m47093g(), greeting != null ? greeting.otherUser : null) && greeting != null && (idBoxed = greeting.moment) != null) {
                idBoxed.f39607id = aVar.m47092f();
            }
            aVar.m47104r(greeting);
            C8523d.m47084j(act, aVar);
            return;
        }
        if (joa.m146351B3()) {
            new vzd0(act, aVar, 0, 4, null).show();
            return;
        }
        if (TextUtils.isEmpty(aVar.m47094h())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strM47094h = String.format("%s,e_send_message,click", Arrays.copyOf(new Object[]{!Intrinsics.m88377d("card", aVar.m47089c()) ? aVar.m47089c() : "p_suggest_users_home_view"}, 1));
        } else {
            strM47094h = aVar.m47094h();
            strM47094h.getClass();
        }
        String str = strM47094h;
        if (joa.m146359I3()) {
            o1j0.m165651y("今天的抢先告白已用完");
        } else {
            CoreModule.m30933P().m143410g().mo36009Ds(act, str, Privilege.confession_first, null, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m174698c(C8523d.a aVar, Act act, GreetingHotLevelInfo greetingHotLevelInfo) {
        List<Greeting> list;
        Greeting greeting = (greetingHotLevelInfo == null || (list = greetingHotLevelInfo.greetings) == null) ? null : list.get(0);
        if (!NullChecker.m82486a(greeting)) {
            C8523d.m47084j(act, aVar);
        } else {
            aVar.m47104r(greeting);
            C8523d.m47084j(act, aVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m174700e(final C8523d.a aVar, Act act, y20 y20Var, GreetingHotLevelInfo greetingHotLevelInfo) {
        String strM47094h;
        IdBoxed idBoxed;
        List<Greeting> list;
        Greeting greeting = (greetingHotLevelInfo == null || (list = greetingHotLevelInfo.greetings) == null) ? null : list.get(0);
        if (NullChecker.m82486a(aVar.m47091e()) && CoreModule.m30932N().mo61479Mh(aVar.m47092f(), CoreMomentInfo.JSON_ADAPTER) == null) {
            l51.m152919y(new Runnable() { // from class: l.m0e0
                @Override // java.lang.Runnable
                public final void run() {
                    q0e0.m174701i(aVar);
                }
            });
        }
        if (NullChecker.m82486a(greeting)) {
            if (TextUtils.equals(aVar.m47093g(), greeting != null ? greeting.otherUser : null) && greeting != null && (idBoxed = greeting.moment) != null) {
                idBoxed.f39607id = aVar.m47092f();
            }
            aVar.m47104r(greeting);
            C8523d.m47084j(act, aVar);
            return;
        }
        if (joa.m146362N3() || CoreModule.m30930K().mo31810pq()) {
            if (CoreModule.f18276o.m132214d().mo34703I5()) {
                new vzd0(act, aVar, 0, 4, null).show();
                return;
            } else {
                C8523d.m47084j(act, aVar);
                return;
            }
        }
        if (TextUtils.isEmpty(aVar.m47094h())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strM47094h = String.format("%s,e_send_message,click", Arrays.copyOf(new Object[]{!Intrinsics.m88377d("card", aVar.m47089c()) ? aVar.m47089c() : "p_suggest_users_home_view"}, 1));
        } else {
            strM47094h = aVar.m47094h();
            strM47094h.getClass();
        }
        CoreModule.m30933P().m143405a().mo34575qm(act, strM47094h, Privilege.say_hi_pkg, y20Var);
    }

    /* JADX INFO: renamed from: i */
    public static final void m174701i(final C8523d.a aVar) {
        l9c.m153394o().m153397B(new x20() { // from class: l.o0e0
            @Override // p153l.x20
            public final void call() {
                q0e0.m174702j(aVar);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final void m174702j(C8523d.a aVar) {
        CoreModule.m30932N().mo61587xm(aVar.m47091e());
    }

    /* JADX INFO: renamed from: f */
    public final void m174703f(@NotNull final Act context, @NotNull final C8523d.a builder) {
        String strM47094h;
        context.getClass();
        builder.getClass();
        if (joa.m146365Q3()) {
            context.duringCreated(CoreModule.f18264c.f20420r0.m35141p5(builder.m47093g(), false)).filter(new if00()).subscribe(psd0.m173596G(new y20() { // from class: l.p0e0
                @Override // p153l.y20
                public final void call(Object obj) {
                    q0e0.m174698c(builder, context, (GreetingHotLevelInfo) obj);
                }
            }));
            return;
        }
        if (TextUtils.isEmpty(builder.m47094h())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strM47094h = String.format("%s,e_send_message,click", Arrays.copyOf(new Object[]{!Intrinsics.m88377d("card", builder.m47089c()) ? builder.m47089c() : "p_suggest_users_home_view"}, 1));
        } else {
            strM47094h = builder.m47094h();
            strM47094h.getClass();
        }
        String str = strM47094h;
        if (joa.m146364P3()) {
            o1j0.m165651y("今日次数已用完，明天再来吧");
        } else {
            CoreModule.m30933P().m143410g().mo36030Qs(context, str, Privilege.youth_find_partner, null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m174704g(@NotNull Act context, @NotNull C8523d.a builder) {
        context.getClass();
        builder.getClass();
        m174705h(context, builder, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m174705h(@NotNull final Act context, @NotNull final C8523d.a builder, @Nullable final y20<PurchaseType> afterPaySuccess) {
        context.getClass();
        builder.getClass();
        context.duringCreated(CoreModule.f18264c.f20420r0.m35141p5(builder.m47093g(), false)).filter(new if00()).subscribe(psd0.m173596G(new y20() { // from class: l.l0e0
            @Override // p153l.y20
            public final void call(Object obj) {
                q0e0.m174700e(builder, context, afterPaySuccess, (GreetingHotLevelInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m174706k(@NotNull final Act context, @NotNull final C8523d.a builder) {
        String strM47094h;
        context.getClass();
        builder.getClass();
        if (joa.m146351B3()) {
            context.duringCreated(CoreModule.f18264c.f20420r0.m35141p5(builder.m47093g(), false)).filter(new if00()).subscribe(psd0.m173596G(new y20() { // from class: l.n0e0
                @Override // p153l.y20
                public final void call(Object obj) {
                    q0e0.m174696a(builder, context, (GreetingHotLevelInfo) obj);
                }
            }));
            return;
        }
        if (TextUtils.isEmpty(builder.m47094h())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strM47094h = String.format("%s,e_send_message,click", Arrays.copyOf(new Object[]{!Intrinsics.m88377d("card", builder.m47089c()) ? builder.m47089c() : "p_suggest_users_home_view"}, 1));
        } else {
            strM47094h = builder.m47094h();
            strM47094h.getClass();
        }
        String str = strM47094h;
        if (joa.m146359I3()) {
            o1j0.m165651y("今天的抢先告白已用完");
        } else {
            CoreModule.m30933P().m143410g().mo36009Ds(context, str, Privilege.confession_first, null, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m174707l() {
        uqb0.f180374G.m127154r0("https://static.tancdn.com/pe-webplatform/6Vkj-PyPISwgtkC-5PLdu3Q4.webp");
    }
}
