package p153l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l0h0 extends uxg0 {

    /* JADX INFO: renamed from: a */
    public final Context f129565a;

    public l0h0(Context context) {
        this.f129565a = context;
    }

    @Override // p153l.uxg0
    /* JADX INFO: renamed from: b */
    public final aig0 mo118414b(lxg0 lxg0Var, int i) throws FileNotFoundException {
        Resources resourcesForApplication;
        int identifier;
        Context context = this.f129565a;
        StringBuilder sb = yuq0.f201657a;
        lxg0Var.getClass();
        Uri uri = lxg0Var.f133955a;
        if (uri == null) {
            resourcesForApplication = context.getResources();
        } else {
            String authority = uri.getAuthority();
            if (authority == null) {
                j0h0.m142977a("No package provided: ", lxg0Var.f133955a);
                return null;
            }
            try {
                resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                j0h0.m142977a("Unable to obtain resources for package: ", lxg0Var.f133955a);
                return null;
            }
        }
        Uri uri2 = lxg0Var.f133955a;
        if (uri2 == null) {
            identifier = 0;
        } else {
            String authority2 = uri2.getAuthority();
            Uri uri3 = lxg0Var.f133955a;
            if (authority2 == null) {
                k0h0.m147792a("No package provided: ", uri3);
                return null;
            }
            List<String> pathSegments = uri3.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                j0h0.m142977a("No path segments: ", lxg0Var.f133955a);
                return null;
            }
            if (pathSegments.size() == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused2) {
                    j0h0.m142977a("Last path segment is not a resource ID: ", lxg0Var.f133955a);
                    return null;
                }
            } else {
                if (pathSegments.size() != 2) {
                    j0h0.m142977a("More than two path segments: ", lxg0Var.f133955a);
                    return null;
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
            }
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resourcesForApplication, identifier, null);
        if (bitmapDecodeResource != null) {
            return new aig0(bitmapDecodeResource, null, 2, 0);
        }
        mnd0.m159157a("bitmap == null");
        return null;
    }

    @Override // p153l.uxg0
    /* JADX INFO: renamed from: d */
    public final boolean mo118415d(lxg0 lxg0Var) {
        return "android.resource".equals(lxg0Var.f133955a.getScheme());
    }
}
