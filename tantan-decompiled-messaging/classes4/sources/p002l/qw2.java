package p002l;

import android.text.TextUtils;
import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.d30;
import l.e30;
import l.e51;
import l.ffw;
import l.hpd0;
import l.lpd0;
import l.lsi0;
import l.t100;
import l.twr;
import l.vwb;
import l.ylf0;
import l.ypv;
import p002l.ho2;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qw2<D extends ho2> extends pat<D> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: i */
    public BeautyFilterView f18254i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f18255j;

    /* JADX INFO: renamed from: k */
    public hu2 f18256k;

    /* JADX INFO: renamed from: l */
    public final List<BLiveBeautyItem> f18257l;

    /* JADX INFO: renamed from: m */
    public BLiveBeautyItem f18258m;

    /* JADX INFO: renamed from: n */
    public final Map<String, lpd0> f18259n;

    public qw2(bsm<D> bsmVar) {
        super(bsmVar);
        this.f18257l = new ArrayList();
        this.f18259n = new HashMap();
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m21594O3(BLiveBeautyItem bLiveBeautyItem, Map map) {
        map.put("beauty_name", bLiveBeautyItem.name);
        map.put("beauty_value", Float.valueOf(bLiveBeautyItem.getValue()));
    }

    /* JADX INFO: renamed from: V3 */
    private int m21600V3(float f) {
        return (int) (f * 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m21601Z3() {
        m21620o4(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public void m21602h4(BLiveBeautyItem bLiveBeautyItem) {
        this.f18258m = bLiveBeautyItem;
        for (int i = 0; i < this.f18257l.size(); i++) {
            BLiveBeautyItem bLiveBeautyItem2 = this.f18257l.get(i);
            bLiveBeautyItem2.setSelected(TextUtils.equals(bLiveBeautyItem2.name, bLiveBeautyItem.name));
        }
        if (bLiveBeautyItem.isSuggested) {
            new hpd0(twr.c(bLiveBeautyItem.id, ypv.a.D0()), Boolean.TRUE).put(Boolean.FALSE);
        }
        this.f18256k.notifyDataSetChanged();
        this.f18254i.m5687h(bLiveBeautyItem.name);
        this.f18254i.m5686g(false, "");
        this.f18254i.m5688i(BeautyTabItem.BEAUTY, m21600V3(bLiveBeautyItem.getValue()));
    }

    /* JADX INFO: renamed from: i4 */
    private void m21603i4(float f, BLiveBeautyItem bLiveBeautyItem) {
        bLiveBeautyItem.setValue(f);
        ((bxl) m14184F3(new bu00(2300))).mo5238L(bLiveBeautyItem.id, bLiveBeautyItem.getValue());
        this.f18256k.notifyItemChanged(this.f18257l.indexOf(bLiveBeautyItem));
    }

    /* JADX INFO: renamed from: l4 */
    private void m21604l4() {
        vwb.z(this.f18257l, new e30() { // from class: l.gw2
            public final void call(Object obj) {
                this.f11645a.m21613d4((BLiveBeautyItem) obj);
            }
        });
        m21620o4(false);
        this.f18256k.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: n4 */
    private void m21605n4(BLiveBeautyItem bLiveBeautyItem) {
        String strB = twr.b(bLiveBeautyItem.id, ypv.a.D0());
        lpd0 lpd0Var = this.f18259n.get(strB);
        if (lpd0Var == null) {
            lpd0Var = new lpd0(strB, bLiveBeautyItem.getDefaultBeautyValue());
            this.f18259n.put(strB, lpd0Var);
        }
        bLiveBeautyItem.getValue();
        lpd0Var.put(Float.valueOf(bLiveBeautyItem.getValue()));
    }

    /* JADX INFO: renamed from: T */
    public void m21606T() {
        super.T();
        duringCreated(m25547E2().m17236l()).filter(new l9t()).take(1).subscribe(ffw.d(new e30() { // from class: l.fw2
            public final void call(Object obj) {
                this.f10658a.m21609Y3((iqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public Map<String, Object> m21607W3() {
        HashMap map = new HashMap();
        for (BLiveBeautyItem bLiveBeautyItem : this.f18257l) {
            map.put(bLiveBeautyItem.key, Integer.valueOf(m21600V3(bLiveBeautyItem.getValue())));
        }
        return map;
    }

    /* JADX INFO: renamed from: X3 */
    public void m21608X3(List<BLiveBeautyItem> list) {
        this.f18257l.clear();
        this.f18257l.addAll(list);
        vwb.z(this.f18257l, new e30() { // from class: l.hw2
            public final void call(Object obj) {
                BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) obj;
                bLiveBeautyItem.setValue((Float) new lpd0(twr.b(bLiveBeautyItem.id, ypv.a.D0()), bLiveBeautyItem.getDefaultBeautyValue()).get());
            }
        });
        BLiveBeautyItem bLiveBeautyItem = this.f18257l.get(0);
        this.f18258m = bLiveBeautyItem;
        bLiveBeautyItem.setSelected(true);
        if (NullChecker.a(this.f18254i)) {
            this.f18254i.m5688i(BeautyTabItem.BEAUTY, m21600V3(this.f18258m.getValue()));
        }
        e51.G(new Runnable() { // from class: l.iw2
            @Override // java.lang.Runnable
            public final void run() {
                this.f13452a.m21601Z3();
            }
        });
        if (NullChecker.a(this.f18256k)) {
            this.f18256k.notifyDataSetChanged();
        }
        m21618k4();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m21609Y3(iqv iqvVar) {
        if (NullChecker.a(this.f18254i)) {
            this.f18254i.m5690k(false);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m21610a4() {
        if (vwb.J(this.f18257l)) {
            return;
        }
        m21604l4();
        if (NullChecker.a(this.f18258m)) {
            this.f18254i.m5688i(BeautyTabItem.BEAUTY, m21600V3(this.f18258m.getValue()));
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m21611b4() {
        act().dialog().G0(ypv.e.getString(R$string.f3081W9)).D(R$string.f2709F0).m0(ypv.e.getString(R$string.f3155a)).v0(ypv.e.getString(R$string.f3331i), new Runnable() { // from class: l.lw2
            @Override // java.lang.Runnable
            public final void run() {
                this.f15093a.m21610a4();
            }
        }).z0();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m21612c4(BLiveBeautyItem bLiveBeautyItem) {
        ((bxl) m14184F3(new bu00(2300))).mo5238L(bLiveBeautyItem.id, 0.0f);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m21613d4(BLiveBeautyItem bLiveBeautyItem) {
        bLiveBeautyItem.resetBeautyValue();
        m21605n4(bLiveBeautyItem);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m21614e4(BLiveBeautyItem bLiveBeautyItem) {
        ((bxl) m14184F3(new bu00(2300))).mo5238L(bLiveBeautyItem.id, ((Float) new lpd0(twr.b(bLiveBeautyItem.id, ypv.a.D0()), bLiveBeautyItem.getDefaultBeautyValue()).get()).floatValue());
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m21615f4(boolean z, final BLiveBeautyItem bLiveBeautyItem) {
        if (z) {
            eet.m12448b(this, "anchor_set_beauty", new e30() { // from class: l.nw2
                public final void call(Object obj) {
                    qw2.m21594O3(bLiveBeautyItem, (Map) obj);
                }
            });
        }
        ((bxl) m14184F3(new bu00(2300))).mo5238L(bLiveBeautyItem.id, bLiveBeautyItem.getValue());
    }

    /* JADX INFO: renamed from: g4 */
    public void m21616g4(BeautyFilterView beautyFilterView) {
        this.f18254i = beautyFilterView;
        init();
        this.f18254i.m5686g(false, "");
        this.f18254i.setOnResetAction(new d30() { // from class: l.kw2
            public final void call() {
                this.f14560a.m21611b4();
            }
        });
        this.f18254i.m5690k(m25547E2().m17237m().m15303f());
        m21618k4();
    }

    public void init() {
        this.f18255j = this.f18254i.getBeautyView();
        this.f18256k = new hu2(this.f18257l, new e30() { // from class: l.pw2
            public final void call(Object obj) {
                this.f17704a.m21602h4((BLiveBeautyItem) obj);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        int i = t100.g;
        int i2 = t100.o;
        this.f18255j.addItemDecoration(new ylf0(i, i2, i2, 0));
        this.f18255j.setLayoutManager(linearLayoutManager);
        this.f18255j.setAdapter(this.f18256k);
    }

    /* JADX INFO: renamed from: j4 */
    public void m21617j4() {
        if (vwb.J(this.f18257l)) {
            lsi0.w(R$string.f2906O2);
        }
        boolean zA = NullChecker.a(this.f18258m);
        BeautyFilterView beautyFilterView = this.f18254i;
        if (zA) {
            beautyFilterView.m5692m(true);
            this.f18254i.m5688i(BeautyTabItem.BEAUTY, m21600V3(this.f18258m.getValue()));
            this.f18254i.m5687h(this.f18258m.name);
        } else {
            beautyFilterView.m5692m(false);
        }
        this.f18254i.m5686g(false, "");
        this.f18254i.m5691l(false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21618k4() {
        BeautyFilterView beautyFilterView;
        boolean zA = NullChecker.a(this.f18258m);
        if (!zA || (beautyFilterView = this.f18254i) == null) {
            return;
        }
        beautyFilterView.m5687h(this.f18258m.name);
        this.f18254i.m5688i(BeautyTabItem.BEAUTY, m21600V3(this.f18258m.getValue()));
        this.f18254i.m5692m(zA);
    }

    /* JADX INFO: renamed from: m4 */
    public void m21619m4() {
        vwb.z(this.f18257l, new e30() { // from class: l.ow2
            public final void call(Object obj) {
                this.f16811a.m21614e4((BLiveBeautyItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public final void m21620o4(final boolean z) {
        vwb.z(this.f18257l, new e30() { // from class: l.jw2
            public final void call(Object obj) {
                this.f14062a.m21615f4(z, (BLiveBeautyItem) obj);
            }
        });
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        m21603i4((i * 1.0f) / 100.0f, this.f18258m);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        m21605n4(this.f18258m);
    }

    public void reset() {
        vwb.z(this.f18257l, new e30() { // from class: l.mw2
            public final void call(Object obj) {
                this.f15718a.m21612c4((BLiveBeautyItem) obj);
            }
        });
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
