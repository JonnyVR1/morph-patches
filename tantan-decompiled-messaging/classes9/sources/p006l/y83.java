package p006l;

import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll/y83;", "Ll/u4;", "<init>", "()V", "Ll/gi60;", "paymentUiHolder", "", "w", "(Ll/gi60;)Z", "", "j", "(Ll/gi60;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y83 extends AbstractC1333u4 {
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: j */
    public void mo11678j(@NotNull gi60 paymentUiHolder) {
        boolean z;
        paymentUiHolder.getClass();
        d.a aVarM24946f = m24946f();
        hi60 hi60VarM15804e = paymentUiHolder.m15804e();
        if (NullChecker.a(aVarM24946f)) {
            z = aVarM24946f.s().quantity != 1;
        }
        hi60VarM15804e.m16230m("限时优惠", z);
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: w */
    public boolean mo11680w(@NotNull gi60 paymentUiHolder) {
        paymentUiHolder.getClass();
        d.a aVarM24946f = m24946f();
        return (NullChecker.a(aVarM24946f) && TEnum.equals(aVarM24946f.f(), "boost")) || TEnum.equals(aVarM24946f.f(), "acceleratePairing");
    }
}
