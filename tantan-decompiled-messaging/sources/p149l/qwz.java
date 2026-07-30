package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class qwz extends yq2 {

    /* JADX INFO: renamed from: c */
    public long f156797c;

    /* JADX INFO: renamed from: d */
    public String f156798d;

    /* JADX INFO: renamed from: e */
    public String f156799e;

    @Override // p149l.yq2
    /* JADX INFO: renamed from: e */
    public void mo144561e(boolean z) {
        if (z) {
            return;
        }
        this.f156797c = mqi0.m155944o();
        this.f156798d = this.f156799e;
    }

    @Override // p149l.yq2
    /* JADX INFO: renamed from: f */
    public boolean mo144562f(String str, @Nullable sy4.C20071a c20071a) {
        this.f156799e = str;
        long jM155944o = mqi0.m155944o();
        if (jM155944o - this.f156797c < ypv.m215672k().m195903o4() * 1000) {
            return str.equals(this.f156798d);
        }
        return false;
    }
}
