package org.fourthline.cling.support.model.dlna.types;

import com.clevertap.android.sdk.Constants;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;
import p153l.hw40;
import p153l.s1c;

/* JADX INFO: loaded from: classes3.dex */
public class NormalPlayTime {
    static final Pattern pattern = Pattern.compile("^(\\d+):(\\d{1,2}):(\\d{1,2})(\\.(\\d{1,3}))?|(\\d+)(\\.(\\d{1,3}))?$", 2);
    private long milliseconds;

    /* JADX INFO: renamed from: org.fourthline.cling.support.model.dlna.types.NormalPlayTime$1 */
    public static /* synthetic */ class C221631 {

        /* JADX INFO: renamed from: $SwitchMap$org$fourthline$cling$support$model$dlna$types$NormalPlayTime$Format */
        static final /* synthetic */ int[] f206881x61cef210;

        static {
            int[] iArr = new int[Format.values().length];
            f206881x61cef210 = iArr;
            try {
                iArr[Format.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum Format {
        SECONDS,
        TIME
    }

    public NormalPlayTime(long j, long j2, long j3, long j4) throws InvalidValueException {
        if (j < 0) {
            hw40.m137412a("Invalid parameter hours: ", j);
            throw null;
        }
        if (j2 < 0 || j2 > 59) {
            hw40.m137412a("Invalid parameter minutes: ", j);
            throw null;
        }
        if (j3 < 0 || j3 > 59) {
            hw40.m137412a("Invalid parameter seconds: ", j);
            throw null;
        }
        if (j4 < 0 || j4 > 999) {
            hw40.m137412a("Invalid parameter milliseconds: ", j4);
            throw null;
        }
        this.milliseconds = (((j * 3600) + (j2 * 60) + j3) * 1000) + j4;
    }

    public static NormalPlayTime valueOf(String str) throws InvalidValueException {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            try {
                if (matcher.group(1) != null) {
                    return new NormalPlayTime(Long.parseLong(matcher.group(1)), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), Long.parseLong(matcher.group(5)) * ((long) ((int) Math.pow(10.0d, 3 - matcher.group(5).length()))));
                }
                return new NormalPlayTime((Long.parseLong(matcher.group(6)) * 1000) + (Long.parseLong(matcher.group(8)) * ((long) ((int) Math.pow(10.0d, 3 - matcher.group(8).length())))));
            } catch (NumberFormatException unused) {
            }
        }
        s1c.m184023a("Can't parse NormalPlayTime: ", str);
        return null;
    }

    public long getMilliseconds() {
        return this.milliseconds;
    }

    public String getString(Format format) {
        long j = this.milliseconds;
        long j2 = j / 1000;
        long j3 = j % 1000;
        if (C221631.f206881x61cef210[format.ordinal()] != 1) {
            return String.format(Locale.ROOT, "%d.%03d", Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = this.milliseconds;
        long seconds = (j4 / 1000) - TimeUnit.MINUTES.toSeconds(j4 / Constants.ONE_MIN_IN_MILLIS);
        long j5 = this.milliseconds;
        return String.format(Locale.ROOT, "%d:%02d:%02d.%03d", Long.valueOf(j5 / 3600000), Long.valueOf((j5 / Constants.ONE_MIN_IN_MILLIS) - TimeUnit.HOURS.toMinutes(j5 / 3600000)), Long.valueOf(seconds), Long.valueOf(j3));
    }

    public void setMilliseconds(long j) {
        if (j >= 0) {
            this.milliseconds = j;
        } else {
            hw40.m137412a("Invalid parameter milliseconds: ", j);
        }
    }

    public NormalPlayTime(long j) {
        if (j >= 0) {
            this.milliseconds = j;
        } else {
            hw40.m137412a("Invalid parameter milliseconds: ", j);
            throw null;
        }
    }

    public String getString() {
        return getString(Format.SECONDS);
    }
}
