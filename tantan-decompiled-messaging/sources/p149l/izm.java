package p149l;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class izm {
    /* JADX INFO: renamed from: a */
    public static boolean m139070a(String str) {
        return Pattern.compile("(?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))").matcher(str).matches();
    }
}
