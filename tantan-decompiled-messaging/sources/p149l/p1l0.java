package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m87232d2 = {"Ll/p1l0;", "Ll/jq2;", "Ll/s1l0;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "h0", "()V", "destroy", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class p1l0 extends jq2<s1l0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1l0(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m167107e0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m167108f0(p1l0 p1l0Var, C4319c c4319c) {
        ((s1l0) p1l0Var.viewModel).m181981j();
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m167109g0(C4319c c4319c) {
        c4319c.getClass();
        return Boolean.valueOf(c4319c == C4319c.f15550k);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m167110h0() {
        qa2.INSTANCE.m173681a("VideoBuzzPresenter", "startFloatMgr");
        BuzzMediaCallManager.INSTANCE.m46976m0();
        C22306c<C4319c> c22306cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.m1l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p1l0.m167109g0((C4319c) obj);
            }
        };
        c22306cLifecycle.filter(new w9j() { // from class: l.n1l0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p1l0.m167107e0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.o1l0
            @Override // p149l.e30
            public final void call(Object obj) {
                p1l0.m167108f0(this.f141461a, (C4319c) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
