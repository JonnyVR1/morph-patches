package p003l;

import tech.sud.gip.core.ISudListenerGetMGList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class jrg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4715a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f4716b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f4717c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ c7g0 f4718d;

    public jrg0(c7g0 c7g0Var, int i, String str, String str2) {
        this.f4718d = c7g0Var;
        this.f4715a = i;
        this.f4716b = str;
        this.f4717c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ISudListenerGetMGList iSudListenerGetMGList = this.f4718d.f2583b;
        if (iSudListenerGetMGList != null) {
            int i = this.f4715a;
            if (i == 0) {
                iSudListenerGetMGList.onSuccess(this.f4716b);
            } else {
                iSudListenerGetMGList.onFailure(i, this.f4717c);
            }
        }
    }
}
