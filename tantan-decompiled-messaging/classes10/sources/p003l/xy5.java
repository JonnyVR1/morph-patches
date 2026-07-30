package p003l;

import com.p000p1.mobile.putong.core.data.ConstellationDataEnvelope;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.e30;
import l.jo0;
import l.mqi0;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/xy5;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class xy5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m11065a(@NotNull Act act) {
        INSTANCE.m11069d(act);
    }

    /* JADX INFO: renamed from: l.xy5$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll/xy5$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "d", "(Lcom/p1/mobile/android/app/Act;)V", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static Unit m11066a(Act act, ConstellationDataEnvelope constellationDataEnvelope) {
            List<User> list = constellationDataEnvelope.data;
            list.getClass();
            if (!list.isEmpty()) {
                gx5.Companion companion = gx5.INSTANCE;
                User user = constellationDataEnvelope.data.get(0);
                user.getClass();
                companion.m6842b(act, user);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        public static void m11067b(Throwable th) {
        }

        /* JADX INFO: renamed from: c */
        public static void m11068c(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m11069d(@NotNull final Act act) {
            act.getClass();
            qx5 qx5Var = qx5.INSTANCE;
            if (qx5Var.m9062d() == -1 || ((Number) CoreModule.c.e0.P0.get()).longValue() < qx5Var.m9062d() || ((Boolean) CoreModule.c.L1.c3().get()).booleanValue()) {
                return;
            }
            Object obj = CoreModule.c.L1.e3().get();
            obj.getClass();
            if (mqi0.D(((Number) obj).longValue())) {
                return;
            }
            CoreModule.c.L1.e3().put(Long.valueOf(System.currentTimeMillis()));
            c cVarObserveOn = act.duringCreated(CoreModule.c.L1.f3()).observeOn(jo0.a());
            final Function1 function1 = new Function1() { // from class: l.uy5
                public final Object invoke(Object obj2) {
                    return xy5.Companion.m11066a(act, (ConstellationDataEnvelope) obj2);
                }
            };
            cVarObserveOn.subscribe(new e30() { // from class: l.vy5
                public final void call(Object obj2) {
                    xy5.Companion.m11068c(function1, obj2);
                }
            }, new e30() { // from class: l.wy5
                public final void call(Object obj2) {
                    xy5.Companion.m11067b((Throwable) obj2);
                }
            });
        }

        public Companion() {
        }
    }
}
