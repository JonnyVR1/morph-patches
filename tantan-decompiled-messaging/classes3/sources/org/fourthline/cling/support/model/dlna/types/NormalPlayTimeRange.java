package org.fourthline.cling.support.model.dlna.types;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NormalPlayTimeRange {
    public static final String PREFIX = "npt=";
    private NormalPlayTime timeDuration;
    private NormalPlayTime timeEnd;
    private NormalPlayTime timeStart;

    public NormalPlayTimeRange(long j, long j2) {
        this.timeStart = new NormalPlayTime(j);
        this.timeEnd = new NormalPlayTime(j2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    public static NormalPlayTimeRange valueOf(String str, boolean z) throws InvalidValueException {
        NormalPlayTime normalPlayTimeValueOf;
        if (str.startsWith(PREFIX)) {
            String[] strArrSplit = str.substring(4).split("[-/]");
            int length = strArrSplit.length;
            NormalPlayTime normalPlayTimeValueOf2 = null;
            if (length == 1) {
                normalPlayTimeValueOf = null;
            } else if (length == 2) {
                normalPlayTimeValueOf = null;
                if (strArrSplit[1].length() != 0) {
                    normalPlayTimeValueOf2 = NormalPlayTime.valueOf(strArrSplit[1]);
                }
            } else if (length == 3) {
                if (strArrSplit[2].length() == 0 || strArrSplit[2].equals("*")) {
                    normalPlayTimeValueOf = null;
                } else {
                    normalPlayTimeValueOf = NormalPlayTime.valueOf(strArrSplit[2]);
                }
                if (strArrSplit[1].length() != 0) {
                    normalPlayTimeValueOf2 = NormalPlayTime.valueOf(strArrSplit[1]);
                }
            }
            if (strArrSplit[0].length() != 0 && (!z || (z && strArrSplit.length > 1))) {
                return new NormalPlayTimeRange(NormalPlayTime.valueOf(strArrSplit[0]), normalPlayTimeValueOf2, normalPlayTimeValueOf);
            }
        }
        throw new InvalidValueException("Can't parse NormalPlayTimeRange: ".concat(str));
    }

    public String getString(boolean z) {
        String str = PREFIX + this.timeStart.getString() + "-";
        if (this.timeEnd != null) {
            str = str + this.timeEnd.getString();
        }
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        NormalPlayTime normalPlayTime = this.timeDuration;
        sb.append(normalPlayTime != null ? normalPlayTime.getString() : "*");
        return sb.toString();
    }

    public NormalPlayTime getTimeDuration() {
        return this.timeDuration;
    }

    public NormalPlayTime getTimeEnd() {
        return this.timeEnd;
    }

    public NormalPlayTime getTimeStart() {
        return this.timeStart;
    }

    public NormalPlayTimeRange(NormalPlayTime normalPlayTime, NormalPlayTime normalPlayTime2) {
        this.timeStart = normalPlayTime;
        this.timeEnd = normalPlayTime2;
    }

    public NormalPlayTimeRange(NormalPlayTime normalPlayTime, NormalPlayTime normalPlayTime2, NormalPlayTime normalPlayTime3) {
        this.timeStart = normalPlayTime;
        this.timeEnd = normalPlayTime2;
        this.timeDuration = normalPlayTime3;
    }

    public String getString() {
        return getString(true);
    }

    public static NormalPlayTimeRange valueOf(String str) throws InvalidValueException {
        return valueOf(str, false);
    }
}
