package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.TarotData;
import com.p051p1.mobile.putong.core.data.TarotDataEnvelope;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/hni0;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class hni0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m136116a(@NotNull Act act, boolean z) {
        INSTANCE.m136124g(act, z);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m136117b(@NotNull Act act) {
        INSTANCE.m136125h(act);
    }

    /* JADX INFO: renamed from: l.hni0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/hni0$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "showDialog", "", "g", "(Lcom/p1/mobile/android/app/Act;Z)V", "h", "(Lcom/p1/mobile/android/app/Act;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static Unit m136118a(Act act, TarotDataEnvelope tarotDataEnvelope) {
            TarotData tarotData = tarotDataEnvelope.data;
            int i = tarotData.cardType;
            if (1 <= i && i < 45) {
                oli0.INSTANCE.m168126d(act, tarotData);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        public static void m136119b(Throwable th) {
            o1j0.m165634h(R$string.f18312Aq);
        }

        /* JADX INFO: renamed from: c */
        public static Unit m136120c(boolean z, Act act, TarotDataEnvelope tarotDataEnvelope) {
            int i = tarotDataEnvelope.data.cardType;
            if (i < 0 || i >= 45) {
                o1j0.m165634h(R$string.f18312Aq);
            } else {
                CoreModule.f18264c.f20436w1.m102955r3(tarotDataEnvelope);
                CoreModule.f18264c.f20436w1.m102954q3(tarotDataEnvelope.data.cardType);
                if (z) {
                    oli0.INSTANCE.m168125c(act);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: d */
        public static void m136121d(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: e */
        public static void m136122e(Throwable th) {
        }

        /* JADX INFO: renamed from: f */
        public static void m136123f(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        @JvmStatic
        /* JADX INFO: renamed from: g */
        public final void m136124g(@NotNull final Act act, final boolean showDialog) {
            act.getClass();
            C22421c c22421cObserveOn = act.duringCreated(CoreModule.f18264c.f20436w1.m102952m3()).observeOn(fo0.m126432a());
            final Function1 function1 = new Function1() { // from class: l.bni0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hni0.Companion.m136120c(showDialog, act, (TarotDataEnvelope) obj);
                }
            };
            c22421cObserveOn.subscribe(new y20() { // from class: l.cni0
                @Override // p153l.y20
                public final void call(Object obj) {
                    hni0.Companion.m136123f(function1, obj);
                }
            }, new y20() { // from class: l.dni0
                @Override // p153l.y20
                public final void call(Object obj) {
                    hni0.Companion.m136119b((Throwable) obj);
                }
            });
        }

        @JvmStatic
        /* JADX INFO: renamed from: h */
        public final void m136125h(@NotNull final Act act) {
            act.getClass();
            ami0 ami0Var = ami0.INSTANCE;
            if (ami0Var.m98831e() == -1 || CoreModule.f18264c.f20381e0.f89095P0.get().longValue() < ami0Var.m98831e() || CoreModule.f18264c.f20436w1.getCardType() == 0 || CoreModule.f18264c.f20436w1.getCardType() == -1 || CoreModule.f18264c.f20436w1.getReject().get().booleanValue()) {
                return;
            }
            Long l2 = CoreModule.f18264c.f20436w1.getTarotDay().get();
            l2.getClass();
            if (pzi0.m174439D(l2.longValue())) {
                return;
            }
            long jM98830d = ami0Var.m98830d() - System.currentTimeMillis();
            if (jM98830d > 0 || jM98830d < -7200000) {
                return;
            }
            CoreModule.f18264c.f20436w1.getTarotDay().put(Long.valueOf(System.currentTimeMillis()));
            C22421c c22421cObserveOn = act.duringCreated(CoreModule.f18264c.f20436w1.m102953o3()).observeOn(fo0.m126432a());
            final Function1 function1 = new Function1() { // from class: l.eni0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hni0.Companion.m136118a(act, (TarotDataEnvelope) obj);
                }
            };
            c22421cObserveOn.subscribe(new y20() { // from class: l.fni0
                @Override // p153l.y20
                public final void call(Object obj) {
                    hni0.Companion.m136121d(function1, obj);
                }
            }, new y20() { // from class: l.gni0
                @Override // p153l.y20
                public final void call(Object obj) {
                    hni0.Companion.m136122e((Throwable) obj);
                }
            });
        }

        public Companion() {
        }
    }
}
