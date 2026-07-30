package p153l;

import android.text.TextUtils;
import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p151v.VRecyclerView;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class gx2<D extends oo2> extends qct<D> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: i */
    public BeautyFilterView f106882i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f106883j;

    /* JADX INFO: renamed from: k */
    public xu2 f106884k;

    /* JADX INFO: renamed from: l */
    public final List<BLiveBeautyItem> f106885l;

    /* JADX INFO: renamed from: m */
    public BLiveBeautyItem f106886m;

    /* JADX INFO: renamed from: n */
    public final Map<String, nxd0> f106887n;

    public gx2(dum<D> dumVar) {
        super(dumVar);
        this.f106885l = new ArrayList();
        this.f106887n = new HashMap();
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m132716O3(BLiveBeautyItem bLiveBeautyItem, Map map) {
        map.put("beauty_name", bLiveBeautyItem.name);
        map.put("beauty_value", Float.valueOf(bLiveBeautyItem.getValue()));
    }

    /* JADX INFO: renamed from: V3 */
    private int m132722V3(float f) {
        return (int) (f * 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m132723Z3() {
        m132741o4(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public void m132724h4(BLiveBeautyItem bLiveBeautyItem) {
        this.f106886m = bLiveBeautyItem;
        for (int i = 0; i < this.f106885l.size(); i++) {
            BLiveBeautyItem bLiveBeautyItem2 = this.f106885l.get(i);
            bLiveBeautyItem2.setSelected(TextUtils.equals(bLiveBeautyItem2.name, bLiveBeautyItem.name));
        }
        if (bLiveBeautyItem.isSuggested) {
            new jxd0(uyr.m198692c(bLiveBeautyItem.f45185id, zrv.f205799a.m207631D0()), Boolean.TRUE).put(Boolean.FALSE);
        }
        this.f106884k.notifyDataSetChanged();
        this.f106882i.m73397h(bLiveBeautyItem.name);
        this.f106882i.m73396g(false, "");
        this.f106882i.m73398i(BeautyTabItem.BEAUTY, m132722V3(bLiveBeautyItem.getValue()));
    }

    /* JADX INFO: renamed from: i4 */
    private void m132725i4(float f, BLiveBeautyItem bLiveBeautyItem) {
        bLiveBeautyItem.setValue(f);
        ((uzl) m138856F3(new k210(2300))).mo73043L(bLiveBeautyItem.f45185id, bLiveBeautyItem.getValue());
        this.f106884k.notifyItemChanged(this.f106885l.indexOf(bLiveBeautyItem));
    }

    /* JADX INFO: renamed from: l4 */
    private void m132726l4() {
        jyb.m147537z(this.f106885l, new y20() { // from class: l.ww2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191132a.m132734d4((BLiveBeautyItem) obj);
            }
        });
        m132741o4(false);
        this.f106884k.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: n4 */
    private void m132727n4(BLiveBeautyItem bLiveBeautyItem) {
        String strM198691b = uyr.m198691b(bLiveBeautyItem.f45185id, zrv.f205799a.m207631D0());
        nxd0 nxd0Var = this.f106887n.get(strM198691b);
        if (nxd0Var == null) {
            nxd0Var = new nxd0(strM198691b, bLiveBeautyItem.getDefaultBeautyValue());
            this.f106887n.put(strM198691b, nxd0Var);
        }
        bLiveBeautyItem.getValue();
        nxd0Var.put(Float.valueOf(bLiveBeautyItem.getValue()));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213810E2().m202192l()).filter(new mbt()).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.vw2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186060a.m132730Y3((jsv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public Map<String, Object> m132728W3() {
        HashMap map = new HashMap();
        for (BLiveBeautyItem bLiveBeautyItem : this.f106885l) {
            map.put(bLiveBeautyItem.key, Integer.valueOf(m132722V3(bLiveBeautyItem.getValue())));
        }
        return map;
    }

    /* JADX INFO: renamed from: X3 */
    public void m132729X3(List<BLiveBeautyItem> list) {
        this.f106885l.clear();
        this.f106885l.addAll(list);
        jyb.m147537z(this.f106885l, new y20() { // from class: l.xw2
            @Override // p153l.y20
            public final void call(Object obj) {
                BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) obj;
                bLiveBeautyItem.setValue(new nxd0(uyr.m198691b(bLiveBeautyItem.f45185id, zrv.f205799a.m207631D0()), bLiveBeautyItem.getDefaultBeautyValue()).get());
            }
        });
        BLiveBeautyItem bLiveBeautyItem = this.f106885l.get(0);
        this.f106886m = bLiveBeautyItem;
        bLiveBeautyItem.setSelected(true);
        if (NullChecker.m82486a(this.f106882i)) {
            this.f106882i.m73398i(BeautyTabItem.BEAUTY, m132722V3(this.f106886m.getValue()));
        }
        l51.m152887G(new Runnable() { // from class: l.yw2
            @Override // java.lang.Runnable
            public final void run() {
                this.f201776a.m132723Z3();
            }
        });
        if (NullChecker.m82486a(this.f106884k)) {
            this.f106884k.notifyDataSetChanged();
        }
        m132739k4();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m132730Y3(jsv jsvVar) {
        if (NullChecker.m82486a(this.f106882i)) {
            this.f106882i.m73400k(false);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m132731a4() {
        if (jyb.m147479J(this.f106885l)) {
            return;
        }
        m132726l4();
        if (NullChecker.m82486a(this.f106886m)) {
            this.f106882i.m73398i(BeautyTabItem.BEAUTY, m132722V3(this.f106886m.getValue()));
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m132732b4() {
        act().dialog().m21506G0(zrv.f205803e.getString(R$string.f47887W9)).m21499D(R$string.f47515F0).m21542m0(zrv.f205803e.getString(R$string.f47961a)).m21559v0(zrv.f205803e.getString(R$string.f48137i), new Runnable() { // from class: l.bx2
            @Override // java.lang.Runnable
            public final void run() {
                this.f78805a.m132731a4();
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m132733c4(BLiveBeautyItem bLiveBeautyItem) {
        ((uzl) m138856F3(new k210(2300))).mo73043L(bLiveBeautyItem.f45185id, 0.0f);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m132734d4(BLiveBeautyItem bLiveBeautyItem) {
        bLiveBeautyItem.resetBeautyValue();
        m132727n4(bLiveBeautyItem);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m132735e4(BLiveBeautyItem bLiveBeautyItem) {
        ((uzl) m138856F3(new k210(2300))).mo73043L(bLiveBeautyItem.f45185id, new nxd0(uyr.m198691b(bLiveBeautyItem.f45185id, zrv.f205799a.m207631D0()), bLiveBeautyItem.getDefaultBeautyValue()).get().floatValue());
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m132736f4(boolean z, final BLiveBeautyItem bLiveBeautyItem) {
        if (z) {
            fgt.m125530b(this, "anchor_set_beauty", new y20() { // from class: l.dx2
                @Override // p153l.y20
                public final void call(Object obj) {
                    gx2.m132716O3(bLiveBeautyItem, (Map) obj);
                }
            });
        }
        ((uzl) m138856F3(new k210(2300))).mo73043L(bLiveBeautyItem.f45185id, bLiveBeautyItem.getValue());
    }

    /* JADX INFO: renamed from: g4 */
    public void m132737g4(BeautyFilterView beautyFilterView) {
        this.f106882i = beautyFilterView;
        init();
        this.f106882i.m73396g(false, "");
        this.f106882i.setOnResetAction(new x20() { // from class: l.ax2
            @Override // p153l.x20
            public final void call() {
                this.f73812a.m132732b4();
            }
        });
        this.f106882i.m73400k(m213810E2().m202193m().m146880f());
        m132739k4();
    }

    public void init() {
        this.f106883j = this.f106882i.getBeautyView();
        this.f106884k = new xu2(this.f106885l, new y20() { // from class: l.fx2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101231a.m132724h4((BLiveBeautyItem) obj);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        int i = qa00.f156320g;
        int i2 = qa00.f156328o;
        this.f106883j.addItemDecoration(new huf0(i, i2, i2, 0));
        this.f106883j.setLayoutManager(linearLayoutManager);
        this.f106883j.setAdapter(this.f106884k);
    }

    /* JADX INFO: renamed from: j4 */
    public void m132738j4() {
        if (jyb.m147479J(this.f106885l)) {
            o1j0.m165649w(R$string.f47712O2);
        }
        boolean zM82486a = NullChecker.m82486a(this.f106886m);
        BeautyFilterView beautyFilterView = this.f106882i;
        if (zM82486a) {
            beautyFilterView.m73402m(true);
            this.f106882i.m73398i(BeautyTabItem.BEAUTY, m132722V3(this.f106886m.getValue()));
            this.f106882i.m73397h(this.f106886m.name);
        } else {
            beautyFilterView.m73402m(false);
        }
        this.f106882i.m73396g(false, "");
        this.f106882i.m73401l(false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m132739k4() {
        BeautyFilterView beautyFilterView;
        boolean zM82486a = NullChecker.m82486a(this.f106886m);
        if (!zM82486a || (beautyFilterView = this.f106882i) == null) {
            return;
        }
        beautyFilterView.m73397h(this.f106886m.name);
        this.f106882i.m73398i(BeautyTabItem.BEAUTY, m132722V3(this.f106886m.getValue()));
        this.f106882i.m73402m(zM82486a);
    }

    /* JADX INFO: renamed from: m4 */
    public void m132740m4() {
        jyb.m147537z(this.f106885l, new y20() { // from class: l.ex2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96227a.m132735e4((BLiveBeautyItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public final void m132741o4(final boolean z) {
        jyb.m147537z(this.f106885l, new y20() { // from class: l.zw2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206318a.m132736f4(z, (BLiveBeautyItem) obj);
            }
        });
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        m132725i4((i * 1.0f) / 100.0f, this.f106886m);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        m132727n4(this.f106886m);
    }

    public void reset() {
        jyb.m147537z(this.f106885l, new y20() { // from class: l.cx2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84167a.m132733c4((BLiveBeautyItem) obj);
            }
        });
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
