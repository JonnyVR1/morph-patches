package p009l;

import android.content.Context;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l.t4b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010 ¨\u0006\""}, d2 = {"Ll/riy;", "", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", MiniWidgetProvider.KEY_TYPE, "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "d", "()Ll/riy;", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "c", "(Ljava/util/List;)Ljava/util/List;", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "productCategory", "Ll/owl;", "b", "(Lcom/p1/mobile/putong/core/data/ProductCategory;)Ll/owl;", "sections", "", "a", "(Ljava/util/List;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "", "Z", "forceParingMode", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class riy {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean forceParingMode;

    public riy(@NotNull Context context, @NotNull PurchaseType purchaseType) {
        context.getClass();
        purchaseType.getClass();
        this.context = context;
        this.type = purchaseType;
    }

    /* JADX INFO: renamed from: a */
    public final void m21674a(List<? extends d> sections) {
        Iterator<? extends d> it = sections.iterator();
        while (it.hasNext()) {
            if (it.next().l()) {
                return;
            }
        }
        if (sections.isEmpty()) {
            return;
        }
        sections.get((int) Math.floor(((double) sections.size()) / 2.0d)).v(true);
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
    
        if (r2.equals("oDiamondPrivateCustom") != false) goto L51;
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
    
        if (r2.equals("tttVip") == false) goto L49;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final p009l.owl<com.p1.mobile.putong.core.ui.purchase.d> m21675b(com.p1.mobile.putong.core.data.ProductCategory r2) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009l.riy.m21675b(com.p1.mobile.putong.core.data.ProductCategory):l.owl");
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<d> m21676c(@NotNull List<? extends Merchandise> merchandises) {
        owl<d> owlVarM21675b;
        merchandises.getClass();
        if (!t4b.Companion.c(this.type) || rxa0.m21868e(merchandises)) {
            ProductCategory productCategory = this.type.productCategory();
            productCategory.getClass();
            owlVarM21675b = m21675b(productCategory);
        } else {
            owlVarM21675b = new zhy(this.context, this.type);
        }
        List<d> listMo13352a = owlVarM21675b.mo13352a(merchandises);
        m21674a(listMo13352a);
        return listMo13352a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final riy m21677d() {
        this.forceParingMode = true;
        return this;
    }
}
