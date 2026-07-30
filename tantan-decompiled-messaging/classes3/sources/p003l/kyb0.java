package p003l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Prologue;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.wmz;
import l.y19;
import org.eclipse.jetty.servlet.ServletHandler;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class kyb0 implements a9m, m8m<List<Prologue>> {

    /* JADX INFO: renamed from: a */
    public final bpz f5120a;

    /* JADX INFO: renamed from: b */
    public final wmz f5121b;

    /* JADX INFO: renamed from: c */
    public Conversation f5122c;

    /* JADX INFO: renamed from: d */
    public List<Prologue> f5123d;

    public kyb0(bpz bpzVar, wmz wmzVar) {
        this.f5120a = bpzVar;
        this.f5121b = wmzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ Boolean m5902e(List list) {
        this.f5123d = new ArrayList(list);
        return Boolean.TRUE;
    }

    @Override // p003l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo2765a(@Nullable Conversation conversation, @Nullable User user) {
        this.f5122c = conversation;
        return y19.X() && !User.isTeamAccount(this.f5121b.r3()) && NullChecker.a(conversation) && TEnum.equals(conversation.status, ServletHandler.__DEFAULT_SERVLET) && TextUtils.isEmpty(conversation.localDraft) && TextUtils.equals(conversation.convType, ServletHandler.__DEFAULT_SERVLET) && NullChecker.a(user) && !user.isTeamAccount() && !user.isBannedNew() && !user.isAccountCancellation();
    }

    @Override // p003l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C1099c<Boolean> mo2766b() {
        return (y19.J() && this.f5122c.userMessageCount == 0) ? CoreModule.c.f0.sg("quickEntrance", this.f5121b.r3()).map(new w9j() { // from class: l.jyb0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f4763a.m5902e((List) obj);
            }
        }) : C1099c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public List<Prologue> m5903d() {
        return this.f5123d;
    }

    @Override // p003l.a9m
    public boolean handle() {
        this.f5120a.m3130n5();
        return true;
    }
}
