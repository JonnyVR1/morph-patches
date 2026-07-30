package p002l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageReference;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.MomentAction;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.ksa0;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pna0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m20508b(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            return;
        }
        CoreModule.c.e0.d7.onNext(1);
    }

    /* JADX INFO: renamed from: c */
    public static void m20509c(Act act, String str, String str2, String str3) {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            if (userP9.isJailed()) {
                CoreModule.c.e0.d7.onNext(2);
                return;
            } else if (userP9.isNameFake()) {
                CoreModule.c.e0.d7.onNext(3);
                return;
            }
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("moment_comment");
        messageNew_.value = str;
        messageNew_.moment = str2;
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.action = MomentAction.get("comment");
        messageReferenceNew_.id = str2;
        messageReferenceNew_.type = "moment";
        messageNew_.api_only_reference = messageReferenceNew_;
        if (NullChecker.a(CoreModule.c.f0.Xe(str3))) {
            act.duringCreated(CoreModule.c.f0.Dn(str3, messageNew_, (Sticker) null)).subscribe(mkd0.H(new e30() { // from class: l.nna0
                public final void call(Object obj) {
                    CoreModule.c.e0.d7.onNext(0);
                }
            }, new e30() { // from class: l.ona0
                public final void call(Object obj) {
                    pna0.m20508b((Throwable) obj);
                }
            }));
            if (ConnectivityReceiver.g()) {
                return;
            }
            CoreModule.c.e0.d7.onNext(1);
            return;
        }
        User userById = CoreModule.K().getUserById(str3);
        if (NullChecker.a(userById)) {
            ksa0.h(R.string.yh, userById);
        }
    }
}
