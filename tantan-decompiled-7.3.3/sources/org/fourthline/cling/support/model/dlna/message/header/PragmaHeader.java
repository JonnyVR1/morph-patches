package org.fourthline.cling.support.model.dlna.message.header;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.types.PragmaType;
import p153l.bke;

/* JADX INFO: loaded from: classes3.dex */
public class PragmaHeader extends DLNAHeader<List<PragmaType>> {
    public PragmaHeader() {
        setValue(new ArrayList());
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        String string = "";
        for (PragmaType pragmaType : getValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(string.length() == 0 ? "" : Constants.SEPARATOR_COMMA);
            sb.append(pragmaType.getString());
            string = sb.toString();
        }
        return string;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.length() == 0) {
            bke.m104797a("Invalid Pragma header value: ".concat(str));
            return;
        }
        if (str.endsWith(com.meituan.robust.Constants.PACKNAME_END)) {
            str = str.substring(0, str.length() - 1);
        }
        String[] strArrSplit = str.split("\\s*;\\s*");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            arrayList.add(PragmaType.valueOf(str2));
        }
    }
}
