package com.vivo.push.p113d;

import android.content.Context;
import com.vivo.push.AbstractC14621o;
import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.model.C14619b;
import com.vivo.push.p110a.C14533a;
import com.vivo.push.p111b.C14538d;
import com.vivo.push.p111b.C14540f;
import com.vivo.push.p111b.C14559y;
import com.vivo.push.util.C14651t;

/* JADX INFO: renamed from: com.vivo.push.d.b */
/* JADX INFO: loaded from: classes2.dex */
final class C14583b extends AbstractRunnableC14616l {
    public C14583b(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    @Override // com.vivo.push.AbstractRunnableC14616l
    /* JADX INFO: renamed from: a */
    public final void mo84815a(AbstractC14621o abstractC14621o) {
        C14619b c14619bM85028a = C14651t.m85028a(this.f61052a);
        boolean zM84753d = ((C14538d) abstractC14621o).m84753d();
        Context context = this.f61052a;
        try {
            if (zM84753d ? C14587f.m84823a(context) : C14587f.m84824b(context)) {
                C14619b c14619bM85028a2 = C14651t.m85028a(this.f61052a);
                if (c14619bM85028a == null || c14619bM85028a2 == null || c14619bM85028a2.m84919a() == null || !c14619bM85028a2.m84919a().equals(c14619bM85028a.m84919a())) {
                    if (c14619bM85028a != null && c14619bM85028a.m84919a() != null) {
                        C14533a.m84729a(this.f61052a, c14619bM85028a.m84919a(), new C14559y(c14619bM85028a.m84919a()));
                    }
                    if (c14619bM85028a2 == null || c14619bM85028a2.m84919a() == null) {
                        return;
                    }
                    C14533a.m84729a(this.f61052a, c14619bM85028a2.m84919a(), new C14540f());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
