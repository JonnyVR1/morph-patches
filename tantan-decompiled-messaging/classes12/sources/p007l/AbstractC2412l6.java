package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.TopicListItemView;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.dac0;
import l.j760;

/* JADX INFO: renamed from: l.l6 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class AbstractC2412l6<T> extends dac0<T> {

    /* JADX INFO: renamed from: c */
    public final int f9895c = 0;

    /* JADX INFO: renamed from: d */
    public final int f9896d = 1;

    /* JADX INFO: renamed from: e */
    public final int f9897e = 2;

    /* JADX INFO: renamed from: f */
    public List<T> f9898f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public Act f9899g;

    /* JADX INFO: renamed from: h */
    public View f9900h;

    /* JADX INFO: renamed from: i */
    public Links f9901i;

    public AbstractC2412l6(Act act) {
        this.f9899g = act;
    }

    /* JADX INFO: renamed from: A */
    public void mo9590A(View view, T t, int i, int i2) {
        if (i == 1) {
            m11558E();
        } else {
            if (i != 2) {
                return;
            }
            mo9592F(view, t);
        }
    }

    /* JADX INFO: renamed from: C */
    public int m11557C() {
        List<T> list = this.f9898f;
        if (list == null) {
            return 1;
        }
        return list.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View mo9591D(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return i != 2 ? new View(this.f9899g) : new TopicListItemView(this.f9899g);
        }
        if (this.f9900h == null) {
            this.f9900h = this.f9899g.inflater().inflate(o6c0.f11346z, viewGroup, false);
        }
        return this.f9900h;
    }

    /* JADX INFO: renamed from: E */
    public void m11558E() {
        if (this.f9898f.size() <= 0 || !m11559G()) {
            this.f9900h.findViewById(b5c0.f6101w1).setVisibility(8);
            this.f9900h.findViewById(b5c0.f6003T1).setVisibility(0);
        } else {
            this.f9900h.findViewById(b5c0.f6101w1).setVisibility(0);
            this.f9900h.findViewById(b5c0.f6003T1).setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: F */
    public abstract void mo9592F(View view, T t);

    /* JADX INFO: renamed from: G */
    public boolean m11559G() {
        Links links = this.f9901i;
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: H */
    public void m11560H(j760<Links, List<T>> j760Var) {
        this.f9898f = new ArrayList((Collection) j760Var.b);
        this.f9901i = (Links) j760Var.a;
        notifyDataSetChanged();
    }

    public T getItem(int i) {
        if (i < this.f9898f.size()) {
            return this.f9898f.get(i);
        }
        return null;
    }

    public int getItemViewType(int i) {
        if (this.f9898f.size() == 0) {
            return 0;
        }
        return i == this.f9898f.size() ? 1 : 2;
    }
}
