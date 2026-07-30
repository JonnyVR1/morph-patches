package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u000bJ\u001d\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, m87232d2 = {"Ll/osd0;", "", "<init>", "()V", "", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/android/app/Act;", "context", "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "builder", "g", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/greet/d$a;)V", "Ll/e30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "afterPaySuccess", "h", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/greet/d$a;Ll/e30;)V", "k", "f", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class osd0 {

    @NotNull
    public static final osd0 INSTANCE = new osd0();

    /* JADX INFO: renamed from: a */
    public static void m165741a(C8360d.a aVar, Act act, GreetingHotLevelInfo greetingHotLevelInfo) {
        String strM45911h;
        IdBoxed idBoxed;
        List<Greeting> list;
        Greeting greeting = (greetingHotLevelInfo == null || (list = greetingHotLevelInfo.greetings) == null) ? null : list.get(0);
        if (NullChecker.m81303a(greeting)) {
            if (TextUtils.equals(aVar.m45910g(), greeting != null ? greeting.otherUser : null) && greeting != null && (idBoxed = greeting.moment) != null) {
                idBoxed.f38759id = aVar.m45909f();
            }
            aVar.m45921r(greeting);
            C8360d.m45901j(act, aVar);
            return;
        }
        if (xma.m210037A3()) {
            new trd0(act, aVar, 0, 4, null).show();
            return;
        }
        if (TextUtils.isEmpty(aVar.m45911h())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strM45911h = String.format("%s,e_send_message,click", Arrays.copyOf(new Object[]{!Intrinsics.m87488d("card", aVar.m45906c()) ? aVar.m45906c() : "p_suggest_users_home_view"}, 1));
        } else {
            strM45911h = aVar.m45911h();
            strM45911h.getClass();
        }
        String str = strM45911h;
        if (xma.m210045H3()) {
            lsi0.m151595y("今天的抢先告白已用完");
        } else {
            CoreModule.m29935P().m94656g().mo35006Ds(act, str, Privilege.confession_first, null, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m165743c(C8360d.a aVar, Act act, GreetingHotLevelInfo greetingHotLevelInfo) {
        List<Greeting> list;
        Greeting greeting = (greetingHotLevelInfo == null || (list = greetingHotLevelInfo.greetings) == null) ? null : list.get(0);
        if (!NullChecker.m81303a(greeting)) {
            C8360d.m45901j(act, aVar);
        } else {
            aVar.m45921r(greeting);
            C8360d.m45901j(act, aVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m165745e(final C8360d.a aVar, Act act, e30 e30Var, GreetingHotLevelInfo greetingHotLevelInfo) {
        String strM45911h;
        IdBoxed idBoxed;
        List<Greeting> list;
        Greeting greeting = (greetingHotLevelInfo == null || (list = greetingHotLevelInfo.greetings) == null) ? null : list.get(0);
        if (NullChecker.m81303a(aVar.m45908e()) && CoreModule.m29934N().mo60295Mh(aVar.m45909f(), CoreMomentInfo.JSON_ADAPTER) == null) {
            e51.m114774y(new Runnable() { // from class: l.ksd0
                @Override // java.lang.Runnable
                public final void run() {
                    osd0.m165746i(aVar);
                }
            });
        }
        if (NullChecker.m81303a(greeting)) {
            if (TextUtils.equals(aVar.m45910g(), greeting != null ? greeting.otherUser : null) && greeting != null && (idBoxed = greeting.moment) != null) {
                idBoxed.f38759id = aVar.m45909f();
            }
            aVar.m45921r(greeting);
            C8360d.m45901j(act, aVar);
            return;
        }
        if (xma.m210048M3() || CoreModule.m29932K().mo30807pq()) {
            if (CoreModule.f17557o.m195057d().mo33700I5()) {
                new trd0(act, aVar, 0, 4, null).show();
                return;
            } else {
                C8360d.m45901j(act, aVar);
                return;
            }
        }
        if (TextUtils.isEmpty(aVar.m45911h())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strM45911h = String.format("%s,e_send_message,click", Arrays.copyOf(new Object[]{!Intrinsics.m87488d("card", aVar.m45906c()) ? aVar.m45906c() : "p_suggest_users_home_view"}, 1));
        } else {
            strM45911h = aVar.m45911h();
            strM45911h.getClass();
        }
        CoreModule.m29935P().m94651a().mo33572qm(act, strM45911h, Privilege.say_hi_pkg, e30Var);
    }

    /* JADX INFO: renamed from: i */
    public static final void m165746i(final C8360d.a aVar) {
        f8c.m119878o().m119881B(new d30() { // from class: l.msd0
            @Override // p149l.d30
            public final void call() {
                osd0.m165747j(aVar);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final void m165747j(C8360d.a aVar) {
        CoreModule.m29934N().mo60403xm(aVar.m45908e());
    }

    /* JADX INFO: renamed from: f */
    public final void m165748f(@NotNull final Act context, @NotNull final C8360d.a builder) {
        String strM45911h;
        context.getClass();
        builder.getClass();
        if (xma.m210051P3()) {
            context.duringCreated(CoreModule.f17545c.f19678r0.m34138p5(builder.m45910g(), false)).filter(new z600()).subscribe(mkd0.m154955G(new e30() { // from class: l.nsd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    osd0.m165743c(builder, context, (GreetingHotLevelInfo) obj);
                }
            }));
            return;
        }
        if (TextUtils.isEmpty(builder.m45911h())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strM45911h = String.format("%s,e_send_message,click", Arrays.copyOf(new Object[]{!Intrinsics.m87488d("card", builder.m45906c()) ? builder.m45906c() : "p_suggest_users_home_view"}, 1));
        } else {
            strM45911h = builder.m45911h();
            strM45911h.getClass();
        }
        String str = strM45911h;
        if (xma.m210050O3()) {
            lsi0.m151595y("今日次数已用完，明天再来吧");
        } else {
            CoreModule.m29935P().m94656g().mo35027Qs(context, str, Privilege.youth_find_partner, null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m165749g(@NotNull Act context, @NotNull C8360d.a builder) {
        context.getClass();
        builder.getClass();
        m165750h(context, builder, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m165750h(@NotNull final Act context, @NotNull final C8360d.a builder, @Nullable final e30<PurchaseType> afterPaySuccess) {
        context.getClass();
        builder.getClass();
        context.duringCreated(CoreModule.f17545c.f19678r0.m34138p5(builder.m45910g(), false)).filter(new z600()).subscribe(mkd0.m154955G(new e30() { // from class: l.jsd0
            @Override // p149l.e30
            public final void call(Object obj) {
                osd0.m165745e(builder, context, afterPaySuccess, (GreetingHotLevelInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m165751k(@NotNull final Act context, @NotNull final C8360d.a builder) {
        String strM45911h;
        context.getClass();
        builder.getClass();
        if (xma.m210037A3()) {
            context.duringCreated(CoreModule.f17545c.f19678r0.m34138p5(builder.m45910g(), false)).filter(new z600()).subscribe(mkd0.m154955G(new e30() { // from class: l.lsd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    osd0.m165741a(builder, context, (GreetingHotLevelInfo) obj);
                }
            }));
            return;
        }
        if (TextUtils.isEmpty(builder.m45911h())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strM45911h = String.format("%s,e_send_message,click", Arrays.copyOf(new Object[]{!Intrinsics.m87488d("card", builder.m45906c()) ? builder.m45906c() : "p_suggest_users_home_view"}, 1));
        } else {
            strM45911h = builder.m45911h();
            strM45911h.getClass();
        }
        String str = strM45911h;
        if (xma.m210045H3()) {
            lsi0.m151595y("今天的抢先告白已用完");
        } else {
            CoreModule.m29935P().m94656g().mo35006Ds(context, str, Privilege.confession_first, null, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m165752l() {
        qib0.f154691G.m102371r0("https://static.tancdn.com/pe-webplatform/6Vkj-PyPISwgtkC-5PLdu3Q4.webp");
    }
}
