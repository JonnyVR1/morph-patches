package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class u500 implements Closeable {

    /* JADX INFO: renamed from: a */
    @NonNull
    private exc0 f174646a;

    public u500(@NonNull exc0 exc0Var) {
        this.f174646a = exc0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f174646a.close();
        } catch (Exception e) {
            MDLog.printErrStackTrace("MOMOHttp", e);
        }
    }

    /* JADX INFO: renamed from: k */
    public InputStream m191784k() {
        gxc0 gxc0VarM118606k = this.f174646a.m118606k();
        Objects.requireNonNull(gxc0VarM118606k);
        return gxc0VarM118606k.byteStream();
    }

    /* JADX INFO: renamed from: m */
    public int m191785m() {
        return this.f174646a.m118609q();
    }

    /* JADX INFO: renamed from: n */
    public long m191786n() {
        if (this.f174646a.m118606k() != null) {
            return this.f174646a.m118606k().contentLength();
        }
        return -1L;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public String m191787q(String str) {
        return this.f174646a.m118611u(str);
    }

    /* JADX INFO: renamed from: t */
    public String m191788t() throws IOException {
        gxc0 gxc0VarM118606k = this.f174646a.m118606k();
        Objects.requireNonNull(gxc0VarM118606k);
        return gxc0VarM118606k.string();
    }

    /* JADX INFO: renamed from: u */
    public String m191789u() {
        return this.f174646a.m118604Y().m185881k().toString();
    }
}
