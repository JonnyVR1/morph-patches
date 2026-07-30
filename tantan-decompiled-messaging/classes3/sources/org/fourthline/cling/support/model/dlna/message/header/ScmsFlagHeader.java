package org.fourthline.cling.support.model.dlna.message.header;

import java.util.regex.Pattern;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.support.model.dlna.types.ScmsFlagType;
import p003l.kow;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ScmsFlagHeader extends DLNAHeader<ScmsFlagType> {
    static final Pattern pattern = Pattern.compile("^[01]{2}$", 2);

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        ScmsFlagType value = getValue();
        return (value.isCopyright() ? "0" : "1").concat(value.isOriginal() ? "0" : "1");
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (pattern.matcher(str).matches()) {
            setValue(new ScmsFlagType(str.charAt(0) == '0', str.charAt(1) == '0'));
        } else {
            kow.m5724a("Invalid ScmsFlag header value: ", str);
        }
    }
}
