package p149l;

import android.text.TextUtils;
import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147v.VRecyclerView;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class qw2<D extends ho2> extends pat<D> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: i */
    public BeautyFilterView f156648i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f156649j;

    /* JADX INFO: renamed from: k */
    public hu2 f156650k;

    /* JADX INFO: renamed from: l */
    public final List<BLiveBeautyItem> f156651l;

    /* JADX INFO: renamed from: m */
    public BLiveBeautyItem f156652m;

    /* JADX INFO: renamed from: n */
    public final Map<String, lpd0> f156653n;

    public qw2(bsm<D> bsmVar) {
        super(bsmVar);
        this.f156651l = new ArrayList();
        this.f156653n = new HashMap();
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m176745O3(BLiveBeautyItem bLiveBeautyItem, Map map) {
        map.put("beauty_name", bLiveBeautyItem.name);
        map.put("beauty_value", Float.valueOf(bLiveBeautyItem.getValue()));
    }

    /* JADX INFO: renamed from: V3 */
    private int m176751V3(float f) {
        return (int) (f * 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m176752Z3() {
        m176770o4(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public void m176753h4(BLiveBeautyItem bLiveBeautyItem) {
        this.f156652m = bLiveBeautyItem;
        for (int i = 0; i < this.f156651l.size(); i++) {
            BLiveBeautyItem bLiveBeautyItem2 = this.f156651l.get(i);
            bLiveBeautyItem2.setSelected(TextUtils.equals(bLiveBeautyItem2.name, bLiveBeautyItem.name));
        }
        if (bLiveBeautyItem.isSuggested) {
            new hpd0(twr.m190886c(bLiveBeautyItem.f44337id, ypv.f199493a.m199309D0()), Boolean.TRUE).put(Boolean.FALSE);
        }
        this.f156650k.notifyDataSetChanged();
        this.f156648i.m72214h(bLiveBeautyItem.name);
        this.f156648i.m72213g(false, "");
        this.f156648i.m72215i(BeautyTabItem.BEAUTY, m176751V3(bLiveBeautyItem.getValue()));
    }

    /* JADX INFO: renamed from: i4 */
    private void m176754i4(float f, BLiveBeautyItem bLiveBeautyItem) {
        bLiveBeautyItem.setValue(f);
        ((bxl) m129297F3(new bu00(2300))).mo71860L(bLiveBeautyItem.f44337id, bLiveBeautyItem.getValue());
        this.f156650k.notifyItemChanged(this.f156651l.indexOf(bLiveBeautyItem));
    }

    /* JADX INFO: renamed from: l4 */
    private void m176755l4() {
        vwb.m200354z(this.f156651l, new e30() { // from class: l.gw2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104653a.m176763d4((BLiveBeautyItem) obj);
            }
        });
        m176770o4(false);
        this.f156650k.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: n4 */
    private void m176756n4(BLiveBeautyItem bLiveBeautyItem) {
        String strM190885b = twr.m190885b(bLiveBeautyItem.f44337id, ypv.f199493a.m199309D0());
        lpd0 lpd0Var = this.f156653n.get(strM190885b);
        if (lpd0Var == null) {
            lpd0Var = new lpd0(strM190885b, bLiveBeautyItem.getDefaultBeautyValue());
            this.f156653n.put(strM190885b, lpd0Var);
        }
        bLiveBeautyItem.getValue();
        lpd0Var.put(Float.valueOf(bLiveBeautyItem.getValue()));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206027E2().m149815l()).filter(new l9t()).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.fw2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99598a.m176759Y3((iqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public Map<String, Object> m176757W3() {
        HashMap map = new HashMap();
        for (BLiveBeautyItem bLiveBeautyItem : this.f156651l) {
            map.put(bLiveBeautyItem.key, Integer.valueOf(m176751V3(bLiveBeautyItem.getValue())));
        }
        return map;
    }

    /* JADX INFO: renamed from: X3 */
    public void m176758X3(List<BLiveBeautyItem> list) {
        this.f156651l.clear();
        this.f156651l.addAll(list);
        vwb.m200354z(this.f156651l, new e30() { // from class: l.hw2
            @Override // p149l.e30
            public final void call(Object obj) {
                BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) obj;
                bLiveBeautyItem.setValue(new lpd0(twr.m190885b(bLiveBeautyItem.f44337id, ypv.f199493a.m199309D0()), bLiveBeautyItem.getDefaultBeautyValue()).get());
            }
        });
        BLiveBeautyItem bLiveBeautyItem = this.f156651l.get(0);
        this.f156652m = bLiveBeautyItem;
        bLiveBeautyItem.setSelected(true);
        if (NullChecker.m81303a(this.f156648i)) {
            this.f156648i.m72215i(BeautyTabItem.BEAUTY, m176751V3(this.f156652m.getValue()));
        }
        e51.m114742G(new Runnable() { // from class: l.iw2
            @Override // java.lang.Runnable
            public final void run() {
                this.f115220a.m176752Z3();
            }
        });
        if (NullChecker.m81303a(this.f156650k)) {
            this.f156650k.notifyDataSetChanged();
        }
        m176768k4();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m176759Y3(iqv iqvVar) {
        if (NullChecker.m81303a(this.f156648i)) {
            this.f156648i.m72217k(false);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m176760a4() {
        if (vwb.m200296J(this.f156651l)) {
            return;
        }
        m176755l4();
        if (NullChecker.m81303a(this.f156652m)) {
            this.f156648i.m72215i(BeautyTabItem.BEAUTY, m176751V3(this.f156652m.getValue()));
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m176761b4() {
        act().dialog().m20507G0(ypv.f199497e.getString(R$string.f47039W9)).m20500D(R$string.f46667F0).m20543m0(ypv.f199497e.getString(R$string.f47113a)).m20560v0(ypv.f199497e.getString(R$string.f47289i), new Runnable() { // from class: l.lw2
            @Override // java.lang.Runnable
            public final void run() {
                this.f130236a.m176760a4();
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m176762c4(BLiveBeautyItem bLiveBeautyItem) {
        ((bxl) m129297F3(new bu00(2300))).mo71860L(bLiveBeautyItem.f44337id, 0.0f);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m176763d4(BLiveBeautyItem bLiveBeautyItem) {
        bLiveBeautyItem.resetBeautyValue();
        m176756n4(bLiveBeautyItem);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m176764e4(BLiveBeautyItem bLiveBeautyItem) {
        ((bxl) m129297F3(new bu00(2300))).mo71860L(bLiveBeautyItem.f44337id, new lpd0(twr.m190885b(bLiveBeautyItem.f44337id, ypv.f199493a.m199309D0()), bLiveBeautyItem.getDefaultBeautyValue()).get().floatValue());
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m176765f4(boolean z, final BLiveBeautyItem bLiveBeautyItem) {
        if (z) {
            eet.m116003b(this, "anchor_set_beauty", new e30() { // from class: l.nw2
                @Override // p149l.e30
                public final void call(Object obj) {
                    qw2.m176745O3(bLiveBeautyItem, (Map) obj);
                }
            });
        }
        ((bxl) m129297F3(new bu00(2300))).mo71860L(bLiveBeautyItem.f44337id, bLiveBeautyItem.getValue());
    }

    /* JADX INFO: renamed from: g4 */
    public void m176766g4(BeautyFilterView beautyFilterView) {
        this.f156648i = beautyFilterView;
        init();
        this.f156648i.m72213g(false, "");
        this.f156648i.setOnResetAction(new d30() { // from class: l.kw2
            @Override // p149l.d30
            public final void call() {
                this.f124916a.m176761b4();
            }
        });
        this.f156648i.m72217k(m206027E2().m149816m().m137799f());
        m176768k4();
    }

    public void init() {
        this.f156649j = this.f156648i.getBeautyView();
        this.f156650k = new hu2(this.f156651l, new e30() { // from class: l.pw2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151529a.m176753h4((BLiveBeautyItem) obj);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        int i = t100.f167258g;
        int i2 = t100.f167266o;
        this.f156649j.addItemDecoration(new ylf0(i, i2, i2, 0));
        this.f156649j.setLayoutManager(linearLayoutManager);
        this.f156649j.setAdapter(this.f156650k);
    }

    /* JADX INFO: renamed from: j4 */
    public void m176767j4() {
        if (vwb.m200296J(this.f156651l)) {
            lsi0.m151593w(R$string.f46864O2);
        }
        boolean zM81303a = NullChecker.m81303a(this.f156652m);
        BeautyFilterView beautyFilterView = this.f156648i;
        if (zM81303a) {
            beautyFilterView.m72219m(true);
            this.f156648i.m72215i(BeautyTabItem.BEAUTY, m176751V3(this.f156652m.getValue()));
            this.f156648i.m72214h(this.f156652m.name);
        } else {
            beautyFilterView.m72219m(false);
        }
        this.f156648i.m72213g(false, "");
        this.f156648i.m72218l(false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m176768k4() {
        BeautyFilterView beautyFilterView;
        boolean zM81303a = NullChecker.m81303a(this.f156652m);
        if (!zM81303a || (beautyFilterView = this.f156648i) == null) {
            return;
        }
        beautyFilterView.m72214h(this.f156652m.name);
        this.f156648i.m72215i(BeautyTabItem.BEAUTY, m176751V3(this.f156652m.getValue()));
        this.f156648i.m72219m(zM81303a);
    }

    /* JADX INFO: renamed from: m4 */
    public void m176769m4() {
        vwb.m200354z(this.f156651l, new e30() { // from class: l.ow2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145923a.m176764e4((BLiveBeautyItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public final void m176770o4(final boolean z) {
        vwb.m200354z(this.f156651l, new e30() { // from class: l.jw2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120010a.m176765f4(z, (BLiveBeautyItem) obj);
            }
        });
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        m176754i4((i * 1.0f) / 100.0f, this.f156652m);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        m176756n4(this.f156652m);
    }

    public void reset() {
        vwb.m200354z(this.f156651l, new e30() { // from class: l.mw2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136010a.m176762c4((BLiveBeautyItem) obj);
            }
        });
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
