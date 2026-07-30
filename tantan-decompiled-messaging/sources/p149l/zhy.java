package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/zhy;", "Ll/diy;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "a", "(Ljava/util/List;)Ljava/util/List;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class zhy extends diy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhy(@NotNull Context context, @NotNull PurchaseType purchaseType) {
        super(context, purchaseType);
        context.getClass();
        purchaseType.getClass();
    }

    @Override // p149l.diy, p149l.owl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<C8765d> mo111958a(@NotNull List<? extends Merchandise> merchandises) {
        merchandises.getClass();
        List<C8765d> listMo111958a = super.mo111958a(merchandises);
        for (C8765d c8765d : listMo111958a) {
            C8765d.a aVarM53522d = c8765d.m53522d();
            if (aVarM53522d != null) {
                aVarM53522d.m53574c0(true);
            }
            C8765d.a aVarM53520b = c8765d.m53520b();
            if (aVarM53520b != null) {
                aVarM53520b.m53574c0(true);
            }
        }
        return listMo111958a;
    }
}
