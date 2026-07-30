package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveActivityCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class pzn extends txs {

    /* JADX INFO: renamed from: f */
    public kcg0 f154938f;

    /* JADX INFO: renamed from: g */
    public final b8o f154939g;

    /* JADX INFO: renamed from: h */
    public boolean f154940h;

    public pzn(ner nerVar, nus nusVar, b8o b8oVar) {
        super(nerVar, nusVar);
        this.f154940h = true;
        this.f154939g = b8oVar;
    }

    /* JADX INFO: renamed from: c3 */
    private void m174556c3(int[] iArr, BLiveUnreadTypeEnum bLiveUnreadTypeEnum, int i) {
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
    private boolean m174557m3() {
        return !((bk3) tbs.m190077m(itd0.f116822d)).f77038a.get().booleanValue();
    }

    /* JADX INFO: renamed from: n3 */
    private boolean m174558n3() {
        return !ppi0.m173207l().m173228x() && mqr.m159590j() && ((fm3) tbs.m190077m(itd0.f116823e)).m126176d() && y6u.m214498b();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        C22421c<BLiveCounter> c22421cDistinctUntilChanged = ((fk3) tbs.m190077m(itd0.f116820b)).m125957h().distinctUntilChanged();
        itd0<gm3> itd0Var = itd0.f116821c;
        m113231o2(psd0.m173626s(c22421cDistinctUntilChanged, ((gm3) tbs.m190077m(itd0Var)).m130729d(), this.f154939g.m103012l(), new scj() { // from class: l.czn
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new bkj0((BLiveCounter) obj, (Long) obj2, (List) obj3);
            }
        }), false).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.gzn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107216a.m174559d3((bkj0) obj);
            }
        }, new y20() { // from class: l.hzn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112273a.m174560e3((Throwable) obj);
            }
        }));
        if (y6u.m214516t()) {
            duringCreated(((gm3) tbs.m190077m(itd0Var)).m130733h()).subscribe(dhw.m115829h(new y20() { // from class: l.izn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f117721a.m174571s3((BLiveCounter) obj);
                }
            }));
            duringCreated(tbs.f172989b.m203652j6().take(1)).subscribe(dhw.m115829h(new y20() { // from class: l.jzn
                @Override // p153l.y20
                public final void call(Object obj) {
                    LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
                }
            }));
        }
        duringCreated(mbs.m157879v()).filter(new qcj() { // from class: l.kzn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(tbs.f172989b.m203581a7());
            }
        }).filter(new qcj() { // from class: l.lzn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((fm3) tbs.m190077m(itd0.f116823e)).f99719i.get();
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.mzn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139536a.m174561f3((Boolean) obj);
            }
        }));
        duringCreated(((gm3) tbs.m190077m(itd0Var)).m130727b()).subscribe(dhw.m115829h(new y20() { // from class: l.nzn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144461a.m174562g3((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m174559d3(bkj0 bkj0Var) {
        BLiveCounter bLiveCounter = (BLiveCounter) bkj0Var.f77081a;
        if (y6u.m214516t()) {
            m174569q3(bLiveCounter);
        } else {
            m174571s3(bLiveCounter);
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m174560e3(Throwable th) {
        m174571s3(BLiveCounter.new_());
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m174561f3(Boolean bool) {
        ((fm3) tbs.m190077m(itd0.f116823e)).f99719i.put(Boolean.FALSE);
        m174571s3(null);
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m174562g3(Boolean bool) {
        m174571s3(((fk3) tbs.m190077m(itd0.f116820b)).m125958i());
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m174563h3(BLiveCounter bLiveCounter, BLiveCounter bLiveCounter2) {
        BLiveActivityCounter bLiveActivityCounter = bLiveCounter.activity;
        BLiveActivityCounter bLiveActivityCounter2 = bLiveCounter2.activity;
        bLiveActivityCounter.voiceActivityUnread = bLiveActivityCounter2.voiceActivityUnread;
        bLiveCounter.voiceLiveTextRedDot = bLiveCounter2.voiceLiveTextRedDot;
        bLiveActivityCounter.momentUnReadCon = bLiveActivityCounter2.momentUnReadCon;
        bLiveActivityCounter.momentRedDotType = bLiveActivityCounter2.momentRedDotType;
        ((gm3) tbs.m190077m(itd0.f116821c)).m130733h().m137019l(bLiveCounter);
        m174571s3(bLiveCounter);
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m174564i3(BLiveCounter bLiveCounter, Throwable th) {
        m174571s3(bLiveCounter);
    }

    /* JADX INFO: renamed from: j3 */
    public final boolean m174565j3() {
        return IntlLiveSquareApi.needShowActivitiesRedDot();
    }

    /* JADX INFO: renamed from: k3 */
    public final boolean m174566k3() {
        return ((fm3) tbs.m190077m(itd0.f116823e)).f99719i.get().booleanValue() && tbs.f172989b.m203581a7();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f154938f);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m174567o3(BLiveCounter bLiveCounter, int[] iArr) {
        int i = iArr[3];
        if (i <= 0) {
            m174572t3(-1, -1, -1, 0);
            mbs.m157839Y(getAct(), TabName.Live, iArr[1] + iArr[3]);
            return;
        }
        m174572t3(-1, -1, -1, i);
        Act act = getAct();
        TabName tabName = TabName.Live;
        mbs.m157839Y(act, tabName, iArr[1]);
        mbs.m157838X(getAct(), tabName, false);
    }

    /* JADX INFO: renamed from: p3 */
    public final void m174568p3(BLiveCounter bLiveCounter, int[] iArr) {
        int i = iArr[1];
        if (i > 0) {
            int i2 = bLiveCounter.activity.voiceActivityUnread;
            m174572t3(i, i2, i - i2, -1);
            Act act = getAct();
            TabName tabName = TabName.Live;
            mbs.m157839Y(act, tabName, iArr[1]);
            mbs.m157838X(getAct(), tabName, false);
            return;
        }
        m174572t3(i, -1, 0, -1);
        Act act2 = getAct();
        TabName tabName2 = TabName.Live;
        mbs.m157839Y(act2, tabName2, 0);
        if (iArr[2] <= 0) {
            mbs.m157838X(getAct(), tabName2, false);
            return;
        }
        m174572t3(iArr[1], -1, 0, -1);
        mbs.m157838X(getAct(), tabName2, true);
        mbs.m157839Y(getAct(), tabName2, 0);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m174569q3(final BLiveCounter bLiveCounter) {
        this.f154938f = LiveVoiceApi.requestVoiceRedDot().subscribe(dhw.m115826e(new y20() { // from class: l.ezn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96609a.m174563h3(bLiveCounter, (BLiveCounter) obj);
            }
        }, new y20() { // from class: l.fzn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101489a.m174564i3(bLiveCounter, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [l.pzn] */
    /* JADX INFO: renamed from: r3 */
    public final void m174570r3(BLiveCounter bLiveCounter) {
        ?? BooleanValue = 0;
        int[] iArr = {0, 0, 0, 0};
        m174556c3(iArr, tbs.f172989b.m203633gb(), bLiveCounter.liveTabUnread);
        m174556c3(iArr, tbs.f172989b.m203724s3(), bLiveCounter.activity.squareDetailUnread);
        boolean zM174565j3 = m174565j3();
        boolean zM174557m3 = m174557m3();
        m174556c3(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), zM174565j3 ? 1 : 0);
        m174556c3(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.guild), bLiveCounter.guildLiveRedDot);
        if (bLiveCounter.guildLiveRedDot > 0 && iArr[1] - bLiveCounter.activity.voiceActivityUnread == 0 && this.f154940h) {
            this.f154940h = false;
            t4u.m189327p("square-multi-call");
        }
        if (((BLiveSquareTab) jyb.m147529r(this.f154939g.m103008h(), new qcj() { // from class: l.ozn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveSquareTab) obj).name, "square-multi-call"));
            }
        })) == null) {
            m174556c3(iArr, BLiveUnreadTypeEnum.get("number"), bLiveCounter.guildLiveRedDot);
        }
        BLiveSquareTab bLiveSquareTab = (BLiveSquareTab) jyb.m147529r(this.f154939g.m103008h(), new qcj() { // from class: l.dzn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveSquareTab) obj).name, "square-intlGame"));
            }
        });
        if (bLiveSquareTab != null) {
            Boolean boolM130728c = ((gm3) tbs.m190077m(itd0.f116821c)).m130728c();
            if (boolM130728c != null) {
                BooleanValue = boolM130728c.booleanValue();
            } else if (!((fm3) tbs.m190077m(itd0.f116823e)).f99721k.get().booleanValue() || bLiveSquareTab.hasRedDot) {
                BooleanValue = 1;
            }
            m174556c3(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), BooleanValue);
        }
        if (zM174565j3) {
            ((fk3) tbs.m190077m(itd0.f116820b)).m125942I("live_tab_red_dot");
        }
        m174556c3(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), zM174557m3 ? 1 : 0);
        boolean zM214516t = y6u.m214516t();
        boolean zM203540V5 = tbs.f172989b.m203540V5();
        if (zM214516t) {
            if (zM203540V5) {
                m174556c3(iArr, BLiveUnreadTypeEnum.get("number"), bLiveCounter.activity.voiceActivityUnread);
            } else {
                m174556c3(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), bLiveCounter.activity.voiceActivityUnread);
            }
            m174556c3(iArr, BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), !jyb.m147479J(bLiveCounter.voiceLiveTextRedDot) ? 1 : 0);
        }
        bLiveCounter.toJson();
        m174568p3(bLiveCounter, iArr);
        m174567o3(bLiveCounter, iArr);
    }

    /* JADX INFO: renamed from: s3 */
    public final void m174571s3(BLiveCounter bLiveCounter) {
        if (m174566k3()) {
            Act act = getAct();
            TabName tabName = TabName.Live;
            mbs.m157838X(act, tabName, true);
            mbs.m157839Y(getAct(), tabName, 0);
            return;
        }
        if (bLiveCounter != null) {
            m160238F2().LiveHomeStartLiveEvent.showRedDot().mo199273j(Boolean.valueOf(m174558n3()));
            m174570r3(bLiveCounter);
        } else {
            Act act2 = getAct();
            TabName tabName2 = TabName.Live;
            mbs.m157838X(act2, tabName2, false);
            mbs.m157839Y(getAct(), tabName2, 0);
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final void m174572t3(int i, int i2, int i3, int i4) {
        itd0<fk3> itd0Var = itd0.f116820b;
        lc3 lc3VarM125969t = ((fk3) tbs.m190077m(itd0Var)).m125969t();
        if (lc3VarM125969t == null) {
            lc3VarM125969t = lc3.m153618b();
        }
        lc3VarM125969t.m153620c(i, i2, i3, i4);
        ((fk3) tbs.m190077m(itd0Var)).m125951R(lc3VarM125969t);
    }
}
