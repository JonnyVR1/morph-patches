package p153l;

import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/pry;", "Ll/izl;", "Ll/hzl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "a", "(Lcom/p1/mobile/putong/core/data/ProductCategory;)Ljava/util/List;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class pry implements izl<hzl<C8928d.a>> {
    @Override // p153l.izl
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<hzl<C8928d.a>> mo142811a(@NotNull ProductCategory category) {
        category.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new hry());
        if (TEnum.equals(category, ProductCategory.get("coin")) || TEnum.equals(category, ProductCategory.get(ProductCategory.noneLiveCoin)) || TEnum.equals(category, ProductCategory.get(ProductCategory.tttCoin)) || TEnum.equals(category, ProductCategory.get(ProductCategory.tttLiveCoin))) {
            arrayList.add(new dry());
        } else {
            arrayList.add(new ery());
        }
        arrayList.add(new gry());
        return arrayList;
    }
}
