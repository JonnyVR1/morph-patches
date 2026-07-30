package p153l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(18)
public class aml0 implements cml0 {

    /* JADX INFO: renamed from: a */
    public final ViewOverlay f72231a;

    public aml0(@NonNull View view) {
        this.f72231a = view.getOverlay();
    }

    @Override // p153l.cml0
    /* JADX INFO: renamed from: a */
    public void mo98850a(@NonNull Drawable drawable) {
        this.f72231a.remove(drawable);
    }

    @Override // p153l.cml0
    /* JADX INFO: renamed from: b */
    public void mo98851b(@NonNull Drawable drawable) {
        this.f72231a.add(drawable);
    }
}
