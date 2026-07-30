package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SeeBlindBoxData;
import com.p1.mobile.putong.core.data.SeeBlindBoxEnvelope;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.newui.home.b;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.d30;
import l.e30;
import l.f8c;
import l.jo0;
import l.n3b0;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/m7e0;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m7e0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m19143a(@NotNull b bVar) {
        INSTANCE.m19152g(bVar);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m19144b(@NotNull b bVar) {
        INSTANCE.m19153i(bVar);
    }

    /* JADX INFO: renamed from: l.m7e0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Ll/m7e0$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/home/b;", "viewModel", "", "g", "(Lcom/p1/mobile/putong/core/newui/home/b;)V", "i", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m19145a(Throwable th) {
        }

        /* JADX INFO: renamed from: b */
        public static void m19146b(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: d */
        public static Unit m19148d(b bVar, User user) {
            if (user != null) {
                CoreModule.f1534c.f3686x1.m20829c3().data.users.set(0, user);
                m7e0.INSTANCE.m19153i(bVar);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: e */
        public static User m19149e(Function1 function1, Object obj) {
            return (User) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: f */
        public static User m19150f(SeeBlindBoxEnvelope seeBlindBoxEnvelope) {
            List list;
            final User user;
            ova ovaVar = CoreModule.f1534c.f3686x1;
            seeBlindBoxEnvelope.getClass();
            ovaVar.m20831f3(seeBlindBoxEnvelope);
            SeeBlindBoxData seeBlindBoxData = seeBlindBoxEnvelope.data;
            if (seeBlindBoxData == null || (list = seeBlindBoxData.users) == null || (user = (User) list.get(0)) == null) {
                return null;
            }
            f8c.o().B(new d30() { // from class: l.l7e0
                public final void call() {
                    m7e0.Companion.m19151h(user);
                }
            });
            return user;
        }

        /* JADX INFO: renamed from: h */
        public static final void m19151h(User user) {
            qib0.f19813k0.f23551d.upsert(user);
        }

        @JvmStatic
        /* JADX INFO: renamed from: g */
        public final void m19152g(@NotNull final b viewModel) {
            NewMainAct newMainActK1;
            c cVarObserveOn;
            viewModel.getClass();
            c map = null;
            if (!n3b0.s((Counter) null, 1, (Object) null) || CoreModule.f1534c.f3628e0.m21490p9().isSVIP()) {
                return;
            }
            z7e0 z7e0Var = z7e0.INSTANCE;
            if (z7e0Var.m28621f() != -1) {
                Long l2 = (Long) CoreModule.f1534c.f3628e0.f18850P0.get();
                long jM28621f = z7e0Var.m28621f();
                if (l2 == null || l2.longValue() != jM28621f || (newMainActK1 = viewModel.K1()) == null) {
                    return;
                }
                c cVarObserveOn2 = CoreModule.f1534c.f3686x1.m20830d3().observeOn(Schedulers.io());
                if (cVarObserveOn2 != null) {
                    final Function1 function1 = new Function1() { // from class: l.g7e0
                        public final Object invoke(Object obj) {
                            return m7e0.Companion.m19150f((SeeBlindBoxEnvelope) obj);
                        }
                    };
                    map = cVarObserveOn2.map(new w9j() { // from class: l.h7e0
                        public final Object call(Object obj) {
                            return m7e0.Companion.m19149e(function1, obj);
                        }
                    });
                }
                c cVarDuringCreated = newMainActK1.duringCreated(map);
                if (cVarDuringCreated == null || (cVarObserveOn = cVarDuringCreated.observeOn(jo0.a())) == null) {
                    return;
                }
                final Function1 function2 = new Function1() { // from class: l.i7e0
                    public final Object invoke(Object obj) {
                        return m7e0.Companion.m19148d(viewModel, (User) obj);
                    }
                };
                cVarObserveOn.subscribe(new e30() { // from class: l.j7e0
                    public final void call(Object obj) {
                        m7e0.Companion.m19146b(function2, obj);
                    }
                }, new e30() { // from class: l.k7e0
                    public final void call(Object obj) {
                        m7e0.Companion.m19145a((Throwable) obj);
                    }
                });
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: i */
        public final void m19153i(@NotNull b viewModel) {
            SeeBlindBoxData seeBlindBoxData;
            List list;
            viewModel.getClass();
            NewNewHomeFrag newNewHomeFragQ2 = viewModel.q2();
            SeeBlindBoxEnvelope seeBlindBoxEnvelopeM20829c3 = CoreModule.f1534c.f3686x1.m20829c3();
            Integer numValueOf = (seeBlindBoxEnvelopeM20829c3 == null || (seeBlindBoxData = seeBlindBoxEnvelopeM20829c3.data) == null || (list = seeBlindBoxData.users) == null) ? null : Integer.valueOf(list.size());
            numValueOf.getClass();
            if (numValueOf.intValue() <= 0 || newNewHomeFragQ2 == null) {
                return;
            }
            Object obj = CoreModule.f1534c.f3686x1.m20829c3().data.users.get(0);
            obj.getClass();
            new t7e0(newNewHomeFragQ2, (User) obj).m24518s();
        }

        public Companion() {
        }
    }
}
