package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.LoveLetterContent;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p051p1.mobile.putong.core.p058ui.messages.manager.insert.LocalMsgInsertType;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class gwv implements vwl {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m132701d(LoveLetterContent loveLetterContent, Message message) {
        loveLetterContent.triggerType = 2;
        message.localExtraInfo = loveLetterContent.toJson();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m132702e(LoveLetterContent loveLetterContent, Message message) {
        loveLetterContent.triggerType = 1;
        message.localExtraInfo = loveLetterContent.toJson();
    }

    @Override // p153l.vwl
    /* JADX INFO: renamed from: a */
    public LocalMsgInsertType mo112939a() {
        return LocalMsgInsertType.LOVE_LETTER_GUIDE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00d4  */
    @Override // p153l.vwl
    /* JADX INFO: renamed from: b */
    public void mo112940b(Conversation conversation, @Nullable Message message, @Nullable User user, User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, C22507a<Boolean> c22507a) {
        if (insertLocalMsgTriggerType != InsertLocalMsgTriggerType.CONV_MSG_CHANGE) {
            if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_FINISH) {
                CoreModule.f18264c.f20384f0.m33777Qf(conversation.f56859id, jyb.m147507f0(MessageType.local_love_letter_guide));
                c22507a.m137019l(Boolean.TRUE);
                return;
            }
            return;
        }
        if (CoreModule.f18272k.f115535c.count(Filter.AND(Message.CID.mo61359EQ(conversation.f56859id), Message.MESSAGETYPE.m61360EQ(MessageType.local_love_letter_guide)), 1) > 0) {
            c22507a.m137019l(Boolean.FALSE);
            return;
        }
        int iM133450n = h39.m133450n();
        int iM133453q = h39.m133453q();
        t600 t600Var = CoreModule.f18272k.f115535c;
        String str = conversation.f56859id;
        List<T> listM208674j = t600Var.m189484t0(str, str, iM133450n).m208674j();
        List<T> listM208674j2 = CoreModule.f18272k.f115535c.m189484t0(conversation.f56859id, user2.f56859id, iM133450n).m208674j();
        if (listM208674j.size() > iM133450n) {
            double d = ((long) iM133453q) * 3600000;
            if (pzi0.m174454o() - ((Message) listM208674j.get(iM133450n)).createdTime <= d && listM208674j2.size() > iM133450n) {
                if (pzi0.m174454o() - ((Message) listM208674j2.get(iM133450n)).createdTime <= d) {
                    try {
                        final LoveLetterContent loveLetterContentM165963b = CoreModule.f18264c.f20381e0.m116622v7(conversation.f56859id).toBlocking().m165963b();
                        CoreModule.f18264c.f20384f0.m33921ch(conversation.f56859id, MessageType.get(MessageType.local_love_letter_guide), new y20() { // from class: l.ewv
                            @Override // p153l.y20
                            public final void call(Object obj) {
                                gwv.m132701d(loveLetterContentM165963b, (Message) obj);
                            }
                        });
                        ConversationCounterTypeSp.LoveLetterGuideShowTime.setLong("love_letter_show_time_", pzi0.m174454o());
                        c22507a.m137019l(Boolean.TRUE);
                        return;
                    } catch (Exception e) {
                        CrashHelper.m82479c(e);
                        c22507a.m137019l(Boolean.FALSE);
                        return;
                    }
                }
            }
        }
        int iM133451o = h39.m133451o();
        int iM133452p = h39.m133452p();
        if (iM133451o >= listM208674j2.size() || ((listM208674j.size() != 0 && ((Message) listM208674j.get(0)).createdTime >= ((Message) listM208674j2.get(iM133451o - 1)).createdTime) || pzi0.m174454o() - ((Message) listM208674j2.get(0)).createdTime <= ((long) iM133452p) * 3600000)) {
            c22507a.m137019l(Boolean.FALSE);
            return;
        }
        try {
            final LoveLetterContent loveLetterContentM165963b2 = CoreModule.f18264c.f20381e0.m116622v7(conversation.f56859id).toBlocking().m165963b();
            if (!NullChecker.m82486a(loveLetterContentM165963b2)) {
                c22507a.m137019l(Boolean.FALSE);
                return;
            }
            CoreModule.f18264c.f20384f0.m33921ch(conversation.f56859id, MessageType.get(MessageType.local_love_letter_guide), new y20() { // from class: l.fwv
                @Override // p153l.y20
                public final void call(Object obj) {
                    gwv.m132702e(loveLetterContentM165963b2, (Message) obj);
                }
            });
            ConversationCounterTypeSp.LoveLetterGuideShowTime.setLong("love_letter_show_time_", pzi0.m174454o());
            c22507a.m137019l(Boolean.TRUE);
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
            c22507a.m137019l(Boolean.FALSE);
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
        return !(NullChecker.m82486a(message) && message.f56859id.startsWith("fake_id_")) && conversation.status == ConversationStatus.get("default") && TextUtils.equals(conversation.convType, "default") && TextUtils.equals(conversation.otherStatus, "default") && (message == null || !TEnum.equals(message.messageType, MessageType.local_love_letter_guide)) && CoreModule.f18264c.f20381e0.m116593na().isPicVerificationVerified() && CoreModule.m30933P().m143405a().mo180493k3() && !m132703f();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m132703f() {
        return pzi0.m174454o() - ConversationCounterTypeSp.LoveLetterGuideShowTime.getLong("love_letter_show_time_") < ((long) h39.m133449m()) * 3600000;
    }
}
