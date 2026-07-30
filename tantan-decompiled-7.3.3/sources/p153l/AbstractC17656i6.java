package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.TopicListItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.i6 */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC17656i6<T> extends jic0<T> {

    /* JADX INFO: renamed from: c */
    public final int f113120c = 0;

    /* JADX INFO: renamed from: d */
    public final int f113121d = 1;

    /* JADX INFO: renamed from: e */
    public final int f113122e = 2;

    /* JADX INFO: renamed from: f */
    public List<T> f113123f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public Act f113124g;

    /* JADX INFO: renamed from: h */
    public View f113125h;

    /* JADX INFO: renamed from: i */
    public Links f113126i;

    public AbstractC17656i6(Act act) {
        this.f113124g = act;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: A */
    public void mo29822A(View view, T t, int i, int i2) {
        if (i == 1) {
            m138791E();
        } else {
            if (i != 2) {
                return;
            }
            mo133940F(view, t);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        List<T> list = this.f113123f;
        if (list == null) {
            return 1;
        }
        return list.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return i != 2 ? new View(this.f113124g) : new TopicListItemView(this.f113124g);
        }
        if (this.f113125h == null) {
            this.f113125h = this.f113124g.inflater().inflate(tec0.f173796z, viewGroup, false);
        }
        return this.f113125h;
    }

    /* JADX INFO: renamed from: E */
    public void m138791E() {
        if (this.f113123f.size() <= 0 || !m138792G()) {
            this.f113125h.findViewById(hdc0.f108973w1).setVisibility(8);
            this.f113125h.findViewById(hdc0.f108875T1).setVisibility(0);
        } else {
            this.f113125h.findViewById(hdc0.f108973w1).setVisibility(0);
            this.f113125h.findViewById(hdc0.f108875T1).setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: F */
    public abstract void mo133940F(View view, T t);

    /* JADX INFO: renamed from: G */
    public boolean m138792G() {
        Links links = this.f113126i;
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: H */
    public void m138793H(pf60<Links, List<T>> pf60Var) {
        this.f113123f = new ArrayList(pf60Var.f152157b);
        this.f113126i = pf60Var.f152156a;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    public T getItem(int i) {
        if (i < this.f113123f.size()) {
            return this.f113123f.get(i);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f113123f.size() == 0) {
            return 0;
        }
        return i == this.f113123f.size() ? 1 : 2;
    }
}
