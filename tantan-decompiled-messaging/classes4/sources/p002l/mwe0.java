package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mwe0 extends dac0<String> {

    /* JADX INFO: renamed from: c */
    public List<String> f15724c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public e30<Integer> f15725d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m18295I(int i, View view) {
        if (NullChecker.a(this.f15725d)) {
            this.f15725d.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: C */
    public int m18297C() {
        List<String> list = this.f15724c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: D */
    public View m18298D(ViewGroup viewGroup, int i) {
        View viewInflate = View.inflate(viewGroup.getContext(), t6c0.f19781b0, null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(xdl0.f, t100.s));
        return viewInflate;
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m18296A(View view, String str, int i, final int i2) {
        view.findViewById(g5c0.f10849G6).setText(str);
        view.findViewById(g5c0.f11223v0).setOnClickListener(new View.OnClickListener() { // from class: l.lwe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15095a.m18295I(i2, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public List<String> m18300G() {
        return this.f15724c;
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return this.f15724c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m18302J(List<String> list) {
        this.f15724c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m18303K(e30<Integer> e30Var) {
        this.f15725d = e30Var;
    }
}
