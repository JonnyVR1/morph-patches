package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.Callable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class h5b0 extends e5b0 {
    public h5b0(yxz yxzVar, tvz tvzVar) {
        super(yxzVar, tvzVar);
    }

    @Override // p153l.e5b0, p153l.qbm
    /* JADX INFO: renamed from: a */
    public boolean mo119523a(@Nullable Conversation conversation, @Nullable User user) {
        return NullChecker.m82486a(conversation) && h39.m133421J() && !User.isTeamAccount(this.f92206b.mo111034r3()) && NullChecker.m82486a(user) && !user.isBannedNew() && !user.isAccountCancellation() && TextUtils.equals(conversation.convType, "default") && TEnum.equals(conversation.status, "default") && TextUtils.isEmpty(conversation.localDraft) && conversation.f21116mm == 0 && conversation.userMessageCount == 1 && !m133651k(this.f92206b.mo111034r3()) && !mo119525d() && !mo119526e(true) && !mo119527f(true);
    }

    @Override // p153l.e5b0, p153l.qbm
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22421c<Boolean> mo119524b() {
        return C22421c.fromCallable(new Callable() { // from class: l.f5b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f97212a.m133652l();
            }
        }).compose(psd0.m173592C()).switchMap(new qcj() { // from class: l.g5b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f102304a.m133653m((Boolean) obj);
            }
        });
    }

    @Override // p153l.e5b0
    /* JADX INFO: renamed from: d */
    public boolean mo119525d() {
        return pzi0.m174439D(CoreModule.f18264c.f20384f0.f20626O1.get().longValue());
    }

    @Override // p153l.e5b0
    /* JADX INFO: renamed from: e */
    public boolean mo119526e(boolean z) {
        return pzi0.m174439D(CoreModule.f18264c.f20384f0.f20620M1.get().longValue()) && CoreModule.f18264c.f20384f0.f20617L1.get().intValue() >= h39.m133413B(z);
    }

    @Override // p153l.e5b0
    /* JADX INFO: renamed from: f */
    public boolean mo119527f(boolean z) {
        return !pzi0.m174439D(CoreModule.f18264c.f20384f0.f20620M1.get().longValue()) && CoreModule.f18264c.f20384f0.f20623N1.get().intValue() >= h39.m133462z(z);
    }

    @Override // p153l.e5b0, p153l.qbm
    public boolean handle() {
        ConversationCounterTypeSp.PrologueNotResponseGuideLastShowTime.setLong(this.f92206b.f82473b, pzi0.m174454o());
        return this.f92205a.m217886l5(this.f92207c, "no_reply");
    }

    /* JADX INFO: renamed from: k */
    public final boolean m133651k(String str) {
        return pzi0.m174439D(ConversationCounterTypeSp.PrologueNotResponseGuideLastShowTime.getLong(str));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Boolean m133652l() throws Exception {
        List<Message> listM189445G = CoreModule.f18272k.f115535c.m189445G(this.f92206b.mo111034r3(), CoreModule.m30929H().userId());
        List<Message> listM189445G2 = CoreModule.f18272k.f115535c.m189445G(this.f92206b.mo111034r3(), this.f92206b.mo111034r3());
        Conversation conversationM33738Mo = CoreModule.f18264c.f20384f0.m33738Mo(this.f92206b.mo111034r3());
        boolean z = false;
        if (jyb.m147479J(listM189445G2) && listM189445G.size() == 1 && Long.parseLong(listM189445G.get(0).f56859id) == Long.parseLong(conversationM33738Mo.otherReadUntil) && !TEnum.equals(listM189445G.get(0).messageType, "prologue") && this.f92206b.m110994j3().f21116mm == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C22421c m133653m(Boolean bool) {
        return bool.booleanValue() ? super.mo119524b() : C22421c.just(Boolean.FALSE);
    }
}
