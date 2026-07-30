package p153l;

import android.view.Surface;
import androidx.annotation.FloatRange;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface azl {
    /* JADX INFO: renamed from: a */
    void mo99483a(a30<Object, Integer, Integer> a30Var);

    /* JADX INFO: renamed from: b */
    void mo99484b(y20<Object> y20Var);

    /* JADX INFO: renamed from: c */
    void mo99485c(a30<Object, Integer, Integer> a30Var);

    /* JADX INFO: renamed from: d */
    void mo99486d(y20<Object> y20Var);

    /* JADX INFO: renamed from: e */
    void mo99487e();

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
