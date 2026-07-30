package p003l;

import android.view.View;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class gih0 {

    /* JADX INFO: renamed from: a */
    public final View f3895a;

    /* JADX INFO: renamed from: b */
    public boolean f3896b = false;

    /* JADX INFO: renamed from: c */
    public boolean f3897c = true;

    public gih0(View view) {
        this.f3895a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m4549a(boolean z) {
        boolean z2 = this.f3895a.getHeight() > 0 && z;
        if (this.f3896b && this.f3895a.isPressed() && !this.f3895a.isEnabled() && this.f3897c) {
            mo4378d(false, z2);
        } else if (this.f3895a.isPressed() != this.f3896b) {
            if (this.f3895a.isEnabled()) {
                mo4379e(this.f3895a.isPressed());
            }
        } else if (this.f3897c != this.f3895a.isEnabled()) {
            mo4378d(true, z2);
        }
        this.f3897c = this.f3895a.isEnabled();
        this.f3896b = this.f3895a.isPressed();
    }

    /* JADX INFO: renamed from: b */
    public void m4550b() {
        m4549a(true);
    }

    /* JADX INFO: renamed from: c */
    public void m4551c() {
        m4549a(true);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo4378d(boolean z, boolean z2);

    /* JADX INFO: renamed from: e */
    public abstract void mo4379e(boolean z);

    /* JADX INFO: renamed from: f */
    public void m4552f() {
        m4549a(false);
    }
}
