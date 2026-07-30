package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public class is3 extends jic0<nsb> {

    /* JADX INFO: renamed from: c */
    public List<nsb> f116624c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f116625d;

    /* JADX INFO: renamed from: e */
    public InterfaceC17788a f116626e;

    /* JADX INFO: renamed from: l.is3$a */
    public interface InterfaceC17788a {
        /* JADX INFO: renamed from: a */
        void mo141862a(nsb nsbVar);
    }

    public is3(Act act) {
        this.f116625d = act;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f116624c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f116625d.inflater().inflate(hec0.f109121l, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final nsb nsbVar, int i, int i2) {
        ((TextView) view.findViewById(wcc0.f188455m)).setText(nsbVar.f143478a);
        ((TextView) view.findViewById(wcc0.f188453l)).setText(Marker.ANY_NON_NULL_MARKER + nsbVar.f143479b);
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.hs3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f111405a.m141859H(nsbVar, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public nsb getItem(int i) {
        if (i < this.f116624c.size()) {
            return this.f116624c.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m141859H(nsb nsbVar, View view) {
        if (NullChecker.m82486a(this.f116626e)) {
            this.f116626e.mo141862a(nsbVar);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m141860I(List<nsb> list) {
        this.f116624c.clear();
        this.f116624c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m141861J(InterfaceC17788a interfaceC17788a) {
        this.f116626e = interfaceC17788a;
    }
}
