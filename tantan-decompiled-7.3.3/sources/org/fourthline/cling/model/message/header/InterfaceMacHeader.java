package org.fourthline.cling.model.message.header;

import org.seamless.util.p129io.HexBin;
import p153l.jrw;

/* JADX INFO: loaded from: classes3.dex */
public class InterfaceMacHeader extends UpnpHeader<byte[]> {
    public InterfaceMacHeader(byte[] bArr) {
        setValue(bArr);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return HexBin.bytesToString(getValue(), ":");
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        byte[] bArrStringToBytes = HexBin.stringToBytes(str, ":");
        setValue(bArrStringToBytes);
        if (bArrStringToBytes.length == 6) {
            return;
        }
        jrw.m146822a("Invalid MAC address: ", str);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String toString() {
        return "(" + getClass().getSimpleName() + ") '" + getString() + "'";
    }

    public InterfaceMacHeader() {
    }

    public InterfaceMacHeader(String str) {
        setString(str);
    }
}
