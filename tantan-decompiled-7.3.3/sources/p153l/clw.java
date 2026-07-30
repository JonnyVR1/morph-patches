package p153l;

import android.util.Log;
import android.util.Pair;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/clw;", "Ll/ejw;", "Ll/fjw;", "mkBaseTaskRequest", "<init>", "(Ll/fjw;)V", "Ll/cd00;", "callback", "", "n", "(Ll/cd00;)V", "", "f", "()Z", "a", "Ll/fjw;", "e", "()Ll/fjw;", "Companion", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class clw implements ejw {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final fjw mkBaseTaskRequest;

    public clw(@NotNull fjw fjwVar) {
        fjwVar.getClass();
        this.mkBaseTaskRequest = fjwVar;
    }

    @Override // p153l.ejw
    /* JADX INFO: renamed from: a */
    public void mo18403a(@Nullable cd00 cd00Var, @NotNull Pair<Boolean, String> pair) {
        pair.getClass();
        ejw.C16785a.m120998k(this, cd00Var, pair);
    }

    @Override // p153l.ejw
    /* JADX INFO: renamed from: b */
    public void mo18404b() {
        ejw.C16785a.m121000m(this);
    }

    @Override // p153l.ejw
    /* JADX INFO: renamed from: c */
    public int mo18405c() {
        return ejw.C16785a.m120990c(this);
    }

    @Override // p153l.ejw
    @Nullable
    /* JADX INFO: renamed from: d */
    public String mo18406d() {
        return ejw.C16785a.m120991d(this);
    }

    @Override // p153l.ejw
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public fjw getMkBaseTaskRequest() {
        return this.mkBaseTaskRequest;
    }

    @Override // p153l.ejw
    /* JADX INFO: renamed from: f */
    public boolean mo18408f() {
        return false;
    }

    @Override // p153l.ejw
    /* JADX INFO: renamed from: g */
    public void mo18409g() {
        ejw.C16785a.m120997j(this);
    }

    @Override // p153l.ejw
    @Nullable
    public String getBid() {
        return ejw.C16785a.m120988a(this);
    }

    @Override // p153l.ejw
    @Nullable
    public String getUrl() {
        return ejw.C16785a.m120994g(this);
    }

    @Override // p153l.ejw
    /* JADX INFO: renamed from: h */
    public int mo18410h() {
        return ejw.C16785a.m120992e(this);
    }

    @Override // p153l.ejw
    /* JADX INFO: renamed from: i */
    public void mo18411i() {
        ejw.C16785a.m120999l(this);
    }

    @Override // p153l.ejw
    @Nullable
    /* JADX INFO: renamed from: j */
    public String mo18412j() {
        return ejw.C16785a.m120993f(this);
    }

    @Override // p153l.ejw
    @NotNull
    /* JADX INFO: renamed from: k */
    public Pair<Boolean, String> mo18413k() {
        return ejw.C16785a.m120995h(this);
    }

    @Override // p153l.ejw
    @Nullable
    /* JADX INFO: renamed from: l */
    public cd00 mo18414l() {
        return ejw.C16785a.m120989b(this);
    }

    @Override // p153l.ejw
    /* JADX INFO: renamed from: m */
    public void mo18415m() {
        ejw.C16785a.m120996i(this);
    }

    @Override // p153l.ejw
    /* JADX INFO: renamed from: n */
    public void mo18416n(@Nullable cd00 callback) {
        a7m a7mVarM116897k = dlw.m116897k();
        if (a7mVarM116897k != null) {
            a7mVarM116897k.mo96377e(callback);
        } else {
            Log.e("MKTaskExecutor", "ITaskExecutor not initialized");
        }
    }

    /* JADX INFO: renamed from: l.clw$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/clw$a;", "", "<init>", "()V", "Ll/fjw;", "requestBase", "Ll/clw;", "a", "(Ll/fjw;)Ll/clw;", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final clw m110705a(@NotNull fjw requestBase) {
            requestBase.getClass();
            return new clw(requestBase);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
