package com.vivo.push;

import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.vivo.push.p116b.C14691i;
import com.vivo.push.p116b.C14692j;
import com.vivo.push.p116b.C14693k;
import com.vivo.push.p116b.C14694l;
import com.vivo.push.p116b.C14695m;
import com.vivo.push.p116b.C14696n;
import com.vivo.push.p116b.C14697o;
import com.vivo.push.p116b.C14698p;
import com.vivo.push.p116b.C14699q;
import com.vivo.push.p116b.C14700r;
import com.vivo.push.p116b.C14702t;
import com.vivo.push.p116b.C14703u;
import com.vivo.push.p118d.AbstractC14755z;
import com.vivo.push.p118d.C14728ag;
import com.vivo.push.util.C14795p;

/* JADX INFO: renamed from: com.vivo.push.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C14720d implements IPushClientFactory {

    /* JADX INFO: renamed from: a */
    private C14728ag f61815a = new C14728ag();

    @Override // com.vivo.push.IPushClientFactory
    public final AbstractC14755z createReceiveTask(AbstractC14769o abstractC14769o) {
        return C14728ag.m85991b(abstractC14769o);
    }

    @Override // com.vivo.push.IPushClientFactory
    public final AbstractC14769o createReceiverCommand(Intent intent) {
        AbstractC14769o c14703u;
        AbstractC14769o c14702t;
        int intExtra = intent.getIntExtra(CommandMessage.COMMAND, -1);
        if (intExtra < 0) {
            intExtra = intent.getIntExtra(FirebaseAnalytics.Param.METHOD, -1);
        }
        if (intExtra == 20) {
            c14703u = new C14703u();
        } else if (intExtra != 2016) {
            switch (intExtra) {
                case 1:
                case 2:
                    c14702t = new C14702t(intExtra);
                    c14703u = c14702t;
                    break;
                case 3:
                    c14703u = new C14697o();
                    break;
                case 4:
                    c14703u = new C14699q();
                    break;
                case 5:
                    c14703u = new C14698p();
                    break;
                case 6:
                    c14703u = new C14700r();
                    break;
                case 7:
                    c14703u = new C14696n();
                    break;
                case 8:
                    c14703u = new C14695m();
                    break;
                case 9:
                    c14703u = new C14693k();
                    break;
                case 10:
                case 11:
                    c14702t = new C14691i(intExtra);
                    c14703u = c14702t;
                    break;
                case 12:
                    c14703u = new C14692j();
                    break;
                default:
                    c14703u = null;
                    break;
            }
        } else {
            c14703u = new C14694l();
        }
        if (c14703u != null) {
            C14680a c14680aM85881a = C14680a.m85881a(intent);
            if (c14680aM85881a == null) {
                C14795p.m86186b("PushCommand", "bundleWapper is null");
                return c14703u;
            }
            c14703u.m86106b(c14680aM85881a);
        }
        return c14703u;
    }

    @Override // com.vivo.push.IPushClientFactory
    public final AbstractRunnableC14764l createTask(AbstractC14769o abstractC14769o) {
        return C14728ag.m85990a(abstractC14769o);
    }
}
