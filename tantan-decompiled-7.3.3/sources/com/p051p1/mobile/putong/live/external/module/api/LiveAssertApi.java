package com.p051p1.mobile.putong.live.external.module.api;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.live.base.data.BLiveAssets;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLivePermissionControl;
import com.p051p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.tantanapp.beatles.utils.DeviceUtil;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.dhw;
import p153l.fo0;
import p153l.gwr;
import p153l.mbs;
import p153l.nsh0;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rnl;
import p153l.tbs;
import p153l.y20;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class LiveAssertApi {
    private static final String KEY_LIVE_ASSETS = "key_live_assets";
    private static boolean canUseMaskMode = false;
    private static boolean canUserStartLiveNow = false;
    private static gwr liveAssetsWrapper;
    private static final C22508b<Boolean> userStartLiveObs = C22508b.m222767b();
    private static final C22507a<pf60<String, Boolean>> userStartVoiceLiveObs = C22507a.m222758b();
    private double deviceTotalMemory = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    static {
        mbs.m157849e().getAuthData().m142510c().onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.bwr
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveAssertApi.m71606c((AuthData) obj);
            }
        }));
    }

    public LiveAssertApi() {
        refreshLiveAssets();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m71604a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m71606c(AuthData authData) {
        if (!NullChecker.m82486a(authData)) {
            nsh0.m164608j("[live]assert_api", "authData is NULL");
            liveAssetsWrapper = null;
        } else {
            liveAssetsWrapper = new gwr(KEY_LIVE_ASSETS + authData.userId);
            checkVoiceLivePermission(authData.userId);
        }
    }

    private static void checkVoiceLivePermission(String str) {
        BLivePermissionControl bLivePermissionControl;
        gwr gwrVar = liveAssetsWrapper;
        if (gwrVar == null) {
            nsh0.m164608j("[live]assert_api", "liveAssetsWrapper is Null");
            userStartVoiceLiveObs.onNext(new pf60<>(str, Boolean.FALSE));
            return;
        }
        BLiveAssets bLiveAssets = gwrVar.get();
        if (bLiveAssets == null || (bLivePermissionControl = bLiveAssets.livePermissionControl) == null || !bLivePermissionControl.canStartVoiceLive) {
            return;
        }
        userStartVoiceLiveObs.onNext(new pf60<>(str, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m71607d(BLiveEnvelope bLiveEnvelope) {
        new gwr(KEY_LIVE_ASSETS + mbs.m157870o0()).put(bLiveEnvelope.data.liveAssets);
        liveAssetsWrapper.put(bLiveEnvelope.data.liveAssets);
        BLiveAssets bLiveAssets = bLiveEnvelope.data.liveAssets;
        if (bLiveAssets != null) {
            BLivePermissionControl bLivePermissionControl = bLiveAssets.livePermissionControl;
            boolean z = bLivePermissionControl.canUserStartLive;
            canUserStartLiveNow = z;
            canUseMaskMode = bLivePermissionControl.canUseMaskMode;
            userStartLiveObs.onNext(Boolean.valueOf(z));
            userStartVoiceLiveObs.onNext(new pf60<>(mbs.m157870o0(), Boolean.valueOf(bLiveEnvelope.data.liveAssets.livePermissionControl.canStartVoiceLive)));
            if (LiveVerificationApi.noVerificationInfo()) {
                LiveVerificationApi.requestLiveVerification();
            }
            nsh0.m164608j("[live]assert_api", "server:" + bLiveEnvelope.data.liveAssets);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m71608e(pf60 pf60Var) {
        return (Boolean) pf60Var.f152157b;
    }

    public static boolean getCanUseMaskMode() {
        return canUseMaskMode;
    }

    public static C22421c<Boolean> getUserStartLiveObs() {
        return userStartLiveObs.asObservable();
    }

    public static C22421c<Boolean> getUserStartVoiceLiveObs() {
        return userStartVoiceLiveObs.asObservable().filter(new qcj() { // from class: l.cwr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(mbs.m157870o0(), (CharSequence) ((pf60) obj).f152156a));
            }
        }).map(new qcj() { // from class: l.dwr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveAssertApi.m71608e((pf60) obj);
            }
        });
    }

    public static boolean isCanStartLive() {
        BLivePermissionControl bLivePermissionControl;
        gwr gwrVar = liveAssetsWrapper;
        if (gwrVar == null) {
            nsh0.m164608j("[live]assert_api", "liveAssetsWrapper is Null");
            return false;
        }
        BLiveAssets bLiveAssets = gwrVar.get();
        return (bLiveAssets == null || (bLivePermissionControl = bLiveAssets.livePermissionControl) == null || !bLivePermissionControl.canUserStartLive) ? false : true;
    }

    public static boolean isCanUserStartLiveNow() {
        return isCanStartLive() || canUserStartLiveNow;
    }

    public static boolean isUserStartVoiceLiveEnable() {
        Boolean bool;
        pf60<String, Boolean> pf60VarM222761e = userStartVoiceLiveObs.m222761e();
        if (pf60VarM222761e == null || !TextUtils.equals(pf60VarM222761e.f152156a, mbs.m157870o0()) || (bool = pf60VarM222761e.f152157b) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void updateCanUserStartLive(boolean z) {
        nsh0.m164608j("[live]assert_api", "updateCanUserStartLive:" + z);
        gwr gwrVar = new gwr(KEY_LIVE_ASSETS + mbs.m157870o0());
        BLiveAssets bLiveAssetsNew_ = gwrVar.get();
        if (bLiveAssetsNew_ == null) {
            bLiveAssetsNew_ = BLiveAssets.new_();
        }
        BLiveAssets bLiveAssetsMo225055clone = bLiveAssetsNew_.mo225055clone();
        bLiveAssetsMo225055clone.livePermissionControl.canUserStartLive = z;
        gwrVar.put(bLiveAssetsMo225055clone);
        canUserStartLiveNow = z;
        userStartLiveObs.onNext(Boolean.valueOf(z));
        if (z) {
            LiveVerificationApi.requestLiveVerification();
        }
    }

    public void clean() {
        nsh0.m164608j("[live]assert_api", "LiveAssertApi clean:");
        canUserStartLiveNow = false;
    }

    public void refreshLiveAssets() {
        if (this.deviceTotalMemory == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            try {
                this.deviceTotalMemory = DeviceUtil.m82403m(tbs.f172988a);
            } catch (Exception unused) {
                this.deviceTotalMemory = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
        }
        LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/live-assets")).m182288p().m182300c("with", "livecontrol").m182300c("device_totalMemory", String.valueOf(this.deviceTotalMemory)).m182301d(), "getLiveAssets").subscribe(dhw.m115826e(new y20() { // from class: l.ewr
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveAssertApi.m71607d((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.fwr
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveAssertApi.m71604a((Throwable) obj);
            }
        }));
    }
}
