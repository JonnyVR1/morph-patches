package com.cosmos.photon.push.referee;

import androidx.annotation.NonNull;
import com.cosmos.photon.push.Address;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class Referee {
    public static final String APP_ID = "8701b0b5e66f551562c78781b1dc88c3";
    public static final String DEFAULT_IM_HOST = "paas-push-ap.immomo.com";
    public static final int DEFAULT_IM_PORT = 8081;
    private static volatile Referee instance;

    public static Referee getInstance() {
        if (instance == null) {
            synchronized (Referee.class) {
                try {
                    if (instance == null) {
                        if (ThirdPushManager.mEnableFcmPush) {
                            instance = new RefereeOversea();
                        } else {
                            instance = new RefereeInland();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public synchronized void failed(String str, String str2) {
    }

    @NonNull
    public synchronized Address getImAddress() {
        return new Address(DEFAULT_IM_HOST, DEFAULT_IM_PORT);
    }

    public abstract boolean isSupportDns(String str);

    public synchronized void setRedirectAddress(Address address) {
    }

    public synchronized void success(String str, String str2) {
    }

    public synchronized void failed(Address address) {
    }

    public synchronized void success(Address address) {
    }
}
