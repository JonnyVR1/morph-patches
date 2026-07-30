package p149l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dsg0 extends mpg0 {

    /* JADX INFO: renamed from: a */
    public final Context f87766a;

    public dsg0(Context context) {
        this.f87766a = context;
    }

    @Override // p149l.mpg0
    /* JADX INFO: renamed from: b */
    public final s9g0 mo113471b(dpg0 dpg0Var, int i) throws FileNotFoundException {
        Resources resourcesForApplication;
        int identifier;
        Context context = this.f87766a;
        StringBuilder sb = slq0.f165256a;
        dpg0Var.getClass();
        Uri uri = dpg0Var.f87271a;
        if (uri == null) {
            resourcesForApplication = context.getResources();
        } else {
            String authority = uri.getAuthority();
            if (authority == null) {
                bsg0.m103716a("No package provided: ", dpg0Var.f87271a);
                return null;
            }
            try {
                resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                bsg0.m103716a("Unable to obtain resources for package: ", dpg0Var.f87271a);
                return null;
            }
        }
        Uri uri2 = dpg0Var.f87271a;
        if (uri2 == null) {
            identifier = 0;
        } else {
            String authority2 = uri2.getAuthority();
            Uri uri3 = dpg0Var.f87271a;
            if (authority2 == null) {
                csg0.m108511a("No package provided: ", uri3);
                return null;
            }
            List<String> pathSegments = uri3.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                bsg0.m103716a("No path segments: ", dpg0Var.f87271a);
                return null;
            }
            if (pathSegments.size() == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused2) {
                    bsg0.m103716a("Last path segment is not a resource ID: ", dpg0Var.f87271a);
                    return null;
                }
            } else {
                if (pathSegments.size() != 2) {
                    bsg0.m103716a("More than two path segments: ", dpg0Var.f87271a);
                    return null;
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
            }
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resourcesForApplication, identifier, null);
        if (bitmapDecodeResource != null) {
            return new s9g0(bitmapDecodeResource, null, 2, 0);
        }
        jfd0.m141176a("bitmap == null");
        return null;
    }

    @Override // p149l.mpg0
    /* JADX INFO: renamed from: d */
    public final boolean mo113472d(dpg0 dpg0Var) {
        return "android.resource".equals(dpg0Var.f87271a.getScheme());
    }
}
