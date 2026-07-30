package p006l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p004ui.visitor.VisitorsFilterItemAgeView;
import com.p000p1.mobile.putong.core.p004ui.visitor.VisitorsFilterItemDefaultView;
import com.p000p1.mobile.putong.core.p004ui.visitor.VisitorsFilterItemDistanceView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p1.mobile.putong.core.data.VisitorFilterType;
import com.p1.mobile.putong.core.data.VisitorSortType;
import java.util.List;
import l.dac0;
import l.e30;
import l.k6c0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class w7m0 extends dac0 {

    /* JADX INFO: renamed from: h */
    public static List<VisitorFilterType> f25020h = vwb.f0(new VisitorFilterType[]{VisitorFilterType.get("all"), VisitorFilterType.get("match"), VisitorFilterType.get("likeMe")});

    /* JADX INFO: renamed from: i */
    public static List<VisitorSortType> f25021i = vwb.f0(new VisitorSortType[]{VisitorSortType.get("visitTime"), VisitorSortType.get("visitTimes"), VisitorSortType.get("distance"), VisitorSortType.get("realUser"), VisitorSortType.get("newUser")});

    /* JADX INFO: renamed from: c */
    public final Act f25022c;

    /* JADX INFO: renamed from: d */
    public final VisitorFilterSettings f25023d;

    /* JADX INFO: renamed from: e */
    public int f25024e = 0;

    /* JADX INFO: renamed from: f */
    public VisitorSortType f25025f = VisitorSortType.get("visitTime");

    /* JADX INFO: renamed from: g */
    public VisitorFilterType f25026g = VisitorFilterType.get("all");

    public w7m0(Act act, @NonNull w7m w7mVar) {
        this.f25022c = act;
        this.f25023d = w7mVar.mo11463a();
    }

    /* JADX INFO: renamed from: A */
    public void m26233A(View view, Object obj, int i, int i2) {
        if (i == 1) {
            ((VisitorsFilterItemAgeView) view).m11312b(this.f25023d);
            return;
        }
        if (i == 0) {
            ((VisitorsFilterItemDistanceView) view).m11329d(this.f25023d);
            return;
        }
        if (i == 2) {
            VisitorSortType visitorSortType = f25021i.get(i2);
            VisitorSortType visitorSortType2 = this.f25023d.sort;
            this.f25025f = visitorSortType2;
            ((VisitorsFilterItemDefaultView) view).m11325e(visitorSortType, visitorSortType2, new e30() { // from class: l.u7m0
                public final void call(Object obj2) {
                    this.f23424a.m26236G((VisitorSortType) obj2);
                }
            });
            return;
        }
        if (i == 3) {
            VisitorFilterType visitorFilterType = f25020h.get(i2);
            VisitorFilterType visitorFilterType2 = this.f25023d.filter;
            this.f25026g = visitorFilterType2;
            ((VisitorsFilterItemDefaultView) view).m11324d(visitorFilterType, visitorFilterType2, new e30() { // from class: l.v7m0
                public final void call(Object obj2) {
                    this.f24208a.m26237H((VisitorFilterType) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: C */
    public int m26234C() {
        int i = this.f25024e;
        if (i == 2) {
            return f25021i.size();
        }
        if (i == 3) {
            return f25020h.size();
        }
        return (i == 1 || i == 0) ? 1 : 0;
    }

    /* JADX INFO: renamed from: D */
    public View m26235D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return this.f25022c.inflater().inflate(k6c0.d2, viewGroup, false);
        }
        if (i == 3) {
            return this.f25022c.inflater().inflate(k6c0.d2, viewGroup, false);
        }
        if (i == 1) {
            return this.f25022c.inflater().inflate(k6c0.c2, viewGroup, false);
        }
        return i == 0 ? this.f25022c.inflater().inflate(k6c0.e2, viewGroup, false) : new View(this.f25022c);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m26236G(VisitorSortType visitorSortType) {
        this.f25025f = visitorSortType;
        this.f25023d.sort = visitorSortType;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m26237H(VisitorFilterType visitorFilterType) {
        this.f25026g = visitorFilterType;
        this.f25023d.filter = visitorFilterType;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I */
    public void m26238I(int i) {
        this.f25024e = i;
        notifyDataSetChanged();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public int getItemViewType(int i) {
        return this.f25024e;
    }
}
