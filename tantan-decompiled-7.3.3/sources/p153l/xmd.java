package p153l;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class xmd implements cy3 {

    /* JADX INFO: renamed from: a */
    public static xmd f195065a;

    /* JADX INFO: renamed from: f */
    public static synchronized xmd m211716f() {
        try {
            if (f195065a == null) {
                f195065a = new xmd();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f195065a;
    }

    @Override // p153l.cy3
    /* JADX INFO: renamed from: a */
    public by3 mo113092a(ImageRequest imageRequest, Object obj) {
        by3 by3Var;
        String name;
        fm80 fm80VarM8629m = imageRequest.m8629m();
        if (fm80VarM8629m != null) {
            by3 by3VarMo104840a = fm80VarM8629m.mo104840a();
            name = fm80VarM8629m.getClass().getName();
            by3Var = by3VarMo104840a;
        } else {
            by3Var = null;
            name = null;
        }
        o23 o23Var = new o23(mo127163e(imageRequest.m8639w()).toString(), imageRequest.m8635s(), imageRequest.m8637u(), imageRequest.m8625i(), by3Var, name);
        o23Var.m165690d(obj);
        return o23Var;
    }

    @Override // p153l.cy3
    /* JADX INFO: renamed from: b */
    public by3 mo113093b(ImageRequest imageRequest, Object obj) {
        return mo113095d(imageRequest, imageRequest.m8639w(), obj);
    }

    @Override // p153l.cy3
    /* JADX INFO: renamed from: c */
    public by3 mo113094c(ImageRequest imageRequest, Object obj) {
        o23 o23Var = new o23(mo127163e(imageRequest.m8639w()).toString(), imageRequest.m8635s(), imageRequest.m8637u(), imageRequest.m8625i(), null, null);
        o23Var.m165690d(obj);
        return o23Var;
    }

    @Override // p153l.cy3
    /* JADX INFO: renamed from: d */
    public by3 mo113095d(ImageRequest imageRequest, Uri uri, Object obj) {
        return new sof0(mo127163e(uri).toString());
    }

    /* JADX INFO: renamed from: e */
    public Uri mo127163e(Uri uri) {
        return uri;
    }
}
