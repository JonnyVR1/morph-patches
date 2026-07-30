package p153l;

import android.graphics.SurfaceTexture;
import androidx.annotation.Nullable;
import com.immomo.moment.mediautils.cmds.TimeRangeScale;
import com.immomo.moment.mediautils.cmds.VideoCut;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface fam {
    /* JADX INFO: renamed from: a */
    void mo124749a();

    @Deprecated
    /* JADX INFO: renamed from: b */
    boolean mo124750b(fe00 fe00Var);

    /* JADX INFO: renamed from: c */
    void mo124751c(List<VideoCut> list, @Nullable List<TimeRangeScale> list2, long j, boolean z);

    /* JADX INFO: renamed from: d */
    void mo124752d(boolean z);

    /* JADX INFO: renamed from: e */
    void mo124753e(boolean z);

    /* JADX INFO: renamed from: f */
    boolean mo124754f();

    /* JADX INFO: renamed from: g */
    void mo124755g();

    /* JADX INFO: renamed from: h */
    void mo124756h(SurfaceTexture surfaceTexture);

    /* JADX INFO: renamed from: i */
    void mo124757i(float f);

    /* JADX INFO: renamed from: j */
    void mo124758j(jpw jpwVar);

    /* JADX INFO: renamed from: k */
    void mo124759k(int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: m */
    void mo124760m(long j, boolean z);

    /* JADX INFO: renamed from: n */
    void mo124761n(String str);

    /* JADX INFO: renamed from: o */
    void mo124762o(kpw kpwVar);

    /* JADX INFO: renamed from: p */
    boolean mo124763p();

    void pause();

    /* JADX INFO: renamed from: q */
    void mo124764q(float f);

    /* JADX INFO: renamed from: r */
    void mo124765r(ipw ipwVar);

    void release();

    void resume();
}
