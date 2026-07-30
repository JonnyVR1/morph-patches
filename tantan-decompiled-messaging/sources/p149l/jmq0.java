package p149l;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class jmq0 implements Runnable {

    /* JADX INFO: renamed from: a */
    private String f118698a;

    /* JADX INFO: renamed from: b */
    private WeakReference<Context> f118699b;

    public jmq0(String str, WeakReference<Context> weakReference) {
        this.f118698a = str;
        this.f118699b = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        WeakReference<Context> weakReference = this.f118699b;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        if (knq0.m146588a(this.f118698a) <= imq0.f113955b) {
            ilq0.m137050w("=====> do not need clean db");
            return;
        }
        mmq0 mmq0VarM155484i = mmq0.m155484i(this.f118698a);
        lmq0 lmq0VarM150596l = lmq0.m150596l(this.f118698a);
        mmq0VarM155484i.m170372g(lmq0VarM150596l);
        lmq0VarM150596l.m170372g(kmq0.m146551j(context, this.f118698a, 1000));
        pmq0.m170364c(context).m170367e(mmq0VarM155484i);
    }
}
