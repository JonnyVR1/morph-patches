package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.Callable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class dxa0 extends axa0 {
    public dxa0(bpz bpzVar, wmz wmzVar) {
        super(bpzVar, wmzVar);
    }

    @Override // p149l.axa0, p149l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo95447a(@Nullable Conversation conversation, @Nullable User user) {
        return NullChecker.m81303a(conversation) && y19.m212150J() && !User.isTeamAccount(this.f72139b.mo120828r3()) && NullChecker.m81303a(user) && !user.isBannedNew() && !user.isAccountCancellation() && TextUtils.equals(conversation.convType, "default") && TEnum.equals(conversation.status, "default") && TextUtils.isEmpty(conversation.localDraft) && conversation.f20374mm == 0 && conversation.userMessageCount == 1 && !m113996k(this.f72139b.mo120828r3()) && !mo99392d() && !mo99393e(true) && !mo99394f(true);
    }

    @Override // p149l.axa0, p149l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22306c<Boolean> mo95448b() {
        return C22306c.fromCallable(new Callable() { // from class: l.bxa0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f77774a.m113997l();
            }
        }).compose(mkd0.m154951C()).switchMap(new w9j() { // from class: l.cxa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f82861a.m113998m((Boolean) obj);
            }
        });
    }

    @Override // p149l.axa0
    /* JADX INFO: renamed from: d */
    public boolean mo99392d() {
        return mqi0.m155929D(CoreModule.f17545c.f19642f0.f19884O1.get().longValue());
    }

    @Override // p149l.axa0
    /* JADX INFO: renamed from: e */
    public boolean mo99393e(boolean z) {
        return mqi0.m155929D(CoreModule.f17545c.f19642f0.f19878M1.get().longValue()) && CoreModule.f17545c.f19642f0.f19875L1.get().intValue() >= y19.m212142B(z);
    }

    @Override // p149l.axa0
    /* JADX INFO: renamed from: f */
    public boolean mo99394f(boolean z) {
        return !mqi0.m155929D(CoreModule.f17545c.f19642f0.f19878M1.get().longValue()) && CoreModule.f17545c.f19642f0.f19881N1.get().intValue() >= y19.m212191z(z);
    }

    @Override // p149l.axa0, p149l.a9m
    public boolean handle() {
        ConversationCounterTypeSp.PrologueNotResponseGuideLastShowTime.setLong(this.f72139b.f96910b, mqi0.m155944o());
        return this.f72138a.m103246l5(this.f72140c, "no_reply");
    }

    /* JADX INFO: renamed from: k */
    public final boolean m113996k(String str) {
        return mqi0.m155929D(ConversationCounterTypeSp.PrologueNotResponseGuideLastShowTime.getLong(str));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Boolean m113997l() throws Exception {
        List<Message> listM206049G = CoreModule.f17553k.f91940c.m206049G(this.f72139b.mo120828r3(), CoreModule.m29931H().userId());
        List<Message> listM206049G2 = CoreModule.f17553k.f91940c.m206049G(this.f72139b.mo120828r3(), this.f72139b.mo120828r3());
        Conversation conversationM32735Mo = CoreModule.f17545c.f19642f0.m32735Mo(this.f72139b.mo120828r3());
        boolean z = false;
        if (vwb.m200296J(listM206049G2) && listM206049G.size() == 1 && Long.parseLong(listM206049G.get(0).f56011id) == Long.parseLong(conversationM32735Mo.otherReadUntil) && !TEnum.equals(listM206049G.get(0).messageType, "prologue") && this.f72139b.m120788j3().f20374mm == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C22306c m113998m(Boolean bool) {
        return bool.booleanValue() ? super.mo95448b() : C22306c.just(Boolean.FALSE);
    }
}
