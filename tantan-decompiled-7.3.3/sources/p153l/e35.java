package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class e35 extends jic0<String> {

    /* JADX INFO: renamed from: c */
    public final VRecyclerView f91924c;

    /* JADX INFO: renamed from: d */
    public final y20<String> f91925d;

    /* JADX INFO: renamed from: e */
    public final Act f91926e;

    /* JADX INFO: renamed from: f */
    public List<String> f91927f = new ArrayList();

    public e35(Act act, VRecyclerView vRecyclerView, y20<String> y20Var) {
        this.f91926e = act;
        this.f91924c = vRecyclerView;
        this.f91925d = y20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m119249H(String str, View view) {
        this.f91925d.call(str);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f91927f.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f91926e.inflater().inflate(yec0.f199043d0, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, String str, int i, int i2) {
        final String item = getItem(i2);
        ((TextView) view).setText(item);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.d35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f84852a.m119249H(item, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return this.f91927f.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m119252I(List<String> list) {
        bnl0.m105524M(this.f91924c, !list.isEmpty());
        this.f91927f = list;
        notifyDataSetChanged();
    }
}
