package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l.xk */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/xk;", "", "<init>", "()V", "Companion", "a", "profile_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C21356xk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.xk$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/xk$a;", "", "<init>", "()V", "", "isPause", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function0;", "", "positive", "f", "(ZLcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "isCoin", "e", "(ZZLcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "profile_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m211273a(Function0 function0) {
            function0.invoke();
        }

        /* JADX INFO: renamed from: b */
        public static void m211274b(boolean z, boolean z2, Act act, Function0 function0) {
            C21356xk.INSTANCE.m211277e(z, z2, act, function0);
        }

        /* JADX INFO: renamed from: c */
        public static void m211275c(Dialog dialog) {
            dialog.dismiss();
        }

        /* JADX INFO: renamed from: d */
        public static void m211276d(Dialog dialog) {
            dialog.dismiss();
        }

        /* JADX INFO: renamed from: e */
        public final void m211277e(boolean isCoin, boolean isPause, Act act, final Function0<Unit> positive) {
            int i;
            if (isPause) {
                i = !isCoin ? R$string.f28695f1 : R$string.f28707h1;
            } else {
                i = !isCoin ? R$string.f28701g1 : R$string.f28713i1;
            }
            final Dialog dialogM21566z = act.dialog().m21499D(i).m21553s0(R$string.f28731l1).m21540k0(R$string.f28737m1).m21495B(true).m21566z();
            dialogM21566z.getClass();
            dialogM21566z.m21473o0(new Runnable() { // from class: l.vk
                @Override // java.lang.Runnable
                public final void run() {
                    C21356xk.Companion.m211273a(positive);
                }
            });
            dialogM21566z.m21471m0(new Runnable() { // from class: l.wk
                @Override // java.lang.Runnable
                public final void run() {
                    C21356xk.Companion.m211275c(dialogM21566z);
                }
            });
            dialogM21566z.show();
        }

        /* JADX INFO: renamed from: f */
        public final void m211278f(final boolean isPause, @NotNull final Act act, @NotNull final Function0<Unit> positive) {
            act.getClass();
            positive.getClass();
            final boolean z = !CoreModule.f18264c.f20381e0.m116600p9().isVIP() && CoreModule.f18273l.m143405a().mo34492e2();
            final Dialog dialogM21566z = act.dialog().m21499D(!z ? R$string.f28683d1 : R$string.f28689e1).m21553s0(R$string.f28719j1).m21540k0(R$string.f28725k1).m21495B(true).m21566z();
            dialogM21566z.getClass();
            dialogM21566z.m21473o0(new Runnable() { // from class: l.tk
                @Override // java.lang.Runnable
                public final void run() {
                    C21356xk.Companion.m211276d(dialogM21566z);
                }
            });
            dialogM21566z.m21471m0(new Runnable() { // from class: l.uk
                @Override // java.lang.Runnable
                public final void run() {
                    C21356xk.Companion.m211274b(z, isPause, act, positive);
                }
            });
            dialogM21566z.show();
        }

        public Companion() {
        }
    }
}
