package p153l;

import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.IntegerColumn;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class sry extends wzh0<Merchandise> {
    public sry(h9c h9cVar, String str, vzf0<Merchandise> vzf0Var, List<Index> list, int i) {
        super(h9cVar, str, vzf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public wzh0<Merchandise>.C21213a m187643F() {
        return new wzh0.C21213a("queryAllMerchandises", null, Merchandise.f21182ID.DESC, 0, 20);
    }

    /* JADX INFO: renamed from: G */
    public wzh0<Merchandise>.C21213a m187644G(ProductCategory productCategory, boolean z) {
        String strName = productCategory.name();
        Filter<Merchandise> filterM61360EQ = Merchandise.CATEGORY.m61360EQ(productCategory.toString());
        IntegerColumn<Merchandise> integerColumn = Merchandise.QUANTITY;
        return new wzh0.C21213a(strName, filterM61360EQ, z ? integerColumn.DESC : integerColumn.ASC, 0, 1000);
    }

    /* JADX INFO: renamed from: H */
    public wzh0<Merchandise>.C21213a m187645H(ProductCategory productCategory, String str) {
        return new wzh0.C21213a(str, Filter.AND(Merchandise.CATEGORY.m61360EQ(productCategory.toString()), Merchandise.DEFAULTSTOCKKEEPUNIT_ID.mo61359EQ(str)), Merchandise.QUANTITY.DESC, 0, 1000);
    }

    /* JADX INFO: renamed from: I */
    public wzh0<Merchandise>.C21213a m187646I(ProductCategory productCategory, String str) {
        return new wzh0.C21213a(str, Filter.AND(Merchandise.CATEGORY.m61360EQ(productCategory.toString()), Merchandise.f21182ID.mo61359EQ(str)), Merchandise.QUANTITY.DESC, 0, 1000);
    }

    @Override // p153l.wzh0
    public void deleteAll() {
        tu2.m192703a("[core][merchandise]", " merchandises table deleteAll");
        super.deleteAll();
    }
}
