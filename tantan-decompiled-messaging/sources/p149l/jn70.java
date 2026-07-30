package p149l;

import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkFriendInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class jn70 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: p */
    public static int f118825p = 1;

    /* JADX INFO: renamed from: q */
    public static int f118826q = 2;

    /* JADX INFO: renamed from: r */
    public static int f118827r = 3;

    /* JADX INFO: renamed from: s */
    public static int f118828s = 4;

    /* JADX INFO: renamed from: t */
    public static int f118829t = 5;

    /* JADX INFO: renamed from: j */
    public do70 f118830j;

    /* JADX INFO: renamed from: k */
    public f30<BLiveAnchor, PkFriendInfo> f118831k;

    /* JADX INFO: renamed from: l */
    public int f118832l = 2;

    /* JADX INFO: renamed from: m */
    public j760<PkFriendInfo, PkFriendInfo> f118833m;

    /* JADX INFO: renamed from: n */
    public d30 f118834n;

    /* JADX INFO: renamed from: o */
    public boolean f118835o;

    public jn70(do70 do70Var) {
        this.f118830j = do70Var;
    }

    /* JADX INFO: renamed from: o0 */
    private void m142358o0() {
        this.f118830j.m112740x4(new e30() { // from class: l.hn70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108588a.m142366n0((PkFriendInfo) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter
    /* JADX INFO: renamed from: e */
    public void mo67377e(int i) {
        super.mo67377e(i);
        if (this.f118833m.f116564a.isHasNextPage() && i == this.f118833m.f116564a.anchors.size() - this.f118832l) {
            m142358o0();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public d1q<?> m142359g0() {
        return new hyp(this.f118835o, this.f118834n);
    }

    /* JADX INFO: renamed from: h0 */
    public final List<d1q<?>> m142360h0(final PkFriendInfo pkFriendInfo, List<BLiveAnchor> list, final boolean z, boolean z2) {
        final ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            vwb.m200354z(list, new e30() { // from class: l.in70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f113992a.m142365m0(z, pkFriendInfo, arrayList, (BLiveAnchor) obj);
                }
            });
            return arrayList;
        }
        if (z2) {
            arrayList.add(new wye().m206098I(z ? ypv.f199497e.getString(eat.f90252j) : ypv.f199497e.getString(eat.f90253k)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i0 */
    public final d1q<?> m142361i0(boolean z) {
        tri0 tri0Var = new tri0();
        tri0Var.m190419I(z ? ypv.f199497e.getString(eat.f90251i) : ypv.f199497e.getString(eat.f90254l));
        return tri0Var;
    }

    /* JADX INFO: renamed from: j0 */
    public void m142362j0(Boolean bool) {
        this.f118835o = bool.booleanValue();
        d1q<?> d1qVar = m67355J().get(0);
        if (d1qVar == null || !(d1qVar instanceof hyp)) {
            return;
        }
        hyp hypVar = (hyp) d1qVar;
        hypVar.m133619I(bool.booleanValue());
        m67360O(hypVar);
    }

    /* JADX INFO: renamed from: k0 */
    public List<d1q<?>> m142363k0(PkFriendInfo pkFriendInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m142361i0(false));
        arrayList.addAll(m142360h0(pkFriendInfo, pkFriendInfo.anchors, false, true));
        return arrayList;
    }

    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void m142366n0(PkFriendInfo pkFriendInfo) {
        this.f118833m.f116564a.contact(pkFriendInfo);
        ArrayList arrayList = new ArrayList(m142360h0(pkFriendInfo, pkFriendInfo.anchors, true, false));
        if (!pkFriendInfo.isHasNextPage()) {
            arrayList.addAll(m142363k0(this.f118833m.f116565b));
        }
        m67355J().addAll(arrayList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m142365m0(boolean z, PkFriendInfo pkFriendInfo, List list, BLiveAnchor bLiveAnchor) {
        if (z) {
            t6j t6jVar = new t6j(bLiveAnchor, pkFriendInfo);
            list.add(t6jVar);
            t6jVar.m187382I(this.f118831k);
        } else {
            qtg0 qtg0Var = new qtg0(bLiveAnchor, pkFriendInfo);
            qtg0Var.m176446I(this.f118831k);
            list.add(qtg0Var);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m142367p0(f30<BLiveAnchor, PkFriendInfo> f30Var) {
        this.f118831k = f30Var;
    }

    /* JADX INFO: renamed from: q0 */
    public void m142368q0(j760<PkFriendInfo, PkFriendInfo> j760Var) {
        this.f118833m = j760Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m142359g0());
        arrayList.add(m142361i0(true));
        PkFriendInfo pkFriendInfo = j760Var.f116564a;
        arrayList.addAll(m142360h0(pkFriendInfo, pkFriendInfo.anchors, true, true));
        if (!j760Var.f116564a.isHasNextPage()) {
            arrayList.addAll(m142363k0(this.f118833m.f116565b));
        }
        m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: r0 */
    public void m142369r0(d30 d30Var) {
        this.f118834n = d30Var;
    }
}
