package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.Industries;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.profile.R$string;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class pla0 extends jq2<vla0> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> f150085a;

    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> f150086b;

    public pla0(mcr mcrVar) {
        super(mcrVar);
        this.f150085a = new ArrayList<>();
        this.f150086b = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m170114j0(Bundle bundle) {
        m170118i0();
    }

    /* JADX INFO: renamed from: k0 */
    private boolean m170115k0() {
        List<Industries> listM150982t = lqa.m150982t(false);
        if (vwb.m200296J(listM150982t)) {
            return false;
        }
        this.f150086b.clear();
        this.f150085a.clear();
        boolean zM198786u = ((vla0) this.viewModel).m198786u();
        for (int i = 0; i < listM150982t.size(); i++) {
            Industries industries = listM150982t.get(i);
            if (!zM198786u || !TextUtils.equals(industries.name, "暂不透露")) {
                this.f150085a.add(industries.name);
                if (zM198786u) {
                    vwb.m200320d0(industries.departments, new w9j() { // from class: l.ola0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals((String) obj, "暂不透露"));
                        }
                    });
                }
                this.f150086b.put(industries.name, industries.departments);
            }
        }
        return true;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.nla0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139513a.m170114j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public List<String> m170116g0() {
        return this.f150085a;
    }

    /* JADX INFO: renamed from: h0 */
    public List<String> m170117h0(int i) {
        return (i < 0 || i >= this.f150085a.size()) ? new ArrayList() : this.f150086b.get(this.f150085a.get(i));
    }

    /* JADX INFO: renamed from: i0 */
    public void m170118i0() {
        ((vla0) this.viewModel).m198775A3(((LoopInputType) ((vla0) this.viewModel).m198789x().getSerializable("loop_input_type")).title);
        if (!m170115k0()) {
            ((vla0) this.viewModel).m198782I();
            return;
        }
        List<String> listM170116g0 = m170116g0();
        String string = ((vla0) this.viewModel).m198790y().m51509a2().m51559u0().profile.work.industry;
        if (((vla0) this.viewModel).m198790y().m51509a2().m51559u0().profile.studies.active) {
            string = ((vla0) this.viewModel).m198790y().getString(R$string.f27768Q2);
        }
        if (TextUtils.isEmpty(string)) {
            ((vla0) this.viewModel).m198780G(-1);
            return;
        }
        int iIndexOf = listM170116g0.indexOf(string);
        vla0 vla0Var = (vla0) this.viewModel;
        if (iIndexOf == -1) {
            iIndexOf = 0;
        }
        vla0Var.m198780G(iIndexOf);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
