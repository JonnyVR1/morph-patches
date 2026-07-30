package p149l;

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
public class yvc0 implements wvc0<Uri, Drawable> {

    /* JADX INFO: renamed from: a */
    private final Context f200247a;

    public yvc0(Context context) {
        this.f200247a = context.getApplicationContext();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    private Context m216195d(Uri uri, String str) {
        boolean zEquals = str.equals(this.f200247a.getPackageName());
        Context context = this.f200247a;
        if (zEquals) {
            return context;
        }
        try {
            return context.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f200247a.getPackageName())) {
                return this.f200247a;
            }
            zya0.m220910a("Failed to obtain context or unrecognized Uri format for: ", uri, e);
            return null;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: e */
    private int m216196e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            zya0.m220910a("Unrecognized Uri format: ", uri, e);
            return 0;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: f */
    private int m216197f(Context context, Uri uri) {
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
        qhg0.m174539a("Failed to find resource id for: ", uri);
        return 0;
    }

    @DrawableRes
    /* JADX INFO: renamed from: g */
    private int m216198g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m216197f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m216196e(uri);
        }
        qhg0.m174539a("Unrecognized Uri format: ", uri);
        return 0;
    }

    @Override // p149l.wvc0
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public rvc0<Drawable> mo5553b(@NonNull Uri uri, int i, int i2, @NonNull px50 px50Var) {
        Context contextM216195d = m216195d(uri, uri.getAuthority());
        return rl40.m179779b(lbe.m149219b(this.f200247a, contextM216195d, m216198g(contextM216195d, uri)));
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo5552a(@NonNull Uri uri, @NonNull px50 px50Var) {
        return uri.getScheme().equals("android.resource");
    }
}
