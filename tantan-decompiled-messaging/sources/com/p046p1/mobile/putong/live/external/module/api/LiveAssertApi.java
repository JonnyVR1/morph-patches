package com.p046p1.mobile.putong.live.external.module.api;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.live.base.data.BLiveAssets;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLivePermissionControl;
import com.p046p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.tantanapp.beatles.utils.DeviceUtil;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.cll;
import p149l.e30;
import p149l.ffw;
import p149l.fur;
import p149l.gkh0;
import p149l.j760;
import p149l.jo0;
import p149l.l9s;
import p149l.mkd0;
import p149l.s9s;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
public class LiveAssertApi {
    private static final String KEY_LIVE_ASSETS = "key_live_assets";
    private static boolean canUseMaskMode = false;
    private static boolean canUserStartLiveNow = false;
    private static fur liveAssetsWrapper;
    private static final C22393b<Boolean> userStartLiveObs = C22393b.m221521b();
    private static final C22392a<j760<String, Boolean>> userStartVoiceLiveObs = C22392a.m221512b();
    private double deviceTotalMemory = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    static {
        l9s.m149072e().getAuthData().m127348c().onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.aur
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveAssertApi.m70423c((AuthData) obj);
            }
        }));
    }

    public LiveAssertApi() {
        refreshLiveAssets();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m70421a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m70423c(AuthData authData) {
        if (!NullChecker.m81303a(authData)) {
            gkh0.m126627j("[live]assert_api", "authData is NULL");
            liveAssetsWrapper = null;
        } else {
            liveAssetsWrapper = new fur(KEY_LIVE_ASSETS + authData.userId);
            checkVoiceLivePermission(authData.userId);
        }
    }

    private static void checkVoiceLivePermission(String str) {
        BLivePermissionControl bLivePermissionControl;
        fur furVar = liveAssetsWrapper;
        if (furVar == null) {
            gkh0.m126627j("[live]assert_api", "liveAssetsWrapper is Null");
            userStartVoiceLiveObs.onNext(new j760<>(str, Boolean.FALSE));
            return;
        }
        BLiveAssets bLiveAssets = furVar.get();
        if (bLiveAssets == null || (bLivePermissionControl = bLiveAssets.livePermissionControl) == null || !bLivePermissionControl.canStartVoiceLive) {
            return;
        }
        userStartVoiceLiveObs.onNext(new j760<>(str, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m70424d(BLiveEnvelope bLiveEnvelope) {
        new fur(KEY_LIVE_ASSETS + l9s.m149093o0()).put(bLiveEnvelope.data.liveAssets);
        liveAssetsWrapper.put(bLiveEnvelope.data.liveAssets);
        BLiveAssets bLiveAssets = bLiveEnvelope.data.liveAssets;
        if (bLiveAssets != null) {
            BLivePermissionControl bLivePermissionControl = bLiveAssets.livePermissionControl;
            boolean z = bLivePermissionControl.canUserStartLive;
            canUserStartLiveNow = z;
            canUseMaskMode = bLivePermissionControl.canUseMaskMode;
            userStartLiveObs.onNext(Boolean.valueOf(z));
            userStartVoiceLiveObs.onNext(new j760<>(l9s.m149093o0(), Boolean.valueOf(bLiveEnvelope.data.liveAssets.livePermissionControl.canStartVoiceLive)));
            if (LiveVerificationApi.noVerificationInfo()) {
                LiveVerificationApi.requestLiveVerification();
            }
            gkh0.m126627j("[live]assert_api", "server:" + bLiveEnvelope.data.liveAssets);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m70425e(j760 j760Var) {
        return (Boolean) j760Var.f116565b;
    }

    public static boolean getCanUseMaskMode() {
        return canUseMaskMode;
    }

    public static C22306c<Boolean> getUserStartLiveObs() {
        return userStartLiveObs.asObservable();
    }

    public static C22306c<Boolean> getUserStartVoiceLiveObs() {
        return userStartVoiceLiveObs.asObservable().filter(new w9j() { // from class: l.bur
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(l9s.m149093o0(), (CharSequence) ((j760) obj).f116564a));
            }
        }).map(new w9j() { // from class: l.cur
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveAssertApi.m70425e((j760) obj);
            }
        });
    }

    public static boolean isCanStartLive() {
        BLivePermissionControl bLivePermissionControl;
        fur furVar = liveAssetsWrapper;
        if (furVar == null) {
            gkh0.m126627j("[live]assert_api", "liveAssetsWrapper is Null");
            return false;
        }
        BLiveAssets bLiveAssets = furVar.get();
        return (bLiveAssets == null || (bLivePermissionControl = bLiveAssets.livePermissionControl) == null || !bLivePermissionControl.canUserStartLive) ? false : true;
    }

    public static boolean isCanUserStartLiveNow() {
        return isCanStartLive() || canUserStartLiveNow;
    }

    public static boolean isUserStartVoiceLiveEnable() {
        Boolean bool;
        j760<String, Boolean> j760VarM221515e = userStartVoiceLiveObs.m221515e();
        if (j760VarM221515e == null || !TextUtils.equals(j760VarM221515e.f116564a, l9s.m149093o0()) || (bool = j760VarM221515e.f116565b) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void updateCanUserStartLive(boolean z) {
        gkh0.m126627j("[live]assert_api", "updateCanUserStartLive:" + z);
        fur furVar = new fur(KEY_LIVE_ASSETS + l9s.m149093o0());
        BLiveAssets bLiveAssetsNew_ = furVar.get();
        if (bLiveAssetsNew_ == null) {
            bLiveAssetsNew_ = BLiveAssets.new_();
        }
        BLiveAssets bLiveAssetsMo223809clone = bLiveAssetsNew_.mo223809clone();
        bLiveAssetsMo223809clone.livePermissionControl.canUserStartLive = z;
        furVar.put(bLiveAssetsMo223809clone);
        canUserStartLiveNow = z;
        userStartLiveObs.onNext(Boolean.valueOf(z));
        if (z) {
            LiveVerificationApi.requestLiveVerification();
        }
    }

    public void clean() {
        gkh0.m126627j("[live]assert_api", "LiveAssertApi clean:");
        canUserStartLiveNow = false;
    }

    public void refreshLiveAssets() {
        if (this.deviceTotalMemory == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            try {
                this.deviceTotalMemory = DeviceUtil.m81220m(s9s.f163227a);
            } catch (Exception unused) {
                this.deviceTotalMemory = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
        }
        LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/live-assets")).m107524p().m107536c("with", "livecontrol").m107536c("device_totalMemory", String.valueOf(this.deviceTotalMemory)).m107537d(), "getLiveAssets").subscribe(ffw.m121194e(new e30() { // from class: l.dur
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveAssertApi.m70424d((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.eur
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveAssertApi.m70421a((Throwable) obj);
            }
        }));
    }
}
