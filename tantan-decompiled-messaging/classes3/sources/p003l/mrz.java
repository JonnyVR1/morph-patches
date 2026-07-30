package p003l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageReference;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.MomentAction;
import com.p1.mobile.putong.core.data.Sticker;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.OrderedColumn;
import java.util.concurrent.Callable;
import l.mkd0;
import l.roj0;
import l.vwb;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mrz {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ roj0 m6450a(final String str) {
        CoreModule.c.U.a(new d30() { // from class: l.irz
            @Override // p003l.d30
            public final void call() {
                CoreModule.k.c.delete(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("local_moment_post_guide")}));
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6451b(Message message) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m6452c(CoreMomentInfo coreMomentInfo) {
        return vwb.J(CoreModule.k.c.query(Filter.AND(new Filter[]{Message.CID.EQ(coreMomentInfo.owner), Message.MESSAGETYPE.EQ("moment_like"), Message.LIKEOFMOMENT.EQ(((CopyObject) coreMomentInfo).id)}), ((OrderedColumn) Message.CREATEDTIME).DESC, 1)) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ roj0 m6454e(final Conversation conversation) {
        CoreModule.c.U.a(new d30() { // from class: l.erz
            @Override // p003l.d30
            public final void call() {
                CoreModule.c.f0.mq(conversation);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6456g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m6457h(Act act, CoreMomentInfo coreMomentInfo, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        m6462m(act, coreMomentInfo);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m6458i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static C1099c<roj0> m6459j(final String str) {
        return C1099c.fromCallable(new Callable() { // from class: l.frz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mrz.m6450a(str);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: k */
    public static void m6460k(final Act act, final CoreMomentInfo coreMomentInfo) {
        act.duringCreated(m6461l(coreMomentInfo)).subscribe((m250) mkd0.H(new e30() { // from class: l.grz
            @Override // p003l.e30
            public final void call(Object obj) {
                mrz.m6457h(act, coreMomentInfo, (Boolean) obj);
            }
        }, new e30() { // from class: l.hrz
            @Override // p003l.e30
            public final void call(Object obj) {
                mrz.m6456g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static C1099c<Boolean> m6461l(final CoreMomentInfo coreMomentInfo) {
        return C1099c.fromCallable(new Callable() { // from class: l.lrz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mrz.m6452c(coreMomentInfo);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: m */
    public static void m6462m(Act act, CoreMomentInfo coreMomentInfo) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("moment_like");
        messageNew_.likeOfMoment = ((CopyObject) coreMomentInfo).id;
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.action = MomentAction.get("like");
        messageReferenceNew_.id = ((CopyObject) coreMomentInfo).id;
        messageReferenceNew_.type = "moment";
        messageNew_.api_only_reference = messageReferenceNew_;
        act.duringCreated(CoreModule.c.f0.Dn(coreMomentInfo.owner, messageNew_, (Sticker) null)).subscribe((m250) mkd0.H(new e30() { // from class: l.jrz
            @Override // p003l.e30
            public final void call(Object obj) {
                mrz.m6451b((Message) obj);
            }
        }, new e30() { // from class: l.krz
            @Override // p003l.e30
            public final void call(Object obj) {
                mrz.m6458i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public static C1099c<roj0> m6463n(final Conversation conversation) {
        return C1099c.fromCallable(new Callable() { // from class: l.drz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mrz.m6454e(conversation);
            }
        }).compose(mkd0.C());
    }
}
