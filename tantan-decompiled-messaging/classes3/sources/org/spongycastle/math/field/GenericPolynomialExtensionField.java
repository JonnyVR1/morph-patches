package org.spongycastle.math.field;

import java.math.BigInteger;
import org.spongycastle.util.Integers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class GenericPolynomialExtensionField implements PolynomialExtensionField {
    protected final Polynomial minimalPolynomial;
    protected final FiniteField subfield;

    public GenericPolynomialExtensionField(FiniteField finiteField, Polynomial polynomial) {
        this.subfield = finiteField;
        this.minimalPolynomial = polynomial;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericPolynomialExtensionField)) {
            return false;
        }
        GenericPolynomialExtensionField genericPolynomialExtensionField = (GenericPolynomialExtensionField) obj;
        return this.subfield.equals(genericPolynomialExtensionField.subfield) && this.minimalPolynomial.equals(genericPolynomialExtensionField.minimalPolynomial);
    }

    @Override // org.spongycastle.math.field.FiniteField
    public BigInteger getCharacteristic() {
        return this.subfield.getCharacteristic();
    }

    @Override // org.spongycastle.math.field.ExtensionField
    public int getDegree() {
        return this.minimalPolynomial.getDegree();
    }

    @Override // org.spongycastle.math.field.FiniteField
    public int getDimension() {
        return this.subfield.getDimension() * this.minimalPolynomial.getDegree();
    }

    @Override // org.spongycastle.math.field.PolynomialExtensionField
    public Polynomial getMinimalPolynomial() {
        return this.minimalPolynomial;
    }

    @Override // org.spongycastle.math.field.ExtensionField
    public FiniteField getSubfield() {
        return this.subfield;
    }

    public int hashCode() {
        return Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16) ^ this.subfield.hashCode();
    }
}
