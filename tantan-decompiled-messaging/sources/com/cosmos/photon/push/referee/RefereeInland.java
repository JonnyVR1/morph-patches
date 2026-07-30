package com.cosmos.photon.push.referee;

import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.Address;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.util.NetUtil;
import java.util.Random;
import p149l.j0c;

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
            j0c.m139158b(Referee.APP_ID).mo105306f(Referee.DEFAULT_IM_HOST, address.host);
        } else {
            MDLog.m7390d(LogTag.REFEREE, "im address failed : %s network unavailable", address.toString());
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
        String strMo105307g = j0c.m139158b(Referee.APP_ID).mo105307g(Referee.DEFAULT_IM_HOST);
        int[] iArr = ALL_PORTS;
        return new Address(strMo105307g, iArr[new Random().nextInt(iArr.length)]);
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
        j0c.m139158b(Referee.APP_ID).mo105304d(Referee.DEFAULT_IM_HOST, address.host);
    }

    @Override // com.cosmos.photon.push.referee.Referee
    public synchronized void success(String str, String str2) {
        j0c.m139158b(Referee.APP_ID).mo105304d(str, str2);
    }

    @Override // com.cosmos.photon.push.referee.Referee
    public synchronized void failed(String str, String str2) {
        if (NetUtil.isNetworkAvailable()) {
            j0c.m139158b(Referee.APP_ID).mo105306f(str, str2);
        }
    }
}
