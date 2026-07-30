package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Prologue;
import com.p046p1.mobile.putong.core.data.QuestionnaireScene;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class axa0 implements a9m, m8m<List<Prologue>> {

    /* JADX INFO: renamed from: a */
    public final bpz f72138a;

    /* JADX INFO: renamed from: b */
    public final wmz f72139b;

    /* JADX INFO: renamed from: c */
    public List<Prologue> f72140c;

    public axa0(bpz bpzVar, wmz wmzVar) {
        this.f72138a = bpzVar;
        this.f72139b = wmzVar;
    }

    @Override // p149l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo95447a(@Nullable Conversation conversation, @Nullable User user) {
        return NullChecker.m81303a(conversation) && y19.m212150J() && !User.isTeamAccount(this.f72139b.mo120828r3()) && NullChecker.m81303a(user) && !user.isBannedNew() && !user.isAccountCancellation() && TextUtils.equals(conversation.convType, "default") && TEnum.equals(conversation.status, "default") && TextUtils.isEmpty(conversation.localDraft) && !conversation.localHasMessage && conversation.userMessageCount == 0 && conversation.f20374mm == 0 && TextUtils.isEmpty(conversation.clearedUntil) && m99395g() && !mo99392d() && !mo99393e(false) && !mo99394f(false);
    }

    @Override // p149l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22306c<Boolean> mo95448b() {
        return CoreModule.f17545c.f19642f0.m33118sg(QuestionnaireScene.messageDetail, this.f72139b.mo120828r3()).map(new w9j() { // from class: l.zwa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f205165a.m99396h((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean mo99392d() {
        return mqi0.m155929D(CoreModule.f17545c.f19642f0.f19872K1.get().longValue());
    }

    /* JADX INFO: renamed from: e */
    public boolean mo99393e(boolean z) {
        return mqi0.m155929D(CoreModule.f17545c.f19642f0.f19866I1.get().longValue()) && CoreModule.f17545c.f19642f0.f19863H1.get().intValue() >= y19.m212142B(z);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo99394f(boolean z) {
        return !mqi0.m155929D(CoreModule.f17545c.f19642f0.f19866I1.get().longValue()) && CoreModule.f17545c.f19642f0.f19869J1.get().intValue() >= y19.m212191z(z);
    }

    /* JADX INFO: renamed from: g */
    public boolean m99395g() {
        return ConversationCounterTypeSp.ProloguesEnterChatCount.getLong(this.f72139b.mo120828r3()) >= ((long) y19.m212141A());
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m99396h(List list) {
        this.f72140c = new ArrayList(list);
        return Boolean.valueOf(!vwb.m200296J(list));
    }

    @Override // p149l.a9m
    public boolean handle() {
        return this.f72138a.m103246l5(this.f72140c, "sayhi");
    }
}
