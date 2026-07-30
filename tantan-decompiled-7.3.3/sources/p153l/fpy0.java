package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class fpy0 {

    /* JADX INFO: renamed from: d */
    public static final fpy0 f100230d = new bpy0().m105868d();

    /* JADX INFO: renamed from: a */
    public final boolean f100231a;

    /* JADX INFO: renamed from: b */
    public final boolean f100232b;

    /* JADX INFO: renamed from: c */
    public final boolean f100233c;

    public /* synthetic */ fpy0(bpy0 bpy0Var, dpy0 dpy0Var) {
        this.f100231a = bpy0Var.f77838a;
        this.f100232b = bpy0Var.f77839b;
        this.f100233c = bpy0Var.f77840c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fpy0.class == obj.getClass()) {
            fpy0 fpy0Var = (fpy0) obj;
            if (this.f100231a == fpy0Var.f100231a && this.f100232b == fpy0Var.f100232b && this.f100233c == fpy0Var.f100233c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.f100231a;
        boolean z2 = this.f100232b;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.f100233c ? 1 : 0);
    }
}
