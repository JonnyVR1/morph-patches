package p153l;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class m8c {

    /* JADX INFO: renamed from: c */
    public static final String[] f135166c = {"in"};

    /* JADX INFO: renamed from: d */
    public static final String[] f135167d = {"zh", "ko"};

    /* JADX INFO: renamed from: a */
    public String f135168a;

    /* JADX INFO: renamed from: b */
    public Locale f135169b;

    public m8c(String str, Locale locale) {
        this.f135168a = str;
        this.f135169b = locale;
    }

    /* JADX INFO: renamed from: b */
    public static Date m157355b(long j) {
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
    public SimpleDateFormat m157356a() {
        String language = this.f135169b.getLanguage();
        if ("yy/MM/dd".equals(this.f135168a)) {
            if (Arrays.asList(f135167d).contains(language)) {
                this.f135168a = "yy/MM/dd";
            } else if (this.f135169b.equals(Locale.UK) || Arrays.asList(f135166c).contains(language)) {
                this.f135168a = "dd/MM/yy";
            } else if ("ja".equals(language)) {
                this.f135168a = "yy/M/dd";
            } else {
                this.f135168a = "MM/dd/yy";
            }
        } else if ("EEEE yy/MM/dd".equals(this.f135168a)) {
            if (Arrays.asList(f135167d).contains(language)) {
                this.f135168a = "EEEE yy/MM/dd";
            } else if (this.f135169b.equals(Locale.UK) || Arrays.asList(f135166c).contains(language)) {
                this.f135168a = "EEEE dd/MM/yy";
            } else if ("ja".equals(language)) {
                this.f135168a = "EEEE yy/M/dd";
            } else {
                this.f135168a = "EEEE MM/dd/yy";
            }
        } else if ("yyyy/MM/dd".equals(this.f135168a)) {
            if (Arrays.asList(f135167d).contains(language)) {
                this.f135168a = "yyyy/MM/dd";
            } else if (this.f135169b.equals(Locale.UK) || Arrays.asList(f135166c).contains(language)) {
                this.f135168a = "dd/MM/yyyy";
            } else if ("ja".equals(language)) {
                this.f135168a = "yyyy/M/dd";
            } else {
                this.f135168a = "MM/dd/yyyy";
            }
        } else if ("yyyy-MM-dd".equals(this.f135168a)) {
            if ("zh".equals(language)) {
                this.f135168a = "yyyy-MM-dd";
            } else if (this.f135169b.equals(Locale.UK) || Arrays.asList(f135166c).contains(language)) {
                this.f135168a = "dd/MM/yyyy";
            } else if ("ko".equals(language)) {
                this.f135168a = "yyyy/MM/dd";
            } else if ("ja".equals(language)) {
                this.f135168a = "yyyy/M/dd";
            } else {
                this.f135168a = "MM/dd/yyyy";
            }
        } else if ("yyyy-MM-dd HH:mm".equals(this.f135168a)) {
            if ("zh".equals(language)) {
                this.f135168a = "yyyy-MM-dd HH:mm";
            } else if (this.f135169b.equals(Locale.UK) || Arrays.asList(f135166c).contains(language)) {
                this.f135168a = "dd/MM/yyyy HH:mm";
            } else if ("ko".equals(language)) {
                this.f135168a = "yyyy/MM/dd HH:mm";
            } else if ("ja".equals(language)) {
                this.f135168a = "yyyy/M/dd HH:mm";
            } else {
                this.f135168a = "MM/dd/yyyy HH:mm";
            }
        } else if ("yyyy-MM-dd HH:mm:ss".equals(this.f135168a)) {
            if ("zh".equals(language)) {
                this.f135168a = "yyyy-MM-dd HH:mm:ss";
            } else if (this.f135169b.equals(Locale.UK) || Arrays.asList(f135166c).contains(language)) {
                this.f135168a = "dd/MM/yyyy HH:mm:ss";
            } else if ("ko".equals(language)) {
                this.f135168a = "yyyy/MM/dd HH:mm:ss";
            } else if ("ja".equals(language)) {
                this.f135168a = "yyyy/M/dd HH:mm:ss";
            } else {
                this.f135168a = "MM/dd/yyyy HH:mm:ss";
            }
        } else if ("EEEE yy/MM/dd HH:mm".equals(this.f135168a)) {
            if (Arrays.asList(f135167d).contains(language)) {
                this.f135168a = "EEEE yy/MM/dd HH:mm";
            } else if (this.f135169b.equals(Locale.UK) || Arrays.asList(f135166c).contains(language)) {
                this.f135168a = "EEEE dd/MM/yyyy HH:mm";
            } else if ("ja".equals(language)) {
                this.f135168a = "EEEE yy/M/dd HH:mm";
            } else {
                this.f135168a = "EEEE MM/dd/yyyy HH:mm";
            }
        } else if ("EEEE yy/MM/dd HH:mm:ss".equals(this.f135168a)) {
            if (Arrays.asList(f135167d).contains(language)) {
                this.f135168a = "EEEE yy/MM/dd HH:mm:ss";
            } else if (this.f135169b.equals(Locale.UK) || Arrays.asList(f135166c).contains(language)) {
                this.f135168a = "EEEE dd/MM/yyyy HH:mm:ss";
            } else if ("ja".equals(language)) {
                this.f135168a = "EEEE yy/M/dd HH:mm:ss";
            } else {
                this.f135168a = "EEEE MM/dd/yyyy HH:mm:ss";
            }
        } else if ("MM/dd".equals(this.f135168a)) {
            if (Arrays.asList(f135167d).contains(language)) {
                this.f135168a = "MM/dd";
            } else if (this.f135169b.equals(Locale.UK) || Arrays.asList(f135166c).contains(language)) {
                this.f135168a = "dd MMMM";
            } else if ("ja".equals(language)) {
                this.f135168a = "M/dd";
            } else {
                this.f135168a = "MMMM dd";
            }
        } else if ("EEEE MM/dd".equals(this.f135168a)) {
            if (this.f135169b.equals(Locale.UK) || Arrays.asList(f135166c).contains(language)) {
                this.f135168a = "EEEE dd/MM";
            } else if ("ja".equals(language)) {
                this.f135168a = "EEEE M/dd";
            } else {
                this.f135168a = "EEEE MM/dd";
            }
        } else if ("MM-dd HH:mm".equals(this.f135168a)) {
            if ("zh".equals(language)) {
                this.f135168a = "MM-dd HH:mm";
            } else if (this.f135169b.equals(Locale.UK) || Arrays.asList(f135166c).contains(language)) {
                this.f135168a = "dd/MM HH:mm";
            } else if ("ja".equals(language)) {
                this.f135168a = "M/dd HH:mm";
            } else {
                this.f135168a = "MM/dd HH:mm";
            }
        } else if ("MM-dd".equals(this.f135168a)) {
            if ("zh".equals(language)) {
                this.f135168a = "MM-dd";
            } else if (this.f135169b.equals(Locale.UK) || Arrays.asList(f135166c).contains(language)) {
                this.f135168a = "dd/MM";
            } else if ("ja".equals(language)) {
                this.f135168a = "M/dd";
            } else {
                this.f135168a = "MM/dd";
            }
        }
        return new SimpleDateFormat(this.f135168a, this.f135169b);
    }
}
