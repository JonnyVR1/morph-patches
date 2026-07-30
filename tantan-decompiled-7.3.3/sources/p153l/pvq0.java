package p153l;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class pvq0 implements Runnable {

    /* JADX INFO: renamed from: a */
    private String f154316a;

    /* JADX INFO: renamed from: b */
    private WeakReference<Context> f154317b;

    public pvq0(String str, WeakReference<Context> weakReference) {
        this.f154316a = str;
        this.f154317b = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        WeakReference<Context> weakReference = this.f154317b;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        if (qwq0.m178535a(this.f154316a) <= ovq0.f149297b) {
            ouq0.m169403w("=====> do not need clean db");
            return;
        }
        svq0 svq0VarM188223i = svq0.m188223i(this.f154316a);
        rvq0 rvq0VarM183305l = rvq0.m183305l(this.f154316a);
        svq0VarM188223i.m203034g(rvq0VarM183305l);
        rvq0VarM183305l.m203034g(qvq0.m178374j(context, this.f154316a, 1000));
        vvq0.m203026c(context).m203029e(svq0VarM188223i);
    }
}
