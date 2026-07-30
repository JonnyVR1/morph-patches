package p153l;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.VideoFrameProcessingException;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface jel0 {

    /* JADX INFO: renamed from: l.jel0$a */
    public interface InterfaceC17935a {
        /* JADX INFO: renamed from: a */
        jel0 m144600a(Context context, List<ype> list, qhd qhdVar, df5 df5Var, df5 df5Var2, boolean z, Executor executor, InterfaceC17936b interfaceC17936b) throws VideoFrameProcessingException;
    }

    /* JADX INFO: renamed from: l.jel0$b */
    public interface InterfaceC17936b {
    }

    /* JADX INFO: renamed from: a */
    void m144593a(@Nullable cah0 cah0Var);

    /* JADX INFO: renamed from: b */
    Surface m144594b();

    /* JADX INFO: renamed from: c */
    void m144595c(int i);

    /* JADX INFO: renamed from: d */
    void m144596d(p6j p6jVar);

    /* JADX INFO: renamed from: e */
    void m144597e(long j);

    /* JADX INFO: renamed from: f */
    void m144598f();

    void flush();

    /* JADX INFO: renamed from: g */
    int m144599g();

    void release();
}
