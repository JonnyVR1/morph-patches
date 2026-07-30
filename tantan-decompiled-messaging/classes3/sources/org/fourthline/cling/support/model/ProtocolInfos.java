package org.fourthline.cling.support.model;

import java.util.ArrayList;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ProtocolInfos extends ArrayList<ProtocolInfo> {
    public ProtocolInfos(String str) throws InvalidValueException {
        String[] strArrFromCommaSeparatedList = ModelUtil.fromCommaSeparatedList(str);
        if (strArrFromCommaSeparatedList != null) {
            for (String str2 : strArrFromCommaSeparatedList) {
                add(new ProtocolInfo(str2));
            }
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return ModelUtil.toCommaSeparatedList(toArray(new ProtocolInfo[size()]));
    }

    public ProtocolInfos(ProtocolInfo... protocolInfoArr) {
        for (ProtocolInfo protocolInfo : protocolInfoArr) {
            add(protocolInfo);
        }
    }
}
