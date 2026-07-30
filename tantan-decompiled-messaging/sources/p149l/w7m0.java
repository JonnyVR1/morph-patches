package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p046p1.mobile.putong.core.data.VisitorFilterType;
import com.p046p1.mobile.putong.core.data.VisitorSortType;
import com.p046p1.mobile.putong.core.p053ui.visitor.VisitorsFilterItemAgeView;
import com.p046p1.mobile.putong.core.p053ui.visitor.VisitorsFilterItemDefaultView;
import com.p046p1.mobile.putong.core.p053ui.visitor.VisitorsFilterItemDistanceView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class w7m0 extends dac0 {

    /* JADX INFO: renamed from: h */
    public static List<VisitorFilterType> f185064h = vwb.m200324f0(VisitorFilterType.get("all"), VisitorFilterType.get("match"), VisitorFilterType.get(VisitorFilterType.likeMe));

    /* JADX INFO: renamed from: i */
    public static List<VisitorSortType> f185065i = vwb.m200324f0(VisitorSortType.get("visitTime"), VisitorSortType.get("visitTimes"), VisitorSortType.get("distance"), VisitorSortType.get(VisitorSortType.realUser), VisitorSortType.get("newUser"));

    /* JADX INFO: renamed from: c */
    public final Act f185066c;

    /* JADX INFO: renamed from: d */
    public final VisitorFilterSettings f185067d;

    /* JADX INFO: renamed from: e */
    public int f185068e = 0;

    /* JADX INFO: renamed from: f */
    public VisitorSortType f185069f = VisitorSortType.get("visitTime");

    /* JADX INFO: renamed from: g */
    public VisitorFilterType f185070g = VisitorFilterType.get("all");

    public w7m0(Act act, @NonNull w7m w7mVar) {
        this.f185066c = act;
        this.f185067d = w7mVar.mo57948a();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: A */
    public void mo28823A(View view, Object obj, int i, int i2) {
        if (i == 1) {
            ((VisitorsFilterItemAgeView) view).m57811b(this.f185067d);
            return;
        }
        if (i == 0) {
            ((VisitorsFilterItemDistanceView) view).m57824d(this.f185067d);
            return;
        }
        if (i == 2) {
            VisitorSortType visitorSortType = f185065i.get(i2);
            VisitorSortType visitorSortType2 = this.f185067d.sort;
            this.f185069f = visitorSortType2;
            ((VisitorsFilterItemDefaultView) view).m57820e(visitorSortType, visitorSortType2, new e30() { // from class: l.u7m0
                @Override // p149l.e30
                public final void call(Object obj2) {
                    this.f175025a.m202021G((VisitorSortType) obj2);
                }
            });
            return;
        }
        if (i == 3) {
            VisitorFilterType visitorFilterType = f185064h.get(i2);
            VisitorFilterType visitorFilterType2 = this.f185067d.filter;
            this.f185070g = visitorFilterType2;
            ((VisitorsFilterItemDefaultView) view).m57819d(visitorFilterType, visitorFilterType2, new e30() { // from class: l.v7m0
                @Override // p149l.e30
                public final void call(Object obj2) {
                    this.f180405a.m202022H((VisitorFilterType) obj2);
                }
            });
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        int i = this.f185068e;
        if (i == 2) {
            return f185065i.size();
        }
        if (i == 3) {
            return f185064h.size();
        }
        return (i == 1 || i == 0) ? 1 : 0;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return this.f185066c.inflater().inflate(k6c0.f121372d2, viewGroup, false);
        }
        if (i == 3) {
            return this.f185066c.inflater().inflate(k6c0.f121372d2, viewGroup, false);
        }
        if (i == 1) {
            return this.f185066c.inflater().inflate(k6c0.f121368c2, viewGroup, false);
        }
        return i == 0 ? this.f185066c.inflater().inflate(k6c0.f121376e2, viewGroup, false) : new View(this.f185066c);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m202021G(VisitorSortType visitorSortType) {
        this.f185069f = visitorSortType;
        this.f185067d.sort = visitorSortType;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m202022H(VisitorFilterType visitorFilterType) {
        this.f185070g = visitorFilterType;
        this.f185067d.filter = visitorFilterType;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I */
    public void m202023I(int i) {
        this.f185068e = i;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f185068e;
    }
}
