package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.Industries;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.profile.R$string;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class tta0 extends ar2<zta0> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> f176064a;

    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> f176065b;

    public tta0(ner nerVar) {
        super(nerVar);
        this.f176064a = new ArrayList<>();
        this.f176065b = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m192659j0(Bundle bundle) {
        m192663i0();
    }

    /* JADX INFO: renamed from: k0 */
    private boolean m192660k0() {
        List<Industries> listM212801t = xra.m212801t(false);
        if (jyb.m147479J(listM212801t)) {
            return false;
        }
        this.f176065b.clear();
        this.f176064a.clear();
        boolean zM221478u = ((zta0) this.viewModel).m221478u();
        for (int i = 0; i < listM212801t.size(); i++) {
            Industries industries = listM212801t.get(i);
            if (!zM221478u || !TextUtils.equals(industries.name, "暂不透露")) {
                this.f176064a.add(industries.name);
                if (zM221478u) {
                    jyb.m147503d0(industries.departments, new qcj() { // from class: l.sta0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals((String) obj, "暂不透露"));
                        }
                    });
                }
                this.f176065b.put(industries.name, industries.departments);
            }
        }
        return true;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.rta0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164797a.m192659j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public List<String> m192661g0() {
        return this.f176064a;
    }

    /* JADX INFO: renamed from: h0 */
    public List<String> m192662h0(int i) {
        return (i < 0 || i >= this.f176064a.size()) ? new ArrayList() : this.f176065b.get(this.f176064a.get(i));
    }

    /* JADX INFO: renamed from: i0 */
    public void m192663i0() {
        ((zta0) this.viewModel).m221467A3(((LoopInputType) ((zta0) this.viewModel).m221481x().getSerializable("loop_input_type")).title);
        if (!m192660k0()) {
            ((zta0) this.viewModel).m221474I();
            return;
        }
        List<String> listM192661g0 = m192661g0();
        String string = ((zta0) this.viewModel).m221482y().m52692b2().m52742u0().profile.work.industry;
        if (((zta0) this.viewModel).m221482y().m52692b2().m52742u0().profile.studies.active) {
            string = ((zta0) this.viewModel).m221482y().getString(R$string.f28616Q2);
        }
        if (TextUtils.isEmpty(string)) {
            ((zta0) this.viewModel).m221472G(-1);
            return;
        }
        int iIndexOf = listM192661g0.indexOf(string);
        zta0 zta0Var = (zta0) this.viewModel;
        if (iIndexOf == -1) {
            iIndexOf = 0;
        }
        zta0Var.m221472G(iIndexOf);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
