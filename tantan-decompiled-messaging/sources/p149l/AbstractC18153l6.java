package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.TopicListItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.l6 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC18153l6<T> extends dac0<T> {

    /* JADX INFO: renamed from: c */
    public final int f126218c = 0;

    /* JADX INFO: renamed from: d */
    public final int f126219d = 1;

    /* JADX INFO: renamed from: e */
    public final int f126220e = 2;

    /* JADX INFO: renamed from: f */
    public List<T> f126221f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public Act f126222g;

    /* JADX INFO: renamed from: h */
    public View f126223h;

    /* JADX INFO: renamed from: i */
    public Links f126224i;

    public AbstractC18153l6(Act act) {
        this.f126222g = act;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: A */
    public void mo28823A(View view, T t, int i, int i2) {
        if (i == 1) {
            m148682E();
        } else {
            if (i != 2) {
                return;
            }
            mo114120F(view, t);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        List<T> list = this.f126221f;
        if (list == null) {
            return 1;
        }
        return list.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return i != 2 ? new View(this.f126222g) : new TopicListItemView(this.f126222g);
        }
        if (this.f126223h == null) {
            this.f126223h = this.f126222g.inflater().inflate(o6c0.f142327z, viewGroup, false);
        }
        return this.f126223h;
    }

    /* JADX INFO: renamed from: E */
    public void m148682E() {
        if (this.f126221f.size() <= 0 || !m148683G()) {
            this.f126223h.findViewById(b5c0.f73620w1).setVisibility(8);
            this.f126223h.findViewById(b5c0.f73522T1).setVisibility(0);
        } else {
            this.f126223h.findViewById(b5c0.f73620w1).setVisibility(0);
            this.f126223h.findViewById(b5c0.f73522T1).setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: F */
    public abstract void mo114120F(View view, T t);

    /* JADX INFO: renamed from: G */
    public boolean m148683G() {
        Links links = this.f126224i;
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: H */
    public void m148684H(j760<Links, List<T>> j760Var) {
        this.f126221f = new ArrayList(j760Var.f116565b);
        this.f126224i = j760Var.f116564a;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    public T getItem(int i) {
        if (i < this.f126221f.size()) {
            return this.f126221f.get(i);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f126221f.size() == 0) {
            return 0;
        }
        return i == this.f126221f.size() ? 1 : 2;
    }
}
