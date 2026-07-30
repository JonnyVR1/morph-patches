package p149l;

import android.text.TextUtils;
import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveFilterItem;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.VChatBeautyFilterView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class cmk0 extends weu<cmk0> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: f */
    public final cxl f81574f;

    /* JADX INFO: renamed from: g */
    public VChatBeautyFilterView f81575g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f81576h;

    /* JADX INFO: renamed from: i */
    public final HashMap<String, tpd0> f81577i;

    /* JADX INFO: renamed from: j */
    public pii f81578j;

    /* JADX INFO: renamed from: k */
    public final List<BLiveFilterItem> f81579k;

    /* JADX INFO: renamed from: l */
    public int f81580l;

    /* JADX INFO: renamed from: m */
    public BLiveFilterItem f81581m;

    /* JADX INFO: renamed from: n */
    public boolean f81582n;

    /* JADX INFO: renamed from: o */
    public final uqd0 f81583o;

    /* JADX INFO: renamed from: p */
    public aik0 f81584p;

    public cmk0(jlu jluVar, aik0 aik0Var) {
        super(jluVar);
        this.f81577i = new HashMap<>();
        this.f81579k = new ArrayList();
        this.f81582n = false;
        this.f81583o = new uqd0(twr.m190894k(l9s.m149093o0()), "0");
        this.f81584p = aik0Var;
        this.f81574f = aik0Var.f70004k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m107646a3(soj0 soj0Var) {
        m107659i3(0);
    }

    private void init() {
        this.f81576h = this.f81575g.getFilterView();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        this.f81576h.setLayoutManager(linearLayoutManager);
        pii piiVar = new pii(this.f81579k, new e30() { // from class: l.amk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70629a.m107653c3((BLiveFilterItem) obj);
            }
        });
        this.f81578j = piiVar;
        this.f81576h.setAdapter(piiVar);
        if (NullChecker.m81303a(this.f81581m)) {
            m107659i3(this.f81580l);
        }
    }

    /* JADX INFO: renamed from: m3 */
    private void m107647m3(List<BLiveFilterItem> list) {
        this.f81579k.clear();
        this.f81579k.addAll(list);
        if (NullChecker.m81303a(this.f81578j)) {
            this.f81578j.notifyDataSetChanged();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m218411K2().LiveVideoChatEvent.m69193c().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ylk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198902a.m107646a3((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W2 */
    public final int m107648W2(String str) {
        String strM190898o = twr.m190898o(str, l9s.m149093o0());
        tpd0 tpd0Var = this.f81577i.get(strM190898o);
        if (tpd0Var == null) {
            tpd0Var = new tpd0(strM190898o, 80);
            this.f81577i.put(strM190898o, tpd0Var);
        }
        return tpd0Var.get().intValue();
    }

    /* JADX INFO: renamed from: X2 */
    public String m107649X2() {
        return this.f81583o.get();
    }

    /* JADX INFO: renamed from: Y2 */
    public void m107650Y2(List<BLiveFilterItem> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f81574f.mo98906x(gli.m126764n(list));
        if (vwb.m200296J(this.f81574f.mo98904t())) {
            return;
        }
        ArrayList<BLiveFilterItem> arrayList = new ArrayList<>(vwb.m200339n(list, new w9j() { // from class: l.bmk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFilterItem) obj).isFilterFileExist);
            }
        }));
        m107647m3(arrayList);
        m107656f3(arrayList);
    }

    /* JADX INFO: renamed from: Z2 */
    public void m107651Z2() {
        this.f81582n = true;
    }

    /* JADX INFO: renamed from: b3 */
    public final void m107652b3() {
        this.f81582n = false;
        this.f81584p.m96828c3();
    }

    /* JADX INFO: renamed from: c3 */
    public final void m107653c3(BLiveFilterItem bLiveFilterItem) {
        hpd0 hpd0Var = new hpd0(twr.m190897n(l9s.m149093o0()), Boolean.FALSE);
        int iM165124b3 = this.f81584p.f70002i.m165124b3();
        m218411K2().LiveVideoChatEvent.m69194d().m172467p();
        m107660j3(bLiveFilterItem);
        if (hpd0Var.get().booleanValue() || iM165124b3 == 0) {
            return;
        }
        lsi0.m151593w(R$string.f46623D0);
        hpd0Var.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d3 */
    public void m107654d3() {
        this.f81575g.m69830h(ypv.f199497e.getString(R$string.f47623x4));
        boolean z = this.f81580l != 0;
        this.f81575g.m69834l(false);
        this.f81575g.m69835m(z);
        if (z) {
            this.f81575g.m69831i(BeautyTabItem.FILTER, m107648W2(this.f81581m.f44368id));
        }
        if (!vwb.m200296J(this.f81579k)) {
            this.f81575g.m69829g(slk0.m184829e(m218409H2().m203901A()), this.f81581m.name);
            this.f81576h.scrollToPosition(this.f81580l);
        } else if (this.f81582n) {
            act().dialog().m20504F(ypv.f199497e.getString(R$string.f47645y4)).m20560v0(ypv.f199497e.getString(R$string.f46957Sb), new Runnable() { // from class: l.zlk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203641a.m107652b3();
                }
            }).m20543m0(ypv.f199497e.getString(R$string.f47113a)).m20568z0();
        } else {
            lsi0.m151593w(R$string.f46864O2);
        }
    }

    /* JADX INFO: renamed from: e3 */
    public void m107655e3(VChatBeautyFilterView vChatBeautyFilterView) {
        this.f81575g = vChatBeautyFilterView;
        init();
    }

    /* JADX INFO: renamed from: f3 */
    public final void m107656f3(ArrayList<BLiveFilterItem> arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (TextUtils.equals(arrayList.get(i2).f44368id, this.f81583o.get())) {
                i = i2;
                break;
            }
        }
        m107659i3(i);
    }

    /* JADX INFO: renamed from: g3 */
    public void m107657g3() {
        m107661k3(this.f81580l);
    }

    /* JADX INFO: renamed from: h3 */
    public final void m107658h3(String str, int i) {
        String strM190898o = twr.m190898o(str, l9s.m149093o0());
        tpd0 tpd0Var = this.f81577i.get(strM190898o);
        if (tpd0Var == null) {
            tpd0Var = new tpd0(strM190898o, 80);
            this.f81577i.put(strM190898o, tpd0Var);
        }
        tpd0Var.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i3 */
    public void m107659i3(int i) {
        if (i < 0 || this.f81579k.size() <= i) {
            return;
        }
        m107660j3(this.f81579k.get(i));
        if (NullChecker.m81303a(this.f81576h)) {
            this.f81578j.m169607K(i);
            this.f81576h.scrollToPosition(i);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public void m107660j3(BLiveFilterItem bLiveFilterItem) {
        if (this.f81581m == bLiveFilterItem) {
            return;
        }
        this.f81581m = bLiveFilterItem;
        int i = this.f81580l;
        this.f81580l = this.f81579k.indexOf(bLiveFilterItem);
        this.f81583o.put(bLiveFilterItem.f44368id);
        m107661k3(this.f81580l);
        m107665q3(i);
    }

    /* JADX INFO: renamed from: k3 */
    public final void m107661k3(int i) {
        List<TTPresetFilter> listMo98904t = this.f81574f.mo98904t();
        if (vwb.m200296J(listMo98904t) || listMo98904t.size() <= i || i < 0) {
            return;
        }
        TTPresetFilter tTPresetFilter = listMo98904t.get(i);
        int iM107648W2 = m107648W2(tTPresetFilter.mFilterId);
        this.f81574f.mo98902m(tTPresetFilter.lookupUrl);
        m107662n3(iM107648W2);
        m107663o3(iM107648W2);
    }

    /* JADX INFO: renamed from: n3 */
    public final void m107662n3(int i) {
        this.f81574f.setIntensity((i * 1.0f) / 100.0f);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m107663o3(int i) {
        if (NullChecker.m81303a(this.f81575g)) {
            this.f81575g.m69831i(BeautyTabItem.FILTER, i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        m107662n3(i);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        m107658h3(this.f81581m.f44368id, seekBar.getProgress());
    }

    /* JADX INFO: renamed from: p3 */
    public void m107664p3(boolean z) {
        int i = this.f81580l;
        int i2 = z ? i + 1 : i - 1;
        if (i2 < 0 || this.f81579k.size() <= i2) {
            return;
        }
        if (NullChecker.m81303a(this.f81576h)) {
            this.f81578j.m169607K(i2);
            this.f81576h.scrollToPosition(i2);
        }
        m107653c3(this.f81579k.get(i2));
    }

    /* JADX INFO: renamed from: q3 */
    public final void m107665q3(int i) {
        if (this.f81576h == null) {
            return;
        }
        this.f81578j.notifyItemChanged(i);
        this.f81578j.notifyItemChanged(this.f81580l);
        if (this.f81575g.getCurrentItem() == BeautyTabItem.FILTER.getIndex()) {
            this.f81575g.m69835m(this.f81580l != 0);
            this.f81575g.m69836n(slk0.m184829e(m218409H2().m203901A()), this.f81581m.name);
        }
    }

    public void reset() {
        if (vwb.m200296J(this.f81574f.mo98904t())) {
            return;
        }
        this.f81574f.mo98902m("");
        m107662n3(0);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
