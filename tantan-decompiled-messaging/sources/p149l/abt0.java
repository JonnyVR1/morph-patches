package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class abt0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f68749a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* JADX INFO: renamed from: b */
    public static final Pattern f68750b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    /* JADX INFO: renamed from: a */
    public static String m95698a(@NonNull String str, @Nullable String... strArr) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f68749a.matcher(str);
        int i = 0;
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            while (i <= 0) {
                String str2 = strArr[i];
                if (str2 != null) {
                    sb.append(str2);
                }
                i++;
            }
            sb.append(str.substring(iEnd));
        } else {
            if (!f68750b.matcher(str).find()) {
                while (i <= 0) {
                    String str3 = strArr[i];
                    if (str3 != null) {
                        sb.append(str3);
                    }
                    i++;
                }
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
