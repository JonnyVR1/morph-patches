package com.vivo.push.p118d;

import android.content.Context;
import com.vivo.push.AbstractC14769o;
import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.model.C14767b;
import com.vivo.push.p115a.C14681a;
import com.vivo.push.p116b.C14686d;
import com.vivo.push.p116b.C14688f;
import com.vivo.push.p116b.C14707y;
import com.vivo.push.util.C14799t;

/* JADX INFO: renamed from: com.vivo.push.d.b */
/* JADX INFO: loaded from: classes2.dex */
final class C14731b extends AbstractRunnableC14764l {
    public C14731b(AbstractC14769o abstractC14769o) {
        super(abstractC14769o);
    }

    @Override // com.vivo.push.AbstractRunnableC14764l
    /* JADX INFO: renamed from: a */
    public final void mo85986a(AbstractC14769o abstractC14769o) {
        C14767b c14767bM86199a = C14799t.m86199a(this.f61899a);
        boolean zM85924d = ((C14686d) abstractC14769o).m85924d();
        Context context = this.f61899a;
        try {
            if (zM85924d ? C14735f.m85994a(context) : C14735f.m85995b(context)) {
                C14767b c14767bM86199a2 = C14799t.m86199a(this.f61899a);
                if (c14767bM86199a == null || c14767bM86199a2 == null || c14767bM86199a2.m86090a() == null || !c14767bM86199a2.m86090a().equals(c14767bM86199a.m86090a())) {
                    if (c14767bM86199a != null && c14767bM86199a.m86090a() != null) {
                        C14681a.m85900a(this.f61899a, c14767bM86199a.m86090a(), new C14707y(c14767bM86199a.m86090a()));
                    }
                    if (c14767bM86199a2 == null || c14767bM86199a2.m86090a() == null) {
                        return;
                    }
                    C14681a.m85900a(this.f61899a, c14767bM86199a2.m86090a(), new C14688f());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
