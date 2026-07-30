package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class syb0 extends dac0<String> {

    /* JADX INFO: renamed from: c */
    public List<String> f166931c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public e30<Integer> f166932d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m186652H(int i, View view) {
        if (NullChecker.m81303a(this.f166932d)) {
            this.f166932d.call(Integer.valueOf(i));
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (NullChecker.m81303a(this.f166931c)) {
            return this.f166931c.size();
        }
        return 0;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        View viewInflate = View.inflate(viewGroup.getContext(), l6c0.f126401V, null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(xdl0.f192404f, t100.f167273v));
        return viewInflate;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, String str, int i, final int i2) {
        ((VText) view.findViewById(y4c0.f195933A4)).setText(str);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ryb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f161551a.m186652H(i2, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return (!NullChecker.m81303a(this.f166931c) || i < 0 || i >= this.f166931c.size()) ? "" : this.f166931c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m186655I(List<String> list) {
        this.f166931c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m186656J(e30<Integer> e30Var) {
        this.f166932d = e30Var;
    }
}
