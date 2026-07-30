package p003l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p000p1.mobile.putong.core.p001ui.messages.manager.insert.LocalMsgInsertType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.LoveLetterContent;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.mqi0;
import l.vwb;
import l.wxz;
import l.y19;
import org.eclipse.jetty.servlet.ServletHandler;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class fuv implements hul {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4457d(LoveLetterContent loveLetterContent, Message message) {
        loveLetterContent.triggerType = 2;
        message.localExtraInfo = loveLetterContent.toJson();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m4458e(LoveLetterContent loveLetterContent, Message message) {
        loveLetterContent.triggerType = 1;
        message.localExtraInfo = loveLetterContent.toJson();
    }

    @Override // p003l.hul
    /* JADX INFO: renamed from: a */
    public LocalMsgInsertType mo3175a() {
        return LocalMsgInsertType.LOVE_LETTER_GUIDE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00d4  */
    @Override // p003l.hul
    /* JADX INFO: renamed from: b */
    public void mo3176b(Conversation conversation, @Nullable Message message, @Nullable User user, User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, C1185a<Boolean> c1185a) {
        if (insertLocalMsgTriggerType != InsertLocalMsgTriggerType.CONV_MSG_CHANGE) {
            if (insertLocalMsgTriggerType == InsertLocalMsgTriggerType.PAGE_FINISH) {
                CoreModule.c.f0.Qf(((DbObject) conversation).id, vwb.f0(new String[]{"local_love_letter_guide"}));
                c1185a.onNext(Boolean.TRUE);
                return;
            }
            return;
        }
        if (CoreModule.k.c.count(Filter.AND(new Filter[]{Message.CID.EQ(((DbObject) conversation).id), Message.MESSAGETYPE.EQ("local_love_letter_guide")}), 1) > 0) {
            c1185a.onNext(Boolean.FALSE);
            return;
        }
        int iN = y19.n();
        int iQ = y19.q();
        wxz wxzVar = CoreModule.k.c;
        String str = ((DbObject) conversation).id;
        List listJ = wxzVar.t0(str, str, iN).j();
        List listJ2 = CoreModule.k.c.t0(((DbObject) conversation).id, ((DbObject) user2).id, iN).j();
        if (listJ.size() > iN) {
            double d = ((long) iQ) * 3600000;
            if (mqi0.o() - ((Message) listJ.get(iN)).createdTime <= d && listJ2.size() > iN) {
                if (mqi0.o() - ((Message) listJ2.get(iN)).createdTime <= d) {
                    try {
                        final LoveLetterContent loveLetterContent = (LoveLetterContent) CoreModule.c.e0.v7(((DbObject) conversation).id).toBlocking().m8883b();
                        CoreModule.c.f0.ch(((DbObject) conversation).id, MessageType.get("local_love_letter_guide"), new e30() { // from class: l.duv
                            @Override // p003l.e30
                            public final void call(Object obj) {
                                fuv.m4457d(loveLetterContent, (Message) obj);
                            }
                        });
                        ConversationCounterTypeSp.LoveLetterGuideShowTime.setLong("love_letter_show_time_", mqi0.o());
                        c1185a.onNext(Boolean.TRUE);
                        return;
                    } catch (Exception e) {
                        CrashHelper.c(e);
                        c1185a.onNext(Boolean.FALSE);
                        return;
                    }
                }
            }
        }
        int iO = y19.o();
        int iP = y19.p();
        if (iO >= listJ2.size() || ((listJ.size() != 0 && ((Message) listJ.get(0)).createdTime >= ((Message) listJ2.get(iO - 1)).createdTime) || mqi0.o() - ((Message) listJ2.get(0)).createdTime <= ((long) iP) * 3600000)) {
            c1185a.onNext(Boolean.FALSE);
            return;
        }
        try {
            final LoveLetterContent loveLetterContent2 = (LoveLetterContent) CoreModule.c.e0.v7(((DbObject) conversation).id).toBlocking().m8883b();
            if (!NullChecker.a(loveLetterContent2)) {
                c1185a.onNext(Boolean.FALSE);
                return;
            }
            CoreModule.c.f0.ch(((DbObject) conversation).id, MessageType.get("local_love_letter_guide"), new e30() { // from class: l.euv
                @Override // p003l.e30
                public final void call(Object obj) {
                    fuv.m4458e(loveLetterContent2, (Message) obj);
                }
            });
            ConversationCounterTypeSp.LoveLetterGuideShowTime.setLong("love_letter_show_time_", mqi0.o());
            c1185a.onNext(Boolean.TRUE);
        } catch (Exception e2) {
            CrashHelper.c(e2);
            c1185a.onNext(Boolean.FALSE);
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
        return !(NullChecker.a(message) && ((DbObject) message).id.startsWith("fake_id_")) && conversation.status == ConversationStatus.get(ServletHandler.__DEFAULT_SERVLET) && TextUtils.equals(conversation.convType, ServletHandler.__DEFAULT_SERVLET) && TextUtils.equals(conversation.otherStatus, ServletHandler.__DEFAULT_SERVLET) && (message == null || !TEnum.equals(message.messageType, "local_love_letter_guide")) && CoreModule.c.e0.na().isPicVerificationVerified() && CoreModule.P().a().k3() && !m4459f();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4459f() {
        return mqi0.o() - ConversationCounterTypeSp.LoveLetterGuideShowTime.getLong("love_letter_show_time_") < ((long) y19.m()) * 3600000;
    }
}
