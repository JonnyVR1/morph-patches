package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.IdealInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p051p1.mobile.putong.core.p058ui.messages.manager.insert.LocalMsgInsertType;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.IdealTag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class zvv implements vwl {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m221810d(User user, final Conversation conversation, final C22507a c22507a, IdealInfo idealInfo) {
        if (!NullChecker.m82486a(idealInfo) || jyb.m147479J(idealInfo.targetFitIdeals)) {
            c22507a.m137019l(Boolean.FALSE);
            return;
        }
        List<IdealTag> list = idealInfo.targetFitIdeals;
        if (jyb.m147479J(list)) {
            c22507a.m137019l(Boolean.FALSE);
            return;
        }
        List<IdealTag> arrayList = (NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.basic)) ? user.profile.extensions.basic.ideal : null;
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
            } while (!TextUtils.equals(it.next().f39608id, idealTag.f39608id));
        }
        if (jyb.m147479J(arrayList2)) {
            c22507a.m137019l(Boolean.FALSE);
        } else {
            CoreModule.f18264c.f20384f0.m33921ch(conversation.f56859id, MessageType.get(MessageType.local_ideal_enquiry), new y20() { // from class: l.xvv
                @Override // p153l.y20
                public final void call(Object obj) {
                    zvv.m221812f(conversation, arrayList2, (Message) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.yvv
                @Override // p153l.y20
                public final void call(Object obj) {
                    c22507a.m137019l(Boolean.TRUE);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m221812f(Conversation conversation, List list, Message message) {
        message.owner = conversation.f56859id;
        try {
            IdealInfo idealInfoNew_ = IdealInfo.new_();
            idealInfoNew_.fitIdeals = list;
            message.localExtraInfo = idealInfoNew_.toJson();
        } catch (Exception unused) {
        }
    }

    @Override // p153l.vwl
    /* JADX INFO: renamed from: a */
    public LocalMsgInsertType mo112939a() {
        return LocalMsgInsertType.IDEAL_GUIDE_MSG;
    }

    @Override // p153l.vwl
    /* JADX INFO: renamed from: b */
    public void mo112940b(final Conversation conversation, @Nullable Message message, @Nullable User user, final User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, final C22507a<Boolean> c22507a) {
        String str = conversation.f56859id;
        if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.CONV_MSG_CHANGE) {
            ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.IdealGuideMsg;
            conversationCounterTypeSp.set("ideal_guide_all_show_count_", conversationCounterTypeSp.get("ideal_guide_all_show_count_") + 1);
            conversationCounterTypeSp.set("today_show_times_");
            CoreModule.f18264c.f20381e0.m116610s7(str, "chat").first().timeout(3000L, TimeUnit.SECONDS).subscribe(psd0.m173597H(new y20() { // from class: l.vvv
                @Override // p153l.y20
                public final void call(Object obj) {
                    zvv.m221810d(user2, conversation, c22507a, (IdealInfo) obj);
                }
            }, new y20() { // from class: l.wvv
                @Override // p153l.y20
                public final void call(Object obj) {
                    c22507a.m137019l(Boolean.FALSE);
                }
            }));
            return;
        }
        if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_FINISH) {
            ConversationCounterTypeSp conversationCounterTypeSp2 = ConversationCounterTypeSp.IdealGuideMsg;
            if (conversationCounterTypeSp2.get("ideal_guide_conv_show_flag_" + str) == 1) {
                conversationCounterTypeSp2.set("ideal_guide_conv_show_flag_" + str, 2);
            }
            CoreModule.f18264c.f20384f0.m33777Qf(conversation.f56859id, jyb.m147507f0(MessageType.local_ideal_enquiry));
            c22507a.m137019l(Boolean.TRUE);
        }
    }

    @Override // p153l.vwl
    /* JADX INFO: renamed from: c */
    public boolean mo112941c(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, @Nullable Message message, User user) {
        if (User.isTeamAccount(conversation.f56859id)) {
            return false;
        }
        if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_FINISH) {
            return true;
        }
        if (!gta.m132210e().m132214d().mo34911qf()) {
            return false;
        }
        if ((NullChecker.m82486a(message) && message.f56859id.startsWith("fake_id_")) || conversation.status != ConversationStatus.get("default") || !TextUtils.equals(conversation.convType, "default") || !TextUtils.equals(conversation.otherStatus, "default") || conversation.f21116mm < 5) {
            return false;
        }
        String str = conversation.f56859id;
        ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.IdealGuideMsg;
        if (conversationCounterTypeSp.get("ideal_guide_all_show_count_") >= 3) {
            return false;
        }
        if (!pzi0.m174439D(conversationCounterTypeSp.getLong("latest_show_time_"))) {
            conversationCounterTypeSp.setLong("latest_show_time_", pzi0.m174454o());
            conversationCounterTypeSp.set("today_show_times_", 0);
        }
        if (conversationCounterTypeSp.get("today_show_times_") >= 3) {
            return false;
        }
        if (conversationCounterTypeSp.get("ideal_guide_conv_show_flag_" + str) <= 0 && insertLocalMsgTriggerType == InsertLocalMsgTriggerType.CONV_MSG_CHANGE && conversation.f21116mm >= 5 && NullChecker.m82486a(message) && message.isMe()) {
            conversationCounterTypeSp.set("ideal_guide_conv_show_flag_" + str, 1);
            return true;
        }
        return false;
    }
}
