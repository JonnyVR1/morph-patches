package org.fourthline.cling.model.types;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BytesRange {
    public static final String PREFIX = "bytes=";
    private Long byteLength;
    private Long firstByte;
    private Long lastByte;

    public BytesRange(Long l2, Long l3) {
        this.firstByte = l2;
        this.lastByte = l3;
        this.byteLength = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    public static BytesRange valueOf(String str, String str2) throws InvalidValueException {
        Long lValueOf;
        Long lValueOf2;
        if (str.startsWith(str2 != null ? str2 : PREFIX)) {
            if (str2 == null) {
                str2 = PREFIX;
            }
            String[] strArrSplit = str.substring(str2.length()).split("[-/]");
            int length = strArrSplit.length;
            if (length == 1) {
                lValueOf = null;
                lValueOf2 = null;
            } else if (length == 2) {
                lValueOf = null;
                if (strArrSplit[1].length() != 0) {
                    lValueOf2 = Long.valueOf(Long.parseLong(strArrSplit[1]));
                } else {
                    lValueOf2 = null;
                }
            } else if (length == 3) {
                if (strArrSplit[2].length() == 0 || strArrSplit[2].equals("*")) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(Long.parseLong(strArrSplit[2]));
                }
                if (strArrSplit[1].length() != 0) {
                    lValueOf2 = Long.valueOf(Long.parseLong(strArrSplit[1]));
                } else {
                    lValueOf2 = null;
                }
            }
            Long lValueOf3 = strArrSplit[0].length() != 0 ? Long.valueOf(Long.parseLong(strArrSplit[0])) : null;
            if (lValueOf3 != null || lValueOf2 != null) {
                return new BytesRange(lValueOf3, lValueOf2, lValueOf);
            }
        }
        throw new InvalidValueException("Can't parse Bytes Range: ".concat(str));
    }

    public Long getByteLength() {
        return this.byteLength;
    }

    public Long getFirstByte() {
        return this.firstByte;
    }

    public Long getLastByte() {
        return this.lastByte;
    }

    public String getString(boolean z, String str) {
        if (str == null) {
            str = PREFIX;
        }
        if (this.firstByte != null) {
            str = str + this.firstByte.toString();
        }
        String strConcat = str.concat("-");
        if (this.lastByte != null) {
            strConcat = strConcat + this.lastByte.toString();
        }
        if (!z) {
            return strConcat;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strConcat);
        sb.append("/");
        Long l2 = this.byteLength;
        sb.append(l2 != null ? l2.toString() : "*");
        return sb.toString();
    }

    public BytesRange(Long l2, Long l3, Long l4) {
        this.firstByte = l2;
        this.lastByte = l3;
        this.byteLength = l4;
    }

    public String getString(boolean z) {
        return getString(z, null);
    }

    public String getString() {
        return getString(false, null);
    }

    public static BytesRange valueOf(String str) throws InvalidValueException {
        return valueOf(str, null);
    }
}
