package p149l;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.VideoFrameProcessingException;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface f5l0 {

    /* JADX INFO: renamed from: l.f5l0$a */
    public interface InterfaceC16762a {
        /* JADX INFO: renamed from: a */
        f5l0 m119514a(Context context, List<uoe> list, kgd kgdVar, de5 de5Var, de5 de5Var2, boolean z, Executor executor, InterfaceC16763b interfaceC16763b) throws VideoFrameProcessingException;
    }

    /* JADX INFO: renamed from: l.f5l0$b */
    public interface InterfaceC16763b {
    }

    /* JADX INFO: renamed from: a */
    void m119507a(@Nullable u1h0 u1h0Var);

    /* JADX INFO: renamed from: b */
    Surface m119508b();

    /* JADX INFO: renamed from: c */
    void m119509c(int i);

    /* JADX INFO: renamed from: d */
    void m119510d(u3j u3jVar);

    /* JADX INFO: renamed from: e */
    void m119511e(long j);

    /* JADX INFO: renamed from: f */
    void m119512f();

    void flush();

    /* JADX INFO: renamed from: g */
    int m119513g();

    void release();
}
