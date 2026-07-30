package p007l;

import com.p000p1.mobile.putong.data.Moments;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.OrderedColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ti00 extends orh0<Moment> {

    /* JADX INFO: renamed from: m */
    public orh0<Moment>.C2452a f13305m;

    public ti00(b8c b8cVar, String str, mrf0<Moment> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
        this.f13305m = new orh0.C2452a(Moments.TYPE, Moment.LOCALINFEED.T(), ((OrderedColumn) Moment.CREATEDTIME).DESC, 0, 100);
    }

    /* JADX INFO: renamed from: G */
    public orh0<Moment>.C2452a m14535G(String str) {
        return new orh0.C2452a("cachedMoments" + str, Moment.OWNER.EQ(str), ((OrderedColumn) Moment.CREATEDTIME).DESC, 0, 30);
    }

    /* JADX INFO: renamed from: H */
    public void m14536H(String str) {
        delete(Moment.OWNER.EQ(str));
    }

    /* JADX INFO: renamed from: I */
    public void m14537I(ArrayList<String> arrayList) {
        delete(Moment.OWNER.IN(arrayList));
    }

    /* JADX INFO: renamed from: J */
    public final List<Moment> m14538J(String str, boolean z) {
        return query(Filter.AND(new Filter[]{Moment.LOCALINFEED.EQ(Boolean.valueOf(z)), Moment.OWNER.EQ(str), Moment.f691ID.NOT_STARTS_WITH("fake_id_")}), null, -1);
    }

    /* JADX INFO: renamed from: K */
    public List<String> m14539K(String str, boolean z) {
        return vwb.Q(m14538J(str, z), new w9j() { // from class: l.si00
            public final Object call(Object obj) {
                return ((DbObject) ((Moment) obj)).id;
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m14540L(String str, String str2) {
        Moment momentQuery = query(str);
        PartialIdList partialIdList = momentQuery.messages;
        partialIdList.count++;
        partialIdList.ids.add(str2);
        upsert(momentQuery);
    }

    /* JADX INFO: renamed from: M */
    public orh0<Moment>.C2452a m14541M(String str) {
        return new orh0.C2452a(str, Filter.AND(new Filter[]{Moment.LOCALINUSERFEED.T(), Moment.OWNER.EQ(str)}), ((OrderedColumn) Moment.CREATEDTIME).DESC, 0, 30);
    }

    /* JADX INFO: renamed from: N */
    public void m14542N(List<String> list, boolean z) {
        BooleanColumn<Moment> booleanColumn = Moment.LOCALINFEED;
        ArrayList arrayListF0 = vwb.f0(new j760[]{vwb.Y(booleanColumn, Boolean.valueOf(z))});
        Filter filterEQ = booleanColumn.EQ(Boolean.valueOf(!z));
        StringColumn<Moment> stringColumn = Moment.f691ID;
        update(arrayListF0, Filter.AND(new Filter[]{filterEQ, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_IN(list)}));
    }

    /* JADX INFO: renamed from: O */
    public void m14543O(String str, boolean z) {
        BooleanColumn<Moment> booleanColumn = Moment.LOCALINFEED;
        update(vwb.f0(new j760[]{vwb.Y(booleanColumn, Boolean.valueOf(z))}), Filter.AND(new Filter[]{booleanColumn.EQ(Boolean.valueOf(!z)), Moment.OWNER.EQ(str), Moment.f691ID.NOT_STARTS_WITH("fake_id_")}));
    }

    /* JADX INFO: renamed from: P */
    public void m14544P(String str, List<String> list, boolean z) {
        BooleanColumn<Moment> booleanColumn = Moment.LOCALINUSERFEED;
        ArrayList arrayListF0 = vwb.f0(new j760[]{vwb.Y(booleanColumn, Boolean.valueOf(z))});
        Filter filterEQ = booleanColumn.EQ(Boolean.valueOf(!z));
        Filter filterEQ2 = Moment.OWNER.EQ(str);
        StringColumn<Moment> stringColumn = Moment.f691ID;
        update(arrayListF0, Filter.AND(new Filter[]{filterEQ, filterEQ2, stringColumn.NOT_STARTS_WITH("fake_id_"), stringColumn.NOT_IN(list)}));
    }
}
