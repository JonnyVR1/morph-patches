package p149l;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class g7c {

    /* JADX INFO: renamed from: c */
    public static final String[] f101349c = {"in"};

    /* JADX INFO: renamed from: d */
    public static final String[] f101350d = {"zh", "ko"};

    /* JADX INFO: renamed from: a */
    public String f101351a;

    /* JADX INFO: renamed from: b */
    public Locale f101352b;

    public g7c(String str, Locale locale) {
        this.f101351a = str;
        this.f101352b = locale;
    }

    /* JADX INFO: renamed from: b */
    public static Date m124686b(long j) {
        if (j <= 0) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    /* JADX INFO: renamed from: a */
    public SimpleDateFormat m124687a() {
        String language = this.f101352b.getLanguage();
        if ("yy/MM/dd".equals(this.f101351a)) {
            if (Arrays.asList(f101350d).contains(language)) {
                this.f101351a = "yy/MM/dd";
            } else if (this.f101352b.equals(Locale.UK) || Arrays.asList(f101349c).contains(language)) {
                this.f101351a = "dd/MM/yy";
            } else if ("ja".equals(language)) {
                this.f101351a = "yy/M/dd";
            } else {
                this.f101351a = "MM/dd/yy";
            }
        } else if ("EEEE yy/MM/dd".equals(this.f101351a)) {
            if (Arrays.asList(f101350d).contains(language)) {
                this.f101351a = "EEEE yy/MM/dd";
            } else if (this.f101352b.equals(Locale.UK) || Arrays.asList(f101349c).contains(language)) {
                this.f101351a = "EEEE dd/MM/yy";
            } else if ("ja".equals(language)) {
                this.f101351a = "EEEE yy/M/dd";
            } else {
                this.f101351a = "EEEE MM/dd/yy";
            }
        } else if ("yyyy/MM/dd".equals(this.f101351a)) {
            if (Arrays.asList(f101350d).contains(language)) {
                this.f101351a = "yyyy/MM/dd";
            } else if (this.f101352b.equals(Locale.UK) || Arrays.asList(f101349c).contains(language)) {
                this.f101351a = "dd/MM/yyyy";
            } else if ("ja".equals(language)) {
                this.f101351a = "yyyy/M/dd";
            } else {
                this.f101351a = "MM/dd/yyyy";
            }
        } else if ("yyyy-MM-dd".equals(this.f101351a)) {
            if ("zh".equals(language)) {
                this.f101351a = "yyyy-MM-dd";
            } else if (this.f101352b.equals(Locale.UK) || Arrays.asList(f101349c).contains(language)) {
                this.f101351a = "dd/MM/yyyy";
            } else if ("ko".equals(language)) {
                this.f101351a = "yyyy/MM/dd";
            } else if ("ja".equals(language)) {
                this.f101351a = "yyyy/M/dd";
            } else {
                this.f101351a = "MM/dd/yyyy";
            }
        } else if ("yyyy-MM-dd HH:mm".equals(this.f101351a)) {
            if ("zh".equals(language)) {
                this.f101351a = "yyyy-MM-dd HH:mm";
            } else if (this.f101352b.equals(Locale.UK) || Arrays.asList(f101349c).contains(language)) {
                this.f101351a = "dd/MM/yyyy HH:mm";
            } else if ("ko".equals(language)) {
                this.f101351a = "yyyy/MM/dd HH:mm";
            } else if ("ja".equals(language)) {
                this.f101351a = "yyyy/M/dd HH:mm";
            } else {
                this.f101351a = "MM/dd/yyyy HH:mm";
            }
        } else if ("yyyy-MM-dd HH:mm:ss".equals(this.f101351a)) {
            if ("zh".equals(language)) {
                this.f101351a = "yyyy-MM-dd HH:mm:ss";
            } else if (this.f101352b.equals(Locale.UK) || Arrays.asList(f101349c).contains(language)) {
                this.f101351a = "dd/MM/yyyy HH:mm:ss";
            } else if ("ko".equals(language)) {
                this.f101351a = "yyyy/MM/dd HH:mm:ss";
            } else if ("ja".equals(language)) {
                this.f101351a = "yyyy/M/dd HH:mm:ss";
            } else {
                this.f101351a = "MM/dd/yyyy HH:mm:ss";
            }
        } else if ("EEEE yy/MM/dd HH:mm".equals(this.f101351a)) {
            if (Arrays.asList(f101350d).contains(language)) {
                this.f101351a = "EEEE yy/MM/dd HH:mm";
            } else if (this.f101352b.equals(Locale.UK) || Arrays.asList(f101349c).contains(language)) {
                this.f101351a = "EEEE dd/MM/yyyy HH:mm";
            } else if ("ja".equals(language)) {
                this.f101351a = "EEEE yy/M/dd HH:mm";
            } else {
                this.f101351a = "EEEE MM/dd/yyyy HH:mm";
            }
        } else if ("EEEE yy/MM/dd HH:mm:ss".equals(this.f101351a)) {
            if (Arrays.asList(f101350d).contains(language)) {
                this.f101351a = "EEEE yy/MM/dd HH:mm:ss";
            } else if (this.f101352b.equals(Locale.UK) || Arrays.asList(f101349c).contains(language)) {
                this.f101351a = "EEEE dd/MM/yyyy HH:mm:ss";
            } else if ("ja".equals(language)) {
                this.f101351a = "EEEE yy/M/dd HH:mm:ss";
            } else {
                this.f101351a = "EEEE MM/dd/yyyy HH:mm:ss";
            }
        } else if ("MM/dd".equals(this.f101351a)) {
            if (Arrays.asList(f101350d).contains(language)) {
                this.f101351a = "MM/dd";
            } else if (this.f101352b.equals(Locale.UK) || Arrays.asList(f101349c).contains(language)) {
                this.f101351a = "dd MMMM";
            } else if ("ja".equals(language)) {
                this.f101351a = "M/dd";
            } else {
                this.f101351a = "MMMM dd";
            }
        } else if ("EEEE MM/dd".equals(this.f101351a)) {
            if (this.f101352b.equals(Locale.UK) || Arrays.asList(f101349c).contains(language)) {
                this.f101351a = "EEEE dd/MM";
            } else if ("ja".equals(language)) {
                this.f101351a = "EEEE M/dd";
            } else {
                this.f101351a = "EEEE MM/dd";
            }
        } else if ("MM-dd HH:mm".equals(this.f101351a)) {
            if ("zh".equals(language)) {
                this.f101351a = "MM-dd HH:mm";
            } else if (this.f101352b.equals(Locale.UK) || Arrays.asList(f101349c).contains(language)) {
                this.f101351a = "dd/MM HH:mm";
            } else if ("ja".equals(language)) {
                this.f101351a = "M/dd HH:mm";
            } else {
                this.f101351a = "MM/dd HH:mm";
            }
        } else if ("MM-dd".equals(this.f101351a)) {
            if ("zh".equals(language)) {
                this.f101351a = "MM-dd";
            } else if (this.f101352b.equals(Locale.UK) || Arrays.asList(f101349c).contains(language)) {
                this.f101351a = "dd/MM";
            } else if ("ja".equals(language)) {
                this.f101351a = "M/dd";
            } else {
                this.f101351a = "MM/dd";
            }
        }
        return new SimpleDateFormat(this.f101351a, this.f101352b);
    }
}
