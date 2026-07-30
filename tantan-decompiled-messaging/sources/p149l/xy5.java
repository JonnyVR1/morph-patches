package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ConstellationDataEnvelope;
import com.p046p1.mobile.putong.data.User;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/xy5;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xy5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m211723a(@NotNull Act act) {
        INSTANCE.m211727d(act);
    }

    /* JADX INFO: renamed from: l.xy5$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/xy5$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Act;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static Unit m211724a(Act act, ConstellationDataEnvelope constellationDataEnvelope) {
            List<User> list = constellationDataEnvelope.data;
            list.getClass();
            if (!list.isEmpty()) {
                gx5.Companion companion = gx5.INSTANCE;
                User user = constellationDataEnvelope.data.get(0);
                user.getClass();
                companion.m128534b(act, user);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        public static void m211725b(Throwable th) {
        }

        /* JADX INFO: renamed from: c */
        public static void m211726c(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m211727d(@NotNull final Act act) {
            act.getClass();
            qx5 qx5Var = qx5.INSTANCE;
            if (qx5Var.m176942d() == -1 || CoreModule.f17545c.f19639e0.f149238P0.get().longValue() < qx5Var.m176942d() || CoreModule.f17545c.f19583L1.getReject().get().booleanValue()) {
                return;
            }
            Long l2 = CoreModule.f17545c.f19583L1.getZodiacDay().get();
            l2.getClass();
            if (mqi0.m155929D(l2.longValue())) {
                return;
            }
            CoreModule.f17545c.f19583L1.getZodiacDay().put(Long.valueOf(System.currentTimeMillis()));
            C22306c c22306cObserveOn = act.duringCreated(CoreModule.f17545c.f19583L1.m210254f3()).observeOn(jo0.m142408a());
            final Function1 function1 = new Function1() { // from class: l.uy5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return xy5.Companion.m211724a(act, (ConstellationDataEnvelope) obj);
                }
            };
            c22306cObserveOn.subscribe(new e30() { // from class: l.vy5
                @Override // p149l.e30
                public final void call(Object obj) {
                    xy5.Companion.m211726c(function1, obj);
                }
            }, new e30() { // from class: l.wy5
                @Override // p149l.e30
                public final void call(Object obj) {
                    xy5.Companion.m211725b((Throwable) obj);
                }
            });
        }

        public Companion() {
        }
    }
}
