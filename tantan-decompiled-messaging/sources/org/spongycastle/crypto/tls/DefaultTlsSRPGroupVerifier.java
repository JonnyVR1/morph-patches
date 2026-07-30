package org.spongycastle.crypto.tls;

import java.math.BigInteger;
import java.util.Vector;
import org.spongycastle.crypto.agreement.srp.SRP6StandardGroups;
import org.spongycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTlsSRPGroupVerifier implements TlsSRPGroupVerifier {
    protected static final Vector DEFAULT_GROUPS;
    protected Vector groups;

    static {
        Vector vector = new Vector();
        DEFAULT_GROUPS = vector;
        vector.addElement(SRP6StandardGroups.rfc5054_1024);
        vector.addElement(SRP6StandardGroups.rfc5054_1536);
        vector.addElement(SRP6StandardGroups.rfc5054_2048);
        vector.addElement(SRP6StandardGroups.rfc5054_3072);
        vector.addElement(SRP6StandardGroups.rfc5054_4096);
        vector.addElement(SRP6StandardGroups.rfc5054_6144);
        vector.addElement(SRP6StandardGroups.rfc5054_8192);
    }

    public DefaultTlsSRPGroupVerifier() {
        this(DEFAULT_GROUPS);
    }

    @Override // org.spongycastle.crypto.tls.TlsSRPGroupVerifier
    public boolean accept(SRP6GroupParameters sRP6GroupParameters) {
        for (int i = 0; i < this.groups.size(); i++) {
            if (areGroupsEqual(sRP6GroupParameters, (SRP6GroupParameters) this.groups.elementAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean areGroupsEqual(SRP6GroupParameters sRP6GroupParameters, SRP6GroupParameters sRP6GroupParameters2) {
        if (sRP6GroupParameters != sRP6GroupParameters2) {
            return areParametersEqual(sRP6GroupParameters.getN(), sRP6GroupParameters2.getN()) && areParametersEqual(sRP6GroupParameters.getG(), sRP6GroupParameters2.getG());
        }
        return true;
    }

    public boolean areParametersEqual(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger == bigInteger2 || bigInteger.equals(bigInteger2);
    }

    public DefaultTlsSRPGroupVerifier(Vector vector) {
        this.groups = vector;
    }
}
