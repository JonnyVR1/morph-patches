package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.external.page.search.base.LiveAnchorsInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ylt extends klt<hmt> {

    /* JADX INFO: renamed from: f */
    public final xyd0 f200581f;

    /* JADX INFO: renamed from: g */
    public final List<olt> f200582g;

    public ylt(ner nerVar, imt imtVar, LinearLayout linearLayout, VRecyclerView vRecyclerView, VText vText, View view) {
        super(nerVar, imtVar);
        this.f200581f = new xyd0("live_search_history_record_" + mbs.m157870o0(), new HashSet());
        this.f200582g = new ArrayList();
        mo52715C(new hmt(linearLayout, vRecyclerView, vText, view));
    }

    /* JADX INFO: renamed from: I2 */
    public static /* synthetic */ int m216621I2(olt oltVar, olt oltVar2) {
        return oltVar2.f147873b - oltVar.f147873b;
    }

    /* JADX INFO: renamed from: L2 */
    public static /* synthetic */ int m216623L2(olt oltVar, olt oltVar2) {
        return oltVar2.f147873b - oltVar.f147873b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public /* synthetic */ void m216626R2(String str) {
        this.f200582g.add(new olt(olt.m168169a(str), olt.m168170b(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ void m216627S2(LiveAnchorsInfo liveAnchorsInfo) {
        ((hmt) this.viewModel).m135992l(this.f200582g);
    }

    /* JADX INFO: renamed from: P2 */
    public final void m216628P2(final String str) {
        olt oltVar = new olt(str, this.f200582g.isEmpty() ? 0 : this.f200582g.get(0).f147873b + 1);
        olt oltVar2 = (olt) jyb.m147529r(this.f200582g, new qcj() { // from class: l.vlt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((olt) obj).f147872a, str));
            }
        });
        if (NullChecker.m82486a(oltVar2)) {
            oltVar2.m168173e(oltVar.f147873b);
        } else {
            int size = this.f200582g.size();
            List<olt> list = this.f200582g;
            if (size == 10) {
                olt oltVarRemove = list.remove(9);
                oltVarRemove.m168172d(str);
                oltVarRemove.m168173e(this.f200582g.get(0).f147873b + 1);
                this.f200582g.add(oltVarRemove);
            } else {
                list.add(oltVar);
            }
        }
        x7s.m209649v0(this.f200582g, new Comparator() { // from class: l.wlt
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ylt.m216623L2((olt) obj, (olt) obj2);
            }
        });
        m216632V2();
        ((hmt) this.viewModel).m135997s(this.f200582g);
    }

    /* JADX INFO: renamed from: Q2 */
    public void m216629Q2() {
        this.f200582g.clear();
        m216632V2();
        ((hmt) this.viewModel).m135991j(this.f200582g);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        HashSet<String> hashSet = this.f200581f.get();
        if (jyb.m147479J(hashSet)) {
            bnl0.m105524M(((hmt) this.viewModel).f110665b, false);
            bnl0.m105524M(((hmt) this.viewModel).f110666c, false);
        } else {
            jyb.m147537z(hashSet, new y20() { // from class: l.rlt
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f163800a.m216626R2((String) obj);
                }
            });
            x7s.m209649v0(this.f200582g, new Comparator() { // from class: l.slt
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ylt.m216621I2((olt) obj, (olt) obj2);
                }
            });
            ((hmt) this.viewModel).m135997s(this.f200582g);
        }
        duringCreated(m150393D2().LiveSearchHistoryEvent.addRecord().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.tlt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174863a.m216628P2((String) obj);
            }
        }));
        duringCreated(m150393D2().LiveSearchEvent.onSearchResult().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ult
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179555a.m216627S2((LiveAnchorsInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T2 */
    public void m216630T2(olt oltVar) {
        m150393D2().LiveSearchEvent.changeText().mo199273j(oltVar.f147872a);
    }

    /* JADX INFO: renamed from: U2 */
    public void m216631U2(olt oltVar) {
        int iIndexOf = this.f200582g.indexOf(oltVar);
        if (iIndexOf >= this.f200582g.size() || iIndexOf < 0) {
            return;
        }
        this.f200582g.remove(iIndexOf);
        m216632V2();
        ((hmt) this.viewModel).m136000w(this.f200582g, iIndexOf);
    }

    /* JADX INFO: renamed from: V2 */
    public final void m216632V2() {
        HashSet<String> hashSet = this.f200581f.get();
        hashSet.clear();
        hashSet.addAll(jyb.m147486Q(this.f200582g, new qcj() { // from class: l.xlt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((olt) obj).m168171c();
            }
        }));
        this.f200581f.put(hashSet);
    }
}
