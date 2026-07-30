package p149l;

import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p046p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveActivitiesEntry;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class aws extends svs {
    public aws(mcr mcrVar, mss mssVar) {
        super(mcrVar, mssVar);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        gld0<hl3> gld0Var = gld0.f103313c;
        m104250o2(C22306c.combineLatest(((hl3) s9s.m182763m(gld0Var)).f108308a, ((hl3) s9s.m182763m(gld0Var)).f108316i, new x9j() { // from class: l.tvs
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new Pair((LiveActivitiesEntry) obj, (Boolean) obj2);
            }
        }), false).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.uvs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178558a.m99321f3((Pair) obj);
            }
        }, new e30() { // from class: l.vvs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183253a.m99314Y2((Throwable) obj);
            }
        }));
        m104250o2(((hl3) s9s.m182763m(gld0Var)).m131631e(), false).filter(new w9j() { // from class: l.wvs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f188282a.m99315Z2((Integer) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.xvs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194667a.m99323h3((Integer) obj);
            }
        }));
        duringCreated(s2u.m182077i()).filter(new w9j() { // from class: l.yvs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f200290a.m99316a3((Boolean) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.zvs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205060a.m99319d3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W2 */
    public final void m99312W2(int[] iArr, BLiveUnreadTypeEnum bLiveUnreadTypeEnum, int i) {
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
    public final boolean m99313X2() {
        if (!((Boolean) m151646N2(new ias())).booleanValue() || !s2u.m182076h() || !mqi0.m155953x(20, 24)) {
            return false;
        }
        return !mqi0.m155928C(mqi0.m155944o(), ((gl3) s9s.m182763m(gld0.f103315e)).f103285f.get().longValue());
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m99314Y2(Throwable th) {
        m99321f3(null);
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ Boolean m99315Z2(Integer num) {
        return (Boolean) m151646N2(new ias());
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ Boolean m99316a3(Boolean bool) {
        return (Boolean) m151646N2(new ias());
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m99317b3() {
        return !((jj3) s9s.m182763m(gld0.f103314d)).f118220a.get().booleanValue();
    }

    /* JADX INFO: renamed from: c3 */
    public final boolean m99318c3() {
        return !pgi0.m168730l().m168751x() && lor.m150805j() && ((gl3) s9s.m182763m(gld0.f103315e)).m126741d() && x4u.m207016b();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m99319d3(Boolean bool) {
        if (bool.booleanValue()) {
            gld0<hl3> gld0Var = gld0.f103313c;
            if (((hl3) s9s.m182763m(gld0Var)).f108308a.m221519i() && ((hl3) s9s.m182763m(gld0Var)).f108316i.m221519i()) {
                Pair<LiveActivitiesEntry, Boolean> pair = new Pair<>(((hl3) s9s.m182763m(gld0Var)).f108308a.m221515e(), ((hl3) s9s.m182763m(gld0Var)).f108316i.m221515e());
                if (pair.first == null || pair.second == null) {
                    return;
                }
                m99321f3(pair);
            }
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final void m99320e3(BLiveActivitySummary bLiveActivitySummary, int[] iArr) {
        int i = iArr[1];
        if (i > 0) {
            m99322g3(i, bLiveActivitySummary.description.redDotNum);
            Act act = getAct();
            TabName tabName = TabName.Live;
            l9s.m149062Y(act, tabName, iArr[1]);
            l9s.m149061X(getAct(), tabName, false);
            return;
        }
        m99322g3(i, 0);
        Act act2 = getAct();
        TabName tabName2 = TabName.Live;
        l9s.m149062Y(act2, tabName2, 0);
        if (iArr[2] <= 0) {
            l9s.m149061X(getAct(), tabName2, false);
            return;
        }
        m99322g3(iArr[1], 0);
        l9s.m149061X(getAct(), tabName2, true);
        l9s.m149062Y(getAct(), tabName2, 0);
    }

    /* JADX INFO: renamed from: f3 */
    public final void m99321f3(Pair<LiveActivitiesEntry, Boolean> pair) {
        Integer numM131632f;
        LiveActivitiesEntry liveActivitiesEntry = (LiveActivitiesEntry) pair.first;
        boolean zBooleanValue = ((Boolean) pair.second).booleanValue();
        int[] iArr = {0, 0, 0, 0};
        if (liveActivitiesEntry == null || liveActivitiesEntry.getLiveActivitySummary() == null) {
            Act act = getAct();
            TabName tabName = TabName.Live;
            l9s.m149061X(act, tabName, zBooleanValue);
            l9s.m149062Y(getAct(), tabName, 0);
            return;
        }
        BLiveActivitySummary liveActivitySummary = liveActivitiesEntry.getLiveActivitySummary();
        m151642F2().LiveHomeStartLiveEvent.showRedDot().mo172463j(Boolean.valueOf(m99318c3()));
        m99312W2(iArr, s9s.f163228b.m195937s3(), liveActivitySummary.description.redDotNum);
        boolean zNeedShowActivitiesRedDot = liveActivitiesEntry.needShowActivitiesRedDot();
        boolean zM99317b3 = m99317b3();
        m99312W2(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), zNeedShowActivitiesRedDot ? 1 : 0);
        m99312W2(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), zM99317b3 ? 1 : 0);
        m99312W2(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), zBooleanValue ? 1 : 0);
        if (((Boolean) m151646N2(new ias())).booleanValue() && (numM131632f = ((hl3) s9s.m182763m(gld0.f103313c)).m131632f()) != null) {
            if (numM131632f.intValue() > 0) {
                if (s9s.f163228b.m195753V5()) {
                    m99312W2(iArr, BLiveUnreadTypeEnum.get("number"), numM131632f.intValue());
                } else {
                    m99312W2(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), numM131632f.intValue() > 0 ? 1 : 0);
                }
            }
            if (m99313X2()) {
                ((gl3) s9s.m182763m(gld0.f103315e)).f103285f.put(Long.valueOf(mqi0.m155944o()));
                m99312W2(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), 1);
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
        m99320e3(liveActivitySummary, iArr);
    }

    /* JADX INFO: renamed from: g3 */
    public final void m99322g3(int i, int i2) {
        gld0<nj3> gld0Var = gld0.f103312b;
        wb3 wb3VarM159638t = ((nj3) s9s.m182763m(gld0Var)).m159638t();
        if (wb3VarM159638t == null) {
            wb3VarM159638t = wb3.m202502b();
        }
        wb3VarM159638t.m202504c(i, -1, i2, -1);
        ((nj3) s9s.m182763m(gld0Var)).m159620R(wb3VarM159638t);
    }

    /* JADX INFO: renamed from: h3 */
    public final void m99323h3(Integer num) {
        gld0<hl3> gld0Var = gld0.f103313c;
        if (((hl3) s9s.m182763m(gld0Var)).f108308a.m221519i() && ((hl3) s9s.m182763m(gld0Var)).f108316i.m221519i()) {
            Pair<LiveActivitiesEntry, Boolean> pairCreate = Pair.create(((hl3) s9s.m182763m(gld0Var)).f108308a.m221515e(), ((hl3) s9s.m182763m(gld0Var)).f108316i.m221515e());
            if (num.intValue() == 0 && pairCreate.second != null) {
                Act act = getAct();
                TabName tabName = TabName.Live;
                l9s.m149061X(act, tabName, ((Boolean) pairCreate.second).booleanValue());
                l9s.m149062Y(getAct(), tabName, 0);
            }
            if (pairCreate.first == null || pairCreate.second == null) {
                return;
            }
            m99321f3(pairCreate);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
    }
}
