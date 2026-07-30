package org.fourthline.cling.model.types;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class BooleanDatatype extends AbstractDatatype<Boolean> {
    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public String getString(Boolean bool) throws InvalidValueException {
        if (bool == null) {
            return "";
        }
        return bool.booleanValue() ? "1" : "0";
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public boolean isHandlingJavaType(Class cls) {
        return cls == Boolean.TYPE || Boolean.class.isAssignableFrom(cls);
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public Boolean valueOf(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        if (!str.equals("1")) {
            Locale locale = Locale.ROOT;
            if (!str.toUpperCase(locale).equals("YES") && !str.toUpperCase(locale).equals("TRUE")) {
                if (str.equals("0") || str.toUpperCase(locale).equals("NO") || str.toUpperCase(locale).equals("FALSE")) {
                    return Boolean.FALSE;
                }
                throw new InvalidValueException("Invalid boolean value string: ".concat(str));
            }
        }
        return Boolean.TRUE;
    }
}
