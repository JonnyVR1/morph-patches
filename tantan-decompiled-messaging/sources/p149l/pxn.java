package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveActivityCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class pxn extends svs {

    /* JADX INFO: renamed from: f */
    public c4g0 f151707f;

    /* JADX INFO: renamed from: g */
    public final b6o f151708g;

    /* JADX INFO: renamed from: h */
    public boolean f151709h;

    public pxn(mcr mcrVar, mss mssVar, b6o b6oVar) {
        super(mcrVar, mssVar);
        this.f151709h = true;
        this.f151708g = b6oVar;
    }

    /* JADX INFO: renamed from: c3 */
    private void m171930c3(int[] iArr, BLiveUnreadTypeEnum bLiveUnreadTypeEnum, int i) {
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

    /* JADX INFO: renamed from: m3 */
    private boolean m171931m3() {
        return !((jj3) s9s.m182763m(gld0.f103314d)).f118220a.get().booleanValue();
    }

    /* JADX INFO: renamed from: n3 */
    private boolean m171932n3() {
        return !pgi0.m168730l().m168751x() && lor.m150805j() && ((gl3) s9s.m182763m(gld0.f103315e)).m126741d() && x4u.m207016b();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        C22306c<BLiveCounter> c22306cDistinctUntilChanged = ((nj3) s9s.m182763m(gld0.f103312b)).m159626h().distinctUntilChanged();
        gld0<hl3> gld0Var = gld0.f103313c;
        m104250o2(mkd0.m154985s(c22306cDistinctUntilChanged, ((hl3) s9s.m182763m(gld0Var)).m131630d(), this.f151708g.m100454l(), new y9j() { // from class: l.cxn
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new xaj0((BLiveCounter) obj, (Long) obj2, (List) obj3);
            }
        }), false).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.gxn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104908a.m171933d3((xaj0) obj);
            }
        }, new e30() { // from class: l.hxn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109893a.m171934e3((Throwable) obj);
            }
        }));
        if (x4u.m207034t()) {
            duringCreated(((hl3) s9s.m182763m(gld0Var)).m131634h()).subscribe(ffw.m121197h(new e30() { // from class: l.ixn
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f115378a.m171945s3((BLiveCounter) obj);
                }
            }));
            duringCreated(s9s.f163228b.m195865j6().take(1)).subscribe(ffw.m121197h(new e30() { // from class: l.jxn
                @Override // p149l.e30
                public final void call(Object obj) {
                    LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
                }
            }));
        }
        duringCreated(l9s.m149102v()).filter(new w9j() { // from class: l.kxn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(s9s.f163228b.m195794a7());
            }
        }).filter(new w9j() { // from class: l.lxn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((gl3) s9s.m182763m(gld0.f103315e)).f103288i.get();
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.mxn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136187a.m171935f3((Boolean) obj);
            }
        }));
        duringCreated(((hl3) s9s.m182763m(gld0Var)).m131628b()).subscribe(ffw.m121197h(new e30() { // from class: l.nxn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141034a.m171936g3((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m171933d3(xaj0 xaj0Var) {
        BLiveCounter bLiveCounter = (BLiveCounter) xaj0Var.f191751a;
        if (x4u.m207034t()) {
            m171943q3(bLiveCounter);
        } else {
            m171945s3(bLiveCounter);
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m171934e3(Throwable th) {
        m171945s3(BLiveCounter.new_());
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m171935f3(Boolean bool) {
        ((gl3) s9s.m182763m(gld0.f103315e)).f103288i.put(Boolean.FALSE);
        m171945s3(null);
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m171936g3(Boolean bool) {
        m171945s3(((nj3) s9s.m182763m(gld0.f103312b)).m159627i());
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m171937h3(BLiveCounter bLiveCounter, BLiveCounter bLiveCounter2) {
        BLiveActivityCounter bLiveActivityCounter = bLiveCounter.activity;
        BLiveActivityCounter bLiveActivityCounter2 = bLiveCounter2.activity;
        bLiveActivityCounter.voiceActivityUnread = bLiveActivityCounter2.voiceActivityUnread;
        bLiveCounter.voiceLiveTextRedDot = bLiveCounter2.voiceLiveTextRedDot;
        bLiveActivityCounter.momentUnReadCon = bLiveActivityCounter2.momentUnReadCon;
        bLiveActivityCounter.momentRedDotType = bLiveActivityCounter2.momentRedDotType;
        ((hl3) s9s.m182763m(gld0.f103313c)).m131634h().m132487l(bLiveCounter);
        m171945s3(bLiveCounter);
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m171938i3(BLiveCounter bLiveCounter, Throwable th) {
        m171945s3(bLiveCounter);
    }

    /* JADX INFO: renamed from: j3 */
    public final boolean m171939j3() {
        return IntlLiveSquareApi.needShowActivitiesRedDot();
    }

    /* JADX INFO: renamed from: k3 */
    public final boolean m171940k3() {
        return ((gl3) s9s.m182763m(gld0.f103315e)).f103288i.get().booleanValue() && s9s.f163228b.m195794a7();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f151707f);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m171941o3(BLiveCounter bLiveCounter, int[] iArr) {
        int i = iArr[3];
        if (i <= 0) {
            m171946t3(-1, -1, -1, 0);
            l9s.m149062Y(getAct(), TabName.Live, iArr[1] + iArr[3]);
            return;
        }
        m171946t3(-1, -1, -1, i);
        Act act = getAct();
        TabName tabName = TabName.Live;
        l9s.m149062Y(act, tabName, iArr[1]);
        l9s.m149061X(getAct(), tabName, false);
    }

    /* JADX INFO: renamed from: p3 */
    public final void m171942p3(BLiveCounter bLiveCounter, int[] iArr) {
        int i = iArr[1];
        if (i > 0) {
            int i2 = bLiveCounter.activity.voiceActivityUnread;
            m171946t3(i, i2, i - i2, -1);
            Act act = getAct();
            TabName tabName = TabName.Live;
            l9s.m149062Y(act, tabName, iArr[1]);
            l9s.m149061X(getAct(), tabName, false);
            return;
        }
        m171946t3(i, -1, 0, -1);
        Act act2 = getAct();
        TabName tabName2 = TabName.Live;
        l9s.m149062Y(act2, tabName2, 0);
        if (iArr[2] <= 0) {
            l9s.m149061X(getAct(), tabName2, false);
            return;
        }
        m171946t3(iArr[1], -1, 0, -1);
        l9s.m149061X(getAct(), tabName2, true);
        l9s.m149062Y(getAct(), tabName2, 0);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m171943q3(final BLiveCounter bLiveCounter) {
        this.f151707f = LiveVoiceApi.requestVoiceRedDot().subscribe(ffw.m121194e(new e30() { // from class: l.exn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93679a.m171937h3(bLiveCounter, (BLiveCounter) obj);
            }
        }, new e30() { // from class: l.fxn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99778a.m171938i3(bLiveCounter, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [l.pxn] */
    /* JADX INFO: renamed from: r3 */
    public final void m171944r3(BLiveCounter bLiveCounter) {
        ?? BooleanValue = 0;
        int[] iArr = {0, 0, 0, 0};
        m171930c3(iArr, s9s.f163228b.m195846gb(), bLiveCounter.liveTabUnread);
        m171930c3(iArr, s9s.f163228b.m195937s3(), bLiveCounter.activity.squareDetailUnread);
        boolean zM171939j3 = m171939j3();
        boolean zM171931m3 = m171931m3();
        m171930c3(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), zM171939j3 ? 1 : 0);
        m171930c3(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.guild), bLiveCounter.guildLiveRedDot);
        if (bLiveCounter.guildLiveRedDot > 0 && iArr[1] - bLiveCounter.activity.voiceActivityUnread == 0 && this.f151709h) {
            this.f151709h = false;
            s2u.m182084p("square-multi-call");
        }
        if (((BLiveSquareTab) vwb.m200346r(this.f151708g.m100450h(), new w9j() { // from class: l.oxn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveSquareTab) obj).name, "square-multi-call"));
            }
        })) == null) {
            m171930c3(iArr, BLiveUnreadTypeEnum.get("number"), bLiveCounter.guildLiveRedDot);
        }
        BLiveSquareTab bLiveSquareTab = (BLiveSquareTab) vwb.m200346r(this.f151708g.m100450h(), new w9j() { // from class: l.dxn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveSquareTab) obj).name, "square-intlGame"));
            }
        });
        if (bLiveSquareTab != null) {
            Boolean boolM131629c = ((hl3) s9s.m182763m(gld0.f103313c)).m131629c();
            if (boolM131629c != null) {
                BooleanValue = boolM131629c.booleanValue();
            } else if (!((gl3) s9s.m182763m(gld0.f103315e)).f103290k.get().booleanValue() || bLiveSquareTab.hasRedDot) {
                BooleanValue = 1;
            }
            m171930c3(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), BooleanValue);
        }
        if (zM171939j3) {
            ((nj3) s9s.m182763m(gld0.f103312b)).m159611I("live_tab_red_dot");
        }
        m171930c3(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), zM171931m3 ? 1 : 0);
        boolean zM207034t = x4u.m207034t();
        boolean zM195753V5 = s9s.f163228b.m195753V5();
        if (zM207034t) {
            if (zM195753V5) {
                m171930c3(iArr, BLiveUnreadTypeEnum.get("number"), bLiveCounter.activity.voiceActivityUnread);
            } else {
                m171930c3(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), bLiveCounter.activity.voiceActivityUnread);
            }
            m171930c3(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), !vwb.m200296J(bLiveCounter.voiceLiveTextRedDot) ? 1 : 0);
        }
        bLiveCounter.toJson();
        m171942p3(bLiveCounter, iArr);
        m171941o3(bLiveCounter, iArr);
    }

    /* JADX INFO: renamed from: s3 */
    public final void m171945s3(BLiveCounter bLiveCounter) {
        if (m171940k3()) {
            Act act = getAct();
            TabName tabName = TabName.Live;
            l9s.m149061X(act, tabName, true);
            l9s.m149062Y(getAct(), tabName, 0);
            return;
        }
        if (bLiveCounter != null) {
            m151642F2().LiveHomeStartLiveEvent.showRedDot().mo172463j(Boolean.valueOf(m171932n3()));
            m171944r3(bLiveCounter);
        } else {
            Act act2 = getAct();
            TabName tabName2 = TabName.Live;
            l9s.m149061X(act2, tabName2, false);
            l9s.m149062Y(getAct(), tabName2, 0);
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final void m171946t3(int i, int i2, int i3, int i4) {
        gld0<nj3> gld0Var = gld0.f103312b;
        wb3 wb3VarM159638t = ((nj3) s9s.m182763m(gld0Var)).m159638t();
        if (wb3VarM159638t == null) {
            wb3VarM159638t = wb3.m202502b();
        }
        wb3VarM159638t.m202504c(i, i2, i3, i4);
        ((nj3) s9s.m182763m(gld0Var)).m159620R(wb3VarM159638t);
    }
}
