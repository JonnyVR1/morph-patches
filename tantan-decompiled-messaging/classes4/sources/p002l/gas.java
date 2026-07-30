package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.pph0;
import l.qib0;
import l.qph0;
import l.roj0;
import l.ti1;
import l.w9j;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gas<V extends ho2> extends pat<V> {

    /* JADX INFO: renamed from: i */
    public final HashMap<Integer, ArrayList<BLiveGivenGiftBrief>> f11322i;

    /* JADX INFO: renamed from: j */
    public final HashMap<Integer, Boolean> f11323j;

    /* JADX INFO: renamed from: l.gas$a */
    public class C0587a extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGivenGiftBrief f11324a;

        public C0587a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            this.f11324a = bLiveGivenGiftBrief;
        }

        @Override // p002l.i7e, p002l.h7e
        /* JADX INFO: renamed from: a */
        public void mo7819a(@NotNull File file) {
            gas.this.m13698e4(this.f11324a, true);
        }

        @Override // p002l.i7e, p002l.h7e
        /* JADX INFO: renamed from: d */
        public void mo8834d(@NotNull String str) {
            wrj.m25420o(str);
        }

        @Override // p002l.i7e, p002l.h7e
        public void onFailed(@NotNull String str) {
            wrj.m25420o(str);
        }
    }

    /* JADX INFO: renamed from: l.gas$b */
    public class C0588b extends i7e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGivenGiftBrief f11326a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveGiftItem f11327b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ GiftTrayData f11328c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bwc0 f11329d;

        public C0588b(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, GiftTrayData giftTrayData, bwc0 bwc0Var) {
            this.f11326a = bLiveGivenGiftBrief;
            this.f11327b = bLiveGiftItem;
            this.f11328c = giftTrayData;
            this.f11329d = bwc0Var;
        }

        @Override // p002l.i7e, p002l.h7e
        /* JADX INFO: renamed from: a */
        public void mo7819a(@NotNull File file) {
            gas.this.m13687S3(this.f11326a, this.f11327b, this.f11328c);
            wrj.m25412k(this.f11327b);
        }

        @Override // p002l.i7e, p002l.h7e
        public void onFailed(String str) {
            wrj.m25410j(this.f11327b);
            nqe.m18951f(this.f11329d);
        }
    }

    public gas(bsm<V> bsmVar) {
        super(bsmVar);
        this.f11322i = new HashMap<>();
        this.f11323j = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public void m13687S3(final BLiveGivenGiftBrief bLiveGivenGiftBrief, final BLiveGiftItem bLiveGiftItem, GiftTrayData giftTrayData) {
        wrj.m25384S(bLiveGiftItem, bLiveGivenGiftBrief);
        String strMo11105b = spe.m22604d("faceGift").mo11105b(aqe.m10039i().m10044h(bLiveGiftItem.liveResourceId));
        if (m13700W3() == null || TextUtils.isEmpty(strMo11105b)) {
            nqe.m18961p(giftTrayData, false, m25552L2());
            return;
        }
        pph0 pph0VarB = qph0.a().b(m25549H2().getContext(), strMo11105b);
        if (pph0VarB == null) {
            nqe.m18961p(giftTrayData, false, m25552L2());
            return;
        }
        wrj.m25394b(bLiveGiftItem, bLiveGivenGiftBrief);
        m13700W3().mo5231B(m13691X3(bLiveGivenGiftBrief), pph0VarB);
        this.f11323j.put(Integer.valueOf(m13691X3(bLiveGivenGiftBrief)), Boolean.TRUE);
        nqe.m18961p(giftTrayData, true, m25552L2());
        m25549H2().m4(new Runnable() { // from class: l.das
            @Override // java.lang.Runnable
            public final void run() {
                this.f9150a.m13694a4(bLiveGivenGiftBrief, bLiveGiftItem);
            }
        }, (int) bLiveGiftItem.trayDuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m13688T3() {
        wrj.m25400e();
        for (Integer num : this.f11322i.keySet()) {
            num.intValue();
            ArrayList<BLiveGivenGiftBrief> arrayList = this.f11322i.get(num);
            if (arrayList != null && arrayList.size() > 0 && (this.f11323j.get(num) == null || !this.f11323j.get(num).booleanValue())) {
                m13689U3(arrayList.remove(0));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.ho2] */
    /* JADX INFO: renamed from: U3 */
    private void m13689U3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemL = ((ggv) ypv.l(fld0.c)).l(bLiveGivenGiftBrief.id);
        if (bLiveGiftItemL == null || TextUtils.isEmpty(bLiveGiftItemL.liveResourceId)) {
            wrj.m25402f(bLiveGiftItemL);
            nqe.m18964s(bLiveGivenGiftBrief, m25547E2(), true, m25552L2());
            return;
        }
        GiftTrayData giftTrayDataM7718o = GiftTrayData.m7718o(bLiveGiftItemL, bLiveGivenGiftBrief, m25547E2());
        giftTrayDataM7718o.f6144h = m25547E2().m17234j().id;
        bwc0 bwc0VarM10631b = bwc0.m10631b(giftTrayDataM7718o, true, m25552L2());
        if (spe.m22604d("faceGift").mo11107f(bLiveGiftItemL.liveResourceId, true, new C0588b(bLiveGivenGiftBrief, bLiveGiftItemL, giftTrayDataM7718o, bwc0VarM10631b), bwc0VarM10631b)) {
            m13687S3(bLiveGivenGiftBrief, bLiveGiftItemL, giftTrayDataM7718o);
        }
    }

    /* JADX INFO: renamed from: V3 */
    private void m13690V3() {
        for (Integer num : this.f11323j.keySet()) {
            int iIntValue = num.intValue();
            if (m13700W3() != null) {
                m13700W3().mo5236G(iIntValue);
            }
            this.f11323j.put(num, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: X3 */
    private int m13691X3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        return bLiveGivenGiftBrief.stickFacePositionType + 100;
    }

    /* JADX INFO: renamed from: Y3 */
    private void m13692Y3(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        aqe.m10039i().m10059x(bLiveGiftItem.liveResourceId, null, new C0587a(bLiveGivenGiftBrief));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX INFO: renamed from: Z3 */
    private void m13693Z3(final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        zfv.m27245Y0(qib0.h0).subscribe(ffw.e(new e30() { // from class: l.z9s
            public final void call(Object obj) {
                this.f23318a.m13697d4(bLiveGivenGiftBrief, (roj0) obj);
            }
        }, new e30() { // from class: l.bas
            public final void call(Object obj) {
                wrj.m25423q(((Throwable) obj).getMessage());
            }
        }));
        wrj.m25398d();
        nqe.m18971z(bLiveGivenGiftBrief, m25547E2(), m25552L2());
        nqe.m18964s(bLiveGivenGiftBrief, m25547E2(), true, m25552L2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m13694a4(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        m13700W3().mo5236G(m13691X3(bLiveGivenGiftBrief));
        this.f11323j.put(Integer.valueOf(m13691X3(bLiveGivenGiftBrief)), Boolean.FALSE);
        m25549H2().m4(new Runnable() { // from class: l.fas
            @Override // java.lang.Runnable
            public final void run() {
                this.f10218a.m13688T3();
            }
        }, 500);
        wrj.m25387V(bLiveGiftItem, bLiveGivenGiftBrief);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m13695b4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m13698e4(bLiveGivenGiftBrief, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m13696c4(c cVar) {
        if (cVar == c.i) {
            m13688T3();
        } else if (cVar == c.k) {
            m13690V3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m13697d4(BLiveGivenGiftBrief bLiveGivenGiftBrief, roj0 roj0Var) {
        m13698e4(bLiveGivenGiftBrief, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.ho2] */
    /* JADX INFO: renamed from: e4 */
    public void m13698e4(BLiveGivenGiftBrief bLiveGivenGiftBrief, boolean z) {
        BLiveGiftItem bLiveGiftItemL = ((ggv) ypv.l(fld0.c)).l(bLiveGivenGiftBrief.id);
        if (z) {
            if (bLiveGiftItemL == null) {
                wrj.m25424r();
                return;
            } else if (aqe.m10039i().m10044h(bLiveGiftItemL.liveResourceId) == null) {
                wrj.m25422p();
                return;
            }
        } else if (bLiveGiftItemL == null) {
            m13693Z3(bLiveGivenGiftBrief);
            return;
        } else if (aqe.m10039i().m10044h(bLiveGiftItemL.liveResourceId) == null) {
            m13692Y3(bLiveGivenGiftBrief, bLiveGiftItemL);
            return;
        }
        nqe.m18970y(bLiveGivenGiftBrief, bLiveGiftItemL, m25547E2(), m25552L2());
        ArrayList<BLiveGivenGiftBrief> arrayList = this.f11322i.get(Integer.valueOf(m13691X3(bLiveGivenGiftBrief)));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(bLiveGivenGiftBrief);
        this.f11322i.put(Integer.valueOf(m13691X3(bLiveGivenGiftBrief)), arrayList);
        m13688T3();
    }

    /* JADX INFO: renamed from: T */
    public void m13699T() {
        super.T();
        m14202u3(new w9j() { // from class: l.t9s
            public final Object call(Object obj) {
                return ((ti1) obj).A();
            }
        }).m14209b(new e30() { // from class: l.v9s
            public final void call(Object obj) {
                this.f21045a.m13695b4((BLiveGivenGiftBrief) obj);
            }
        });
        lifecycle().subscribe(ffw.d(new e30() { // from class: l.x9s
            public final void call(Object obj) {
                this.f22188a.m13696c4((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public bxl m13700W3() {
        return (bxl) m14184F3(new bu00(2400));
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f11322i.clear();
    }
}
