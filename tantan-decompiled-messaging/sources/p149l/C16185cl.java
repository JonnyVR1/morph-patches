package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l.cl */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/cl;", "", "<init>", "()V", "Companion", "a", "profile_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C16185cl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.cl$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/cl$a;", "", "<init>", "()V", "", "isPause", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function0;", "", "positive", "f", "(ZLcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "isCoin", "e", "(ZZLcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "profile_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m107434a(Function0 function0) {
            function0.invoke();
        }

        /* JADX INFO: renamed from: b */
        public static void m107435b(boolean z, boolean z2, Act act, Function0 function0) {
            C16185cl.INSTANCE.m107438e(z, z2, act, function0);
        }

        /* JADX INFO: renamed from: c */
        public static void m107436c(Dialog dialog) {
            dialog.dismiss();
        }

        /* JADX INFO: renamed from: d */
        public static void m107437d(Dialog dialog) {
            dialog.dismiss();
        }

        /* JADX INFO: renamed from: e */
        public final void m107438e(boolean isCoin, boolean isPause, Act act, final Function0<Unit> positive) {
            int i;
            if (isPause) {
                i = !isCoin ? R$string.f27847f1 : R$string.f27859h1;
            } else {
                i = !isCoin ? R$string.f27853g1 : R$string.f27865i1;
            }
            final Dialog dialogM20567z = act.dialog().m20500D(i).m20554s0(R$string.f27883l1).m20541k0(R$string.f27889m1).m20496B(true).m20567z();
            dialogM20567z.getClass();
            dialogM20567z.m20474o0(new Runnable() { // from class: l.al
                @Override // java.lang.Runnable
                public final void run() {
                    C16185cl.Companion.m107434a(positive);
                }
            });
            dialogM20567z.m20472m0(new Runnable() { // from class: l.bl
                @Override // java.lang.Runnable
                public final void run() {
                    C16185cl.Companion.m107436c(dialogM20567z);
                }
            });
            dialogM20567z.show();
        }

        /* JADX INFO: renamed from: f */
        public final void m107439f(final boolean isPause, @NotNull final Act act, @NotNull final Function0<Unit> positive) {
            act.getClass();
            positive.getClass();
            final boolean z = !CoreModule.f17545c.f19639e0.m169527p9().isVIP() && CoreModule.f17554l.m94651a().mo33489e2();
            final Dialog dialogM20567z = act.dialog().m20500D(!z ? R$string.f27835d1 : R$string.f27841e1).m20554s0(R$string.f27871j1).m20541k0(R$string.f27877k1).m20496B(true).m20567z();
            dialogM20567z.getClass();
            dialogM20567z.m20474o0(new Runnable() { // from class: l.yk
                @Override // java.lang.Runnable
                public final void run() {
                    C16185cl.Companion.m107437d(dialogM20567z);
                }
            });
            dialogM20567z.m20472m0(new Runnable() { // from class: l.zk
                @Override // java.lang.Runnable
                public final void run() {
                    C16185cl.Companion.m107435b(z, isPause, act, positive);
                }
            });
            dialogM20567z.show();
        }

        public Companion() {
        }
    }
}
