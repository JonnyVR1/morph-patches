package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantanapp.common.utils.ThreadUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class has extends weu<has> {

    /* JADX INFO: renamed from: f */
    public final HashMap<Integer, ArrayList<BLiveGivenGiftBrief>> f106815f;

    /* JADX INFO: renamed from: g */
    public final HashMap<Integer, Boolean> f106816g;

    /* JADX INFO: renamed from: l.has$a */
    public class C17257a extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGivenGiftBrief f106817a;

        public C17257a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            this.f106817a = bLiveGivenGiftBrief;
        }

        @Override // p149l.i7e, p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(@NotNull File file) {
            has.this.m130198n3(this.f106817a, true);
        }

        @Override // p149l.i7e, p149l.h7e
        /* JADX INFO: renamed from: d */
        public void mo75218d(@NotNull String str) {
            wrj.m205248o(str);
        }

        @Override // p149l.i7e, p149l.h7e
        public void onFailed(@NotNull String str) {
            wrj.m205248o(str);
        }
    }

    /* JADX INFO: renamed from: l.has$b */
    public class C17258b extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGivenGiftBrief f106819a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveGiftItem f106820b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ GiftTrayData f106821c;

        public C17258b(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, GiftTrayData giftTrayData) {
            this.f106819a = bLiveGivenGiftBrief;
            this.f106820b = bLiveGiftItem;
            this.f106821c = giftTrayData;
        }

        @Override // p149l.i7e, p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(@NotNull File file) {
            has.this.m130186a3(this.f106819a, this.f106820b, this.f106821c);
            wrj.m205240k(this.f106820b);
        }

        @Override // p149l.i7e, p149l.h7e
        public void onFailed(String str) {
            wrj.m205238j(this.f106820b);
        }
    }

    public has(jlu jluVar) {
        super(jluVar);
        this.f106815f = new HashMap<>();
        this.f106816g = new HashMap<>();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m218409H2().f186998c.m216979l().m189034A()).subscribe(ffw.m121193d(new e30() { // from class: l.u9s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175501a.m130195j3((BLiveGivenGiftBrief) obj);
            }
        }));
        duringCreated(m218409H2().m203948z()).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.w9s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185396a.m130196k3((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a3 */
    public final void m130186a3(final BLiveGivenGiftBrief bLiveGivenGiftBrief, final BLiveGiftItem bLiveGiftItem, GiftTrayData giftTrayData) {
        pph0 pph0VarM175842b;
        wrj.m205212S(bLiveGiftItem, bLiveGivenGiftBrief);
        String strMo107443b = spe.m185365d("faceGift").mo107443b(aqe.m98261i().m98266h(bLiveGiftItem.liveResourceId));
        if (m130190e3() == null || TextUtils.isEmpty(strMo107443b) || (pph0VarM175842b = qph0.m175841a().m175842b(act(), strMo107443b)) == null) {
            return;
        }
        wrj.m205222b(bLiveGiftItem, bLiveGivenGiftBrief);
        m130190e3().mo98890B(m130191f3(bLiveGivenGiftBrief), pph0VarM175842b);
        this.f106816g.put(Integer.valueOf(m130191f3(bLiveGivenGiftBrief)), Boolean.TRUE);
        nqe.m160610p(giftTrayData, true, m218414N2());
        ThreadUtil.m81313h(new Runnable() { // from class: l.cas
            @Override // java.lang.Runnable
            public final void run() {
                this.f80053a.m130194i3(bLiveGivenGiftBrief, bLiveGiftItem);
            }
        }, (int) bLiveGiftItem.trayDuration);
    }

    /* JADX INFO: renamed from: b3 */
    public final void m130187b3() {
        wrj.m205228e();
        for (Integer num : this.f106815f.keySet()) {
            num.intValue();
            ArrayList<BLiveGivenGiftBrief> arrayList = this.f106815f.get(num);
            if (arrayList != null && arrayList.size() > 0 && (this.f106816g.get(num) == null || !this.f106816g.get(num).booleanValue())) {
                m130188c3(arrayList.remove(0));
            }
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final void m130188c3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM126026l = ((ggv) ypv.m215673l(fld0.f98148c)).m126026l(bLiveGivenGiftBrief.f44385id);
        if (bLiveGiftItemM126026l == null || TextUtils.isEmpty(bLiveGiftItemM126026l.liveResourceId)) {
            wrj.m205230f(bLiveGiftItemM126026l);
            return;
        }
        GiftTrayData giftTrayDataM74153o = GiftTrayData.m74153o(bLiveGiftItemM126026l, bLiveGivenGiftBrief, null);
        giftTrayDataM74153o.f50102h = m218409H2().m203942s();
        if (spe.m185365d("faceGift").mo107445f(bLiveGiftItemM126026l.liveResourceId, true, new C17258b(bLiveGivenGiftBrief, bLiveGiftItemM126026l, giftTrayDataM74153o), bwc0.m104149b(giftTrayDataM74153o, true, m218414N2()))) {
            m130186a3(bLiveGivenGiftBrief, bLiveGiftItemM126026l, giftTrayDataM74153o);
        }
    }

    /* JADX INFO: renamed from: d3 */
    public final void m130189d3() {
        for (Integer num : this.f106816g.keySet()) {
            int iIntValue = num.intValue();
            if (m130190e3() != null) {
                m130190e3().mo98892G(iIntValue);
            }
            this.f106816g.put(num, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: e3 */
    public cxl m130190e3() {
        return m218409H2().m203944u().m100103b();
    }

    /* JADX INFO: renamed from: f3 */
    public final int m130191f3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        return bLiveGivenGiftBrief.stickFacePositionType + 100;
    }

    /* JADX INFO: renamed from: g3 */
    public final void m130192g3(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        aqe.m98261i().m98281x(bLiveGiftItem.liveResourceId, null, new C17257a(bLiveGivenGiftBrief));
    }

    /* JADX INFO: renamed from: h3 */
    public final void m130193h3(final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        zfv.m218542Y0(qib0.f154719h0).subscribe(ffw.m121194e(new e30() { // from class: l.y9s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196987a.m130197m3(bLiveGivenGiftBrief, (roj0) obj);
            }
        }, new e30() { // from class: l.aas
            @Override // p149l.e30
            public final void call(Object obj) {
                wrj.m205251q(((Throwable) obj).getMessage());
            }
        }));
        wrj.m205226d();
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m130194i3(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        m130190e3().mo98892G(m130191f3(bLiveGivenGiftBrief));
        this.f106816g.put(Integer.valueOf(m130191f3(bLiveGivenGiftBrief)), Boolean.FALSE);
        ThreadUtil.m81313h(new Runnable() { // from class: l.eas
            @Override // java.lang.Runnable
            public final void run() {
                this.f90241a.m130187b3();
            }
        }, 500L);
        wrj.m205215V(bLiveGiftItem, bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m130195j3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m130198n3(bLiveGivenGiftBrief, false);
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m130196k3(String str) {
        m130189d3();
        this.f106815f.clear();
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m130197m3(BLiveGivenGiftBrief bLiveGivenGiftBrief, roj0 roj0Var) {
        m130198n3(bLiveGivenGiftBrief, true);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f106815f.clear();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m130198n3(BLiveGivenGiftBrief bLiveGivenGiftBrief, boolean z) {
        BLiveGiftItem bLiveGiftItemM126026l = ((ggv) ypv.m215673l(fld0.f98148c)).m126026l(bLiveGivenGiftBrief.f44385id);
        if (z) {
            if (bLiveGiftItemM126026l == null) {
                wrj.m205252r();
                return;
            } else if (aqe.m98261i().m98266h(bLiveGiftItemM126026l.liveResourceId) == null) {
                wrj.m205250p();
                return;
            }
        } else if (bLiveGiftItemM126026l == null) {
            m130193h3(bLiveGivenGiftBrief);
            return;
        } else if (aqe.m98261i().m98266h(bLiveGiftItemM126026l.liveResourceId) == null) {
            m130192g3(bLiveGivenGiftBrief, bLiveGiftItemM126026l);
            return;
        }
        ArrayList<BLiveGivenGiftBrief> arrayList = this.f106815f.get(Integer.valueOf(m130191f3(bLiveGivenGiftBrief)));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(bLiveGivenGiftBrief);
        this.f106815f.put(Integer.valueOf(m130191f3(bLiveGivenGiftBrief)), arrayList);
        m130187b3();
    }
}
