package p153l;

import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/n93;", "Ll/s4;", "<init>", "()V", "Ll/lq60;", "paymentUiHolder", "", "w", "(Ll/lq60;)Z", "", "j", "(Ll/lq60;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class n93 extends AbstractC19971s4 {
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: j */
    public void mo114833j(@NotNull lq60 paymentUiHolder) {
        boolean z;
        paymentUiHolder.getClass();
        C8928d.a aVarM184309f = m184309f();
        mq60 mq60VarM155322e = paymentUiHolder.m155322e();
        if (NullChecker.m82486a(aVarM184309f)) {
            z = aVarM184309f.m54784s().quantity != 1;
        }
        mq60VarM155322e.m159476m("限时优惠", z);
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: w */
    public boolean mo114835w(@NotNull lq60 paymentUiHolder) {
        paymentUiHolder.getClass();
        C8928d.a aVarM184309f = m184309f();
        return (NullChecker.m82486a(aVarM184309f) && TEnum.equals(aVarM184309f.m54762f(), "boost")) || TEnum.equals(aVarM184309f.m54762f(), "acceleratePairing");
    }
}
