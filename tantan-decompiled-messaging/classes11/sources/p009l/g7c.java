package p009l;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class g7c {

    /* JADX INFO: renamed from: c */
    public static final String[] f13337c = {"in"};

    /* JADX INFO: renamed from: d */
    public static final String[] f13338d = {"zh", "ko"};

    /* JADX INFO: renamed from: a */
    public String f13339a;

    /* JADX INFO: renamed from: b */
    public Locale f13340b;

    public g7c(String str, Locale locale) {
        this.f13339a = str;
        this.f13340b = locale;
    }

    /* JADX INFO: renamed from: b */
    public static Date m14795b(long j) {
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
    public SimpleDateFormat m14796a() {
        String language = this.f13340b.getLanguage();
        if ("yy/MM/dd".equals(this.f13339a)) {
            if (Arrays.asList(f13338d).contains(language)) {
                this.f13339a = "yy/MM/dd";
            } else if (this.f13340b.equals(Locale.UK) || Arrays.asList(f13337c).contains(language)) {
                this.f13339a = "dd/MM/yy";
            } else if ("ja".equals(language)) {
                this.f13339a = "yy/M/dd";
            } else {
                this.f13339a = "MM/dd/yy";
            }
        } else if ("EEEE yy/MM/dd".equals(this.f13339a)) {
            if (Arrays.asList(f13338d).contains(language)) {
                this.f13339a = "EEEE yy/MM/dd";
            } else if (this.f13340b.equals(Locale.UK) || Arrays.asList(f13337c).contains(language)) {
                this.f13339a = "EEEE dd/MM/yy";
            } else if ("ja".equals(language)) {
                this.f13339a = "EEEE yy/M/dd";
            } else {
                this.f13339a = "EEEE MM/dd/yy";
            }
        } else if ("yyyy/MM/dd".equals(this.f13339a)) {
            if (Arrays.asList(f13338d).contains(language)) {
                this.f13339a = "yyyy/MM/dd";
            } else if (this.f13340b.equals(Locale.UK) || Arrays.asList(f13337c).contains(language)) {
                this.f13339a = "dd/MM/yyyy";
            } else if ("ja".equals(language)) {
                this.f13339a = "yyyy/M/dd";
            } else {
                this.f13339a = "MM/dd/yyyy";
            }
        } else if ("yyyy-MM-dd".equals(this.f13339a)) {
            if ("zh".equals(language)) {
                this.f13339a = "yyyy-MM-dd";
            } else if (this.f13340b.equals(Locale.UK) || Arrays.asList(f13337c).contains(language)) {
                this.f13339a = "dd/MM/yyyy";
            } else if ("ko".equals(language)) {
                this.f13339a = "yyyy/MM/dd";
            } else if ("ja".equals(language)) {
                this.f13339a = "yyyy/M/dd";
            } else {
                this.f13339a = "MM/dd/yyyy";
            }
        } else if ("yyyy-MM-dd HH:mm".equals(this.f13339a)) {
            if ("zh".equals(language)) {
                this.f13339a = "yyyy-MM-dd HH:mm";
            } else if (this.f13340b.equals(Locale.UK) || Arrays.asList(f13337c).contains(language)) {
                this.f13339a = "dd/MM/yyyy HH:mm";
            } else if ("ko".equals(language)) {
                this.f13339a = "yyyy/MM/dd HH:mm";
            } else if ("ja".equals(language)) {
                this.f13339a = "yyyy/M/dd HH:mm";
            } else {
                this.f13339a = "MM/dd/yyyy HH:mm";
            }
        } else if ("yyyy-MM-dd HH:mm:ss".equals(this.f13339a)) {
            if ("zh".equals(language)) {
                this.f13339a = "yyyy-MM-dd HH:mm:ss";
            } else if (this.f13340b.equals(Locale.UK) || Arrays.asList(f13337c).contains(language)) {
                this.f13339a = "dd/MM/yyyy HH:mm:ss";
            } else if ("ko".equals(language)) {
                this.f13339a = "yyyy/MM/dd HH:mm:ss";
            } else if ("ja".equals(language)) {
                this.f13339a = "yyyy/M/dd HH:mm:ss";
            } else {
                this.f13339a = "MM/dd/yyyy HH:mm:ss";
            }
        } else if ("EEEE yy/MM/dd HH:mm".equals(this.f13339a)) {
            if (Arrays.asList(f13338d).contains(language)) {
                this.f13339a = "EEEE yy/MM/dd HH:mm";
            } else if (this.f13340b.equals(Locale.UK) || Arrays.asList(f13337c).contains(language)) {
                this.f13339a = "EEEE dd/MM/yyyy HH:mm";
            } else if ("ja".equals(language)) {
                this.f13339a = "EEEE yy/M/dd HH:mm";
            } else {
                this.f13339a = "EEEE MM/dd/yyyy HH:mm";
            }
        } else if ("EEEE yy/MM/dd HH:mm:ss".equals(this.f13339a)) {
            if (Arrays.asList(f13338d).contains(language)) {
                this.f13339a = "EEEE yy/MM/dd HH:mm:ss";
            } else if (this.f13340b.equals(Locale.UK) || Arrays.asList(f13337c).contains(language)) {
                this.f13339a = "EEEE dd/MM/yyyy HH:mm:ss";
            } else if ("ja".equals(language)) {
                this.f13339a = "EEEE yy/M/dd HH:mm:ss";
            } else {
                this.f13339a = "EEEE MM/dd/yyyy HH:mm:ss";
            }
        } else if ("MM/dd".equals(this.f13339a)) {
            if (Arrays.asList(f13338d).contains(language)) {
                this.f13339a = "MM/dd";
            } else if (this.f13340b.equals(Locale.UK) || Arrays.asList(f13337c).contains(language)) {
                this.f13339a = "dd MMMM";
            } else if ("ja".equals(language)) {
                this.f13339a = "M/dd";
            } else {
                this.f13339a = "MMMM dd";
            }
        } else if ("EEEE MM/dd".equals(this.f13339a)) {
            if (this.f13340b.equals(Locale.UK) || Arrays.asList(f13337c).contains(language)) {
                this.f13339a = "EEEE dd/MM";
            } else if ("ja".equals(language)) {
                this.f13339a = "EEEE M/dd";
            } else {
                this.f13339a = "EEEE MM/dd";
            }
        } else if ("MM-dd HH:mm".equals(this.f13339a)) {
            if ("zh".equals(language)) {
                this.f13339a = "MM-dd HH:mm";
            } else if (this.f13340b.equals(Locale.UK) || Arrays.asList(f13337c).contains(language)) {
                this.f13339a = "dd/MM HH:mm";
            } else if ("ja".equals(language)) {
                this.f13339a = "M/dd HH:mm";
            } else {
                this.f13339a = "MM/dd HH:mm";
            }
        } else if ("MM-dd".equals(this.f13339a)) {
            if ("zh".equals(language)) {
                this.f13339a = "MM-dd";
            } else if (this.f13340b.equals(Locale.UK) || Arrays.asList(f13337c).contains(language)) {
                this.f13339a = "dd/MM";
            } else if ("ja".equals(language)) {
                this.f13339a = "M/dd";
            } else {
                this.f13339a = "MM/dd";
            }
        }
        return new SimpleDateFormat(this.f13339a, this.f13340b);
    }
}
