package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Prologue;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class kyb0 implements a9m, m8m<List<Prologue>> {

    /* JADX INFO: renamed from: a */
    public final bpz f125268a;

    /* JADX INFO: renamed from: b */
    public final wmz f125269b;

    /* JADX INFO: renamed from: c */
    public Conversation f125270c;

    /* JADX INFO: renamed from: d */
    public List<Prologue> f125271d;

    public kyb0(bpz bpzVar, wmz wmzVar) {
        this.f125268a = bpzVar;
        this.f125269b = wmzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ Boolean m147850e(List list) {
        this.f125271d = new ArrayList(list);
        return Boolean.TRUE;
    }

    @Override // p149l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo95447a(@Nullable Conversation conversation, @Nullable User user) {
        this.f125270c = conversation;
        return y19.m212164X() && !User.isTeamAccount(this.f125269b.mo120828r3()) && NullChecker.m81303a(conversation) && TEnum.equals(conversation.status, "default") && TextUtils.isEmpty(conversation.localDraft) && TextUtils.equals(conversation.convType, "default") && NullChecker.m81303a(user) && !user.isTeamAccount() && !user.isBannedNew() && !user.isAccountCancellation();
    }

    @Override // p149l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22306c<Boolean> mo95448b() {
        return (y19.m212150J() && this.f125270c.userMessageCount == 0) ? CoreModule.f17545c.f19642f0.m33118sg("quickEntrance", this.f125269b.mo120828r3()).map(new w9j() { // from class: l.jyb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120296a.m147850e((List) obj);
            }
        }) : C22306c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public List<Prologue> m147851d() {
        return this.f125271d;
    }

    @Override // p149l.a9m
    public boolean handle() {
        this.f125268a.m103250n5();
        return true;
    }
}
