package p002l;

import androidx.annotation.Nullable;
import l.mqi0;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qwz extends yq2 {

    /* JADX INFO: renamed from: c */
    public long f18262c;

    /* JADX INFO: renamed from: d */
    public String f18263d;

    /* JADX INFO: renamed from: e */
    public String f18264e;

    @Override // p002l.yq2
    /* JADX INFO: renamed from: e */
    public void mo16499e(boolean z) {
        if (z) {
            return;
        }
        this.f18262c = mqi0.o();
        this.f18263d = this.f18264e;
    }

    @Override // p002l.yq2
    /* JADX INFO: renamed from: f */
    public boolean mo16500f(String str, @Nullable sy4.C0832a c0832a) {
        this.f18264e = str;
        long jO = mqi0.o();
        if (jO - this.f18262c < ypv.k().o4() * 1000) {
            return str.equals(this.f18263d);
        }
        return false;
    }
}
