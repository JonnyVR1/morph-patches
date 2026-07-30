package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.svip.guide.SvipPrivilegeItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class keh0 extends jic0<Privilege> {

    /* JADX INFO: renamed from: c */
    public List<Privilege> f126184c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public PutongAct f126185d;

    public keh0(PutongAct putongAct) {
        this.f126185d = putongAct;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f126184c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f126185d.inflater().inflate(pec0.f151922L1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Privilege privilege, int i, int i2) {
        ((SvipPrivilegeItem) view).m57030b(privilege);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Privilege getItem(int i) {
        return this.f126184c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m149328G(ArrayList<Privilege> arrayList) {
        this.f126184c.clear();
        this.f126184c.addAll(arrayList);
        notifyDataSetChanged();
    }
}
