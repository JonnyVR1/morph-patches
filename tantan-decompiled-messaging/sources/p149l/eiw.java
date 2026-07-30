package p149l;

import android.util.Pair;
import com.cosmos.mdlog.MDLog;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Ll/eiw;", "Ll/chw;", "Ll/aiw;", "mkBaseTaskRequest", "<init>", "(Ll/aiw;)V", "Ll/n400;", "callback", "", "o", "(Ll/n400;)V", "", "f", "()Z", "a", "Ll/aiw;", "p", "()Ll/aiw;", "Companion", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class eiw implements chw {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final aiw mkBaseTaskRequest;

    public eiw(@NotNull aiw aiwVar) {
        aiwVar.getClass();
        this.mkBaseTaskRequest = aiwVar;
    }

    @Override // p149l.chw
    /* JADX INFO: renamed from: a */
    public void mo106996a(@Nullable n400 n400Var, @NotNull Pair<Boolean, String> pair) {
        pair.getClass();
        chw.C16158a.m107021k(this, n400Var, pair);
    }

    @Override // p149l.chw
    /* JADX INFO: renamed from: b */
    public void mo106997b() {
        chw.C16158a.m107023m(this);
    }

    @Override // p149l.chw
    /* JADX INFO: renamed from: c */
    public int mo106998c() {
        return chw.C16158a.m107013c(this);
    }

    @Override // p149l.chw
    @Nullable
    /* JADX INFO: renamed from: d */
    public String mo106999d() {
        return chw.C16158a.m107014d(this);
    }

    @Override // p149l.chw
    /* JADX INFO: renamed from: f */
    public boolean mo107001f() {
        return false;
    }

    @Override // p149l.chw
    /* JADX INFO: renamed from: g */
    public void mo107002g() {
        chw.C16158a.m107020j(this);
    }

    @Override // p149l.chw
    @Nullable
    public String getUrl() {
        return chw.C16158a.m107017g(this);
    }

    @Override // p149l.chw
    /* JADX INFO: renamed from: h */
    public int mo107003h() {
        return chw.C16158a.m107015e(this);
    }

    @Override // p149l.chw
    @Nullable
    /* JADX INFO: renamed from: i */
    public String mo107004i() {
        return chw.C16158a.m107011a(this);
    }

    @Override // p149l.chw
    /* JADX INFO: renamed from: j */
    public void mo107005j() {
        chw.C16158a.m107022l(this);
    }

    @Override // p149l.chw
    @Nullable
    /* JADX INFO: renamed from: k */
    public String mo107006k() {
        return chw.C16158a.m107016f(this);
    }

    @Override // p149l.chw
    @NotNull
    /* JADX INFO: renamed from: l */
    public Pair<Boolean, String> mo107007l() {
        return chw.C16158a.m107018h(this);
    }

    @Override // p149l.chw
    @Nullable
    /* JADX INFO: renamed from: m */
    public n400 mo107008m() {
        return chw.C16158a.m107012b(this);
    }

    @Override // p149l.chw
    /* JADX INFO: renamed from: n */
    public void mo107009n() {
        chw.C16158a.m107019i(this);
    }

    @Override // p149l.chw
    /* JADX INFO: renamed from: o */
    public void mo107010o(@Nullable n400 callback) {
        MDLog.m7395i("MKTaskExecutor", "开始执行任务MKTaskByRealtimeErrorLog");
        gxv logRequest = getMkBaseTaskRequest().getLogRequest();
        if (logRequest != null) {
            logRequest.m128647c();
        }
    }

    @Override // p149l.chw
    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public aiw getMkBaseTaskRequest() {
        return this.mkBaseTaskRequest;
    }

    /* JADX INFO: renamed from: l.eiw$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/eiw$a;", "", "<init>", "()V", "Ll/aiw;", SocialConstants.TYPE_REQUEST, "Ll/eiw;", "a", "(Ll/aiw;)Ll/eiw;", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final eiw m116724a(@NotNull aiw request) {
            request.getClass();
            return new eiw(request);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
