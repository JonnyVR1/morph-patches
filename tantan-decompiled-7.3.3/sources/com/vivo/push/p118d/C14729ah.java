package com.vivo.push.p118d;

import android.content.Context;
import com.vivo.push.AbstractC14769o;
import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.C14756e;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.C14767b;
import com.vivo.push.p115a.C14681a;
import com.vivo.push.p116b.C14685c;
import com.vivo.push.p116b.C14687e;
import com.vivo.push.p116b.C14705w;
import com.vivo.push.util.C14781b;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14798s;
import com.vivo.push.util.C14799t;

/* JADX INFO: renamed from: com.vivo.push.d.ah */
/* JADX INFO: loaded from: classes2.dex */
final class C14729ah extends AbstractRunnableC14764l {
    public C14729ah(AbstractC14769o abstractC14769o) {
        super(abstractC14769o);
    }

    @Override // com.vivo.push.AbstractRunnableC14764l
    /* JADX INFO: renamed from: a */
    public final void mo85986a(AbstractC14769o abstractC14769o) {
        Context context = this.f61899a;
        if (context == null) {
            C14795p.m86192d("SendCommandTask", "SendCommandTask " + abstractC14769o + " ; mContext is Null");
            return;
        }
        if (abstractC14769o == null) {
            C14795p.m86192d("SendCommandTask", "SendCommandTask pushCommand is Null");
            return;
        }
        C14767b c14767bM86199a = C14799t.m86199a(context);
        int iM86104b = abstractC14769o.m86104b();
        if (iM86104b == 2009) {
            C14795p.m86184a(ClientConfigManagerImpl.getInstance(this.f61899a).isDebug());
            if (C14795p.m86185a()) {
                C14756e.m86032a().m86070i();
                C14781b c14781b = new C14781b();
                c14781b.m86134a(this.f61899a, "com.vivo.push_preferences.hybridapptoken_v1");
                c14781b.m86133a();
                C14781b c14781b2 = new C14781b();
                c14781b2.m86134a(this.f61899a, "com.vivo.push_preferences.appconfig_v1");
                c14781b2.m86133a();
                if (!C14756e.m86032a().m86066e()) {
                    ClientConfigManagerImpl.getInstance(this.f61899a).clearPush();
                }
            }
        } else if (iM86104b != 2011) {
            switch (iM86104b) {
                case 2002:
                case 2003:
                case 2004:
                case 2005:
                    if (c14767bM86199a == null || c14767bM86199a.m86097c()) {
                        C14756e.m86032a().m86051a(((C14685c) abstractC14769o).m85923h(), 1005);
                    } else {
                        C14685c c14685c = (C14685c) abstractC14769o;
                        int iM86198a = C14798s.m86198a(c14685c);
                        if (iM86198a != 0) {
                            C14756e.m86032a().m86051a(c14685c.m85923h(), iM86198a);
                            return;
                        }
                    }
                    break;
            }
        } else {
            C14795p.m86184a(ClientConfigManagerImpl.getInstance(this.f61899a).isDebug(((C14705w) abstractC14769o).m85954d()));
        }
        if (c14767bM86199a == null) {
            C14795p.m86192d("SendCommandTask", "SendCommandTask " + abstractC14769o + " ; pushPkgInfo is Null");
            return;
        }
        String strM86090a = c14767bM86199a.m86090a();
        if (c14767bM86199a.m86097c()) {
            try {
                C14756e.m86032a().m86051a(((C14685c) abstractC14769o).m85923h(), 1004);
            } catch (Exception e) {
                e.printStackTrace();
            }
            abstractC14769o = new C14687e();
            C14795p.m86192d("SendCommandTask", "SendCommandTask " + abstractC14769o + " ; pkgName is InBlackList ");
        }
        C14681a.m85900a(this.f61899a, strM86090a, abstractC14769o);
    }
}
