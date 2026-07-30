package p002l;

import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e30;
import l.ffw;
import l.hpd0;
import l.lsi0;
import l.soj0;
import l.tpd0;
import l.twr;
import l.vwb;
import l.w9j;
import l.ypv;
import p002l.ho2;
import rx.c;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tqw<D extends ho2> extends pat<D> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: i */
    public BeautyFilterView f20347i;

    /* JADX INFO: renamed from: j */
    public boolean f20348j;

    /* JADX INFO: renamed from: k */
    public VRecyclerView f20349k;

    /* JADX INFO: renamed from: l */
    public final HashMap<String, tpd0> f20350l;

    /* JADX INFO: renamed from: m */
    public final List<BLiveBeautyItem> f20351m;

    /* JADX INFO: renamed from: n */
    public jqw f20352n;

    /* JADX INFO: renamed from: o */
    public BLiveBeautyItem f20353o;

    /* JADX INFO: renamed from: p */
    public int f20354p;

    /* JADX INFO: renamed from: q */
    public final tpd0 f20355q;

    public tqw(bsm<D> bsmVar) {
        super(bsmVar);
        this.f20348j = false;
        this.f20350l = new HashMap<>();
        this.f20351m = new ArrayList();
        this.f20355q = new tpd0(twr.h(ypv.a.D0()), 0);
    }

    /* JADX INFO: renamed from: T3 */
    private int m23124T3(final int i) {
        String strG = twr.g(i, ypv.a.D0());
        tpd0 tpd0Var = this.f20350l.get(strG);
        if (tpd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) vwb.r(this.f20351m, new w9j() { // from class: l.pqw
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).id == i);
                }
            });
            tpd0Var = new tpd0(strG, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultFilterValue);
            this.f20350l.put(strG, tpd0Var);
        }
        return ((Integer) tpd0Var.get()).intValue();
    }

    /* JADX INFO: renamed from: U3 */
    private int m23125U3(final int i) {
        String strI = twr.i(i, ypv.a.D0());
        tpd0 tpd0Var = this.f20350l.get(strI);
        if (tpd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) vwb.r(this.f20351m, new w9j() { // from class: l.qqw
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).id == i);
                }
            });
            tpd0Var = new tpd0(strI, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultBeautyValue);
            this.f20350l.put(strI, tpd0Var);
        }
        return ((Integer) tpd0Var.get()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m23126Y3(iqv iqvVar) {
        if (NullChecker.a(this.f20347i)) {
            this.f20347i.m5686g(false, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m23127Z3(soj0 soj0Var) {
        m23148j4(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public void m23128b4() {
        this.f20348j = false;
        m25548F2().BeautyEvent.loadBeautyConfig().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public void m23129d4(BLiveBeautyItem bLiveBeautyItem) {
        hpd0 hpd0Var = ypv.c.f19313h;
        this.f20347i.m5691l(!bLiveBeautyItem.settingTogether);
        this.f20347i.m5687h(bLiveBeautyItem.settingTogether ? ypv.e.getString(R$string.f2687E0) : ypv.e.getString(R$string.f3665x4));
        String str = (String) m14184F3(new aki(2302));
        m25548F2().BeautyEvent.cleanFilter().p();
        m23149k4(bLiveBeautyItem);
        if (((Boolean) hpd0Var.get()).booleanValue() || "0".equals(str)) {
            return;
        }
        lsi0.w(R$string.f2665D0);
        hpd0Var.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f4 */
    private void m23130f4(List<BLiveBeautyItem> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((Integer) this.f20355q.get()).intValue() == list.get(i2).id) {
                i = i2;
                break;
            }
        }
        m23148j4(i);
    }

    /* JADX INFO: renamed from: h4 */
    private void m23131h4(final int i, int i2) {
        String strG = twr.g(i, ypv.a.D0());
        tpd0 tpd0Var = this.f20350l.get(strG);
        if (tpd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) vwb.r(this.f20351m, new w9j() { // from class: l.nqw
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).id == i);
                }
            });
            tpd0Var = new tpd0(strG, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultFilterValue);
            this.f20350l.put(strG, tpd0Var);
        }
        tpd0Var.put(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: i4 */
    private void m23132i4(final int i, int i2) {
        String strI = twr.i(i, ypv.a.D0());
        tpd0 tpd0Var = this.f20350l.get(strI);
        if (tpd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) vwb.r(this.f20351m, new w9j() { // from class: l.oqw
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).id == i);
                }
            });
            tpd0Var = new tpd0(strI, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultBeautyValue);
            this.f20350l.put(strI, tpd0Var);
        }
        tpd0Var.put(Integer.valueOf(i2));
    }

    private void init() {
        this.f20349k = this.f20347i.getMakeUpStyleView();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        this.f20349k.setLayoutManager(linearLayoutManager);
        jqw jqwVar = new jqw(this.f20351m, new e30() { // from class: l.sqw
            public final void call(Object obj) {
                this.f19257a.m23129d4((BLiveBeautyItem) obj);
            }
        });
        this.f20352n = jqwVar;
        this.f20349k.setAdapter(jqwVar);
        if (NullChecker.a(this.f20353o)) {
            m23148j4(this.f20354p);
        }
    }

    /* JADX INFO: renamed from: l4 */
    private void m23133l4(int i) {
        bxl bxlVar = (bxl) m14184F3(new bu00(2302));
        if (vwb.J(this.f20351m) || i < 0) {
            return;
        }
        if (i == 0) {
            bxlVar.mo5235F();
            return;
        }
        int iM23124T3 = m23124T3(this.f20351m.get(i).id);
        int iM23125U3 = m23125U3(this.f20351m.get(i).id);
        m23137p4(iM23124T3, iM23125U3);
        m23136o4(iM23124T3, iM23125U3);
    }

    /* JADX INFO: renamed from: m4 */
    private void m23134m4(List<BLiveBeautyItem> list) {
        this.f20351m.clear();
        this.f20351m.addAll(list);
        if (NullChecker.a(this.f20352n)) {
            this.f20352n.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: n4 */
    private void m23135n4(int i) {
        ((bxl) m14184F3(new bu00(2302))).mo5259s(this.f20353o.id, ByteDanceHelper.MakeupStyleType.FILTER, (i * 1.0f) / 100.0f);
    }

    /* JADX INFO: renamed from: o4 */
    private void m23136o4(int i, int i2) {
        if (NullChecker.a(this.f20347i)) {
            BeautyFilterView beautyFilterView = this.f20347i;
            BeautyTabItem beautyTabItem = BeautyTabItem.MAKE_UP;
            beautyFilterView.m5688i(beautyTabItem, i);
            this.f20347i.m5689j(beautyTabItem, i2);
        }
    }

    /* JADX INFO: renamed from: p4 */
    private void m23137p4(int i, int i2) {
        m23135n4(i);
        m23138q4(i2);
    }

    /* JADX INFO: renamed from: q4 */
    private void m23138q4(int i) {
        ((bxl) m14184F3(new bu00(2302))).mo5259s(this.f20353o.id, ByteDanceHelper.MakeupStyleType.MAKEUP, (i * 1.0f) / 100.0f);
    }

    /* JADX INFO: renamed from: s4 */
    private void m23139s4(int i) {
        if (this.f20349k == null) {
            return;
        }
        this.f20352n.notifyItemChanged(i);
        this.f20352n.notifyItemChanged(this.f20354p);
        if (this.f20347i.getCurrentItem() == BeautyTabItem.MAKE_UP.getIndex()) {
            this.f20347i.m5692m(this.f20354p != 0);
            this.f20347i.m5691l(this.f20354p != 0);
            this.f20347i.m5693n(m25547E2().m17237m().m15303f(), this.f20353o.name);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m23140T() {
        super.T();
        duringCreated(m25547E2().m17236l()).filter(new l9t()).take(1).subscribe(ffw.d(new e30() { // from class: l.kqw
            public final void call(Object obj) {
                this.f14478a.m23126Y3((iqv) obj);
            }
        }));
        duringCreated((c) m25548F2().BeautyEvent.clearMakeUpStyle().g()).subscribe(ffw.h(new e30() { // from class: l.lqw
            public final void call(Object obj) {
                this.f15008a.m23127Z3((soj0) obj);
            }
        }));
        m14188d3(uqw.class, new w9j() { // from class: l.mqw
            public final Object call(Object obj) {
                return this.f15600a.m23144a4((uqw) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public Map<String, Object> m23141V3() {
        HashMap map = new HashMap();
        if (NullChecker.a(this.f20353o)) {
            map.put("makeup_style_id", Integer.valueOf(this.f20353o.id));
            map.put("makeup_style_name", this.f20353o.name);
            map.put("makeup_style_filter_value", this.f20354p == 0 ? "0" : Integer.valueOf(m23124T3(this.f20353o.id)));
            map.put("makeup_style_makeup_value", this.f20354p != 0 ? Integer.valueOf(m23125U3(this.f20353o.id)) : "0");
        }
        return map;
    }

    /* JADX INFO: renamed from: W3 */
    public void m23142W3(List<BLiveBeautyItem> list) {
        if (vwb.J(list)) {
            return;
        }
        m23134m4(list);
        m23130f4(list);
    }

    /* JADX INFO: renamed from: X3 */
    public void m23143X3() {
        this.f20348j = true;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Integer m23144a4(uqw uqwVar) {
        return (Integer) this.f20355q.get();
    }

    /* JADX INFO: renamed from: c4 */
    public void m23145c4(BeautyFilterView beautyFilterView) {
        this.f20347i = beautyFilterView;
        init();
    }

    /* JADX INFO: renamed from: e4 */
    public void m23146e4() {
        this.f20347i.m5687h(ypv.e.getString(R$string.f3665x4));
        boolean z = this.f20354p != 0;
        this.f20347i.m5691l(z);
        this.f20347i.m5692m(z);
        if (z) {
            BeautyFilterView beautyFilterView = this.f20347i;
            BeautyTabItem beautyTabItem = BeautyTabItem.MAKE_UP;
            beautyFilterView.m5688i(beautyTabItem, m23124T3(this.f20353o.id));
            this.f20347i.m5689j(beautyTabItem, m23125U3(this.f20353o.id));
        }
        if (!vwb.J(this.f20351m)) {
            this.f20347i.m5686g(m25547E2().m17237m().m15303f(), this.f20353o.name);
            this.f20349k.scrollToPosition(this.f20354p);
        } else if (this.f20348j) {
            this.f22037f.dialog().F(ypv.e.getString(R$string.f3360j7)).v0(ypv.e.getString(R$string.f2999Sb), new Runnable() { // from class: l.rqw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18657a.m23128b4();
                }
            }).m0(ypv.e.getString(R$string.f3155a)).z0();
        } else {
            lsi0.w(R$string.f2906O2);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m23147g4() {
        m23133l4(this.f20354p);
    }

    /* JADX INFO: renamed from: j4 */
    public void m23148j4(int i) {
        if (i < 0 || this.f20351m.size() <= i) {
            return;
        }
        m23149k4(this.f20351m.get(i));
        if (NullChecker.a(this.f20349k)) {
            this.f20352n.m16186K(i);
            this.f20349k.scrollToPosition(i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m23149k4(BLiveBeautyItem bLiveBeautyItem) {
        if (this.f20353o == bLiveBeautyItem) {
            return;
        }
        this.f20353o = bLiveBeautyItem;
        int i = this.f20354p;
        this.f20354p = this.f20351m.indexOf(bLiveBeautyItem);
        this.f20355q.put(Integer.valueOf(bLiveBeautyItem.id));
        m23139s4(i);
        m23133l4(this.f20354p);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar.getTag() != null) {
            m23138q4(i);
        } else if (this.f20353o.settingTogether) {
            m23137p4(i, i);
        } else {
            m23135n4(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Object tag = seekBar.getTag();
        BLiveBeautyItem bLiveBeautyItem = this.f20353o;
        if (tag == null) {
            m23131h4(bLiveBeautyItem.id, seekBar.getProgress());
        } else {
            m23132i4(bLiveBeautyItem.id, seekBar.getProgress());
        }
    }

    /* JADX INFO: renamed from: r4 */
    public void m23150r4(boolean z) {
        int i = this.f20354p;
        int i2 = z ? i + 1 : i - 1;
        if (i2 < 0 || this.f20351m.size() <= i2) {
            return;
        }
        if (NullChecker.a(this.f20349k)) {
            this.f20352n.m16186K(i2);
            this.f20349k.scrollToPosition(i2);
        }
        m23129d4(this.f20351m.get(i2));
    }

    public void reset() {
        bxl bxlVar = (bxl) m14184F3(new bu00(2302));
        if (vwb.J(bxlVar.mo5260t())) {
            return;
        }
        bxlVar.mo5235F();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
