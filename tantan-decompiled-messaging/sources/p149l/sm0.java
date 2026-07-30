package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserFrag;
import com.p046p1.mobile.putong.core.p053ui.likedusers.anchor.AnchorLikedUserItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class sm0 extends dac0<tm0> {

    /* JADX INFO: renamed from: c */
    public List<tm0> f165311c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public ehr f165312d;

    /* JADX INFO: renamed from: e */
    public LikedUserFrag f165313e;

    public sm0(LikedUserFrag likedUserFrag) {
        this.f165312d = likedUserFrag.m46784S4();
        this.f165313e = likedUserFrag;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f165311c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f165312d.act().inflater().inflate(k6c0.f121369d, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, tm0 tm0Var, int i, int i2) {
        ((AnchorLikedUserItemView) view).m46806g(tm0Var);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public tm0 getItem(int i) {
        return this.f165311c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m184900G(List<tm0> list) {
        this.f165311c.clear();
        if (!vwb.m200296J(list)) {
            this.f165311c.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        super.mo47327e(i);
        if (!this.f165311c.isEmpty() && i == this.f165311c.size() - 3 && Network.isConnected(this.f165312d.act())) {
            this.f165312d.m116552a1();
        }
    }
}
