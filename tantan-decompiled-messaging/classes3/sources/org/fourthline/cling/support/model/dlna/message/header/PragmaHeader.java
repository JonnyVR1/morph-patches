package org.fourthline.cling.support.model.dlna.message.header;

import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.types.PragmaType;
import p003l.xie;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
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
            sb.append(string.length() == 0 ? "" : ",");
            sb.append(pragmaType.getString());
            string = sb.toString();
        }
        return string;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.length() == 0) {
            xie.m8707a("Invalid Pragma header value: ".concat(str));
            return;
        }
        if (str.endsWith(";")) {
            str = str.substring(0, str.length() - 1);
        }
        String[] strArrSplit = str.split("\\s*;\\s*");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            arrayList.add(PragmaType.valueOf(str2));
        }
    }
}
