package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageReference;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.MomentAction;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class tva0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m192781b(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            return;
        }
        CoreModule.f18264c.f20381e0.f89213d7.m137019l(1);
    }

    /* JADX INFO: renamed from: c */
    public static void m192782c(Act act, String str, String str2, String str3) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            if (userM116600p9.isJailed()) {
                CoreModule.f18264c.f20381e0.f89213d7.m137019l(2);
                return;
            } else if (userM116600p9.isNameFake()) {
                CoreModule.f18264c.f20381e0.f89213d7.m137019l(3);
                return;
            }
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("moment_comment");
        messageNew_.value = str;
        messageNew_.moment = str2;
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.action = MomentAction.get("comment");
        messageReferenceNew_.f21189id = str2;
        messageReferenceNew_.type = "moment";
        messageNew_.api_only_reference = messageReferenceNew_;
        if (NullChecker.m82486a(CoreModule.f18264c.f20384f0.m33859Xe(str3))) {
            act.duringCreated(CoreModule.f18264c.f20384f0.m33626Dn(str3, messageNew_, null)).subscribe(psd0.m173597H(new y20() { // from class: l.rva0
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20381e0.f89213d7.m137019l(0);
                }
            }, new y20() { // from class: l.sva0
                @Override // p153l.y20
                public final void call(Object obj) {
                    tva0.m192781b((Throwable) obj);
                }
            }));
            if (ConnectivityReceiver.m82467g()) {
                return;
            }
            CoreModule.f18264c.f20381e0.f89213d7.m137019l(1);
            return;
        }
        User userById = CoreModule.m30930K().getUserById(str3);
        if (NullChecker.m82486a(userById)) {
            o0b0.m165432h(R$string.f18884Th, userById);
        }
    }
}
