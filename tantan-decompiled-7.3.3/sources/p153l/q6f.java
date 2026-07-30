package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Random;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class q6f implements qbm {

    /* JADX INFO: renamed from: a */
    public boolean f155807a;

    /* JADX INFO: renamed from: b */
    public yxz f155808b;

    public q6f(yxz yxzVar) {
        this.f155807a = false;
        this.f155807a = new Random().nextBoolean();
        this.f155808b = yxzVar;
    }

    @Override // p153l.qbm
    /* JADX INFO: renamed from: a */
    public boolean mo119523a(Conversation conversation, User user) {
        return this.f155807a && NullChecker.m82486a(conversation) && h39.m133438b() && TextUtils.equals(conversation.convType, "default") && TEnum.equals(conversation.status, "default") && TextUtils.isEmpty(conversation.localDraft) && conversation.f21116mm < 1 && NullChecker.m82486a(user) && !user.isTeamAccount() && !user.isBannedNew() && !user.isAccountCancellation();
    }

    @Override // p153l.qbm
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22421c<Boolean> mo119524b() {
        return C22421c.just(Boolean.TRUE);
    }

    @Override // p153l.qbm
    public boolean handle() {
        return this.f155808b.m217880i5();
    }
}
