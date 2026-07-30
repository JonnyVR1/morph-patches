package org.fourthline.cling.support.model.dlna;

import p149l.g0c;

/* JADX INFO: loaded from: classes3.dex */
public class DLNAProfileAttribute extends DLNAAttribute<DLNAProfiles> {
    public DLNAProfileAttribute() {
        setValue(DLNAProfiles.NONE);
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public String getString() {
        return getValue().getCode();
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public void setString(String str, String str2) throws InvalidDLNAProtocolAttributeException {
        DLNAProfiles dLNAProfilesValueOf = DLNAProfiles.valueOf(str, str2);
        if (dLNAProfilesValueOf != null) {
            setValue(dLNAProfilesValueOf);
        } else {
            g0c.m123955a("Can't parse DLNA profile from: ", str);
        }
    }

    public DLNAProfileAttribute(DLNAProfiles dLNAProfiles) {
        setValue(dLNAProfiles);
    }
}
