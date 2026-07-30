package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes3.dex */
public class DHKeyParameters extends AsymmetricKeyParameter {
    private DHParameters params;

    public DHKeyParameters(boolean z, DHParameters dHParameters) {
        super(z);
        this.params = dHParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHKeyParameters)) {
            return false;
        }
        DHKeyParameters dHKeyParameters = (DHKeyParameters) obj;
        DHParameters dHParameters = this.params;
        if (dHParameters == null) {
            return dHKeyParameters.getParameters() == null;
        }
        return dHParameters.equals(dHKeyParameters.getParameters());
    }

    public DHParameters getParameters() {
        return this.params;
    }

    public int hashCode() {
        int i = !isPrivate() ? 1 : 0;
        DHParameters dHParameters = this.params;
        return dHParameters != null ? dHParameters.hashCode() ^ i : i;
    }
}
