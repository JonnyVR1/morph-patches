package com.vivo.push.p113d;

import android.text.TextUtils;
import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14608e;
import com.vivo.push.C14617m;
import com.vivo.push.p111b.C14543i;

/* JADX INFO: renamed from: com.vivo.push.d.d */
/* JADX INFO: loaded from: classes2.dex */
final class C14585d extends AbstractC14607z {
    public C14585d(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    @Override // com.vivo.push.AbstractRunnableC14616l
    /* JADX INFO: renamed from: a */
    public final void mo84815a(AbstractC14621o abstractC14621o) {
        C14543i c14543i = (C14543i) abstractC14621o;
        String strM84755e = c14543i.m84755e();
        C14608e.m84861a().m84881a(c14543i.m84774g(), c14543i.m84775h(), strM84755e);
        if (TextUtils.isEmpty(c14543i.m84774g()) && !TextUtils.isEmpty(strM84755e)) {
            C14608e.m84861a().m84879a(strM84755e);
        }
        C14617m.m84915b(new RunnableC14586e(this, strM84755e, c14543i));
    }
}
