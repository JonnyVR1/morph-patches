package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.TarotData;
import com.p046p1.mobile.putong.core.data.TarotDataEnvelope;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/hei0;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class hei0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m130636a(@NotNull Act act, boolean z) {
        INSTANCE.m130644g(act, z);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m130637b(@NotNull Act act) {
        INSTANCE.m130645h(act);
    }

    /* JADX INFO: renamed from: l.hei0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/hei0$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "showDialog", "", "g", "(Lcom/p1/mobile/android/app/Act;Z)V", "h", "(Lcom/p1/mobile/android/app/Act;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static Unit m130638a(Act act, TarotDataEnvelope tarotDataEnvelope) {
            TarotData tarotData = tarotDataEnvelope.data;
            int i = tarotData.cardType;
            if (1 <= i && i < 45) {
                oci0.INSTANCE.m163523d(act, tarotData);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        public static void m130639b(Throwable th) {
            lsi0.m151578h(R$string.f18527fq);
        }

        /* JADX INFO: renamed from: c */
        public static Unit m130640c(boolean z, Act act, TarotDataEnvelope tarotDataEnvelope) {
            int i = tarotDataEnvelope.data.cardType;
            if (i < 0 || i >= 45) {
                lsi0.m151578h(R$string.f18527fq);
            } else {
                CoreModule.f17545c.f19694w1.m162846r3(tarotDataEnvelope);
                CoreModule.f17545c.f19694w1.m162845q3(tarotDataEnvelope.data.cardType);
                if (z) {
                    oci0.INSTANCE.m163522c(act);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: d */
        public static void m130641d(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: e */
        public static void m130642e(Throwable th) {
        }

        /* JADX INFO: renamed from: f */
        public static void m130643f(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        @JvmStatic
        /* JADX INFO: renamed from: g */
        public final void m130644g(@NotNull final Act act, final boolean showDialog) {
            act.getClass();
            C22306c c22306cObserveOn = act.duringCreated(CoreModule.f17545c.f19694w1.m162843m3()).observeOn(jo0.m142408a());
            final Function1 function1 = new Function1() { // from class: l.bei0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hei0.Companion.m130640c(showDialog, act, (TarotDataEnvelope) obj);
                }
            };
            c22306cObserveOn.subscribe(new e30() { // from class: l.cei0
                @Override // p149l.e30
                public final void call(Object obj) {
                    hei0.Companion.m130643f(function1, obj);
                }
            }, new e30() { // from class: l.dei0
                @Override // p149l.e30
                public final void call(Object obj) {
                    hei0.Companion.m130639b((Throwable) obj);
                }
            });
        }

        @JvmStatic
        /* JADX INFO: renamed from: h */
        public final void m130645h(@NotNull final Act act) {
            act.getClass();
            adi0 adi0Var = adi0.INSTANCE;
            if (adi0Var.m95900e() == -1 || CoreModule.f17545c.f19639e0.f149238P0.get().longValue() < adi0Var.m95900e() || CoreModule.f17545c.f19694w1.getCardType() == 0 || CoreModule.f17545c.f19694w1.getCardType() == -1 || CoreModule.f17545c.f19694w1.getReject().get().booleanValue()) {
                return;
            }
            Long l2 = CoreModule.f17545c.f19694w1.getTarotDay().get();
            l2.getClass();
            if (mqi0.m155929D(l2.longValue())) {
                return;
            }
            long jM95899d = adi0Var.m95899d() - System.currentTimeMillis();
            if (jM95899d > 0 || jM95899d < -7200000) {
                return;
            }
            CoreModule.f17545c.f19694w1.getTarotDay().put(Long.valueOf(System.currentTimeMillis()));
            C22306c c22306cObserveOn = act.duringCreated(CoreModule.f17545c.f19694w1.m162844o3()).observeOn(jo0.m142408a());
            final Function1 function1 = new Function1() { // from class: l.eei0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hei0.Companion.m130638a(act, (TarotDataEnvelope) obj);
                }
            };
            c22306cObserveOn.subscribe(new e30() { // from class: l.fei0
                @Override // p149l.e30
                public final void call(Object obj) {
                    hei0.Companion.m130641d(function1, obj);
                }
            }, new e30() { // from class: l.gei0
                @Override // p149l.e30
                public final void call(Object obj) {
                    hei0.Companion.m130642e((Throwable) obj);
                }
            });
        }

        public Companion() {
        }
    }
}
