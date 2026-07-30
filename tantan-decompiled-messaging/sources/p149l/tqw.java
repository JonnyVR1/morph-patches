package p149l;

import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p046p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
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
public class tqw<D extends ho2> extends pat<D> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: i */
    public BeautyFilterView f171637i;

    /* JADX INFO: renamed from: j */
    public boolean f171638j;

    /* JADX INFO: renamed from: k */
    public VRecyclerView f171639k;

    /* JADX INFO: renamed from: l */
    public final HashMap<String, tpd0> f171640l;

    /* JADX INFO: renamed from: m */
    public final List<BLiveBeautyItem> f171641m;

    /* JADX INFO: renamed from: n */
    public jqw f171642n;

    /* JADX INFO: renamed from: o */
    public BLiveBeautyItem f171643o;

    /* JADX INFO: renamed from: p */
    public int f171644p;

    /* JADX INFO: renamed from: q */
    public final tpd0 f171645q;

    public tqw(bsm<D> bsmVar) {
        super(bsmVar);
        this.f171638j = false;
        this.f171640l = new HashMap<>();
        this.f171641m = new ArrayList();
        this.f171645q = new tpd0(twr.m190891h(ypv.f199493a.m199309D0()), 0);
    }

    /* JADX INFO: renamed from: T3 */
    private int m190172T3(final int i) {
        String strM190890g = twr.m190890g(i, ypv.f199493a.m199309D0());
        tpd0 tpd0Var = this.f171640l.get(strM190890g);
        if (tpd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) vwb.m200346r(this.f171641m, new w9j() { // from class: l.pqw
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f44337id == i);
                }
            });
            tpd0Var = new tpd0(strM190890g, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultFilterValue);
            this.f171640l.put(strM190890g, tpd0Var);
        }
        return tpd0Var.get().intValue();
    }

    /* JADX INFO: renamed from: U3 */
    private int m190173U3(final int i) {
        String strM190892i = twr.m190892i(i, ypv.f199493a.m199309D0());
        tpd0 tpd0Var = this.f171640l.get(strM190892i);
        if (tpd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) vwb.m200346r(this.f171641m, new w9j() { // from class: l.qqw
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f44337id == i);
                }
            });
            tpd0Var = new tpd0(strM190892i, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultBeautyValue);
            this.f171640l.put(strM190892i, tpd0Var);
        }
        return tpd0Var.get().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m190174Y3(iqv iqvVar) {
        if (NullChecker.m81303a(this.f171637i)) {
            this.f171637i.m72213g(false, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m190175Z3(soj0 soj0Var) {
        m190195j4(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public void m190176b4() {
        this.f171638j = false;
        m206028F2().BeautyEvent.loadBeautyConfig().m172467p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public void m190177d4(BLiveBeautyItem bLiveBeautyItem) {
        hpd0 hpd0Var = ypv.f199495c.f166716h;
        this.f171637i.m72218l(!bLiveBeautyItem.settingTogether);
        this.f171637i.m72214h(bLiveBeautyItem.settingTogether ? ypv.f199497e.getString(R$string.f46645E0) : ypv.f199497e.getString(R$string.f47623x4));
        String str = (String) m129297F3(new aki(2302));
        m206028F2().BeautyEvent.cleanFilter().m172467p();
        m190196k4(bLiveBeautyItem);
        if (hpd0Var.get().booleanValue() || "0".equals(str)) {
            return;
        }
        lsi0.m151593w(R$string.f46623D0);
        hpd0Var.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f4 */
    private void m190178f4(List<BLiveBeautyItem> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (this.f171645q.get().intValue() == list.get(i2).f44337id) {
                i = i2;
                break;
            }
        }
        m190195j4(i);
    }

    /* JADX INFO: renamed from: h4 */
    private void m190179h4(final int i, int i2) {
        String strM190890g = twr.m190890g(i, ypv.f199493a.m199309D0());
        tpd0 tpd0Var = this.f171640l.get(strM190890g);
        if (tpd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) vwb.m200346r(this.f171641m, new w9j() { // from class: l.nqw
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f44337id == i);
                }
            });
            tpd0Var = new tpd0(strM190890g, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultFilterValue);
            this.f171640l.put(strM190890g, tpd0Var);
        }
        tpd0Var.put(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: i4 */
    private void m190180i4(final int i, int i2) {
        String strM190892i = twr.m190892i(i, ypv.f199493a.m199309D0());
        tpd0 tpd0Var = this.f171640l.get(strM190892i);
        if (tpd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) vwb.m200346r(this.f171641m, new w9j() { // from class: l.oqw
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f44337id == i);
                }
            });
            tpd0Var = new tpd0(strM190892i, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultBeautyValue);
            this.f171640l.put(strM190892i, tpd0Var);
        }
        tpd0Var.put(Integer.valueOf(i2));
    }

    private void init() {
        this.f171639k = this.f171637i.getMakeUpStyleView();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        this.f171639k.setLayoutManager(linearLayoutManager);
        jqw jqwVar = new jqw(this.f171641m, new e30() { // from class: l.sqw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166026a.m190177d4((BLiveBeautyItem) obj);
            }
        });
        this.f171642n = jqwVar;
        this.f171639k.setAdapter(jqwVar);
        if (NullChecker.m81303a(this.f171643o)) {
            m190195j4(this.f171644p);
        }
    }

    /* JADX INFO: renamed from: l4 */
    private void m190181l4(int i) {
        bxl bxlVar = (bxl) m129297F3(new bu00(2302));
        if (vwb.m200296J(this.f171641m) || i < 0) {
            return;
        }
        if (i == 0) {
            bxlVar.mo71857F();
            return;
        }
        int iM190172T3 = m190172T3(this.f171641m.get(i).f44337id);
        int iM190173U3 = m190173U3(this.f171641m.get(i).f44337id);
        m190185p4(iM190172T3, iM190173U3);
        m190184o4(iM190172T3, iM190173U3);
    }

    /* JADX INFO: renamed from: m4 */
    private void m190182m4(List<BLiveBeautyItem> list) {
        this.f171641m.clear();
        this.f171641m.addAll(list);
        if (NullChecker.m81303a(this.f171642n)) {
            this.f171642n.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: n4 */
    private void m190183n4(int i) {
        ((bxl) m129297F3(new bu00(2302))).mo71881s(this.f171643o.f44337id, ByteDanceHelper.MakeupStyleType.FILTER, (i * 1.0f) / 100.0f);
    }

    /* JADX INFO: renamed from: o4 */
    private void m190184o4(int i, int i2) {
        if (NullChecker.m81303a(this.f171637i)) {
            BeautyFilterView beautyFilterView = this.f171637i;
            BeautyTabItem beautyTabItem = BeautyTabItem.MAKE_UP;
            beautyFilterView.m72215i(beautyTabItem, i);
            this.f171637i.m72216j(beautyTabItem, i2);
        }
    }

    /* JADX INFO: renamed from: p4 */
    private void m190185p4(int i, int i2) {
        m190183n4(i);
        m190186q4(i2);
    }

    /* JADX INFO: renamed from: q4 */
    private void m190186q4(int i) {
        ((bxl) m129297F3(new bu00(2302))).mo71881s(this.f171643o.f44337id, ByteDanceHelper.MakeupStyleType.MAKEUP, (i * 1.0f) / 100.0f);
    }

    /* JADX INFO: renamed from: s4 */
    private void m190187s4(int i) {
        if (this.f171639k == null) {
            return;
        }
        this.f171642n.notifyItemChanged(i);
        this.f171642n.notifyItemChanged(this.f171644p);
        if (this.f171637i.getCurrentItem() == BeautyTabItem.MAKE_UP.getIndex()) {
            this.f171637i.m72219m(this.f171644p != 0);
            this.f171637i.m72218l(this.f171644p != 0);
            this.f171637i.m72220n(m206027E2().m149816m().m137799f(), this.f171643o.name);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206027E2().m149815l()).filter(new l9t()).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.kqw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124304a.m190174Y3((iqv) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().BeautyEvent.clearMakeUpStyle().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.lqw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129441a.m190175Z3((soj0) obj);
            }
        }));
        m129301d3(uqw.class, new w9j() { // from class: l.mqw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f135309a.m190191a4((uqw) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public Map<String, Object> m190188V3() {
        HashMap map = new HashMap();
        if (NullChecker.m81303a(this.f171643o)) {
            map.put("makeup_style_id", Integer.valueOf(this.f171643o.f44337id));
            map.put("makeup_style_name", this.f171643o.name);
            map.put("makeup_style_filter_value", this.f171644p == 0 ? "0" : Integer.valueOf(m190172T3(this.f171643o.f44337id)));
            map.put("makeup_style_makeup_value", this.f171644p != 0 ? Integer.valueOf(m190173U3(this.f171643o.f44337id)) : "0");
        }
        return map;
    }

    /* JADX INFO: renamed from: W3 */
    public void m190189W3(List<BLiveBeautyItem> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        m190182m4(list);
        m190178f4(list);
    }

    /* JADX INFO: renamed from: X3 */
    public void m190190X3() {
        this.f171638j = true;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Integer m190191a4(uqw uqwVar) {
        return this.f171645q.get();
    }

    /* JADX INFO: renamed from: c4 */
    public void m190192c4(BeautyFilterView beautyFilterView) {
        this.f171637i = beautyFilterView;
        init();
    }

    /* JADX INFO: renamed from: e4 */
    public void m190193e4() {
        this.f171637i.m72214h(ypv.f199497e.getString(R$string.f47623x4));
        boolean z = this.f171644p != 0;
        this.f171637i.m72218l(z);
        this.f171637i.m72219m(z);
        if (z) {
            BeautyFilterView beautyFilterView = this.f171637i;
            BeautyTabItem beautyTabItem = BeautyTabItem.MAKE_UP;
            beautyFilterView.m72215i(beautyTabItem, m190172T3(this.f171643o.f44337id));
            this.f171637i.m72216j(beautyTabItem, m190173U3(this.f171643o.f44337id));
        }
        if (!vwb.m200296J(this.f171641m)) {
            this.f171637i.m72213g(m206027E2().m149816m().m137799f(), this.f171643o.name);
            this.f171639k.scrollToPosition(this.f171644p);
        } else if (this.f171638j) {
            this.f188513f.dialog().m20504F(ypv.f199497e.getString(R$string.f47318j7)).m20560v0(ypv.f199497e.getString(R$string.f46957Sb), new Runnable() { // from class: l.rqw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f160699a.m190176b4();
                }
            }).m20543m0(ypv.f199497e.getString(R$string.f47113a)).m20568z0();
        } else {
            lsi0.m151593w(R$string.f46864O2);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m190194g4() {
        m190181l4(this.f171644p);
    }

    /* JADX INFO: renamed from: j4 */
    public void m190195j4(int i) {
        if (i < 0 || this.f171641m.size() <= i) {
            return;
        }
        m190196k4(this.f171641m.get(i));
        if (NullChecker.m81303a(this.f171639k)) {
            this.f171642n.m142860K(i);
            this.f171639k.scrollToPosition(i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m190196k4(BLiveBeautyItem bLiveBeautyItem) {
        if (this.f171643o == bLiveBeautyItem) {
            return;
        }
        this.f171643o = bLiveBeautyItem;
        int i = this.f171644p;
        this.f171644p = this.f171641m.indexOf(bLiveBeautyItem);
        this.f171645q.put(Integer.valueOf(bLiveBeautyItem.f44337id));
        m190187s4(i);
        m190181l4(this.f171644p);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar.getTag() != null) {
            m190186q4(i);
        } else if (this.f171643o.settingTogether) {
            m190185p4(i, i);
        } else {
            m190183n4(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Object tag = seekBar.getTag();
        BLiveBeautyItem bLiveBeautyItem = this.f171643o;
        if (tag == null) {
            m190179h4(bLiveBeautyItem.f44337id, seekBar.getProgress());
        } else {
            m190180i4(bLiveBeautyItem.f44337id, seekBar.getProgress());
        }
    }

    /* JADX INFO: renamed from: r4 */
    public void m190197r4(boolean z) {
        int i = this.f171644p;
        int i2 = z ? i + 1 : i - 1;
        if (i2 < 0 || this.f171641m.size() <= i2) {
            return;
        }
        if (NullChecker.m81303a(this.f171639k)) {
            this.f171642n.m142860K(i2);
            this.f171639k.scrollToPosition(i2);
        }
        m190177d4(this.f171641m.get(i2));
    }

    public void reset() {
        bxl bxlVar = (bxl) m129297F3(new bu00(2302));
        if (vwb.m200296J(bxlVar.mo71882t())) {
            return;
        }
        bxlVar.mo71857F();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
