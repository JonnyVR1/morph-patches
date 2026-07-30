package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nqh0 {

    /* JADX INFO: renamed from: a */
    public final View f143230a;

    /* JADX INFO: renamed from: b */
    public boolean f143231b = false;

    /* JADX INFO: renamed from: c */
    public boolean f143232c = true;

    public nqh0(View view) {
        this.f143230a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m164308a(boolean z) {
        boolean z2 = this.f143230a.getHeight() > 0 && z;
        if (this.f143231b && this.f143230a.isPressed() && !this.f143230a.isEnabled() && this.f143232c) {
            mo159508d(false, z2);
        } else if (this.f143230a.isPressed() != this.f143231b) {
            if (this.f143230a.isEnabled()) {
                mo159509e(this.f143230a.isPressed());
            }
        } else if (this.f143232c != this.f143230a.isEnabled()) {
            mo159508d(true, z2);
        }
        this.f143232c = this.f143230a.isEnabled();
        this.f143231b = this.f143230a.isPressed();
    }

    /* JADX INFO: renamed from: b */
    public void m164309b() {
        m164308a(true);
    }

    /* JADX INFO: renamed from: c */
    public void m164310c() {
        m164308a(true);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo159508d(boolean z, boolean z2);

    /* JADX INFO: renamed from: e */
    public abstract void mo159509e(boolean z);

    /* JADX INFO: renamed from: f */
    public void m164311f() {
        m164308a(false);
    }
}
