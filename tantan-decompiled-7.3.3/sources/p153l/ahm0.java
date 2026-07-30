package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p051p1.mobile.putong.core.data.VisitorFilterType;
import com.p051p1.mobile.putong.core.data.VisitorSortType;
import com.p051p1.mobile.putong.core.p058ui.visitor.VisitorsFilterItemAgeView;
import com.p051p1.mobile.putong.core.p058ui.visitor.VisitorsFilterItemDefaultView;
import com.p051p1.mobile.putong.core.p058ui.visitor.VisitorsFilterItemDistanceView;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ahm0 extends jic0 {

    /* JADX INFO: renamed from: h */
    public static List<VisitorFilterType> f71374h = jyb.m147507f0(VisitorFilterType.get("all"), VisitorFilterType.get("match"), VisitorFilterType.get(VisitorFilterType.likeMe));

    /* JADX INFO: renamed from: i */
    public static List<VisitorSortType> f71375i = jyb.m147507f0(VisitorSortType.get("visitTime"), VisitorSortType.get("visitTimes"), VisitorSortType.get("distance"), VisitorSortType.get(VisitorSortType.realUser), VisitorSortType.get("newUser"));

    /* JADX INFO: renamed from: c */
    public final Act f71376c;

    /* JADX INFO: renamed from: d */
    public final VisitorFilterSettings f71377d;

    /* JADX INFO: renamed from: e */
    public int f71378e = 0;

    /* JADX INFO: renamed from: f */
    public VisitorSortType f71379f = VisitorSortType.get("visitTime");

    /* JADX INFO: renamed from: g */
    public VisitorFilterType f71380g = VisitorFilterType.get("all");

    public ahm0(Act act, @NonNull mam mamVar) {
        this.f71376c = act;
        this.f71377d = mamVar.mo59131a();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: A */
    public void mo29822A(View view, Object obj, int i, int i2) {
        if (i == 1) {
            ((VisitorsFilterItemAgeView) view).m58994b(this.f71377d);
            return;
        }
        if (i == 0) {
            ((VisitorsFilterItemDistanceView) view).m59007d(this.f71377d);
            return;
        }
        if (i == 2) {
            VisitorSortType visitorSortType = f71375i.get(i2);
            VisitorSortType visitorSortType2 = this.f71377d.sort;
            this.f71379f = visitorSortType2;
            ((VisitorsFilterItemDefaultView) view).m59003e(visitorSortType, visitorSortType2, new y20() { // from class: l.ygm0
                @Override // p153l.y20
                public final void call(Object obj2) {
                    this.f199849a.m97851G((VisitorSortType) obj2);
                }
            });
            return;
        }
        if (i == 3) {
            VisitorFilterType visitorFilterType = f71374h.get(i2);
            VisitorFilterType visitorFilterType2 = this.f71377d.filter;
            this.f71380g = visitorFilterType2;
            ((VisitorsFilterItemDefaultView) view).m59002d(visitorFilterType, visitorFilterType2, new y20() { // from class: l.zgm0
                @Override // p153l.y20
                public final void call(Object obj2) {
                    this.f204324a.m97852H((VisitorFilterType) obj2);
                }
            });
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        int i = this.f71378e;
        if (i == 2) {
            return f71375i.size();
        }
        if (i == 3) {
            return f71374h.size();
        }
        return (i == 1 || i == 0) ? 1 : 0;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return this.f71376c.inflater().inflate(pec0.f151980d2, viewGroup, false);
        }
        if (i == 3) {
            return this.f71376c.inflater().inflate(pec0.f151980d2, viewGroup, false);
        }
        if (i == 1) {
            return this.f71376c.inflater().inflate(pec0.f151976c2, viewGroup, false);
        }
        return i == 0 ? this.f71376c.inflater().inflate(pec0.f151984e2, viewGroup, false) : new View(this.f71376c);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m97851G(VisitorSortType visitorSortType) {
        this.f71379f = visitorSortType;
        this.f71377d.sort = visitorSortType;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m97852H(VisitorFilterType visitorFilterType) {
        this.f71380g = visitorFilterType;
        this.f71377d.filter = visitorFilterType;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I */
    public void m97853I(int i) {
        this.f71378e = i;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f71378e;
    }
}
