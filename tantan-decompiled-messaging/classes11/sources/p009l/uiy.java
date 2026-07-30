package p009l;

import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.ui.purchase.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll/uiy;", "Ll/qwl;", "Ll/pwl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "a", "(Lcom/p1/mobile/putong/core/data/ProductCategory;)Ljava/util/List;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class uiy implements qwl<pwl<d.a>> {
    @Override // p009l.qwl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<pwl<d.a>> mo21326a(@NotNull ProductCategory category) {
        category.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kiy());
        arrayList.add(new piy());
        arrayList.add(new niy());
        arrayList.add(new iiy());
        arrayList.add(new oiy());
        arrayList.add(new miy());
        arrayList.add(new eiy());
        return arrayList;
    }
}
