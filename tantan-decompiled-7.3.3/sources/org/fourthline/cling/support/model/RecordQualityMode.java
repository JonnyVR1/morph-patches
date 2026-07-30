package org.fourthline.cling.support.model;

import java.util.ArrayList;
import org.fourthline.cling.model.ModelUtil;
import p153l.ypg0;

/* JADX INFO: loaded from: classes3.dex */
public enum RecordQualityMode {
    EP("0:EP"),
    LP("1:LP"),
    SP("2:SP"),
    BASIC("0:BASIC"),
    MEDIUM("1:MEDIUM"),
    HIGH("2:HIGH"),
    NOT_IMPLEMENTED("NOT_IMPLEMENTED");

    private String protocolString;

    RecordQualityMode(String str) {
        this.protocolString = str;
    }

    public static RecordQualityMode[] valueOfCommaSeparatedList(String str) {
        String[] strArrFromCommaSeparatedList = ModelUtil.fromCommaSeparatedList(str);
        if (strArrFromCommaSeparatedList == null) {
            return new RecordQualityMode[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrFromCommaSeparatedList) {
            for (RecordQualityMode recordQualityMode : values()) {
                if (recordQualityMode.protocolString.equals(str2)) {
                    arrayList.add(recordQualityMode);
                }
            }
        }
        return (RecordQualityMode[]) arrayList.toArray(new RecordQualityMode[arrayList.size()]);
    }

    public static RecordQualityMode valueOrExceptionOf(String str) throws IllegalArgumentException {
        for (RecordQualityMode recordQualityMode : values()) {
            if (recordQualityMode.protocolString.equals(str)) {
                return recordQualityMode;
            }
        }
        ypg0.m217021a("Invalid record quality mode string: ", str);
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocolString;
    }
}
