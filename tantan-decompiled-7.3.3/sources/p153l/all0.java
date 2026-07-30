package p153l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(18)
public class all0 implements bll0 {

    /* JADX INFO: renamed from: a */
    public final ViewGroupOverlay f72134a;

    public all0(@NonNull ViewGroup viewGroup) {
        this.f72134a = viewGroup.getOverlay();
    }

    @Override // p153l.dml0
    /* JADX INFO: renamed from: a */
    public void mo98689a(@NonNull Drawable drawable) {
        this.f72134a.remove(drawable);
    }

    @Override // p153l.dml0
    /* JADX INFO: renamed from: b */
    public void mo98690b(@NonNull Drawable drawable) {
        this.f72134a.add(drawable);
    }

    @Override // p153l.bll0
    /* JADX INFO: renamed from: c */
    public void mo98691c(@NonNull View view) {
        this.f72134a.add(view);
    }

    @Override // p153l.bll0
    /* JADX INFO: renamed from: d */
    public void mo98692d(@NonNull View view) {
        this.f72134a.remove(view);
    }
}
