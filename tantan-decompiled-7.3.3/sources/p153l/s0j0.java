package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class s0j0 extends g5d0 {

    /* JADX INFO: renamed from: b */
    public final WeakReference<Context> f165708b;

    public s0j0(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.f165708b = new WeakReference<>(context);
    }

    @Override // p153l.g5d0, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f165708b.get();
        if (drawable != null && context != null) {
            v4d0.m199665g().m199685w(context, i, drawable);
        }
        return drawable;
    }
}
