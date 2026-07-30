package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class syb0 extends dac0<String> {

    /* JADX INFO: renamed from: c */
    public List<String> f7485c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public e30<Integer> f7486d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m9497H(int i, View view) {
        if (NullChecker.a(this.f7486d)) {
            this.f7486d.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: C */
    public int m9499C() {
        if (NullChecker.a(this.f7485c)) {
            return this.f7485c.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public View m9500D(ViewGroup viewGroup, int i) {
        View viewInflate = View.inflate(viewGroup.getContext(), l6c0.f5910V, null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(xdl0.f, t100.v));
        return viewInflate;
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m9498A(View view, String str, int i, final int i2) {
        view.findViewById(y4c0.f8650A4).setText(str);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ryb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f7255a.m9497H(i2, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return (!NullChecker.a(this.f7485c) || i < 0 || i >= this.f7485c.size()) ? "" : this.f7485c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m9503I(List<String> list) {
        this.f7485c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m9504J(e30<Integer> e30Var) {
        this.f7486d = e30Var;
    }
}
