package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SeeBlindBoxData;
import com.p051p1.mobile.putong.core.data.SeeBlindBoxEnvelope;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.data.User;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/rfe0;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class rfe0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m181169a(@NotNull ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        INSTANCE.m181178g(viewTreeObserverOnGlobalLayoutListenerC8017b);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m181170b(@NotNull ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        INSTANCE.m181179i(viewTreeObserverOnGlobalLayoutListenerC8017b);
    }

    /* JADX INFO: renamed from: l.rfe0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m88121d2 = {"Ll/rfe0$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/home/b;", "viewModel", "", "g", "(Lcom/p1/mobile/putong/core/newui/home/b;)V", RXScreenCaptureService.KEY_INDEX, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m181171a(Throwable th) {
        }

        /* JADX INFO: renamed from: b */
        public static void m181172b(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: d */
        public static Unit m181174d(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, User user) {
            if (user != null) {
                CoreModule.f18264c.f20439x1.m100764c3().data.users.set(0, user);
                rfe0.INSTANCE.m181179i(viewTreeObserverOnGlobalLayoutListenerC8017b);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: e */
        public static User m181175e(Function1 function1, Object obj) {
            return (User) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: f */
        public static User m181176f(SeeBlindBoxEnvelope seeBlindBoxEnvelope) {
            List<User> list;
            final User user;
            axa axaVar = CoreModule.f18264c.f20439x1;
            seeBlindBoxEnvelope.getClass();
            axaVar.m100766f3(seeBlindBoxEnvelope);
            SeeBlindBoxData seeBlindBoxData = seeBlindBoxEnvelope.data;
            if (seeBlindBoxData == null || (list = seeBlindBoxData.users) == null || (user = list.get(0)) == null) {
                return null;
            }
            l9c.m153394o().m153397B(new x20() { // from class: l.qfe0
                @Override // p153l.x20
                public final void call() {
                    rfe0.Companion.m181177h(user);
                }
            });
            return user;
        }

        /* JADX INFO: renamed from: h */
        public static final void m181177h(User user) {
            uqb0.f180405k0.f184355d.upsert(user);
        }

        @JvmStatic
        /* JADX INFO: renamed from: g */
        public final void m181178g(@NotNull final ViewTreeObserverOnGlobalLayoutListenerC8017b viewModel) {
            NewMainAct newMainActAct;
            C22421c c22421cObserveOn;
            viewModel.getClass();
            C22421c map = null;
            if (!rbb0.m180746s(null, 1, null) || CoreModule.f18264c.f20381e0.m116600p9().isSVIP()) {
                return;
            }
            ege0 ege0Var = ege0.INSTANCE;
            if (ege0Var.m120763f() != -1) {
                Long l2 = CoreModule.f18264c.f20381e0.f89095P0.get();
                long jM120763f = ege0Var.m120763f();
                if (l2 == null || l2.longValue() != jM120763f || (newMainActAct = viewModel.act()) == null) {
                    return;
                }
                C22421c<SeeBlindBoxEnvelope> c22421cObserveOn2 = CoreModule.f18264c.f20439x1.m100765d3().observeOn(Schedulers.m222739io());
                if (c22421cObserveOn2 != null) {
                    final Function1 function1 = new Function1() { // from class: l.lfe0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return rfe0.Companion.m181176f((SeeBlindBoxEnvelope) obj);
                        }
                    };
                    map = c22421cObserveOn2.map(new qcj() { // from class: l.mfe0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return rfe0.Companion.m181175e(function1, obj);
                        }
                    });
                }
                C22421c c22421cDuringCreated = newMainActAct.duringCreated(map);
                if (c22421cDuringCreated == null || (c22421cObserveOn = c22421cDuringCreated.observeOn(fo0.m126432a())) == null) {
                    return;
                }
                final Function1 function2 = new Function1() { // from class: l.nfe0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return rfe0.Companion.m181174d(viewModel, (User) obj);
                    }
                };
                c22421cObserveOn.subscribe(new y20() { // from class: l.ofe0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        rfe0.Companion.m181172b(function2, obj);
                    }
                }, new y20() { // from class: l.pfe0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        rfe0.Companion.m181171a((Throwable) obj);
                    }
                });
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: i */
        public final void m181179i(@NotNull ViewTreeObserverOnGlobalLayoutListenerC8017b viewModel) {
            SeeBlindBoxData seeBlindBoxData;
            List<User> list;
            viewModel.getClass();
            NewNewHomeFrag newNewHomeFragM38344q2 = viewModel.m38344q2();
            SeeBlindBoxEnvelope seeBlindBoxEnvelopeM100764c3 = CoreModule.f18264c.f20439x1.m100764c3();
            Integer numValueOf = (seeBlindBoxEnvelopeM100764c3 == null || (seeBlindBoxData = seeBlindBoxEnvelopeM100764c3.data) == null || (list = seeBlindBoxData.users) == null) ? null : Integer.valueOf(list.size());
            numValueOf.getClass();
            if (numValueOf.intValue() <= 0 || newNewHomeFragM38344q2 == null) {
                return;
            }
            User user = CoreModule.f18264c.f20439x1.m100764c3().data.users.get(0);
            user.getClass();
            new yfe0(newNewHomeFragM38344q2, user).m215578s();
        }

        public Companion() {
        }
    }
}
