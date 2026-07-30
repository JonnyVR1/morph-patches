package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.inner.data.MsgIcebreakType;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.Callable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class kxe implements a9m {

    /* JADX INFO: renamed from: a */
    public final bpz f125102a;

    /* JADX INFO: renamed from: b */
    public final wmz f125103b;

    /* JADX INFO: renamed from: c */
    public int f125104c = 0;

    public kxe(bpz bpzVar, wmz wmzVar) {
        this.f125102a = bpzVar;
        this.f125103b = wmzVar;
    }

    @Override // p149l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo95447a(@Nullable Conversation conversation, @Nullable User user) {
        return false;
    }

    @Override // p149l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22306c<Boolean> mo95448b() {
        return C22306c.fromCallable(new Callable() { // from class: l.ixe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f115356a.m147743h();
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.jxe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120219a.m147744i((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final Act m147740e() {
        return this.f125103b.act();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX INFO: renamed from: f */
    public final int m147741f(List<Message> list, List<Message> list2) {
        int i;
        if (vwb.m200296J(list) && vwb.m200296J(list2)) {
            return 2;
        }
        Message message = null;
        MessagesAct messagesAct = m147740e() instanceof MessagesAct ? (MessagesAct) m147740e() : null;
        if (!vwb.m200296J(list) && vwb.m200296J(list2) && NullChecker.m81303a(messagesAct)) {
            ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.aEmojiIceBreakingNoReplyTime;
            C4740g c4740g = CoreModule.f17545c.f19642f0;
            if (m147742g(conversationCounterTypeSp, c4740g.f19880N0, c4740g.f19877M0, y19.m212187v().max_times_of_showing_recommend_sticker_b) && messagesAct.m48981z2()) {
                i = 4;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (i == 0 && NullChecker.m81303a(messagesAct) && !messagesAct.m48981z2()) {
            ConversationCounterTypeSp conversationCounterTypeSp2 = ConversationCounterTypeSp.aEmojiIceBreakingMessageTimeLimitTime;
            C4740g c4740g2 = CoreModule.f17545c.f19642f0;
            if (m147742g(conversationCounterTypeSp2, c4740g2.f19886P0, c4740g2.f19883O0, y19.m212187v().max_times_of_showing_recommend_sticker_c)) {
                if (!vwb.m200296J(list) && !vwb.m200296J(list2)) {
                    message = list.get(0).createdTime > list2.get(0).createdTime ? list.get(0) : list2.get(0);
                } else if (!vwb.m200296J(list)) {
                    message = list.get(0);
                } else if (!vwb.m200296J(list2)) {
                    message = list2.get(0);
                }
                if (NullChecker.m81303a(message) && mqi0.m155944o() - message.createdTime > ((long) y19.m212187v().max_days_since_last_message) * 86400000) {
                    return 5;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m147742g(ConversationCounterTypeSp conversationCounterTypeSp, tpd0 tpd0Var, zpd0 zpd0Var, int i) {
        return !mqi0.m155928C(((long) conversationCounterTypeSp.get(this.f125103b.mo120828r3())) * 1000, mqi0.m155944o()) && (!mqi0.m155928C(zpd0Var.get().longValue(), mqi0.m155944o()) || tpd0Var.get().intValue() < i);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ j760 m147743h() throws Exception {
        return vwb.m200311Y(CoreModule.f17553k.f91940c.m206049G(this.f125103b.mo120828r3(), CoreModule.m29931H().userId()), CoreModule.f17553k.f91940c.m206049G(this.f125103b.mo120828r3(), this.f125103b.mo120828r3()));
    }

    @Override // p149l.a9m
    public boolean handle() {
        return this.f125102a.m103235g5(this.f125104c, false);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m147744i(j760 j760Var) {
        List<Message> list = (List) j760Var.f116564a;
        List<Message> list2 = (List) j760Var.f116565b;
        MsgIcebreakType msgIcebreakTypeM212176k = y19.m212176k();
        if (msgIcebreakTypeM212176k == MsgIcebreakType.NONE || (vwb.m200296J(list) && vwb.m200296J(list2) && this.f125103b.m120788j3().f20374mm == 0 && msgIcebreakTypeM212176k == MsgIcebreakType.TEXT_BREAK)) {
            return Boolean.FALSE;
        }
        int iM147741f = y19.m212147G() ? m147741f(list2, list) : m147745j(list2, list);
        this.f125104c = iM147741f;
        return Boolean.valueOf(iM147741f != 0);
    }

    /* JADX INFO: renamed from: j */
    public final int m147745j(List<Message> list, List<Message> list2) {
        if (vwb.m200296J(list) && vwb.m200296J(list2)) {
            return 2;
        }
        return (vwb.m200296J(list) || (!vwb.m200296J(list2) && list.get(0).createdTime <= list2.get(0).createdTime)) ? 0 : 3;
    }
}
