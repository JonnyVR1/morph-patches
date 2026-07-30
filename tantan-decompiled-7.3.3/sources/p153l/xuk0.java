package p153l;

import android.text.TextUtils;
import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.VChatBeautyFilterView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class xuk0 extends xgu<xuk0> implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: f */
    public VChatBeautyFilterView f196291f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f196292g;

    /* JADX INFO: renamed from: h */
    public xu2 f196293h;

    /* JADX INFO: renamed from: i */
    public final List<BLiveBeautyItem> f196294i;

    /* JADX INFO: renamed from: j */
    public BLiveBeautyItem f196295j;

    /* JADX INFO: renamed from: k */
    public final Map<String, nxd0> f196296k;

    /* JADX INFO: renamed from: l */
    public vzl f196297l;

    public xuk0(knu knuVar) {
        super(knuVar);
        this.f196294i = new ArrayList();
        this.f196296k = new HashMap();
        this.f196297l = m97926H2().m212351u().m129894b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3, reason: merged with bridge method [inline-methods] */
    public void m213142d3() {
        jyb.m147537z(this.f196294i, new y20() { // from class: l.uuk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181082a.m213151j3((BLiveBeautyItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public final int m213144b3(float f) {
        return (int) (f * 100.0f);
    }

    /* JADX INFO: renamed from: c3 */
    public void m213145c3(List<BLiveBeautyItem> list) {
        this.f196294i.clear();
        this.f196294i.addAll(list);
        jyb.m147537z(this.f196294i, new y20() { // from class: l.ruk0
            @Override // p153l.y20
            public final void call(Object obj) {
                BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) obj;
                bLiveBeautyItem.setValue(new nxd0(uyr.m198701l(bLiveBeautyItem.f45185id, mbs.m157870o0()), bLiveBeautyItem.getDefaultBeautyValue()).get());
            }
        });
        BLiveBeautyItem bLiveBeautyItem = this.f196294i.get(0);
        this.f196295j = bLiveBeautyItem;
        bLiveBeautyItem.setSelected(true);
        if (NullChecker.m82486a(this.f196291f)) {
            this.f196291f.m71014i(BeautyTabItem.BEAUTY, m213144b3(this.f196295j.getValue()));
        }
        l51.m152887G(new Runnable() { // from class: l.suk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f170694a.m213142d3();
            }
        });
        if (NullChecker.m82486a(this.f196293h)) {
            this.f196293h.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m213146e3() {
        if (jyb.m147479J(this.f196294i)) {
            return;
        }
        m213157q3();
        if (NullChecker.m82486a(this.f196295j)) {
            this.f196291f.m71014i(BeautyTabItem.BEAUTY, m213144b3(this.f196295j.getValue()));
        }
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m213147f3() {
        act().dialog().m21502E0(R$string.f47887W9).m21499D(R$string.f47515F0).m21540k0(R$string.f47961a).m21559v0(zrv.f205803e.getString(R$string.f48137i), new Runnable() { // from class: l.tuk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f176197a.m213146e3();
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m213148g3(BLiveBeautyItem bLiveBeautyItem) {
        this.f196297l.mo143170L(bLiveBeautyItem.f45185id, 0.0f);
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m213149h3(BLiveBeautyItem bLiveBeautyItem) {
        bLiveBeautyItem.resetBeautyValue();
        m213159s3(bLiveBeautyItem);
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m213150i3(BLiveBeautyItem bLiveBeautyItem) {
        this.f196297l.mo143170L(bLiveBeautyItem.f45185id, new nxd0(uyr.m198701l(bLiveBeautyItem.f45185id, mbs.m157870o0()), bLiveBeautyItem.getDefaultBeautyValue()).get().floatValue());
    }

    public void init() {
        this.f196292g = this.f196291f.getBeautyView();
        this.f196293h = new xu2(this.f196294i, new y20() { // from class: l.vuk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185822a.m213152k3((BLiveBeautyItem) obj);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        int i = qa00.f156320g;
        int i2 = qa00.f156328o;
        this.f196292g.addItemDecoration(new huf0(i, i2, i2, 0));
        this.f196292g.setLayoutManager(linearLayoutManager);
        this.f196292g.setAdapter(this.f196293h);
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m213151j3(BLiveBeautyItem bLiveBeautyItem) {
        this.f196297l.mo143170L(bLiveBeautyItem.f45185id, bLiveBeautyItem.getValue());
    }

    /* JADX INFO: renamed from: k3 */
    public final void m213152k3(BLiveBeautyItem bLiveBeautyItem) {
        this.f196295j = bLiveBeautyItem;
        for (int i = 0; i < this.f196294i.size(); i++) {
            BLiveBeautyItem bLiveBeautyItem2 = this.f196294i.get(i);
            bLiveBeautyItem2.setSelected(TextUtils.equals(bLiveBeautyItem2.name, bLiveBeautyItem.name));
        }
        if (bLiveBeautyItem.isSuggested) {
            new jxd0(uyr.m198702m(bLiveBeautyItem.f45185id, mbs.m157870o0()), Boolean.TRUE).put(Boolean.FALSE);
        }
        this.f196293h.notifyDataSetChanged();
        this.f196291f.m71013h(bLiveBeautyItem.name);
        this.f196291f.m71012g(yuk0.m217439e(m97926H2().m212308A()), "");
        this.f196291f.m71014i(BeautyTabItem.BEAUTY, m213144b3(bLiveBeautyItem.getValue()));
    }

    /* JADX INFO: renamed from: m3 */
    public final void m213153m3(float f, BLiveBeautyItem bLiveBeautyItem) {
        bLiveBeautyItem.setValue(f);
        this.f196297l.mo143170L(bLiveBeautyItem.f45185id, bLiveBeautyItem.getValue());
        this.f196293h.notifyItemChanged(this.f196294i.indexOf(bLiveBeautyItem));
    }

    /* JADX INFO: renamed from: n3 */
    public void m213154n3() {
        if (jyb.m147479J(this.f196294i)) {
            o1j0.m165649w(R$string.f47712O2);
        }
        boolean zM82486a = NullChecker.m82486a(this.f196295j);
        VChatBeautyFilterView vChatBeautyFilterView = this.f196291f;
        if (zM82486a) {
            vChatBeautyFilterView.m71018m(true);
            this.f196291f.m71014i(BeautyTabItem.BEAUTY, m213144b3(this.f196295j.getValue()));
            this.f196291f.m71013h(this.f196295j.name);
        } else {
            vChatBeautyFilterView.m71018m(false);
        }
        this.f196291f.m71012g(yuk0.m217439e(m97926H2().m212308A()), "");
        this.f196291f.m71016k(yuk0.m217439e(m97926H2().m212308A()));
        this.f196291f.m71017l(false);
    }

    /* JADX INFO: renamed from: o3 */
    public void m213155o3(VChatBeautyFilterView vChatBeautyFilterView) {
        this.f196291f = vChatBeautyFilterView;
        init();
        boolean zM82486a = NullChecker.m82486a(this.f196295j);
        if (zM82486a) {
            this.f196291f.m71013h(this.f196295j.name);
        }
        this.f196291f.m71018m(zM82486a);
        this.f196291f.m71012g(yuk0.m217439e(m97926H2().m212308A()), "");
        this.f196291f.setOnResetAction(new x20() { // from class: l.ouk0
            @Override // p153l.x20
            public final void call() {
                this.f149174a.m213147f3();
            }
        });
        this.f196291f.m71016k(yuk0.m217439e(m97926H2().m212308A()));
        if (NullChecker.m82486a(this.f196295j)) {
            this.f196291f.m71014i(BeautyTabItem.BEAUTY, m213144b3(this.f196295j.getValue()));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        m213153m3((i * 1.0f) / 100.0f, this.f196295j);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        m213159s3(this.f196295j);
    }

    /* JADX INFO: renamed from: p3 */
    public void m213156p3() {
        this.f196291f.m71016k(yuk0.m217439e(m97926H2().m212308A()));
    }

    /* JADX INFO: renamed from: q3 */
    public final void m213157q3() {
        jyb.m147537z(this.f196294i, new y20() { // from class: l.wuk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190873a.m213149h3((BLiveBeautyItem) obj);
            }
        });
        m213142d3();
        this.f196293h.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: r3 */
    public void m213158r3() {
        jyb.m147537z(this.f196294i, new y20() { // from class: l.puk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154196a.m213150i3((BLiveBeautyItem) obj);
            }
        });
    }

    public void reset() {
        jyb.m147537z(this.f196294i, new y20() { // from class: l.quk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159589a.m213148g3((BLiveBeautyItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final void m213159s3(BLiveBeautyItem bLiveBeautyItem) {
        String strM198701l = uyr.m198701l(bLiveBeautyItem.f45185id, mbs.m157870o0());
        nxd0 nxd0Var = this.f196296k.get(strM198701l);
        if (nxd0Var == null) {
            nxd0Var = new nxd0(strM198701l, bLiveBeautyItem.getDefaultBeautyValue());
            this.f196296k.put(strM198701l, nxd0Var);
        }
        nxd0Var.put(Float.valueOf(bLiveBeautyItem.getValue()));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
