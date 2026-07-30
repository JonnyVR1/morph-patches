package org.fourthline.cling.support.model.dlna.message.header;

import com.meituan.robust.Constants;
import java.util.EnumMap;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.support.model.dlna.DLNAAttribute;

/* JADX INFO: loaded from: classes3.dex */
public class ContentFeaturesHeader extends DLNAHeader<EnumMap<DLNAAttribute.Type, DLNAAttribute>> {
    public ContentFeaturesHeader() {
        setValue(new EnumMap(DLNAAttribute.Type.class));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        String string = "";
        for (DLNAAttribute.Type type : DLNAAttribute.Type.values()) {
            String string2 = getValue().containsKey(type) ? getValue().get(type).getString() : null;
            if (string2 != null && string2.length() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(string.length() == 0 ? "" : Constants.PACKNAME_END);
                sb.append(type.getAttributeName());
                sb.append("=");
                sb.append(string2);
                string = sb.toString();
            }
        }
        return string;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        DLNAAttribute.Type typeValueOfAttributeName;
        if (str.length() != 0) {
            for (String str2 : str.split(Constants.PACKNAME_END)) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2 && (typeValueOfAttributeName = DLNAAttribute.Type.valueOfAttributeName(strArrSplit[0])) != null) {
                    getValue().put(typeValueOfAttributeName, DLNAAttribute.newInstance(typeValueOfAttributeName, strArrSplit[1], ""));
                }
            }
        }
    }
}
