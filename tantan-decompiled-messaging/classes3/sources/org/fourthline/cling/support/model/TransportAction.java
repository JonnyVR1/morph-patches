package org.fourthline.cling.support.model;

import java.util.ArrayList;
import org.fourthline.cling.model.ModelUtil;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public enum TransportAction {
    Play,
    Stop,
    Pause,
    Seek,
    Next,
    Previous,
    Record;

    public static TransportAction[] valueOfCommaSeparatedList(String str) {
        String[] strArrFromCommaSeparatedList = ModelUtil.fromCommaSeparatedList(str);
        if (strArrFromCommaSeparatedList == null) {
            return new TransportAction[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrFromCommaSeparatedList) {
            for (TransportAction transportAction : values()) {
                if (transportAction.name().equals(str2)) {
                    arrayList.add(transportAction);
                }
            }
        }
        return (TransportAction[]) arrayList.toArray(new TransportAction[arrayList.size()]);
    }
}
