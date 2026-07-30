package p149l;

import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.IntegerColumn;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class viy extends orh0<Merchandise> {
    public viy(b8c b8cVar, String str, mrf0<Merchandise> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public orh0<Merchandise>.C19008a m198609F() {
        return new orh0.C19008a("queryAllMerchandises", null, Merchandise.f20440ID.DESC, 0, 20);
    }

    /* JADX INFO: renamed from: G */
    public orh0<Merchandise>.C19008a m198610G(ProductCategory productCategory, boolean z) {
        String strName = productCategory.name();
        Filter<Merchandise> filterM60176EQ = Merchandise.CATEGORY.m60176EQ(productCategory.toString());
        IntegerColumn<Merchandise> integerColumn = Merchandise.QUANTITY;
        return new orh0.C19008a(strName, filterM60176EQ, z ? integerColumn.DESC : integerColumn.ASC, 0, 1000);
    }

    /* JADX INFO: renamed from: H */
    public orh0<Merchandise>.C19008a m198611H(ProductCategory productCategory, String str) {
        return new orh0.C19008a(str, Filter.AND(Merchandise.CATEGORY.m60176EQ(productCategory.toString()), Merchandise.DEFAULTSTOCKKEEPUNIT_ID.mo60175EQ(str)), Merchandise.QUANTITY.DESC, 0, 1000);
    }

    /* JADX INFO: renamed from: I */
    public orh0<Merchandise>.C19008a m198612I(ProductCategory productCategory, String str) {
        return new orh0.C19008a(str, Filter.AND(Merchandise.CATEGORY.m60176EQ(productCategory.toString()), Merchandise.f20440ID.mo60175EQ(str)), Merchandise.QUANTITY.DESC, 0, 1000);
    }

    @Override // p149l.orh0
    public void deleteAll() {
        du2.m113670a("[core][merchandise]", " merchandises table deleteAll");
        super.deleteAll();
    }
}
