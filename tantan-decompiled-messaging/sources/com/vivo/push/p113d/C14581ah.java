package com.vivo.push.p113d;

import android.content.Context;
import com.vivo.push.AbstractC14621o;
import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.C14608e;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.C14619b;
import com.vivo.push.p110a.C14533a;
import com.vivo.push.p111b.C14537c;
import com.vivo.push.p111b.C14539e;
import com.vivo.push.p111b.C14557w;
import com.vivo.push.util.C14633b;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14650s;
import com.vivo.push.util.C14651t;

/* JADX INFO: renamed from: com.vivo.push.d.ah */
/* JADX INFO: loaded from: classes2.dex */
final class C14581ah extends AbstractRunnableC14616l {
    public C14581ah(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    @Override // com.vivo.push.AbstractRunnableC14616l
    /* JADX INFO: renamed from: a */
    public final void mo84815a(AbstractC14621o abstractC14621o) {
        Context context = this.f61052a;
        if (context == null) {
            C14647p.m85021d("SendCommandTask", "SendCommandTask " + abstractC14621o + " ; mContext is Null");
            return;
        }
        if (abstractC14621o == null) {
            C14647p.m85021d("SendCommandTask", "SendCommandTask pushCommand is Null");
            return;
        }
        C14619b c14619bM85028a = C14651t.m85028a(context);
        int iM84933b = abstractC14621o.m84933b();
        if (iM84933b == 2009) {
            C14647p.m85013a(ClientConfigManagerImpl.getInstance(this.f61052a).isDebug());
            if (C14647p.m85014a()) {
                C14608e.m84861a().m84899i();
                C14633b c14633b = new C14633b();
                c14633b.m84963a(this.f61052a, "com.vivo.push_preferences.hybridapptoken_v1");
                c14633b.m84962a();
                C14633b c14633b2 = new C14633b();
                c14633b2.m84963a(this.f61052a, "com.vivo.push_preferences.appconfig_v1");
                c14633b2.m84962a();
                if (!C14608e.m84861a().m84895e()) {
                    ClientConfigManagerImpl.getInstance(this.f61052a).clearPush();
                }
            }
        } else if (iM84933b != 2011) {
            switch (iM84933b) {
                case 2002:
                case 2003:
                case 2004:
                case 2005:
                    if (c14619bM85028a == null || c14619bM85028a.m84926c()) {
                        C14608e.m84861a().m84880a(((C14537c) abstractC14621o).m84752h(), 1005);
                    } else {
                        C14537c c14537c = (C14537c) abstractC14621o;
                        int iM85027a = C14650s.m85027a(c14537c);
                        if (iM85027a != 0) {
                            C14608e.m84861a().m84880a(c14537c.m84752h(), iM85027a);
                            return;
                        }
                    }
                    break;
            }
        } else {
            C14647p.m85013a(ClientConfigManagerImpl.getInstance(this.f61052a).isDebug(((C14557w) abstractC14621o).m84783d()));
        }
        if (c14619bM85028a == null) {
            C14647p.m85021d("SendCommandTask", "SendCommandTask " + abstractC14621o + " ; pushPkgInfo is Null");
            return;
        }
        String strM84919a = c14619bM85028a.m84919a();
        if (c14619bM85028a.m84926c()) {
            try {
                C14608e.m84861a().m84880a(((C14537c) abstractC14621o).m84752h(), 1004);
            } catch (Exception e) {
                e.printStackTrace();
            }
            abstractC14621o = new C14539e();
            C14647p.m85021d("SendCommandTask", "SendCommandTask " + abstractC14621o + " ; pkgName is InBlackList ");
        }
        C14533a.m84729a(this.f61052a, strM84919a, abstractC14621o);
    }
}
