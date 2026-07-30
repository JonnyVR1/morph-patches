package p153l;

import android.text.TextUtils;
import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveFilterItem;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.VChatBeautyFilterView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class ivk0 extends xgu<ivk0> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: f */
    public final vzl f117083f;

    /* JADX INFO: renamed from: g */
    public VChatBeautyFilterView f117084g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f117085h;

    /* JADX INFO: renamed from: i */
    public final HashMap<String, vxd0> f117086i;

    /* JADX INFO: renamed from: j */
    public mli f117087j;

    /* JADX INFO: renamed from: k */
    public final List<BLiveFilterItem> f117088k;

    /* JADX INFO: renamed from: l */
    public int f117089l;

    /* JADX INFO: renamed from: m */
    public BLiveFilterItem f117090m;

    /* JADX INFO: renamed from: n */
    public boolean f117091n;

    /* JADX INFO: renamed from: o */
    public final wyd0 f117092o;

    /* JADX INFO: renamed from: p */
    public grk0 f117093p;

    public ivk0(knu knuVar, grk0 grk0Var) {
        super(knuVar);
        this.f117086i = new HashMap<>();
        this.f117088k = new ArrayList();
        this.f117091n = false;
        this.f117092o = new wyd0(uyr.m198700k(mbs.m157870o0()), "0");
        this.f117093p = grk0Var;
        this.f117083f = grk0Var.f106078k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m142325a3(vxj0 vxj0Var) {
        m142338i3(0);
    }

    private void init() {
        this.f117085h = this.f117084g.getFilterView();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        this.f117085h.setLayoutManager(linearLayoutManager);
        mli mliVar = new mli(this.f117088k, new y20() { // from class: l.gvk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106652a.m142332c3((BLiveFilterItem) obj);
            }
        });
        this.f117087j = mliVar;
        this.f117085h.setAdapter(mliVar);
        if (NullChecker.m82486a(this.f117090m)) {
            m142338i3(this.f117089l);
        }
    }

    /* JADX INFO: renamed from: m3 */
    private void m142326m3(List<BLiveFilterItem> list) {
        this.f117088k.clear();
        this.f117088k.addAll(list);
        if (NullChecker.m82486a(this.f117087j)) {
            this.f117087j.notifyDataSetChanged();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m97928K2().LiveVideoChatEvent.m70376c().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.evk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96007a.m142325a3((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W2 */
    public final int m142327W2(String str) {
        String strM198704o = uyr.m198704o(str, mbs.m157870o0());
        vxd0 vxd0Var = this.f117086i.get(strM198704o);
        if (vxd0Var == null) {
            vxd0Var = new vxd0(strM198704o, 80);
            this.f117086i.put(strM198704o, vxd0Var);
        }
        return vxd0Var.get().intValue();
    }

    /* JADX INFO: renamed from: X2 */
    public String m142328X2() {
        return this.f117092o.get();
    }

    /* JADX INFO: renamed from: Y2 */
    public void m142329Y2(List<BLiveFilterItem> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f117083f.mo143183x(coi.m111653n(list));
        if (jyb.m147479J(this.f117083f.mo143181t())) {
            return;
        }
        ArrayList<BLiveFilterItem> arrayList = new ArrayList<>(jyb.m147522n(list, new qcj() { // from class: l.hvk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFilterItem) obj).isFilterFileExist);
            }
        }));
        m142326m3(arrayList);
        m142335f3(arrayList);
    }

    /* JADX INFO: renamed from: Z2 */
    public void m142330Z2() {
        this.f117091n = true;
    }

    /* JADX INFO: renamed from: b3 */
    public final void m142331b3() {
        this.f117091n = false;
        this.f117093p.m131813c3();
    }

    /* JADX INFO: renamed from: c3 */
    public final void m142332c3(BLiveFilterItem bLiveFilterItem) {
        jxd0 jxd0Var = new jxd0(uyr.m198703n(mbs.m157870o0()), Boolean.FALSE);
        int iM198280b3 = this.f117093p.f106076i.m198280b3();
        m97928K2().LiveVideoChatEvent.m70377d().m199277p();
        m142339j3(bLiveFilterItem);
        if (jxd0Var.get().booleanValue() || iM198280b3 == 0) {
            return;
        }
        o1j0.m165649w(R$string.f47471D0);
        jxd0Var.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d3 */
    public void m142333d3() {
        this.f117084g.m71013h(zrv.f205803e.getString(R$string.f48471x4));
        boolean z = this.f117089l != 0;
        this.f117084g.m71017l(false);
        this.f117084g.m71018m(z);
        if (z) {
            this.f117084g.m71014i(BeautyTabItem.FILTER, m142327W2(this.f117090m.f45216id));
        }
        if (!jyb.m147479J(this.f117088k)) {
            this.f117084g.m71012g(yuk0.m217439e(m97926H2().m212308A()), this.f117090m.name);
            this.f117085h.scrollToPosition(this.f117089l);
        } else if (this.f117091n) {
            act().dialog().m21503F(zrv.f205803e.getString(R$string.f48493y4)).m21559v0(zrv.f205803e.getString(R$string.f47805Sb), new Runnable() { // from class: l.fvk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f101046a.m142331b3();
                }
            }).m21542m0(zrv.f205803e.getString(R$string.f47961a)).m21567z0();
        } else {
            o1j0.m165649w(R$string.f47712O2);
        }
    }

    /* JADX INFO: renamed from: e3 */
    public void m142334e3(VChatBeautyFilterView vChatBeautyFilterView) {
        this.f117084g = vChatBeautyFilterView;
        init();
    }

    /* JADX INFO: renamed from: f3 */
    public final void m142335f3(ArrayList<BLiveFilterItem> arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (TextUtils.equals(arrayList.get(i2).f45216id, this.f117092o.get())) {
                i = i2;
                break;
            }
        }
        m142338i3(i);
    }

    /* JADX INFO: renamed from: g3 */
    public void m142336g3() {
        m142340k3(this.f117089l);
    }

    /* JADX INFO: renamed from: h3 */
    public final void m142337h3(String str, int i) {
        String strM198704o = uyr.m198704o(str, mbs.m157870o0());
        vxd0 vxd0Var = this.f117086i.get(strM198704o);
        if (vxd0Var == null) {
            vxd0Var = new vxd0(strM198704o, 80);
            this.f117086i.put(strM198704o, vxd0Var);
        }
        vxd0Var.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i3 */
    public void m142338i3(int i) {
        if (i < 0 || this.f117088k.size() <= i) {
            return;
        }
        m142339j3(this.f117088k.get(i));
        if (NullChecker.m82486a(this.f117085h)) {
            this.f117087j.m158879K(i);
            this.f117085h.scrollToPosition(i);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public void m142339j3(BLiveFilterItem bLiveFilterItem) {
        if (this.f117090m == bLiveFilterItem) {
            return;
        }
        this.f117090m = bLiveFilterItem;
        int i = this.f117089l;
        this.f117089l = this.f117088k.indexOf(bLiveFilterItem);
        this.f117092o.put(bLiveFilterItem.f45216id);
        m142340k3(this.f117089l);
        m142344q3(i);
    }

    /* JADX INFO: renamed from: k3 */
    public final void m142340k3(int i) {
        List<TTPresetFilter> listMo143181t = this.f117083f.mo143181t();
        if (jyb.m147479J(listMo143181t) || listMo143181t.size() <= i || i < 0) {
            return;
        }
        TTPresetFilter tTPresetFilter = listMo143181t.get(i);
        int iM142327W2 = m142327W2(tTPresetFilter.mFilterId);
        this.f117083f.mo143179m(tTPresetFilter.lookupUrl);
        m142341n3(iM142327W2);
        m142342o3(iM142327W2);
    }

    /* JADX INFO: renamed from: n3 */
    public final void m142341n3(int i) {
        this.f117083f.setIntensity((i * 1.0f) / 100.0f);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m142342o3(int i) {
        if (NullChecker.m82486a(this.f117084g)) {
            this.f117084g.m71014i(BeautyTabItem.FILTER, i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        m142341n3(i);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        m142337h3(this.f117090m.f45216id, seekBar.getProgress());
    }

    /* JADX INFO: renamed from: p3 */
    public void m142343p3(boolean z) {
        int i = this.f117089l;
        int i2 = z ? i + 1 : i - 1;
        if (i2 < 0 || this.f117088k.size() <= i2) {
            return;
        }
        if (NullChecker.m82486a(this.f117085h)) {
            this.f117087j.m158879K(i2);
            this.f117085h.scrollToPosition(i2);
        }
        m142332c3(this.f117088k.get(i2));
    }

    /* JADX INFO: renamed from: q3 */
    public final void m142344q3(int i) {
        if (this.f117085h == null) {
            return;
        }
        this.f117087j.notifyItemChanged(i);
        this.f117087j.notifyItemChanged(this.f117089l);
        if (this.f117084g.getCurrentItem() == BeautyTabItem.FILTER.getIndex()) {
            this.f117084g.m71018m(this.f117089l != 0);
            this.f117084g.m71019n(yuk0.m217439e(m97926H2().m212308A()), this.f117090m.name);
        }
    }

    public void reset() {
        if (jyb.m147479J(this.f117083f.mo143181t())) {
            return;
        }
        this.f117083f.mo143179m("");
        m142341n3(0);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
