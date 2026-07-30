package p003l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.Callable;
import l.mkd0;
import l.mqi0;
import l.vwb;
import l.wmz;
import l.y19;
import org.eclipse.jetty.servlet.ServletHandler;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class dxa0 extends axa0 {
    public dxa0(bpz bpzVar, wmz wmzVar) {
        super(bpzVar, wmzVar);
    }

    @Override // p003l.axa0, p003l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo2765a(@Nullable Conversation conversation, @Nullable User user) {
        return NullChecker.a(conversation) && y19.J() && !User.isTeamAccount(this.f2320b.r3()) && NullChecker.a(user) && !user.isBannedNew() && !user.isAccountCancellation() && TextUtils.equals(conversation.convType, ServletHandler.__DEFAULT_SERVLET) && TEnum.equals(conversation.status, ServletHandler.__DEFAULT_SERVLET) && TextUtils.isEmpty(conversation.localDraft) && conversation.mm == 0 && conversation.userMessageCount == 1 && !m3764k(this.f2320b.r3()) && !mo2927d() && !mo2928e(true) && !mo2929f(true);
    }

    @Override // p003l.axa0, p003l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C1099c<Boolean> mo2766b() {
        return C1099c.fromCallable(new Callable() { // from class: l.bxa0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f2537a.m3765l();
            }
        }).compose(mkd0.C()).switchMap(new w9j() { // from class: l.cxa0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f2865a.m3766m((Boolean) obj);
            }
        });
    }

    @Override // p003l.axa0
    /* JADX INFO: renamed from: d */
    public boolean mo2927d() {
        return mqi0.D(((Long) CoreModule.c.f0.O1.get()).longValue());
    }

    @Override // p003l.axa0
    /* JADX INFO: renamed from: e */
    public boolean mo2928e(boolean z) {
        return mqi0.D(((Long) CoreModule.c.f0.M1.get()).longValue()) && ((Integer) CoreModule.c.f0.L1.get()).intValue() >= y19.B(z);
    }

    @Override // p003l.axa0
    /* JADX INFO: renamed from: f */
    public boolean mo2929f(boolean z) {
        return !mqi0.D(((Long) CoreModule.c.f0.M1.get()).longValue()) && ((Integer) CoreModule.c.f0.N1.get()).intValue() >= y19.z(z);
    }

    @Override // p003l.axa0, p003l.a9m
    public boolean handle() {
        ConversationCounterTypeSp.PrologueNotResponseGuideLastShowTime.setLong(this.f2320b.f3542b, mqi0.o());
        return this.f2319a.m3126l5(this.f2321c, "no_reply");
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3764k(String str) {
        return mqi0.D(ConversationCounterTypeSp.PrologueNotResponseGuideLastShowTime.getLong(str));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Boolean m3765l() throws Exception {
        List listG = CoreModule.k.c.G(this.f2320b.r3(), CoreModule.H().userId());
        List listG2 = CoreModule.k.c.G(this.f2320b.r3(), this.f2320b.r3());
        Conversation conversationMo = CoreModule.c.f0.Mo(this.f2320b.r3());
        boolean z = false;
        if (vwb.J(listG2) && listG.size() == 1 && Long.parseLong(((DbObject) ((Message) listG.get(0))).id) == Long.parseLong(conversationMo.otherReadUntil) && !TEnum.equals(((Message) listG.get(0)).messageType, "prologue") && this.f2320b.m4255j3().mm == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1099c m3766m(Boolean bool) {
        return bool.booleanValue() ? super.mo2766b() : C1099c.just(Boolean.FALSE);
    }
}
