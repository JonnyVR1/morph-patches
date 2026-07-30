package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.types.BytesRange;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.support.model.dlna.types.NormalPlayTimeRange;
import org.fourthline.cling.support.model.dlna.types.TimeSeekRangeType;
import p003l.sel;
import p003l.xie;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TimeSeekRangeHeader extends DLNAHeader<TimeSeekRangeType> {
    public TimeSeekRangeHeader(TimeSeekRangeType timeSeekRangeType) {
        setValue(timeSeekRangeType);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        TimeSeekRangeType value = getValue();
        String string = value.getNormalPlayTimeRange().getString();
        if (value.getBytesRange() == null) {
            return string;
        }
        return string + " " + value.getBytesRange().getString(true);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        if (str.length() != 0) {
            String[] strArrSplit = str.split(" ");
            if (strArrSplit.length > 0) {
                try {
                    TimeSeekRangeType timeSeekRangeType = new TimeSeekRangeType(NormalPlayTimeRange.valueOf(strArrSplit[0]));
                    if (strArrSplit.length > 1) {
                        timeSeekRangeType.setBytesRange(BytesRange.valueOf(strArrSplit[1]));
                    }
                    setValue(timeSeekRangeType);
                    return;
                } catch (InvalidValueException e) {
                    sel.m7568a("Invalid TimeSeekRange header value: ", str, "; ", e.getMessage());
                    return;
                }
            }
        }
        xie.m8707a("Invalid TimeSeekRange header value: ".concat(str));
    }

    public TimeSeekRangeHeader() {
    }
}
