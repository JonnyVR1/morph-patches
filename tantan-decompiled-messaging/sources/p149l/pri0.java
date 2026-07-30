package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class pri0 extends cxc0 {

    /* JADX INFO: renamed from: b */
    public final WeakReference<Context> f150912b;

    public pri0(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.f150912b = new WeakReference<>(context);
    }

    @Override // p149l.cxc0, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f150912b.get();
        if (drawable != null && context != null) {
            swc0.m186132g().m186152w(context, i, drawable);
        }
        return drawable;
    }
}
