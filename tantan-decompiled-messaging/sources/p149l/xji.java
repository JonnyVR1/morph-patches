package p149l;

import android.text.TextUtils;
import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveFilterItem;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p147v.VRecyclerView;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class xji<D extends ho2> extends pat<D> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: i */
    public BeautyFilterView f193216i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f193217j;

    /* JADX INFO: renamed from: k */
    public final HashMap<String, tpd0> f193218k;

    /* JADX INFO: renamed from: l */
    public pii f193219l;

    /* JADX INFO: renamed from: m */
    public final List<BLiveFilterItem> f193220m;

    /* JADX INFO: renamed from: n */
    public int f193221n;

    /* JADX INFO: renamed from: o */
    public BLiveFilterItem f193222o;

    /* JADX INFO: renamed from: p */
    public boolean f193223p;

    /* JADX INFO: renamed from: q */
    public final uqd0 f193224q;

    public xji(bsm<D> bsmVar) {
        super(bsmVar);
        this.f193218k = new HashMap<>();
        this.f193220m = new ArrayList();
        this.f193223p = false;
        this.f193224q = new uqd0(twr.m190884a(ypv.f199493a.m199309D0()), "0");
    }

    /* JADX INFO: renamed from: P3 */
    private int m209706P3(String str) {
        String strM190888e = twr.m190888e(str, ypv.f199493a.m199309D0());
        tpd0 tpd0Var = this.f193218k.get(strM190888e);
        if (tpd0Var == null) {
            tpd0Var = new tpd0(strM190888e, 80);
            this.f193218k.put(strM190888e, tpd0Var);
        }
        return tpd0Var.get().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m209707U3(iqv iqvVar) {
        if (NullChecker.m81303a(this.f193216i)) {
            this.f193216i.m72213g(false, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m209708V3(soj0 soj0Var) {
        m209725e4(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public void m209709X3() {
        this.f193223p = false;
        m206028F2().BeautyEvent.loadBeautyConfig().m172467p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public void m209710Z3(BLiveFilterItem bLiveFilterItem) {
        hpd0 hpd0Var = ypv.f199495c.f166716h;
        int iIntValue = ((Integer) m129297F3(new uqw(2301))).intValue();
        m206028F2().BeautyEvent.clearMakeUpStyle().m172467p();
        m209726f4(bLiveFilterItem);
        if (hpd0Var.get().booleanValue() || iIntValue == 0) {
            return;
        }
        lsi0.m151593w(R$string.f46623D0);
        hpd0Var.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: b4 */
    private void m209711b4(ArrayList<BLiveFilterItem> arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (TextUtils.equals(arrayList.get(i2).f44368id, this.f193224q.get())) {
                i = i2;
                break;
            }
        }
        m209725e4(i);
    }

    /* JADX INFO: renamed from: d4 */
    private void m209712d4(String str, int i) {
        String strM190888e = twr.m190888e(str, ypv.f199493a.m199309D0());
        tpd0 tpd0Var = this.f193218k.get(strM190888e);
        if (tpd0Var == null) {
            tpd0Var = new tpd0(strM190888e, 80);
            this.f193218k.put(strM190888e, tpd0Var);
        }
        tpd0Var.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g4 */
    private void m209713g4(int i) {
        bxl bxlVar = (bxl) m129297F3(new bu00(2301));
        List<TTPresetFilter> listMo71882t = bxlVar.mo71882t();
        if (vwb.m200296J(listMo71882t) || listMo71882t.size() <= i || i < 0) {
            return;
        }
        TTPresetFilter tTPresetFilter = listMo71882t.get(i);
        int iM209706P3 = m209706P3(tTPresetFilter.mFilterId);
        bxlVar.mo71878m(tTPresetFilter.lookupUrl);
        m209715i4(iM209706P3);
        m209716j4(iM209706P3);
    }

    /* JADX INFO: renamed from: h4 */
    private void m209714h4(List<BLiveFilterItem> list) {
        this.f193220m.clear();
        this.f193220m.addAll(list);
        if (NullChecker.m81303a(this.f193219l)) {
            this.f193219l.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: i4 */
    private void m209715i4(int i) {
        ((bxl) m129297F3(new bu00(2301))).setIntensity((i * 1.0f) / 100.0f);
    }

    private void init() {
        this.f193217j = this.f193216i.getFilterView();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        this.f193217j.setLayoutManager(linearLayoutManager);
        pii piiVar = new pii(this.f193220m, new e30() { // from class: l.wji
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186655a.m209710Z3((BLiveFilterItem) obj);
            }
        });
        this.f193219l = piiVar;
        this.f193217j.setAdapter(piiVar);
        if (NullChecker.m81303a(this.f193222o)) {
            m209725e4(this.f193221n);
        }
    }

    /* JADX INFO: renamed from: j4 */
    private void m209716j4(int i) {
        if (NullChecker.m81303a(this.f193216i)) {
            this.f193216i.m72215i(BeautyTabItem.FILTER, i);
        }
    }

    /* JADX INFO: renamed from: l4 */
    private void m209717l4(int i) {
        if (this.f193217j == null) {
            return;
        }
        this.f193219l.notifyItemChanged(i);
        this.f193219l.notifyItemChanged(this.f193221n);
        if (this.f193216i.getCurrentItem() == BeautyTabItem.FILTER.getIndex()) {
            this.f193216i.m72219m(this.f193221n != 0);
            this.f193216i.m72220n(m206027E2().m149816m().m137799f(), this.f193222o.name);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public Map<String, Object> m209718R3() {
        HashMap map = new HashMap();
        if (NullChecker.m81303a(this.f193222o)) {
            map.put("filter_id", this.f193222o.f44368id);
            map.put("filter_name", this.f193222o.name);
            map.put("filter_value", this.f193221n == 0 ? "0" : Integer.valueOf(m209706P3(this.f193222o.f44368id)));
        }
        return map;
    }

    /* JADX INFO: renamed from: S3 */
    public void m209719S3(List<BLiveFilterItem> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        bxl bxlVar = (bxl) m129297F3(new bu00(2301));
        bxlVar.mo71886x(gli.m126764n(list));
        if (vwb.m200296J(bxlVar.mo71882t())) {
            return;
        }
        ArrayList<BLiveFilterItem> arrayList = new ArrayList<>(vwb.m200339n(list, new w9j() { // from class: l.uji
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFilterItem) obj).isFilterFileExist);
            }
        }));
        m209714h4(arrayList);
        m209711b4(arrayList);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206027E2().m149815l()).filter(new l9t()).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.rji
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159695a.m209707U3((iqv) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().BeautyEvent.cleanFilter().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.sji
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164840a.m209708V3((soj0) obj);
            }
        }));
        m129301d3(aki.class, new w9j() { // from class: l.tji
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f170730a.m209721W3((aki) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public void m209720T3() {
        this.f193223p = true;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ String m209721W3(aki akiVar) {
        return this.f193224q.get();
    }

    /* JADX INFO: renamed from: Y3 */
    public void m209722Y3(BeautyFilterView beautyFilterView) {
        this.f193216i = beautyFilterView;
        init();
    }

    /* JADX INFO: renamed from: a4 */
    public void m209723a4() {
        this.f193216i.m72214h(ypv.f199497e.getString(R$string.f47623x4));
        boolean z = this.f193221n != 0;
        this.f193216i.m72218l(false);
        this.f193216i.m72219m(z);
        if (z) {
            this.f193216i.m72215i(BeautyTabItem.FILTER, m209706P3(this.f193222o.f44368id));
        }
        if (!vwb.m200296J(this.f193220m)) {
            this.f193216i.m72213g(m206027E2().m149816m().m137799f(), this.f193222o.name);
            this.f193217j.scrollToPosition(this.f193221n);
        } else if (this.f193223p) {
            this.f188513f.dialog().m20504F(ypv.f199497e.getString(R$string.f47645y4)).m20560v0(ypv.f199497e.getString(R$string.f46957Sb), new Runnable() { // from class: l.vji
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181711a.m209709X3();
                }
            }).m20543m0(ypv.f199497e.getString(R$string.f47113a)).m20568z0();
        } else {
            lsi0.m151593w(R$string.f46864O2);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m209724c4() {
        m209713g4(this.f193221n);
    }

    /* JADX INFO: renamed from: e4 */
    public void m209725e4(int i) {
        if (i < 0 || this.f193220m.size() <= i) {
            return;
        }
        m209726f4(this.f193220m.get(i));
        if (NullChecker.m81303a(this.f193217j)) {
            this.f193219l.m169607K(i);
            this.f193217j.scrollToPosition(i);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m209726f4(BLiveFilterItem bLiveFilterItem) {
        if (this.f193222o == bLiveFilterItem) {
            return;
        }
        this.f193222o = bLiveFilterItem;
        int i = this.f193221n;
        this.f193221n = this.f193220m.indexOf(bLiveFilterItem);
        this.f193224q.put(bLiveFilterItem.f44368id);
        m209713g4(this.f193221n);
        m209717l4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m209727k4(boolean z) {
        int i = this.f193221n;
        int i2 = z ? i + 1 : i - 1;
        if (i2 < 0 || this.f193220m.size() <= i2) {
            return;
        }
        if (NullChecker.m81303a(this.f193217j)) {
            this.f193219l.m169607K(i2);
            this.f193217j.scrollToPosition(i2);
        }
        m209710Z3(this.f193220m.get(i2));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        m209715i4(i);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        m209712d4(this.f193222o.f44368id, seekBar.getProgress());
    }

    public void reset() {
        bxl bxlVar = (bxl) m129297F3(new bu00(2301));
        if (vwb.m200296J(bxlVar.mo71882t())) {
            return;
        }
        bxlVar.mo71878m("");
        m209715i4(0);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
