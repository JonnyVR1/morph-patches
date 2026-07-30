package com.vivo.push;

import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.vivo.push.p111b.C14543i;
import com.vivo.push.p111b.C14544j;
import com.vivo.push.p111b.C14545k;
import com.vivo.push.p111b.C14546l;
import com.vivo.push.p111b.C14547m;
import com.vivo.push.p111b.C14548n;
import com.vivo.push.p111b.C14549o;
import com.vivo.push.p111b.C14550p;
import com.vivo.push.p111b.C14551q;
import com.vivo.push.p111b.C14552r;
import com.vivo.push.p111b.C14554t;
import com.vivo.push.p111b.C14555u;
import com.vivo.push.p113d.AbstractC14607z;
import com.vivo.push.p113d.C14580ag;
import com.vivo.push.util.C14647p;

/* JADX INFO: renamed from: com.vivo.push.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C14572d implements IPushClientFactory {

    /* JADX INFO: renamed from: a */
    private C14580ag f60968a = new C14580ag();

    @Override // com.vivo.push.IPushClientFactory
    public final AbstractC14607z createReceiveTask(AbstractC14621o abstractC14621o) {
        return C14580ag.m84820b(abstractC14621o);
    }

    @Override // com.vivo.push.IPushClientFactory
    public final AbstractC14621o createReceiverCommand(Intent intent) {
        AbstractC14621o c14555u;
        AbstractC14621o c14554t;
        int intExtra = intent.getIntExtra(CommandMessage.COMMAND, -1);
        if (intExtra < 0) {
            intExtra = intent.getIntExtra(FirebaseAnalytics.Param.METHOD, -1);
        }
        if (intExtra == 20) {
            c14555u = new C14555u();
        } else if (intExtra != 2016) {
            switch (intExtra) {
                case 1:
                case 2:
                    c14554t = new C14554t(intExtra);
                    c14555u = c14554t;
                    break;
                case 3:
                    c14555u = new C14549o();
                    break;
                case 4:
                    c14555u = new C14551q();
                    break;
                case 5:
                    c14555u = new C14550p();
                    break;
                case 6:
                    c14555u = new C14552r();
                    break;
                case 7:
                    c14555u = new C14548n();
                    break;
                case 8:
                    c14555u = new C14547m();
                    break;
                case 9:
                    c14555u = new C14545k();
                    break;
                case 10:
                case 11:
                    c14554t = new C14543i(intExtra);
                    c14555u = c14554t;
                    break;
                case 12:
                    c14555u = new C14544j();
                    break;
                default:
                    c14555u = null;
                    break;
            }
        } else {
            c14555u = new C14546l();
        }
        if (c14555u != null) {
            C14532a c14532aM84710a = C14532a.m84710a(intent);
            if (c14532aM84710a == null) {
                C14647p.m85015b("PushCommand", "bundleWapper is null");
                return c14555u;
            }
            c14555u.m84935b(c14532aM84710a);
        }
        return c14555u;
    }

    @Override // com.vivo.push.IPushClientFactory
    public final AbstractRunnableC14616l createTask(AbstractC14621o abstractC14621o) {
        return C14580ag.m84819a(abstractC14621o);
    }
}
