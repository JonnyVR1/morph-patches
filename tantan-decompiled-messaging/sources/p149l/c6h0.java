package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.svip.guide.SvipPrivilegeItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class c6h0 extends dac0<Privilege> {

    /* JADX INFO: renamed from: c */
    public List<Privilege> f79544c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public PutongAct f79545d;

    public c6h0(PutongAct putongAct) {
        this.f79545d = putongAct;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f79544c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f79545d.inflater().inflate(k6c0.f121314L1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, Privilege privilege, int i, int i2) {
        ((SvipPrivilegeItem) view).m55847b(privilege);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Privilege getItem(int i) {
        return this.f79544c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m105430G(ArrayList<Privilege> arrayList) {
        this.f79544c.clear();
        this.f79544c.addAll(arrayList);
        notifyDataSetChanged();
    }
}
