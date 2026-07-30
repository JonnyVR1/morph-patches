package p153l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(18)
public class bml0 implements dml0 {

    /* JADX INFO: renamed from: a */
    public final ViewOverlay f77352a;

    public bml0(@NonNull View view) {
        this.f77352a = view.getOverlay();
    }

    @Override // p153l.dml0
    /* JADX INFO: renamed from: a */
    public void mo98689a(@NonNull Drawable drawable) {
        this.f77352a.remove(drawable);
    }

    @Override // p153l.dml0
    /* JADX INFO: renamed from: b */
    public void mo98690b(@NonNull Drawable drawable) {
        this.f77352a.add(drawable);
    }
}
