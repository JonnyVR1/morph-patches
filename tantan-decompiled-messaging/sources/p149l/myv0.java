package p149l;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzavj;
import com.meituan.robust.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class myv0 {

    /* JADX INFO: renamed from: a */
    public final ptr0 f136334a;

    @VisibleForTesting
    public myv0(ptr0 ptr0Var) {
        this.f136334a = ptr0Var;
    }

    /* JADX INFO: renamed from: b */
    public static final Uri m157091b(Uri uri, String str) throws zzavj {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null && path.contains(Constants.PACKNAME_END)) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new zzavj("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i = iIndexOf + 1;
                            StringBuilder sb = new StringBuilder(string.substring(0, i));
                            sb.append("dc_ms=");
                            sb.append(str);
                            sb.append(Constants.PACKNAME_END);
                            sb.append((CharSequence) string, i, string.length());
                            return Uri.parse(sb.toString());
                        }
                        String encodedPath = uri.getEncodedPath();
                        if (encodedPath == null) {
                            throw new UnsupportedOperationException();
                        }
                        int iIndexOf2 = string.indexOf(encodedPath);
                        StringBuilder sb2 = new StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                        sb2.append(";dc_ms=");
                        sb2.append(str);
                        sb2.append(Constants.PACKNAME_END);
                        sb2.append((CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                        return Uri.parse(sb2.toString());
                    }
                } catch (UnsupportedOperationException unused) {
                    throw new zzavj("Provided Uri is not in a valid state");
                }
            } catch (NullPointerException unused2) {
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new zzavj("Query parameter already exists: ms");
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i2 = iIndexOf3 + 1;
        StringBuilder sb3 = new StringBuilder(string2.substring(0, i2));
        sb3.append("ms=");
        sb3.append(str);
        sb3.append("&");
        sb3.append((CharSequence) string2, i2, string2.length());
        return Uri.parse(sb3.toString());
    }

    /* JADX INFO: renamed from: a */
    public final Uri m157092a(Uri uri, Context context, View view, @Nullable Activity activity) throws zzavj {
        try {
            return m157091b(uri, this.f136334a.m171378c().mo136910g(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzavj("Provided Uri is not in a valid state");
        }
    }
}
