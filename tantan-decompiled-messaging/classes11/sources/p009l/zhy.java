package p009l;

import android.content.Context;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ll/zhy;", "Ll/diy;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", MiniWidgetProvider.KEY_TYPE, "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "a", "(Ljava/util/List;)Ljava/util/List;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class zhy extends diy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhy(@NotNull Context context, @NotNull PurchaseType purchaseType) {
        super(context, purchaseType);
        context.getClass();
        purchaseType.getClass();
    }

    @Override // p009l.diy, p009l.owl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<d> mo13352a(@NotNull List<? extends Merchandise> merchandises) {
        merchandises.getClass();
        List<d> listMo13352a = super.mo13352a(merchandises);
        for (d dVar : listMo13352a) {
            d.a aVarD = dVar.d();
            if (aVarD != null) {
                aVarD.c0(true);
            }
            d.a aVarB = dVar.b();
            if (aVarB != null) {
                aVarB.c0(true);
            }
        }
        return listMo13352a;
    }
}
