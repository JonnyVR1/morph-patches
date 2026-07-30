package p003l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p000p1.mobile.putong.core.p001ui.messages.manager.insert.LocalMsgInsertType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.eclipse.jetty.servlet.ServletHandler;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class buv implements hul {
    @Override // p003l.hul
    /* JADX INFO: renamed from: a */
    public LocalMsgInsertType mo3175a() {
        return LocalMsgInsertType.INTL_READ_RECEIPTS_GUIDE;
    }

    @Override // p003l.hul
    /* JADX INFO: renamed from: b */
    public void mo3176b(final Conversation conversation, @Nullable Message message, @Nullable User user, User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, C1185a<Boolean> c1185a) {
        if (CoreModule.c.C0.J3() || CoreModule.k.c.R(((DbObject) conversation).id, conversation.clearedTime, true).e() > 0) {
            if (m3178f(conversation) > 0) {
                CoreModule.c.U.a(new d30() { // from class: l.ztv
                    @Override // p003l.d30
                    public final void call() {
                        CoreModule.k.c.delete(Filter.AND(new Filter[]{Message.CID.EQ(((DbObject) conversation).id), Message.MESSAGETYPE.EQ("local_intl_read_receipts_guide")}));
                    }
                });
            }
        } else if (m3178f(conversation) <= 0) {
            CoreModule.c.U.a(new d30() { // from class: l.auv
                @Override // p003l.d30
                public final void call() {
                    this.f2281a.m3179g(conversation);
                }
            });
            c1185a.onNext(Boolean.TRUE);
            return;
        }
        c1185a.onNext(Boolean.FALSE);
    }

    @Override // p003l.hul
    /* JADX INFO: renamed from: c */
    public boolean mo3177c(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, @Nullable Message message, User user) {
        if ((insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_INIT || insertLocalMsgTriggerType == InsertLocalMsgTriggerType.CONV_MSG_CHANGE) && conversation != null && !((DbObject) conversation).id.startsWith("-1") && TEnum.equals(conversation.status, ServletHandler.__DEFAULT_SERVLET)) {
            return (TextUtils.equals(conversation.convType, ServletHandler.__DEFAULT_SERVLET) || TextUtils.equals(conversation.convType, "heartbeatMatch") || TextUtils.equals(conversation.convType, "compliment") || TextUtils.equals(conversation.convType, "swiper")) && !m3180h(user, conversation);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m3178f(Conversation conversation) {
        return CoreModule.k.c.p0(((DbObject) conversation).id, conversation.clearedTime, "local_intl_read_receipts_guide").e();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m3179g(Conversation conversation) {
        if (m3178f(conversation) <= 0) {
            CoreModule.c.f0.Sg(((DbObject) conversation).id, conversation.clearedTime);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3180h(User user, Conversation conversation) {
        return NullChecker.a(conversation) && ruy.m7381g().m7387i(CoreModule.c.e0.oa(conversation.otherUser), user) && TEnum.equals(conversation.property.chatInterrupt.stage, "locked");
    }
}
