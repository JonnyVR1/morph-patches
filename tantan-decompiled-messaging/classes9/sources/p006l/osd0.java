package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.data.IdBoxed;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l.d30;
import l.e30;
import l.e51;
import l.f8c;
import l.lsi0;
import l.mkd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u000bJ\u001d\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Ll/osd0;", "", "<init>", "()V", "", "l", "Lcom/p1/mobile/android/app/Act;", "context", "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "builder", "g", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/greet/d$a;)V", "Ll/e30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "afterPaySuccess", "h", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/greet/d$a;Ll/e30;)V", "k", "f", "message_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class osd0 {

    @NotNull
    public static final osd0 INSTANCE = new osd0();

    /* JADX INFO: renamed from: a */
    public static void m20727a(d.a aVar, Act act, GreetingHotLevelInfo greetingHotLevelInfo) {
        String strH;
        IdBoxed idBoxed;
        List list;
        Greeting greeting = (greetingHotLevelInfo == null || (list = greetingHotLevelInfo.greetings) == null) ? null : (Greeting) list.get(0);
        if (NullChecker.a(greeting)) {
            if (TextUtils.equals(aVar.g(), greeting != null ? greeting.otherUser : null) && greeting != null && (idBoxed = greeting.moment) != null) {
                idBoxed.id = aVar.f();
            }
            aVar.r(greeting);
            d.j(act, aVar);
            return;
        }
        if (xma.m27345A3()) {
            new trd0(act, aVar, 0, 4, null).show();
            return;
        }
        if (TextUtils.isEmpty(aVar.h())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strH = String.format("%s,e_send_message,click", Arrays.copyOf(new Object[]{!Intrinsics.d("card", aVar.c()) ? aVar.c() : "p_suggest_users_home_view"}, 1));
        } else {
            strH = aVar.h();
            strH.getClass();
        }
        String str = strH;
        if (xma.m27353H3()) {
            lsi0.y("今天的抢先告白已用完");
        } else {
            CoreModule.m1854P().m11711g().m6943Ds(act, str, Privilege.confession_first, null, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m20729c(d.a aVar, Act act, GreetingHotLevelInfo greetingHotLevelInfo) {
        List list;
        Greeting greeting = (greetingHotLevelInfo == null || (list = greetingHotLevelInfo.greetings) == null) ? null : (Greeting) list.get(0);
        if (!NullChecker.a(greeting)) {
            d.j(act, aVar);
        } else {
            aVar.r(greeting);
            d.j(act, aVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m20731e(final d.a aVar, Act act, e30 e30Var, GreetingHotLevelInfo greetingHotLevelInfo) {
        String strH;
        IdBoxed idBoxed;
        List list;
        Greeting greeting = (greetingHotLevelInfo == null || (list = greetingHotLevelInfo.greetings) == null) ? null : (Greeting) list.get(0);
        if (NullChecker.a(aVar.e()) && CoreModule.m1853N().Mh(aVar.f(), CoreMomentInfo.JSON_ADAPTER) == null) {
            e51.y(new Runnable() { // from class: l.ksd0
                @Override // java.lang.Runnable
                public final void run() {
                    osd0.m20732i(aVar);
                }
            });
        }
        if (NullChecker.a(greeting)) {
            if (TextUtils.equals(aVar.g(), greeting != null ? greeting.otherUser : null) && greeting != null && (idBoxed = greeting.moment) != null) {
                idBoxed.id = aVar.f();
            }
            aVar.r(greeting);
            d.j(act, aVar);
            return;
        }
        if (xma.m27356M3() || CoreModule.m1851K().pq()) {
            if (CoreModule.f1546o.m25559d().m5637I5()) {
                new trd0(act, aVar, 0, 4, null).show();
                return;
            } else {
                d.j(act, aVar);
                return;
            }
        }
        if (TextUtils.isEmpty(aVar.h())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strH = String.format("%s,e_send_message,click", Arrays.copyOf(new Object[]{!Intrinsics.d("card", aVar.c()) ? aVar.c() : "p_suggest_users_home_view"}, 1));
        } else {
            strH = aVar.h();
            strH.getClass();
        }
        CoreModule.m1854P().m11706a().m5509qm(act, strH, Privilege.say_hi_pkg, e30Var);
    }

    /* JADX INFO: renamed from: i */
    public static final void m20732i(final d.a aVar) {
        f8c.o().B(new d30() { // from class: l.msd0
            public final void call() {
                osd0.m20733j(aVar);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final void m20733j(d.a aVar) {
        CoreModule.m1853N().xm(aVar.e());
    }

    /* JADX INFO: renamed from: f */
    public final void m20734f(@NotNull final Act context, @NotNull final d.a builder) {
        String strH;
        context.getClass();
        builder.getClass();
        if (xma.m27359P3()) {
            context.duringCreated(CoreModule.f1534c.f3667r0.m6075p5(builder.g(), false)).filter(new z600()).subscribe(mkd0.G(new e30() { // from class: l.nsd0
                public final void call(Object obj) {
                    osd0.m20729c(builder, context, (GreetingHotLevelInfo) obj);
                }
            }));
            return;
        }
        if (TextUtils.isEmpty(builder.h())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strH = String.format("%s,e_send_message,click", Arrays.copyOf(new Object[]{!Intrinsics.d("card", builder.c()) ? builder.c() : "p_suggest_users_home_view"}, 1));
        } else {
            strH = builder.h();
            strH.getClass();
        }
        String str = strH;
        if (xma.m27358O3()) {
            lsi0.y("今日次数已用完，明天再来吧");
        } else {
            CoreModule.m1854P().m11711g().m6964Qs(context, str, Privilege.youth_find_partner, null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m20735g(@NotNull Act context, @NotNull d.a builder) {
        context.getClass();
        builder.getClass();
        m20736h(context, builder, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m20736h(@NotNull final Act context, @NotNull final d.a builder, @Nullable final e30<PurchaseType> afterPaySuccess) {
        context.getClass();
        builder.getClass();
        context.duringCreated(CoreModule.f1534c.f3667r0.m6075p5(builder.g(), false)).filter(new z600()).subscribe(mkd0.G(new e30() { // from class: l.jsd0
            public final void call(Object obj) {
                osd0.m20731e(builder, context, afterPaySuccess, (GreetingHotLevelInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m20737k(@NotNull final Act context, @NotNull final d.a builder) {
        String strH;
        context.getClass();
        builder.getClass();
        if (xma.m27345A3()) {
            context.duringCreated(CoreModule.f1534c.f3667r0.m6075p5(builder.g(), false)).filter(new z600()).subscribe(mkd0.G(new e30() { // from class: l.lsd0
                public final void call(Object obj) {
                    osd0.m20727a(builder, context, (GreetingHotLevelInfo) obj);
                }
            }));
            return;
        }
        if (TextUtils.isEmpty(builder.h())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strH = String.format("%s,e_send_message,click", Arrays.copyOf(new Object[]{!Intrinsics.d("card", builder.c()) ? builder.c() : "p_suggest_users_home_view"}, 1));
        } else {
            strH = builder.h();
            strH.getClass();
        }
        String str = strH;
        if (xma.m27353H3()) {
            lsi0.y("今天的抢先告白已用完");
        } else {
            CoreModule.m1854P().m11711g().m6943Ds(context, str, Privilege.confession_first, null, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m20738l() {
        qib0.f19782G.m12784r0("https://static.tancdn.com/pe-webplatform/6Vkj-PyPISwgtkC-5PLdu3Q4.webp");
    }
}
