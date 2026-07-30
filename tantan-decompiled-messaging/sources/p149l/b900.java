package p149l;

import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class b900 extends orh0<MomentActivity> {

    /* JADX INFO: renamed from: m */
    public orh0<MomentActivity>.C19008a f74189m;

    public b900(b8c b8cVar, String str, mrf0<MomentActivity> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
        this.f74189m = new orh0.C19008a("activities", null, MomentActivity.CREATEDTIME.DESC, 0, 30);
    }

    /* JADX INFO: renamed from: F */
    public void m100795F(String str) {
        delete(MomentActivity.ACTORS.mo60175EQ(str));
    }

    /* JADX INFO: renamed from: G */
    public void m100796G(String str) {
        delete(MomentActivity.REFERENCE_ID.mo60175EQ(str));
    }

    /* JADX INFO: renamed from: H */
    public void m100797H(List<String> list) {
        delete(MomentActivity.f39231ID.NOT_IN(list));
    }

    /* JADX INFO: renamed from: I */
    public void m100798I() {
        BooleanColumn<MomentActivity> booleanColumn = MomentActivity.READ;
        update(vwb.m200324f0(vwb.m200311Y(booleanColumn, Boolean.TRUE)), booleanColumn.m81223F());
    }

    /* JADX INFO: renamed from: J */
    public int m100799J(String str) {
        return count(Filter.AND(MomentActivity.REFERENCE_ID.mo60175EQ(str), MomentActivity.READ.m81223F()), -1);
    }
}
