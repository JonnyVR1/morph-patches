package org.fourthline.cling.support.model.dlna.types;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ScmsFlagType {
    private boolean copyright;
    private boolean original;

    public ScmsFlagType() {
        this.copyright = true;
        this.original = true;
    }

    public boolean isCopyright() {
        return this.copyright;
    }

    public boolean isOriginal() {
        return this.original;
    }

    public ScmsFlagType(boolean z, boolean z2) {
        this.copyright = z;
        this.original = z2;
    }
}
