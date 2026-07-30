package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.IdealInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p046p1.mobile.putong.core.p053ui.messages.manager.insert.LocalMsgInsertType;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.IdealTag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class ytv implements hul {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m216082d(User user, final Conversation conversation, final C22392a c22392a, IdealInfo idealInfo) {
        if (!NullChecker.m81303a(idealInfo) || vwb.m200296J(idealInfo.targetFitIdeals)) {
            c22392a.m132487l(Boolean.FALSE);
            return;
        }
        List<IdealTag> list = idealInfo.targetFitIdeals;
        if (vwb.m200296J(list)) {
            c22392a.m132487l(Boolean.FALSE);
            return;
        }
        List<IdealTag> arrayList = (NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.basic)) ? user.profile.extensions.basic.ideal : null;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        final ArrayList arrayList2 = new ArrayList();
        for (IdealTag idealTag : list) {
            Iterator<IdealTag> it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList2.add(idealTag);
                    break;
                }
            } while (!TextUtils.equals(it.next().f38760id, idealTag.f38760id));
        }
        if (vwb.m200296J(arrayList2)) {
            c22392a.m132487l(Boolean.FALSE);
        } else {
            CoreModule.f17545c.f19642f0.m32918ch(conversation.f56011id, MessageType.get(MessageType.local_ideal_enquiry), new e30() { // from class: l.wtv
                @Override // p149l.e30
                public final void call(Object obj) {
                    ytv.m216084f(conversation, arrayList2, (Message) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.xtv
                @Override // p149l.e30
                public final void call(Object obj) {
                    c22392a.m132487l(Boolean.TRUE);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m216084f(Conversation conversation, List list, Message message) {
        message.owner = conversation.f56011id;
        try {
            IdealInfo idealInfoNew_ = IdealInfo.new_();
            idealInfoNew_.fitIdeals = list;
            message.localExtraInfo = idealInfoNew_.toJson();
        } catch (Exception unused) {
        }
    }

    @Override // p149l.hul
    /* JADX INFO: renamed from: a */
    public LocalMsgInsertType mo103994a() {
        return LocalMsgInsertType.IDEAL_GUIDE_MSG;
    }

    @Override // p149l.hul
    /* JADX INFO: renamed from: b */
    public void mo103995b(final Conversation conversation, @Nullable Message message, @Nullable User user, final User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, final C22392a<Boolean> c22392a) {
        String str = conversation.f56011id;
        if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.CONV_MSG_CHANGE) {
            ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.IdealGuideMsg;
            conversationCounterTypeSp.set("ideal_guide_all_show_count_", conversationCounterTypeSp.get("ideal_guide_all_show_count_") + 1);
            conversationCounterTypeSp.set("today_show_times_");
            CoreModule.f17545c.f19639e0.m169537s7(str, "chat").first().timeout(3000L, TimeUnit.SECONDS).subscribe(mkd0.m154956H(new e30() { // from class: l.utv
                @Override // p149l.e30
                public final void call(Object obj) {
                    ytv.m216082d(user2, conversation, c22392a, (IdealInfo) obj);
                }
            }, new e30() { // from class: l.vtv
                @Override // p149l.e30
                public final void call(Object obj) {
                    c22392a.m132487l(Boolean.FALSE);
                }
            }));
            return;
        }
        if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_FINISH) {
            ConversationCounterTypeSp conversationCounterTypeSp2 = ConversationCounterTypeSp.IdealGuideMsg;
            if (conversationCounterTypeSp2.get("ideal_guide_conv_show_flag_" + str) == 1) {
                conversationCounterTypeSp2.set("ideal_guide_conv_show_flag_" + str, 2);
            }
            CoreModule.f17545c.f19642f0.m32774Qf(conversation.f56011id, vwb.m200324f0(MessageType.local_ideal_enquiry));
            c22392a.m132487l(Boolean.TRUE);
        }
    }

    @Override // p149l.hul
    /* JADX INFO: renamed from: c */
    public boolean mo103996c(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, @Nullable Message message, User user) {
        if (User.isTeamAccount(conversation.f56011id)) {
            return false;
        }
        if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_FINISH) {
            return true;
        }
        if (!ura.m195053e().m195057d().mo33908qf()) {
            return false;
        }
        if ((NullChecker.m81303a(message) && message.f56011id.startsWith("fake_id_")) || conversation.status != ConversationStatus.get("default") || !TextUtils.equals(conversation.convType, "default") || !TextUtils.equals(conversation.otherStatus, "default") || conversation.f20374mm < 5) {
            return false;
        }
        String str = conversation.f56011id;
        ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.IdealGuideMsg;
        if (conversationCounterTypeSp.get("ideal_guide_all_show_count_") >= 3) {
            return false;
        }
        if (!mqi0.m155929D(conversationCounterTypeSp.getLong("latest_show_time_"))) {
            conversationCounterTypeSp.setLong("latest_show_time_", mqi0.m155944o());
            conversationCounterTypeSp.set("today_show_times_", 0);
        }
        if (conversationCounterTypeSp.get("today_show_times_") >= 3) {
            return false;
        }
        if (conversationCounterTypeSp.get("ideal_guide_conv_show_flag_" + str) <= 0 && insertLocalMsgTriggerType == InsertLocalMsgTriggerType.CONV_MSG_CHANGE && conversation.f20374mm >= 5 && NullChecker.m81303a(message) && message.isMe()) {
            conversationCounterTypeSp.set("ideal_guide_conv_show_flag_" + str, 1);
            return true;
        }
        return false;
    }
}
