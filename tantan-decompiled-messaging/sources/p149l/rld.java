package p149l;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class rld implements dx3 {

    /* JADX INFO: renamed from: a */
    public static rld f159959a;

    /* JADX INFO: renamed from: f */
    public static synchronized rld m179780f() {
        try {
            if (f159959a == null) {
                f159959a = new rld();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f159959a;
    }

    @Override // p149l.dx3
    /* JADX INFO: renamed from: a */
    public cx3 mo113967a(ImageRequest imageRequest, Object obj) {
        cx3 cx3Var;
        String name;
        yd80 yd80VarM8575m = imageRequest.m8575m();
        if (yd80VarM8575m != null) {
            cx3 cx3VarMo102087a = yd80VarM8575m.mo102087a();
            name = yd80VarM8575m.getClass().getName();
            cx3Var = cx3VarMo102087a;
        } else {
            cx3Var = null;
            name = null;
        }
        y13 y13Var = new y13(mo102380e(imageRequest.m8585w()).toString(), imageRequest.m8581s(), imageRequest.m8583u(), imageRequest.m8571i(), cx3Var, name);
        y13Var.m212129d(obj);
        return y13Var;
    }

    @Override // p149l.dx3
    /* JADX INFO: renamed from: b */
    public cx3 mo113968b(ImageRequest imageRequest, Object obj) {
        return mo113970d(imageRequest, imageRequest.m8585w(), obj);
    }

    @Override // p149l.dx3
    /* JADX INFO: renamed from: c */
    public cx3 mo113969c(ImageRequest imageRequest, Object obj) {
        y13 y13Var = new y13(mo102380e(imageRequest.m8585w()).toString(), imageRequest.m8581s(), imageRequest.m8583u(), imageRequest.m8571i(), null, null);
        y13Var.m212129d(obj);
        return y13Var;
    }

    @Override // p149l.dx3
    /* JADX INFO: renamed from: d */
    public cx3 mo113970d(ImageRequest imageRequest, Uri uri, Object obj) {
        return new lgf0(mo102380e(uri).toString());
    }

    /* JADX INFO: renamed from: e */
    public Uri mo102380e(Uri uri) {
        return uri;
    }
}
