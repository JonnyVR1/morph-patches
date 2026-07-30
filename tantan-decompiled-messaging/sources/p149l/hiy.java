package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/hiy;", "Ll/fiy;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", "g", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class hiy extends fiy {
    @Override // p149l.fiy, p149l.pwl
    /* JADX INFO: renamed from: g */
    public void mo116746a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8765d.a detail) {
        context.getClass();
        type.getClass();
        detail.getClass();
        super.mo116746a(context, type, detail);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        detail.m53559O(String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2)));
        detail.m53557M(String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(getUnitPrice())}, 1)));
    }
}
