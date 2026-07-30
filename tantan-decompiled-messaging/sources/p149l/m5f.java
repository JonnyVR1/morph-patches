package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Random;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class m5f implements a9m {

    /* JADX INFO: renamed from: a */
    public boolean f131391a;

    /* JADX INFO: renamed from: b */
    public bpz f131392b;

    public m5f(bpz bpzVar) {
        this.f131391a = false;
        this.f131391a = new Random().nextBoolean();
        this.f131392b = bpzVar;
    }

    @Override // p149l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo95447a(Conversation conversation, User user) {
        return this.f131391a && NullChecker.m81303a(conversation) && y19.m212167b() && TextUtils.equals(conversation.convType, "default") && TEnum.equals(conversation.status, "default") && TextUtils.isEmpty(conversation.localDraft) && conversation.f20374mm < 1 && NullChecker.m81303a(user) && !user.isTeamAccount() && !user.isBannedNew() && !user.isAccountCancellation();
    }

    @Override // p149l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22306c<Boolean> mo95448b() {
        return C22306c.just(Boolean.TRUE);
    }

    @Override // p149l.a9m
    public boolean handle() {
        return this.f131392b.m103239i5();
    }
}
