package p149l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(18)
public class wbl0 implements xbl0 {

    /* JADX INFO: renamed from: a */
    public final ViewGroupOverlay f185602a;

    public wbl0(@NonNull ViewGroup viewGroup) {
        this.f185602a = viewGroup.getOverlay();
    }

    @Override // p149l.zcl0
    /* JADX INFO: renamed from: a */
    public void mo202576a(@NonNull Drawable drawable) {
        this.f185602a.remove(drawable);
    }

    @Override // p149l.zcl0
    /* JADX INFO: renamed from: b */
    public void mo202577b(@NonNull Drawable drawable) {
        this.f185602a.add(drawable);
    }

    @Override // p149l.xbl0
    /* JADX INFO: renamed from: c */
    public void mo202578c(@NonNull View view) {
        this.f185602a.add(view);
    }

    @Override // p149l.xbl0
    /* JADX INFO: renamed from: d */
    public void mo202579d(@NonNull View view) {
        this.f185602a.remove(view);
    }
}
