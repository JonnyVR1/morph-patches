package p149l;

import android.graphics.SurfaceTexture;
import androidx.annotation.Nullable;
import com.immomo.moment.mediautils.cmds.TimeRangeScale;
import com.immomo.moment.mediautils.cmds.VideoCut;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface p7m {
    /* JADX INFO: renamed from: a */
    void mo129495a();

    @Deprecated
    /* JADX INFO: renamed from: b */
    boolean mo129496b(v500 v500Var);

    /* JADX INFO: renamed from: c */
    void mo129497c(List<VideoCut> list, @Nullable List<TimeRangeScale> list2, long j, boolean z);

    /* JADX INFO: renamed from: d */
    void mo129498d(boolean z);

    /* JADX INFO: renamed from: e */
    void mo129499e(boolean z);

    /* JADX INFO: renamed from: f */
    boolean mo129500f();

    /* JADX INFO: renamed from: g */
    void mo129501g();

    /* JADX INFO: renamed from: h */
    void mo129502h(SurfaceTexture surfaceTexture);

    /* JADX INFO: renamed from: i */
    void mo129503i(float f);

    /* JADX INFO: renamed from: j */
    void mo129504j(kmw kmwVar);

    /* JADX INFO: renamed from: k */
    void mo129505k(int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: m */
    void mo129507m(long j, boolean z);

    /* JADX INFO: renamed from: n */
    void mo129508n(String str);

    /* JADX INFO: renamed from: o */
    void mo129509o(lmw lmwVar);

    /* JADX INFO: renamed from: p */
    boolean mo129510p();

    void pause();

    /* JADX INFO: renamed from: q */
    void mo129511q(float f);

    /* JADX INFO: renamed from: r */
    void mo129512r(jmw jmwVar);

    void release();

    void resume();
}
