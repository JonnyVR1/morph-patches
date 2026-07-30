package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class mwe0 extends dac0<String> {

    /* JADX INFO: renamed from: c */
    public List<String> f136047c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public e30<Integer> f136048d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m156615I(int i, View view) {
        if (NullChecker.m81303a(this.f136048d)) {
            this.f136048d.call(Integer.valueOf(i));
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        List<String> list = this.f136047c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        View viewInflate = View.inflate(viewGroup.getContext(), t6c0.f168285b0, null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(xdl0.f192404f, t100.f167270s));
        return viewInflate;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, String str, int i, final int i2) {
        ((VText) view.findViewById(g5c0.f100699G6)).setText(str);
        view.findViewById(g5c0.f101073v0).setOnClickListener(new View.OnClickListener() { // from class: l.lwe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f130264a.m156615I(i2, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public List<String> m156617G() {
        return this.f136047c;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return this.f136047c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m156619J(List<String> list) {
        this.f136047c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m156620K(e30<Integer> e30Var) {
        this.f136048d = e30Var;
    }
}
