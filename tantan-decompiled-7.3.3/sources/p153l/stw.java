package p153l;

import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p051p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p151v.VRecyclerView;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class stw<D extends oo2> extends qct<D> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: i */
    public BeautyFilterView f170617i;

    /* JADX INFO: renamed from: j */
    public boolean f170618j;

    /* JADX INFO: renamed from: k */
    public VRecyclerView f170619k;

    /* JADX INFO: renamed from: l */
    public final HashMap<String, vxd0> f170620l;

    /* JADX INFO: renamed from: m */
    public final List<BLiveBeautyItem> f170621m;

    /* JADX INFO: renamed from: n */
    public itw f170622n;

    /* JADX INFO: renamed from: o */
    public BLiveBeautyItem f170623o;

    /* JADX INFO: renamed from: p */
    public int f170624p;

    /* JADX INFO: renamed from: q */
    public final vxd0 f170625q;

    public stw(dum<D> dumVar) {
        super(dumVar);
        this.f170618j = false;
        this.f170620l = new HashMap<>();
        this.f170621m = new ArrayList();
        this.f170625q = new vxd0(uyr.m198697h(zrv.f205799a.m207631D0()), 0);
    }

    /* JADX INFO: renamed from: T3 */
    private int m187949T3(final int i) {
        String strM198696g = uyr.m198696g(i, zrv.f205799a.m207631D0());
        vxd0 vxd0Var = this.f170620l.get(strM198696g);
        if (vxd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) jyb.m147529r(this.f170621m, new qcj() { // from class: l.otw
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f45185id == i);
                }
            });
            vxd0Var = new vxd0(strM198696g, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultFilterValue);
            this.f170620l.put(strM198696g, vxd0Var);
        }
        return vxd0Var.get().intValue();
    }

    /* JADX INFO: renamed from: U3 */
    private int m187950U3(final int i) {
        String strM198698i = uyr.m198698i(i, zrv.f205799a.m207631D0());
        vxd0 vxd0Var = this.f170620l.get(strM198698i);
        if (vxd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) jyb.m147529r(this.f170621m, new qcj() { // from class: l.ptw
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f45185id == i);
                }
            });
            vxd0Var = new vxd0(strM198698i, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultBeautyValue);
            this.f170620l.put(strM198698i, vxd0Var);
        }
        return vxd0Var.get().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m187951Y3(jsv jsvVar) {
        if (NullChecker.m82486a(this.f170617i)) {
            this.f170617i.m73396g(false, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m187952Z3(vxj0 vxj0Var) {
        m187972j4(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public void m187953b4() {
        this.f170618j = false;
        m213811F2().BeautyEvent.loadBeautyConfig().m199277p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public void m187954d4(BLiveBeautyItem bLiveBeautyItem) {
        jxd0 jxd0Var = zrv.f205801c.f176697h;
        this.f170617i.m73401l(!bLiveBeautyItem.settingTogether);
        this.f170617i.m73397h(bLiveBeautyItem.settingTogether ? zrv.f205803e.getString(R$string.f47493E0) : zrv.f205803e.getString(R$string.f48471x4));
        String str = (String) m138856F3(new wmi(2302));
        m213811F2().BeautyEvent.cleanFilter().m199277p();
        m187973k4(bLiveBeautyItem);
        if (jxd0Var.get().booleanValue() || "0".equals(str)) {
            return;
        }
        o1j0.m165649w(R$string.f47471D0);
        jxd0Var.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f4 */
    private void m187955f4(List<BLiveBeautyItem> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (this.f170625q.get().intValue() == list.get(i2).f45185id) {
                i = i2;
                break;
            }
        }
        m187972j4(i);
    }

    /* JADX INFO: renamed from: h4 */
    private void m187956h4(final int i, int i2) {
        String strM198696g = uyr.m198696g(i, zrv.f205799a.m207631D0());
        vxd0 vxd0Var = this.f170620l.get(strM198696g);
        if (vxd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) jyb.m147529r(this.f170621m, new qcj() { // from class: l.mtw
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f45185id == i);
                }
            });
            vxd0Var = new vxd0(strM198696g, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultFilterValue);
            this.f170620l.put(strM198696g, vxd0Var);
        }
        vxd0Var.put(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: i4 */
    private void m187957i4(final int i, int i2) {
        String strM198698i = uyr.m198698i(i, zrv.f205799a.m207631D0());
        vxd0 vxd0Var = this.f170620l.get(strM198698i);
        if (vxd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) jyb.m147529r(this.f170621m, new qcj() { // from class: l.ntw
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f45185id == i);
                }
            });
            vxd0Var = new vxd0(strM198698i, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultBeautyValue);
            this.f170620l.put(strM198698i, vxd0Var);
        }
        vxd0Var.put(Integer.valueOf(i2));
    }

    private void init() {
        this.f170619k = this.f170617i.getMakeUpStyleView();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        this.f170619k.setLayoutManager(linearLayoutManager);
        itw itwVar = new itw(this.f170621m, new y20() { // from class: l.rtw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164873a.m187954d4((BLiveBeautyItem) obj);
            }
        });
        this.f170622n = itwVar;
        this.f170619k.setAdapter(itwVar);
        if (NullChecker.m82486a(this.f170623o)) {
            m187972j4(this.f170624p);
        }
    }

    /* JADX INFO: renamed from: l4 */
    private void m187958l4(int i) {
        uzl uzlVar = (uzl) m138856F3(new k210(2302));
        if (jyb.m147479J(this.f170621m) || i < 0) {
            return;
        }
        if (i == 0) {
            uzlVar.mo73040F();
            return;
        }
        int iM187949T3 = m187949T3(this.f170621m.get(i).f45185id);
        int iM187950U3 = m187950U3(this.f170621m.get(i).f45185id);
        m187962p4(iM187949T3, iM187950U3);
        m187961o4(iM187949T3, iM187950U3);
    }

    /* JADX INFO: renamed from: m4 */
    private void m187959m4(List<BLiveBeautyItem> list) {
        this.f170621m.clear();
        this.f170621m.addAll(list);
        if (NullChecker.m82486a(this.f170622n)) {
            this.f170622n.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: n4 */
    private void m187960n4(int i) {
        ((uzl) m138856F3(new k210(2302))).mo73064s(this.f170623o.f45185id, ByteDanceHelper.MakeupStyleType.FILTER, (i * 1.0f) / 100.0f);
    }

    /* JADX INFO: renamed from: o4 */
    private void m187961o4(int i, int i2) {
        if (NullChecker.m82486a(this.f170617i)) {
            BeautyFilterView beautyFilterView = this.f170617i;
            BeautyTabItem beautyTabItem = BeautyTabItem.MAKE_UP;
            beautyFilterView.m73398i(beautyTabItem, i);
            this.f170617i.m73399j(beautyTabItem, i2);
        }
    }

    /* JADX INFO: renamed from: p4 */
    private void m187962p4(int i, int i2) {
        m187960n4(i);
        m187963q4(i2);
    }

    /* JADX INFO: renamed from: q4 */
    private void m187963q4(int i) {
        ((uzl) m138856F3(new k210(2302))).mo73064s(this.f170623o.f45185id, ByteDanceHelper.MakeupStyleType.MAKEUP, (i * 1.0f) / 100.0f);
    }

    /* JADX INFO: renamed from: s4 */
    private void m187964s4(int i) {
        if (this.f170619k == null) {
            return;
        }
        this.f170622n.notifyItemChanged(i);
        this.f170622n.notifyItemChanged(this.f170624p);
        if (this.f170617i.getCurrentItem() == BeautyTabItem.MAKE_UP.getIndex()) {
            this.f170617i.m73402m(this.f170624p != 0);
            this.f170617i.m73401l(this.f170624p != 0);
            this.f170617i.m73403n(m213810E2().m202193m().m146880f(), this.f170623o.name);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213810E2().m202192l()).filter(new mbt()).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.jtw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122629a.m187951Y3((jsv) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().BeautyEvent.clearMakeUpStyle().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ktw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128762a.m187952Z3((vxj0) obj);
            }
        }));
        m138860d3(ttw.class, new qcj() { // from class: l.ltw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f133579a.m187968a4((ttw) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public Map<String, Object> m187965V3() {
        HashMap map = new HashMap();
        if (NullChecker.m82486a(this.f170623o)) {
            map.put("makeup_style_id", Integer.valueOf(this.f170623o.f45185id));
            map.put("makeup_style_name", this.f170623o.name);
            map.put("makeup_style_filter_value", this.f170624p == 0 ? "0" : Integer.valueOf(m187949T3(this.f170623o.f45185id)));
            map.put("makeup_style_makeup_value", this.f170624p != 0 ? Integer.valueOf(m187950U3(this.f170623o.f45185id)) : "0");
        }
        return map;
    }

    /* JADX INFO: renamed from: W3 */
    public void m187966W3(List<BLiveBeautyItem> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        m187959m4(list);
        m187955f4(list);
    }

    /* JADX INFO: renamed from: X3 */
    public void m187967X3() {
        this.f170618j = true;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Integer m187968a4(ttw ttwVar) {
        return this.f170625q.get();
    }

    /* JADX INFO: renamed from: c4 */
    public void m187969c4(BeautyFilterView beautyFilterView) {
        this.f170617i = beautyFilterView;
        init();
    }

    /* JADX INFO: renamed from: e4 */
    public void m187970e4() {
        this.f170617i.m73397h(zrv.f205803e.getString(R$string.f48471x4));
        boolean z = this.f170624p != 0;
        this.f170617i.m73401l(z);
        this.f170617i.m73402m(z);
        if (z) {
            BeautyFilterView beautyFilterView = this.f170617i;
            BeautyTabItem beautyTabItem = BeautyTabItem.MAKE_UP;
            beautyFilterView.m73398i(beautyTabItem, m187949T3(this.f170623o.f45185id));
            this.f170617i.m73399j(beautyTabItem, m187950U3(this.f170623o.f45185id));
        }
        if (!jyb.m147479J(this.f170621m)) {
            this.f170617i.m73396g(m213810E2().m202193m().m146880f(), this.f170623o.name);
            this.f170619k.scrollToPosition(this.f170624p);
        } else if (this.f170618j) {
            this.f196919f.dialog().m21503F(zrv.f205803e.getString(R$string.f48166j7)).m21559v0(zrv.f205803e.getString(R$string.f47805Sb), new Runnable() { // from class: l.qtw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159492a.m187953b4();
                }
            }).m21542m0(zrv.f205803e.getString(R$string.f47961a)).m21567z0();
        } else {
            o1j0.m165649w(R$string.f47712O2);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m187971g4() {
        m187958l4(this.f170624p);
    }

    /* JADX INFO: renamed from: j4 */
    public void m187972j4(int i) {
        if (i < 0 || this.f170621m.size() <= i) {
            return;
        }
        m187973k4(this.f170621m.get(i));
        if (NullChecker.m82486a(this.f170619k)) {
            this.f170622n.m142128K(i);
            this.f170619k.scrollToPosition(i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m187973k4(BLiveBeautyItem bLiveBeautyItem) {
        if (this.f170623o == bLiveBeautyItem) {
            return;
        }
        this.f170623o = bLiveBeautyItem;
        int i = this.f170624p;
        this.f170624p = this.f170621m.indexOf(bLiveBeautyItem);
        this.f170625q.put(Integer.valueOf(bLiveBeautyItem.f45185id));
        m187964s4(i);
        m187958l4(this.f170624p);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar.getTag() != null) {
            m187963q4(i);
        } else if (this.f170623o.settingTogether) {
            m187962p4(i, i);
        } else {
            m187960n4(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Object tag = seekBar.getTag();
        BLiveBeautyItem bLiveBeautyItem = this.f170623o;
        if (tag == null) {
            m187956h4(bLiveBeautyItem.f45185id, seekBar.getProgress());
        } else {
            m187957i4(bLiveBeautyItem.f45185id, seekBar.getProgress());
        }
    }

    /* JADX INFO: renamed from: r4 */
    public void m187974r4(boolean z) {
        int i = this.f170624p;
        int i2 = z ? i + 1 : i - 1;
        if (i2 < 0 || this.f170621m.size() <= i2) {
            return;
        }
        if (NullChecker.m82486a(this.f170619k)) {
            this.f170622n.m142128K(i2);
            this.f170619k.scrollToPosition(i2);
        }
        m187954d4(this.f170621m.get(i2));
    }

    public void reset() {
        uzl uzlVar = (uzl) m138856F3(new k210(2302));
        if (jyb.m147479J(uzlVar.mo73065t())) {
            return;
        }
        uzlVar.mo73040F();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
