package p153l;

import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p051p1.mobile.putong.live.base.mmsdk.beauty.ByteDanceHelper;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.VChatBeautyFilterView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class uvk0 extends xgu<uvk0> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: f */
    public final vzl f181144f;

    /* JADX INFO: renamed from: g */
    public VChatBeautyFilterView f181145g;

    /* JADX INFO: renamed from: h */
    public boolean f181146h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f181147i;

    /* JADX INFO: renamed from: j */
    public final HashMap<String, vxd0> f181148j;

    /* JADX INFO: renamed from: k */
    public final List<BLiveBeautyItem> f181149k;

    /* JADX INFO: renamed from: l */
    public itw f181150l;

    /* JADX INFO: renamed from: m */
    public BLiveBeautyItem f181151m;

    /* JADX INFO: renamed from: n */
    public int f181152n;

    /* JADX INFO: renamed from: o */
    public final vxd0 f181153o;

    /* JADX INFO: renamed from: p */
    public grk0 f181154p;

    public uvk0(knu knuVar, grk0 grk0Var) {
        super(knuVar);
        this.f181146h = false;
        this.f181148j = new HashMap<>();
        this.f181149k = new ArrayList();
        this.f181153o = new vxd0(uyr.m198707r(mbs.m157870o0()), 0);
        this.f181154p = grk0Var;
        this.f181144f = grk0Var.f106078k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ void m198273e3(vxj0 vxj0Var) {
        m198290o3(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public void m198274f3() {
        this.f181146h = false;
        this.f181154p.m131813c3();
    }

    private void init() {
        this.f181147i = this.f181145g.getMakeUpStyleView();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        this.f181147i.setLayoutManager(linearLayoutManager);
        itw itwVar = new itw(this.f181149k, new y20() { // from class: l.svk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170853a.m198283g3((BLiveBeautyItem) obj);
            }
        });
        this.f181150l = itwVar;
        this.f181147i.setAdapter(itwVar);
        if (NullChecker.m82486a(this.f181151m)) {
            m198290o3(this.f181152n);
        }
    }

    /* JADX INFO: renamed from: r3 */
    private void m198275r3(List<BLiveBeautyItem> list) {
        this.f181149k.clear();
        this.f181149k.addAll(list);
        if (NullChecker.m82486a(this.f181150l)) {
            this.f181150l.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: s3 */
    private void m198276s3(int i) {
        this.f181144f.mo143180s(this.f181151m.f45185id, ByteDanceHelper.MakeupStyleType.FILTER, (i * 1.0f) / 100.0f);
    }

    /* JADX INFO: renamed from: x3 */
    private void m198277x3(int i) {
        if (this.f181147i == null) {
            return;
        }
        this.f181150l.notifyItemChanged(i);
        this.f181150l.notifyItemChanged(this.f181152n);
        if (this.f181145g.getCurrentItem() == BeautyTabItem.MAKE_UP.getIndex()) {
            this.f181145g.m71018m(this.f181152n != 0);
            this.f181145g.m71017l(this.f181152n != 0);
            this.f181145g.m71019n(yuk0.m217439e(m97926H2().m212308A()), this.f181151m.name);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m97928K2().LiveVideoChatEvent.m70377d().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.nvk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143812a.m198273e3((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z2 */
    public final int m198278Z2(final int i) {
        String strM198706q = uyr.m198706q(i, mbs.m157870o0());
        vxd0 vxd0Var = this.f181148j.get(strM198706q);
        if (vxd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) jyb.m147529r(this.f181149k, new qcj() { // from class: l.qvk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f45185id == i);
                }
            });
            vxd0Var = new vxd0(strM198706q, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultFilterValue);
            this.f181148j.put(strM198706q, vxd0Var);
        }
        return vxd0Var.get().intValue();
    }

    /* JADX INFO: renamed from: a3 */
    public final int m198279a3(final int i) {
        String strM198708s = uyr.m198708s(i, mbs.m157870o0());
        vxd0 vxd0Var = this.f181148j.get(strM198708s);
        if (vxd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) jyb.m147529r(this.f181149k, new qcj() { // from class: l.rvk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f45185id == i);
                }
            });
            vxd0Var = new vxd0(strM198708s, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultBeautyValue);
            this.f181148j.put(strM198708s, vxd0Var);
        }
        return vxd0Var.get().intValue();
    }

    /* JADX INFO: renamed from: b3 */
    public int m198280b3() {
        return this.f181153o.get().intValue();
    }

    /* JADX INFO: renamed from: c3 */
    public void m198281c3(List<BLiveBeautyItem> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        m198275r3(list);
        m198286j3(list);
    }

    /* JADX INFO: renamed from: d3 */
    public void m198282d3() {
        this.f181146h = true;
    }

    /* JADX INFO: renamed from: g3 */
    public final void m198283g3(BLiveBeautyItem bLiveBeautyItem) {
        jxd0 jxd0Var = new jxd0(uyr.m198703n(mbs.m157870o0()), Boolean.FALSE);
        this.f181145g.m71017l(!bLiveBeautyItem.settingTogether);
        this.f181145g.m71013h(bLiveBeautyItem.settingTogether ? xau.m209910t(R$string.f47493E0) : xau.m209910t(R$string.f48471x4));
        String strM142328X2 = this.f181154p.f106075h.m142328X2();
        m198291p3(bLiveBeautyItem);
        m97928K2().LiveVideoChatEvent.m70376c().m199277p();
        if (jxd0Var.get().booleanValue() || "0".equals(strM142328X2)) {
            return;
        }
        o1j0.m165649w(R$string.f47471D0);
        jxd0Var.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: h3 */
    public void m198284h3() {
        this.f181145g.m71013h(xau.m209910t(R$string.f48471x4));
        boolean z = this.f181152n != 0;
        this.f181145g.m71017l(z);
        this.f181145g.m71018m(z);
        if (z) {
            VChatBeautyFilterView vChatBeautyFilterView = this.f181145g;
            BeautyTabItem beautyTabItem = BeautyTabItem.MAKE_UP;
            vChatBeautyFilterView.m71014i(beautyTabItem, m198278Z2(this.f181151m.f45185id));
            this.f181145g.m71015j(beautyTabItem, m198279a3(this.f181151m.f45185id));
        }
        if (!jyb.m147479J(this.f181149k)) {
            this.f181145g.m71012g(yuk0.m217439e(m97926H2().m212308A()), this.f181151m.name);
            this.f181147i.scrollToPosition(this.f181152n);
        } else if (this.f181146h) {
            act().dialog().m21499D(R$string.f48166j7).m21555t0(R$string.f47805Sb, new Runnable() { // from class: l.tvk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176267a.m198274f3();
                }
            }).m21540k0(R$string.f47961a).m21567z0();
        } else {
            o1j0.m165649w(R$string.f47712O2);
        }
    }

    /* JADX INFO: renamed from: i3 */
    public void m198285i3(VChatBeautyFilterView vChatBeautyFilterView) {
        this.f181145g = vChatBeautyFilterView;
        init();
    }

    /* JADX INFO: renamed from: j3 */
    public final void m198286j3(List<BLiveBeautyItem> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (this.f181153o.get().intValue() == list.get(i2).f45185id) {
                i = i2;
                break;
            }
        }
        m198290o3(i);
    }

    /* JADX INFO: renamed from: k3 */
    public void m198287k3() {
        m198292q3(this.f181152n);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m198288m3(final int i, int i2) {
        String strM198706q = uyr.m198706q(i, mbs.m157870o0());
        vxd0 vxd0Var = this.f181148j.get(strM198706q);
        if (vxd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) jyb.m147529r(this.f181149k, new qcj() { // from class: l.ovk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f45185id == i);
                }
            });
            vxd0Var = new vxd0(strM198706q, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultFilterValue);
            this.f181148j.put(strM198706q, vxd0Var);
        }
        vxd0Var.put(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: n3 */
    public final void m198289n3(final int i, int i2) {
        String strM198708s = uyr.m198708s(i, mbs.m157870o0());
        vxd0 vxd0Var = this.f181148j.get(strM198708s);
        if (vxd0Var == null) {
            BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) jyb.m147529r(this.f181149k, new qcj() { // from class: l.pvk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveBeautyItem) obj).f45185id == i);
                }
            });
            vxd0Var = new vxd0(strM198708s, bLiveBeautyItem == null ? 50 : bLiveBeautyItem.defaultBeautyValue);
            this.f181148j.put(strM198708s, vxd0Var);
        }
        vxd0Var.put(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: o3 */
    public void m198290o3(int i) {
        if (i < 0 || this.f181149k.size() <= i) {
            return;
        }
        m198291p3(this.f181149k.get(i));
        if (NullChecker.m82486a(this.f181147i)) {
            this.f181150l.m142128K(i);
            this.f181147i.scrollToPosition(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar.getTag() != null) {
            m198295v3(i);
        } else if (this.f181151m.settingTogether) {
            m198294u3(i, i);
        } else {
            m198276s3(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Object tag = seekBar.getTag();
        BLiveBeautyItem bLiveBeautyItem = this.f181151m;
        if (tag == null) {
            m198288m3(bLiveBeautyItem.f45185id, seekBar.getProgress());
        } else {
            m198289n3(bLiveBeautyItem.f45185id, seekBar.getProgress());
        }
    }

    /* JADX INFO: renamed from: p3 */
    public void m198291p3(BLiveBeautyItem bLiveBeautyItem) {
        if (this.f181151m == bLiveBeautyItem) {
            return;
        }
        this.f181151m = bLiveBeautyItem;
        int i = this.f181152n;
        this.f181152n = this.f181149k.indexOf(bLiveBeautyItem);
        this.f181153o.put(Integer.valueOf(bLiveBeautyItem.f45185id));
        m198277x3(i);
        m198292q3(this.f181152n);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m198292q3(int i) {
        if (jyb.m147479J(this.f181149k) || i < 0) {
            return;
        }
        if (i == 0) {
            this.f181144f.mo143168F();
            return;
        }
        int iM198278Z2 = m198278Z2(this.f181149k.get(i).f45185id);
        int iM198279a3 = m198279a3(this.f181149k.get(i).f45185id);
        m198294u3(iM198278Z2, iM198279a3);
        m198293t3(iM198278Z2, iM198279a3);
    }

    public void reset() {
        if (jyb.m147479J(this.f181144f.mo143181t())) {
            return;
        }
        this.f181144f.mo143168F();
    }

    /* JADX INFO: renamed from: t3 */
    public final void m198293t3(int i, int i2) {
        if (NullChecker.m82486a(this.f181145g)) {
            VChatBeautyFilterView vChatBeautyFilterView = this.f181145g;
            BeautyTabItem beautyTabItem = BeautyTabItem.MAKE_UP;
            vChatBeautyFilterView.m71014i(beautyTabItem, i);
            this.f181145g.m71015j(beautyTabItem, i2);
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final void m198294u3(int i, int i2) {
        m198276s3(i);
        m198295v3(i2);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m198295v3(int i) {
        this.f181144f.mo143180s(this.f181151m.f45185id, ByteDanceHelper.MakeupStyleType.MAKEUP, (i * 1.0f) / 100.0f);
    }

    /* JADX INFO: renamed from: w3 */
    public void m198296w3(boolean z) {
        int i = this.f181152n;
        int i2 = z ? i + 1 : i - 1;
        if (i2 < 0 || this.f181149k.size() <= i2) {
            return;
        }
        if (NullChecker.m82486a(this.f181147i)) {
            this.f181150l.m142128K(i2);
            this.f181147i.scrollToPosition(i2);
        }
        m198283g3(this.f181149k.get(i2));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
