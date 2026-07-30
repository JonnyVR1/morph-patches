package org.fourthline.cling.model.types;

import com.google.android.gms.common.api.Api;
import p153l.pvb;

/* JADX INFO: loaded from: classes3.dex */
public class IntegerDatatype extends AbstractDatatype<Integer> {
    private int byteSize;

    public IntegerDatatype(int i) {
        this.byteSize = i;
    }

    public int getByteSize() {
        return this.byteSize;
    }

    public int getMaxValue() {
        int byteSize = getByteSize();
        if (byteSize == 1) {
            return 127;
        }
        if (byteSize == 2) {
            return 32767;
        }
        if (byteSize == 4) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        pvb.m173939a("Invalid integer byte size: ", getByteSize());
        return 0;
    }

    public int getMinValue() {
        int byteSize = getByteSize();
        if (byteSize == 1) {
            return -128;
        }
        if (byteSize == 2) {
            return -32768;
        }
        if (byteSize == 4) {
            return Integer.MIN_VALUE;
        }
        pvb.m173939a("Invalid integer byte size: ", getByteSize());
        return 0;
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public boolean isHandlingJavaType(Class cls) {
        return cls == Integer.TYPE || Integer.class.isAssignableFrom(cls);
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public boolean isValid(Integer num) {
        if (num != null) {
            return num.intValue() >= getMinValue() && num.intValue() <= getMaxValue();
        }
        return true;
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public Integer valueOf(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        try {
            Integer numValueOf = Integer.valueOf(Integer.parseInt(str.trim()));
            if (isValid(numValueOf)) {
                return numValueOf;
            }
            throw new InvalidValueException("Not a " + getByteSize() + " byte(s) integer: " + str);
        } catch (NumberFormatException e) {
            if (str.equals("NOT_IMPLEMENTED")) {
                return Integer.valueOf(getMaxValue());
            }
            throw new InvalidValueException("Can't convert string to number: ".concat(str), e);
        }
    }
}
