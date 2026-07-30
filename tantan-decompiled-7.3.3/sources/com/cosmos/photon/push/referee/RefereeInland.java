package com.cosmos.photon.push.referee;

import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.Address;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.util.NetUtil;
import java.util.Random;
import p153l.w1c;

/* JADX INFO: loaded from: classes.dex */
public class RefereeInland extends Referee {
    private static final int[] ALL_PORTS = {Referee.DEFAULT_IM_PORT, 8082, 8083, 8084, 8085, 8086};
    private Address directAddress;

    @Override // com.cosmos.photon.push.referee.Referee
    public synchronized void failed(Address address) {
        if (address == null) {
            return;
        }
        if (NetUtil.isNetworkAvailable()) {
            w1c.m204391b(Referee.APP_ID).mo155719f(Referee.DEFAULT_IM_HOST, address.host);
        } else {
            MDLog.m7444d(LogTag.REFEREE, "im address failed : %s network unavailable", address.toString());
        }
    }

    @Override // com.cosmos.photon.push.referee.Referee
    @NonNull
    public synchronized Address getImAddress() {
        Address address = this.directAddress;
        if (address != null) {
            this.directAddress = null;
            return address;
        }
        String strMo155720g = w1c.m204391b(Referee.APP_ID).mo155720g(Referee.DEFAULT_IM_HOST);
        int[] iArr = ALL_PORTS;
        return new Address(strMo155720g, iArr[new Random().nextInt(iArr.length)]);
    }

    @Override // com.cosmos.photon.push.referee.Referee
    public boolean isSupportDns(String str) {
        return true;
    }

    @Override // com.cosmos.photon.push.referee.Referee
    public synchronized void setRedirectAddress(Address address) {
        if (address == null) {
            return;
        }
        this.directAddress = address;
    }

    @Override // com.cosmos.photon.push.referee.Referee
    public synchronized void success(Address address) {
        if (address == null) {
            return;
        }
        w1c.m204391b(Referee.APP_ID).mo155717d(Referee.DEFAULT_IM_HOST, address.host);
    }

    @Override // com.cosmos.photon.push.referee.Referee
    public synchronized void success(String str, String str2) {
        w1c.m204391b(Referee.APP_ID).mo155717d(str, str2);
    }

    @Override // com.cosmos.photon.push.referee.Referee
    public synchronized void failed(String str, String str2) {
        if (NetUtil.isNetworkAvailable()) {
            w1c.m204391b(Referee.APP_ID).mo155719f(str, str2);
        }
    }
}
