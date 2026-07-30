package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.external.page.search.base.LiveAnchorsInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class xjt extends jjt<gkt> {

    /* JADX INFO: renamed from: f */
    public final vqd0 f193242f;

    /* JADX INFO: renamed from: g */
    public final List<njt> f193243g;

    public xjt(mcr mcrVar, hkt hktVar, LinearLayout linearLayout, VRecyclerView vRecyclerView, VText vText, View view) {
        super(mcrVar, hktVar);
        this.f193242f = new vqd0("live_search_history_record_" + l9s.m149093o0(), new HashSet());
        this.f193243g = new ArrayList();
        mo51532C(new gkt(linearLayout, vRecyclerView, vText, view));
    }

    /* JADX INFO: renamed from: I2 */
    public static /* synthetic */ int m209742I2(njt njtVar, njt njtVar2) {
        return njtVar2.f139332b - njtVar.f139332b;
    }

    /* JADX INFO: renamed from: L2 */
    public static /* synthetic */ int m209744L2(njt njtVar, njt njtVar2) {
        return njtVar2.f139332b - njtVar.f139332b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public /* synthetic */ void m209747R2(String str) {
        this.f193243g.add(new njt(njt.m159791a(str), njt.m159792b(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ void m209748S2(LiveAnchorsInfo liveAnchorsInfo) {
        ((gkt) this.viewModel).m126709l(this.f193243g);
    }

    /* JADX INFO: renamed from: P2 */
    public final void m209749P2(final String str) {
        njt njtVar = new njt(str, this.f193243g.isEmpty() ? 0 : this.f193243g.get(0).f139332b + 1);
        njt njtVar2 = (njt) vwb.m200346r(this.f193243g, new w9j() { // from class: l.ujt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((njt) obj).f139331a, str));
            }
        });
        if (NullChecker.m81303a(njtVar2)) {
            njtVar2.m159795e(njtVar.f139332b);
        } else {
            int size = this.f193243g.size();
            List<njt> list = this.f193243g;
            if (size == 10) {
                njt njtVarRemove = list.remove(9);
                njtVarRemove.m159794d(str);
                njtVarRemove.m159795e(this.f193243g.get(0).f139332b + 1);
                this.f193243g.add(njtVarRemove);
            } else {
                list.add(njtVar);
            }
        }
        w5s.m201685v0(this.f193243g, new Comparator() { // from class: l.vjt
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return xjt.m209744L2((njt) obj, (njt) obj2);
            }
        });
        m209753V2();
        ((gkt) this.viewModel).m126714s(this.f193243g);
    }

    /* JADX INFO: renamed from: Q2 */
    public void m209750Q2() {
        this.f193243g.clear();
        m209753V2();
        ((gkt) this.viewModel).m126708j(this.f193243g);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        HashSet<String> hashSet = this.f193242f.get();
        if (vwb.m200296J(hashSet)) {
            xdl0.m208344M(((gkt) this.viewModel).f103228b, false);
            xdl0.m208344M(((gkt) this.viewModel).f103229c, false);
        } else {
            vwb.m200354z(hashSet, new e30() { // from class: l.qjt
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f154988a.m209747R2((String) obj);
                }
            });
            w5s.m201685v0(this.f193243g, new Comparator() { // from class: l.rjt
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return xjt.m209742I2((njt) obj, (njt) obj2);
                }
            });
            ((gkt) this.viewModel).m126714s(this.f193243g);
        }
        duringCreated(m141814D2().LiveSearchHistoryEvent.addRecord().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.sjt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164910a.m209749P2((String) obj);
            }
        }));
        duringCreated(m141814D2().LiveSearchEvent.onSearchResult().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.tjt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170798a.m209748S2((LiveAnchorsInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T2 */
    public void m209751T2(njt njtVar) {
        m141814D2().LiveSearchEvent.changeText().mo172463j(njtVar.f139331a);
    }

    /* JADX INFO: renamed from: U2 */
    public void m209752U2(njt njtVar) {
        int iIndexOf = this.f193243g.indexOf(njtVar);
        if (iIndexOf >= this.f193243g.size() || iIndexOf < 0) {
            return;
        }
        this.f193243g.remove(iIndexOf);
        m209753V2();
        ((gkt) this.viewModel).m126717w(this.f193243g, iIndexOf);
    }

    /* JADX INFO: renamed from: V2 */
    public final void m209753V2() {
        HashSet<String> hashSet = this.f193242f.get();
        hashSet.clear();
        hashSet.addAll(vwb.m200303Q(this.f193243g, new w9j() { // from class: l.wjt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((njt) obj).m159793c();
            }
        }));
        this.f193242f.put(hashSet);
    }
}
