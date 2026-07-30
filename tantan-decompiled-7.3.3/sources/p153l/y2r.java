package p153l;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVOrder;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvAlreadyChooseSongPageView;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class y2r implements iam<f3r> {

    /* JADX INFO: renamed from: a */
    public final KtvAlreadyChooseSongPageView f197276a;

    /* JADX INFO: renamed from: b */
    public k2r f197277b;

    /* JADX INFO: renamed from: c */
    public f3r<rwn0, y2r> f197278c;

    public y2r(Act act) {
        this.f197276a = KtvAlreadyChooseSongPageView.m78216i0(act.getLayoutInflater());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f197276a.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(f3r f3rVar) {
        this.f197278c = f3rVar;
    }

    /* JADX INFO: renamed from: b */
    public View m214093b() {
        return this.f197276a;
    }

    /* JADX INFO: renamed from: c */
    public void m214094c() {
        this.f197276a.f53224f.setVisibility(0);
        this.f197276a.f53223e.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public void m214095d(List<BLiveVoiceKTVOrder> list) {
        this.f197276a.f53224f.setVisibility(8);
        this.f197276a.f53223e.setVisibility(0);
        this.f197277b.m147994G(list);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        boolean z = this.f197278c.m213810E2().m183411P2().m136879r().m97111G(zrv.f205799a.m207631D0()).isManager || this.f197278c.m213810E2().mo118373p();
        Act act = getAct();
        final f3r<rwn0, y2r> f3rVar = this.f197278c;
        Objects.requireNonNull(f3rVar);
        k2r k2rVar = new k2r(act, new y20() { // from class: l.x2r
            @Override // p153l.y20
            public final void call(Object obj) {
                f3rVar.m123783b4((Pair) obj);
            }
        }, z);
        this.f197277b = k2rVar;
        this.f197276a.setAdapter(k2rVar);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
