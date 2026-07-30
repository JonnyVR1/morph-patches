package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.likedusers.LikedUserFrag;
import com.p000p1.mobile.putong.core.p001ui.likedusers.anchor.AnchorLikedUserItemView;
import com.p1.mobile.putong.api.api.Network;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.k6c0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sm0 extends dac0<tm0> {

    /* JADX INFO: renamed from: c */
    public List<tm0> f13003c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public ehr f13004d;

    /* JADX INFO: renamed from: e */
    public LikedUserFrag f13005e;

    public sm0(LikedUserFrag likedUserFrag) {
        this.f13004d = likedUserFrag.m456S4();
        this.f13005e = likedUserFrag;
    }

    /* JADX INFO: renamed from: C */
    public int m14256C() {
        return this.f13003c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m14257D(ViewGroup viewGroup, int i) {
        return this.f13004d.act().inflater().inflate(k6c0.d, viewGroup, false);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m14255A(View view, tm0 tm0Var, int i, int i2) {
        ((AnchorLikedUserItemView) view).m481g(tm0Var);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public tm0 getItem(int i) {
        return this.f13003c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m14260G(List<tm0> list) {
        this.f13003c.clear();
        if (!vwb.J(list)) {
            this.f13003c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e */
    public void m14261e(int i) {
        super.e(i);
        if (!this.f13003c.isEmpty() && i == this.f13003c.size() - 3 && Network.isConnected(this.f13004d.act())) {
            this.f13004d.m9884a1();
        }
    }
}
