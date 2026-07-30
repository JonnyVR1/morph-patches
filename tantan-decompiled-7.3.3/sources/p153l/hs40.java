package p153l;

import android.graphics.ColorFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.p053ui.UIModeHelper;

/* JADX INFO: loaded from: classes8.dex */
public class hs40 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17567a f111408a;

    /* JADX INFO: renamed from: b */
    public boolean f111409b = false;

    /* JADX INFO: renamed from: c */
    public ColorFilter f111410c;

    /* JADX INFO: renamed from: l.hs40$a */
    public interface InterfaceC17567a {
        /* JADX INFO: renamed from: c */
        void mo136951c(@Nullable ColorFilter colorFilter);
    }

    public hs40(@NonNull InterfaceC17567a interfaceC17567a) {
        this.f111408a = interfaceC17567a;
    }

    /* JADX INFO: renamed from: a */
    public void m136949a(@Nullable ColorFilter colorFilter) {
        this.f111410c = colorFilter;
        if (!this.f111409b) {
            this.f111408a.mo136951c(colorFilter);
            return;
        }
        boolean zM21817b = UIModeHelper.m21817b();
        InterfaceC17567a interfaceC17567a = this.f111408a;
        if (zM21817b) {
            interfaceC17567a.mo136951c(UIModeHelper.f16374b);
        } else {
            interfaceC17567a.mo136951c(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m136950b(boolean z) {
        this.f111409b = z;
        m136949a(this.f111410c);
    }
}
