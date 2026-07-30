package p002l;

import android.text.TextUtils;
import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.p1.mobile.putong.live.base.data.BLiveFilterItem;
import com.p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
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
import l.uqd0;
import l.vwb;
import l.w9j;
import l.ypv;
import p002l.ho2;
import rx.c;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xji<D extends ho2> extends pat<D> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: i */
    public BeautyFilterView f22321i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f22322j;

    /* JADX INFO: renamed from: k */
    public final HashMap<String, tpd0> f22323k;

    /* JADX INFO: renamed from: l */
    public pii f22324l;

    /* JADX INFO: renamed from: m */
    public final List<BLiveFilterItem> f22325m;

    /* JADX INFO: renamed from: n */
    public int f22326n;

    /* JADX INFO: renamed from: o */
    public BLiveFilterItem f22327o;

    /* JADX INFO: renamed from: p */
    public boolean f22328p;

    /* JADX INFO: renamed from: q */
    public final uqd0 f22329q;

    public xji(bsm<D> bsmVar) {
        super(bsmVar);
        this.f22323k = new HashMap<>();
        this.f22325m = new ArrayList();
        this.f22328p = false;
        this.f22329q = new uqd0(twr.a(ypv.a.D0()), "0");
    }

    /* JADX INFO: renamed from: P3 */
    private int m25999P3(String str) {
        String strE = twr.e(str, ypv.a.D0());
        tpd0 tpd0Var = this.f22323k.get(strE);
        if (tpd0Var == null) {
            tpd0Var = new tpd0(strE, 80);
            this.f22323k.put(strE, tpd0Var);
        }
        return ((Integer) tpd0Var.get()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m26000U3(iqv iqvVar) {
        if (NullChecker.a(this.f22321i)) {
            this.f22321i.m5686g(false, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m26001V3(soj0 soj0Var) {
        m26019e4(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public void m26002X3() {
        this.f22328p = false;
        m25548F2().BeautyEvent.loadBeautyConfig().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public void m26003Z3(BLiveFilterItem bLiveFilterItem) {
        hpd0 hpd0Var = ypv.c.f19313h;
        int iIntValue = ((Integer) m14184F3(new uqw(2301))).intValue();
        m25548F2().BeautyEvent.clearMakeUpStyle().p();
        m26020f4(bLiveFilterItem);
        if (((Boolean) hpd0Var.get()).booleanValue() || iIntValue == 0) {
            return;
        }
        lsi0.w(R$string.f2665D0);
        hpd0Var.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: b4 */
    private void m26004b4(ArrayList<BLiveFilterItem> arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (TextUtils.equals(arrayList.get(i2).id, (CharSequence) this.f22329q.get())) {
                i = i2;
                break;
            }
        }
        m26019e4(i);
    }

    /* JADX INFO: renamed from: d4 */
    private void m26005d4(String str, int i) {
        String strE = twr.e(str, ypv.a.D0());
        tpd0 tpd0Var = this.f22323k.get(strE);
        if (tpd0Var == null) {
            tpd0Var = new tpd0(strE, 80);
            this.f22323k.put(strE, tpd0Var);
        }
        tpd0Var.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g4 */
    private void m26006g4(int i) {
        bxl bxlVar = (bxl) m14184F3(new bu00(2301));
        List<TTPresetFilter> listMo5260t = bxlVar.mo5260t();
        if (vwb.J(listMo5260t) || listMo5260t.size() <= i || i < 0) {
            return;
        }
        MMPresetFilter mMPresetFilter = listMo5260t.get(i);
        int iM25999P3 = m25999P3(mMPresetFilter.mFilterId);
        bxlVar.mo5256m(mMPresetFilter.lookupUrl);
        m26008i4(iM25999P3);
        m26009j4(iM25999P3);
    }

    /* JADX INFO: renamed from: h4 */
    private void m26007h4(List<BLiveFilterItem> list) {
        this.f22325m.clear();
        this.f22325m.addAll(list);
        if (NullChecker.a(this.f22324l)) {
            this.f22324l.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: i4 */
    private void m26008i4(int i) {
        ((bxl) m14184F3(new bu00(2301))).setIntensity((i * 1.0f) / 100.0f);
    }

    private void init() {
        this.f22322j = this.f22321i.getFilterView();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        this.f22322j.setLayoutManager(linearLayoutManager);
        pii piiVar = new pii(this.f22325m, new e30() { // from class: l.wji
            public final void call(Object obj) {
                this.f21803a.m26003Z3((BLiveFilterItem) obj);
            }
        });
        this.f22324l = piiVar;
        this.f22322j.setAdapter(piiVar);
        if (NullChecker.a(this.f22327o)) {
            m26019e4(this.f22326n);
        }
    }

    /* JADX INFO: renamed from: j4 */
    private void m26009j4(int i) {
        if (NullChecker.a(this.f22321i)) {
            this.f22321i.m5688i(BeautyTabItem.FILTER, i);
        }
    }

    /* JADX INFO: renamed from: l4 */
    private void m26010l4(int i) {
        if (this.f22322j == null) {
            return;
        }
        this.f22324l.notifyItemChanged(i);
        this.f22324l.notifyItemChanged(this.f22326n);
        if (this.f22321i.getCurrentItem() == BeautyTabItem.FILTER.getIndex()) {
            this.f22321i.m5692m(this.f22326n != 0);
            this.f22321i.m5693n(m25547E2().m17237m().m15303f(), this.f22327o.name);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public Map<String, Object> m26011R3() {
        HashMap map = new HashMap();
        if (NullChecker.a(this.f22327o)) {
            map.put("filter_id", this.f22327o.id);
            map.put("filter_name", this.f22327o.name);
            map.put("filter_value", this.f22326n == 0 ? "0" : Integer.valueOf(m25999P3(this.f22327o.id)));
        }
        return map;
    }

    /* JADX INFO: renamed from: S3 */
    public void m26012S3(List<BLiveFilterItem> list) {
        if (vwb.J(list)) {
            return;
        }
        bxl bxlVar = (bxl) m14184F3(new bu00(2301));
        bxlVar.mo5264x(gli.m13891n(list));
        if (vwb.J(bxlVar.mo5260t())) {
            return;
        }
        ArrayList<BLiveFilterItem> arrayList = new ArrayList<>(vwb.n(list, new w9j() { // from class: l.uji
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFilterItem) obj).isFilterFileExist);
            }
        }));
        m26007h4(arrayList);
        m26004b4(arrayList);
    }

    /* JADX INFO: renamed from: T */
    public void m26013T() {
        super.T();
        duringCreated(m25547E2().m17236l()).filter(new l9t()).take(1).subscribe(ffw.d(new e30() { // from class: l.rji
            public final void call(Object obj) {
                this.f18567a.m26000U3((iqv) obj);
            }
        }));
        duringCreated((c) m25548F2().BeautyEvent.cleanFilter().g()).subscribe(ffw.h(new e30() { // from class: l.sji
            public final void call(Object obj) {
                this.f19056a.m26001V3((soj0) obj);
            }
        }));
        m14188d3(aki.class, new w9j() { // from class: l.tji
            public final Object call(Object obj) {
                return this.f20277a.m26015W3((aki) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public void m26014T3() {
        this.f22328p = true;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ String m26015W3(aki akiVar) {
        return (String) this.f22329q.get();
    }

    /* JADX INFO: renamed from: Y3 */
    public void m26016Y3(BeautyFilterView beautyFilterView) {
        this.f22321i = beautyFilterView;
        init();
    }

    /* JADX INFO: renamed from: a4 */
    public void m26017a4() {
        this.f22321i.m5687h(ypv.e.getString(R$string.f3665x4));
        boolean z = this.f22326n != 0;
        this.f22321i.m5691l(false);
        this.f22321i.m5692m(z);
        if (z) {
            this.f22321i.m5688i(BeautyTabItem.FILTER, m25999P3(this.f22327o.id));
        }
        if (!vwb.J(this.f22325m)) {
            this.f22321i.m5686g(m25547E2().m17237m().m15303f(), this.f22327o.name);
            this.f22322j.scrollToPosition(this.f22326n);
        } else if (this.f22328p) {
            this.f22037f.dialog().F(ypv.e.getString(R$string.f3687y4)).v0(ypv.e.getString(R$string.f2999Sb), new Runnable() { // from class: l.vji
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21190a.m26002X3();
                }
            }).m0(ypv.e.getString(R$string.f3155a)).z0();
        } else {
            lsi0.w(R$string.f2906O2);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m26018c4() {
        m26006g4(this.f22326n);
    }

    /* JADX INFO: renamed from: e4 */
    public void m26019e4(int i) {
        if (i < 0 || this.f22325m.size() <= i) {
            return;
        }
        m26020f4(this.f22325m.get(i));
        if (NullChecker.a(this.f22322j)) {
            this.f22324l.m20340K(i);
            this.f22322j.scrollToPosition(i);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m26020f4(BLiveFilterItem bLiveFilterItem) {
        if (this.f22327o == bLiveFilterItem) {
            return;
        }
        this.f22327o = bLiveFilterItem;
        int i = this.f22326n;
        this.f22326n = this.f22325m.indexOf(bLiveFilterItem);
        this.f22329q.put(bLiveFilterItem.id);
        m26006g4(this.f22326n);
        m26010l4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m26021k4(boolean z) {
        int i = this.f22326n;
        int i2 = z ? i + 1 : i - 1;
        if (i2 < 0 || this.f22325m.size() <= i2) {
            return;
        }
        if (NullChecker.a(this.f22322j)) {
            this.f22324l.m20340K(i2);
            this.f22322j.scrollToPosition(i2);
        }
        m26003Z3(this.f22325m.get(i2));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        m26008i4(i);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        m26005d4(this.f22327o.id, seekBar.getProgress());
    }

    public void reset() {
        bxl bxlVar = (bxl) m14184F3(new bu00(2301));
        if (vwb.J(bxlVar.mo5260t())) {
            return;
        }
        bxlVar.mo5256m("");
        m26008i4(0);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
