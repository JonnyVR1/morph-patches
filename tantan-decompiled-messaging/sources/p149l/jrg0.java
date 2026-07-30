package p149l;

import tech.sud.gip.core.ISudListenerGetMGList;

/* JADX INFO: loaded from: classes3.dex */
public final class jrg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f119406a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f119407b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f119408c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ c7g0 f119409d;

    public jrg0(c7g0 c7g0Var, int i, String str, String str2) {
        this.f119409d = c7g0Var;
        this.f119406a = i;
        this.f119407b = str;
        this.f119408c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ISudListenerGetMGList iSudListenerGetMGList = this.f119409d.f79615b;
        if (iSudListenerGetMGList != null) {
            int i = this.f119406a;
            if (i == 0) {
                iSudListenerGetMGList.onSuccess(this.f119407b);
            } else {
                iSudListenerGetMGList.onFailure(i, this.f119408c);
            }
        }
    }
}
