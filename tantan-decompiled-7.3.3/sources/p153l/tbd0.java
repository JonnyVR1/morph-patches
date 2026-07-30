package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.UserLiveSettings;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveRightInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.base.data.BLiveScrapCraftReq;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public class tbd0 extends ar2<vbd0> {

    /* JADX INFO: renamed from: a */
    public UserRightType f172904a;

    /* JADX INFO: renamed from: b */
    public String f172905b;

    /* JADX INFO: renamed from: c */
    public String f172906c;

    /* JADX INFO: renamed from: d */
    public String f172907d;

    /* JADX INFO: renamed from: e */
    public String f172908e;

    /* JADX INFO: renamed from: f */
    public iad0 f172909f;

    /* JADX INFO: renamed from: g */
    public cad0 f172910g;

    /* JADX INFO: renamed from: h */
    public boolean f172911h;

    /* JADX INFO: renamed from: i */
    public final Act f172912i;

    /* JADX INFO: renamed from: j */
    public String f172913j;

    public tbd0(Frag frag) {
        super(frag.act());
        this.f172911h = false;
        this.f172913j = "";
        this.f172912i = frag.act();
        m190005y0(frag);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m189970i0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m189976o0(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 40099) {
                o1j0.m165651y(coreService.metaMessage);
            }
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m189981A0(BLiveEnvelope bLiveEnvelope) {
        o1j0.m165649w(R$string.f45043p0);
        m189996S0();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m189982C0(dbd0 dbd0Var, Throwable th) {
        m190004x0(dbd0Var, th, R$string.f45050r1);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m189983D0(dbd0 dbd0Var, BLiveEnvelope bLiveEnvelope) {
        o1j0.m165649w(R$string.f45059u1);
        m189997U0(dbd0Var);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m189984E0(dbd0 dbd0Var, Throwable th) {
        m190004x0(dbd0Var, th, R$string.f45056t1);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m189985F0(dbd0 dbd0Var, BLiveEnvelope bLiveEnvelope) {
        o1j0.m165649w(R$string.f44984T0);
        m189997U0(dbd0Var);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m189986G0(dbd0 dbd0Var, Throwable th) {
        m190004x0(dbd0Var, th, R$string.f44982S0);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m189987H0(dbd0 dbd0Var, BLiveEnvelope bLiveEnvelope) {
        o1j0.m165649w(R$string.f45053s1);
        m189997U0(dbd0Var);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m189988I0(a9d0 a9d0Var) {
        this.f172911h = false;
        iad0 iad0Var = this.f172909f;
        if (iad0Var != null) {
            iad0Var.m139191j(a9d0Var);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m189989J0(BLiveRightInfo bLiveRightInfo) {
        ((vbd0) this.viewModel).m200697m(bLiveRightInfo, this.f172904a, this.f172913j);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m189990L0(ycd0 ycd0Var, SettingGroups settingGroups) {
        o1j0.m165651y(!settingGroups.live.closeEnterRoomMsg.booleanValue() ? tbs.f172988a.getString(R$string.f45067x0) : tbs.f172988a.getString(R$string.f45064w0));
        ((vbd0) this.viewModel).m200699p(ycd0Var);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m189991N0(ycd0 ycd0Var, Throwable th) {
        boolean z = th instanceof TantanException.Client.TantanForbidden;
        if (z && ((TantanException.Client.TantanForbidden) th).isLevelNotEnoughToOpen()) {
            o1j0.m165651y(tbs.f172988a.getString(R$string.f44967L));
            ((vbd0) this.viewModel).m200699p(ycd0Var);
            return;
        }
        if (z && ((TantanException.Client.TantanForbidden) th).isLevelNotEnoughToClose()) {
            o1j0.m165651y(tbs.f172988a.getString(R$string.f44965K));
            ((vbd0) this.viewModel).m200699p(ycd0Var);
        } else if (!z || !((TantanException.Client.TantanForbidden) th).isLevelNotEnoughToCloseNew()) {
            o1j0.m165651y(tbs.f172988a.getString(R$string.f44987V));
        } else {
            o1j0.m165651y(tbs.f172988a.getString(R$string.f44956F0));
            ((vbd0) this.viewModel).m200699p(ycd0Var);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m189992O0(String str) {
        if (this.f172910g == null) {
            this.f172910g = new cad0(this.f172912i);
        }
        zit zitVar = new zit(str);
        if (zitVar.mo137768c(str)) {
            if (TextUtils.equals(zitVar.f112154a, "showH5")) {
                m190001Y0(zitVar);
            } else if (TextUtils.equals(zitVar.f112154a, "showProfilePage")) {
                m189999W0(zitVar);
            } else if (TextUtils.equals(zitVar.f112154a, "showTTCoinDialog")) {
                mbs.m157850e0(this.f172912i, "live", null);
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m189993P0(ycd0 ycd0Var) {
        if (ycd0Var.m215142H()) {
            m190000X0(ycd0Var);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m189994Q0() {
        ((vbd0) this.viewModel).m200695k(this.f172904a);
    }

    /* JADX INFO: renamed from: R0 */
    public void m189995R0(String str, String str2, boolean z) {
        if (this.f172911h) {
            return;
        }
        LiveSquareApi.requestRightBindAnchors(this.f172904a, str, str2, z).subscribe(dhw.m115826e(new y20() { // from class: l.qbd0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((fk3) tbs.m190077m(itd0.f116820b)).f99472w.onNext((a9d0) obj);
            }
        }, new y20() { // from class: l.rbd0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((fk3) tbs.m190077m(itd0.f116820b)).f99472w.onNext(null);
            }
        }));
        this.f172911h = true;
    }

    /* JADX INFO: renamed from: S0 */
    public void m189996S0() {
        m189997U0(((vbd0) this.viewModel).m200693i(true));
    }

    /* JADX INFO: renamed from: U0 */
    public final void m189997U0(@Nullable dbd0 dbd0Var) {
        duringCreated(LiveSquareApi.getUserRightList(this.f172904a, this.f172905b, this.f172906c, this.f172908e, this.f172907d, this.f172913j, dbd0Var)).subscribe(dhw.m115826e(new y20() { // from class: l.kbd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124932a.m189989J0((BLiveRightInfo) obj);
            }
        }, new y20() { // from class: l.lbd0
            @Override // p153l.y20
            public final void call(Object obj) {
                tbd0.m189970i0((Throwable) obj);
            }
        }));
        if (dbd0Var != null) {
            ((vbd0) this.viewModel).m200694j();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m189998V0(d9d0 d9d0Var) {
        if (this.f172909f == null) {
            this.f172909f = new iad0(this.f172904a, act(), this);
        }
        this.f172909f.m139192k(d9d0Var);
        m189995R0(d9d0Var.f85760e.rightId, "", false);
        ((vbd0) this.viewModel).m200694j();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m189999W0(zit zitVar) {
        String strM219937g = zitVar.m219937g("userId");
        String strM219937g2 = zitVar.m219937g("from");
        if (TextUtils.isEmpty(strM219937g)) {
            return;
        }
        mbs.m157862k0(this.f172912i, strM219937g, strM219937g2, true);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m190000X0(final ycd0 ycd0Var) {
        UserLiveSettings userLiveSettings = new UserLiveSettings();
        userLiveSettings.closeEnterRoomMsg = Boolean.valueOf(ycd0Var.isChecked());
        duringCreated(mbs.m157828N(userLiveSettings)).subscribe(dhw.m115826e(new y20() { // from class: l.mbd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135714a.m189990L0(ycd0Var, (SettingGroups) obj);
            }
        }, new y20() { // from class: l.nbd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141220a.m189991N0(ycd0Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m190001Y0(zit zitVar) {
        String strM219937g = zitVar.m219937g("H5Url");
        if (TextUtils.isEmpty(strM219937g)) {
            strM219937g = zitVar.m219937g("h5Url");
        }
        if (TextUtils.isEmpty(strM219937g)) {
            return;
        }
        this.f172910g.m108490k(strM219937g);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m189997U0(null);
        duringCreated(((fk3) tbs.m190077m(itd0.f116820b)).m125973x()).subscribe(dhw.m115825d(new y20() { // from class: l.ebd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92919a.m189988I0((a9d0) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
        cad0 cad0Var = this.f172910g;
        if (cad0Var != null) {
            cad0Var.m108488i();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m190002t0(d9d0 d9d0Var) {
        BLiveRightItem bLiveRightItem;
        if (d9d0Var == null || (bLiveRightItem = d9d0Var.f85760e) == null || bLiveRightItem.scrapInfo == null || !d9d0Var.m115015L()) {
            return;
        }
        BLiveScrapCraftReq bLiveScrapCraftReqNew_ = BLiveScrapCraftReq.new_();
        bLiveScrapCraftReqNew_.source = "rightTab";
        bLiveScrapCraftReqNew_.scenario = "live";
        bLiveScrapCraftReqNew_.roomId = this.f172906c;
        bLiveScrapCraftReqNew_.liveId = this.f172905b;
        bLiveScrapCraftReqNew_.anchorId = this.f172908e;
        bLiveScrapCraftReqNew_.targetItemId = d9d0Var.f85760e.rightId;
        bLiveScrapCraftReqNew_.originalId = UUID.randomUUID().toString();
        bLiveScrapCraftReqNew_.fakeId = tbs.f172993f.m143706h();
        duringCreated(LiveSquareApi.craftScrapToItem(String.valueOf(d9d0Var.f85760e.scrapInfo.itemId), bLiveScrapCraftReqNew_)).subscribe(dhw.m115826e(new y20() { // from class: l.obd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146577a.m189981A0((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.pbd0
            @Override // p153l.y20
            public final void call(Object obj) {
                tbd0.m189976o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public void m190003u0(d9d0 d9d0Var) {
        z8d0 z8d0Var = this.f172904a == UserRightType.CALL_EFFECT ? new z8d0(d9d0Var.f85760e.userRightId, d9d0Var.f85762g, "") : new z8d0(d9d0Var.f85760e.userRightId);
        final dbd0 dbd0VarM200693i = ((vbd0) this.viewModel).m200693i(d9d0Var.f85763h);
        if (d9d0Var.f85760e.isEquipped()) {
            duringCreated(LiveSquareApi.unEquipUserRight(this.f172904a, z8d0Var)).subscribe(dhw.m115826e(new y20() { // from class: l.sbd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167141a.m189983D0(dbd0VarM200693i, (BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.fbd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f98089a.m189984E0(dbd0VarM200693i, (Throwable) obj);
                }
            }));
        } else if (d9d0Var.f85760e.isActive()) {
            duringCreated(LiveSquareApi.equipUserRight(this.f172904a, z8d0Var)).subscribe(dhw.m115826e(new y20() { // from class: l.gbd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f103455a.m189985F0(dbd0VarM200693i, (BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.hbd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f108583a.m189986G0(dbd0VarM200693i, (Throwable) obj);
                }
            }));
        } else if (d9d0Var.f85760e.canActive()) {
            duringCreated(LiveSquareApi.activeUserRight(this.f172904a, z8d0Var)).subscribe(dhw.m115826e(new y20() { // from class: l.ibd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f114202a.m189987H0(dbd0VarM200693i, (BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.jbd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f119860a.m189982C0(dbd0VarM200693i, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m190004x0(dbd0 dbd0Var, Throwable th, int i) {
        o1j0.m165649w(i);
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 42305) {
            m189997U0(dbd0Var);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m190005y0(Frag frag) {
        Bundle arguments = frag.getArguments();
        if (arguments != null) {
            this.f172904a = UserRightType.valueOf(arguments.getString("right_type"));
            this.f172905b = arguments.getString("liveId");
            this.f172906c = arguments.getString("roomId");
            this.f172907d = arguments.getString("anchor_name");
            this.f172908e = arguments.getString("anchor_id");
            String string = arguments.getString("live_type");
            if (BLiveAbsData.VOICE_LIVE.equals(string)) {
                this.f172913j = k9d0.f124539b;
            } else if ("live".equals(string)) {
                this.f172913j = k9d0.f124538a;
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m190006z0() {
        return !TextUtils.isEmpty(this.f172906c);
    }
}
