package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class gas<V extends ho2> extends pat<V> {

    /* JADX INFO: renamed from: i */
    public final HashMap<Integer, ArrayList<BLiveGivenGiftBrief>> f101693i;

    /* JADX INFO: renamed from: j */
    public final HashMap<Integer, Boolean> f101694j;

    /* JADX INFO: renamed from: l.gas$a */
    public class C17027a extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGivenGiftBrief f101695a;

        public C17027a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            this.f101695a = bLiveGivenGiftBrief;
        }

        @Override // p149l.i7e, p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(@NotNull File file) {
            gas.this.m125032e4(this.f101695a, true);
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

    /* JADX INFO: renamed from: l.gas$b */
    public class C17028b extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGivenGiftBrief f101697a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveGiftItem f101698b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ GiftTrayData f101699c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bwc0 f101700d;

        public C17028b(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, GiftTrayData giftTrayData, bwc0 bwc0Var) {
            this.f101697a = bLiveGivenGiftBrief;
            this.f101698b = bLiveGiftItem;
            this.f101699c = giftTrayData;
            this.f101700d = bwc0Var;
        }

        @Override // p149l.i7e, p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(@NotNull File file) {
            gas.this.m125021S3(this.f101697a, this.f101698b, this.f101699c);
            wrj.m205240k(this.f101698b);
        }

        @Override // p149l.i7e, p149l.h7e
        public void onFailed(String str) {
            wrj.m205238j(this.f101698b);
            nqe.m160600f(this.f101700d);
        }
    }

    public gas(bsm<V> bsmVar) {
        super(bsmVar);
        this.f101693i = new HashMap<>();
        this.f101694j = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public void m125021S3(final BLiveGivenGiftBrief bLiveGivenGiftBrief, final BLiveGiftItem bLiveGiftItem, GiftTrayData giftTrayData) {
        wrj.m205212S(bLiveGiftItem, bLiveGivenGiftBrief);
        String strMo107443b = spe.m185365d("faceGift").mo107443b(aqe.m98261i().m98266h(bLiveGiftItem.liveResourceId));
        if (m125033W3() == null || TextUtils.isEmpty(strMo107443b)) {
            nqe.m160610p(giftTrayData, false, m206032L2());
            return;
        }
        pph0 pph0VarM175842b = qph0.m175841a().m175842b(m206029H2().getContext(), strMo107443b);
        if (pph0VarM175842b == null) {
            nqe.m160610p(giftTrayData, false, m206032L2());
            return;
        }
        wrj.m205222b(bLiveGiftItem, bLiveGivenGiftBrief);
        m125033W3().mo71853B(m125025X3(bLiveGivenGiftBrief), pph0VarM175842b);
        this.f101694j.put(Integer.valueOf(m125025X3(bLiveGivenGiftBrief)), Boolean.TRUE);
        nqe.m160610p(giftTrayData, true, m206032L2());
        m206029H2().m20593m4(new Runnable() { // from class: l.das
            @Override // java.lang.Runnable
            public final void run() {
                this.f85258a.m125028a4(bLiveGivenGiftBrief, bLiveGiftItem);
            }
        }, (int) bLiveGiftItem.trayDuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m125022T3() {
        wrj.m205228e();
        for (Integer num : this.f101693i.keySet()) {
            num.intValue();
            ArrayList<BLiveGivenGiftBrief> arrayList = this.f101693i.get(num);
            if (arrayList != null && arrayList.size() > 0 && (this.f101694j.get(num) == null || !this.f101694j.get(num).booleanValue())) {
                m125023U3(arrayList.remove(0));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.ho2] */
    /* JADX INFO: renamed from: U3 */
    private void m125023U3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM126026l = ((ggv) ypv.m215673l(fld0.f98148c)).m126026l(bLiveGivenGiftBrief.f44385id);
        if (bLiveGiftItemM126026l == null || TextUtils.isEmpty(bLiveGiftItemM126026l.liveResourceId)) {
            wrj.m205230f(bLiveGiftItemM126026l);
            nqe.m160613s(bLiveGivenGiftBrief, m206027E2(), true, m206032L2());
            return;
        }
        GiftTrayData giftTrayDataM74153o = GiftTrayData.m74153o(bLiveGiftItemM126026l, bLiveGivenGiftBrief, m206027E2());
        giftTrayDataM74153o.f50102h = m206027E2().mo149813j().f44323id;
        bwc0 bwc0VarM104149b = bwc0.m104149b(giftTrayDataM74153o, true, m206032L2());
        if (spe.m185365d("faceGift").mo107445f(bLiveGiftItemM126026l.liveResourceId, true, new C17028b(bLiveGivenGiftBrief, bLiveGiftItemM126026l, giftTrayDataM74153o, bwc0VarM104149b), bwc0VarM104149b)) {
            m125021S3(bLiveGivenGiftBrief, bLiveGiftItemM126026l, giftTrayDataM74153o);
        }
    }

    /* JADX INFO: renamed from: V3 */
    private void m125024V3() {
        for (Integer num : this.f101694j.keySet()) {
            int iIntValue = num.intValue();
            if (m125033W3() != null) {
                m125033W3().mo71858G(iIntValue);
            }
            this.f101694j.put(num, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: X3 */
    private int m125025X3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        return bLiveGivenGiftBrief.stickFacePositionType + 100;
    }

    /* JADX INFO: renamed from: Y3 */
    private void m125026Y3(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        aqe.m98261i().m98281x(bLiveGiftItem.liveResourceId, null, new C17027a(bLiveGivenGiftBrief));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX INFO: renamed from: Z3 */
    private void m125027Z3(final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        zfv.m218542Y0(qib0.f154719h0).subscribe(ffw.m121194e(new e30() { // from class: l.z9s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202311a.m125031d4(bLiveGivenGiftBrief, (roj0) obj);
            }
        }, new e30() { // from class: l.bas
            @Override // p149l.e30
            public final void call(Object obj) {
                wrj.m205251q(((Throwable) obj).getMessage());
            }
        }));
        wrj.m205226d();
        nqe.m160620z(bLiveGivenGiftBrief, m206027E2(), m206032L2());
        nqe.m160613s(bLiveGivenGiftBrief, m206027E2(), true, m206032L2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m125028a4(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        m125033W3().mo71858G(m125025X3(bLiveGivenGiftBrief));
        this.f101694j.put(Integer.valueOf(m125025X3(bLiveGivenGiftBrief)), Boolean.FALSE);
        m206029H2().m20593m4(new Runnable() { // from class: l.fas
            @Override // java.lang.Runnable
            public final void run() {
                this.f96656a.m125022T3();
            }
        }, 500);
        wrj.m205215V(bLiveGiftItem, bLiveGivenGiftBrief);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m125029b4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m125032e4(bLiveGivenGiftBrief, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m125030c4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m125022T3();
        } else if (c4319c == C4319c.f15550k) {
            m125024V3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m125031d4(BLiveGivenGiftBrief bLiveGivenGiftBrief, roj0 roj0Var) {
        m125032e4(bLiveGivenGiftBrief, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.ho2] */
    /* JADX INFO: renamed from: e4 */
    public void m125032e4(BLiveGivenGiftBrief bLiveGivenGiftBrief, boolean z) {
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
            m125027Z3(bLiveGivenGiftBrief);
            return;
        } else if (aqe.m98261i().m98266h(bLiveGiftItemM126026l.liveResourceId) == null) {
            m125026Y3(bLiveGivenGiftBrief, bLiveGiftItemM126026l);
            return;
        }
        nqe.m160619y(bLiveGivenGiftBrief, bLiveGiftItemM126026l, m206027E2(), m206032L2());
        ArrayList<BLiveGivenGiftBrief> arrayList = this.f101693i.get(Integer.valueOf(m125025X3(bLiveGivenGiftBrief)));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(bLiveGivenGiftBrief);
        this.f101693i.put(Integer.valueOf(m125025X3(bLiveGivenGiftBrief)), arrayList);
        m125022T3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129315u3(new w9j() { // from class: l.t9s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((ti1) obj).m189034A();
            }
        }).m129322b(new e30() { // from class: l.v9s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180672a.m125029b4((BLiveGivenGiftBrief) obj);
            }
        });
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.x9s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191649a.m125030c4((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public bxl m125033W3() {
        return (bxl) m129297F3(new bu00(2400));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f101693i.clear();
    }
}
