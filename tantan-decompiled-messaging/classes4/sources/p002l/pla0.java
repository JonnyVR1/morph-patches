package p002l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.data.Industries;
import com.p1.mobile.putong.core.profile.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e30;
import l.jq2;
import l.lqa;
import l.mcr;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pla0 extends jq2<vla0> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> f17487a;

    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> f17488b;

    public pla0(mcr mcrVar) {
        super(mcrVar);
        this.f17487a = new ArrayList<>();
        this.f17488b = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m20418j0(Bundle bundle) {
        m20424i0();
    }

    /* JADX INFO: renamed from: k0 */
    private boolean m20419k0() {
        List listT = lqa.t(false);
        if (vwb.J(listT)) {
            return false;
        }
        this.f17488b.clear();
        this.f17487a.clear();
        boolean zM24048u = ((vla0) ((jq2) this).viewModel).m24048u();
        for (int i = 0; i < listT.size(); i++) {
            Industries industries = (Industries) listT.get(i);
            if (!zM24048u || !TextUtils.equals(industries.name, "暂不透露")) {
                this.f17487a.add(industries.name);
                if (zM24048u) {
                    vwb.d0(industries.departments, new w9j() { // from class: l.ola0
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals((String) obj, "暂不透露"));
                        }
                    });
                }
                this.f17488b.put(industries.name, industries.departments);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public void m20420Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m20421a0() {
        super.a0();
        creates(new e30() { // from class: l.nla0
            public final void call(Object obj) {
                this.f16094a.m20418j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public List<String> m20422g0() {
        return this.f17487a;
    }

    /* JADX INFO: renamed from: h0 */
    public List<String> m20423h0(int i) {
        return (i < 0 || i >= this.f17487a.size()) ? new ArrayList() : this.f17488b.get(this.f17487a.get(i));
    }

    /* JADX INFO: renamed from: i0 */
    public void m20424i0() {
        ((vla0) ((jq2) this).viewModel).m24035A3(((LoopInputType) ((vla0) ((jq2) this).viewModel).m24051x().getSerializable("loop_input_type")).title);
        if (!m20419k0()) {
            ((vla0) ((jq2) this).viewModel).m24043I();
            return;
        }
        List<String> listM20422g0 = m20422g0();
        String string = ((vla0) ((jq2) this).viewModel).m24052y().m1991a2().m2043u0().profile.work.industry;
        if (((vla0) ((jq2) this).viewModel).m24052y().m1991a2().m2043u0().profile.studies.active) {
            string = ((vla0) ((jq2) this).viewModel).m24052y().getString(R.string.Q2);
        }
        if (TextUtils.isEmpty(string)) {
            ((vla0) ((jq2) this).viewModel).m24041G(-1);
            return;
        }
        int iIndexOf = listM20422g0.indexOf(string);
        vla0 vla0Var = (vla0) ((jq2) this).viewModel;
        if (iIndexOf == -1) {
            iIndexOf = 0;
        }
        vla0Var.m24041G(iIndexOf);
    }

    public void destroy() {
    }
}
