package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.LoveLetterContent;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p046p1.mobile.putong.core.p053ui.messages.manager.insert.LocalMsgInsertType;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class fuv implements hul {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m123217d(LoveLetterContent loveLetterContent, Message message) {
        loveLetterContent.triggerType = 2;
        message.localExtraInfo = loveLetterContent.toJson();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m123218e(LoveLetterContent loveLetterContent, Message message) {
        loveLetterContent.triggerType = 1;
        message.localExtraInfo = loveLetterContent.toJson();
    }

    @Override // p149l.hul
    /* JADX INFO: renamed from: a */
    public LocalMsgInsertType mo103994a() {
        return LocalMsgInsertType.LOVE_LETTER_GUIDE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00d4  */
    @Override // p149l.hul
    /* JADX INFO: renamed from: b */
    public void mo103995b(Conversation conversation, @Nullable Message message, @Nullable User user, User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, C22392a<Boolean> c22392a) {
        if (insertLocalMsgTriggerType != InsertLocalMsgTriggerType.CONV_MSG_CHANGE) {
            if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_FINISH) {
                CoreModule.f17545c.f19642f0.m32774Qf(conversation.f56011id, vwb.m200324f0(MessageType.local_love_letter_guide));
                c22392a.m132487l(Boolean.TRUE);
                return;
            }
            return;
        }
        if (CoreModule.f17553k.f91940c.count(Filter.AND(Message.CID.mo60175EQ(conversation.f56011id), Message.MESSAGETYPE.m60176EQ(MessageType.local_love_letter_guide)), 1) > 0) {
            c22392a.m132487l(Boolean.FALSE);
            return;
        }
        int iM212179n = y19.m212179n();
        int iM212182q = y19.m212182q();
        wxz wxzVar = CoreModule.f17553k.f91940c;
        String str = conversation.f56011id;
        List<T> listM165617j = wxzVar.m206088t0(str, str, iM212179n).m165617j();
        List<T> listM165617j2 = CoreModule.f17553k.f91940c.m206088t0(conversation.f56011id, user2.f56011id, iM212179n).m165617j();
        if (listM165617j.size() > iM212179n) {
            double d = ((long) iM212182q) * 3600000;
            if (mqi0.m155944o() - ((Message) listM165617j.get(iM212179n)).createdTime <= d && listM165617j2.size() > iM212179n) {
                if (mqi0.m155944o() - ((Message) listM165617j2.get(iM212179n)).createdTime <= d) {
                    try {
                        final LoveLetterContent loveLetterContentM212770b = CoreModule.f17545c.f19639e0.m169549v7(conversation.f56011id).toBlocking().m212770b();
                        CoreModule.f17545c.f19642f0.m32918ch(conversation.f56011id, MessageType.get(MessageType.local_love_letter_guide), new e30() { // from class: l.duv
                            @Override // p149l.e30
                            public final void call(Object obj) {
                                fuv.m123217d(loveLetterContentM212770b, (Message) obj);
                            }
                        });
                        ConversationCounterTypeSp.LoveLetterGuideShowTime.setLong("love_letter_show_time_", mqi0.m155944o());
                        c22392a.m132487l(Boolean.TRUE);
                        return;
                    } catch (Exception e) {
                        CrashHelper.m81296c(e);
                        c22392a.m132487l(Boolean.FALSE);
                        return;
                    }
                }
            }
        }
        int iM212180o = y19.m212180o();
        int iM212181p = y19.m212181p();
        if (iM212180o >= listM165617j2.size() || ((listM165617j.size() != 0 && ((Message) listM165617j.get(0)).createdTime >= ((Message) listM165617j2.get(iM212180o - 1)).createdTime) || mqi0.m155944o() - ((Message) listM165617j2.get(0)).createdTime <= ((long) iM212181p) * 3600000)) {
            c22392a.m132487l(Boolean.FALSE);
            return;
        }
        try {
            final LoveLetterContent loveLetterContentM212770b2 = CoreModule.f17545c.f19639e0.m169549v7(conversation.f56011id).toBlocking().m212770b();
            if (!NullChecker.m81303a(loveLetterContentM212770b2)) {
                c22392a.m132487l(Boolean.FALSE);
                return;
            }
            CoreModule.f17545c.f19642f0.m32918ch(conversation.f56011id, MessageType.get(MessageType.local_love_letter_guide), new e30() { // from class: l.euv
                @Override // p149l.e30
                public final void call(Object obj) {
                    fuv.m123218e(loveLetterContentM212770b2, (Message) obj);
                }
            });
            ConversationCounterTypeSp.LoveLetterGuideShowTime.setLong("love_letter_show_time_", mqi0.m155944o());
            c22392a.m132487l(Boolean.TRUE);
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
            c22392a.m132487l(Boolean.FALSE);
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
        return !(NullChecker.m81303a(message) && message.f56011id.startsWith("fake_id_")) && conversation.status == ConversationStatus.get("default") && TextUtils.equals(conversation.convType, "default") && TextUtils.equals(conversation.otherStatus, "default") && (message == null || !TEnum.equals(message.messageType, MessageType.local_love_letter_guide)) && CoreModule.f17545c.f19639e0.m169520na().isPicVerificationVerified() && CoreModule.m29935P().m94651a().mo158401k3() && !m123219f();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m123219f() {
        return mqi0.m155944o() - ConversationCounterTypeSp.LoveLetterGuideShowTime.getLong("love_letter_show_time_") < ((long) y19.m212178m()) * 3600000;
    }
}
