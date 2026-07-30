package com.vivo.push;

import android.content.Context;
import com.vivo.push.p111b.C14548n;
import com.vivo.push.util.C14647p;
import p149l.ig3;

/* JADX INFO: renamed from: com.vivo.push.l */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC14616l implements Runnable {

    /* JADX INFO: renamed from: a */
    protected Context f61052a;

    /* JADX INFO: renamed from: b */
    private int f61053b;

    /* JADX INFO: renamed from: c */
    private AbstractC14621o f61054c;

    public AbstractRunnableC14616l(AbstractC14621o abstractC14621o) {
        this.f61053b = -1;
        this.f61054c = abstractC14621o;
        int iM84933b = abstractC14621o.m84933b();
        this.f61053b = iM84933b;
        if (iM84933b >= 0) {
            this.f61052a = C14608e.m84861a().m84898h();
        } else {
            ig3.m135964a("PushTask need a > 0 task id.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m84912a() {
        return this.f61053b;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo84815a(AbstractC14621o abstractC14621o);

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f61052a;
        if (context != null && !(this.f61054c instanceof C14548n)) {
            C14647p.m85012a(context, "[执行指令]" + this.f61054c);
        }
        mo84815a(this.f61054c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        AbstractC14621o abstractC14621o = this.f61054c;
        sb.append(abstractC14621o == null ? "[null]" : abstractC14621o.toString());
        sb.append("}");
        return sb.toString();
    }
}
