package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m88121d2 = {"Ll/ual0;", "Ll/ar2;", "Ll/xal0;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "h0", "()V", "destroy", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ual0 extends ar2<xal0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ual0(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m195175e0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m195176f0(ual0 ual0Var, C4470c c4470c) {
        ((xal0) ual0Var.viewModel).m209879j();
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m195177g0(C4470c c4470c) {
        c4470c.getClass();
        return Boolean.valueOf(c4470c == C4470c.f16269k);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m195178h0() {
        xa2.INSTANCE.m209830a("VideoBuzzPresenter", "startFloatMgr");
        BuzzMediaCallManager.INSTANCE.m48159m0();
        C22421c<C4470c> c22421cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.ral0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ual0.m195177g0((C4470c) obj);
            }
        };
        c22421cLifecycle.filter(new qcj() { // from class: l.sal0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ual0.m195175e0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.tal0
            @Override // p153l.y20
            public final void call(Object obj) {
                ual0.m195176f0(this.f172745a, (C4470c) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
