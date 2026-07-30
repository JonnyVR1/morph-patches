package p149l;

import android.view.Surface;
import androidx.annotation.FloatRange;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface iwl {
    /* JADX INFO: renamed from: a */
    void mo138750a(g30<Object, Integer, Integer> g30Var);

    /* JADX INFO: renamed from: b */
    void mo138751b(e30<Object> e30Var);

    /* JADX INFO: renamed from: c */
    void mo138752c(g30<Object, Integer, Integer> g30Var);

    /* JADX INFO: renamed from: d */
    void mo138753d(e30<Object> e30Var);

    /* JADX INFO: renamed from: e */
    void mo138754e();

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

    void setVolume(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f);

    void start();

    void stop();
}
