package p003l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p000p1.mobile.putong.core.p001ui.messages.manager.insert.LocalMsgInsertType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.IdealInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.IdealTag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.mkd0;
import l.mqi0;
import l.ura;
import l.vwb;
import org.eclipse.jetty.servlet.ServletHandler;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ytv implements hul {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m9231d(User user, final Conversation conversation, final C1185a c1185a, IdealInfo idealInfo) {
        if (!NullChecker.a(idealInfo) || vwb.J(idealInfo.targetFitIdeals)) {
            c1185a.onNext(Boolean.FALSE);
            return;
        }
        List<IdealTag> list = idealInfo.targetFitIdeals;
        if (vwb.J(list)) {
            c1185a.onNext(Boolean.FALSE);
            return;
        }
        List arrayList = (NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.basic)) ? user.profile.extensions.basic.ideal : null;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        final ArrayList arrayList2 = new ArrayList();
        for (IdealTag idealTag : list) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList2.add(idealTag);
                    break;
                }
            } while (!TextUtils.equals(((IdealTag) it.next()).id, idealTag.id));
        }
        if (vwb.J(arrayList2)) {
            c1185a.onNext(Boolean.FALSE);
        } else {
            CoreModule.c.f0.ch(((DbObject) conversation).id, MessageType.get("local_ideal_enquiry"), new e30() { // from class: l.wtv
                @Override // p003l.e30
                public final void call(Object obj) {
                    ytv.m9233f(conversation, arrayList2, (Message) obj);
                }
            }).subscribe((m250) mkd0.G(new e30() { // from class: l.xtv
                @Override // p003l.e30
                public final void call(Object obj) {
                    c1185a.onNext(Boolean.TRUE);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m9233f(Conversation conversation, List list, Message message) {
        message.owner = ((DbObject) conversation).id;
        try {
            IdealInfo idealInfoNew_ = IdealInfo.new_();
            idealInfoNew_.fitIdeals = list;
            message.localExtraInfo = idealInfoNew_.toJson();
        } catch (Exception unused) {
        }
    }

    @Override // p003l.hul
    /* JADX INFO: renamed from: a */
    public LocalMsgInsertType mo3175a() {
        return LocalMsgInsertType.IDEAL_GUIDE_MSG;
    }

    @Override // p003l.hul
    /* JADX INFO: renamed from: b */
    public void mo3176b(final Conversation conversation, @Nullable Message message, @Nullable User user, final User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, final C1185a<Boolean> c1185a) {
        String str = ((DbObject) conversation).id;
        if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.CONV_MSG_CHANGE) {
            ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.IdealGuideMsg;
            conversationCounterTypeSp.set("ideal_guide_all_show_count_", conversationCounterTypeSp.get("ideal_guide_all_show_count_") + 1);
            conversationCounterTypeSp.set("today_show_times_");
            CoreModule.c.e0.s7(str, "chat").first().timeout(3000L, TimeUnit.SECONDS).subscribe((m250) mkd0.H(new e30() { // from class: l.utv
                @Override // p003l.e30
                public final void call(Object obj) {
                    ytv.m9231d(user2, conversation, c1185a, (IdealInfo) obj);
                }
            }, new e30() { // from class: l.vtv
                @Override // p003l.e30
                public final void call(Object obj) {
                    c1185a.onNext(Boolean.FALSE);
                }
            }));
            return;
        }
        if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_FINISH) {
            ConversationCounterTypeSp conversationCounterTypeSp2 = ConversationCounterTypeSp.IdealGuideMsg;
            if (conversationCounterTypeSp2.get("ideal_guide_conv_show_flag_" + str) == 1) {
                conversationCounterTypeSp2.set("ideal_guide_conv_show_flag_" + str, 2);
            }
            CoreModule.c.f0.Qf(((DbObject) conversation).id, vwb.f0(new String[]{"local_ideal_enquiry"}));
            c1185a.onNext(Boolean.TRUE);
        }
    }

    @Override // p003l.hul
    /* JADX INFO: renamed from: c */
    public boolean mo3177c(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, @Nullable Message message, User user) {
        if (User.isTeamAccount(((DbObject) conversation).id)) {
            return false;
        }
        if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_FINISH) {
            return true;
        }
        if (!ura.e().d().qf()) {
            return false;
        }
        if ((NullChecker.a(message) && ((DbObject) message).id.startsWith("fake_id_")) || conversation.status != ConversationStatus.get(ServletHandler.__DEFAULT_SERVLET) || !TextUtils.equals(conversation.convType, ServletHandler.__DEFAULT_SERVLET) || !TextUtils.equals(conversation.otherStatus, ServletHandler.__DEFAULT_SERVLET) || conversation.mm < 5) {
            return false;
        }
        String str = ((DbObject) conversation).id;
        ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.IdealGuideMsg;
        if (conversationCounterTypeSp.get("ideal_guide_all_show_count_") >= 3) {
            return false;
        }
        if (!mqi0.D(conversationCounterTypeSp.getLong("latest_show_time_"))) {
            conversationCounterTypeSp.setLong("latest_show_time_", mqi0.o());
            conversationCounterTypeSp.set("today_show_times_", 0);
        }
        if (conversationCounterTypeSp.get("today_show_times_") >= 3) {
            return false;
        }
        if (conversationCounterTypeSp.get("ideal_guide_conv_show_flag_" + str) <= 0 && insertLocalMsgTriggerType == InsertLocalMsgTriggerType.CONV_MSG_CHANGE && conversation.mm >= 5 && NullChecker.a(message) && message.isMe()) {
            conversationCounterTypeSp.set("ideal_guide_conv_show_flag_" + str, 1);
            return true;
        }
        return false;
    }
}
