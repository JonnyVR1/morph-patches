package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class hcs<V extends oo2> extends qct<V> {

    /* JADX INFO: renamed from: i */
    public final HashMap<Integer, ArrayList<BLiveGivenGiftBrief>> f108735i;

    /* JADX INFO: renamed from: j */
    public final HashMap<Integer, Boolean> f108736j;

    /* JADX INFO: renamed from: l.hcs$a */
    public class C17436a extends x8e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGivenGiftBrief f108737a;

        public C17436a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            this.f108737a = bLiveGivenGiftBrief;
        }

        @Override // p153l.x8e, p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(@NotNull File file) {
            hcs.this.m134517e4(this.f108737a, true);
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

    /* JADX INFO: renamed from: l.hcs$b */
    public class C17437b extends x8e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGivenGiftBrief f108739a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveGiftItem f108740b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ GiftTrayData f108741c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ e4d0 f108742d;

        public C17437b(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, GiftTrayData giftTrayData, e4d0 e4d0Var) {
            this.f108739a = bLiveGivenGiftBrief;
            this.f108740b = bLiveGiftItem;
            this.f108741c = giftTrayData;
            this.f108742d = e4d0Var;
        }

        @Override // p153l.x8e, p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(@NotNull File file) {
            hcs.this.m134506S3(this.f108739a, this.f108740b, this.f108741c);
            muj.m160204k(this.f108740b);
        }

        @Override // p153l.x8e, p153l.w8e
        public void onFailed(String str) {
            muj.m160202j(this.f108740b);
            rre.m182734f(this.f108742d);
        }
    }

    public hcs(dum<V> dumVar) {
        super(dumVar);
        this.f108735i = new HashMap<>();
        this.f108736j = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public void m134506S3(final BLiveGivenGiftBrief bLiveGivenGiftBrief, final BLiveGiftItem bLiveGiftItem, GiftTrayData giftTrayData) {
        muj.m160176S(bLiveGiftItem, bLiveGivenGiftBrief);
        String strMo144686b = wqe.m207509d("faceGift").mo144686b(ere.m122146i().m122151h(bLiveGiftItem.liveResourceId));
        if (m134518W3() == null || TextUtils.isEmpty(strMo144686b)) {
            rre.m182744p(giftTrayData, false, m213815L2());
            return;
        }
        wxh0 wxh0VarM213525b = xxh0.m213524a().m213525b(m213812H2().getContext(), strMo144686b);
        if (wxh0VarM213525b == null) {
            rre.m182744p(giftTrayData, false, m213815L2());
            return;
        }
        muj.m160186b(bLiveGiftItem, bLiveGivenGiftBrief);
        m134518W3().mo73036B(m134510X3(bLiveGivenGiftBrief), wxh0VarM213525b);
        this.f108736j.put(Integer.valueOf(m134510X3(bLiveGivenGiftBrief)), Boolean.TRUE);
        rre.m182744p(giftTrayData, true, m213815L2());
        m213812H2().m21592m4(new Runnable() { // from class: l.ecs
            @Override // java.lang.Runnable
            public final void run() {
                this.f93103a.m134513a4(bLiveGivenGiftBrief, bLiveGiftItem);
            }
        }, (int) bLiveGiftItem.trayDuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m134507T3() {
        muj.m160192e();
        for (Integer num : this.f108735i.keySet()) {
            num.intValue();
            ArrayList<BLiveGivenGiftBrief> arrayList = this.f108735i.get(num);
            if (arrayList != null && arrayList.size() > 0 && (this.f108736j.get(num) == null || !this.f108736j.get(num).booleanValue())) {
                m134508U3(arrayList.remove(0));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.oo2] */
    /* JADX INFO: renamed from: U3 */
    private void m134508U3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM135160l = ((hiv) zrv.m221194l(htd0.f111521c)).m135160l(bLiveGivenGiftBrief.f45233id);
        if (bLiveGiftItemM135160l == null || TextUtils.isEmpty(bLiveGiftItemM135160l.liveResourceId)) {
            muj.m160194f(bLiveGiftItemM135160l);
            rre.m182747s(bLiveGivenGiftBrief, m213810E2(), true, m213815L2());
            return;
        }
        GiftTrayData giftTrayDataM75336o = GiftTrayData.m75336o(bLiveGiftItemM135160l, bLiveGivenGiftBrief, m213810E2());
        giftTrayDataM75336o.f50950h = m213810E2().mo183435j().f45171id;
        e4d0 e4d0VarM119410b = e4d0.m119410b(giftTrayDataM75336o, true, m213815L2());
        if (wqe.m207509d("faceGift").mo144688f(bLiveGiftItemM135160l.liveResourceId, true, new C17437b(bLiveGivenGiftBrief, bLiveGiftItemM135160l, giftTrayDataM75336o, e4d0VarM119410b), e4d0VarM119410b)) {
            m134506S3(bLiveGivenGiftBrief, bLiveGiftItemM135160l, giftTrayDataM75336o);
        }
    }

    /* JADX INFO: renamed from: V3 */
    private void m134509V3() {
        for (Integer num : this.f108736j.keySet()) {
            int iIntValue = num.intValue();
            if (m134518W3() != null) {
                m134518W3().mo73041G(iIntValue);
            }
            this.f108736j.put(num, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: X3 */
    private int m134510X3(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        return bLiveGivenGiftBrief.stickFacePositionType + 100;
    }

    /* JADX INFO: renamed from: Y3 */
    private void m134511Y3(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        ere.m122146i().m122166x(bLiveGiftItem.liveResourceId, null, new C17436a(bLiveGivenGiftBrief));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    /* JADX INFO: renamed from: Z3 */
    private void m134512Z3(final BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        aiv.m98076Y0(uqb0.f180402h0).subscribe(dhw.m115826e(new y20() { // from class: l.acs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69755a.m134516d4(bLiveGivenGiftBrief, (uxj0) obj);
            }
        }, new y20() { // from class: l.ccs
            @Override // p153l.y20
            public final void call(Object obj) {
                muj.m160215q(((Throwable) obj).getMessage());
            }
        }));
        muj.m160190d();
        rre.m182754z(bLiveGivenGiftBrief, m213810E2(), m213815L2());
        rre.m182747s(bLiveGivenGiftBrief, m213810E2(), true, m213815L2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m134513a4(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        m134518W3().mo73041G(m134510X3(bLiveGivenGiftBrief));
        this.f108736j.put(Integer.valueOf(m134510X3(bLiveGivenGiftBrief)), Boolean.FALSE);
        m213812H2().m21592m4(new Runnable() { // from class: l.gcs
            @Override // java.lang.Runnable
            public final void run() {
                this.f103600a.m134507T3();
            }
        }, 500);
        muj.m160179V(bLiveGiftItem, bLiveGivenGiftBrief);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m134514b4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m134517e4(bLiveGivenGiftBrief, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m134515c4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m134507T3();
        } else if (c4470c == C4470c.f16269k) {
            m134509V3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m134516d4(BLiveGivenGiftBrief bLiveGivenGiftBrief, uxj0 uxj0Var) {
        m134517e4(bLiveGivenGiftBrief, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.oo2] */
    /* JADX INFO: renamed from: e4 */
    public void m134517e4(BLiveGivenGiftBrief bLiveGivenGiftBrief, boolean z) {
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
            m134512Z3(bLiveGivenGiftBrief);
            return;
        } else if (ere.m122146i().m122151h(bLiveGiftItemM135160l.liveResourceId) == null) {
            m134511Y3(bLiveGivenGiftBrief, bLiveGiftItemM135160l);
            return;
        }
        rre.m182753y(bLiveGivenGiftBrief, bLiveGiftItemM135160l, m213810E2(), m213815L2());
        ArrayList<BLiveGivenGiftBrief> arrayList = this.f108735i.get(Integer.valueOf(m134510X3(bLiveGivenGiftBrief)));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(bLiveGivenGiftBrief);
        this.f108735i.put(Integer.valueOf(m134510X3(bLiveGivenGiftBrief)), arrayList);
        m134507T3();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138874u3(new qcj() { // from class: l.ubs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((aj1) obj).m98216A();
            }
        }).m138881b(new y20() { // from class: l.wbs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188267a.m134514b4((BLiveGivenGiftBrief) obj);
            }
        });
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.ybs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198359a.m134515c4((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public uzl m134518W3() {
        return (uzl) m138856F3(new k210(2400));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f108735i.clear();
    }
}
