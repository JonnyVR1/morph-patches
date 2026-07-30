package p149l;

import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p046p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.VChatBeautyFilterView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class omk0 extends weu<omk0> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: f */
    public final cxl f144656f;

    /* JADX INFO: renamed from: g */
    public VChatBeautyFilterView f144657g;

    /* JADX INFO: renamed from: h */
    public boolean f144658h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f144659i;

    /* JADX INFO: renamed from: j */
    public final HashMap<String, tpd0> f144660j;

    /* JADX INFO: renamed from: k */
    public final List<BLiveBeautyItem> f144661k;

    /* JADX INFO: renamed from: l */
    public jqw f144662l;

    /* JADX INFO: renamed from: m */
    public BLiveBeautyItem f144663m;

    /* JADX INFO: renamed from: n */
    public int f144664n;

    /* JADX INFO: renamed from: o */
    public final tpd0 f144665o;

    /* JADX INFO: renamed from: p */
    public aik0 f144666p;

    public omk0(jlu jluVar, aik0 aik0Var) {
        super(jluVar);
        this.f144658h = false;
        this.f144660j = new HashMap<>();
        this.f144661k = new ArrayList();
        this.f144665o = new tpd0(twr.m190901r(l9s.m149093o0()), 0);
        this.f144666p = aik0Var;
        this.f144656f = aik0Var.f70004k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ void m165117e3(soj0 soj0Var) {
        m165134o3(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public void m165118f3() {
        this.f144658h = false;
        this.f144666p.m96828c3();
    }

    private void init() {
        this.f144659i = this.f144657g.getMakeUpStyleView();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        this.f144659i.setLayoutManager(linearLayoutManager);
        jqw jqwVar = new jqw(this.f144661k, new e30() { // from class: l.mmk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134672a.m165127g3((BLiveBeautyItem) obj);
            }
        });
        this.f144662l = jqwVar;
        this.f144659i.setAdapter(jqwVar);
        if (NullChecker.m81303a(this.f144663m)) {
            m165134o3(this.f144664n);
        }
    }

    /* JADX INFO: renamed from: r3 */
    private void m165119r3(List<BLiveBeautyItem> list) {
        this.f144661k.clear();
        this.f144661k.addAll(list);
        if (NullChecker.m81303a(this.f144662l)) {
            this.f144662l.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: s3 */
    private void m165120s3(int i) {
        this.f144656f.mo98903s(this.f144663m.f44337id, ByteDanceHelper.MakeupStyleType.FILTER, (i * 1.0f) / 100.0f);
    }

    /* JADX INFO: renamed from: x3 */
    private void m165121x3(int i) {
        if (this.f144659i == null) {
            return;
        }
        this.f144662l.notifyItemChanged(i);
        this.f144662l.notifyItemChanged(this.f144664n);
        if (this.f144657g.getCurrentItem() == BeautyTabItem.MAKE_UP.getIndex()) {
            this.f144657g.m69835m(this.f144664n != 0);
            this.f144657g.m69834l(this.f144664n != 0);
            this.f144657g.m69836n(slk0.m184829e(m218409H2().m203901A()), this.f144663m.name);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m218411K2().LiveVideoChatEvent.m69194d().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.hmk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108443a.m165117e3((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z2 */
    public final int m165122Z2(final int i) {
        String strM190900q = twr.m190900q(i, l9s.m149093o0());
        tpd0 tpd0Var = this.f144660j.get(strM190900q);
        if (tpd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) vwb.m200346r(this.f144661k, new w9j() { // from class: l.kmk0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f44337id == i);
                }
            });
            tpd0Var = new tpd0(strM190900q, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultFilterValue);
            this.f144660j.put(strM190900q, tpd0Var);
        }
        return tpd0Var.get().intValue();
    }

    /* JADX INFO: renamed from: a3 */
    public final int m165123a3(final int i) {
        String strM190902s = twr.m190902s(i, l9s.m149093o0());
        tpd0 tpd0Var = this.f144660j.get(strM190902s);
        if (tpd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) vwb.m200346r(this.f144661k, new w9j() { // from class: l.lmk0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f44337id == i);
                }
            });
            tpd0Var = new tpd0(strM190902s, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultBeautyValue);
            this.f144660j.put(strM190902s, tpd0Var);
        }
        return tpd0Var.get().intValue();
    }

    /* JADX INFO: renamed from: b3 */
    public int m165124b3() {
        return this.f144665o.get().intValue();
    }

    /* JADX INFO: renamed from: c3 */
    public void m165125c3(List<BLiveBeautyItem> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        m165119r3(list);
        m165130j3(list);
    }

    /* JADX INFO: renamed from: d3 */
    public void m165126d3() {
        this.f144658h = true;
    }

    /* JADX INFO: renamed from: g3 */
    public final void m165127g3(BLiveBeautyItem bLiveBeautyItem) {
        hpd0 hpd0Var = new hpd0(twr.m190897n(l9s.m149093o0()), Boolean.FALSE);
        this.f144657g.m69834l(!bLiveBeautyItem.settingTogether);
        this.f144657g.m69830h(bLiveBeautyItem.settingTogether ? w8u.m202217t(R$string.f46645E0) : w8u.m202217t(R$string.f47623x4));
        String strM107649X2 = this.f144666p.f70001h.m107649X2();
        m165135p3(bLiveBeautyItem);
        m218411K2().LiveVideoChatEvent.m69193c().m172467p();
        if (hpd0Var.get().booleanValue() || "0".equals(strM107649X2)) {
            return;
        }
        lsi0.m151593w(R$string.f46623D0);
        hpd0Var.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: h3 */
    public void m165128h3() {
        this.f144657g.m69830h(w8u.m202217t(R$string.f47623x4));
        boolean z = this.f144664n != 0;
        this.f144657g.m69834l(z);
        this.f144657g.m69835m(z);
        if (z) {
            VChatBeautyFilterView vChatBeautyFilterView = this.f144657g;
            BeautyTabItem beautyTabItem = BeautyTabItem.MAKE_UP;
            vChatBeautyFilterView.m69831i(beautyTabItem, m165122Z2(this.f144663m.f44337id));
            this.f144657g.m69832j(beautyTabItem, m165123a3(this.f144663m.f44337id));
        }
        if (!vwb.m200296J(this.f144661k)) {
            this.f144657g.m69829g(slk0.m184829e(m218409H2().m203901A()), this.f144663m.name);
            this.f144659i.scrollToPosition(this.f144664n);
        } else if (this.f144658h) {
            act().dialog().m20500D(R$string.f47318j7).m20556t0(R$string.f46957Sb, new Runnable() { // from class: l.nmk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139632a.m165118f3();
                }
            }).m20541k0(R$string.f47113a).m20568z0();
        } else {
            lsi0.m151593w(R$string.f46864O2);
        }
    }

    /* JADX INFO: renamed from: i3 */
    public void m165129i3(VChatBeautyFilterView vChatBeautyFilterView) {
        this.f144657g = vChatBeautyFilterView;
        init();
    }

    /* JADX INFO: renamed from: j3 */
    public final void m165130j3(List<BLiveBeautyItem> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (this.f144665o.get().intValue() == list.get(i2).f44337id) {
                i = i2;
                break;
            }
        }
        m165134o3(i);
    }

    /* JADX INFO: renamed from: k3 */
    public void m165131k3() {
        m165136q3(this.f144664n);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m165132m3(final int i, int i2) {
        String strM190900q = twr.m190900q(i, l9s.m149093o0());
        tpd0 tpd0Var = this.f144660j.get(strM190900q);
        if (tpd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) vwb.m200346r(this.f144661k, new w9j() { // from class: l.imk0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f44337id == i);
                }
            });
            tpd0Var = new tpd0(strM190900q, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultFilterValue);
            this.f144660j.put(strM190900q, tpd0Var);
        }
        tpd0Var.put(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: n3 */
    public final void m165133n3(final int i, int i2) {
        String strM190902s = twr.m190902s(i, l9s.m149093o0());
        tpd0 tpd0Var = this.f144660j.get(strM190902s);
        if (tpd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) vwb.m200346r(this.f144661k, new w9j() { // from class: l.jmk0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f44337id == i);
                }
            });
            tpd0Var = new tpd0(strM190902s, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultBeautyValue);
            this.f144660j.put(strM190902s, tpd0Var);
        }
        tpd0Var.put(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: o3 */
    public void m165134o3(int i) {
        if (i < 0 || this.f144661k.size() <= i) {
            return;
        }
        m165135p3(this.f144661k.get(i));
        if (NullChecker.m81303a(this.f144659i)) {
            this.f144662l.m142860K(i);
            this.f144659i.scrollToPosition(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar.getTag() != null) {
            m165139v3(i);
        } else if (this.f144663m.settingTogether) {
            m165138u3(i, i);
        } else {
            m165120s3(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Object tag = seekBar.getTag();
        BLiveBeautyItem bLiveBeautyItem = this.f144663m;
        if (tag == null) {
            m165132m3(bLiveBeautyItem.f44337id, seekBar.getProgress());
        } else {
            m165133n3(bLiveBeautyItem.f44337id, seekBar.getProgress());
        }
    }

    /* JADX INFO: renamed from: p3 */
    public void m165135p3(BLiveBeautyItem bLiveBeautyItem) {
        if (this.f144663m == bLiveBeautyItem) {
            return;
        }
        this.f144663m = bLiveBeautyItem;
        int i = this.f144664n;
        this.f144664n = this.f144661k.indexOf(bLiveBeautyItem);
        this.f144665o.put(Integer.valueOf(bLiveBeautyItem.f44337id));
        m165121x3(i);
        m165136q3(this.f144664n);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m165136q3(int i) {
        if (vwb.m200296J(this.f144661k) || i < 0) {
            return;
        }
        if (i == 0) {
            this.f144656f.mo98891F();
            return;
        }
        int iM165122Z2 = m165122Z2(this.f144661k.get(i).f44337id);
        int iM165123a3 = m165123a3(this.f144661k.get(i).f44337id);
        m165138u3(iM165122Z2, iM165123a3);
        m165137t3(iM165122Z2, iM165123a3);
    }

    public void reset() {
        if (vwb.m200296J(this.f144656f.mo98904t())) {
            return;
        }
        this.f144656f.mo98891F();
    }

    /* JADX INFO: renamed from: t3 */
    public final void m165137t3(int i, int i2) {
        if (NullChecker.m81303a(this.f144657g)) {
            VChatBeautyFilterView vChatBeautyFilterView = this.f144657g;
            BeautyTabItem beautyTabItem = BeautyTabItem.MAKE_UP;
            vChatBeautyFilterView.m69831i(beautyTabItem, i);
            this.f144657g.m69832j(beautyTabItem, i2);
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final void m165138u3(int i, int i2) {
        m165120s3(i);
        m165139v3(i2);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m165139v3(int i) {
        this.f144656f.mo98903s(this.f144663m.f44337id, ByteDanceHelper.MakeupStyleType.MAKEUP, (i * 1.0f) / 100.0f);
    }

    /* JADX INFO: renamed from: w3 */
    public void m165140w3(boolean z) {
        int i = this.f144664n;
        int i2 = z ? i + 1 : i - 1;
        if (i2 < 0 || this.f144661k.size() <= i2) {
            return;
        }
        if (NullChecker.m81303a(this.f144659i)) {
            this.f144662l.m142860K(i2);
            this.f144659i.scrollToPosition(i2);
        }
        m165127g3(this.f144661k.get(i2));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
