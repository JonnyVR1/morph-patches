package p007l;

import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.OrderedColumn;
import java.util.List;
import l.j760;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class b900 extends orh0<MomentActivity> {

    /* JADX INFO: renamed from: m */
    public orh0<MomentActivity>.C2452a f6183m;

    public b900(b8c b8cVar, String str, mrf0<MomentActivity> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
        this.f6183m = new orh0.C2452a("activities", null, ((OrderedColumn) MomentActivity.CREATEDTIME).DESC, 0, 30);
    }

    /* JADX INFO: renamed from: F */
    public void m8761F(String str) {
        delete(MomentActivity.ACTORS.EQ(str));
    }

    /* JADX INFO: renamed from: G */
    public void m8762G(String str) {
        delete(MomentActivity.REFERENCE_ID.EQ(str));
    }

    /* JADX INFO: renamed from: H */
    public void m8763H(List<String> list) {
        delete(MomentActivity.f692ID.NOT_IN(list));
    }

    /* JADX INFO: renamed from: I */
    public void m8764I() {
        BooleanColumn<MomentActivity> booleanColumn = MomentActivity.READ;
        update(vwb.f0(new j760[]{vwb.Y(booleanColumn, Boolean.TRUE)}), booleanColumn.F());
    }

    /* JADX INFO: renamed from: J */
    public int m8765J(String str) {
        return count(Filter.AND(new Filter[]{MomentActivity.REFERENCE_ID.EQ(str), MomentActivity.READ.F()}), -1);
    }
}
