package com.cosmos.photon.push;

import com.cosmos.photon.push.util.NetUtil;

/* JADX INFO: loaded from: classes.dex */
public class LastRegistKeeper implements NetUtil.NetChangeReceiver {
    private RegistSelfToken lastSelfToken;
    private RegistVendorToken lastVendorToken;
    private final Object mutex;

    public static class LastRegistKeeperHolder {
        static LastRegistKeeper lastRegistKeeper = new LastRegistKeeper();

        private LastRegistKeeperHolder() {
        }
    }

    public static class RegistSelfToken {
        String alias;
        String appId;
        String deviceId;

        /* JADX INFO: renamed from: sn */
        String f5836sn;
        boolean tryReferee;

        public void requestRegistSelfToken() {
            PushApi.register(this.deviceId, this.appId, this.alias, this.f5836sn, this.tryReferee);
        }
    }

    public static class RegistVendorToken {
        String appId;
        String token;
        String vendorToken;
        String vendorType;

        public void requestVendorToken() {
            PushApi.regVendor(this.token, this.appId, this.vendorType, this.vendorToken);
        }
    }

    private LastRegistKeeper() {
        this.mutex = new Object();
    }

    public static LastRegistKeeper getInstance() {
        return LastRegistKeeperHolder.lastRegistKeeper;
    }

    public void clearRegistSelfRequest() {
        synchronized (this.mutex) {
            this.lastSelfToken = null;
        }
    }

    public void clearRegistTokenRequest() {
        synchronized (this.mutex) {
            this.lastVendorToken = null;
        }
    }

    public void init() {
        NetUtil.registerNetChangeReceiver(this);
    }

    public void keepRegistSelfToken(String str, String str2, String str3, String str4, boolean z) {
        synchronized (this.mutex) {
            try {
                if (this.lastSelfToken == null) {
                    this.lastSelfToken = new RegistSelfToken();
                }
                RegistSelfToken registSelfToken = this.lastSelfToken;
                registSelfToken.deviceId = str;
                registSelfToken.appId = str2;
                registSelfToken.alias = str3;
                registSelfToken.f5836sn = str4;
                registSelfToken.tryReferee = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void keepRegistVendorToken(String str, String str2, String str3, String str4) {
        synchronized (this.mutex) {
            try {
                if (this.lastVendorToken == null) {
                    this.lastVendorToken = new RegistVendorToken();
                }
                RegistVendorToken registVendorToken = this.lastVendorToken;
                registVendorToken.token = str;
                registVendorToken.appId = str2;
                registVendorToken.vendorType = str3;
                registVendorToken.vendorToken = str4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cosmos.photon.push.util.NetUtil.NetChangeReceiver
    public void onNetworkChanged() {
        if (NetUtil.isNetworkAvailable()) {
            synchronized (this.mutex) {
                try {
                    RegistSelfToken registSelfToken = this.lastSelfToken;
                    if (registSelfToken != null) {
                        registSelfToken.requestRegistSelfToken();
                    }
                    RegistVendorToken registVendorToken = this.lastVendorToken;
                    if (registVendorToken != null) {
                        registVendorToken.requestVendorToken();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
