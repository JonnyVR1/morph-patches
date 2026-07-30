package org.fourthline.cling.support.model.dlna.types;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;
import p153l.s1c;

/* JADX INFO: loaded from: classes3.dex */
public class BufferInfoType {
    static final Pattern pattern = Pattern.compile("^dejitter=(\\d{1,10})(;CDB=(\\d{1,10});BTM=(0|1|2))?(;TD=(\\d{1,10}))?(;BFR=(0|1))?$", 2);
    private CodedDataBuffer cdb;
    private Long dejitterSize;
    private Boolean fullnessReports;
    private Long targetDuration;

    public BufferInfoType(Long l2, CodedDataBuffer codedDataBuffer, Long l3, Boolean bool) {
        this.dejitterSize = l2;
        this.cdb = codedDataBuffer;
        this.targetDuration = l3;
        this.fullnessReports = bool;
    }

    public static BufferInfoType valueOf(String str) throws InvalidValueException {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            try {
                return new BufferInfoType(Long.valueOf(Long.parseLong(matcher.group(1))), matcher.group(2) != null ? new CodedDataBuffer(Long.valueOf(Long.parseLong(matcher.group(3))), CodedDataBuffer.TransferMechanism.values()[Integer.parseInt(matcher.group(4))]) : null, matcher.group(5) != null ? Long.valueOf(Long.parseLong(matcher.group(6))) : null, matcher.group(7) != null ? Boolean.valueOf(matcher.group(8).equals("1")) : null);
            } catch (NumberFormatException unused) {
            }
        }
        s1c.m184023a("Can't parse BufferInfoType: ", str);
        return null;
    }

    public CodedDataBuffer getCdb() {
        return this.cdb;
    }

    public Long getDejitterSize() {
        return this.dejitterSize;
    }

    public String getString() {
        String str = "dejitter=" + this.dejitterSize.toString();
        if (this.cdb != null) {
            str = str + ";CDB=" + this.cdb.getSize().toString() + ";BTM=" + this.cdb.getTranfer().ordinal();
        }
        if (this.targetDuration != null) {
            str = str + ";TD=" + this.targetDuration.toString();
        }
        if (this.fullnessReports == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(";BFR=");
        sb.append(this.fullnessReports.booleanValue() ? "1" : "0");
        return sb.toString();
    }

    public Long getTargetDuration() {
        return this.targetDuration;
    }

    public Boolean isFullnessReports() {
        return this.fullnessReports;
    }

    public BufferInfoType(Long l2) {
        this.dejitterSize = l2;
    }
}
