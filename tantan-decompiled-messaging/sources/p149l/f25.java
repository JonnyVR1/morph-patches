package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class f25 extends dac0<String> {

    /* JADX INFO: renamed from: c */
    public final VRecyclerView f94146c;

    /* JADX INFO: renamed from: d */
    public final e30<String> f94147d;

    /* JADX INFO: renamed from: e */
    public final Act f94148e;

    /* JADX INFO: renamed from: f */
    public List<String> f94149f = new ArrayList();

    public f25(Act act, VRecyclerView vRecyclerView, e30<String> e30Var) {
        this.f94148e = act;
        this.f94146c = vRecyclerView;
        this.f94147d = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m119156H(String str, View view) {
        this.f94147d.call(str);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f94149f.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f94148e.inflater().inflate(t6c0.f168311d0, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, String str, int i, int i2) {
        final String item = getItem(i2);
        ((TextView) view).setText(item);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.e25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f88881a.m119156H(item, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return this.f94149f.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m119159I(List<String> list) {
        xdl0.m208344M(this.f94146c, !list.isEmpty());
        this.f94149f = list;
        notifyDataSetChanged();
    }
}
