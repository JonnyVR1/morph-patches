package org.eclipse.jetty.server;

import java.util.Enumeration;
import java.util.List;
import java.util.StringTokenizer;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.fourthline.cling.model.message.header.ContentRangeHeader;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class InclusiveByteRange {
    private static final Logger LOG = Log.getLogger((Class<?>) InclusiveByteRange.class);
    long first;
    long last;

    public InclusiveByteRange(long j, long j2) {
        this.first = j;
        this.last = j2;
    }

    public static List satisfiableRanges(Enumeration enumeration, long j) {
        long j2;
        long j3;
        Object obj = null;
        while (enumeration.hasMoreElements()) {
            StringTokenizer stringTokenizer = new StringTokenizer((String) enumeration.nextElement(), "=,", false);
            Object objAdd = obj;
            String strTrim = null;
            while (stringTokenizer.hasMoreTokens()) {
                try {
                    try {
                        strTrim = stringTokenizer.nextToken().trim();
                        int iIndexOf = strTrim.indexOf(45);
                        if (iIndexOf >= 0) {
                            int i = iIndexOf + 1;
                            if (strTrim.indexOf("-", i) < 0) {
                                if (iIndexOf == 0) {
                                    if (i < strTrim.length()) {
                                        j3 = Long.parseLong(strTrim.substring(i).trim());
                                        j2 = -1;
                                    } else {
                                        LOG.warn("Bad range format: {}", strTrim);
                                    }
                                } else if (i < strTrim.length()) {
                                    j2 = Long.parseLong(strTrim.substring(0, iIndexOf).trim());
                                    j3 = Long.parseLong(strTrim.substring(i).trim());
                                } else {
                                    j2 = Long.parseLong(strTrim.substring(0, iIndexOf).trim());
                                    j3 = -1;
                                }
                                if ((j2 == -1 && j3 == -1) || (j2 != -1 && j3 != -1 && j2 > j3)) {
                                    break;
                                    break;
                                }
                                if (j2 < j) {
                                    objAdd = LazyList.add(objAdd, new InclusiveByteRange(j2, j3));
                                }
                            }
                        }
                        if (!HttpHeaderValues.BYTES.equals(strTrim)) {
                            LOG.warn("Bad range format: {}", strTrim);
                            break;
                        }
                    } catch (NumberFormatException e) {
                        Logger logger = LOG;
                        logger.warn("Bad range format: {}", strTrim);
                        logger.ignore(e);
                    }
                } catch (Exception e2) {
                    Logger logger2 = LOG;
                    logger2.warn("Bad range format: {}", strTrim);
                    logger2.ignore(e2);
                }
            }
            obj = objAdd;
        }
        return LazyList.getList(obj, true);
    }

    public static String to416HeaderRangeString(long j) {
        StringBuilder sb = new StringBuilder(40);
        sb.append("bytes */");
        sb.append(j);
        return sb.toString();
    }

    public long getFirst(long j) {
        long j2 = this.first;
        if (j2 >= 0) {
            return j2;
        }
        long j3 = j - this.last;
        if (j3 < 0) {
            return 0L;
        }
        return j3;
    }

    public long getLast(long j) {
        if (this.first < 0) {
            return j - 1;
        }
        long j2 = this.last;
        return (j2 < 0 || j2 >= j) ? j - 1 : j2;
    }

    public long getSize(long j) {
        return (getLast(j) - getFirst(j)) + 1;
    }

    public String toHeaderRangeString(long j) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(ContentRangeHeader.PREFIX);
        sb.append(getFirst(j));
        sb.append('-');
        sb.append(getLast(j));
        sb.append("/");
        sb.append(j);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append(Long.toString(this.first));
        sb.append(":");
        sb.append(Long.toString(this.last));
        return sb.toString();
    }

    public long getFirst() {
        return this.first;
    }

    public long getLast() {
        return this.last;
    }
}
