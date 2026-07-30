package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.UserLiveSettings;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveRightInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p046p1.mobile.putong.live.base.data.BLiveScrapCraftReq;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import java.util.UUID;

/* JADX INFO: loaded from: classes13.dex */
public class q3d0 extends jq2<s3d0> {

    /* JADX INFO: renamed from: a */
    public UserRightType f152416a;

    /* JADX INFO: renamed from: b */
    public String f152417b;

    /* JADX INFO: renamed from: c */
    public String f152418c;

    /* JADX INFO: renamed from: d */
    public String f152419d;

    /* JADX INFO: renamed from: e */
    public String f152420e;

    /* JADX INFO: renamed from: f */
    public f2d0 f152421f;

    /* JADX INFO: renamed from: g */
    public z1d0 f152422g;

    /* JADX INFO: renamed from: h */
    public boolean f152423h;

    /* JADX INFO: renamed from: i */
    public final Act f152424i;

    /* JADX INFO: renamed from: j */
    public String f152425j;

    public q3d0(Frag frag) {
        super(frag.act());
        this.f152423h = false;
        this.f152425j = "";
        this.f152424i = frag.act();
        m172804y0(frag);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m172769i0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m172775o0(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 40099) {
                lsi0.m151595y(coreService.metaMessage);
            }
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m172780A0(BLiveEnvelope bLiveEnvelope) {
        lsi0.m151593w(R$string.f44195p0);
        m172795S0();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m172781C0(a3d0 a3d0Var, Throwable th) {
        m172803x0(a3d0Var, th, R$string.f44202r1);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m172782D0(a3d0 a3d0Var, BLiveEnvelope bLiveEnvelope) {
        lsi0.m151593w(R$string.f44211u1);
        m172796U0(a3d0Var);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m172783E0(a3d0 a3d0Var, Throwable th) {
        m172803x0(a3d0Var, th, R$string.f44208t1);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m172784F0(a3d0 a3d0Var, BLiveEnvelope bLiveEnvelope) {
        lsi0.m151593w(R$string.f44136T0);
        m172796U0(a3d0Var);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m172785G0(a3d0 a3d0Var, Throwable th) {
        m172803x0(a3d0Var, th, R$string.f44134S0);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m172786H0(a3d0 a3d0Var, BLiveEnvelope bLiveEnvelope) {
        lsi0.m151593w(R$string.f44205s1);
        m172796U0(a3d0Var);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m172787I0(x0d0 x0d0Var) {
        this.f152423h = false;
        f2d0 f2d0Var = this.f152421f;
        if (f2d0Var != null) {
            f2d0Var.m119173j(x0d0Var);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m172788J0(BLiveRightInfo bLiveRightInfo) {
        ((s3d0) this.viewModel).m182141m(bLiveRightInfo, this.f152416a, this.f152425j);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m172789L0(v4d0 v4d0Var, SettingGroups settingGroups) {
        lsi0.m151595y(!settingGroups.live.closeEnterRoomMsg.booleanValue() ? s9s.f163227a.getString(R$string.f44219x0) : s9s.f163227a.getString(R$string.f44216w0));
        ((s3d0) this.viewModel).m182143p(v4d0Var);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m172790N0(v4d0 v4d0Var, Throwable th) {
        boolean z = th instanceof TantanException.Client.TantanForbidden;
        if (z && ((TantanException.Client.TantanForbidden) th).isLevelNotEnoughToOpen()) {
            lsi0.m151595y(s9s.f163227a.getString(R$string.f44119L));
            ((s3d0) this.viewModel).m182143p(v4d0Var);
            return;
        }
        if (z && ((TantanException.Client.TantanForbidden) th).isLevelNotEnoughToClose()) {
            lsi0.m151595y(s9s.f163227a.getString(R$string.f44117K));
            ((s3d0) this.viewModel).m182143p(v4d0Var);
        } else if (!z || !((TantanException.Client.TantanForbidden) th).isLevelNotEnoughToCloseNew()) {
            lsi0.m151595y(s9s.f163227a.getString(R$string.f44139V));
        } else {
            lsi0.m151595y(s9s.f163227a.getString(R$string.f44108F0));
            ((s3d0) this.viewModel).m182143p(v4d0Var);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m172791O0(String str) {
        if (this.f152422g == null) {
            this.f152422g = new z1d0(this.f152424i);
        }
        ygt ygtVar = new ygt(str);
        if (ygtVar.mo128507c(str)) {
            if (TextUtils.equals(ygtVar.f104769a, "showH5")) {
                m172800Y0(ygtVar);
            } else if (TextUtils.equals(ygtVar.f104769a, "showProfilePage")) {
                m172798W0(ygtVar);
            } else if (TextUtils.equals(ygtVar.f104769a, "showTTCoinDialog")) {
                l9s.m149073e0(this.f152424i, "live", null);
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m172792P0(v4d0 v4d0Var) {
        if (v4d0Var.m196959H()) {
            m172799X0(v4d0Var);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m172793Q0() {
        ((s3d0) this.viewModel).m182139k(this.f152416a);
    }

    /* JADX INFO: renamed from: R0 */
    public void m172794R0(String str, String str2, boolean z) {
        if (this.f152423h) {
            return;
        }
        LiveSquareApi.requestRightBindAnchors(this.f152416a, str, str2, z).subscribe(ffw.m121194e(new e30() { // from class: l.n3d0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((nj3) s9s.m182763m(gld0.f103312b)).f139199w.onNext((x0d0) obj);
            }
        }, new e30() { // from class: l.o3d0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((nj3) s9s.m182763m(gld0.f103312b)).f139199w.onNext(null);
            }
        }));
        this.f152423h = true;
    }

    /* JADX INFO: renamed from: S0 */
    public void m172795S0() {
        m172796U0(((s3d0) this.viewModel).m182137i(true));
    }

    /* JADX INFO: renamed from: U0 */
    public final void m172796U0(@Nullable a3d0 a3d0Var) {
        duringCreated(LiveSquareApi.getUserRightList(this.f152416a, this.f152417b, this.f152418c, this.f152420e, this.f152419d, this.f152425j, a3d0Var)).subscribe(ffw.m121194e(new e30() { // from class: l.h3d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105730a.m172788J0((BLiveRightInfo) obj);
            }
        }, new e30() { // from class: l.i3d0
            @Override // p149l.e30
            public final void call(Object obj) {
                q3d0.m172769i0((Throwable) obj);
            }
        }));
        if (a3d0Var != null) {
            ((s3d0) this.viewModel).m182138j();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m172797V0(a1d0 a1d0Var) {
        if (this.f152421f == null) {
            this.f152421f = new f2d0(this.f152416a, act(), this);
        }
        this.f152421f.m119174k(a1d0Var);
        m172794R0(a1d0Var.f67173e.rightId, "", false);
        ((s3d0) this.viewModel).m182138j();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m172798W0(ygt ygtVar) {
        String strM214763g = ygtVar.m214763g("userId");
        String strM214763g2 = ygtVar.m214763g("from");
        if (TextUtils.isEmpty(strM214763g)) {
            return;
        }
        l9s.m149085k0(this.f152424i, strM214763g, strM214763g2, true);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m172799X0(final v4d0 v4d0Var) {
        UserLiveSettings userLiveSettings = new UserLiveSettings();
        userLiveSettings.closeEnterRoomMsg = Boolean.valueOf(v4d0Var.isChecked());
        duringCreated(l9s.m149051N(userLiveSettings)).subscribe(ffw.m121194e(new e30() { // from class: l.j3d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116024a.m172789L0(v4d0Var, (SettingGroups) obj);
            }
        }, new e30() { // from class: l.k3d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120815a.m172790N0(v4d0Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m172800Y0(ygt ygtVar) {
        String strM214763g = ygtVar.m214763g("H5Url");
        if (TextUtils.isEmpty(strM214763g)) {
            strM214763g = ygtVar.m214763g("h5Url");
        }
        if (TextUtils.isEmpty(strM214763g)) {
            return;
        }
        this.f152422g.m216800k(strM214763g);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m172796U0(null);
        duringCreated(((nj3) s9s.m182763m(gld0.f103312b)).m159642x()).subscribe(ffw.m121193d(new e30() { // from class: l.b3d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73204a.m172787I0((x0d0) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
        z1d0 z1d0Var = this.f152422g;
        if (z1d0Var != null) {
            z1d0Var.m216798i();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m172801t0(a1d0 a1d0Var) {
        BLiveRightItem bLiveRightItem;
        if (a1d0Var == null || (bLiveRightItem = a1d0Var.f67173e) == null || bLiveRightItem.scrapInfo == null || !a1d0Var.m94552L()) {
            return;
        }
        BLiveScrapCraftReq bLiveScrapCraftReqNew_ = BLiveScrapCraftReq.new_();
        bLiveScrapCraftReqNew_.source = "rightTab";
        bLiveScrapCraftReqNew_.scenario = "live";
        bLiveScrapCraftReqNew_.roomId = this.f152418c;
        bLiveScrapCraftReqNew_.liveId = this.f152417b;
        bLiveScrapCraftReqNew_.anchorId = this.f152420e;
        bLiveScrapCraftReqNew_.targetItemId = a1d0Var.f67173e.rightId;
        bLiveScrapCraftReqNew_.originalId = UUID.randomUUID().toString();
        bLiveScrapCraftReqNew_.fakeId = s9s.f163232f.m134375h();
        duringCreated(LiveSquareApi.craftScrapToItem(String.valueOf(a1d0Var.f67173e.scrapInfo.itemId), bLiveScrapCraftReqNew_)).subscribe(ffw.m121194e(new e30() { // from class: l.l3d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125876a.m172780A0((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.m3d0
            @Override // p149l.e30
            public final void call(Object obj) {
                q3d0.m172775o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public void m172802u0(a1d0 a1d0Var) {
        w0d0 w0d0Var = this.f152416a == UserRightType.CALL_EFFECT ? new w0d0(a1d0Var.f67173e.userRightId, a1d0Var.f67175g, "") : new w0d0(a1d0Var.f67173e.userRightId);
        final a3d0 a3d0VarM182137i = ((s3d0) this.viewModel).m182137i(a1d0Var.f67176h);
        if (a1d0Var.f67173e.isEquipped()) {
            duringCreated(LiveSquareApi.unEquipUserRight(this.f152416a, w0d0Var)).subscribe(ffw.m121194e(new e30() { // from class: l.p3d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f146982a.m172782D0(a3d0VarM182137i, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.c3d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f78927a.m172783E0(a3d0VarM182137i, (Throwable) obj);
                }
            }));
        } else if (a1d0Var.f67173e.isActive()) {
            duringCreated(LiveSquareApi.equipUserRight(this.f152416a, w0d0Var)).subscribe(ffw.m121194e(new e30() { // from class: l.d3d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f84206a.m172784F0(a3d0VarM182137i, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.e3d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f89169a.m172785G0(a3d0VarM182137i, (Throwable) obj);
                }
            }));
        } else if (a1d0Var.f67173e.canActive()) {
            duringCreated(LiveSquareApi.activeUserRight(this.f152416a, w0d0Var)).subscribe(ffw.m121194e(new e30() { // from class: l.f3d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f94680a.m172786H0(a3d0VarM182137i, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.g3d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f100452a.m172781C0(a3d0VarM182137i, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m172803x0(a3d0 a3d0Var, Throwable th, int i) {
        lsi0.m151593w(i);
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 42305) {
            m172796U0(a3d0Var);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m172804y0(Frag frag) {
        Bundle arguments = frag.getArguments();
        if (arguments != null) {
            this.f152416a = UserRightType.valueOf(arguments.getString("right_type"));
            this.f152417b = arguments.getString("liveId");
            this.f152418c = arguments.getString("roomId");
            this.f152419d = arguments.getString("anchor_name");
            this.f152420e = arguments.getString("anchor_id");
            String string = arguments.getString("live_type");
            if (BLiveAbsData.VOICE_LIVE.equals(string)) {
                this.f152425j = h1d0.f105425b;
            } else if ("live".equals(string)) {
                this.f152425j = h1d0.f105424a;
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m172805z0() {
        return !TextUtils.isEmpty(this.f152418c);
    }
}
