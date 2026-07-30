package p149l;

import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/y83;", "Ll/u4;", "<init>", "()V", "Ll/gi60;", "paymentUiHolder", "", "w", "(Ll/gi60;)Z", "", "j", "(Ll/gi60;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class y83 extends AbstractC20353u4 {
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: j */
    public void mo94418j(@NotNull gi60 paymentUiHolder) {
        boolean z;
        paymentUiHolder.getClass();
        C8765d.a aVarM191648f = m191648f();
        hi60 hi60VarM126260e = paymentUiHolder.m126260e();
        if (NullChecker.m81303a(aVarM191648f)) {
            z = aVarM191648f.m53601s().quantity != 1;
        }
        hi60VarM126260e.m131224m("限时优惠", z);
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: w */
    public boolean mo94420w(@NotNull gi60 paymentUiHolder) {
        paymentUiHolder.getClass();
        C8765d.a aVarM191648f = m191648f();
        return (NullChecker.m81303a(aVarM191648f) && TEnum.equals(aVarM191648f.m53579f(), "boost")) || TEnum.equals(aVarM191648f.m53579f(), "acceleratePairing");
    }
}
