package p153l;

import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p051p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveActivitiesEntry;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class bys extends txs {
    public bys(ner nerVar, nus nusVar) {
        super(nerVar, nusVar);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        itd0<gm3> itd0Var = itd0.f116821c;
        m113231o2(C22421c.combineLatest(((gm3) tbs.m190077m(itd0Var)).f104911a, ((gm3) tbs.m190077m(itd0Var)).f104919i, new rcj() { // from class: l.uxs
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new Pair((LiveActivitiesEntry) obj, (Boolean) obj2);
            }
        }), false).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.vxs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186299a.m107049f3((Pair) obj);
            }
        }, new y20() { // from class: l.wxs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191522a.m107042Y2((Throwable) obj);
            }
        }));
        m113231o2(((gm3) tbs.m190077m(itd0Var)).m130730e(), false).filter(new qcj() { // from class: l.xxs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f196678a.m107043Z2((Integer) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.yxs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202007a.m107051h3((Integer) obj);
            }
        }));
        duringCreated(t4u.m189320i()).filter(new qcj() { // from class: l.zxs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f206515a.m107044a3((Boolean) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.ays
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74006a.m107047d3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W2 */
    public final void m107040W2(int[] iArr, BLiveUnreadTypeEnum bLiveUnreadTypeEnum, int i) {
        if (i <= 0 || bLiveUnreadTypeEnum == null) {
            return;
        }
        String string = bLiveUnreadTypeEnum.toString();
        string.getClass();
        switch (string) {
            case "number":
                iArr[1] = iArr[1] + i;
                break;
            case "redDot":
                iArr[2] = iArr[2] + 1;
                break;
            case "guild":
                iArr[3] = iArr[3] + i;
                break;
            case "liveIcon":
                iArr[0] = iArr[0] + 1;
                break;
        }
    }

    /* JADX INFO: renamed from: X2 */
    public final boolean m107041X2() {
        if (!((Boolean) m160243N2(new jcs())).booleanValue() || !t4u.m189319h() || !pzi0.m174463x(20, 24)) {
            return false;
        }
        return !pzi0.m174438C(pzi0.m174454o(), ((fm3) tbs.m190077m(itd0.f116823e)).f99716f.get().longValue());
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m107042Y2(Throwable th) {
        m107049f3(null);
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ Boolean m107043Z2(Integer num) {
        return (Boolean) m160243N2(new jcs());
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ Boolean m107044a3(Boolean bool) {
        return (Boolean) m160243N2(new jcs());
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m107045b3() {
        return !((bk3) tbs.m190077m(itd0.f116822d)).f77038a.get().booleanValue();
    }

    /* JADX INFO: renamed from: c3 */
    public final boolean m107046c3() {
        return !ppi0.m173207l().m173228x() && mqr.m159590j() && ((fm3) tbs.m190077m(itd0.f116823e)).m126176d() && y6u.m214498b();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m107047d3(Boolean bool) {
        if (bool.booleanValue()) {
            itd0<gm3> itd0Var = itd0.f116821c;
            if (((gm3) tbs.m190077m(itd0Var)).f104911a.m222765i() && ((gm3) tbs.m190077m(itd0Var)).f104919i.m222765i()) {
                Pair<LiveActivitiesEntry, Boolean> pair = new Pair<>(((gm3) tbs.m190077m(itd0Var)).f104911a.m222761e(), ((gm3) tbs.m190077m(itd0Var)).f104919i.m222761e());
                if (pair.first == null || pair.second == null) {
                    return;
                }
                m107049f3(pair);
            }
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final void m107048e3(BLiveActivitySummary bLiveActivitySummary, int[] iArr) {
        int i = iArr[1];
        if (i > 0) {
            m107050g3(i, bLiveActivitySummary.description.redDotNum);
            Act act = getAct();
            TabName tabName = TabName.Live;
            mbs.m157839Y(act, tabName, iArr[1]);
            mbs.m157838X(getAct(), tabName, false);
            return;
        }
        m107050g3(i, 0);
        Act act2 = getAct();
        TabName tabName2 = TabName.Live;
        mbs.m157839Y(act2, tabName2, 0);
        if (iArr[2] <= 0) {
            mbs.m157838X(getAct(), tabName2, false);
            return;
        }
        m107050g3(iArr[1], 0);
        mbs.m157838X(getAct(), tabName2, true);
        mbs.m157839Y(getAct(), tabName2, 0);
    }

    /* JADX INFO: renamed from: f3 */
    public final void m107049f3(Pair<LiveActivitiesEntry, Boolean> pair) {
        Integer numM130731f;
        LiveActivitiesEntry liveActivitiesEntry = (LiveActivitiesEntry) pair.first;
        boolean zBooleanValue = ((Boolean) pair.second).booleanValue();
        int[] iArr = {0, 0, 0, 0};
        if (liveActivitiesEntry == null || liveActivitiesEntry.getLiveActivitySummary() == null) {
            Act act = getAct();
            TabName tabName = TabName.Live;
            mbs.m157838X(act, tabName, zBooleanValue);
            mbs.m157839Y(getAct(), tabName, 0);
            return;
        }
        BLiveActivitySummary liveActivitySummary = liveActivitiesEntry.getLiveActivitySummary();
        m160238F2().LiveHomeStartLiveEvent.showRedDot().mo199273j(Boolean.valueOf(m107046c3()));
        m107040W2(iArr, tbs.f172989b.m203724s3(), liveActivitySummary.description.redDotNum);
        boolean zNeedShowActivitiesRedDot = liveActivitiesEntry.needShowActivitiesRedDot();
        boolean zM107045b3 = m107045b3();
        m107040W2(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), zNeedShowActivitiesRedDot ? 1 : 0);
        m107040W2(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), zM107045b3 ? 1 : 0);
        m107040W2(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), zBooleanValue ? 1 : 0);
        if (((Boolean) m160243N2(new jcs())).booleanValue() && (numM130731f = ((gm3) tbs.m190077m(itd0.f116821c)).m130731f()) != null) {
            if (numM130731f.intValue() > 0) {
                if (tbs.f172989b.m203540V5()) {
                    m107040W2(iArr, BLiveUnreadTypeEnum.get("number"), numM130731f.intValue());
                } else {
                    m107040W2(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), numM130731f.intValue() > 0 ? 1 : 0);
                }
            }
            if (m107041X2()) {
                ((fm3) tbs.m190077m(itd0.f116823e)).f99716f.put(Long.valueOf(pzi0.m174454o()));
                m107040W2(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), 1);
            }
        }
        StringBuilder sb = new StringBuilder("result:[");
        sb.append(iArr[0]);
        sb.append("-");
        sb.append(iArr[1]);
        sb.append("-");
        sb.append(iArr[2]);
        sb.append("-");
        sb.append(iArr[3]);
        sb.append(Constants.AES_SUFFIX);
        liveActivitySummary.toJson();
        m107048e3(liveActivitySummary, iArr);
    }

    /* JADX INFO: renamed from: g3 */
    public final void m107050g3(int i, int i2) {
        itd0<fk3> itd0Var = itd0.f116820b;
        lc3 lc3VarM125969t = ((fk3) tbs.m190077m(itd0Var)).m125969t();
        if (lc3VarM125969t == null) {
            lc3VarM125969t = lc3.m153618b();
        }
        lc3VarM125969t.m153620c(i, -1, i2, -1);
        ((fk3) tbs.m190077m(itd0Var)).m125951R(lc3VarM125969t);
    }

    /* JADX INFO: renamed from: h3 */
    public final void m107051h3(Integer num) {
        itd0<gm3> itd0Var = itd0.f116821c;
        if (((gm3) tbs.m190077m(itd0Var)).f104911a.m222765i() && ((gm3) tbs.m190077m(itd0Var)).f104919i.m222765i()) {
            Pair<LiveActivitiesEntry, Boolean> pairCreate = Pair.create(((gm3) tbs.m190077m(itd0Var)).f104911a.m222761e(), ((gm3) tbs.m190077m(itd0Var)).f104919i.m222761e());
            if (num.intValue() == 0 && pairCreate.second != null) {
                Act act = getAct();
                TabName tabName = TabName.Live;
                mbs.m157838X(act, tabName, ((Boolean) pairCreate.second).booleanValue());
                mbs.m157839Y(getAct(), tabName, 0);
            }
            if (pairCreate.first == null || pairCreate.second == null) {
                return;
            }
            m107049f3(pairCreate);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
    }
}
