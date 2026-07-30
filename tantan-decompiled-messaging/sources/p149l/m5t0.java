package p149l;

import android.net.Uri;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m5t0 {

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f131419a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public static final AtomicInteger f131420b = new AtomicInteger(0);

    /* JADX INFO: renamed from: O */
    public static int m153149O() {
        return f131419a.get();
    }

    /* JADX INFO: renamed from: Q */
    public static int m153150Q() {
        return f131420b.get();
    }

    /* JADX INFO: renamed from: u */
    public static AtomicInteger m153151u() {
        return f131419a;
    }

    /* JADX INFO: renamed from: v */
    public static AtomicInteger m153152v() {
        return f131420b;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo153153A(int i);

    /* JADX INFO: renamed from: B */
    public abstract void mo153154B(int i);

    /* JADX INFO: renamed from: C */
    public abstract void mo153155C(l5t0 l5t0Var);

    /* JADX INFO: renamed from: D */
    public abstract void mo153156D(int i);

    /* JADX INFO: renamed from: E */
    public abstract void mo153157E(int i);

    /* JADX INFO: renamed from: F */
    public abstract void mo153158F(boolean z);

    /* JADX INFO: renamed from: G */
    public abstract void mo153159G(@Nullable Integer num);

    /* JADX INFO: renamed from: H */
    public abstract void mo153160H(boolean z);

    /* JADX INFO: renamed from: I */
    public abstract void mo153161I(int i);

    /* JADX INFO: renamed from: J */
    public abstract void mo153162J(Surface surface, boolean z) throws IOException;

    /* JADX INFO: renamed from: K */
    public abstract void mo153163K(float f, boolean z) throws IOException;

    /* JADX INFO: renamed from: L */
    public abstract void mo153164L();

    /* JADX INFO: renamed from: M */
    public abstract boolean mo153165M();

    /* JADX INFO: renamed from: N */
    public abstract int mo153166N();

    /* JADX INFO: renamed from: P */
    public abstract int mo153167P();

    /* JADX INFO: renamed from: R */
    public abstract long mo153168R();

    /* JADX INFO: renamed from: S */
    public abstract long mo153169S();

    /* JADX INFO: renamed from: T */
    public abstract long mo153170T();

    /* JADX INFO: renamed from: U */
    public abstract long mo153171U();

    /* JADX INFO: renamed from: V */
    public abstract long mo153172V();

    /* JADX INFO: renamed from: r */
    public abstract long mo153173r();

    /* JADX INFO: renamed from: s */
    public abstract long mo153174s();

    @Nullable
    /* JADX INFO: renamed from: t */
    public abstract Integer mo153175t();

    /* JADX INFO: renamed from: w */
    public abstract void mo153176w(Uri[] uriArr, String str);

    /* JADX INFO: renamed from: x */
    public abstract void mo153177x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z);

    /* JADX INFO: renamed from: y */
    public abstract void mo153178y();

    /* JADX INFO: renamed from: z */
    public abstract void mo153179z(long j);
}
