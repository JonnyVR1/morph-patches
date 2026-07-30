package org.fourthline.cling.model.types;

import org.eclipse.jetty.util.StringUtil;
import org.seamless.util.p006io.Base64Coder;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Base64Datatype extends AbstractDatatype<byte[]> {
    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public String getString(byte[] bArr) throws InvalidValueException {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(Base64Coder.encode(bArr), StringUtil.__UTF8);
        } catch (Exception e) {
            throw new InvalidValueException(e.getMessage(), e);
        }
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype
    public Class<byte[]> getValueType() {
        return byte[].class;
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public byte[] valueOf(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        try {
            return Base64Coder.decode(str);
        } catch (Exception e) {
            throw new InvalidValueException(e.getMessage(), e);
        }
    }
}
