package com.vivo.push.p113d;

import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14608e;
import com.vivo.push.C14617m;
import com.vivo.push.p111b.C14543i;

/* JADX INFO: renamed from: com.vivo.push.d.ad */
/* JADX INFO: loaded from: classes2.dex */
final class C14577ad extends AbstractC14607z {
    public C14577ad(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    @Override // com.vivo.push.AbstractRunnableC14616l
    /* JADX INFO: renamed from: a */
    public final void mo84815a(AbstractC14621o abstractC14621o) {
        C14543i c14543i = (C14543i) abstractC14621o;
        C14608e.m84861a().m84881a(c14543i.m84774g(), c14543i.m84775h(), new Object[0]);
        C14617m.m84915b(new RunnableC14578ae(this, c14543i));
    }
}
