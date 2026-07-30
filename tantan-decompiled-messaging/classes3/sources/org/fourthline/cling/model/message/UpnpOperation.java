package org.fourthline.cling.model.message;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class UpnpOperation {
    private int httpMinorVersion = 1;

    public int getHttpMinorVersion() {
        return this.httpMinorVersion;
    }

    public void setHttpMinorVersion(int i) {
        this.httpMinorVersion = i;
    }
}
