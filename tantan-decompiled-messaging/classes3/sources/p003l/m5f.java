package p003l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Random;
import l.y19;
import org.eclipse.jetty.servlet.ServletHandler;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class m5f implements a9m {

    /* JADX INFO: renamed from: a */
    public boolean f5549a;

    /* JADX INFO: renamed from: b */
    public bpz f5550b;

    public m5f(bpz bpzVar) {
        this.f5549a = false;
        this.f5549a = new Random().nextBoolean();
        this.f5550b = bpzVar;
    }

    @Override // p003l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo2765a(Conversation conversation, User user) {
        return this.f5549a && NullChecker.a(conversation) && y19.b() && TextUtils.equals(conversation.convType, ServletHandler.__DEFAULT_SERVLET) && TEnum.equals(conversation.status, ServletHandler.__DEFAULT_SERVLET) && TextUtils.isEmpty(conversation.localDraft) && conversation.mm < 1 && NullChecker.a(user) && !user.isTeamAccount() && !user.isBannedNew() && !user.isAccountCancellation();
    }

    @Override // p003l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C1099c<Boolean> mo2766b() {
        return C1099c.just(Boolean.TRUE);
    }

    @Override // p003l.a9m
    public boolean handle() {
        return this.f5550b.m3119i5();
    }
}
