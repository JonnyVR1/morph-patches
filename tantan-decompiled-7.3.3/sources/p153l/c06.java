package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ConstellationDataEnvelope;
import com.p051p1.mobile.putong.data.User;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/c06;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class c06 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m107341a(@NotNull Act act) {
        INSTANCE.m107345d(act);
    }

    /* JADX INFO: renamed from: l.c06$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/c06$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Act;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static Unit m107342a(Act act, ConstellationDataEnvelope constellationDataEnvelope) {
            List<User> list = constellationDataEnvelope.data;
            list.getClass();
            if (!list.isEmpty()) {
                ly5.Companion companion = ly5.INSTANCE;
                User user = constellationDataEnvelope.data.get(0);
                user.getClass();
                companion.m156258b(act, user);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        public static void m107343b(Throwable th) {
        }

        /* JADX INFO: renamed from: c */
        public static void m107344c(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m107345d(@NotNull final Act act) {
            act.getClass();
            vy5 vy5Var = vy5.INSTANCE;
            if (vy5Var.m203954d() == -1 || CoreModule.f18264c.f20381e0.f89095P0.get().longValue() < vy5Var.m203954d() || CoreModule.f18264c.f20325L1.getReject().get().booleanValue()) {
                return;
            }
            Long l2 = CoreModule.f18264c.f20325L1.getZodiacDay().get();
            l2.getClass();
            if (pzi0.m174439D(l2.longValue())) {
                return;
            }
            CoreModule.f18264c.f20325L1.getZodiacDay().put(Long.valueOf(System.currentTimeMillis()));
            C22421c c22421cObserveOn = act.duringCreated(CoreModule.f18264c.f20325L1.m105883f3()).observeOn(fo0.m126432a());
            final Function1 function1 = new Function1() { // from class: l.zz5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c06.Companion.m107342a(act, (ConstellationDataEnvelope) obj);
                }
            };
            c22421cObserveOn.subscribe(new y20() { // from class: l.a06
                @Override // p153l.y20
                public final void call(Object obj) {
                    c06.Companion.m107344c(function1, obj);
                }
            }, new y20() { // from class: l.b06
                @Override // p153l.y20
                public final void call(Object obj) {
                    c06.Companion.m107343b((Throwable) obj);
                }
            });
        }

        public Companion() {
        }
    }
}
