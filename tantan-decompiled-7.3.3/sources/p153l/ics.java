package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantanapp.common.utils.ThreadUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class ics extends xgu<ics> {

    /* JADX INFO: renamed from: f */
    public final HashMap<Integer, ArrayList<BLiveGivenGiftBrief>> f114429f;

    /* JADX INFO: renamed from: g */
    public final HashMap<Integer, Boolean> f114430g;

    /* JADX INFO: renamed from: l.ics$a */
    public class C17699a extends x8e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGivenGiftBrief f114431a;

        public C17699a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            this.f114431a = bLiveGivenGiftBrief;
        }

        @Override // p153l.x8e, p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(@NotNull File file) {
            ics.this.m139484n3(this.f114431a, true);
        }

        @Override // p153l.x8e, p153l.w8e
        /* JADX INFO: renamed from: d */
        public void mo76401d(@NotNull String str) {
            muj.m160212o(str);
        }

        @Override // p153l.x8e, p153l.w8e
        public void onFailed(@NotNull String str) {
            muj.m160212o(str);
        }
    }

    /* JADX INFO: renamed from: l.ics$b */
    public class C17700b extends x8e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGivenGiftBrief f114433a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveGiftItem f114434b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ GiftTrayData f114435c;

        public C17700b(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, GiftTrayData giftTrayData) {
            this.f114433a = bLiveGivenGiftBrief;
            this.f114434b = bLiveGiftItem;
            this.f114435c = giftTrayData;
        }

        @Override // p153l.x8e, p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(@NotNull File file) {
            ics.this.m139472a3(this.f114433a, this.f114434b, this.f114435c);
            muj.m160204k(this.f114434b);
        }

        @Override // p153l.x8e, p153l.w8e
        public void onFailed(String str) {
            muj.m160202j(this.f114434b);
        }
    }

    public ics(knu knuVar) {
        super(knuVar);
        this.f114429f = new HashMap<>();
        this.f114430g = new HashMap<>();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m97926H2().f195472c.m120391l().m98216A()).subscribe(dhw.m115825d(new y20() { // from class: l.vbs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183291a.m139481j3((BLiveGivenGiftBrief) obj);
            }
        }));
        duringCreated(m97926H2().m212355z()).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.xbs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193208a.m139482k3((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a3 */
    public final void m139472a3(final BLiveGivenGiftBrief bLiveGivenGiftBrief, final BLiveGiftItem bLiveGiftItem, GiftTrayData giftTrayData) {
        wxh0 wxh0VarM213525b;
        muj.m160176S(bLiveGiftItem, bLiveGivenGiftBrief);
        String strMo144686b = wqe.m207509d("faceGift").mo144686b(ere.m122146i().m122151h(bLiveGiftItem.liveResourceId));
        if (m139476e3() == null || TextUtils.isEmpty(strMo144686b) || (wxh0VarM213525b = xxh0.m213524a().m213525b(act(), strMo144686b)) == null) {
            return;
        }
        muj.m160186b(bLiveGiftItem, bLiveGivenGiftBrief);
        m139476e3().mo143167B(m139477f3(bLiveGivenGiftBrief), wxh0VarM213525b);
        this.f114430g.put(Integer.valueOf(m139477f3(bLiveGivenGiftBrief)), Boolean.TRUE);
        rre.m182744p(giftTrayData, true, m97931N2());
        ThreadUtil.m82496h(new Runnable() { // from class: l.dcs
            @Override // java.lang.Runnable
            public final void run() {
                this.f87818a.m139480i3(bLiveGivenGiftBrief, bLiveGiftItem);
            }
        }, (int) bLiveGiftItem.trayDuration);
    }

    /* JADX INFO: renamed from: b3 */
    public final void m139473b3() {
        muj.m160192e();
        for (Integer num : this.f114429f.keySet()) {
            num.intValue();
            ArrayList<BLiveGivenGiftBrief> arrayList = this.f114429f.get(num);
            if (arrayList != null && arrayList.size() > 0 && (this.f114430g.get(num) == null || !this.f114430g.get(num).booleanValue())) {
                m139474c3(arrayList.remove(0));
            }
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final void m139474c3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM135160l = ((hiv) zrv.m221194l(htd0.f111521c)).m135160l(bLiveGivenGiftBrief.f45233id);
        if (bLiveGiftItemM135160l == null || TextUtils.isEmpty(bLiveGiftItemM135160l.liveResourceId)) {
            muj.m160194f(bLiveGiftItemM135160l);
            return;
        }
        GiftTrayData giftTrayDataM75336o = GiftTrayData.m75336o(bLiveGiftItemM135160l, bLiveGivenGiftBrief, null);
        giftTrayDataM75336o.f50950h = m97926H2().m212349s();
        if (wqe.m207509d("faceGift").mo144688f(bLiveGiftItemM135160l.liveResourceId, true, new C17700b(bLiveGivenGiftBrief, bLiveGiftItemM135160l, giftTrayDataM75336o), e4d0.m119410b(giftTrayDataM75336o, true, m97931N2()))) {
            m139472a3(bLiveGivenGiftBrief, bLiveGiftItemM135160l, giftTrayDataM75336o);
        }
    }

    /* JADX INFO: renamed from: d3 */
    public final void m139475d3() {
        for (Integer num : this.f114430g.keySet()) {
            int iIntValue = num.intValue();
            if (m139476e3() != null) {
                m139476e3().mo143169G(iIntValue);
            }
            this.f114430g.put(num, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: e3 */
    public vzl m139476e3() {
        return m97926H2().m212351u().m129894b();
    }

    /* JADX INFO: renamed from: f3 */
    public final int m139477f3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        return bLiveGivenGiftBrief.stickFacePositionType + 100;
    }

    /* JADX INFO: renamed from: g3 */
    public final void m139478g3(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        ere.m122146i().m122166x(bLiveGiftItem.liveResourceId, null, new C17699a(bLiveGivenGiftBrief));
    }

    /* JADX INFO: renamed from: h3 */
    public final void m139479h3(final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        aiv.m98076Y0(uqb0.f180402h0).subscribe(dhw.m115826e(new y20() { // from class: l.zbs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203698a.m139483m3(bLiveGivenGiftBrief, (uxj0) obj);
            }
        }, new y20() { // from class: l.bcs
            @Override // p153l.y20
            public final void call(Object obj) {
                muj.m160215q(((Throwable) obj).getMessage());
            }
        }));
        muj.m160190d();
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m139480i3(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        m139476e3().mo143169G(m139477f3(bLiveGivenGiftBrief));
        this.f114430g.put(Integer.valueOf(m139477f3(bLiveGivenGiftBrief)), Boolean.FALSE);
        ThreadUtil.m82496h(new Runnable() { // from class: l.fcs
            @Override // java.lang.Runnable
            public final void run() {
                this.f98257a.m139473b3();
            }
        }, 500L);
        muj.m160179V(bLiveGiftItem, bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m139481j3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m139484n3(bLiveGivenGiftBrief, false);
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m139482k3(String str) {
        m139475d3();
        this.f114429f.clear();
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m139483m3(BLiveGivenGiftBrief bLiveGivenGiftBrief, uxj0 uxj0Var) {
        m139484n3(bLiveGivenGiftBrief, true);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f114429f.clear();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m139484n3(BLiveGivenGiftBrief bLiveGivenGiftBrief, boolean z) {
        BLiveGiftItem bLiveGiftItemM135160l = ((hiv) zrv.m221194l(htd0.f111521c)).m135160l(bLiveGivenGiftBrief.f45233id);
        if (z) {
            if (bLiveGiftItemM135160l == null) {
                muj.m160216r();
                return;
            } else if (ere.m122146i().m122151h(bLiveGiftItemM135160l.liveResourceId) == null) {
                muj.m160214p();
                return;
            }
        } else if (bLiveGiftItemM135160l == null) {
            m139479h3(bLiveGivenGiftBrief);
            return;
        } else if (ere.m122146i().m122151h(bLiveGiftItemM135160l.liveResourceId) == null) {
            m139478g3(bLiveGivenGiftBrief, bLiveGiftItemM135160l);
            return;
        }
        ArrayList<BLiveGivenGiftBrief> arrayList = this.f114429f.get(Integer.valueOf(m139477f3(bLiveGivenGiftBrief)));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(bLiveGivenGiftBrief);
        this.f114429f.put(Integer.valueOf(m139477f3(bLiveGivenGiftBrief)), arrayList);
        m139473b3();
    }
}
