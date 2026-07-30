package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.base.data.BLivePkSuggestAnchor;
import com.p046p1.mobile.putong.live.base.data.BLivePkSuggestAnchors;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class d280 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public final bsm<?> f83335j;

    /* JADX INFO: renamed from: k */
    public final f30<BLivePkSuggestAnchor, BLivePkInviteSource> f83336k;

    /* JADX INFO: renamed from: l */
    public Pagination f83337l;

    /* JADX INFO: renamed from: m */
    public String f83338m;

    /* JADX INFO: renamed from: n */
    public final List<BLivePkSuggestAnchor> f83339n = new ArrayList();

    public d280(bsm<?> bsmVar, BLivePkSuggestAnchors bLivePkSuggestAnchors, f30<BLivePkSuggestAnchor, BLivePkInviteSource> f30Var) {
        this.f83335j = bsmVar;
        this.f83336k = f30Var;
        m109716l0(bLivePkSuggestAnchors);
    }

    /* JADX INFO: renamed from: f0 */
    public void m109710f0(BLivePkSuggestAnchors bLivePkSuggestAnchors) {
        this.f83337l = bLivePkSuggestAnchors.pagination;
        this.f83339n.addAll(bLivePkSuggestAnchors.anchors);
        m67371Z(m109712h0(bLivePkSuggestAnchors.type, this.f83339n));
    }

    /* JADX INFO: renamed from: g0 */
    public void m109711g0() {
        m67371Z(vwb.m200324f0(new d1q[0]));
    }

    /* JADX INFO: renamed from: h0 */
    public final List<e280> m109712h0(final String str, List<BLivePkSuggestAnchor> list) {
        return vwb.m200303Q(list, new w9j() { // from class: l.c280
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f78337a.m109715k0(str, (BLivePkSuggestAnchor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public Pagination m109713i0() {
        return this.f83337l;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m109714j0(String str) {
        return TextUtils.equals(str, this.f83338m);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ e280 m109715k0(String str, BLivePkSuggestAnchor bLivePkSuggestAnchor) {
        return new e280(this.f83335j, str, bLivePkSuggestAnchor, this.f83336k);
    }

    /* JADX INFO: renamed from: l0 */
    public void m109716l0(BLivePkSuggestAnchors bLivePkSuggestAnchors) {
        this.f83339n.clear();
        this.f83339n.addAll(bLivePkSuggestAnchors.anchors);
        this.f83337l = bLivePkSuggestAnchors.pagination;
        String str = bLivePkSuggestAnchors.type;
        this.f83338m = str;
        m67371Z(m109712h0(str, this.f83339n));
    }
}
