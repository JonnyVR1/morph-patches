package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CramerShoupKeyParameters extends AsymmetricKeyParameter {
    private CramerShoupParameters params;

    public CramerShoupKeyParameters(boolean z, CramerShoupParameters cramerShoupParameters) {
        super(z);
        this.params = cramerShoupParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupKeyParameters)) {
            return false;
        }
        CramerShoupKeyParameters cramerShoupKeyParameters = (CramerShoupKeyParameters) obj;
        CramerShoupParameters cramerShoupParameters = this.params;
        if (cramerShoupParameters == null) {
            return cramerShoupKeyParameters.getParameters() == null;
        }
        return cramerShoupParameters.equals(cramerShoupKeyParameters.getParameters());
    }

    public CramerShoupParameters getParameters() {
        return this.params;
    }

    public int hashCode() {
        int i = !isPrivate() ? 1 : 0;
        CramerShoupParameters cramerShoupParameters = this.params;
        return cramerShoupParameters != null ? cramerShoupParameters.hashCode() ^ i : i;
    }
}
