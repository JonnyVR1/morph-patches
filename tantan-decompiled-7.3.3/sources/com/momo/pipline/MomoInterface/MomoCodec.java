package com.momo.pipline.MomoInterface;

import android.opengl.EGLContext;
import android.view.Surface;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import java.nio.ByteBuffer;
import p153l.brx;
import p153l.fpf0;
import p153l.g510;
import p153l.l6m;
import p153l.oxd0;
import p153l.uow;

/* JADX INFO: loaded from: classes8.dex */
public interface MomoCodec {

    public enum MomoCodecState {
        START,
        STOP,
        WAIT
    }

    /* JADX INFO: renamed from: A */
    void mo20645A();

    /* JADX INFO: renamed from: C0 */
    void mo20646C0();

    /* JADX INFO: renamed from: C1 */
    void mo20647C1(String str);

    /* JADX INFO: renamed from: H */
    void mo20648H(int i);

    /* JADX INFO: renamed from: H0 */
    void mo20649H0(boolean z);

    /* JADX INFO: renamed from: J */
    void mo20650J(String str);

    /* JADX INFO: renamed from: K1 */
    void mo20651K1(oxd0 oxd0Var);

    /* JADX INFO: renamed from: M1 */
    void mo20652M1();

    /* JADX INFO: renamed from: O */
    void mo20653O(long j);

    /* JADX INFO: renamed from: R0 */
    void mo20654R0(uow uowVar, EGLContext eGLContext);

    /* JADX INFO: renamed from: S0 */
    void mo20655S0(brx brxVar);

    /* JADX INFO: renamed from: Y */
    void mo20656Y(g510 g510Var, uow uowVar);

    /* JADX INFO: renamed from: b0 */
    void mo20657b0();

    /* JADX INFO: renamed from: c1 */
    int mo20658c1();

    void destroy();

    /* JADX INFO: renamed from: e0 */
    Surface mo20659e0();

    /* JADX INFO: renamed from: e1 */
    void mo20660e1(l6m l6mVar);

    /* JADX INFO: renamed from: f */
    void mo20661f();

    MediaBaseCodecFilter getFilter();

    /* JADX INFO: renamed from: i */
    void mo20662i(int i, int i2, fpf0 fpf0Var);

    /* JADX INFO: renamed from: l0 */
    void mo20663l0(uow uowVar, EGLContext eGLContext);

    /* JADX INFO: renamed from: m1 */
    void mo20664m1(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: o */
    void mo20665o();

    /* JADX INFO: renamed from: o1 */
    boolean mo20666o1(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: p */
    void mo20667p(String str, int i);

    /* JADX INFO: renamed from: r1 */
    boolean mo20668r1();

    /* JADX INFO: renamed from: v0 */
    void mo20669v0(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: y */
    void mo20670y(int i, int i2);

    /* JADX INFO: renamed from: y0 */
    void mo20671y0(int i, int i2, int i3);
}
