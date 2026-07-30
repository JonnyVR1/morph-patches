package com.vivo.push.p118d;

import com.vivo.push.AbstractC14769o;
import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.C14756e;
import com.vivo.push.model.C14767b;
import com.vivo.push.p115a.C14681a;
import com.vivo.push.p116b.C14685c;
import com.vivo.push.p116b.C14687e;
import com.vivo.push.util.C14798s;
import com.vivo.push.util.C14799t;

/* JADX INFO: renamed from: com.vivo.push.d.ai */
/* JADX INFO: loaded from: classes2.dex */
final class C14730ai extends AbstractRunnableC14764l {
    public C14730ai(AbstractC14769o abstractC14769o) {
        super(abstractC14769o);
    }

    @Override // com.vivo.push.AbstractRunnableC14764l
    /* JADX INFO: renamed from: a */
    public final void mo85986a(AbstractC14769o abstractC14769o) {
        C14685c c14685c = (C14685c) abstractC14769o;
        C14767b c14767bM86199a = C14799t.m86199a(this.f61899a);
        if (c14767bM86199a == null) {
            C14756e.m86032a().m86052a(c14685c.m85923h(), 1005, new Object[0]);
            return;
        }
        String strM86090a = c14767bM86199a.m86090a();
        if (c14767bM86199a.m86097c()) {
            C14756e.m86032a().m86052a(c14685c.m85923h(), 1004, new Object[0]);
            abstractC14769o = new C14687e();
        } else {
            int iM86198a = C14798s.m86198a(c14685c);
            if (iM86198a != 0) {
                C14756e.m86032a().m86052a(c14685c.m85923h(), iM86198a, new Object[0]);
                return;
            }
        }
        C14681a.m85900a(this.f61899a, strM86090a, abstractC14769o);
    }
}
