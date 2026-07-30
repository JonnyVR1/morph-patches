package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.base.data.BLivePkSuggestAnchor;
import com.p051p1.mobile.putong.live.base.data.BLivePkSuggestAnchors;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ja80 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public final dum<?> f118956j;

    /* JADX INFO: renamed from: k */
    public final z20<BLivePkSuggestAnchor, BLivePkInviteSource> f118957k;

    /* JADX INFO: renamed from: l */
    public Pagination f118958l;

    /* JADX INFO: renamed from: m */
    public String f118959m;

    /* JADX INFO: renamed from: n */
    public final List<BLivePkSuggestAnchor> f118960n = new ArrayList();

    public ja80(dum<?> dumVar, BLivePkSuggestAnchors bLivePkSuggestAnchors, z20<BLivePkSuggestAnchor, BLivePkInviteSource> z20Var) {
        this.f118956j = dumVar;
        this.f118957k = z20Var;
        m144011l0(bLivePkSuggestAnchors);
    }

    /* JADX INFO: renamed from: f0 */
    public void m144005f0(BLivePkSuggestAnchors bLivePkSuggestAnchors) {
        this.f118958l = bLivePkSuggestAnchors.pagination;
        this.f118960n.addAll(bLivePkSuggestAnchors.anchors);
        m68554Z(m144007h0(bLivePkSuggestAnchors.type, this.f118960n));
    }

    /* JADX INFO: renamed from: g0 */
    public void m144006g0() {
        m68554Z(jyb.m147507f0(new d3q[0]));
    }

    /* JADX INFO: renamed from: h0 */
    public final List<ka80> m144007h0(final String str, List<BLivePkSuggestAnchor> list) {
        return jyb.m147486Q(list, new qcj() { // from class: l.ia80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f113565a.m144010k0(str, (BLivePkSuggestAnchor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public Pagination m144008i0() {
        return this.f118958l;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m144009j0(String str) {
        return TextUtils.equals(str, this.f118959m);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ ka80 m144010k0(String str, BLivePkSuggestAnchor bLivePkSuggestAnchor) {
        return new ka80(this.f118956j, str, bLivePkSuggestAnchor, this.f118957k);
    }

    /* JADX INFO: renamed from: l0 */
    public void m144011l0(BLivePkSuggestAnchors bLivePkSuggestAnchors) {
        this.f118960n.clear();
        this.f118960n.addAll(bLivePkSuggestAnchors.anchors);
        this.f118958l = bLivePkSuggestAnchors.pagination;
        String str = bLivePkSuggestAnchors.type;
        this.f118959m = str;
        m68554Z(m144007h0(str, this.f118960n));
    }
}
