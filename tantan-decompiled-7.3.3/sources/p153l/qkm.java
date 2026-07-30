package p153l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final class qkm {

    /* JADX INFO: renamed from: a */
    public final Uri f158153a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f158154b;

    /* JADX INFO: renamed from: c */
    public final Integer f158155c;

    /* JADX INFO: renamed from: d */
    public boolean f158156d;

    /* JADX INFO: renamed from: e */
    public int f158157e;

    /* JADX INFO: renamed from: f */
    public int f158158f;

    /* JADX INFO: renamed from: g */
    public Rect f158159g;

    /* JADX INFO: renamed from: h */
    public boolean f158160h;

    public qkm(Uri uri) {
        String string = uri.toString();
        if (string.startsWith("file:///") && !new File(string.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(string, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                CrashHelper.m82479c(e);
            }
        }
        this.f158154b = null;
        this.f158153a = uri;
        this.f158155c = null;
        this.f158156d = true;
    }

    /* JADX INFO: renamed from: a */
    public static qkm m176953a(String str) {
        if (str != null) {
            return m176955m("file:///android_asset/".concat(str));
        }
        mnd0.m159157a("Asset name must not be null");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static qkm m176954j(int i) {
        return new qkm(i);
    }

    /* JADX INFO: renamed from: m */
    public static qkm m176955m(String str) {
        if (str == null) {
            mnd0.m159157a("Uri must not be null");
            return null;
        }
        if (!str.contains("://")) {
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            str = "file:///".concat(str);
        }
        return new qkm(Uri.parse(str));
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m176956b() {
        return this.f158154b;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m176957c() {
        return this.f158155c;
    }

    /* JADX INFO: renamed from: d */
    public final int m176958d() {
        return this.f158158f;
    }

    /* JADX INFO: renamed from: e */
    public final Rect m176959e() {
        return this.f158159g;
    }

    /* JADX INFO: renamed from: f */
    public final int m176960f() {
        return this.f158157e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m176961g() {
        return this.f158156d;
    }

    /* JADX INFO: renamed from: h */
    public final Uri m176962h() {
        return this.f158153a;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m176963i() {
        return this.f158160h;
    }

    /* JADX INFO: renamed from: k */
    public qkm m176964k(boolean z) {
        this.f158156d = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public qkm m176965l() {
        return m176964k(true);
    }

    public qkm(int i) {
        this.f158154b = null;
        this.f158153a = null;
        this.f158155c = Integer.valueOf(i);
        this.f158156d = true;
    }
}
