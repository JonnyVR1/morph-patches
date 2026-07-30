package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.TarotData;
import com.p1.mobile.putong.core.data.TarotDataEnvelope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.e30;
import l.jo0;
import l.lsi0;
import l.mqi0;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/hei0;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class hei0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m16198a(@NotNull Act act, boolean z) {
        INSTANCE.m16206g(act, z);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m16199b(@NotNull Act act) {
        INSTANCE.m16207h(act);
    }

    /* JADX INFO: renamed from: l.hei0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/hei0$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "showDialog", "", "g", "(Lcom/p1/mobile/android/app/Act;Z)V", "h", "(Lcom/p1/mobile/android/app/Act;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static Unit m16200a(Act act, TarotDataEnvelope tarotDataEnvelope) {
            TarotData tarotData = tarotDataEnvelope.data;
            int i = tarotData.cardType;
            if (1 <= i && i < 45) {
                oci0.INSTANCE.m20530d(act, tarotData);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        public static void m16201b(Throwable th) {
            lsi0.h(R$string.f2516fq);
        }

        /* JADX INFO: renamed from: c */
        public static Unit m16202c(boolean z, Act act, TarotDataEnvelope tarotDataEnvelope) {
            int i = tarotDataEnvelope.data.cardType;
            if (i < 0 || i >= 45) {
                lsi0.h(R$string.f2516fq);
            } else {
                CoreModule.f1534c.f3683w1.m20366r3(tarotDataEnvelope);
                CoreModule.f1534c.f3683w1.m20365q3(tarotDataEnvelope.data.cardType);
                if (z) {
                    oci0.INSTANCE.m20529c(act);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: d */
        public static void m16203d(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: e */
        public static void m16204e(Throwable th) {
        }

        /* JADX INFO: renamed from: f */
        public static void m16205f(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        @JvmStatic
        /* JADX INFO: renamed from: g */
        public final void m16206g(@NotNull final Act act, final boolean showDialog) {
            act.getClass();
            c cVarObserveOn = act.duringCreated(CoreModule.f1534c.f3683w1.m20363m3()).observeOn(jo0.a());
            final Function1 function1 = new Function1() { // from class: l.bei0
                public final Object invoke(Object obj) {
                    return hei0.Companion.m16202c(showDialog, act, (TarotDataEnvelope) obj);
                }
            };
            cVarObserveOn.subscribe(new e30() { // from class: l.cei0
                public final void call(Object obj) {
                    hei0.Companion.m16205f(function1, obj);
                }
            }, new e30() { // from class: l.dei0
                public final void call(Object obj) {
                    hei0.Companion.m16201b((Throwable) obj);
                }
            });
        }

        @JvmStatic
        /* JADX INFO: renamed from: h */
        public final void m16207h(@NotNull final Act act) {
            act.getClass();
            adi0 adi0Var = adi0.INSTANCE;
            if (adi0Var.m11821e() == -1 || ((Number) CoreModule.f1534c.f3628e0.f18850P0.get()).longValue() < adi0Var.m11821e() || CoreModule.f1534c.f3683w1.getCardType() == 0 || CoreModule.f1534c.f3683w1.getCardType() == -1 || ((Boolean) CoreModule.f1534c.f3683w1.getReject().get()).booleanValue()) {
                return;
            }
            Object obj = CoreModule.f1534c.f3683w1.getTarotDay().get();
            obj.getClass();
            if (mqi0.D(((Number) obj).longValue())) {
                return;
            }
            long jM11820d = adi0Var.m11820d() - System.currentTimeMillis();
            if (jM11820d > 0 || jM11820d < -7200000) {
                return;
            }
            CoreModule.f1534c.f3683w1.getTarotDay().put(Long.valueOf(System.currentTimeMillis()));
            c cVarObserveOn = act.duringCreated(CoreModule.f1534c.f3683w1.m20364o3()).observeOn(jo0.a());
            final Function1 function1 = new Function1() { // from class: l.eei0
                public final Object invoke(Object obj2) {
                    return hei0.Companion.m16200a(act, (TarotDataEnvelope) obj2);
                }
            };
            cVarObserveOn.subscribe(new e30() { // from class: l.fei0
                public final void call(Object obj2) {
                    hei0.Companion.m16203d(function1, obj2);
                }
            }, new e30() { // from class: l.gei0
                public final void call(Object obj2) {
                    hei0.Companion.m16204e((Throwable) obj2);
                }
            });
        }

        public Companion() {
        }
    }
}
