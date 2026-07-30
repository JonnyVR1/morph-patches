package p149l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(18)
public class wcl0 implements ycl0 {

    /* JADX INFO: renamed from: a */
    public final ViewOverlay f185697a;

    public wcl0(@NonNull View view) {
        this.f185697a = view.getOverlay();
    }

    @Override // p149l.ycl0
    /* JADX INFO: renamed from: a */
    public void mo202666a(@NonNull Drawable drawable) {
        this.f185697a.remove(drawable);
    }

    @Override // p149l.ycl0
    /* JADX INFO: renamed from: b */
    public void mo202667b(@NonNull Drawable drawable) {
        this.f185697a.add(drawable);
    }
}
