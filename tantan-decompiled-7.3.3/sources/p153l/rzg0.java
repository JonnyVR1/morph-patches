package p153l;

import tech.sud.gip.core.ISudListenerGetMGList;

/* JADX INFO: loaded from: classes3.dex */
public final class rzg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f165527a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f165528b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f165529c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kfg0 f165530d;

    public rzg0(kfg0 kfg0Var, int i, String str, String str2) {
        this.f165530d = kfg0Var;
        this.f165527a = i;
        this.f165528b = str;
        this.f165529c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ISudListenerGetMGList iSudListenerGetMGList = this.f165530d.f126394b;
        if (iSudListenerGetMGList != null) {
            int i = this.f165527a;
            if (i == 0) {
                iSudListenerGetMGList.onSuccess(this.f165528b);
            } else {
                iSudListenerGetMGList.onFailure(i, this.f165529c);
            }
        }
    }
}
