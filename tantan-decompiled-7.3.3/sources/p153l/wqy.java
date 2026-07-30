package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/wqy;", "Ll/ary;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "a", "(Ljava/util/List;)Ljava/util/List;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class wqy extends ary {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqy(@NotNull Context context, @NotNull PurchaseType purchaseType) {
        super(context, purchaseType);
        context.getClass();
        purchaseType.getClass();
    }

    @Override // p153l.ary, p153l.gzl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<C8928d> mo99809a(@NotNull List<? extends Merchandise> merchandises) {
        merchandises.getClass();
        List<C8928d> listMo99809a = super.mo99809a(merchandises);
        for (C8928d c8928d : listMo99809a) {
            C8928d.a aVarM54705d = c8928d.m54705d();
            if (aVarM54705d != null) {
                aVarM54705d.m54757c0(true);
            }
            C8928d.a aVarM54703b = c8928d.m54703b();
            if (aVarM54703b != null) {
                aVarM54703b.m54757c0(true);
            }
        }
        return listMo99809a;
    }
}
