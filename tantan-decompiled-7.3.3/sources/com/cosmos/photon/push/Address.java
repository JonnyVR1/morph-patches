package com.cosmos.photon.push;

import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;

/* JADX INFO: loaded from: classes.dex */
public class Address {
    public String host;
    public int port;

    public Address(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 2) {
            this.host = strArrSplit[0];
            try {
                this.port = Integer.parseInt(strArrSplit[1]);
            } catch (Exception e) {
                MDLog.printErrStackTrace(LogTag.f5845IM, e);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return TextUtils.equals(this.host, address.host) && this.port == address.port;
    }

    public String toString() {
        return String.format("%s:%d", this.host, Integer.valueOf(this.port));
    }

    public Address(String str, int i) {
        this.host = str;
        this.port = i;
    }

    public Address() {
    }
}
