package org.spongycastle.math.p012ec;

import java.math.BigInteger;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class SimpleBigDecimal {
    private static final long serialVersionUID = 1;
    private final BigInteger bigInt;
    private final int scale;

    public SimpleBigDecimal(BigInteger bigInteger, int i) {
        if (i < 0) {
            ig3.a("scale may not be negative");
            throw null;
        }
        this.bigInt = bigInteger;
        this.scale = i;
    }

    private void checkScale(SimpleBigDecimal simpleBigDecimal) {
        if (this.scale == simpleBigDecimal.scale) {
            return;
        }
        ig3.a("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
    }

    public static SimpleBigDecimal getInstance(BigInteger bigInteger, int i) {
        return new SimpleBigDecimal(bigInteger.shiftLeft(i), i);
    }

    public SimpleBigDecimal add(BigInteger bigInteger) {
        return new SimpleBigDecimal(this.bigInt.add(bigInteger.shiftLeft(this.scale)), this.scale);
    }

    public SimpleBigDecimal adjustScale(int i) {
        if (i >= 0) {
            int i2 = this.scale;
            return i == i2 ? this : new SimpleBigDecimal(this.bigInt.shiftLeft(i - i2), i);
        }
        ig3.a("scale may not be negative");
        return null;
    }

    public int compareTo(BigInteger bigInteger) {
        return this.bigInt.compareTo(bigInteger.shiftLeft(this.scale));
    }

    public SimpleBigDecimal divide(SimpleBigDecimal simpleBigDecimal) {
        checkScale(simpleBigDecimal);
        return new SimpleBigDecimal(this.bigInt.shiftLeft(this.scale).divide(simpleBigDecimal.bigInt), this.scale);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleBigDecimal)) {
            return false;
        }
        SimpleBigDecimal simpleBigDecimal = (SimpleBigDecimal) obj;
        return this.bigInt.equals(simpleBigDecimal.bigInt) && this.scale == simpleBigDecimal.scale;
    }

    public BigInteger floor() {
        return this.bigInt.shiftRight(this.scale);
    }

    public int getScale() {
        return this.scale;
    }

    public int hashCode() {
        return this.scale ^ this.bigInt.hashCode();
    }

    public int intValue() {
        return floor().intValue();
    }

    public long longValue() {
        return floor().longValue();
    }

    public SimpleBigDecimal multiply(SimpleBigDecimal simpleBigDecimal) {
        checkScale(simpleBigDecimal);
        BigInteger bigIntegerMultiply = this.bigInt.multiply(simpleBigDecimal.bigInt);
        int i = this.scale;
        return new SimpleBigDecimal(bigIntegerMultiply, i + i);
    }

    public SimpleBigDecimal negate() {
        return new SimpleBigDecimal(this.bigInt.negate(), this.scale);
    }

    public BigInteger round() {
        return add(new SimpleBigDecimal(ECConstants.ONE, 1).adjustScale(this.scale)).floor();
    }

    public SimpleBigDecimal shiftLeft(int i) {
        return new SimpleBigDecimal(this.bigInt.shiftLeft(i), this.scale);
    }

    public SimpleBigDecimal subtract(BigInteger bigInteger) {
        return new SimpleBigDecimal(this.bigInt.subtract(bigInteger.shiftLeft(this.scale)), this.scale);
    }

    public String toString() {
        if (this.scale == 0) {
            return this.bigInt.toString();
        }
        BigInteger bigIntegerFloor = floor();
        BigInteger bigIntegerSubtract = this.bigInt.subtract(bigIntegerFloor.shiftLeft(this.scale));
        if (this.bigInt.signum() == -1) {
            bigIntegerSubtract = ECConstants.ONE.shiftLeft(this.scale).subtract(bigIntegerSubtract);
        }
        if (bigIntegerFloor.signum() == -1 && !bigIntegerSubtract.equals(ECConstants.ZERO)) {
            bigIntegerFloor = bigIntegerFloor.add(ECConstants.ONE);
        }
        String string = bigIntegerFloor.toString();
        char[] cArr = new char[this.scale];
        String string2 = bigIntegerSubtract.toString(2);
        int length = string2.length();
        int i = this.scale - length;
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = '0';
        }
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i + i3] = string2.charAt(i3);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public int compareTo(SimpleBigDecimal simpleBigDecimal) {
        checkScale(simpleBigDecimal);
        return this.bigInt.compareTo(simpleBigDecimal.bigInt);
    }

    public SimpleBigDecimal add(SimpleBigDecimal simpleBigDecimal) {
        checkScale(simpleBigDecimal);
        return new SimpleBigDecimal(this.bigInt.add(simpleBigDecimal.bigInt), this.scale);
    }

    public SimpleBigDecimal multiply(BigInteger bigInteger) {
        return new SimpleBigDecimal(this.bigInt.multiply(bigInteger), this.scale);
    }

    public SimpleBigDecimal subtract(SimpleBigDecimal simpleBigDecimal) {
        return add(simpleBigDecimal.negate());
    }

    public SimpleBigDecimal divide(BigInteger bigInteger) {
        return new SimpleBigDecimal(this.bigInt.divide(bigInteger), this.scale);
    }
}
