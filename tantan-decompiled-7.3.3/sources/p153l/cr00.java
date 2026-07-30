package p153l;

import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.StringColumn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class cr00 extends wzh0<Moment> {

    /* JADX INFO: renamed from: m */
    public wzh0<Moment>.C21213a f83267m;

    public cr00(h9c h9cVar, String str, vzf0<Moment> vzf0Var, List<Index> list, int i) {
        super(h9cVar, str, vzf0Var, list, i);
        this.f83267m = new wzh0.C21213a(Moments.TYPE, Moment.LOCALINFEED.m82407T(), Moment.CREATEDTIME.DESC, 0, 100);
    }

    /* JADX INFO: renamed from: G */
    public wzh0<Moment>.C21213a m112011G(String str) {
        return new wzh0.C21213a("cachedMoments" + str, Moment.OWNER.mo61359EQ(str), Moment.CREATEDTIME.DESC, 0, 30);
    }

    /* JADX INFO: renamed from: H */
    public void m112012H(String str) {
        delete(Moment.OWNER.mo61359EQ(str));
    }

    /* JADX INFO: renamed from: I */
    public void m112013I(ArrayList<String> arrayList) {
        delete(Moment.OWNER.m82451IN(arrayList));
    }

    /* JADX INFO: renamed from: J */
    public final List<Moment> m112014J(String str, boolean z) {
        return query(Filter.AND(Moment.LOCALINFEED.mo61359EQ(Boolean.valueOf(z)), Moment.OWNER.mo61359EQ(str), Moment.f40078ID.NOT_STARTS_WITH("fake_id_")), null, -1);
    }

    /* JADX INFO: renamed from: K */
    public List<String> m112015K(String str, boolean z) {
        return jyb.m147486Q(m112014J(str, z), new qcj() { // from class: l.br00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Moment) obj).f56859id;
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m112016L(String str, String str2) {
        Moment momentQuery = query(str);
        PartialIdList partialIdList = momentQuery.messages;
        partialIdList.count++;
        partialIdList.ids.add(str2);
        upsert(momentQuery);
    }

    /* JADX INFO: renamed from: M */
    public wzh0<Moment>.C21213a m112017M(String str) {
        return new wzh0.C21213a(str, Filter.AND(Moment.LOCALINUSERFEED.m82407T(), Moment.OWNER.mo61359EQ(str)), Moment.CREATEDTIME.DESC, 0, 30);
    }

    /* JADX INFO: renamed from: N */
    public void m112018N(List<String> list, boolean z) {
        BooleanColumn<Moment> booleanColumn = Moment.LOCALINFEED;
        ArrayList arrayListM147507f0 = jyb.m147507f0(jyb.m147494Y(booleanColumn, Boolean.valueOf(z)));
        Filter<Moment> filterMo61359EQ = booleanColumn.mo61359EQ(Boolean.valueOf(!z));
        StringColumn<Moment> stringColumn = Moment.f40078ID;
        update(arrayListM147507f0, Filter.AND(filterMo61359EQ, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_IN(list)));
    }

    /* JADX INFO: renamed from: O */
    public void m112019O(String str, boolean z) {
        BooleanColumn<Moment> booleanColumn = Moment.LOCALINFEED;
        update(jyb.m147507f0(jyb.m147494Y(booleanColumn, Boolean.valueOf(z))), Filter.AND(booleanColumn.mo61359EQ(Boolean.valueOf(!z)), Moment.OWNER.mo61359EQ(str), Moment.f40078ID.NOT_STARTS_WITH("fake_id_")));
    }

    /* JADX INFO: renamed from: P */
    public void m112020P(String str, List<String> list, boolean z) {
        BooleanColumn<Moment> booleanColumn = Moment.LOCALINUSERFEED;
        ArrayList arrayListM147507f0 = jyb.m147507f0(jyb.m147494Y(booleanColumn, Boolean.valueOf(z)));
        Filter<Moment> filterMo61359EQ = booleanColumn.mo61359EQ(Boolean.valueOf(!z));
        Filter<Moment> filterMo61359EQ2 = Moment.OWNER.mo61359EQ(str);
        StringColumn<Moment> stringColumn = Moment.f40078ID;
        update(arrayListM147507f0, Filter.AND(filterMo61359EQ, filterMo61359EQ2, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_IN(list)));
    }
}
