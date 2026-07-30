package p153l;

import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkFriendInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class pv70 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: p */
    public static int f154265p = 1;

    /* JADX INFO: renamed from: q */
    public static int f154266q = 2;

    /* JADX INFO: renamed from: r */
    public static int f154267r = 3;

    /* JADX INFO: renamed from: s */
    public static int f154268s = 4;

    /* JADX INFO: renamed from: t */
    public static int f154269t = 5;

    /* JADX INFO: renamed from: j */
    public jw70 f154270j;

    /* JADX INFO: renamed from: k */
    public z20<BLiveAnchor, PkFriendInfo> f154271k;

    /* JADX INFO: renamed from: l */
    public int f154272l = 2;

    /* JADX INFO: renamed from: m */
    public pf60<PkFriendInfo, PkFriendInfo> f154273m;

    /* JADX INFO: renamed from: n */
    public x20 f154274n;

    /* JADX INFO: renamed from: o */
    public boolean f154275o;

    public pv70(jw70 jw70Var) {
        this.f154270j = jw70Var;
    }

    /* JADX INFO: renamed from: o0 */
    private void m173927o0() {
        this.f154270j.m147156x4(new y20() { // from class: l.nv70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143781a.m173935n0((PkFriendInfo) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter
    /* JADX INFO: renamed from: e */
    public void mo68560e(int i) {
        super.mo68560e(i);
        if (this.f154273m.f152156a.isHasNextPage() && i == this.f154273m.f152156a.anchors.size() - this.f154272l) {
            m173927o0();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public d3q<?> m173928g0() {
        return new h0q(this.f154275o, this.f154274n);
    }

    /* JADX INFO: renamed from: h0 */
    public final List<d3q<?>> m173929h0(final PkFriendInfo pkFriendInfo, List<BLiveAnchor> list, final boolean z, boolean z2) {
        final ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            jyb.m147537z(list, new y20() { // from class: l.ov70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f149234a.m173934m0(z, pkFriendInfo, arrayList, (BLiveAnchor) obj);
                }
            });
            return arrayList;
        }
        if (z2) {
            arrayList.add(new a0f().m95342I(z ? zrv.f205803e.getString(fct.f98270j) : zrv.f205803e.getString(fct.f98271k)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i0 */
    public final d3q<?> m173930i0(boolean z) {
        w0j0 w0j0Var = new w0j0();
        w0j0Var.m204202I(z ? zrv.f205803e.getString(fct.f98269i) : zrv.f205803e.getString(fct.f98272l));
        return w0j0Var;
    }

    /* JADX INFO: renamed from: j0 */
    public void m173931j0(Boolean bool) {
        this.f154275o = bool.booleanValue();
        d3q<?> d3qVar = m68538J().get(0);
        if (d3qVar == null || !(d3qVar instanceof h0q)) {
            return;
        }
        h0q h0qVar = (h0q) d3qVar;
        h0qVar.m133189I(bool.booleanValue());
        m68543O(h0qVar);
    }

    /* JADX INFO: renamed from: k0 */
    public List<d3q<?>> m173932k0(PkFriendInfo pkFriendInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m173930i0(false));
        arrayList.addAll(m173929h0(pkFriendInfo, pkFriendInfo.anchors, false, true));
        return arrayList;
    }

    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void m173935n0(PkFriendInfo pkFriendInfo) {
        this.f154273m.f152156a.contact(pkFriendInfo);
        ArrayList arrayList = new ArrayList(m173929h0(pkFriendInfo, pkFriendInfo.anchors, true, false));
        if (!pkFriendInfo.isHasNextPage()) {
            arrayList.addAll(m173932k0(this.f154273m.f152157b));
        }
        m68538J().addAll(arrayList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m173934m0(boolean z, PkFriendInfo pkFriendInfo, List list, BLiveAnchor bLiveAnchor) {
        if (z) {
            n9j n9jVar = new n9j(bLiveAnchor, pkFriendInfo);
            list.add(n9jVar);
            n9jVar.m161983I(this.f154271k);
        } else {
            y1h0 y1h0Var = new y1h0(bLiveAnchor, pkFriendInfo);
            y1h0Var.m213940I(this.f154271k);
            list.add(y1h0Var);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m173936p0(z20<BLiveAnchor, PkFriendInfo> z20Var) {
        this.f154271k = z20Var;
    }

    /* JADX INFO: renamed from: q0 */
    public void m173937q0(pf60<PkFriendInfo, PkFriendInfo> pf60Var) {
        this.f154273m = pf60Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m173928g0());
        arrayList.add(m173930i0(true));
        PkFriendInfo pkFriendInfo = pf60Var.f152156a;
        arrayList.addAll(m173929h0(pkFriendInfo, pkFriendInfo.anchors, true, true));
        if (!pf60Var.f152156a.isHasNextPage()) {
            arrayList.addAll(m173932k0(this.f154273m.f152157b));
        }
        m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: r0 */
    public void m173938r0(x20 x20Var) {
        this.f154274n = x20Var;
    }
}
