package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class psk0 extends Resources {

    /* JADX INFO: renamed from: b */
    public static boolean f151017b = false;

    /* JADX INFO: renamed from: a */
    public final WeakReference<Context> f151018a;

    public psk0(@NonNull Context context, @NonNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f151018a = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m171178a() {
        return f151017b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m171179b() {
        m171178a();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m171180c(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.f151018a.get();
        return context != null ? swc0.m186132g().m186149s(context, this, i) : super.getDrawable(i);
    }
}
