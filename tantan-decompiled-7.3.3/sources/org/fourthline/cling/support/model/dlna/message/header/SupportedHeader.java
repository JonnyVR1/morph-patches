package org.fourthline.cling.support.model.dlna.message.header;

import com.clevertap.android.sdk.Constants;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import p153l.bke;

/* JADX INFO: loaded from: classes3.dex */
public class SupportedHeader extends DLNAHeader<String[]> {
    public SupportedHeader() {
        setValue(new String[0]);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        String[] value = getValue();
        String str = value.length > 0 ? value[0] : "";
        for (int i = 1; i < value.length; i++) {
            str = str + Constants.SEPARATOR_COMMA + value[i];
        }
        return str;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.length() == 0) {
            bke.m104797a("Invalid Supported header value: ".concat(str));
            return;
        }
        if (str.endsWith(com.meituan.robust.Constants.PACKNAME_END)) {
            str = str.substring(0, str.length() - 1);
        }
        setValue(str.split("\\s*,\\s*"));
    }
}
