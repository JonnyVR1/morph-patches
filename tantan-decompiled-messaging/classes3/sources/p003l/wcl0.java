package p003l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@RequiresApi(18)
public class wcl0 implements ycl0 {

    /* JADX INFO: renamed from: a */
    public final ViewOverlay f8533a;

    public wcl0(@NonNull View view) {
        this.f8533a = view.getOverlay();
    }

    @Override // p003l.ycl0
    /* JADX INFO: renamed from: a */
    public void mo8546a(@NonNull Drawable drawable) {
        this.f8533a.remove(drawable);
    }

    @Override // p003l.ycl0
    /* JADX INFO: renamed from: b */
    public void mo8547b(@NonNull Drawable drawable) {
        this.f8533a.add(drawable);
    }
}
