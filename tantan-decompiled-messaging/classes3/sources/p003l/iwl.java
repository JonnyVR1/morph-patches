package p003l;

import android.view.Surface;
import androidx.annotation.FloatRange;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface iwl {
    /* JADX INFO: renamed from: a */
    void mo5248a(g30<Object, Integer, Integer> g30Var);

    /* JADX INFO: renamed from: b */
    void mo5249b(e30<Object> e30Var);

    /* JADX INFO: renamed from: c */
    void mo5250c(g30<Object, Integer, Integer> g30Var);

    /* JADX INFO: renamed from: d */
    void mo5251d(e30<Object> e30Var);

    /* JADX INFO: renamed from: e */
    void mo5252e();

    float getCurrentPosition();

    boolean isPlaying();

    void pause();

    void prepareAsync();

    void release();

    void reset();

    void seekTo(long j);

    void setDataSource(String str) throws IOException;

    void setLooping(boolean z);

    void setSurface(Surface surface);

    void setVolume(@FloatRange(from = 0.0d, to = 1.0d) float f);

    void start();

    void stop();
}
