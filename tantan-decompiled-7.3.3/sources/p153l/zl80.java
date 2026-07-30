package p153l;

import com.immomo.velib.anim.model.PostProcessingModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class zl80 extends ngk {

    /* JADX INFO: renamed from: I */
    private HashMap<String, String> f204885I = new HashMap<>(8);

    /* JADX INFO: renamed from: J */
    private List<i3m> f204886J = new ArrayList(8);

    /* JADX INFO: renamed from: K */
    private it2 f204887K;

    /* JADX INFO: renamed from: L */
    private jre f204888L;

    public zl80(List<PostProcessingModel> list, boolean z, jre jreVar) {
        this.f204888L = jreVar;
        m220171W();
        if (z && list != null && !list.isEmpty()) {
            m220169U(list);
            return;
        }
        rv40 rv40Var = new rv40();
        rv40Var.m125376H(this);
        m162986R(rv40Var);
        m162987S(rv40Var);
        this.f204887K = rv40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    private void m220169U(List<PostProcessingModel> list) {
        try {
            for (PostProcessingModel postProcessingModel : list) {
                String str = this.f204885I.get(postProcessingModel.getFilterName());
                if (str != null && str.length() > 0) {
                    i3m i3mVar = (i3m) Class.forName(str).newInstance();
                    i3mVar.mo98815d(postProcessingModel.getParams());
                    this.f204886J.add(i3mVar);
                    m220170V((it2) i3mVar);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: V */
    private void m220170V(it2 it2Var) {
        it2 it2Var2 = this.f204887K;
        if (it2Var2 == null) {
            it2Var.m125376H(this);
            m162986R(it2Var);
            m162987S(it2Var);
            this.f204887K = it2Var;
            return;
        }
        it2Var2.m125381O(this);
        this.f204887K.m125376H(it2Var);
        it2 it2Var3 = this.f204887K;
        it2Var.f116785D = it2Var3;
        m162988T(it2Var3);
        m162985Q(this.f204887K);
        this.f204887K = it2Var;
        it2Var.m125376H(this);
        m162987S(this.f204887K);
    }

    /* JADX INFO: renamed from: W */
    private void m220171W() {
        this.f204885I.put("saturation", am80.class.getName());
        this.f204885I.put("contrast", yl80.class.getName());
        this.f204885I.put("usm", bm80.class.getName());
    }

    /* JADX INFO: renamed from: f */
    public void m220172f(String str) {
        Iterator<i3m> it = this.f204886J.iterator();
        while (it.hasNext()) {
            it.next().mo98816f(str);
        }
    }

    @Override // p153l.ngk, p153l.ffj, p153l.vej
    /* JADX INFO: renamed from: i */
    public synchronized void mo97355i() {
        super.mo97355i();
        this.f204885I.clear();
        this.f204886J.clear();
    }
}
