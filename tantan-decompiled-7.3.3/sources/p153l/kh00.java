package p153l;

import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class kh00 extends wzh0<MomentActivity> {

    /* JADX INFO: renamed from: m */
    public wzh0<MomentActivity>.C21213a f126682m;

    public kh00(h9c h9cVar, String str, vzf0<MomentActivity> vzf0Var, List<Index> list, int i) {
        super(h9cVar, str, vzf0Var, list, i);
        this.f126682m = new wzh0.C21213a("activities", null, MomentActivity.CREATEDTIME.DESC, 0, 30);
    }

    /* JADX INFO: renamed from: F */
    public void m149783F(String str) {
        delete(MomentActivity.ACTORS.mo61359EQ(str));
    }

    /* JADX INFO: renamed from: G */
    public void m149784G(String str) {
        delete(MomentActivity.REFERENCE_ID.mo61359EQ(str));
    }

    /* JADX INFO: renamed from: H */
    public void m149785H(List<String> list) {
        delete(MomentActivity.f40079ID.NOT_IN(list));
    }

    /* JADX INFO: renamed from: I */
    public void m149786I() {
        BooleanColumn<MomentActivity> booleanColumn = MomentActivity.READ;
        update(jyb.m147507f0(jyb.m147494Y(booleanColumn, Boolean.TRUE)), booleanColumn.m82406F());
    }

    /* JADX INFO: renamed from: J */
    public int m149787J(String str) {
        return count(Filter.AND(MomentActivity.REFERENCE_ID.mo61359EQ(str), MomentActivity.READ.m82406F()), -1);
    }
}
