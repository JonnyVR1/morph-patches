package p149l;

import android.graphics.ColorFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.p048ui.UIModeHelper;

/* JADX INFO: loaded from: classes8.dex */
public class tj40 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20186a f170646a;

    /* JADX INFO: renamed from: b */
    public boolean f170647b = false;

    /* JADX INFO: renamed from: c */
    public ColorFilter f170648c;

    /* JADX INFO: renamed from: l.tj40$a */
    public interface InterfaceC20186a {
        /* JADX INFO: renamed from: c */
        void mo189247c(@Nullable ColorFilter colorFilter);
    }

    public tj40(@NonNull InterfaceC20186a interfaceC20186a) {
        this.f170646a = interfaceC20186a;
    }

    /* JADX INFO: renamed from: a */
    public void m189245a(@Nullable ColorFilter colorFilter) {
        this.f170648c = colorFilter;
        if (!this.f170647b) {
            this.f170646a.mo189247c(colorFilter);
            return;
        }
        boolean zM20818b = UIModeHelper.m20818b();
        InterfaceC20186a interfaceC20186a = this.f170646a;
        if (zM20818b) {
            interfaceC20186a.mo189247c(UIModeHelper.f15655b);
        } else {
            interfaceC20186a.mo189247c(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m189246b(boolean z) {
        this.f170647b = z;
        m189245a(this.f170648c);
    }
}
