package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class v1l0 extends Resources {

    /* JADX INFO: renamed from: b */
    public static boolean f181986b = false;

    /* JADX INFO: renamed from: a */
    public final WeakReference<Context> f181987a;

    public v1l0(@NonNull Context context, @NonNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f181987a = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m199018a() {
        return f181986b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m199019b() {
        m199018a();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m199020c(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.f181987a.get();
        return context != null ? v4d0.m199665g().m199682s(context, this, i) : super.getDrawable(i);
    }
}
