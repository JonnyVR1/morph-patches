package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Prologue;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class o6c0 implements qbm, cbm<List<Prologue>> {

    /* JADX INFO: renamed from: a */
    public final yxz f145155a;

    /* JADX INFO: renamed from: b */
    public final tvz f145156b;

    /* JADX INFO: renamed from: c */
    public Conversation f145157c;

    /* JADX INFO: renamed from: d */
    public List<Prologue> f145158d;

    public o6c0(yxz yxzVar, tvz tvzVar) {
        this.f145155a = yxzVar;
        this.f145156b = tvzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ Boolean m166211e(List list) {
        this.f145158d = new ArrayList(list);
        return Boolean.TRUE;
    }

    @Override // p153l.qbm
    /* JADX INFO: renamed from: a */
    public boolean mo119523a(@Nullable Conversation conversation, @Nullable User user) {
        this.f145157c = conversation;
        return h39.m133435X() && !User.isTeamAccount(this.f145156b.mo111034r3()) && NullChecker.m82486a(conversation) && TEnum.equals(conversation.status, "default") && TextUtils.isEmpty(conversation.localDraft) && TextUtils.equals(conversation.convType, "default") && NullChecker.m82486a(user) && !user.isTeamAccount() && !user.isBannedNew() && !user.isAccountCancellation();
    }

    @Override // p153l.qbm
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22421c<Boolean> mo119524b() {
        return (h39.m133421J() && this.f145157c.userMessageCount == 0) ? CoreModule.f18264c.f20384f0.m34121sg("quickEntrance", this.f145156b.mo111034r3()).map(new qcj() { // from class: l.n6c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f140442a.m166211e((List) obj);
            }
        }) : C22421c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public List<Prologue> m166212d() {
        return this.f145158d;
    }

    @Override // p153l.qbm
    public boolean handle() {
        this.f145155a.m217890n5();
        return true;
    }
}
