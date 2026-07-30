package p006l;

import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.OrderedColumn;
import java.util.List;
import l.b8c;
import l.du2;
import l.mrf0;
import l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class viy extends orh0<Merchandise> {
    public viy(b8c b8cVar, String str, mrf0<Merchandise> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public orh0<Merchandise>.a m25827F() {
        return new orh0.a(this, "queryAllMerchandises", (Filter) null, ((OrderedColumn) Merchandise.ID).DESC, 0, 20);
    }

    /* JADX INFO: renamed from: G */
    public orh0<Merchandise>.a m25828G(ProductCategory productCategory, boolean z) {
        String strName = productCategory.name();
        Filter filterEQ = Merchandise.CATEGORY.EQ(productCategory.toString());
        IntegerColumn integerColumn = Merchandise.QUANTITY;
        return new orh0.a(this, strName, filterEQ, z ? ((OrderedColumn) integerColumn).DESC : ((OrderedColumn) integerColumn).ASC, 0, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
    }

    /* JADX INFO: renamed from: H */
    public orh0<Merchandise>.a m25829H(ProductCategory productCategory, String str) {
        return new orh0.a(this, str, Filter.AND(new Filter[]{Merchandise.CATEGORY.EQ(productCategory.toString()), Merchandise.DEFAULTSTOCKKEEPUNIT_ID.EQ(str)}), ((OrderedColumn) Merchandise.QUANTITY).DESC, 0, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
    }

    /* JADX INFO: renamed from: I */
    public orh0<Merchandise>.a m25830I(ProductCategory productCategory, String str) {
        return new orh0.a(this, str, Filter.AND(new Filter[]{Merchandise.CATEGORY.EQ(productCategory.toString()), Merchandise.ID.EQ(str)}), ((OrderedColumn) Merchandise.QUANTITY).DESC, 0, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
    }

    public void deleteAll() {
        du2.a("[core][merchandise]", " merchandises table deleteAll");
        super.deleteAll();
    }
}
