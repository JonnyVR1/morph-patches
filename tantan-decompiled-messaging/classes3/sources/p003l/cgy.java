package p003l;

import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.qa2;
import org.jetbrains.annotations.NotNull;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Ll/cgy;", "Ll/jq2;", "Ll/fgy;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "h0", "()V", "destroy", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cgy extends jq2<fgy> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgy(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m3258e0(c cVar) {
        cVar.getClass();
        return Boolean.valueOf(cVar == c.k);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m3259f0(cgy cgyVar, c cVar) {
        ((fgy) ((jq2) cgyVar).viewModel).m4365j();
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m3260g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m3261h0() {
        qa2.INSTANCE.a("MemojiBuzzPresenter", "startFloatMgr");
        BuzzMediaCallManager.INSTANCE.m0();
        C1099c c1099cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.zfy
            public final Object invoke(Object obj) {
                return cgy.m3258e0((c) obj);
            }
        };
        c1099cLifecycle.filter(new w9j() { // from class: l.agy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return cgy.m3260g0(function1, obj);
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.bgy
            @Override // p003l.e30
            public final void call(Object obj) {
                cgy.m3259f0(this.f2392a, (c) obj);
            }
        }));
    }

    public void destroy() {
    }
}
