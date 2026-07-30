package p149l;

import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.StringColumn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ti00 extends orh0<Moment> {

    /* JADX INFO: renamed from: m */
    public orh0<Moment>.C19008a f170346m;

    public ti00(b8c b8cVar, String str, mrf0<Moment> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
        this.f170346m = new orh0.C19008a(Moments.TYPE, Moment.LOCALINFEED.m81224T(), Moment.CREATEDTIME.DESC, 0, 100);
    }

    /* JADX INFO: renamed from: G */
    public orh0<Moment>.C19008a m189024G(String str) {
        return new orh0.C19008a("cachedMoments" + str, Moment.OWNER.mo60175EQ(str), Moment.CREATEDTIME.DESC, 0, 30);
    }

    /* JADX INFO: renamed from: H */
    public void m189025H(String str) {
        delete(Moment.OWNER.mo60175EQ(str));
    }

    /* JADX INFO: renamed from: I */
    public void m189026I(ArrayList<String> arrayList) {
        delete(Moment.OWNER.m81268IN(arrayList));
    }

    /* JADX INFO: renamed from: J */
    public final List<Moment> m189027J(String str, boolean z) {
        return query(Filter.AND(Moment.LOCALINFEED.mo60175EQ(Boolean.valueOf(z)), Moment.OWNER.mo60175EQ(str), Moment.f39230ID.NOT_STARTS_WITH("fake_id_")), null, -1);
    }

    /* JADX INFO: renamed from: K */
    public List<String> m189028K(String str, boolean z) {
        return vwb.m200303Q(m189027J(str, z), new w9j() { // from class: l.si00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Moment) obj).f56011id;
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m189029L(String str, String str2) {
        Moment momentQuery = query(str);
        PartialIdList partialIdList = momentQuery.messages;
        partialIdList.count++;
        partialIdList.ids.add(str2);
        upsert(momentQuery);
    }

    /* JADX INFO: renamed from: M */
    public orh0<Moment>.C19008a m189030M(String str) {
        return new orh0.C19008a(str, Filter.AND(Moment.LOCALINUSERFEED.m81224T(), Moment.OWNER.mo60175EQ(str)), Moment.CREATEDTIME.DESC, 0, 30);
    }

    /* JADX INFO: renamed from: N */
    public void m189031N(List<String> list, boolean z) {
        BooleanColumn<Moment> booleanColumn = Moment.LOCALINFEED;
        ArrayList arrayListM200324f0 = vwb.m200324f0(vwb.m200311Y(booleanColumn, Boolean.valueOf(z)));
        Filter<Moment> filterMo60175EQ = booleanColumn.mo60175EQ(Boolean.valueOf(!z));
        StringColumn<Moment> stringColumn = Moment.f39230ID;
        update(arrayListM200324f0, Filter.AND(filterMo60175EQ, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_IN(list)));
    }

    /* JADX INFO: renamed from: O */
    public void m189032O(String str, boolean z) {
        BooleanColumn<Moment> booleanColumn = Moment.LOCALINFEED;
        update(vwb.m200324f0(vwb.m200311Y(booleanColumn, Boolean.valueOf(z))), Filter.AND(booleanColumn.mo60175EQ(Boolean.valueOf(!z)), Moment.OWNER.mo60175EQ(str), Moment.f39230ID.NOT_STARTS_WITH("fake_id_")));
    }

    /* JADX INFO: renamed from: P */
    public void m189033P(String str, List<String> list, boolean z) {
        BooleanColumn<Moment> booleanColumn = Moment.LOCALINUSERFEED;
        ArrayList arrayListM200324f0 = vwb.m200324f0(vwb.m200311Y(booleanColumn, Boolean.valueOf(z)));
        Filter<Moment> filterMo60175EQ = booleanColumn.mo60175EQ(Boolean.valueOf(!z));
        Filter<Moment> filterMo60175EQ2 = Moment.OWNER.mo60175EQ(str);
        StringColumn<Moment> stringColumn = Moment.f39230ID;
        update(arrayListM200324f0, Filter.AND(filterMo60175EQ, filterMo60175EQ2, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_IN(list)));
    }
}
