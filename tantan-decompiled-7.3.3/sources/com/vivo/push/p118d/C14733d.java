package com.vivo.push.p118d;

import android.text.TextUtils;
import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14756e;
import com.vivo.push.C14765m;
import com.vivo.push.p116b.C14691i;

/* JADX INFO: renamed from: com.vivo.push.d.d */
/* JADX INFO: loaded from: classes2.dex */
final class C14733d extends AbstractC14755z {
    public C14733d(AbstractC14769o abstractC14769o) {
        super(abstractC14769o);
    }

    @Override // com.vivo.push.AbstractRunnableC14764l
    /* JADX INFO: renamed from: a */
    public final void mo85986a(AbstractC14769o abstractC14769o) {
        C14691i c14691i = (C14691i) abstractC14769o;
        String strM85926e = c14691i.m85926e();
        C14756e.m86032a().m86052a(c14691i.m85945g(), c14691i.m85946h(), strM85926e);
        if (TextUtils.isEmpty(c14691i.m85945g()) && !TextUtils.isEmpty(strM85926e)) {
            C14756e.m86032a().m86050a(strM85926e);
        }
        C14765m.m86086b(new RunnableC14734e(this, strM85926e, c14691i));
    }
}
