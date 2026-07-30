package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.inner.data.MsgIcebreakType;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.Callable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class oye implements qbm {

    /* JADX INFO: renamed from: a */
    public final yxz f149788a;

    /* JADX INFO: renamed from: b */
    public final tvz f149789b;

    /* JADX INFO: renamed from: c */
    public int f149790c = 0;

    public oye(yxz yxzVar, tvz tvzVar) {
        this.f149788a = yxzVar;
        this.f149789b = tvzVar;
    }

    @Override // p153l.qbm
    /* JADX INFO: renamed from: a */
    public boolean mo119523a(@Nullable Conversation conversation, @Nullable User user) {
        return false;
    }

    @Override // p153l.qbm
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22421c<Boolean> mo119524b() {
        return C22421c.fromCallable(new Callable() { // from class: l.mye
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f139409a.m169855h();
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.nye
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f144303a.m169856i((pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final Act m169852e() {
        return this.f149789b.act();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX INFO: renamed from: f */
    public final int m169853f(List<Message> list, List<Message> list2) {
        int i;
        if (jyb.m147479J(list) && jyb.m147479J(list2)) {
            return 2;
        }
        Message message = null;
        MessagesAct messagesAct = m169852e() instanceof MessagesAct ? (MessagesAct) m169852e() : null;
        if (!jyb.m147479J(list) && jyb.m147479J(list2) && NullChecker.m82486a(messagesAct)) {
            ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.aEmojiIceBreakingNoReplyTime;
            C4891g c4891g = CoreModule.f18264c.f20384f0;
            if (m169854g(conversationCounterTypeSp, c4891g.f20622N0, c4891g.f20619M0, h39.m133458v().max_times_of_showing_recommend_sticker_b) && messagesAct.m50137A2()) {
                i = 4;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (i == 0 && NullChecker.m82486a(messagesAct) && !messagesAct.m50137A2()) {
            ConversationCounterTypeSp conversationCounterTypeSp2 = ConversationCounterTypeSp.aEmojiIceBreakingMessageTimeLimitTime;
            C4891g c4891g2 = CoreModule.f18264c.f20384f0;
            if (m169854g(conversationCounterTypeSp2, c4891g2.f20628P0, c4891g2.f20625O0, h39.m133458v().max_times_of_showing_recommend_sticker_c)) {
                if (!jyb.m147479J(list) && !jyb.m147479J(list2)) {
                    message = list.get(0).createdTime > list2.get(0).createdTime ? list.get(0) : list2.get(0);
                } else if (!jyb.m147479J(list)) {
                    message = list.get(0);
                } else if (!jyb.m147479J(list2)) {
                    message = list2.get(0);
                }
                if (NullChecker.m82486a(message) && pzi0.m174454o() - message.createdTime > ((long) h39.m133458v().max_days_since_last_message) * 86400000) {
                    return 5;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m169854g(ConversationCounterTypeSp conversationCounterTypeSp, vxd0 vxd0Var, byd0 byd0Var, int i) {
        return !pzi0.m174438C(((long) conversationCounterTypeSp.get(this.f149789b.mo111034r3())) * 1000, pzi0.m174454o()) && (!pzi0.m174438C(byd0Var.get().longValue(), pzi0.m174454o()) || vxd0Var.get().intValue() < i);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ pf60 m169855h() throws Exception {
        return jyb.m147494Y(CoreModule.f18272k.f115535c.m189445G(this.f149789b.mo111034r3(), CoreModule.m30929H().userId()), CoreModule.f18272k.f115535c.m189445G(this.f149789b.mo111034r3(), this.f149789b.mo111034r3()));
    }

    @Override // p153l.qbm
    public boolean handle() {
        return this.f149788a.m217876g5(this.f149790c, false);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m169856i(pf60 pf60Var) {
        List<Message> list = (List) pf60Var.f152156a;
        List<Message> list2 = (List) pf60Var.f152157b;
        MsgIcebreakType msgIcebreakTypeM133447k = h39.m133447k();
        if (msgIcebreakTypeM133447k == MsgIcebreakType.NONE || (jyb.m147479J(list) && jyb.m147479J(list2) && this.f149789b.m110994j3().f21116mm == 0 && msgIcebreakTypeM133447k == MsgIcebreakType.TEXT_BREAK)) {
            return Boolean.FALSE;
        }
        int iM169853f = h39.m133418G() ? m169853f(list2, list) : m169857j(list2, list);
        this.f149790c = iM169853f;
        return Boolean.valueOf(iM169853f != 0);
    }

    /* JADX INFO: renamed from: j */
    public final int m169857j(List<Message> list, List<Message> list2) {
        if (jyb.m147479J(list) && jyb.m147479J(list2)) {
            return 2;
        }
        return (jyb.m147479J(list) || (!jyb.m147479J(list2) && list.get(0).createdTime <= list2.get(0).createdTime)) ? 0 : 3;
    }
}
