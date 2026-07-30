package com.vivo.push.p113d;

import com.vivo.push.AbstractC14621o;
import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.C14608e;
import com.vivo.push.model.C14619b;
import com.vivo.push.p110a.C14533a;
import com.vivo.push.p111b.C14537c;
import com.vivo.push.p111b.C14539e;
import com.vivo.push.util.C14650s;
import com.vivo.push.util.C14651t;

/* JADX INFO: renamed from: com.vivo.push.d.ai */
/* JADX INFO: loaded from: classes2.dex */
final class C14582ai extends AbstractRunnableC14616l {
    public C14582ai(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    @Override // com.vivo.push.AbstractRunnableC14616l
    /* JADX INFO: renamed from: a */
    public final void mo84815a(AbstractC14621o abstractC14621o) {
        C14537c c14537c = (C14537c) abstractC14621o;
        C14619b c14619bM85028a = C14651t.m85028a(this.f61052a);
        if (c14619bM85028a == null) {
            C14608e.m84861a().m84881a(c14537c.m84752h(), 1005, new Object[0]);
            return;
        }
        String strM84919a = c14619bM85028a.m84919a();
        if (c14619bM85028a.m84926c()) {
            C14608e.m84861a().m84881a(c14537c.m84752h(), 1004, new Object[0]);
            abstractC14621o = new C14539e();
        } else {
            int iM85027a = C14650s.m85027a(c14537c);
            if (iM85027a != 0) {
                C14608e.m84861a().m84881a(c14537c.m84752h(), iM85027a, new Object[0]);
                return;
            }
        }
        C14533a.m84729a(this.f61052a, strM84919a, abstractC14621o);
    }
}
