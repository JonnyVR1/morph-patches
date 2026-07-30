package p007l;

import android.graphics.ColorFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.p005ui.UIModeHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class tj40 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0717a f4433a;

    /* JADX INFO: renamed from: b */
    public boolean f4434b = false;

    /* JADX INFO: renamed from: c */
    public ColorFilter f4435c;

    /* JADX INFO: renamed from: l.tj40$a */
    public interface InterfaceC0717a {
        /* JADX INFO: renamed from: c */
        void m11174c(@Nullable ColorFilter colorFilter);
    }

    public tj40(@NonNull InterfaceC0717a interfaceC0717a) {
        this.f4433a = interfaceC0717a;
    }

    /* JADX INFO: renamed from: a */
    public void m11172a(@Nullable ColorFilter colorFilter) {
        this.f4435c = colorFilter;
        if (!this.f4434b) {
            this.f4433a.m11174c(colorFilter);
            return;
        }
        boolean zM1089b = UIModeHelper.m1089b();
        InterfaceC0717a interfaceC0717a = this.f4433a;
        if (zM1089b) {
            interfaceC0717a.m11174c(UIModeHelper.f1354b);
        } else {
            interfaceC0717a.m11174c(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m11173b(boolean z) {
        this.f4434b = z;
        m11172a(this.f4435c);
    }
}
