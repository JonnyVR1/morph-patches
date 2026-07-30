package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SeeBlindBoxData;
import com.p046p1.mobile.putong.core.data.SeeBlindBoxEnvelope;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.data.User;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/m7e0;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class m7e0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m153366a(@NotNull ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        INSTANCE.m153375g(viewTreeObserverOnGlobalLayoutListenerC7866b);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m153367b(@NotNull ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        INSTANCE.m153376i(viewTreeObserverOnGlobalLayoutListenerC7866b);
    }

    /* JADX INFO: renamed from: l.m7e0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m87232d2 = {"Ll/m7e0$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/home/b;", "viewModel", "", "g", "(Lcom/p1/mobile/putong/core/newui/home/b;)V", RXScreenCaptureService.KEY_INDEX, "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m153368a(Throwable th) {
        }

        /* JADX INFO: renamed from: b */
        public static void m153369b(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: d */
        public static Unit m153371d(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, User user) {
            if (user != null) {
                CoreModule.f17545c.f19697x1.m166165c3().data.users.set(0, user);
                m7e0.INSTANCE.m153376i(viewTreeObserverOnGlobalLayoutListenerC7866b);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: e */
        public static User m153372e(Function1 function1, Object obj) {
            return (User) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: f */
        public static User m153373f(SeeBlindBoxEnvelope seeBlindBoxEnvelope) {
            List<User> list;
            final User user;
            ova ovaVar = CoreModule.f17545c.f19697x1;
            seeBlindBoxEnvelope.getClass();
            ovaVar.m166167f3(seeBlindBoxEnvelope);
            SeeBlindBoxData seeBlindBoxData = seeBlindBoxEnvelope.data;
            if (seeBlindBoxData == null || (list = seeBlindBoxData.users) == null || (user = list.get(0)) == null) {
                return null;
            }
            f8c.m119878o().m119881B(new d30() { // from class: l.l7e0
                @Override // p149l.d30
                public final void call() {
                    m7e0.Companion.m153374h(user);
                }
            });
            return user;
        }

        /* JADX INFO: renamed from: h */
        public static final void m153374h(User user) {
            qib0.f154722k0.f176631d.upsert(user);
        }

        @JvmStatic
        /* JADX INFO: renamed from: g */
        public final void m153375g(@NotNull final ViewTreeObserverOnGlobalLayoutListenerC7866b viewModel) {
            NewMainAct newMainActAct;
            C22306c c22306cObserveOn;
            viewModel.getClass();
            C22306c map = null;
            if (!n3b0.m157744s(null, 1, null) || CoreModule.f17545c.f19639e0.m169527p9().isSVIP()) {
                return;
            }
            z7e0 z7e0Var = z7e0.INSTANCE;
            if (z7e0Var.m217461f() != -1) {
                Long l2 = CoreModule.f17545c.f19639e0.f149238P0.get();
                long jM217461f = z7e0Var.m217461f();
                if (l2 == null || l2.longValue() != jM217461f || (newMainActAct = viewModel.act()) == null) {
                    return;
                }
                C22306c<SeeBlindBoxEnvelope> c22306cObserveOn2 = CoreModule.f17545c.f19697x1.m166166d3().observeOn(Schedulers.m221493io());
                if (c22306cObserveOn2 != null) {
                    final Function1 function1 = new Function1() { // from class: l.g7e0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return m7e0.Companion.m153373f((SeeBlindBoxEnvelope) obj);
                        }
                    };
                    map = c22306cObserveOn2.map(new w9j() { // from class: l.h7e0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return m7e0.Companion.m153372e(function1, obj);
                        }
                    });
                }
                C22306c c22306cDuringCreated = newMainActAct.duringCreated(map);
                if (c22306cDuringCreated == null || (c22306cObserveOn = c22306cDuringCreated.observeOn(jo0.m142408a())) == null) {
                    return;
                }
                final Function1 function2 = new Function1() { // from class: l.i7e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return m7e0.Companion.m153371d(viewModel, (User) obj);
                    }
                };
                c22306cObserveOn.subscribe(new e30() { // from class: l.j7e0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        m7e0.Companion.m153369b(function2, obj);
                    }
                }, new e30() { // from class: l.k7e0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        m7e0.Companion.m153368a((Throwable) obj);
                    }
                });
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: i */
        public final void m153376i(@NotNull ViewTreeObserverOnGlobalLayoutListenerC7866b viewModel) {
            SeeBlindBoxData seeBlindBoxData;
            List<User> list;
            viewModel.getClass();
            NewNewHomeFrag newNewHomeFragM37341q2 = viewModel.m37341q2();
            SeeBlindBoxEnvelope seeBlindBoxEnvelopeM166165c3 = CoreModule.f17545c.f19697x1.m166165c3();
            Integer numValueOf = (seeBlindBoxEnvelopeM166165c3 == null || (seeBlindBoxData = seeBlindBoxEnvelopeM166165c3.data) == null || (list = seeBlindBoxData.users) == null) ? null : Integer.valueOf(list.size());
            numValueOf.getClass();
            if (numValueOf.intValue() <= 0 || newNewHomeFragM37341q2 == null) {
                return;
            }
            User user = CoreModule.f17545c.f19697x1.m166165c3().data.users.get(0);
            user.getClass();
            new t7e0(newNewHomeFragM37341q2, user).m187445s();
        }

        public Companion() {
        }
    }
}
