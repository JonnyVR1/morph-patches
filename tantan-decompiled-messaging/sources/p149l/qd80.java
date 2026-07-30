package p149l;

import com.immomo.velib.anim.model.PostProcessingModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class qd80 extends xdk {

    /* JADX INFO: renamed from: I */
    private HashMap<String, String> f153894I = new HashMap<>(8);

    /* JADX INFO: renamed from: J */
    private List<o0m> f153895J = new ArrayList(8);

    /* JADX INFO: renamed from: K */
    private ss2 f153896K;

    /* JADX INFO: renamed from: L */
    private fqe f153897L;

    public qd80(List<PostProcessingModel> list, boolean z, fqe fqeVar) {
        this.f153897L = fqeVar;
        m173998W();
        if (z && list != null && !list.isEmpty()) {
            m173996U(list);
            return;
        }
        dn40 dn40Var = new dn40();
        dn40Var.m149300H(this);
        m208317R(dn40Var);
        m208318S(dn40Var);
        this.f153896K = dn40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    private void m173996U(List<PostProcessingModel> list) {
        try {
            for (PostProcessingModel postProcessingModel : list) {
                String str = this.f153894I.get(postProcessingModel.getFilterName());
                if (str != null && str.length() > 0) {
                    o0m o0mVar = (o0m) Class.forName(str).newInstance();
                    o0mVar.mo162155d(postProcessingModel.getParams());
                    this.f153895J.add(o0mVar);
                    m173997V((ss2) o0mVar);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: V */
    private void m173997V(ss2 ss2Var) {
        ss2 ss2Var2 = this.f153896K;
        if (ss2Var2 == null) {
            ss2Var.m149300H(this);
            m208317R(ss2Var);
            m208318S(ss2Var);
            this.f153896K = ss2Var;
            return;
        }
        ss2Var2.m149305O(this);
        this.f153896K.m149300H(ss2Var);
        ss2 ss2Var3 = this.f153896K;
        ss2Var.f166156D = ss2Var3;
        m208319T(ss2Var3);
        m208316Q(this.f153896K);
        this.f153896K = ss2Var;
        ss2Var.m149300H(this);
        m208318S(this.f153896K);
    }

    /* JADX INFO: renamed from: W */
    private void m173998W() {
        this.f153894I.put("saturation", rd80.class.getName());
        this.f153894I.put("contrast", pd80.class.getName());
        this.f153894I.put("usm", sd80.class.getName());
    }

    /* JADX INFO: renamed from: f */
    public void m173999f(String str) {
        Iterator<o0m> it = this.f153895J.iterator();
        while (it.hasNext()) {
            it.next().mo162156f(str);
        }
    }

    @Override // p149l.xdk, p149l.lcj, p149l.bcj
    /* JADX INFO: renamed from: i */
    public synchronized void mo95685i() {
        super.mo95685i();
        this.f153894I.clear();
        this.f153895J.clear();
    }
}
