package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class w6c0 extends jic0<String> {

    /* JADX INFO: renamed from: c */
    public List<String> f187603c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public y20<Integer> f187604d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m205093H(int i, View view) {
        if (NullChecker.m82486a(this.f187604d)) {
            this.f187604d.call(Integer.valueOf(i));
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (NullChecker.m82486a(this.f187603c)) {
            return this.f187603c.size();
        }
        return 0;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        View viewInflate = View.inflate(viewGroup.getContext(), qec0.f156957V, null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(bnl0.f77545f, qa00.f156335v));
        return viewInflate;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, String str, int i, final int i2) {
        ((VText) view.findViewById(edc0.f93168A4)).setText(str);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.v6c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f182634a.m205093H(i2, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return (!NullChecker.m82486a(this.f187603c) || i < 0 || i >= this.f187603c.size()) ? "" : this.f187603c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m205096I(List<String> list) {
        this.f187603c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m205097J(y20<Integer> y20Var) {
        this.f187604d = y20Var;
    }
}
