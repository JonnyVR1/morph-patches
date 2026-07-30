package p153l;

import android.text.TextUtils;
import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveFilterItem;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
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
public class tmi<D extends oo2> extends qct<D> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: i */
    public BeautyFilterView f174934i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f174935j;

    /* JADX INFO: renamed from: k */
    public final HashMap<String, vxd0> f174936k;

    /* JADX INFO: renamed from: l */
    public mli f174937l;

    /* JADX INFO: renamed from: m */
    public final List<BLiveFilterItem> f174938m;

    /* JADX INFO: renamed from: n */
    public int f174939n;

    /* JADX INFO: renamed from: o */
    public BLiveFilterItem f174940o;

    /* JADX INFO: renamed from: p */
    public boolean f174941p;

    /* JADX INFO: renamed from: q */
    public final wyd0 f174942q;

    public tmi(dum<D> dumVar) {
        super(dumVar);
        this.f174936k = new HashMap<>();
        this.f174938m = new ArrayList();
        this.f174941p = false;
        this.f174942q = new wyd0(uyr.m198690a(zrv.f205799a.m207631D0()), "0");
    }

    /* JADX INFO: renamed from: P3 */
    private int m191772P3(String str) {
        String strM198694e = uyr.m198694e(str, zrv.f205799a.m207631D0());
        vxd0 vxd0Var = this.f174936k.get(strM198694e);
        if (vxd0Var == null) {
            vxd0Var = new vxd0(strM198694e, 80);
            this.f174936k.put(strM198694e, vxd0Var);
        }
        return vxd0Var.get().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m191773U3(jsv jsvVar) {
        if (NullChecker.m82486a(this.f174934i)) {
            this.f174934i.m73396g(false, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m191774V3(vxj0 vxj0Var) {
        m191791e4(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public void m191775X3() {
        this.f174941p = false;
        m213811F2().BeautyEvent.loadBeautyConfig().m199277p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public void m191776Z3(BLiveFilterItem bLiveFilterItem) {
        jxd0 jxd0Var = zrv.f205801c.f176697h;
        int iIntValue = ((Integer) m138856F3(new ttw(2301))).intValue();
        m213811F2().BeautyEvent.clearMakeUpStyle().m199277p();
        m191792f4(bLiveFilterItem);
        if (jxd0Var.get().booleanValue() || iIntValue == 0) {
            return;
        }
        o1j0.m165649w(R$string.f47471D0);
        jxd0Var.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: b4 */
    private void m191777b4(ArrayList<BLiveFilterItem> arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (TextUtils.equals(arrayList.get(i2).f45216id, this.f174942q.get())) {
                i = i2;
                break;
            }
        }
        m191791e4(i);
    }

    /* JADX INFO: renamed from: d4 */
    private void m191778d4(String str, int i) {
        String strM198694e = uyr.m198694e(str, zrv.f205799a.m207631D0());
        vxd0 vxd0Var = this.f174936k.get(strM198694e);
        if (vxd0Var == null) {
            vxd0Var = new vxd0(strM198694e, 80);
            this.f174936k.put(strM198694e, vxd0Var);
        }
        vxd0Var.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g4 */
    private void m191779g4(int i) {
        uzl uzlVar = (uzl) m138856F3(new k210(2301));
        List<TTPresetFilter> listMo73065t = uzlVar.mo73065t();
        if (jyb.m147479J(listMo73065t) || listMo73065t.size() <= i || i < 0) {
            return;
        }
        TTPresetFilter tTPresetFilter = listMo73065t.get(i);
        int iM191772P3 = m191772P3(tTPresetFilter.mFilterId);
        uzlVar.mo73061m(tTPresetFilter.lookupUrl);
        m191781i4(iM191772P3);
        m191782j4(iM191772P3);
    }

    /* JADX INFO: renamed from: h4 */
    private void m191780h4(List<BLiveFilterItem> list) {
        this.f174938m.clear();
        this.f174938m.addAll(list);
        if (NullChecker.m82486a(this.f174937l)) {
            this.f174937l.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: i4 */
    private void m191781i4(int i) {
        ((uzl) m138856F3(new k210(2301))).setIntensity((i * 1.0f) / 100.0f);
    }

    private void init() {
        this.f174935j = this.f174934i.getFilterView();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        this.f174935j.setLayoutManager(linearLayoutManager);
        mli mliVar = new mli(this.f174938m, new y20() { // from class: l.smi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169583a.m191776Z3((BLiveFilterItem) obj);
            }
        });
        this.f174937l = mliVar;
        this.f174935j.setAdapter(mliVar);
        if (NullChecker.m82486a(this.f174940o)) {
            m191791e4(this.f174939n);
        }
    }

    /* JADX INFO: renamed from: j4 */
    private void m191782j4(int i) {
        if (NullChecker.m82486a(this.f174934i)) {
            this.f174934i.m73398i(BeautyTabItem.FILTER, i);
        }
    }

    /* JADX INFO: renamed from: l4 */
    private void m191783l4(int i) {
        if (this.f174935j == null) {
            return;
        }
        this.f174937l.notifyItemChanged(i);
        this.f174937l.notifyItemChanged(this.f174939n);
        if (this.f174934i.getCurrentItem() == BeautyTabItem.FILTER.getIndex()) {
            this.f174934i.m73402m(this.f174939n != 0);
            this.f174934i.m73403n(m213810E2().m202193m().m146880f(), this.f174940o.name);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public Map<String, Object> m191784R3() {
        HashMap map = new HashMap();
        if (NullChecker.m82486a(this.f174940o)) {
            map.put("filter_id", this.f174940o.f45216id);
            map.put("filter_name", this.f174940o.name);
            map.put("filter_value", this.f174939n == 0 ? "0" : Integer.valueOf(m191772P3(this.f174940o.f45216id)));
        }
        return map;
    }

    /* JADX INFO: renamed from: S3 */
    public void m191785S3(List<BLiveFilterItem> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        uzl uzlVar = (uzl) m138856F3(new k210(2301));
        uzlVar.mo73069x(coi.m111653n(list));
        if (jyb.m147479J(uzlVar.mo73065t())) {
            return;
        }
        ArrayList<BLiveFilterItem> arrayList = new ArrayList<>(jyb.m147522n(list, new qcj() { // from class: l.qmi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFilterItem) obj).isFilterFileExist);
            }
        }));
        m191780h4(arrayList);
        m191777b4(arrayList);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213810E2().m202192l()).filter(new mbt()).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.nmi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142709a.m191773U3((jsv) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().BeautyEvent.cleanFilter().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.omi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147945a.m191774V3((vxj0) obj);
            }
        }));
        m138860d3(wmi.class, new qcj() { // from class: l.pmi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f153186a.m191787W3((wmi) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public void m191786T3() {
        this.f174941p = true;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ String m191787W3(wmi wmiVar) {
        return this.f174942q.get();
    }

    /* JADX INFO: renamed from: Y3 */
    public void m191788Y3(BeautyFilterView beautyFilterView) {
        this.f174934i = beautyFilterView;
        init();
    }

    /* JADX INFO: renamed from: a4 */
    public void m191789a4() {
        this.f174934i.m73397h(zrv.f205803e.getString(R$string.f48471x4));
        boolean z = this.f174939n != 0;
        this.f174934i.m73401l(false);
        this.f174934i.m73402m(z);
        if (z) {
            this.f174934i.m73398i(BeautyTabItem.FILTER, m191772P3(this.f174940o.f45216id));
        }
        if (!jyb.m147479J(this.f174938m)) {
            this.f174934i.m73396g(m213810E2().m202193m().m146880f(), this.f174940o.name);
            this.f174935j.scrollToPosition(this.f174939n);
        } else if (this.f174941p) {
            this.f196919f.dialog().m21503F(zrv.f205803e.getString(R$string.f48493y4)).m21559v0(zrv.f205803e.getString(R$string.f47805Sb), new Runnable() { // from class: l.rmi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163882a.m191775X3();
                }
            }).m21542m0(zrv.f205803e.getString(R$string.f47961a)).m21567z0();
        } else {
            o1j0.m165649w(R$string.f47712O2);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m191790c4() {
        m191779g4(this.f174939n);
    }

    /* JADX INFO: renamed from: e4 */
    public void m191791e4(int i) {
        if (i < 0 || this.f174938m.size() <= i) {
            return;
        }
        m191792f4(this.f174938m.get(i));
        if (NullChecker.m82486a(this.f174935j)) {
            this.f174937l.m158879K(i);
            this.f174935j.scrollToPosition(i);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m191792f4(BLiveFilterItem bLiveFilterItem) {
        if (this.f174940o == bLiveFilterItem) {
            return;
        }
        this.f174940o = bLiveFilterItem;
        int i = this.f174939n;
        this.f174939n = this.f174938m.indexOf(bLiveFilterItem);
        this.f174942q.put(bLiveFilterItem.f45216id);
        m191779g4(this.f174939n);
        m191783l4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m191793k4(boolean z) {
        int i = this.f174939n;
        int i2 = z ? i + 1 : i - 1;
        if (i2 < 0 || this.f174938m.size() <= i2) {
            return;
        }
        if (NullChecker.m82486a(this.f174935j)) {
            this.f174937l.m158879K(i2);
            this.f174935j.scrollToPosition(i2);
        }
        m191776Z3(this.f174938m.get(i2));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        m191781i4(i);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        m191778d4(this.f174940o.f45216id, seekBar.getProgress());
    }

    public void reset() {
        uzl uzlVar = (uzl) m138856F3(new k210(2301));
        if (jyb.m147479J(uzlVar.mo73065t())) {
            return;
        }
        uzlVar.mo73061m("");
        m191781i4(0);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
