package p003l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.inner.data.MsgIcebreakType;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.Callable;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.tpd0;
import l.vwb;
import l.wmz;
import l.y19;
import l.zpd0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class kxe implements a9m {

    /* JADX INFO: renamed from: a */
    public final bpz f5115a;

    /* JADX INFO: renamed from: b */
    public final wmz f5116b;

    /* JADX INFO: renamed from: c */
    public int f5117c = 0;

    public kxe(bpz bpzVar, wmz wmzVar) {
        this.f5115a = bpzVar;
        this.f5116b = wmzVar;
    }

    @Override // p003l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo2765a(@Nullable Conversation conversation, @Nullable User user) {
        return false;
    }

    @Override // p003l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C1099c<Boolean> mo2766b() {
        return C1099c.fromCallable(new Callable() { // from class: l.ixe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4519a.m5898h();
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.jxe
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f4754a.m5899i((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final Act m5895e() {
        return this.f5116b.act();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX INFO: renamed from: f */
    public final int m5896f(List<Message> list, List<Message> list2) {
        int i;
        if (vwb.J(list) && vwb.J(list2)) {
            return 2;
        }
        Message message = null;
        MessagesAct messagesAct = m5895e() instanceof MessagesAct ? (MessagesAct) m5895e() : null;
        if (!vwb.J(list) && vwb.J(list2) && NullChecker.a(messagesAct)) {
            ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.aEmojiIceBreakingNoReplyTime;
            g gVar = CoreModule.c.f0;
            if (m5897g(conversationCounterTypeSp, gVar.N0, gVar.M0, y19.v().max_times_of_showing_recommend_sticker_b) && messagesAct.m2073z2()) {
                i = 4;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (i == 0 && NullChecker.a(messagesAct) && !messagesAct.m2073z2()) {
            ConversationCounterTypeSp conversationCounterTypeSp2 = ConversationCounterTypeSp.aEmojiIceBreakingMessageTimeLimitTime;
            g gVar2 = CoreModule.c.f0;
            if (m5897g(conversationCounterTypeSp2, gVar2.P0, gVar2.O0, y19.v().max_times_of_showing_recommend_sticker_c)) {
                if (!vwb.J(list) && !vwb.J(list2)) {
                    message = list.get(0).createdTime > list2.get(0).createdTime ? list.get(0) : list2.get(0);
                } else if (!vwb.J(list)) {
                    message = list.get(0);
                } else if (!vwb.J(list2)) {
                    message = list2.get(0);
                }
                if (NullChecker.a(message) && mqi0.o() - message.createdTime > ((long) y19.v().max_days_since_last_message) * 86400000) {
                    return 5;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5897g(ConversationCounterTypeSp conversationCounterTypeSp, tpd0 tpd0Var, zpd0 zpd0Var, int i) {
        return !mqi0.C(((long) conversationCounterTypeSp.get(this.f5116b.r3())) * 1000, mqi0.o()) && (!mqi0.C(((Long) zpd0Var.get()).longValue(), mqi0.o()) || ((Integer) tpd0Var.get()).intValue() < i);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ j760 m5898h() throws Exception {
        return vwb.Y(CoreModule.k.c.G(this.f5116b.r3(), CoreModule.H().userId()), CoreModule.k.c.G(this.f5116b.r3(), this.f5116b.r3()));
    }

    @Override // p003l.a9m
    public boolean handle() {
        return this.f5115a.m3115g5(this.f5117c, false);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m5899i(j760 j760Var) {
        List<Message> list = (List) j760Var.a;
        List<Message> list2 = (List) j760Var.b;
        MsgIcebreakType msgIcebreakTypeK = y19.k();
        if (msgIcebreakTypeK == MsgIcebreakType.NONE || (vwb.J(list) && vwb.J(list2) && this.f5116b.m4255j3().mm == 0 && msgIcebreakTypeK == MsgIcebreakType.TEXT_BREAK)) {
            return Boolean.FALSE;
        }
        int iM5896f = y19.G() ? m5896f(list2, list) : m5900j(list2, list);
        this.f5117c = iM5896f;
        return Boolean.valueOf(iM5896f != 0);
    }

    /* JADX INFO: renamed from: j */
    public final int m5900j(List<Message> list, List<Message> list2) {
        if (vwb.J(list) && vwb.J(list2)) {
            return 2;
        }
        return (vwb.J(list) || (!vwb.J(list2) && list.get(0).createdTime <= list2.get(0).createdTime)) ? 0 : 3;
    }
}
