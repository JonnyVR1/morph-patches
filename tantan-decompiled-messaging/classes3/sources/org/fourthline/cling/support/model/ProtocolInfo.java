package org.fourthline.cling.support.model;

import org.fourthline.cling.model.types.InvalidValueException;
import org.seamless.util.MimeType;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ProtocolInfo {
    public static final String WILDCARD = "*";
    protected String additionalInfo;
    protected String contentFormat;
    protected String network;
    protected Protocol protocol;

    public ProtocolInfo(String str) throws InvalidValueException {
        this.protocol = Protocol.ALL;
        this.network = "*";
        this.contentFormat = "*";
        this.additionalInfo = "*";
        str.getClass();
        String strTrim = str.trim();
        String[] strArrSplit = strTrim.split(":");
        if (strArrSplit.length != 4) {
            throw new InvalidValueException("Can't parse ProtocolInfo string: ".concat(strTrim));
        }
        this.protocol = Protocol.value(strArrSplit[0]);
        this.network = strArrSplit[1];
        this.contentFormat = strArrSplit[2];
        this.additionalInfo = strArrSplit[3];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtocolInfo protocolInfo = (ProtocolInfo) obj;
        return this.additionalInfo.equals(protocolInfo.additionalInfo) && this.contentFormat.equals(protocolInfo.contentFormat) && this.network.equals(protocolInfo.network) && this.protocol == protocolInfo.protocol;
    }

    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public String getContentFormat() {
        return this.contentFormat;
    }

    public MimeType getContentFormatMimeType() throws IllegalArgumentException {
        return MimeType.valueOf(this.contentFormat);
    }

    public String getNetwork() {
        return this.network;
    }

    public Protocol getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        return (((((this.protocol.hashCode() * 31) + this.network.hashCode()) * 31) + this.contentFormat.hashCode()) * 31) + this.additionalInfo.hashCode();
    }

    public String toString() {
        return this.protocol.toString() + ":" + this.network + ":" + this.contentFormat + ":" + this.additionalInfo;
    }

    public ProtocolInfo(MimeType mimeType) {
        this.protocol = Protocol.ALL;
        this.network = "*";
        this.contentFormat = "*";
        this.additionalInfo = "*";
        this.protocol = Protocol.HTTP_GET;
        this.contentFormat = mimeType.toString();
    }

    public ProtocolInfo(Protocol protocol, String str, String str2, String str3) {
        Protocol protocol2 = Protocol.ALL;
        this.protocol = protocol;
        this.network = str;
        this.contentFormat = str2;
        this.additionalInfo = str3;
    }
}
