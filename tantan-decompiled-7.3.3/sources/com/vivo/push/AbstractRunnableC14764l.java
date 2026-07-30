package com.vivo.push;

import android.content.Context;
import com.vivo.push.p116b.C14696n;
import com.vivo.push.util.C14795p;
import p153l.wg3;

/* JADX INFO: renamed from: com.vivo.push.l */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC14764l implements Runnable {

    /* JADX INFO: renamed from: a */
    protected Context f61899a;

    /* JADX INFO: renamed from: b */
    private int f61900b;

    /* JADX INFO: renamed from: c */
    private AbstractC14769o f61901c;

    public AbstractRunnableC14764l(AbstractC14769o abstractC14769o) {
        this.f61900b = -1;
        this.f61901c = abstractC14769o;
        int iM86104b = abstractC14769o.m86104b();
        this.f61900b = iM86104b;
        if (iM86104b >= 0) {
            this.f61899a = C14756e.m86032a().m86069h();
        } else {
            wg3.m206174a("PushTask need a > 0 task id.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m86083a() {
        return this.f61900b;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo85986a(AbstractC14769o abstractC14769o);

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f61899a;
        if (context != null && !(this.f61901c instanceof C14696n)) {
            C14795p.m86183a(context, "[执行指令]" + this.f61901c);
        }
        mo85986a(this.f61901c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        AbstractC14769o abstractC14769o = this.f61901c;
        sb.append(abstractC14769o == null ? "[null]" : abstractC14769o.toString());
        sb.append("}");
        return sb.toString();
    }
}
