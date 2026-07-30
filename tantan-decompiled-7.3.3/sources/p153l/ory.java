package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010 ¨\u0006\""}, m88121d2 = {"Ll/ory;", "", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", Constants.INAPP_DATA_TAG, "()Ll/ory;", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "c", "(Ljava/util/List;)Ljava/util/List;", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "productCategory", "Ll/gzl;", "b", "(Lcom/p1/mobile/putong/core/data/ProductCategory;)Ll/gzl;", "sections", "", "a", "(Ljava/util/List;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "", "Z", "forceParingMode", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean forceParingMode;

    public ory(@NotNull Context context, @NotNull PurchaseType purchaseType) {
        context.getClass();
        purchaseType.getClass();
        this.context = context;
        this.type = purchaseType;
    }

    /* JADX INFO: renamed from: a */
    public final void m168944a(List<? extends C8928d> sections) {
        Iterator<? extends C8928d> it = sections.iterator();
        while (it.hasNext()) {
            if (it.next().m54713l()) {
                return;
            }
        }
        if (sections.isEmpty()) {
            return;
        }
        sections.get((int) Math.floor(((double) sections.size()) / 2.0d)).m54723v(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r2.equals("undoMembership") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r2.equals("roaming") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r2.equals("quickchatMembership") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r2.equals("femaleVip") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r2.equals(com.p051p1.mobile.putong.core.data.ProductCategory.oDiamondPrivateCustom) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r2.equals("privateCustom") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        if (r2.equals("svip") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r2.equals("svipPicksMembership") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if (r2.equals("unlimitedSwipes") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
    
        if (r2.equals("youthVip") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        if (r2.equals("oDiamond") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        if (r2.equals(com.p051p1.mobile.putong.core.data.ProductCategory.tttVip) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
    
        if (r2.equals("superLikeMembership") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2.equals("picksMembership") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r2.equals("platinum") == false) goto L49;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gzl<C8928d> m168945b(ProductCategory productCategory) {
        String string = productCategory.toString();
        switch (string.hashCode()) {
            case -2067215576:
                break;
            case -863315575:
                break;
            case -796840475:
                break;
            case -679730102:
                break;
            case -429915974:
                break;
            case -94011970:
                break;
            case 3542730:
                break;
            case 165490388:
                break;
            case 175221999:
                break;
            case 1086939441:
                break;
            case 1166765179:
                break;
            case 1366973465:
                break;
            case 1848078298:
                break;
            case 1874772524:
                break;
            case 1905099240:
                break;
            default:
                return new sqy(this.context, this.type);
        }
        return (!tab0.m189811h().m189835z() || this.forceParingMode) ? new ary(this.context, this.type) : new vqy(this.context, this.type);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<C8928d> m168946c(@NotNull List<? extends Merchandise> merchandises) {
        gzl<C8928d> gzlVarM168945b;
        merchandises.getClass();
        if (!g6b.INSTANCE.m129218c(this.type) || v5b0.m199779e(merchandises)) {
            ProductCategory productCategory = this.type.productCategory();
            productCategory.getClass();
            gzlVarM168945b = m168945b(productCategory);
        } else {
            gzlVarM168945b = new wqy(this.context, this.type);
        }
        List<C8928d> listMo99809a = gzlVarM168945b.mo99809a(merchandises);
        m168944a(listMo99809a);
        return listMo99809a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ory m168947d() {
        this.forceParingMode = true;
        return this;
    }
}
