package p153l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b4d0 implements z3d0<Uri, Drawable> {

    /* JADX INFO: renamed from: a */
    private final Context f74893a;

    public b4d0(Context context) {
        this.f74893a = context.getApplicationContext();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    private Context m102408d(Uri uri, String str) {
        boolean zEquals = str.equals(this.f74893a.getPackageName());
        Context context = this.f74893a;
        if (zEquals) {
            return context;
        }
        try {
            return context.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f74893a.getPackageName())) {
                return this.f74893a;
            }
            d7b0.m114716a("Failed to obtain context or unrecognized Uri format for: ", uri, e);
            return null;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: e */
    private int m102409e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            d7b0.m114716a("Unrecognized Uri format: ", uri, e);
            return 0;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: f */
    private int m102410f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        ypg0.m217021a("Failed to find resource id for: ", uri);
        return 0;
    }

    @DrawableRes
    /* JADX INFO: renamed from: g */
    private int m102411g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m102410f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m102409e(uri);
        }
        ypg0.m217021a("Unrecognized Uri format: ", uri);
        return 0;
    }

    @Override // p153l.z3d0
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u3d0<Drawable> mo5554b(@NonNull Uri uri, int i, int i2, @NonNull u560 u560Var) {
        Context contextM102408d = m102408d(uri, uri.getAuthority());
        return fu40.m127434b(pce.m171644b(this.f74893a, contextM102408d, m102411g(contextM102408d, uri)));
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo5553a(@NonNull Uri uri, @NonNull u560 u560Var) {
        return uri.getScheme().equals("android.resource");
    }
}
