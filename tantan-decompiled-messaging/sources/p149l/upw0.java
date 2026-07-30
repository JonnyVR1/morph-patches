package p149l;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class upw0 {

    /* JADX INFO: renamed from: a */
    public static final Uri f177680a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b */
    public static final Uri f177681b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c */
    public static final Pattern f177682c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d */
    public static final Pattern f177683d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
}
