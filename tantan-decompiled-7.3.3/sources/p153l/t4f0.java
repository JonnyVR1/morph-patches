package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class t4f0 extends jic0<String> {

    /* JADX INFO: renamed from: c */
    public List<String> f172065c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public y20<Integer> f172066d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m189262I(int i, View view) {
        if (NullChecker.m82486a(this.f172066d)) {
            this.f172066d.call(Integer.valueOf(i));
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        List<String> list = this.f172065c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        View viewInflate = View.inflate(viewGroup.getContext(), yec0.f199017b0, null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(bnl0.f77545f, qa00.f156332s));
        return viewInflate;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, String str, int i, final int i2) {
        ((VText) view.findViewById(mdc0.f135944G6)).setText(str);
        view.findViewById(mdc0.f136318v0).setOnClickListener(new View.OnClickListener() { // from class: l.s4f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f166231a.m189262I(i2, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public List<String> m189264G() {
        return this.f172065c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return this.f172065c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m189266J(List<String> list) {
        this.f172065c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m189267K(y20<Integer> y20Var) {
        this.f172066d = y20Var;
    }
}
