package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gih0 {

    /* JADX INFO: renamed from: a */
    public final View f102901a;

    /* JADX INFO: renamed from: b */
    public boolean f102902b = false;

    /* JADX INFO: renamed from: c */
    public boolean f102903c = true;

    public gih0(View view) {
        this.f102901a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m126289a(boolean z) {
        boolean z2 = this.f102901a.getHeight() > 0 && z;
        if (this.f102902b && this.f102901a.isPressed() && !this.f102901a.isEnabled() && this.f102903c) {
            mo121513d(false, z2);
        } else if (this.f102901a.isPressed() != this.f102902b) {
            if (this.f102901a.isEnabled()) {
                mo121514e(this.f102901a.isPressed());
            }
        } else if (this.f102903c != this.f102901a.isEnabled()) {
            mo121513d(true, z2);
        }
        this.f102903c = this.f102901a.isEnabled();
        this.f102902b = this.f102901a.isPressed();
    }

    /* JADX INFO: renamed from: b */
    public void m126290b() {
        m126289a(true);
    }

    /* JADX INFO: renamed from: c */
    public void m126291c() {
        m126289a(true);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo121513d(boolean z, boolean z2);

    /* JADX INFO: renamed from: e */
    public abstract void mo121514e(boolean z);

    /* JADX INFO: renamed from: f */
    public void m126292f() {
        m126289a(false);
    }
}
