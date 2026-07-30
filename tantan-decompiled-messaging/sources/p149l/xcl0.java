package p149l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(18)
public class xcl0 implements zcl0 {

    /* JADX INFO: renamed from: a */
    public final ViewOverlay f192242a;

    public xcl0(@NonNull View view) {
        this.f192242a = view.getOverlay();
    }

    @Override // p149l.zcl0
    /* JADX INFO: renamed from: a */
    public void mo202576a(@NonNull Drawable drawable) {
        this.f192242a.remove(drawable);
    }

    @Override // p149l.zcl0
    /* JADX INFO: renamed from: b */
    public void mo202577b(@NonNull Drawable drawable) {
        this.f192242a.add(drawable);
    }
}
