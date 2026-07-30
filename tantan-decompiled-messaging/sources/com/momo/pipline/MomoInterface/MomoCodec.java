package com.momo.pipline.MomoInterface;

import android.opengl.EGLContext;
import android.view.Surface;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import java.nio.ByteBuffer;
import p149l.eix;
import p149l.mpd0;
import p149l.u3m;
import p149l.vlw;
import p149l.xgf0;
import p149l.yw00;

/* JADX INFO: loaded from: classes6.dex */
public interface MomoCodec {

    public enum MomoCodecState {
        START,
        STOP,
        WAIT
    }

    /* JADX INFO: renamed from: A */
    void mo19646A();

    /* JADX INFO: renamed from: C0 */
    void mo19647C0();

    /* JADX INFO: renamed from: C1 */
    void mo19648C1(String str);

    /* JADX INFO: renamed from: H */
    void mo19649H(int i);

    /* JADX INFO: renamed from: H0 */
    void mo19650H0(boolean z);

    /* JADX INFO: renamed from: J */
    void mo19651J(String str);

    /* JADX INFO: renamed from: K1 */
    void mo19652K1(mpd0 mpd0Var);

    /* JADX INFO: renamed from: M1 */
    void mo19653M1();

    /* JADX INFO: renamed from: O */
    void mo19654O(long j);

    /* JADX INFO: renamed from: R0 */
    void mo19655R0(vlw vlwVar, EGLContext eGLContext);

    /* JADX INFO: renamed from: S0 */
    void mo19656S0(eix eixVar);

    /* JADX INFO: renamed from: Y */
    void mo19657Y(yw00 yw00Var, vlw vlwVar);

    /* JADX INFO: renamed from: b0 */
    void mo19658b0();

    /* JADX INFO: renamed from: c1 */
    int mo19659c1();

    void destroy();

    /* JADX INFO: renamed from: e0 */
    Surface mo19660e0();

    /* JADX INFO: renamed from: e1 */
    void mo19661e1(u3m u3mVar);

    /* JADX INFO: renamed from: f */
    void mo19662f();

    MediaBaseCodecFilter getFilter();

    /* JADX INFO: renamed from: i */
    void mo19663i(int i, int i2, xgf0 xgf0Var);

    /* JADX INFO: renamed from: l0 */
    void mo19664l0(vlw vlwVar, EGLContext eGLContext);

    /* JADX INFO: renamed from: m1 */
    void mo19665m1(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: o */
    void mo19666o();

    /* JADX INFO: renamed from: o1 */
    boolean mo19667o1(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: p */
    void mo19668p(String str, int i);

    /* JADX INFO: renamed from: r1 */
    boolean mo19669r1();

    /* JADX INFO: renamed from: v0 */
    void mo19670v0(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: y */
    void mo19671y(int i, int i2);

    /* JADX INFO: renamed from: y0 */
    void mo19672y0(int i, int i2, int i3);
}
