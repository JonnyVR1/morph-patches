package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Prologue;
import com.p051p1.mobile.putong.core.data.QuestionnaireScene;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class e5b0 implements qbm, cbm<List<Prologue>> {

    /* JADX INFO: renamed from: a */
    public final yxz f92205a;

    /* JADX INFO: renamed from: b */
    public final tvz f92206b;

    /* JADX INFO: renamed from: c */
    public List<Prologue> f92207c;

    public e5b0(yxz yxzVar, tvz tvzVar) {
        this.f92205a = yxzVar;
        this.f92206b = tvzVar;
    }

    @Override // p153l.qbm
    /* JADX INFO: renamed from: a */
    public boolean mo119523a(@Nullable Conversation conversation, @Nullable User user) {
        return NullChecker.m82486a(conversation) && h39.m133421J() && !User.isTeamAccount(this.f92206b.mo111034r3()) && NullChecker.m82486a(user) && !user.isBannedNew() && !user.isAccountCancellation() && TextUtils.equals(conversation.convType, "default") && TEnum.equals(conversation.status, "default") && TextUtils.isEmpty(conversation.localDraft) && !conversation.localHasMessage && conversation.userMessageCount == 0 && conversation.f21116mm == 0 && TextUtils.isEmpty(conversation.clearedUntil) && m119528g() && !mo119525d() && !mo119526e(false) && !mo119527f(false);
    }

    @Override // p153l.qbm
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22421c<Boolean> mo119524b() {
        return CoreModule.f18264c.f20384f0.m34121sg(QuestionnaireScene.messageDetail, this.f92206b.mo111034r3()).map(new qcj() { // from class: l.d5b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f85146a.m119529h((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean mo119525d() {
        return pzi0.m174439D(CoreModule.f18264c.f20384f0.f20614K1.get().longValue());
    }

    /* JADX INFO: renamed from: e */
    public boolean mo119526e(boolean z) {
        return pzi0.m174439D(CoreModule.f18264c.f20384f0.f20608I1.get().longValue()) && CoreModule.f18264c.f20384f0.f20605H1.get().intValue() >= h39.m133413B(z);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo119527f(boolean z) {
        return !pzi0.m174439D(CoreModule.f18264c.f20384f0.f20608I1.get().longValue()) && CoreModule.f18264c.f20384f0.f20611J1.get().intValue() >= h39.m133462z(z);
    }

    /* JADX INFO: renamed from: g */
    public boolean m119528g() {
        return ConversationCounterTypeSp.ProloguesEnterChatCount.getLong(this.f92206b.mo111034r3()) >= ((long) h39.m133412A());
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m119529h(List list) {
        this.f92207c = new ArrayList(list);
        return Boolean.valueOf(!jyb.m147479J(list));
    }

    @Override // p153l.qbm
    public boolean handle() {
        return this.f92205a.m217886l5(this.f92207c, "sayhi");
    }
}
