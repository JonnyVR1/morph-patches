package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ElGamalKeyParameters extends AsymmetricKeyParameter {
    private ElGamalParameters params;

    public ElGamalKeyParameters(boolean z, ElGamalParameters elGamalParameters) {
        super(z);
        this.params = elGamalParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalKeyParameters)) {
            return false;
        }
        ElGamalKeyParameters elGamalKeyParameters = (ElGamalKeyParameters) obj;
        ElGamalParameters elGamalParameters = this.params;
        if (elGamalParameters == null) {
            return elGamalKeyParameters.getParameters() == null;
        }
        return elGamalParameters.equals(elGamalKeyParameters.getParameters());
    }

    public ElGamalParameters getParameters() {
        return this.params;
    }

    public int hashCode() {
        ElGamalParameters elGamalParameters = this.params;
        if (elGamalParameters != null) {
            return elGamalParameters.hashCode();
        }
        return 0;
    }
}
