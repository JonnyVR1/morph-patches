package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Conversation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ej0 extends jic0<Conversation> {

    /* JADX INFO: renamed from: c */
    public List<Conversation> f94235c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f94236d = 0;

    /* JADX INFO: renamed from: e */
    public Act f94237e;

    public ej0(Act act) {
        this.f94237e = act;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f94235c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f94237e.inflater().inflate(kec0.f125400F, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Conversation conversation, int i, int i2) {
        if (view instanceof cj0) {
            ((cj0) view).mo41550a(this, conversation, i2, false);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        return this.f94235c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m120953G(List<Conversation> list) {
        this.f94235c = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f94236d;
    }
}
