package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageReference;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.MomentAction;
import com.tantanapp.common.data.orm.Filter;
import java.util.concurrent.Callable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class j000 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ uxj0 m142882a(final String str) {
        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.f000
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18272k.f115535c.delete(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.local_moment_post_guide)));
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m142883b(Message message) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m142884c(CoreMomentInfo coreMomentInfo) {
        return jyb.m147479J(CoreModule.f18272k.f115535c.query(Filter.AND(Message.CID.mo61359EQ(coreMomentInfo.owner), Message.MESSAGETYPE.m61360EQ("moment_like"), Message.LIKEOFMOMENT.mo61359EQ(coreMomentInfo.f56856id)), Message.CREATEDTIME.DESC, 1)) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ uxj0 m142886e(final Conversation conversation) {
        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.b000
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m34053mq(conversation);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m142888g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m142889h(Act act, CoreMomentInfo coreMomentInfo, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        m142894m(act, coreMomentInfo);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m142890i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<uxj0> m142891j(final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.c000
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j000.m142882a(str);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: k */
    public static void m142892k(final Act act, final CoreMomentInfo coreMomentInfo) {
        act.duringCreated(m142893l(coreMomentInfo)).subscribe(psd0.m173597H(new y20() { // from class: l.d000
            @Override // p153l.y20
            public final void call(Object obj) {
                j000.m142889h(act, coreMomentInfo, (Boolean) obj);
            }
        }, new y20() { // from class: l.e000
            @Override // p153l.y20
            public final void call(Object obj) {
                j000.m142888g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static C22421c<Boolean> m142893l(final CoreMomentInfo coreMomentInfo) {
        return C22421c.fromCallable(new Callable() { // from class: l.i000
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j000.m142884c(coreMomentInfo);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: m */
    public static void m142894m(Act act, CoreMomentInfo coreMomentInfo) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("moment_like");
        messageNew_.likeOfMoment = coreMomentInfo.f56856id;
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.action = MomentAction.get("like");
        messageReferenceNew_.f21189id = coreMomentInfo.f56856id;
        messageReferenceNew_.type = "moment";
        messageNew_.api_only_reference = messageReferenceNew_;
        act.duringCreated(CoreModule.f18264c.f20384f0.m33626Dn(coreMomentInfo.owner, messageNew_, null)).subscribe(psd0.m173597H(new y20() { // from class: l.g000
            @Override // p153l.y20
            public final void call(Object obj) {
                j000.m142883b((Message) obj);
            }
        }, new y20() { // from class: l.h000
            @Override // p153l.y20
            public final void call(Object obj) {
                j000.m142890i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public static C22421c<uxj0> m142895n(final Conversation conversation) {
        return C22421c.fromCallable(new Callable() { // from class: l.a000
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j000.m142886e(conversation);
            }
        }).compose(psd0.m173592C());
    }
}
