package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageReference;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.MomentAction;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class pna0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m170403b(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            return;
        }
        CoreModule.f17545c.f19639e0.f149356d7.m132487l(1);
    }

    /* JADX INFO: renamed from: c */
    public static void m170404c(Act act, String str, String str2, String str3) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            if (userM169527p9.isJailed()) {
                CoreModule.f17545c.f19639e0.f149356d7.m132487l(2);
                return;
            } else if (userM169527p9.isNameFake()) {
                CoreModule.f17545c.f19639e0.f149356d7.m132487l(3);
                return;
            }
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("moment_comment");
        messageNew_.value = str;
        messageNew_.moment = str2;
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.action = MomentAction.get("comment");
        messageReferenceNew_.f20447id = str2;
        messageReferenceNew_.type = "moment";
        messageNew_.api_only_reference = messageReferenceNew_;
        if (NullChecker.m81303a(CoreModule.f17545c.f19642f0.m32856Xe(str3))) {
            act.duringCreated(CoreModule.f17545c.f19642f0.m32623Dn(str3, messageNew_, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.nna0
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19639e0.f149356d7.m132487l(0);
                }
            }, new e30() { // from class: l.ona0
                @Override // p149l.e30
                public final void call(Object obj) {
                    pna0.m170403b((Throwable) obj);
                }
            }));
            if (ConnectivityReceiver.m81284g()) {
                return;
            }
            CoreModule.f17545c.f19639e0.f149356d7.m132487l(1);
            return;
        }
        User userById = CoreModule.m29932K().getUserById(str3);
        if (NullChecker.m81303a(userById)) {
            ksa0.m147044h(R$string.f19096yh, userById);
        }
    }
}
