package p149l;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzavj;
import com.meituan.robust.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class ptr0 {

    /* JADX INFO: renamed from: d */
    public static final String[] f151207d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* JADX INFO: renamed from: a */
    public final String f151208a = "ad.doubleclick.net";

    /* JADX INFO: renamed from: b */
    public final String[] f151209b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* JADX INFO: renamed from: c */
    public final ltr0 f151210c;

    @Deprecated
    public ptr0(ltr0 ltr0Var) {
        this.f151210c = ltr0Var;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public final Uri m171376a(Uri uri, Context context, View view, Activity activity) throws zzavj {
        try {
            return m171382g(uri, this.f151210c.mo136910g(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzavj("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public final Uri m171377b(Uri uri, Context context) throws zzavj {
        return m171382g(uri, this.f151210c.mo136904a(context));
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public final ltr0 m171378c() {
        return this.f151210c;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public final void m171379d(MotionEvent motionEvent) {
        this.f151210c.mo136909f(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m171380e(Uri uri) {
        if (m171381f(uri)) {
            String[] strArr = f151207d;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m171381f(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f151209b;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final Uri m171382g(Uri uri, String str) throws zzavj {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.f151208a) && uri.getPath().contains(Constants.PACKNAME_END)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new zzavj("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i = iIndexOf + 1;
                        return Uri.parse(string.substring(0, i) + "dc_ms=" + str + Constants.PACKNAME_END + string.substring(i));
                    }
                    String encodedPath = uri.getEncodedPath();
                    int iIndexOf2 = string.indexOf(encodedPath);
                    return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + Constants.PACKNAME_END + string.substring(iIndexOf2 + encodedPath.length()));
                }
            } catch (NullPointerException unused) {
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
            return Uri.parse(string2.substring(0, i2) + "ms=" + str + "&" + string2.substring(i2));
        } catch (UnsupportedOperationException unused2) {
            throw new zzavj("Provided Uri is not in a valid state");
        }
    }
}
