package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.ServerClientTokens;
import p003l.xie;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ServerHeader extends UpnpHeader<ServerClientTokens> {
    public ServerHeader() {
        setValue(new ServerClientTokens());
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getHttpToken();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        String[] strArrSplit;
        String[] strArrSplit2;
        ServerClientTokens serverClientTokens = new ServerClientTokens();
        serverClientTokens.setOsName("UNKNOWN");
        serverClientTokens.setOsVersion("UNKNOWN");
        serverClientTokens.setProductName("UNKNOWN");
        serverClientTokens.setProductVersion("UNKNOWN");
        if (str.contains("UPnP/1.1")) {
            serverClientTokens.setMinorVersion(1);
        } else if (!str.contains("UPnP/1.")) {
            xie.m8707a("Missing 'UPnP/1.' in server information: ".concat(str));
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            try {
                if (str.charAt(i2) == ' ') {
                    i++;
                }
            } catch (Exception unused) {
                serverClientTokens.setOsName("UNKNOWN");
                serverClientTokens.setOsVersion("UNKNOWN");
                serverClientTokens.setProductName("UNKNOWN");
                serverClientTokens.setProductVersion("UNKNOWN");
            }
        }
        if (str.contains(",")) {
            String[] strArrSplit3 = str.split(",");
            strArrSplit = strArrSplit3[0].split("/");
            strArrSplit2 = strArrSplit3[2].split("/");
        } else if (i > 2) {
            String strTrim = str.substring(0, str.indexOf("UPnP/1.")).trim();
            String strTrim2 = str.substring(str.indexOf("UPnP/1.") + 8).trim();
            strArrSplit = strTrim.split("/");
            strArrSplit2 = strTrim2.split("/");
        } else {
            String[] strArrSplit4 = str.split(" ");
            strArrSplit = strArrSplit4[0].split("/");
            strArrSplit2 = strArrSplit4[2].split("/");
        }
        serverClientTokens.setOsName(strArrSplit[0].trim());
        if (strArrSplit.length > 1) {
            serverClientTokens.setOsVersion(strArrSplit[1].trim());
        }
        serverClientTokens.setProductName(strArrSplit2[0].trim());
        if (strArrSplit2.length > 1) {
            serverClientTokens.setProductVersion(strArrSplit2[1].trim());
        }
        setValue(serverClientTokens);
    }

    public ServerHeader(ServerClientTokens serverClientTokens) {
        setValue(serverClientTokens);
    }
}
