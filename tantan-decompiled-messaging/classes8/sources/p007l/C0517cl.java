package p007l;

import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l.cl */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/cl;", "", "<init>", "()V", "Companion", "a", "profile_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0517cl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.cl$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll/cl$a;", "", "<init>", "()V", "", "isPause", "Lcom/p1/mobile/android/app/Act;", "act", "Lkotlin/Function0;", "", "positive", "f", "(ZLcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "isCoin", "e", "(ZZLcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "profile_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m8785a(Function0 function0) {
            function0.invoke();
        }

        /* JADX INFO: renamed from: b */
        public static void m8786b(boolean z, boolean z2, Act act, Function0 function0) {
            C0517cl.INSTANCE.m8789e(z, z2, act, function0);
        }

        /* JADX INFO: renamed from: c */
        public static void m8787c(Dialog dialog) {
            dialog.dismiss();
        }

        /* JADX INFO: renamed from: d */
        public static void m8788d(Dialog dialog) {
            dialog.dismiss();
        }

        /* JADX INFO: renamed from: e */
        public final void m8789e(boolean isCoin, boolean isPause, Act act, final Function0<Unit> positive) {
            int i;
            if (isPause) {
                i = !isCoin ? R.string.f1 : R.string.h1;
            } else {
                i = !isCoin ? R.string.g1 : R.string.i1;
            }
            final Dialog dialogM838z = act.dialog().m771D(i).m825s0(R.string.l1).m812k0(R.string.m1).m767B(true).m838z();
            dialogM838z.getClass();
            dialogM838z.m745o0(new Runnable() { // from class: l.al
                @Override // java.lang.Runnable
                public final void run() {
                    C0517cl.Companion.m8785a(positive);
                }
            });
            dialogM838z.m743m0(new Runnable() { // from class: l.bl
                @Override // java.lang.Runnable
                public final void run() {
                    C0517cl.Companion.m8787c(dialogM838z);
                }
            });
            dialogM838z.show();
        }

        /* JADX INFO: renamed from: f */
        public final void m8790f(final boolean isPause, @NotNull final Act act, @NotNull final Function0<Unit> positive) {
            act.getClass();
            positive.getClass();
            final boolean z = !CoreModule.c.e0.p9().isVIP() && CoreModule.l.a().e2();
            final Dialog dialogM838z = act.dialog().m771D(!z ? R.string.d1 : R.string.e1).m825s0(R.string.j1).m812k0(R.string.k1).m767B(true).m838z();
            dialogM838z.getClass();
            dialogM838z.m745o0(new Runnable() { // from class: l.yk
                @Override // java.lang.Runnable
                public final void run() {
                    C0517cl.Companion.m8788d(dialogM838z);
                }
            });
            dialogM838z.m743m0(new Runnable() { // from class: l.zk
                @Override // java.lang.Runnable
                public final void run() {
                    C0517cl.Companion.m8786b(z, isPause, act, positive);
                }
            });
            dialogM838z.show();
        }

        public Companion() {
        }
    }
}
