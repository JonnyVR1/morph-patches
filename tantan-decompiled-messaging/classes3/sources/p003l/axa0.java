package p003l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Prologue;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.mqi0;
import l.vwb;
import l.wmz;
import l.y19;
import org.eclipse.jetty.servlet.ServletHandler;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class axa0 implements a9m, m8m<List<Prologue>> {

    /* JADX INFO: renamed from: a */
    public final bpz f2319a;

    /* JADX INFO: renamed from: b */
    public final wmz f2320b;

    /* JADX INFO: renamed from: c */
    public List<Prologue> f2321c;

    public axa0(bpz bpzVar, wmz wmzVar) {
        this.f2319a = bpzVar;
        this.f2320b = wmzVar;
    }

    @Override // p003l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo2765a(@Nullable Conversation conversation, @Nullable User user) {
        return NullChecker.a(conversation) && y19.J() && !User.isTeamAccount(this.f2320b.r3()) && NullChecker.a(user) && !user.isBannedNew() && !user.isAccountCancellation() && TextUtils.equals(conversation.convType, ServletHandler.__DEFAULT_SERVLET) && TEnum.equals(conversation.status, ServletHandler.__DEFAULT_SERVLET) && TextUtils.isEmpty(conversation.localDraft) && !conversation.localHasMessage && conversation.userMessageCount == 0 && conversation.mm == 0 && TextUtils.isEmpty(conversation.clearedUntil) && m2930g() && !mo2927d() && !mo2928e(false) && !mo2929f(false);
    }

    @Override // p003l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C1099c<Boolean> mo2766b() {
        return CoreModule.c.f0.sg("messageDetail", this.f2320b.r3()).map(new w9j() { // from class: l.zwa0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f9463a.m2931h((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean mo2927d() {
        return mqi0.D(((Long) CoreModule.c.f0.K1.get()).longValue());
    }

    /* JADX INFO: renamed from: e */
    public boolean mo2928e(boolean z) {
        return mqi0.D(((Long) CoreModule.c.f0.I1.get()).longValue()) && ((Integer) CoreModule.c.f0.H1.get()).intValue() >= y19.B(z);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo2929f(boolean z) {
        return !mqi0.D(((Long) CoreModule.c.f0.I1.get()).longValue()) && ((Integer) CoreModule.c.f0.J1.get()).intValue() >= y19.z(z);
    }

    /* JADX INFO: renamed from: g */
    public boolean m2930g() {
        return ConversationCounterTypeSp.ProloguesEnterChatCount.getLong(this.f2320b.r3()) >= ((long) y19.A());
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m2931h(List list) {
        this.f2321c = new ArrayList(list);
        return Boolean.valueOf(!vwb.J(list));
    }

    @Override // p003l.a9m
    public boolean handle() {
        return this.f2319a.m3126l5(this.f2321c, "sayhi");
    }
}
