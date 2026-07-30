package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public class jr3 extends dac0<zqb> {

    /* JADX INFO: renamed from: c */
    public List<zqb> f119375c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f119376d;

    /* JADX INFO: renamed from: e */
    public InterfaceC17848a f119377e;

    /* JADX INFO: renamed from: l.jr3$a */
    public interface InterfaceC17848a {
        /* JADX INFO: renamed from: a */
        void mo142917a(zqb zqbVar);
    }

    public jr3(Act act) {
        this.f119376d = act;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f119375c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f119376d.inflater().inflate(c6c0.f79509l, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final zqb zqbVar, int i, int i2) {
        ((TextView) view.findViewById(q4c0.f152607m)).setText(zqbVar.f204371a);
        ((TextView) view.findViewById(q4c0.f152605l)).setText(Marker.ANY_NON_NULL_MARKER + zqbVar.f204372b);
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.ir3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f114583a.m142914H(zqbVar, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public zqb getItem(int i) {
        if (i < this.f119375c.size()) {
            return this.f119375c.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m142914H(zqb zqbVar, View view) {
        if (NullChecker.m81303a(this.f119377e)) {
            this.f119377e.mo142917a(zqbVar);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m142915I(List<zqb> list) {
        this.f119375c.clear();
        this.f119375c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m142916J(InterfaceC17848a interfaceC17848a) {
        this.f119377e = interfaceC17848a;
    }
}
