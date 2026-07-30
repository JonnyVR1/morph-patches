package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageReference;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.MomentAction;
import com.tantanapp.common.data.orm.Filter;
import java.util.concurrent.Callable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class mrz {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ roj0 m156092a(final String str) {
        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.irz
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17553k.f91940c.delete(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.local_moment_post_guide)));
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m156093b(Message message) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m156094c(CoreMomentInfo coreMomentInfo) {
        return vwb.m200296J(CoreModule.f17553k.f91940c.query(Filter.AND(Message.CID.mo60175EQ(coreMomentInfo.owner), Message.MESSAGETYPE.m60176EQ("moment_like"), Message.LIKEOFMOMENT.mo60175EQ(coreMomentInfo.f56008id)), Message.CREATEDTIME.DESC, 1)) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ roj0 m156096e(final Conversation conversation) {
        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.erz
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m33050mq(conversation);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m156098g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m156099h(Act act, CoreMomentInfo coreMomentInfo, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        m156104m(act, coreMomentInfo);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m156100i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<roj0> m156101j(final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.frz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mrz.m156092a(str);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: k */
    public static void m156102k(final Act act, final CoreMomentInfo coreMomentInfo) {
        act.duringCreated(m156103l(coreMomentInfo)).subscribe(mkd0.m154956H(new e30() { // from class: l.grz
            @Override // p149l.e30
            public final void call(Object obj) {
                mrz.m156099h(act, coreMomentInfo, (Boolean) obj);
            }
        }, new e30() { // from class: l.hrz
            @Override // p149l.e30
            public final void call(Object obj) {
                mrz.m156098g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static C22306c<Boolean> m156103l(final CoreMomentInfo coreMomentInfo) {
        return C22306c.fromCallable(new Callable() { // from class: l.lrz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mrz.m156094c(coreMomentInfo);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: m */
    public static void m156104m(Act act, CoreMomentInfo coreMomentInfo) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("moment_like");
        messageNew_.likeOfMoment = coreMomentInfo.f56008id;
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.action = MomentAction.get("like");
        messageReferenceNew_.f20447id = coreMomentInfo.f56008id;
        messageReferenceNew_.type = "moment";
        messageNew_.api_only_reference = messageReferenceNew_;
        act.duringCreated(CoreModule.f17545c.f19642f0.m32623Dn(coreMomentInfo.owner, messageNew_, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.jrz
            @Override // p149l.e30
            public final void call(Object obj) {
                mrz.m156093b((Message) obj);
            }
        }, new e30() { // from class: l.krz
            @Override // p149l.e30
            public final void call(Object obj) {
                mrz.m156100i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public static C22306c<roj0> m156105n(final Conversation conversation) {
        return C22306c.fromCallable(new Callable() { // from class: l.drz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mrz.m156096e(conversation);
            }
        }).compose(mkd0.m154951C());
    }
}
