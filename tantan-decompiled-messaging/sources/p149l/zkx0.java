package p149l;

import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: classes6.dex */
public class zkx0 {

    /* JADX INFO: renamed from: a */
    public int f203579a;

    /* JADX INFO: renamed from: a */
    public final void m219209a(int i) {
        this.f203579a = i | this.f203579a;
    }

    @CallSuper
    /* JADX INFO: renamed from: b */
    public void mo160161b() {
        this.f203579a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m219210c(int i) {
        this.f203579a = i;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m219211d(int i) {
        return (this.f203579a & i) == i;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m219212e() {
        return m219211d(268435456);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m219213f() {
        return m219211d(4);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m219214g() {
        return m219211d(1);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m219215h() {
        return m219211d(536870912);
    }
}
