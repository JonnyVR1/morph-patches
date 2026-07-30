package p149l;

import android.text.TextUtils;
import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.VChatBeautyFilterView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class rlk0 extends weu<rlk0> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: f */
    public VChatBeautyFilterView f159969f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f159970g;

    /* JADX INFO: renamed from: h */
    public hu2 f159971h;

    /* JADX INFO: renamed from: i */
    public final List<BLiveBeautyItem> f159972i;

    /* JADX INFO: renamed from: j */
    public BLiveBeautyItem f159973j;

    /* JADX INFO: renamed from: k */
    public final Map<String, lpd0> f159974k;

    /* JADX INFO: renamed from: l */
    public cxl f159975l;

    public rlk0(jlu jluVar) {
        super(jluVar);
        this.f159972i = new ArrayList();
        this.f159974k = new HashMap();
        this.f159975l = m218409H2().m203944u().m100103b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3, reason: merged with bridge method [inline-methods] */
    public void m179793d3() {
        vwb.m200354z(this.f159972i, new e30() { // from class: l.olk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144511a.m179802j3((BLiveBeautyItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public final int m179795b3(float f) {
        return (int) (f * 100.0f);
    }

    /* JADX INFO: renamed from: c3 */
    public void m179796c3(List<BLiveBeautyItem> list) {
        this.f159972i.clear();
        this.f159972i.addAll(list);
        vwb.m200354z(this.f159972i, new e30() { // from class: l.llk0
            @Override // p149l.e30
            public final void call(Object obj) {
                BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) obj;
                bLiveBeautyItem.setValue(new lpd0(twr.m190895l(bLiveBeautyItem.f44337id, l9s.m149093o0()), bLiveBeautyItem.getDefaultBeautyValue()).get());
            }
        });
        BLiveBeautyItem bLiveBeautyItem = this.f159972i.get(0);
        this.f159973j = bLiveBeautyItem;
        bLiveBeautyItem.setSelected(true);
        if (NullChecker.m81303a(this.f159969f)) {
            this.f159969f.m69831i(BeautyTabItem.BEAUTY, m179795b3(this.f159973j.getValue()));
        }
        e51.m114742G(new Runnable() { // from class: l.mlk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f134452a.m179793d3();
            }
        });
        if (NullChecker.m81303a(this.f159971h)) {
            this.f159971h.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m179797e3() {
        if (vwb.m200296J(this.f159972i)) {
            return;
        }
        m179808q3();
        if (NullChecker.m81303a(this.f159973j)) {
            this.f159969f.m69831i(BeautyTabItem.BEAUTY, m179795b3(this.f159973j.getValue()));
        }
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m179798f3() {
        act().dialog().m20503E0(R$string.f47039W9).m20500D(R$string.f46667F0).m20541k0(R$string.f47113a).m20560v0(ypv.f199497e.getString(R$string.f47289i), new Runnable() { // from class: l.nlk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f139560a.m179797e3();
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m179799g3(BLiveBeautyItem bLiveBeautyItem) {
        this.f159975l.mo98893L(bLiveBeautyItem.f44337id, 0.0f);
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m179800h3(BLiveBeautyItem bLiveBeautyItem) {
        bLiveBeautyItem.resetBeautyValue();
        m179810s3(bLiveBeautyItem);
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m179801i3(BLiveBeautyItem bLiveBeautyItem) {
        this.f159975l.mo98893L(bLiveBeautyItem.f44337id, new lpd0(twr.m190895l(bLiveBeautyItem.f44337id, l9s.m149093o0()), bLiveBeautyItem.getDefaultBeautyValue()).get().floatValue());
    }

    public void init() {
        this.f159970g = this.f159969f.getBeautyView();
        this.f159971h = new hu2(this.f159972i, new e30() { // from class: l.plk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150148a.m179803k3((BLiveBeautyItem) obj);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        int i = t100.f167258g;
        int i2 = t100.f167266o;
        this.f159970g.addItemDecoration(new ylf0(i, i2, i2, 0));
        this.f159970g.setLayoutManager(linearLayoutManager);
        this.f159970g.setAdapter(this.f159971h);
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m179802j3(BLiveBeautyItem bLiveBeautyItem) {
        this.f159975l.mo98893L(bLiveBeautyItem.f44337id, bLiveBeautyItem.getValue());
    }

    /* JADX INFO: renamed from: k3 */
    public final void m179803k3(BLiveBeautyItem bLiveBeautyItem) {
        this.f159973j = bLiveBeautyItem;
        for (int i = 0; i < this.f159972i.size(); i++) {
            BLiveBeautyItem bLiveBeautyItem2 = this.f159972i.get(i);
            bLiveBeautyItem2.setSelected(TextUtils.equals(bLiveBeautyItem2.name, bLiveBeautyItem.name));
        }
        if (bLiveBeautyItem.isSuggested) {
            new hpd0(twr.m190896m(bLiveBeautyItem.f44337id, l9s.m149093o0()), Boolean.TRUE).put(Boolean.FALSE);
        }
        this.f159971h.notifyDataSetChanged();
        this.f159969f.m69830h(bLiveBeautyItem.name);
        this.f159969f.m69829g(slk0.m184829e(m218409H2().m203901A()), "");
        this.f159969f.m69831i(BeautyTabItem.BEAUTY, m179795b3(bLiveBeautyItem.getValue()));
    }

    /* JADX INFO: renamed from: m3 */
    public final void m179804m3(float f, BLiveBeautyItem bLiveBeautyItem) {
        bLiveBeautyItem.setValue(f);
        this.f159975l.mo98893L(bLiveBeautyItem.f44337id, bLiveBeautyItem.getValue());
        this.f159971h.notifyItemChanged(this.f159972i.indexOf(bLiveBeautyItem));
    }

    /* JADX INFO: renamed from: n3 */
    public void m179805n3() {
        if (vwb.m200296J(this.f159972i)) {
            lsi0.m151593w(R$string.f46864O2);
        }
        boolean zM81303a = NullChecker.m81303a(this.f159973j);
        VChatBeautyFilterView vChatBeautyFilterView = this.f159969f;
        if (zM81303a) {
            vChatBeautyFilterView.m69835m(true);
            this.f159969f.m69831i(BeautyTabItem.BEAUTY, m179795b3(this.f159973j.getValue()));
            this.f159969f.m69830h(this.f159973j.name);
        } else {
            vChatBeautyFilterView.m69835m(false);
        }
        this.f159969f.m69829g(slk0.m184829e(m218409H2().m203901A()), "");
        this.f159969f.m69833k(slk0.m184829e(m218409H2().m203901A()));
        this.f159969f.m69834l(false);
    }

    /* JADX INFO: renamed from: o3 */
    public void m179806o3(VChatBeautyFilterView vChatBeautyFilterView) {
        this.f159969f = vChatBeautyFilterView;
        init();
        boolean zM81303a = NullChecker.m81303a(this.f159973j);
        if (zM81303a) {
            this.f159969f.m69830h(this.f159973j.name);
        }
        this.f159969f.m69835m(zM81303a);
        this.f159969f.m69829g(slk0.m184829e(m218409H2().m203901A()), "");
        this.f159969f.setOnResetAction(new d30() { // from class: l.ilk0
            @Override // p149l.d30
            public final void call() {
                this.f113843a.m179798f3();
            }
        });
        this.f159969f.m69833k(slk0.m184829e(m218409H2().m203901A()));
        if (NullChecker.m81303a(this.f159973j)) {
            this.f159969f.m69831i(BeautyTabItem.BEAUTY, m179795b3(this.f159973j.getValue()));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        m179804m3((i * 1.0f) / 100.0f, this.f159973j);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        m179810s3(this.f159973j);
    }

    /* JADX INFO: renamed from: p3 */
    public void m179807p3() {
        this.f159969f.m69833k(slk0.m184829e(m218409H2().m203901A()));
    }

    /* JADX INFO: renamed from: q3 */
    public final void m179808q3() {
        vwb.m200354z(this.f159972i, new e30() { // from class: l.qlk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155238a.m179800h3((BLiveBeautyItem) obj);
            }
        });
        m179793d3();
        this.f159971h.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: r3 */
    public void m179809r3() {
        vwb.m200354z(this.f159972i, new e30() { // from class: l.jlk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118548a.m179801i3((BLiveBeautyItem) obj);
            }
        });
    }

    public void reset() {
        vwb.m200354z(this.f159972i, new e30() { // from class: l.klk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123671a.m179799g3((BLiveBeautyItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final void m179810s3(BLiveBeautyItem bLiveBeautyItem) {
        String strM190895l = twr.m190895l(bLiveBeautyItem.f44337id, l9s.m149093o0());
        lpd0 lpd0Var = this.f159974k.get(strM190895l);
        if (lpd0Var == null) {
            lpd0Var = new lpd0(strM190895l, bLiveBeautyItem.getDefaultBeautyValue());
            this.f159974k.put(strM190895l, lpd0Var);
        }
        lpd0Var.put(Float.valueOf(bLiveBeautyItem.getValue()));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
